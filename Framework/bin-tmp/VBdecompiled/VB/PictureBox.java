/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AnchorStyles;
import VB.Global;
import VB.IJabacoControl;
import VB.MousePointerConstants;
import VB.RasterOpConstants;
import VB.VBImage;
import VB.fmBorderStyle;
import VB.fmSpecialEffect;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayVariant;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class PictureBox
extends JPanel
implements IJabacoControl,
MouseListener,
MouseMotionListener,
KeyListener,
FocusListener {
    private boolean DoubleBuffering;
    private ButtonGroup RadioButtonGroup;
    private Image myImage;
    private IResource myImagePath;
    private Image myBufferedImage;
    private float myDrawWidth;
    private int myTransparency;
    private boolean myAntiAliasing;
    private fmBorderStyle myBorderStyle;
    private fmSpecialEffect mySpecialEffect;
    private long myBorderColor;
    private long myCurrentX;
    private long myCurrentY;
    private String myTag;
    private IResource myMouseIcon;
    private long myForeColor;
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
    private float smv;
    private float h3;

    public void _Activate() {
    }

    public void _Click() {
    }

    public void _DblClick() {
    }

    public void _Deactivate() {
    }

    public void _GotFocus() {
    }

    public void _KeyDown(int KeyCode, int Shift) {
    }

    public void _KeyPress(int KeyAscii) {
    }

    public void _KeyUp(int KeyCode, int Shift) {
    }

    public void _LostFocus() {
    }

    public void _MouseDown(int Button, int Shift, float X, float Y) {
    }

    public void _MouseMove(int Button, int Shift, float X, float Y) {
    }

    public void _MouseUp(int Button, int Shift, float X, float Y) {
    }

    public void _MouseEntered() {
    }

    public void _MouseExited() {
    }

    public void _Paint(Graphics g) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JPanel $Parent() {
        PictureBox $Parent = null;
        Throwable Err = null;
        try {
            PictureBox Me;
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
    public PictureBox() {
        Object var2_2;
        PictureBox Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.$Parent().addKeyListener(Me);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().addFocusListener(Me);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().addMouseListener(Me);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().addMouseMotionListener(Me);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().setDoubleBuffered(true);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            super.setBorder(new EtchedBorder());
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            super.setLayout(null);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            super.setFocusable(true);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            super.setFocusTraversalKeysEnabled(false);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            super.setRequestFocusEnabled(true);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.myTransparency = 0;
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.myDrawWidth = 1.0f;
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void focusGained(FocusEvent arg2) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me._GotFocus();
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
    public void focusLost(FocusEvent arg2) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me._LostFocus();
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
    public void mouseMoved(MouseEvent e) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me._MouseMove(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
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
    public void mouseDragged(MouseEvent e) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me._MouseMove(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
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
    public void mousePressed(MouseEvent e) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.SetFocus();
            Me._MouseDown(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
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
    public void mouseReleased(MouseEvent e) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me._MouseUp(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
            if (!(e.getX() > 0 & e.getY() > 0 & e.getX() < Me.getWidth() & e.getY() < Me.getHeight())) {
                return;
            }
            if (e.getClickCount() % 2 == 0) {
                Me._DblClick();
                return;
            }
            Me._Click();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me._MouseEntered();
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
    public void mouseExited(MouseEvent e) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me._MouseExited();
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
    public void keyReleased(KeyEvent e) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me._KeyUp(e.getKeyCode(), Global.KeyEventToShiftConstant(e));
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
    public void keyTyped(KeyEvent e) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me._KeyPress(e.getKeyChar());
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
    public void keyPressed(KeyEvent e) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me._KeyDown(e.getKeyCode(), Global.KeyEventToShiftConstant(e));
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
    private Image GetBufferedImage() {
        Image GetBufferedImage = null;
        Throwable Err = null;
        Image oldImage = null;
        Graphics2D TmpGraphics2D = null;
        try {
            PictureBox Me;
            if (Me.myBufferedImage == null) {
                Me.smv = 0.0f;
                Me.h3 = 0.0f;
            }
            if (Me.smv != Me.$Width() | Me.h3 != Me.$Height()) {
                oldImage = Me.myBufferedImage;
                TmpGraphics2D = (Graphics2D)super.getGraphics();
                if (TmpGraphics2D == null) return GetBufferedImage;
                Me.myBufferedImage = TmpGraphics2D.getDeviceConfiguration().createCompatibleImage((int)Me.$Width(), (int)Me.$Height(), Transparency.TRANSLUCENT);
                if (oldImage != null) {
                    Me.myBufferedImage.getGraphics().drawImage(oldImage, 0, 0, null);
                }
                Me.smv = Me.$Width();
                Me.h3 = Me.$Height();
            }
            return Me.myBufferedImage;
        }
        catch (Throwable throwable) {
            Object var3_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetBufferedImage;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Graphics2D getGraphics() {
        Throwable throwable2;
        Throwable Err;
        Graphics2D getGraphics;
        block8: {
            float tmpAlphaValue;
            AlphaComposite tmpAlpha;
            PictureBox Me;
            getGraphics = null;
            Err = null;
            Graphics2D getGraphics2D = null;
            try {
                if (!Me.DoubleBuffering) {
                    getGraphics2D = (Graphics2D)super.getGraphics();
                } else {
                    if (Me.GetBufferedImage() == null) return getGraphics;
                    getGraphics2D = (Graphics2D)Me.GetBufferedImage().getGraphics();
                }
                getGraphics2D.setFont(Me.getFont());
                getGraphics2D.setColor(Me.getForeground());
                tmpAlpha = null;
                tmpAlphaValue = 0.0f;
            }
            catch (Throwable throwable2) {
                break block8;
            }
            tmpAlphaValue = (float)((double)(100 - Me.myTransparency) / (double)100);
            tmpAlpha = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, tmpAlphaValue);
            getGraphics2D.setComposite(tmpAlpha);
            getGraphics2D.setStroke(new BasicStroke(Me.myDrawWidth));
            getGraphics2D.setBackground(Me.getBackground());
            if (Me.myAntiAliasing) {
                getGraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            }
            getGraphics = getGraphics2D;
            return getGraphics;
        }
        Object var3_6 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return getGraphics;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void disposeGraphics(Graphics v) {
        Throwable Err = null;
        try {
            PictureBox Me;
            if (Me.DoubleBuffering) {
                Me.$Parent().repaint(0, 0, (int)Me.$Width(), (int)Me.$Height());
            }
            v.dispose();
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
    private void SetZOrder(Component Component2) {
        Object var3_4;
        Throwable Err = null;
        VBVariant ParentV = new VBVariant();
        try {
            PictureBox Me;
            ParentV = VBVariant.valueOf(Me.$Parent());
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        try {
            VBArrayVariant vBArrayVariant = VBArray.createParamArray(1);
            vBArrayVariant.setValueVar(0, VBVariant.valueOf(Component2));
            vBArrayVariant.setValueVar(1, VBVariant.valueOf(0));
            Interaction.CallByName(ParentV.toObject(), "setComponentZOrder", vBArrayVariant);
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void add(Component Component2) {
        Object var3_4;
        PictureBox Me;
        Throwable Err = null;
        Me.$Parent().add(Component2);
        Me.SetZOrder(Component2);
        JCheckBox ComponentCB = null;
        ComponentCB = (JCheckBox)Component2;
        catch (Throwable throwable) {
            Object var3_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return;
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        try {
            if (ComponentCB != null) return;
            boolean bl = false;
            if (bl) return;
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
            return;
        }
        AbstractButton ComponentAB = null;
        try {
            ComponentAB = (AbstractButton)Component2;
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        try {
            if (ComponentAB == null) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        try {
            Me.RadioButtonGroup.add(ComponentAB);
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Opaque() {
        boolean $Opaque = false;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Parent().isOpaque();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Opaque;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Opaque(boolean v) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.$Parent().setOpaque(v);
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
    public long $CurrentX() {
        long $CurrentX = 0L;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.myCurrentX;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CurrentX;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CurrentX(long v) {
        Throwable Err = null;
        try {
            Me.myCurrentX = v;
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
    public long $CurrentY() {
        long $CurrentY = 0L;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.myCurrentY;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CurrentY;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CurrentY(long v) {
        Throwable Err = null;
        try {
            Me.myCurrentY = v;
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
    public void PSet(float x, float y) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.Line(x, y, x, y);
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
    public void PSet(float x, float y, long col) {
        Throwable Err = null;
        long MemCol = 0L;
        try {
            PictureBox Me;
            MemCol = Me.$ForeColor();
            Me.$ForeColor(col);
            Me.Line(x, y, x, y);
            Me.$ForeColor(MemCol);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Line(float x, float y) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.Line(Me.myCurrentX, Me.myCurrentY, x, y);
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
    public void Line(float x1, float y1, float x2, float y2) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.Line(x1, y1, x2, y2, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Line(float x1, float y1, float x2, float y2, boolean Rect) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.Line(x1, y1, x2, y2, Rect, -1 * 1);
            return;
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Line(float x1, float y1, float x2, float y2, boolean Rect, long FillColor) {
        Object var9_10;
        PictureBox Me;
        Graphics2D my2DGraphics;
        Throwable Err;
        block36: {
            block33: {
                block35: {
                    Color tmpColor;
                    block34: {
                        block32: {
                            Err = null;
                            tmpColor = null;
                            my2DGraphics = null;
                            try {
                                my2DGraphics = Me.getGraphics();
                            }
                            catch (Throwable throwable) {
                                var9_10 = null;
                                Err = throwable;
                            }
                            try {
                                if (Rect) break block32;
                                break block33;
                            }
                            catch (Throwable throwable) {
                                var9_10 = null;
                                Err = throwable;
                            }
                        }
                        try {
                            if (FillColor != (long)(-1 * 1)) break block34;
                            break block35;
                        }
                        catch (Throwable throwable) {
                            var9_10 = null;
                            Err = throwable;
                        }
                    }
                    try {
                        tmpColor = my2DGraphics.getColor();
                    }
                    catch (Throwable throwable) {
                        var9_10 = null;
                        Err = throwable;
                    }
                    try {
                        my2DGraphics.setColor(Information.RGBtoColor(FillColor));
                    }
                    catch (Throwable throwable) {
                        var9_10 = null;
                        Err = throwable;
                    }
                    try {
                        my2DGraphics.fill(new Rectangle2D.Float(x1 + 1.0f, y1 + 1.0f, x2 - x1 - 1.0f, y2 - y1 - 1.0f));
                    }
                    catch (Throwable throwable) {
                        var9_10 = null;
                        Err = throwable;
                    }
                    try {
                        my2DGraphics.setColor(tmpColor);
                    }
                    catch (Throwable throwable) {
                        var9_10 = null;
                        Err = throwable;
                    }
                }
                try {
                    try {
                        my2DGraphics.draw(new Rectangle2D.Float(x1, y1, x2 - x1, y2 - y1));
                    }
                    catch (Throwable throwable) {
                        var9_10 = null;
                        Err = throwable;
                    }
                    break block36;
                }
                catch (Throwable throwable) {
                    var9_10 = null;
                    Err = throwable;
                }
            }
            try {
                my2DGraphics.draw(new Line2D.Float(x1, y1, x2, y2));
            }
            catch (Throwable throwable) {
                var9_10 = null;
                Err = throwable;
            }
        }
        try {
            Me.disposeGraphics(my2DGraphics);
        }
        catch (Throwable throwable) {
            var9_10 = null;
            Err = throwable;
        }
        try {
            Me.myCurrentX = (long)x2;
        }
        catch (Throwable throwable) {
            var9_10 = null;
            Err = throwable;
        }
        try {
            Me.myCurrentY = (long)y2;
        }
        catch (Throwable throwable) {
            var9_10 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void PaintPicture(Image Picture, int X1, int Y1) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.PaintPicture(Picture, X1, Y1, RasterOpConstants.vbSrcCopy);
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void PaintPicture(Image Picture, int X1, int Y1, RasterOpConstants Opcode) {
        Throwable Err = null;
        Graphics2D my2DGraphics = null;
        try {
            PictureBox Me;
            my2DGraphics = Me.getGraphics();
            my2DGraphics.drawImage(Picture, X1, Y1, null);
            Me.disposeGraphics(my2DGraphics);
            return;
        }
        catch (Throwable throwable) {
            Object var6_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void PaintPicture(Image Picture, int X1, int Y1, int Width, int Height, int X2, int Y2, int Width2, int Height2) {
        Throwable Err = null;
        Graphics2D my2DGraphics = null;
        try {
            PictureBox Me;
            my2DGraphics = Me.getGraphics();
            my2DGraphics.drawImage(Picture, X2, Y2, Width2, Height2, X1, Y1, Width, Height, null);
            Me.disposeGraphics(my2DGraphics);
            return;
        }
        catch (Throwable throwable) {
            Object var11_12 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Circle(float x, float y, float radius) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.Circle(x, y, radius, Me.$ForeColor());
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Circle(float x, float y, float radius, long color) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.Circle(x, y, radius, color, 0.0f, (float)((double)2 * Math.PI));
            return;
        }
        catch (Throwable throwable) {
            Object var7_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect, long FillColor) {
        Throwable throwable2;
        Throwable Err;
        block16: {
            float angleLen;
            Color tmpColor;
            PictureBox Me;
            Graphics2D my2DGraphics;
            float halfStep2;
            float halfStep1;
            Err = null;
            try {
                if (endAngle <= 0.0f | !((double)endAngle <= (double)2 * Math.PI)) {
                    endAngle = (float)((double)2 * Math.PI);
                }
                halfStep1 = 0.0f;
                halfStep2 = 0.0f;
                my2DGraphics = null;
            }
            catch (Throwable throwable2) {}
            try {
                my2DGraphics = Me.getGraphics();
                tmpColor = null;
            }
            catch (Throwable throwable2) {}
            try {
                tmpColor = my2DGraphics.getColor();
                angleLen = 0.0f;
            }
            catch (Throwable throwable2) {}
            angleLen = !(!(endAngle <= startAngle)) ? (float)((double)endAngle + (double)2 * Math.PI - (double)startAngle) : endAngle - startAngle;
            halfStep1 = (float)((double)startAngle / Math.PI * (double)180);
            halfStep2 = (float)((double)angleLen / Math.PI * (double)180);
            my2DGraphics.setColor(Information.RGBtoColor(FillColor));
            if (FillColor != (long)(-1 * 1)) {
                if (!(!(aspect <= 1.0f))) {
                    my2DGraphics.fill(new Arc2D.Float(x - radius, y - radius * aspect, radius * (float)2, radius * (float)2 * aspect, halfStep1, halfStep2, 0));
                } else {
                    my2DGraphics.fill(new Arc2D.Float((float)((double)x - (double)radius / (double)aspect), y - radius, (float)((double)(radius * (float)2) / (double)aspect), radius * (float)2, halfStep1, halfStep2, 0));
                }
            }
            if (color == (long)(-1 * 1)) {
                color = Me.$ForeColor();
            }
            my2DGraphics.setColor(Information.RGBtoColor(color));
            if (!(!(aspect <= 1.0f))) {
                my2DGraphics.draw(new Arc2D.Float(x - radius, y - radius * aspect, radius * (float)2, radius * (float)2 * aspect, Math.round(halfStep1), halfStep2, 0));
            } else {
                my2DGraphics.draw(new Arc2D.Float((float)((double)x - (double)radius / (double)aspect), y - radius, (float)((double)(radius * (float)2) / (double)aspect), radius * (float)2, halfStep1, halfStep2, 0));
            }
            my2DGraphics.setColor(tmpColor);
            Me.disposeGraphics(my2DGraphics);
            break block16;
            finally {
            }
        }
        Object var12_15 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int TextWidth(String text) {
        int TextWidth = 0;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Parent().getFontMetrics(Me.$Parent().getFont()).stringWidth(text);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return TextWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int TextHeight(String text) {
        int TextHeight = 0;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Parent().getFontMetrics(Me.$Parent().getFont()).getHeight();
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return TextHeight;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Print(String text) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.Print(text, Me.$CurrentX(), Me.$CurrentY());
            Me.$CurrentX(0);
            Me.$CurrentY(Me.$CurrentY() + (long)Me.TextHeight(""));
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Unable to fully structure code
     */
    public void Print(String text, float x1, float y1) {
        block20: {
            block19: {
                Err = null;
                h10 = 0;
                h11 = 0;
                TabSplits = new VBArray();
                my2DGraphics = null;
                myString = Strings.Replace(text, Strings.StrCat(Strings.Chr(13), Strings.Chr(10)), Strings.Chr(13));
                myString = Strings.Replace(myString, Strings.Chr(10), Strings.Chr(13));
                NewLineSplits = new VBArray();
                NewLineSplits = Strings.Split(myString, Strings.Chr(13));
                i = 0;
                if (!(NewLineSplits.getUBound(1) > 0)) ** GOTO lbl27
                i = 0;
                h10 = NewLineSplits.getUBound(1) - 1;
                h11 = 1;
                while (i <= h10) {
                    Me.Print(NewLineSplits.valueOfStr(i));
                    i += h11;
                }
                Me.Print(NewLineSplits.valueOfStr(NewLineSplits.getUBound(1)), Me.$CurrentX(), Me.$CurrentY());
                break block19;
lbl27:
                // 1 sources

                TabSplits = Strings.Split(myString, Strings.Chr(9));
                myString = TabSplits.valueOfStr(0);
                if (!(TabSplits.getUBound(1) > 0)) ** GOTO lbl41
                i = 1;
                h10 = TabSplits.getUBound(1);
                h11 = 1;
                while (i <= h10) {
                    myString = Strings.StrCat(Strings.StrCat(myString, Strings.Space(8 - Strings.Len(myString) % 8)), TabSplits.valueOfStr(i));
                    i += h11;
                }
lbl41:
                // 2 sources

                my2DGraphics = Me.getGraphics();
                my2DGraphics.drawString(myString, x1 + (float)true, (y1 += (float)Me.$Parent().getFontMetrics(Me.$Parent().getFont()).getMaxAscent()) + (float)true);
                Me.disposeGraphics(my2DGraphics);
            }
lbl46:
            // 2 sources

            return;
lbl48:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            catch (Throwable v0) {}
            break block20;
            catch (Throwable v0) {}
            break block20;
            catch (Throwable v0) {}
            break block20;
            catch (Throwable v0) {
                break block20;
            }
            catch (Throwable v0) {}
            break block20;
            catch (Throwable v0) {
                break block20;
            }
            finally {
            }
        }
        var5_12 = null;
        Err = v0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Cls() {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.myCurrentX = 0;
            Me.myCurrentY = 0;
            if (Me.DoubleBuffering) {
                Me.myBufferedImage = null;
                Me.$Parent().repaint();
                return;
            }
            Me.$Parent().repaint();
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
    public boolean $AutoRedraw() {
        boolean $AutoRedraw = false;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.DoubleBuffering;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AutoRedraw;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $AutoRedraw(boolean v) {
        Throwable Err = null;
        try {
            Me.DoubleBuffering = v;
            if (v) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.myBufferedImage = null;
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
    public boolean $AntiAliasing() {
        boolean $AntiAliasing = false;
        Throwable Err = null;
        try {
            PictureBox Me;
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
    public int $Transparency() {
        int $Transparency = 0;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.myTransparency;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Transparency;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Transparency(int v) {
        Throwable Err = null;
        try {
            if (v < 0) {
                v = 0;
            }
            if (v > 99) {
                v = 99;
            }
            Me.myTransparency = v;
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
    public int $DrawWidth() {
        int $DrawWidth = 0;
        Throwable Err = null;
        try {
            PictureBox Me;
            return (int)Me.myDrawWidth;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $DrawWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $DrawWidth(int v) {
        Throwable Err = null;
        try {
            Me.myDrawWidth = v;
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
    public long $BorderColor() {
        long $BorderColor = 0L;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.myBorderColor;
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
            if (v != (long)(-1 * 1)) {
                Me.myBorderColor = v;
                return;
            }
            Me.myBorderColor = Information.ColorToRGB(new JLabel().getForeground());
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
    public IResource $Picture() {
        IResource $Picture = null;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.myImagePath;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Picture;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void $Picture(IResource Path) {
        block5: {
            Throwable Err = null;
            try {
                PictureBox Me;
                if (Strings.Len(Path.toString()) <= 0) {
                    return;
                }
                boolean bl = true;
                if (!bl) break block5;
                Me.myImage = Global.LoadPicture(Path);
                if (Me.myImage == null) {
                    return;
                }
                boolean bl2 = true;
                if (!bl2) break block5;
                Me.myImagePath = Path;
            }
            catch (Throwable throwable) {
                Object var3_3 = null;
                Err = throwable;
                return;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void $Picture(Image refImage) {
        Throwable Err = null;
        VBImage tmpImage = new VBImage(refImage);
        try {
            Me.myImagePath = tmpImage;
            Me.myImage = tmpImage.getImage();
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public fmBorderStyle $BorderStyle() {
        fmBorderStyle $BorderStyle = new fmBorderStyle();
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.myBorderStyle;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BorderStyle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BorderStyle(fmBorderStyle v) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.myBorderStyle = v;
            Me.SetMyBorder();
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
    public fmSpecialEffect $SpecialEffect() {
        fmSpecialEffect $SpecialEffect = new fmSpecialEffect();
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.mySpecialEffect;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $SpecialEffect;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $SpecialEffect(fmSpecialEffect v) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.mySpecialEffect = v;
            Me.SetMyBorder();
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
    private void SetMyBorder() {
        Throwable Err = null;
        try {
            PictureBox Me;
            super.setBorder(Global.GetVBBorder(Me.$BorderStyle(), Me.$SpecialEffect(), Me.$BorderColor()));
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
    protected void paintComponent(Graphics g) {
        Object var3_5;
        PictureBox Me;
        Throwable Err;
        block25: {
            Graphics dg;
            Image tmpImage;
            block24: {
                Err = null;
                tmpImage = null;
                dg = null;
                try {
                    super.paintComponent(g);
                }
                catch (Throwable throwable) {
                    var3_5 = null;
                    Err = throwable;
                }
                try {
                    if (Me.myImage != null) {
                        g.drawImage(Me.myImage, 0, 0, Me);
                    }
                }
                catch (Throwable throwable) {
                    var3_5 = null;
                    Err = throwable;
                }
                try {
                    if (Me.DoubleBuffering) break block24;
                    break block25;
                }
                catch (Throwable throwable) {
                    var3_5 = null;
                    Err = throwable;
                }
            }
            try {
                tmpImage = Me.GetBufferedImage();
            }
            catch (Throwable throwable) {
                var3_5 = null;
                Err = throwable;
            }
            try {
                dg = tmpImage.getGraphics();
            }
            catch (Throwable throwable) {
                var3_5 = null;
                Err = throwable;
            }
            try {
                Me._Paint(dg);
            }
            catch (Throwable throwable) {
                var3_5 = null;
                Err = throwable;
            }
            try {
                g.drawImage(tmpImage, 0, 0, Me);
            }
            catch (Throwable throwable) {
                var3_5 = null;
                Err = throwable;
            }
            try {
                try {
                    dg.dispose();
                    return;
                }
                catch (Throwable throwable) {
                    var3_5 = null;
                    Err = throwable;
                    return;
                }
            }
            catch (Throwable throwable) {
                var3_5 = null;
                Err = throwable;
            }
        }
        try {
            Me._Paint(g);
        }
        catch (Throwable throwable) {
            var3_5 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Image $Image() {
        Image $Image = null;
        Throwable Err = null;
        Image tmpImage = null;
        Graphics2D TmpGraphics2D = null;
        try {
            PictureBox Me;
            TmpGraphics2D = Me.getGraphics();
            if (TmpGraphics2D == null) return $Image;
            tmpImage = TmpGraphics2D.getDeviceConfiguration().createCompatibleImage((int)Me.$Width(), (int)Me.$Height(), Transparency.TRANSLUCENT);
            TmpGraphics2D.dispose();
            TmpGraphics2D = (Graphics2D)tmpImage.getGraphics();
            if (Me.myImage != null) {
                TmpGraphics2D.drawImage(Me.myImage, 0, 0, Me);
            }
            TmpGraphics2D.drawImage(Me.GetBufferedImage(), 0, 0, Me);
            $Image = tmpImage;
            TmpGraphics2D.dispose();
            return $Image;
        }
        catch (Throwable throwable) {
            Object var3_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Image;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public BufferedImage $ImageBuffer() {
        BufferedImage $ImageBuffer = null;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Interaction.createBufferedImage(Me.$Image());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ImageBuffer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $Point(float x, float y) {
        long $Point = 0L;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Information.ColorToRGB(new Color(Me.$ImageBuffer().getRGB((int)x, (int)y)));
        }
        catch (Throwable throwable) {
            Object var6_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Point;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $ScaleLeft() {
        float $ScaleLeft = 0.0f;
        Throwable Err = null;
        try {
            PictureBox Me;
            return super.getRootPane().getLayeredPane().getLocation().x;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleLeft;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $ScaleTop() {
        float $ScaleTop = 0.0f;
        Throwable Err = null;
        try {
            PictureBox Me;
            return super.getRootPane().getLayeredPane().getLocation().y;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleTop;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $ScaleWidth() {
        float $ScaleWidth = 0.0f;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Width();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $ScaleHeight() {
        float $ScaleHeight = 0.0f;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Height();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleHeight;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $FontName() {
        String $FontName = "";
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Parent().getFont().getFamily();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontName;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontName(String val) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.$Parent().setFont(new Font(val, (int)(Interaction.IIF(Me.$FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(Me.$FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(Me.$FontSize())));
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
    public boolean $FontBold() {
        boolean $FontBold = false;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Parent().getFont().isBold();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontBold;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontBold(boolean val) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.$Parent().setFont(new Font(Me.$FontName(), (int)(Interaction.IIF(val, VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(Me.$FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(Me.$FontSize())));
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
    public boolean $FontItalic() {
        boolean $FontItalic = false;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Parent().getFont().isItalic();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontItalic;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontItalic(boolean val) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.$Parent().setFont(new Font(Me.$FontName(), (int)(Interaction.IIF(Me.$FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(val, VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(Me.$FontSize())));
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
    public int $FontSize() {
        int $FontSize = 0;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Global.JFontSizeToVBFontSize(Me.$Font().getSize());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontSize;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontSize(int val) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.$Parent().setFont(new Font(Me.$FontName(), (int)(Interaction.IIF(Me.$FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(Me.$FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(val)));
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
    public Font $Font() {
        Font $Font = null;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Parent().getFont();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Font;
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
            PictureBox Me;
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
            PictureBox Me;
            if (v == (long)(-1 * 1)) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
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
    public long $ForeColor() {
        long $ForeColor = 0L;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.myForeColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ForeColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ForeColor(long v) {
        Throwable Err = null;
        try {
            if (v == (long)(-1 * 1)) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.myForeColor = v;
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
    public Color getForeground() {
        Color getForeground = null;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Information.RGBtoColor(Me.myForeColor);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getForeground;
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
            PictureBox Me;
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
            PictureBox Me;
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
            PictureBox Me;
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
            PictureBox Me;
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
            PictureBox Me;
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
            PictureBox Me;
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
            PictureBox Me;
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
            PictureBox Me;
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
            PictureBox Me;
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
            PictureBox Me;
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
    public String $ToolTip() {
        String $ToolTip = "";
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Parent().getToolTipText();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ToolTip;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ToolTip(String v) {
        Throwable Err = null;
        try {
            PictureBox Me;
            if (Strings.Len(v) == 0) {
                Me.$Parent().setToolTipText(null);
                return;
            }
            Me.$Parent().setToolTipText(v);
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
    public boolean $Enabled() {
        boolean $Enabled = false;
        Throwable Err = null;
        try {
            PictureBox Me;
            return super.isEnabled();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Enabled;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Enabled(boolean v) {
        Throwable Err = null;
        try {
            PictureBox Me;
            super.setEnabled(v);
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
    public boolean $Visible() {
        boolean $Visible = false;
        Throwable Err = null;
        try {
            PictureBox Me;
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
            PictureBox Me;
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
            PictureBox Me;
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
    public MousePointerConstants $MousePointer() {
        MousePointerConstants $MousePointer = new MousePointerConstants();
        Throwable Err = null;
        try {
            PictureBox Me;
            return Global.JCursorToVBMousePointer(Me.$Parent().getCursor());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MousePointer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $MousePointer(MousePointerConstants v) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.$Parent().setCursor(Global.VBMousePointerToJCursor(v));
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
    public IResource $MouseIcon() {
        IResource $MouseIcon = null;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.myMouseIcon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MouseIcon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $MouseIcon(IResource v) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.myMouseIcon = v;
            Me.$Parent().setCursor(Global.VBMouseIconToJCursor(v, Me));
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
    public boolean $CanGetFocus() {
        boolean $CanGetFocus = false;
        Throwable Err = null;
        try {
            PictureBox Me;
            return Me.$Parent().isFocusable();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CanGetFocus;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CanGetFocus(boolean v) {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.$Parent().setFocusable(v);
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
    public void SetFocus() {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.$Parent().requestFocus();
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
    public void Refresh() {
        Throwable Err = null;
        try {
            PictureBox Me;
            Me.$Parent().invalidate();
            Me.$Parent().repaint(0, 0, 0, (int)Me.$Width(), (int)Me.$Height());
            Me.$Parent().revalidate();
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
            PictureBox Me;
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
            PictureBox Me;
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

    private void initVars() {
        Me.DoubleBuffering = false;
        Me.RadioButtonGroup = new ButtonGroup();
        Me.myImage = null;
        Me.myImagePath = null;
        Me.myBufferedImage = null;
        Me.myDrawWidth = 0.0f;
        Me.myTransparency = 0;
        Me.myAntiAliasing = false;
        Me.myBorderStyle = new fmBorderStyle();
        Me.mySpecialEffect = new fmSpecialEffect();
        Me.myBorderColor = 0L;
        Me.myCurrentX = 0L;
        Me.myCurrentY = 0L;
        Me.myTag = "";
        Me.myMouseIcon = null;
        Me.myForeColor = 0L;
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
        Me.smv = 0.0f;
        Me.smv = 0.0f;
        Me.h3 = 0.0f;
        Me.h3 = 0.0f;
    }

    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle) {
        PictureBox Me;
        Me.Circle(x, y, radius, color, startAngle, endAngle, 1.0f, -1 * 1);
    }

    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect) {
        PictureBox Me;
        Me.Circle(x, y, radius, color, startAngle, endAngle, aspect, -1 * 1);
    }

    public VBVariant Move(float Left) {
        PictureBox Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        PictureBox Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        PictureBox Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }
}
