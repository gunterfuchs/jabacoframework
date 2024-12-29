/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AnchorStyles;
import VB.Global;
import VB.IJabacoControl;
import VB.MousePointerConstants;
import VB.fmOrientation;
import VBA.IResource;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBVariant;
import java.awt.Adjustable;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JScrollBar;

public class ScrollBar
extends JScrollBar
implements IJabacoControl,
KeyListener,
AdjustmentListener,
FocusListener {
    private IResource myMouseIcon;
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

    public void _GotFocus() {
    }

    public void _LostFocus() {
    }

    public void _Click() {
    }

    public void _KeyDown(int KeyCode, int Shift) {
    }

    public void _KeyPress(int KeyAscii) {
    }

    public void _KeyUp(int KeyCode, int Shift) {
    }

    public void _Scroll() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            ScrollBar Me;
            Me.setVisible(false);
            Me.addKeyListener(Me);
            Me.addAdjustmentListener(Me);
            Me.setVisibleAmount(0);
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
    public void focusGained(FocusEvent arg2) {
        Throwable Err = null;
        try {
            ScrollBar Me;
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
            ScrollBar Me;
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
    public void adjustmentValueChanged(AdjustmentEvent e) {
        Throwable Err = null;
        try {
            ScrollBar Me;
            if (!Me.$Visible()) {
                return;
            }
            Me._Scroll();
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
            ScrollBar Me;
            Me._KeyUp(e.getKeyCode(), Global.KeyEventToShiftConstant(e));
            if (!(e.getKeyCode() == 10 | e.getKeyCode() == 32)) {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void keyTyped(KeyEvent e) {
        Throwable Err = null;
        try {
            ScrollBar Me;
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
            ScrollBar Me;
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
    @Override
    public float $Width() {
        float $Width = 0.0f;
        Throwable Err = null;
        try {
            ScrollBar Me;
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
            ScrollBar Me;
            Me.setSize((int)v, Me.getSize().height);
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
    @Override
    public float $Height() {
        float $Height = 0.0f;
        Throwable Err = null;
        try {
            ScrollBar Me;
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
            ScrollBar Me;
            Me.setSize(Me.getSize().width, (int)v);
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
    @Override
    public float $Left() {
        float $Left = 0.0f;
        Throwable Err = null;
        try {
            ScrollBar Me;
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
            ScrollBar Me;
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
            ScrollBar Me;
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
            ScrollBar Me;
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
            ScrollBar Me;
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
            ScrollBar Me;
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
    public void $Orientation(fmOrientation v) {
        Throwable Err = null;
        try {
            ScrollBar Me;
            if (v.compareTo(fmOrientation.fmOrientationVertical) == 0) {
                super.setOrientation(Adjustable.VERTICAL);
                return;
            }
            super.setOrientation(Adjustable.HORIZONTAL);
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
    public fmOrientation $Orientation() {
        fmOrientation $Orientation = new fmOrientation();
        Throwable Err = null;
        try {
            ScrollBar Me;
            if (!(super.getOrientation() == Adjustable.VERTICAL)) return fmOrientation.fmOrientationHorizontal;
            return fmOrientation.fmOrientationVertical;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Orientation;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Min(int v) {
        Throwable Err = null;
        try {
            ScrollBar Me;
            super.setMinimum(v);
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
    public int $Min() {
        int $Min = 0;
        Throwable Err = null;
        try {
            ScrollBar Me;
            return super.getMinimum();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Min;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Max(int v) {
        Throwable Err = null;
        try {
            ScrollBar Me;
            super.setMaximum(v);
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
    public int $Max() {
        int $Max = 0;
        Throwable Err = null;
        try {
            ScrollBar Me;
            return super.getMaximum();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Max;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Value(int v) {
        Throwable Err = null;
        try {
            ScrollBar Me;
            super.setValue(v);
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
    public int $Value() {
        int $Value = 0;
        Throwable Err = null;
        try {
            ScrollBar Me;
            return super.getValue();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Value;
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
            ScrollBar Me;
            return Me.getToolTipText();
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
            ScrollBar Me;
            if (Strings.Len(v) == 0) {
                Me.setToolTipText(null);
                return;
            }
            Me.setToolTipText(v);
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
            ScrollBar Me;
            return Me.isEnabled();
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
            ScrollBar Me;
            Me.setEnabled(v);
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
            ScrollBar Me;
            return Me.isVisible();
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
            ScrollBar Me;
            Me.setVisible(v);
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
    public JScrollBar $Parent() {
        ScrollBar $Parent = null;
        Throwable Err = null;
        try {
            ScrollBar Me;
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
    public MousePointerConstants $MousePointer() {
        MousePointerConstants $MousePointer = new MousePointerConstants();
        Throwable Err = null;
        try {
            ScrollBar Me;
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
            ScrollBar Me;
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
    public String $MouseIcon() {
        String $MouseIcon = "";
        Throwable Err = null;
        try {
            ScrollBar Me;
            return Me.myMouseIcon.toString();
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
            ScrollBar Me;
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
            ScrollBar Me;
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
            ScrollBar Me;
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
            ScrollBar Me;
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
            ScrollBar Me;
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
            ScrollBar Me;
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
            ScrollBar Me;
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
        ScrollBar Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        ScrollBar Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        ScrollBar Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }

    public ScrollBar() {
        ScrollBar Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        Me.myMouseIcon = null;
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
