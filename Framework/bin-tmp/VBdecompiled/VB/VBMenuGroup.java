/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.IJabacoClass;
import VB.IMenuItem;
import VB.VBMenuBar;
import VB.VBMenuItem;
import VBA.IResource;
import VBA.Interaction;
import VBA.Strings;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

public class VBMenuGroup
extends JMenu
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
    public VBMenuBar $MenuBar() {
        VBMenuBar $MenuBar = null;
        Throwable Err = null;
        try {
            VBMenuGroup Me;
            return Me.myMenuBar;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MenuBar;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBMenuGroup(VBMenuBar refMenuBar, JComponent refOwner, String refControlID, String refCaption, boolean refEnabled, boolean refVisible, IResource refIconPath) {
        VBMenuGroup Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myMenuBar = refMenuBar;
            if (!(refOwner == null)) {
                refOwner.add(Me);
                Me.$Parent().setOpaque(true);
            } else {
                refMenuBar.add((Component)Me);
                Me.$Parent().setOpaque(false);
            }
            Me.$Parent().addActionListener(refMenuBar);
            Me.$Caption(refCaption);
            Me.$ControlID(refControlID);
            Me.$Enabled(refEnabled);
            Me.$Visible(refVisible);
            Me.$Icon(refIconPath);
            return;
        }
        catch (Throwable throwable) {
            Object var9_9 = null;
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
            VBMenuGroup Me;
            if (!(Me.myMenuBar == null)) return Me.myMenuBar.getBackground();
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
            VBMenuGroup Me;
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
            VBMenuGroup Me;
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
    public JPopupMenu GetAsPopupMenu() {
        JPopupMenu GetAsPopupMenu = null;
        Throwable Err = null;
        try {
            VBMenuGroup Me;
            return Me.GetAsPopupMenu(null);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetAsPopupMenu;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JPopupMenu GetAsPopupMenu(JComponent tmpMenu) {
        VBMenuGroup Me;
        Object var4_11;
        VBMenuGroup tmpNewMenuGroup;
        VBMenuItem tmpNewMenuItem;
        VBMenuGroup tmpMenuGroup;
        VBMenuItem tmpMenuItem;
        int h13;
        int h12;
        Throwable Err;
        JPopupMenu GetAsPopupMenu;
        block35: {
            JPopupMenu tmpNewPopupMenu;
            block34: {
                GetAsPopupMenu = null;
                Err = null;
                tmpNewPopupMenu = null;
                h12 = 0;
                h13 = 0;
                tmpMenuItem = null;
                tmpMenuGroup = null;
                tmpNewMenuItem = null;
                tmpNewMenuGroup = null;
                try {
                    if (tmpMenu == null) break block34;
                    break block35;
                }
                catch (Throwable throwable) {
                    var4_11 = null;
                    Err = throwable;
                }
            }
            tmpNewPopupMenu = new JPopupMenu();
            try {
                tmpMenu = tmpNewPopupMenu;
                return tmpMenu;
            }
            catch (Throwable throwable) {
                var4_11 = null;
                Err = throwable;
            }
        }
        int i = 0;
        i = 0;
        h12 = Me.$Parent().getMenuComponentCount() - 1;
        h13 = 1;
        while (i <= h12) {
            block39: {
                block38: {
                    block37: {
                        block36: {
                            try {
                                tmpMenuItem = null;
                            }
                            catch (Throwable throwable) {
                                var4_11 = null;
                                Err = throwable;
                            }
                            try {
                                tmpMenuItem = (VBMenuItem)Me.$Parent().getMenuComponent(i);
                            }
                            catch (Throwable throwable) {
                                var4_11 = null;
                                Err = throwable;
                            }
                            try {
                                if (tmpMenuItem != null) break block36;
                                break block37;
                            }
                            catch (Throwable throwable) {
                                var4_11 = null;
                                Err = throwable;
                            }
                        }
                        try {
                            tmpNewMenuItem = new VBMenuItem(Me.myMenuBar, tmpMenu, tmpMenuItem.$ControlID(), tmpMenuItem.$Caption(), true, tmpMenuItem.$Visible(), tmpMenuItem.$Icon());
                            return tmpNewMenuItem;
                        }
                        catch (Throwable throwable) {
                            var4_11 = null;
                            Err = throwable;
                        }
                    }
                    try {
                        tmpMenuGroup = null;
                    }
                    catch (Throwable throwable) {
                        var4_11 = null;
                        Err = throwable;
                    }
                    try {
                        tmpMenuGroup = (VBMenuGroup)Me.$Parent().getMenuComponent(i);
                    }
                    catch (Throwable throwable) {
                        var4_11 = null;
                        Err = throwable;
                    }
                    try {
                        if (tmpMenuGroup != null) break block38;
                        break block39;
                    }
                    catch (Throwable throwable) {
                        var4_11 = null;
                        Err = throwable;
                    }
                }
                try {
                    tmpNewMenuGroup = new VBMenuGroup(Me.myMenuBar, tmpMenu, tmpMenuGroup.$ControlID(), tmpMenuGroup.$Caption(), true, tmpMenuGroup.$Visible(), tmpMenuGroup.$Icon());
                }
                catch (Throwable throwable) {
                    var4_11 = null;
                    Err = throwable;
                }
                try {
                    tmpMenuGroup.GetAsPopupMenu(tmpNewMenuGroup);
                }
                catch (Throwable throwable) {
                    var4_11 = null;
                    Err = throwable;
                }
            }
            i += h13;
        }
        try {
            return (JPopupMenu)tmpMenu;
        }
        catch (Throwable throwable) {
            var4_11 = null;
            Err = throwable;
            return GetAsPopupMenu;
        }
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
            VBMenuGroup Me;
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
            VBMenuGroup Me;
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
            VBMenuGroup Me;
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
    public boolean $Enabled() {
        boolean $Enabled = false;
        Throwable Err = null;
        try {
            VBMenuGroup Me;
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
            VBMenuGroup Me;
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
            VBMenuGroup Me;
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
            VBMenuGroup Me;
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
    @Override
    public IResource $Icon() {
        IResource $Icon = null;
        Throwable Err = null;
        try {
            VBMenuGroup Me;
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
                VBMenuGroup Me;
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
                super.setIcon(Global.LoadIcon(Path));
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
    public JMenu $Parent() {
        VBMenuGroup $Parent = null;
        Throwable Err = null;
        try {
            VBMenuGroup Me;
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
