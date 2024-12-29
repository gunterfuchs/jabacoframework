/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.IJabacoClass;
import VB.IMenuItem;
import VB.VBMenuBar;
import VBA.IResource;
import VBA.Interaction;
import VBA.Strings;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class VBOptionButtonMenuItem
extends JRadioButtonMenuItem
implements IJabacoClass,
IMenuItem {
    private IResource myIconPath;
    private String myControlID;
    private VBMenuBar myMenuBar;

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
            VBOptionButtonMenuItem Me;
            if (Me.myMenuBar == null) {
                getBackground = super.getBackground();
                Me.$Parent().setOpaque(true);
                return getBackground;
            }
            getBackground = Me.myMenuBar.getBackground();
            Me.$Parent().setOpaque(true);
            return getBackground;
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
            VBOptionButtonMenuItem Me;
            if (!(Me.myMenuBar == null)) return Me.myMenuBar.getForeground();
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
            VBOptionButtonMenuItem Me;
            if (!(Me.myMenuBar == null)) return Me.myMenuBar.getFont();
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
    public VBOptionButtonMenuItem(VBMenuBar refMenuBar, JComponent refOwner, String refControlID, String refCaption, boolean refSelected, ButtonGroup refGroup, boolean refEnabled, boolean refVisible, IResource refIconPath) {
        VBOptionButtonMenuItem Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myMenuBar = refMenuBar;
            refGroup.add(Me);
            if (!(refOwner == null)) {
                refOwner.add(Me);
            } else {
                refMenuBar.add(Me);
            }
            Me.$Parent().addActionListener(refMenuBar);
            Me.$Caption(refCaption);
            Me.$ControlID(refControlID);
            Me.$Enabled(refEnabled);
            Me.$Visible(refVisible);
            Me.$Icon(refIconPath);
            super.setSelected(refSelected);
            return;
        }
        catch (Throwable throwable) {
            Object var11_11 = null;
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
    public String $ControlID() {
        String $ControlID = "";
        Throwable Err = null;
        try {
            VBOptionButtonMenuItem Me;
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
    @Override
    public String $Caption() {
        String $Caption = "";
        Throwable Err = null;
        try {
            VBOptionButtonMenuItem Me;
            return Me.getLabel();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Caption;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Caption(String s) {
        Throwable Err = null;
        int mnemonicPos = 0;
        try {
            VBOptionButtonMenuItem Me;
            mnemonicPos = s.indexOf("&");
            if (mnemonicPos > -1 * 1 & mnemonicPos < s.length()) {
                Me.setMnemonic(s.charAt(mnemonicPos + 1));
            }
            Me.setLabel(s.replaceFirst("&", ""));
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
    @Override
    public IResource $Icon() {
        IResource $Icon = null;
        Throwable Err = null;
        try {
            VBOptionButtonMenuItem Me;
            return Me.myIconPath;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Icon;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void $Icon(IResource Path) {
        block5: {
            Throwable Err = null;
            try {
                VBOptionButtonMenuItem Me;
                if (Path == null) {
                    return;
                }
                boolean bl = true;
                if (!bl) break block5;
                if (Strings.Len(Path.toString()) <= 0) {
                    return;
                }
                boolean bl2 = true;
                if (!bl2) break block5;
                Me.setIcon(Global.LoadIcon(Path));
                Me.myIconPath = Path;
            }
            catch (Throwable throwable) {
                Object var3_3 = null;
                Err = throwable;
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Selected() {
        boolean $Selected = false;
        Throwable Err = null;
        try {
            VBOptionButtonMenuItem Me;
            return super.isSelected();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Selected;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Selected(boolean v) {
        Throwable Err = null;
        try {
            VBOptionButtonMenuItem Me;
            super.setSelected(v);
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
    public boolean $Enabled() {
        boolean $Enabled = false;
        Throwable Err = null;
        try {
            VBOptionButtonMenuItem Me;
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
    @Override
    public void $Enabled(boolean v) {
        Throwable Err = null;
        try {
            VBOptionButtonMenuItem Me;
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
            VBOptionButtonMenuItem Me;
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
            VBOptionButtonMenuItem Me;
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
    public JMenuItem $Parent() {
        JMenuItem $Parent = null;
        Throwable Err = null;
        try {
            VBOptionButtonMenuItem Me;
            return Me;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    private void initVars() {
        Me.myIconPath = null;
        Me.myControlID = "";
        Me.myMenuBar = null;
    }
}
