/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AbstractForm;
import VB.Global;
import VB.IJabacoForm;
import VB.IMenuItem;
import VB.IToolBarItem;
import VB.MDIChild;
import VBA.Information;
import VBA.Interaction;
import java.awt.Graphics;
import javax.swing.JDesktopPane;

public class MDIForm
extends AbstractForm
implements IJabacoForm {
    private JDesktopPane myDesktop;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MDIForm() {
        MDIForm Me;
        Throwable Err = null;
        Me.initVarsI();
        try {
            Global.setGlobalMDIForm(Me);
            super.getContentPane().add(Me.myDesktop);
            Me.myDesktop.setDoubleBuffered(true);
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
    public void addChild(MDIChild refChild) {
        Throwable Err = null;
        try {
            MDIForm Me;
            Me.myDesktop.add(refChild);
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
            MDIForm Me;
            return Information.ColorToRGB(Me.myDesktop.getBackground());
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
            MDIForm Me;
            Me.myDesktop.setBackground(Information.RGBtoColor(v));
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
    public MDIChild $ActiveForm() {
        MDIChild $ActiveForm = null;
        Throwable Err = null;
        try {
            MDIForm Me;
            return (MDIChild)Me.myDesktop.getSelectedFrame();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ActiveForm;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ActiveForm(MDIChild v) {
        Throwable Err = null;
        try {
            MDIForm Me;
            Me.myDesktop.setSelectedFrame(v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    @Override
    public void Form_Activate() {
        Object Err = null;
    }

    @Override
    public void Form_Deactivate() {
        Object Err = null;
    }

    @Override
    public void Form_GotFocus() {
        Object Err = null;
    }

    @Override
    public void Form_LostFocus() {
        Object Err = null;
    }

    @Override
    public void Form_Load() {
        Object Err = null;
    }

    @Override
    public void Form_Resize() {
        Object Err = null;
    }

    @Override
    public void Form_Move() {
        Object Err = null;
    }

    @Override
    public void Form_MenuClick(IMenuItem MenuItem) {
        Object Err = null;
    }

    @Override
    public void Form_ToolBarClick(IToolBarItem ToolBarItem) {
        Object Err = null;
    }

    public void Form_Click() {
        Object Err = null;
    }

    public void Form_DblClick() {
        Object Err = null;
    }

    @Override
    public void Form_KeyDown(int KeyCode, int Shift) {
        Object Err = null;
    }

    @Override
    public void Form_KeyPress(int KeyAscii) {
        Object Err = null;
    }

    @Override
    public void Form_KeyUp(int KeyCode, int Shift) {
        Object Err = null;
    }

    public void Form_MouseDown(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Form_MouseMove(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Form_MouseUp(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Form_Paint(Graphics g) {
        Object Err = null;
    }

    @Override
    public int Form_Unload() {
        int Form_Unload = 0;
        Object Err = null;
        return Form_Unload;
    }

    private void initVarsI() {
        Me.myDesktop = new JDesktopPane();
    }
}
