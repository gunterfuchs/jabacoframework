/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.CommandButton;
import VB.IJabacoClass;
import VB.IToolBarItem;
import VB.VBToolBar;
import VBA.Interaction;
import java.awt.Color;

public class VBToolBarItem
extends CommandButton
implements IJabacoClass,
IToolBarItem {
    private String myControlID;
    private VBToolBar myToolBar;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBToolBarItem(VBToolBar refToolBar) {
        VBToolBarItem Me;
        Throwable Err = null;
        Me.initVarsI();
        try {
            Me.myToolBar = refToolBar;
            Me.Class_Initialize();
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
    public Color getBackground() {
        Color getBackground = null;
        Throwable Err = null;
        try {
            VBToolBarItem Me;
            if (!(Me.myToolBar == null)) return Me.myToolBar.getBackground();
            return super.getBackground();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getBackground;
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
            VBToolBarItem Me;
            if (!(Me.myToolBar == null)) return Me.myToolBar.getForeground();
            return super.getForeground();
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
    public String $ControlID() {
        String $ControlID = "";
        Throwable Err = null;
        try {
            VBToolBarItem Me;
            return Me.myControlID;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ControlID;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $ControlID(String s) {
        Throwable Err = null;
        try {
            Me.myControlID = s;
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
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            VBToolBarItem Me;
            super.setRolloverEnabled(true);
            super.$Parent().setFocusable(false);
            super.$Parent().setRolloverEnabled(true);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVarsI() {
        Me.myControlID = "";
        Me.myToolBar = null;
    }
}
