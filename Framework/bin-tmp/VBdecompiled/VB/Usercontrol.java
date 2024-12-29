/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AnchorStyles;
import VB.IJabacoContainer;
import VB.IJabacoControl;
import VB.ILoadAdapter;
import VB.IMenuItem;
import VB.IToolBarItem;
import VB.LoadAdapter;
import VB.PictureBox;
import VBA.Interaction;
import VBA.VBArray;
import VBA.VBArrayVariant;
import VBA.VBVariant;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class Usercontrol
extends PictureBox
implements ILoadAdapter,
IJabacoContainer,
ComponentListener {
    private boolean bLoaded;
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
    private boolean countTop;
    private boolean countLeft;
    private ButtonGroup RadioButtonGroup;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Usercontrol() {
        Usercontrol Me;
        Throwable Err = null;
        Me.initVarsI();
        try {
            Me.$Parent().addComponentListener(Me);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        Object Err = null;
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void componentResized(ComponentEvent e) {
        Object var3_3;
        Usercontrol Me;
        Throwable Err = null;
        try {
            Me.AnchorResize();
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            if (!Me.bLoaded) {
                return;
            }
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            Me.Usercontrol_Resize();
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return;
        }
    }

    @Override
    public void componentShown(ComponentEvent e) {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public float $ScaleWidth() {
        float $ScaleWidth = 0.0f;
        Throwable Err = null;
        try {
            Usercontrol Me;
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
    @Override
    public float $ScaleHeight() {
        float $ScaleHeight = 0.0f;
        Throwable Err = null;
        try {
            Usercontrol Me;
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
    @Override
    public void fireLoaded() {
        Usercontrol Me;
        Throwable Err = null;
        LoadAdapter tmpFireAdapter = new LoadAdapter(Me, Me);
        try {
            tmpFireAdapter.fireLoaded();
            return;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
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
    public void fireLoaded(Object sender) {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_Initialize();
            Me.bLoaded = true;
            Me.Usercontrol_Resize();
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
            Usercontrol Me;
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
            Usercontrol Me;
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
            Usercontrol Me;
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
            Usercontrol Me;
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
            Usercontrol Me;
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
            Usercontrol Me;
            block4: {
                block3: {
                    block2: {
                        if (!Me.countLeft) break block2;
                        if (!Me.isLeftInitialized) break block3;
                        break block4;
                    }
                    Me.countLeft = true;
                    break block4;
                }
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
            Usercontrol Me;
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
            Usercontrol Me;
            block4: {
                block3: {
                    block2: {
                        if (!Me.countTop) break block2;
                        if (!Me.isTopInitialized) break block3;
                        break block4;
                    }
                    Me.countTop = true;
                    break block4;
                }
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
    @Override
    public AnchorStyles $Anchor() {
        AnchorStyles $Anchor = new AnchorStyles();
        Throwable Err = null;
        try {
            Usercontrol Me;
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
    @Override
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
    @Override
    public Font $Font() {
        Font $Font = null;
        Throwable Err = null;
        try {
            Usercontrol Me;
            return Me.$Parent().getFont();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Font;
    }

    public void Usercontrol_Initialize() {
        Object Err = null;
    }

    public void Usercontrol_Click() {
        Object Err = null;
    }

    public void Usercontrol_DblClick() {
        Object Err = null;
    }

    public void Usercontrol_GotFocus() {
        Object Err = null;
    }

    public void Usercontrol_KeyDown(int KeyCode, int Shift) {
        Object Err = null;
    }

    public void Usercontrol_KeyPress(int KeyAscii) {
        Object Err = null;
    }

    public void Usercontrol_KeyUp(int KeyCode, int Shift) {
        Object Err = null;
    }

    public void Usercontrol_LostFocus() {
        Object Err = null;
    }

    public void Usercontrol_MouseDown(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Usercontrol_MouseMove(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Usercontrol_MouseUp(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Usercontrol_MouseEntered() {
        Object Err = null;
    }

    public void Usercontrol_MouseExited() {
        Object Err = null;
    }

    public void Usercontrol_Paint(Graphics g) {
        Object Err = null;
    }

    public void Usercontrol_Resize() {
        Object Err = null;
    }

    public void Usercontrol_MenuClick(IMenuItem MenuItem) {
        Object Err = null;
    }

    public void Usercontrol_ToolBarClick(IToolBarItem ToolBarItem) {
        Object Err = null;
    }

    public void Usercontrol_Unload(int Cancel) {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void _Click() {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_Click();
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
    public void _DblClick() {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_DblClick();
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
    public void _GotFocus() {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_GotFocus();
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
    public void _KeyDown(int KeyCode, int Shift) {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_KeyDown(KeyCode, Shift);
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
    public void _KeyPress(int KeyAscii) {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_KeyPress(KeyAscii);
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
    public void _KeyUp(int KeyCode, int Shift) {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_KeyUp(KeyCode, Shift);
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
    public void _LostFocus() {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_LostFocus();
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
    public void _MouseDown(int Button, int Shift, float X, float Y) {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_MouseDown(Button, Shift, X, Y);
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
    @Override
    public void _MouseMove(int Button, int Shift, float X, float Y) {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_MouseMove(Button, Shift, X, Y);
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
    @Override
    public void _MouseUp(int Button, int Shift, float X, float Y) {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_MouseUp(Button, Shift, X, Y);
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
    @Override
    public void _MouseEntered() {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_MouseEntered();
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
    public void _MouseExited() {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_MouseExited();
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
    public void _Paint(Graphics g) {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_Paint(g);
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
    public void _Unload(int Cancel) {
        Throwable Err = null;
        try {
            Usercontrol Me;
            Me.Usercontrol_Unload(Cancel);
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
    public PictureBox $ContentFrame() {
        Usercontrol $ContentFrame = null;
        Throwable Err = null;
        try {
            Usercontrol Me;
            return Me;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ContentFrame;
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
            Usercontrol Me;
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void add(Component Component) {
        block22: {
            Err = null;
            Component2 = null;
            try {
                if (!(Component instanceof IJabacoControl != false)) ** GOTO lbl14
            }
            catch (Throwable v0) {
                var3_6 = null;
                Err = v0;
                break block22;
            }
            Component2 = (IJabacoControl)Component;
            Component2.ResizeTriggerInit(Me.$Width(), Me.$Height());
lbl14:
            // 2 sources

            Me.$Parent().add(Component);
            Me.SetZOrder(Component);
            ComponentCB = null;
            ComponentCB = (JCheckBox)Component;
            catch (Throwable v1) {
                var3_7 = null;
                Err = v1;
            }
        }
        Interaction.MsgBox(Err);
        return;
        catch (Throwable v2) {
            var3_5 = null;
            Err = v2;
        }
        try {
            if (ComponentCB != null) return;
            v3 = false;
            if (v3 != false) return;
        }
        catch (Throwable v4) {
            var3_5 = null;
            Err = v4;
            return;
        }
        ComponentAB = null;
        try {
            ComponentAB = (AbstractButton)Component;
        }
        catch (Throwable v5) {
            var3_5 = null;
            Err = v5;
        }
        try {
            if (ComponentAB == null) {
                return;
            }
            v6 = true;
            if (!v6) {
                return;
            }
        }
        catch (Throwable v7) {
            var3_5 = null;
            Err = v7;
        }
        try {
            Me.RadioButtonGroup.add(ComponentAB);
        }
        catch (Throwable v8) {
            var3_5 = null;
            Err = v8;
            return;
        }
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
            Usercontrol Me;
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
            Usercontrol Me;
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

    /*
     * Unable to fully structure code
     */
    private void AnchorResize() {
        block8: {
            Err = null;
            h6 = 0;
            h7 = 0;
            myCont = null;
            comp = new VBArray();
            i = 0;
            try {
                comp = VBArray.createVBArray(Me.getComponents());
                i = 0;
            }
            catch (Throwable v0) {}
            h6 = comp.getUBound(1);
            h7 = 1;
            while (i <= h6) {
                if ((Component)comp.valueOfObj(i) instanceof IJabacoControl != false) {
                    myCont = (IJabacoControl)((Component)comp.valueOfObj(i));
                    myCont.ResizeTrigger(Me.$Parent().getWidth(), Me.$Parent().getHeight());
                }
                i += h7;
            }
lbl21:
            // 2 sources

            return;
lbl23:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            break block8;
            catch (Throwable v0) {
            }
        }
        var2_7 = null;
        Err = v0;
        ** while (true)
    }

    private void initVarsI() {
        Me.bLoaded = false;
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
        Me.countTop = false;
        Me.countLeft = false;
        Me.RadioButtonGroup = new ButtonGroup();
    }
}
