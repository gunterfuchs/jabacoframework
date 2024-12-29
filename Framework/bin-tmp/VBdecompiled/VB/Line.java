/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.DrawModeConstants;
import VB.IJabacoClass;
import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

public class Line
extends JComponent
implements IJabacoClass {
    private long mX1;
    private long mX2;
    private long mY1;
    private long mY2;
    private long myBorderWidth;
    private boolean myAntiAliasing;
    private String myTag;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void paintComponent(Graphics g) {
        Throwable throwable2;
        Throwable Err;
        block6: {
            Graphics2D g2d;
            block11: {
                Line Me;
                block10: {
                    block9: {
                        block8: {
                            block7: {
                                Err = null;
                                try {
                                    if (g == null) return;
                                    g2d = null;
                                }
                                catch (Throwable throwable2) {
                                    break block6;
                                }
                                g2d = (Graphics2D)g;
                                if (Me.myAntiAliasing) {
                                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                                }
                                g2d.setStroke(new BasicStroke(Me.myBorderWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                                g2d.setColor(Me.$Parent().getForeground());
                                if (Me.mX1 <= Me.mX2 & Me.mY1 <= Me.mY2) break block7;
                                if (Me.mX1 > Me.mX2 & Me.mY1 <= Me.mY2) break block8;
                                if (Me.mX1 <= Me.mX2 & Me.mY1 > Me.mY2) break block9;
                                if (Me.mX1 > Me.mX2 & Me.mY1 > Me.mY2) break block10;
                                break block11;
                            }
                            g2d.drawLine((int)((long)0 + Me.myBorderWidth), (int)((long)0 + Me.myBorderWidth), (int)(Me.mX2 - Me.mX1 + Me.myBorderWidth), (int)(Me.mY2 - Me.mY1 + Me.myBorderWidth));
                            break block11;
                        }
                        g2d.drawLine((int)(Me.mX1 - Me.mX2 + Me.myBorderWidth), (int)((long)0 + Me.myBorderWidth), (int)((long)0 + Me.myBorderWidth), (int)(Me.mY2 - Me.mY1 + Me.myBorderWidth));
                        break block11;
                    }
                    g2d.drawLine((int)((long)0 + Me.myBorderWidth), (int)(Me.mY1 - Me.mY2 + Me.myBorderWidth), (int)(Me.mX2 - Me.mX1 + Me.myBorderWidth), (int)((long)0 + Me.myBorderWidth));
                    break block11;
                }
                g2d.drawLine((int)(Me.mX1 - Me.mX2 + Me.myBorderWidth), (int)(Me.mY1 - Me.mY2 + Me.myBorderWidth), (int)((long)0 + Me.myBorderWidth), (int)((long)0 + Me.myBorderWidth));
            }
            g2d.dispose();
        }
        Object var3_4 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JComponent $Parent() {
        Line $Parent = null;
        Throwable Err = null;
        try {
            Line Me;
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
    private void recalcMySelf() {
        Throwable Err = null;
        try {
            Line Me;
            Me.$Parent().setLocation((int)(Interaction.IIF(Me.$X1() > Me.$X2(), VBVariant.valueOf(Me.$X2()), VBVariant.valueOf(Me.$X1())).doubleValue() - (double)Me.$BorderWidth()), (int)(Interaction.IIF(Me.$Y1() > Me.$Y2(), VBVariant.valueOf(Me.$Y2()), VBVariant.valueOf(Me.$Y1())).doubleValue() - (double)Me.$BorderWidth()));
            Me.$Parent().setSize((int)(Math.abs(Me.$X1() - Me.$X2()) + (long)2 * Me.$BorderWidth() + (long)1), (int)(Math.abs(Me.$Y1() - Me.$Y2()) + (long)2 * Me.$BorderWidth() + (long)1));
            Me.$Parent().invalidate();
            Me.$Parent().updateUI();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public DrawModeConstants $DrawMode() {
        DrawModeConstants $DrawMode = new DrawModeConstants();
        Object Err = null;
        return $DrawMode;
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
            Line Me;
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

    public void $DrawMode(DrawModeConstants v) {
        Object Err = null;
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
            Line Me;
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
            Line Me;
            Me.$Parent().setForeground(Information.RGBtoColor(v));
            Me.recalcMySelf();
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
    public long $BorderWidth() {
        long $BorderWidth = 0L;
        Throwable Err = null;
        try {
            Line Me;
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
            Line Me;
            Me.myBorderWidth = v;
            Me.recalcMySelf();
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
    public void $X1(long v) {
        Throwable Err = null;
        try {
            Line Me;
            Me.mX1 = v;
            Me.recalcMySelf();
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
    public long $X1() {
        long $X1 = 0L;
        Throwable Err = null;
        try {
            Line Me;
            return Me.mX1;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $X1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Y1(long v) {
        Throwable Err = null;
        try {
            Line Me;
            Me.mY1 = v;
            Me.recalcMySelf();
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
    public long $Y1() {
        long $Y1 = 0L;
        Throwable Err = null;
        try {
            Line Me;
            return Me.mY1;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Y1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $X2(long v) {
        Throwable Err = null;
        try {
            Line Me;
            Me.mX2 = v;
            Me.recalcMySelf();
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
    public long $X2() {
        long $X2 = 0L;
        Throwable Err = null;
        try {
            Line Me;
            return Me.mX2;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $X2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Y2(long v) {
        Throwable Err = null;
        try {
            Line Me;
            Me.mY2 = v;
            Me.recalcMySelf();
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
    public long $Y2() {
        long $Y2 = 0L;
        Throwable Err = null;
        try {
            Line Me;
            return Me.mY2;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Y2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Visible() {
        boolean $Visible = false;
        Throwable Err = null;
        try {
            Line Me;
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
    public void $Visible(boolean v) {
        Throwable Err = null;
        try {
            Line Me;
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
            Line Me;
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
            Line Me;
            Me.$Parent().invalidate();
            Me.$Parent().repaint(0, 0, 0, (int)(Math.abs(Me.$X1() - Me.$X2()) + (long)2 * Me.$BorderWidth()), (int)(Math.abs(Me.$Y1() - Me.$Y2()) + (long)2 * Me.$BorderWidth()));
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public Line() {
        Line Me;
        Me.initVars();
    }

    private void initVars() {
        Me.mX1 = 0L;
        Me.mX2 = 0L;
        Me.mY1 = 0L;
        Me.mY2 = 0L;
        Me.myBorderWidth = 0L;
        Me.myAntiAliasing = false;
        Me.myTag = "";
    }
}
