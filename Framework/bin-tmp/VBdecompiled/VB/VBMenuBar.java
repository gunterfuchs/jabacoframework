/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VB.IJabacoForm;
import VB.IMenuItem;
import VB.VBCheckBoxMenuItem;
import VB.VBMenuGroup;
import VB.VBMenuItem;
import VB.VBOptionButtonMenuItem;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;

public class VBMenuBar
extends JMenuBar
implements IJabacoClass,
ActionListener {
    private long myForeColor;
    private long myBackColor;
    private IJabacoForm myOwner;

    public void _Visible(boolean b) {
    }

    public void _Click(IMenuItem MenuItem) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IJabacoForm $Owner() {
        IJabacoForm $Owner = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.myOwner;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Owner;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBMenuBar(IJabacoForm Owner) {
        VBMenuBar Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myOwner = Owner;
            Me.$Parent().setOpaque(true);
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
            VBMenuBar Me;
            if (!(Me.myOwner == null)) return Information.RGBtoColor(Me.myOwner.$MenuBackColor());
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
            VBMenuBar Me;
            if (!(Me.myOwner == null)) return Information.RGBtoColor(Me.myOwner.$MenuForeColor());
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
    public Font getFont() {
        Font getFont = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            if (!(Me.myOwner == null)) return Me.myOwner.$Font();
            return super.getFont();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getFont;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void GoClick(Object e) {
        VBMenuBar Me;
        Throwable Err = null;
        IMenuItem tmpComponent = null;
        try {
            tmpComponent = (IMenuItem)e;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Me._Click(tmpComponent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void add(Component Component2) {
        Object var3_3;
        VBMenuBar Me;
        Throwable Err = null;
        try {
            super.add(Component2);
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            Me.$Visible(true);
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBMenuGroup createMenuGroup(VBMenuGroup Owner, String ControlID, String Caption) {
        VBMenuGroup createMenuGroup = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createMenuGroup(Owner, ControlID, Caption, true);
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createMenuGroup;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBMenuGroup createMenuGroup(VBMenuGroup Owner, String ControlID, String Caption, boolean Visible) {
        VBMenuGroup createMenuGroup = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createMenuGroup(Owner, ControlID, Caption, Visible, null);
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createMenuGroup;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBMenuGroup createMenuGroup(VBMenuGroup Owner, String ControlID, String Caption, boolean Visible, IResource IconPath) {
        VBMenuGroup createMenuGroup = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createMenuGroup(Owner, ControlID, Caption, true, Visible, IconPath);
        }
        catch (Throwable throwable) {
            Object var8_8 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createMenuGroup;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBMenuGroup createMenuGroup(VBMenuGroup Owner, String ControlID, String Caption, boolean Enabled, boolean Visible, IResource IconPath) {
        VBMenuGroup createMenuGroup = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return new VBMenuGroup(Me, Owner, ControlID, Caption, Enabled, Visible, IconPath);
        }
        catch (Throwable throwable) {
            Object var9_9 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createMenuGroup;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void addSeparator() {
        Throwable Err = null;
        try {
            VBMenuBar Me;
            Me.addSeparator(null);
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
    public void addSeparator(VBMenuGroup Owner) {
        Throwable Err = null;
        JSeparator tmpMenuSep = new JSeparator();
        try {
            if (Owner == null) {
                VBMenuBar Me;
                Me.add(tmpMenuSep);
                return;
            }
            Owner.add(tmpMenuSep);
            return;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBMenuItem createMenu(VBMenuGroup Owner, String ControlID, String Caption) {
        VBMenuItem createMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createMenu(Owner, ControlID, Caption, true);
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBMenuItem createMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Visible) {
        VBMenuItem createMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createMenu(Owner, ControlID, Caption, Visible, null);
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBMenuItem createMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Visible, IResource IconPath) {
        VBMenuItem createMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createMenu(Owner, ControlID, Caption, true, Visible, IconPath);
        }
        catch (Throwable throwable) {
            Object var8_8 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBMenuItem createMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Enabled, boolean Visible, IResource IconPath) {
        VBMenuItem createMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return new VBMenuItem(Me, Owner, ControlID, Caption, Enabled, Visible, IconPath);
        }
        catch (Throwable throwable) {
            Object var9_9 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBCheckBoxMenuItem createCheckBoxMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Checked) {
        VBCheckBoxMenuItem createCheckBoxMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createCheckBoxMenu(Owner, ControlID, Caption, Checked, true);
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createCheckBoxMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBCheckBoxMenuItem createCheckBoxMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Checked, boolean Visible) {
        VBCheckBoxMenuItem createCheckBoxMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createCheckBoxMenu(Owner, ControlID, Caption, Checked, Visible, null);
        }
        catch (Throwable throwable) {
            Object var8_8 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createCheckBoxMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBCheckBoxMenuItem createCheckBoxMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Checked, boolean Visible, IResource IconPath) {
        VBCheckBoxMenuItem createCheckBoxMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createCheckBoxMenu(Owner, ControlID, Caption, Checked, true, Visible, IconPath);
        }
        catch (Throwable throwable) {
            Object var9_9 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createCheckBoxMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBCheckBoxMenuItem createCheckBoxMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Checked, boolean Enabled, boolean Visible, IResource IconPath) {
        VBCheckBoxMenuItem createCheckBoxMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return new VBCheckBoxMenuItem(Me, Owner, ControlID, Caption, Checked, Enabled, Visible, IconPath);
        }
        catch (Throwable throwable) {
            Object var10_10 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createCheckBoxMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ButtonGroup createOptionButtonMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Selected) {
        ButtonGroup createOptionButtonMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createOptionButtonMenu(Owner, ControlID, Caption, Selected, true);
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createOptionButtonMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ButtonGroup createOptionButtonMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, boolean Visible) {
        ButtonGroup createOptionButtonMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createOptionButtonMenu(Owner, ControlID, Caption, Selected, true, Visible, null);
        }
        catch (Throwable throwable) {
            Object var8_8 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createOptionButtonMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ButtonGroup createOptionButtonMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, boolean Enabled, boolean Visible, IResource IconPath) {
        VBMenuBar Me;
        ButtonGroup createOptionButtonMenu = null;
        Throwable Err = null;
        ButtonGroup group = new ButtonGroup();
        VBOptionButtonMenuItem optionb = new VBOptionButtonMenuItem(Me, Owner, ControlID, Caption, Selected, group, Enabled, Visible, IconPath);
        try {
            return group;
        }
        catch (Throwable throwable) {
            Object var10_12 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createOptionButtonMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBOptionButtonMenuItem createOptionButtonMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, ButtonGroup Group, boolean Enabled, boolean Visible, IResource IconPath) {
        VBOptionButtonMenuItem createOptionButtonMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return new VBOptionButtonMenuItem(Me, Owner, ControlID, Caption, Selected, Group, Enabled, Visible, IconPath);
        }
        catch (Throwable throwable) {
            Object var11_11 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createOptionButtonMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBOptionButtonMenuItem createOptionButtonMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, ButtonGroup Group, boolean Visible, IResource IconPath) {
        VBOptionButtonMenuItem createOptionButtonMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createOptionButtonMenu(Owner, ControlID, Caption, Selected, Group, true, Visible, IconPath);
        }
        catch (Throwable throwable) {
            Object var10_10 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createOptionButtonMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBOptionButtonMenuItem createOptionButtonMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, ButtonGroup Group, boolean Visible) {
        VBOptionButtonMenuItem createOptionButtonMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createOptionButtonMenu(Owner, ControlID, Caption, Selected, Group, Visible, null);
        }
        catch (Throwable throwable) {
            Object var9_9 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createOptionButtonMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBOptionButtonMenuItem createOptionButtonMenu(VBMenuGroup Owner, String ControlID, String Caption, boolean Selected, ButtonGroup Group) {
        VBOptionButtonMenuItem createOptionButtonMenu = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me.createOptionButtonMenu(Owner, ControlID, Caption, Selected, Group, true);
        }
        catch (Throwable throwable) {
            Object var8_8 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createOptionButtonMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $Height() {
        int $Height = 0;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            if (!Me.$Visible()) {
                return 0;
            }
            $Height = Me.$Parent().getHeight();
            if ($Height == 0) return (int)Me.$Parent().getPreferredSize().getHeight();
            return $Height;
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
    public boolean $Visible() {
        boolean $Visible = false;
        Throwable Err = null;
        try {
            VBMenuBar Me;
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
    public void $Visible(boolean v) {
        Throwable Err = null;
        try {
            VBMenuBar Me;
            if (Me.$Parent().isVisible() == v) return;
            Me.$Parent().setVisible(v);
            if (Me.$Parent().isVisible() != v) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me._Visible(v);
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
    public JMenuBar $Parent() {
        VBMenuBar $Parent = null;
        Throwable Err = null;
        try {
            VBMenuBar Me;
            return Me;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    private void Class_Initialize() {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Throwable Err = null;
        try {
            VBMenuBar Me;
            Me.GoClick(e.getSource());
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        Me.myForeColor = 0L;
        Me.myBackColor = 0L;
        Me.myOwner = null;
    }
}
