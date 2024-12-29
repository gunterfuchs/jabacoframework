/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AnchorStyles;
import VB.BackStyleConstants;
import VB.DrawModeConstants;
import VB.IJabacoClass;
import VB.IJabacoControl;
import VB.ShapeConstants;
import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

public class Shape
extends JComponent
implements IJabacoClass,
IJabacoControl {
    private long myBorderWidth;
    private DrawModeConstants myDrawMode;
    private ShapeConstants myShape;
    private long myFillColor;
    private BackStyleConstants myBackStyle;
    private boolean myAntiAliasing;
    private String myTag;
    private AnchorStyles myAnchor;
    private float mySavedWidth;
    private float mySavedHeight;
    private float mySavedLeft;
    private float mySavedTop;
    private float hostSavedWidth;
    private float hostSavedHeight;
    private boolean isResizeTriggerInitialized;
    private boolean isLeftInitialized;
    private boolean isTopInitialized;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void paintComponent(Graphics g) {
        Throwable throwable2;
        Throwable Err;
        block28: {
            Shape Me;
            Graphics2D g2d;
            block27: {
                long myHeight;
                long myWidth;
                long myTop;
                long myLeft;
                long myNewBorderWidth;
                long myRHeight;
                long myRWidth;
                long myRTop;
                long myRLeft;
                long myRadiusBorderWidth;
                long myDiameter;
                block26: {
                    block25: {
                        block24: {
                            ShapeConstants h22;
                            block23: {
                                long tmpValue;
                                Err = null;
                                long myMemWidth = 0L;
                                long myMemHeight = 0L;
                                h22 = new ShapeConstants();
                                myDiameter = 0L;
                                myRadiusBorderWidth = 0L;
                                myRLeft = 0L;
                                myRTop = 0L;
                                myRWidth = 0L;
                                myRHeight = 0L;
                                try {
                                    if (g == null) return;
                                    g2d = null;
                                }
                                catch (Throwable throwable2) {}
                                try {
                                    g2d = (Graphics2D)g;
                                    if (Me.myAntiAliasing) {
                                        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                                    }
                                    myNewBorderWidth = 0L;
                                }
                                catch (Throwable throwable2) {}
                                try {
                                    myNewBorderWidth = Me.myBorderWidth;
                                    if (myNewBorderWidth < (long)1) {
                                        myNewBorderWidth = 1;
                                    }
                                    tmpValue = 0L;
                                }
                                catch (Throwable throwable2) {}
                                try {
                                    tmpValue = !(!(Me.$Width() <= Me.$Height())) ? (long)Me.$Width() : (long)Me.$Height();
                                    if (tmpValue < myNewBorderWidth * (long)2) {
                                        myNewBorderWidth = (long)((double)tmpValue / (double)2);
                                    }
                                    g2d.setStroke(new BasicStroke(myNewBorderWidth));
                                    myLeft = 0L;
                                    myTop = 0L;
                                    myWidth = 0L;
                                    myHeight = 0L;
                                }
                                catch (Throwable throwable2) {}
                                try {
                                    myLeft = (long)((double)myNewBorderWidth / (double)2);
                                    myTop = (long)((double)myNewBorderWidth / (double)2);
                                    myWidth = (long)(Me.$Width() - 1.0f - (float)myNewBorderWidth);
                                    myHeight = (long)(Me.$Height() - 1.0f - (float)myNewBorderWidth);
                                    if (!(Me.myShape.compareTo(ShapeConstants.vbShapeSquare) == 0 | Me.myShape.compareTo(ShapeConstants.vbShapeCircle) == 0 | Me.myShape.compareTo(ShapeConstants.vbShapeRoundedSquare) == 0)) break block23;
                                    myMemWidth = myWidth;
                                    myMemHeight = myHeight;
                                }
                                catch (Throwable throwable2) {}
                                try {
                                    myWidth = Interaction.IIF(myWidth > myHeight, VBVariant.valueOf(myHeight), VBVariant.valueOf(myWidth)).longValue();
                                    myHeight = Interaction.IIF(myWidth > myHeight, VBVariant.valueOf(myHeight), VBVariant.valueOf(myWidth)).longValue();
                                    myLeft = (long)((double)myLeft + (double)(myMemWidth - myWidth) / (double)2);
                                    myTop = (long)((double)myTop + (double)(myMemHeight - myHeight) / (double)2);
                                }
                                catch (Throwable throwable2) {}
                            }
                            h22 = null;
                            h22 = Me.myShape;
                            if (h22.compareTo(ShapeConstants.vbShapeRectangle) == 0 || h22.compareTo(ShapeConstants.vbShapeSquare) == 0) break block24;
                            if (h22.compareTo(ShapeConstants.vbShapeOval) == 0 || h22.compareTo(ShapeConstants.vbShapeCircle) == 0) break block25;
                            if (h22.compareTo(ShapeConstants.vbShapeRoundedRectangle) == 0 || h22.compareTo(ShapeConstants.vbShapeRoundedSquare) == 0) break block26;
                            break block27;
                        }
                        if (Me.myBackStyle.compareTo(BackStyleConstants.vbSolid) == 0) {
                            g2d.setColor(Me.$Parent().getBackground());
                            g2d.fillRect((int)myLeft, (int)myTop, (int)(myWidth + (long)1), (int)(myHeight + (long)1));
                        }
                        g2d.setColor(Me.$Parent().getForeground());
                        g2d.drawRect((int)myLeft, (int)myTop, (int)myWidth, (int)myHeight);
                        break block27;
                    }
                    if (Me.myBackStyle.compareTo(BackStyleConstants.vbSolid) == 0) {
                        g2d.setColor(Me.$Parent().getBackground());
                        g2d.fillOval((int)myLeft, (int)myTop, (int)(myWidth + (long)1), (int)(myHeight + (long)1));
                    }
                    g2d.setColor(Me.$Parent().getForeground());
                    g2d.drawOval((int)myLeft, (int)myTop, (int)myWidth, (int)myHeight);
                    break block27;
                }
                myDiameter = Interaction.IIF(!(Me.$Width() <= Me.$Height()), VBVariant.valueOf((double)Me.$Height() / (double)4), VBVariant.valueOf((double)Me.$Width() / (double)4)).longValue();
                myRadiusBorderWidth = Interaction.IIF(myNewBorderWidth * (long)2 > myDiameter, VBVariant.valueOf((double)myDiameter / (double)2), VBVariant.valueOf(myNewBorderWidth)).longValue();
                myRLeft = (long)((double)myLeft - (double)myNewBorderWidth / (double)2 + (double)myRadiusBorderWidth / (double)2);
                myRTop = (long)((double)myTop - (double)myNewBorderWidth / (double)2 + (double)myRadiusBorderWidth / (double)2);
                myRWidth = myRLeft + myWidth + (long)1 + myNewBorderWidth - myDiameter;
                myRHeight = myRTop + myHeight + (long)1 + myNewBorderWidth - myDiameter;
                if (Me.myBackStyle.compareTo(BackStyleConstants.vbSolid) == 0) {
                    g2d.setColor(Me.$Parent().getBackground());
                    g2d.fillRect((int)((double)myLeft - (double)myNewBorderWidth / (double)2 + (double)myDiameter / (double)2 - 1.0), (int)((double)myTop - (double)myNewBorderWidth / (double)2 + 1.0), (int)(myWidth - myDiameter + myNewBorderWidth + (long)2), (int)(myHeight + myNewBorderWidth - (long)1));
                    g2d.fillRect((int)((double)myLeft - (double)myNewBorderWidth / (double)2 + 1.0), (int)((double)myTop - (double)myNewBorderWidth / (double)2 + (double)myDiameter / (double)2 - 1.0), (int)(myWidth + myNewBorderWidth - (long)1), (int)(myHeight - myDiameter + myNewBorderWidth + (long)2));
                    g2d.fillArc((int)myRLeft, (int)myRTop, (int)(myDiameter - (long)1 - myRadiusBorderWidth), (int)(myDiameter - (long)1 - myRadiusBorderWidth), 90, 90);
                    g2d.fillArc((int)myRWidth, (int)myRTop, (int)(myDiameter - (long)1 - myRadiusBorderWidth), (int)(myDiameter - (long)1 - myRadiusBorderWidth), 0, 90);
                    g2d.fillArc((int)myRLeft, (int)myRHeight, (int)(myDiameter - (long)1 - myRadiusBorderWidth), (int)(myDiameter - (long)1 - myRadiusBorderWidth), 180, 90);
                    g2d.fillArc((int)myRWidth, (int)myRHeight, (int)(myDiameter - (long)1 - myRadiusBorderWidth), (int)(myDiameter - (long)1 - myRadiusBorderWidth), 270, 90);
                }
                g2d.setColor(Me.$Parent().getForeground());
                g2d.drawLine((int)((double)myLeft + (double)myDiameter / (double)2), (int)myTop, (int)((double)(myLeft + myWidth) - (double)myDiameter / (double)2 + 1.0), (int)myTop);
                g2d.drawLine((int)((double)myLeft + (double)myDiameter / (double)2), (int)(myTop + myHeight), (int)((double)(myLeft + myWidth) - (double)myDiameter / (double)2 + 1.0), (int)(myTop + myHeight));
                g2d.drawLine((int)myLeft, (int)((double)myTop + (double)myDiameter / (double)2), (int)myLeft, (int)((double)(myTop + myHeight) - (double)myDiameter / (double)2 + 1.0));
                g2d.drawLine((int)(myLeft + myWidth), (int)((double)myTop + (double)myDiameter / (double)2), (int)(myLeft + myWidth), (int)((double)(myTop + myHeight) - (double)myDiameter / (double)2 + 1.0));
                g2d.setStroke(new BasicStroke(myRadiusBorderWidth, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND));
                g2d.drawArc((int)myRLeft, (int)myRTop, (int)(myDiameter - (long)1 - myRadiusBorderWidth), (int)(myDiameter - (long)1 - myRadiusBorderWidth), 90, 90);
                g2d.drawArc((int)myRWidth, (int)myRTop, (int)(myDiameter - (long)1 - myRadiusBorderWidth), (int)(myDiameter - (long)1 - myRadiusBorderWidth), 0, 90);
                g2d.drawArc((int)myRLeft, (int)myRHeight, (int)(myDiameter - (long)1 - myRadiusBorderWidth), (int)(myDiameter - (long)1 - myRadiusBorderWidth), 180, 90);
                g2d.drawArc((int)myRWidth, (int)myRHeight, (int)(myDiameter - (long)1 - myRadiusBorderWidth), (int)(myDiameter - (long)1 - myRadiusBorderWidth), 270, 90);
            }
            if (Me.myShape.compareTo(ShapeConstants.vbShapeCloud) == 0) {
                if (Me.myBackStyle.compareTo(BackStyleConstants.vbSolid) == 0) {
                    g2d.setColor(Me.$Parent().getBackground());
                    g2d.fillOval((int)((double)191 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)97 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)576 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)448 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillOval((int)(0.0 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)352 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)381 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)279 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillOval((int)((double)57 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)571 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)384 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)291 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillOval((int)((double)209 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)600 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)617 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)383 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillOval((int)((double)688 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)622 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)599 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)422 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillOval((int)((double)1150 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)534 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)499 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)377 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillOval((int)((double)1379 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)303 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)519 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)413 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillOval((int)((double)1331 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)122 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)529 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)363 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillOval((int)((double)1248 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)(0.0 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)456 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)392 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillOval((int)((double)935 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)(0.0 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)449 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)421 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillOval((int)((double)597 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)36 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)474 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)388 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                    g2d.fillRect((int)((double)300 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)270 / (double)1044 * (double)(Me.$Height() - 1.0f)), (int)((double)1150 / (double)1898 * (double)(Me.$Width() - 1.0f)), (int)((double)500 / (double)1044 * (double)(Me.$Height() - 1.0f)));
                }
                g2d.setStroke(new BasicStroke(Me.myBorderWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g2d.setColor(Me.$Parent().getForeground());
                g2d.drawArc((int)((double)191 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)97 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)576 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)448 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 47, 154);
                g2d.drawArc((int)(0.0 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)352 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)381 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)279 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 89, 181);
                g2d.drawArc((int)((double)57 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)571 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)384 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)291 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 137, 157);
                g2d.drawArc((int)((double)209 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)600 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)617 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)383 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 201, 111);
                g2d.drawArc((int)((double)688 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)622 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)599 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)422 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 198, 161);
                g2d.drawArc((int)((double)1150 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)534 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)499 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)377 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 240, 192);
                g2d.drawArc((int)((double)1379 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)303 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)519 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)413 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 272, 128);
                g2d.drawArc((int)((double)1331 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)122 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)529 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)363 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 308, 121);
                g2d.drawArc((int)((double)1248 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)(0.0 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)456 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)392 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 12, 128);
                g2d.drawArc((int)((double)935 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)(0.0 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)449 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)421 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 46, 103);
                g2d.drawArc((int)((double)597 / (double)1898 * (double)(Me.$Width() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)36 / (double)1044 * (double)(Me.$Height() - 1.0f) + (double)Me.myBorderWidth / (double)2), (int)((double)474 / (double)1898 * (double)(Me.$Width() - 1.0f) - (double)Me.myBorderWidth), (int)((double)388 / (double)1044 * (double)(Me.$Height() - 1.0f) - (double)Me.myBorderWidth), 51, 98);
            }
            g2d.dispose();
            break block28;
            finally {
            }
        }
        Object var3_19 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JComponent $Parent() {
        Shape $Parent = null;
        Throwable Err = null;
        try {
            Shape Me;
            return Me;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $AntiAliasing() {
        boolean $AntiAliasing = false;
        Throwable Err = null;
        try {
            Shape Me;
            return Me.myAntiAliasing;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AntiAliasing;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $AntiAliasing(boolean v) {
        Throwable Err = null;
        try {
            Me.myAntiAliasing = v;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DrawModeConstants $DrawMode() {
        DrawModeConstants $DrawMode = new DrawModeConstants();
        Throwable Err = null;
        try {
            Shape Me;
            return Me.myDrawMode;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $DrawMode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $DrawMode(DrawModeConstants v) {
        Throwable Err = null;
        try {
            Shape Me;
            Me.myDrawMode = v;
            Me.Refresh();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ShapeConstants $Shape() {
        ShapeConstants $Shape = new ShapeConstants();
        Throwable Err = null;
        try {
            Shape Me;
            return Me.myShape;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Shape;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Shape(ShapeConstants v) {
        Throwable Err = null;
        try {
            Shape Me;
            Me.myShape = v;
            Me.Refresh();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BackColor() {
        long $BackColor = 0L;
        Throwable Err = null;
        try {
            Shape Me;
            return Information.ColorToRGB(super.getBackground());
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BackColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BackColor(long v) {
        Throwable Err = null;
        try {
            Shape Me;
            super.setBackground(Information.RGBtoColor(v));
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BorderColor() {
        long $BorderColor = 0L;
        Throwable Err = null;
        try {
            Shape Me;
            return Information.ColorToRGB(Me.$Parent().getForeground());
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BorderColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BorderColor(long v) {
        Throwable Err = null;
        try {
            Shape Me;
            Me.$Parent().setForeground(Information.RGBtoColor(v));
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $FillColor() {
        long $FillColor = 0L;
        Throwable Err = null;
        try {
            Shape Me;
            return Me.myFillColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FillColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FillColor(long v) {
        Throwable Err = null;
        try {
            Shape Me;
            Me.myFillColor = v;
            Me.Refresh();
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public BackStyleConstants $BackStyle() {
        BackStyleConstants $BackStyle = new BackStyleConstants();
        Throwable Err = null;
        try {
            Shape Me;
            return Me.myBackStyle;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BackStyle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BackStyle(BackStyleConstants v) {
        Throwable Err = null;
        try {
            Shape Me;
            Me.myBackStyle = v;
            Me.Refresh();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BorderWidth() {
        long $BorderWidth = 0L;
        Throwable Err = null;
        try {
            Shape Me;
            return Me.myBorderWidth;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BorderWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BorderWidth(long v) {
        Throwable Err = null;
        try {
            Shape Me;
            Me.myBorderWidth = v;
            Me.Refresh();
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public float $Width() {
        float $Width = 0.0f;
        Throwable Err = null;
        try {
            Shape Me;
            return Me.getSize().width;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Width;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Width(float v) {
        Throwable Err = null;
        try {
            Shape Me;
            Me.setSize((int)v, Me.getSize().height);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public float $Height() {
        float $Height = 0.0f;
        Throwable Err = null;
        try {
            Shape Me;
            return Me.getSize().height;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Height;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Height(float v) {
        Throwable Err = null;
        try {
            Shape Me;
            Me.setSize(Me.getSize().width, (int)v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public float $Left() {
        float $Left = 0.0f;
        Throwable Err = null;
        try {
            Shape Me;
            return Me.getLocation().x;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Left;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Left(float v) {
        Throwable Err = null;
        try {
            Shape Me;
            if (!Me.isLeftInitialized) {
                Me.mySavedLeft = v;
                Me.isLeftInitialized = true;
            }
            Me.setLocation((int)v, Me.getLocation().y);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public float $Top() {
        float $Top = 0.0f;
        Throwable Err = null;
        try {
            Shape Me;
            return Me.getLocation().y;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Top;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Top(float v) {
        Throwable Err = null;
        try {
            Shape Me;
            if (!Me.isTopInitialized) {
                Me.mySavedTop = v;
                Me.isTopInitialized = true;
            }
            Me.setLocation(Me.getLocation().x, (int)v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AnchorStyles $Anchor() {
        AnchorStyles $Anchor = new AnchorStyles();
        Throwable Err = null;
        try {
            Shape Me;
            return Me.myAnchor;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Anchor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Anchor(AnchorStyles val) {
        Throwable Err = null;
        try {
            Me.myAnchor = val;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBVariant Move(float Left, float Top, float Width, float Height) {
        VBVariant Move = new VBVariant();
        Throwable Err = null;
        try {
            Shape Me;
            Me.$Left(Left);
            if (Top != (float)(-1 * 1)) {
                Me.$Top(Top);
            }
            if (Width != (float)(-1 * 1)) {
                Me.$Width(Width);
            }
            if (!(Height != (float)(-1 * 1))) {
                return Move;
            }
            Me.$Height(Height);
            return Move;
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Move;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean $Visible() {
        boolean $Visible = false;
        Throwable Err = null;
        try {
            Shape Me;
            return super.isVisible();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Visible;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Visible(boolean v) {
        Throwable Err = null;
        try {
            Shape Me;
            super.setVisible(v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Tag() {
        String $Tag = "";
        Throwable Err = null;
        try {
            Shape Me;
            return Me.myTag;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Tag;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Tag(String v) {
        Throwable Err = null;
        try {
            Me.myTag = v;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Refresh() {
        Throwable Err = null;
        try {
            Shape Me;
            Me.$Parent().invalidate();
            Me.$Parent().repaint(0, 0, 0, (int)Me.$Width(), (int)Me.$Height());
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void ResizeTriggerInit(float w, float h) {
        Throwable Err = null;
        try {
            Shape Me;
            Me.hostSavedWidth = w;
            Me.hostSavedHeight = h;
            Me.mySavedWidth = Me.$Width();
            Me.mySavedHeight = Me.$Height();
            Me.isResizeTriggerInitialized = true;
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void ResizeTrigger(float w, float h) {
        Throwable throwable2;
        Throwable Err;
        block15: {
            Shape Me;
            Err = null;
            int h6 = 0;
            try {
                if (!(Me.isResizeTriggerInitialized & Me.isLeftInitialized & Me.isTopInitialized)) {
                    return;
                }
                h6 = 0;
            }
            catch (Throwable throwable2) {}
            try {
                block11: {
                    block14: {
                        block13: {
                            block12: {
                                h6 = Me.myAnchor.intValue() & 0xC;
                                if (h6 == AnchorStyles.vbLeft.intValue()) break block11;
                                if (h6 == AnchorStyles.vbRight.intValue()) break block12;
                                if (h6 == AnchorStyles.vbLeftRight.intValue()) break block13;
                                if (h6 == AnchorStyles.vbNone.intValue()) break block14;
                                break block11;
                            }
                            Me.$Left(w - Me.hostSavedWidth + Me.mySavedLeft);
                            break block11;
                        }
                        Me.$Width(w - Me.hostSavedWidth + Me.mySavedWidth);
                        break block11;
                    }
                    Me.$Left((float)((double)(w - Me.mySavedWidth) / (double)(Me.hostSavedWidth - Me.mySavedWidth) * (double)Me.mySavedLeft));
                }
                h6 = 0;
            }
            catch (Throwable throwable2) {}
            h6 = Me.myAnchor.intValue() & 3;
            if (h6 == AnchorStyles.vbTop.intValue()) return;
            if (h6 == AnchorStyles.vbBottom.intValue()) {
                Me.$Top(h - Me.hostSavedHeight + Me.mySavedTop);
                return;
            }
            if (h6 == AnchorStyles.vbTopBottom.intValue()) {
                Me.$Height(h - Me.hostSavedHeight + Me.mySavedHeight);
                return;
            }
            if (!(h6 == AnchorStyles.vbNone.intValue())) {
                return;
            }
            Me.$Top((float)((double)(h - Me.mySavedHeight) / (double)(Me.hostSavedHeight - Me.mySavedHeight) * (double)Me.mySavedTop));
            break block15;
            finally {
            }
        }
        Object var4_5 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    public VBVariant Move(float Left) {
        Shape Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        Shape Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        Shape Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }

    public Shape() {
        Shape Me;
        Me.initVars();
    }

    private void initVars() {
        Me.myBorderWidth = 0L;
        Me.myDrawMode = new DrawModeConstants();
        Me.myShape = new ShapeConstants();
        Me.myFillColor = 0L;
        Me.myBackStyle = new BackStyleConstants();
        Me.myAntiAliasing = false;
        Me.myTag = "";
        Me.myAnchor = AnchorStyles.vbTopLeft;
        Me.mySavedWidth = 0.0f;
        Me.mySavedHeight = 0.0f;
        Me.mySavedLeft = 0.0f;
        Me.mySavedTop = 0.0f;
        Me.hostSavedWidth = 0.0f;
        Me.hostSavedHeight = 0.0f;
        Me.isResizeTriggerInitialized = false;
        Me.isLeftInitialized = false;
        Me.isTopInitialized = false;
    }
}
