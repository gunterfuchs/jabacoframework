/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AnchorStyles;
import VB.DirListBox$TreeView;
import VB.LabelEditConstants;
import VB.MousePointerConstants;
import VB.Node;
import VB.PictureBox;
import VB.TreeLineStyleConstants;
import VB.TreeRelationshipConstants;
import VB.TreeStyleConstants;
import VB.Usercontrol;
import VB.fmBorderStyle;
import VB.fmSpecialEffect;
import VBA.IResource;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayString;
import VBA.VBVariant;
import java.io.File;
import java.util.Iterator;

public class DirListBox
extends Usercontrol {
    private String myPath;
    private String fileSeparator;
    private DirListBox$TreeView myTree;

    public void _Change() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void Usercontrol_Initialize() {
        Throwable throwable2;
        Throwable Err;
        block5: {
            VBArray roots;
            DirListBox Me;
            Err = null;
            try {
                Me.myTree.$Top(0.0f);
                Me.myTree.$Left(0.0f);
                Me.Usercontrol_Resize();
                Me.fileSeparator = System.getProperties().getProperty("file.separator");
                roots = new VBArray();
            }
            catch (Throwable throwable2) {
                break block5;
            }
            roots = VBArray.createVBArray(File.listRoots());
            Me.myTree.$Nodes().Add(null, TreeRelationshipConstants.tvwFirst, "ROOT", ((File)roots.valueOfObj(0)).getPath());
        }
        Object var2_3 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void Usercontrol_Resize() {
        Throwable Err = null;
        try {
            DirListBox Me;
            Me.myTree.$Width(Me.$Width());
            Me.myTree.$Height(Me.$Height());
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Path(String newPath) {
        Throwable throwable2;
        Throwable Err;
        block10: {
            DirListBox Me;
            Err = null;
            VBArrayString splittedPath = new VBArray();
            int i = 0;
            Node rootNode = null;
            int h9 = 0;
            int h10 = 0;
            File tmp = new File(newPath);
            if (!(tmp.exists() & tmp.isDirectory())) {
                return;
            }
            Me.myTree.$Nodes().Remove("ROOT");
            Me.myTree.$Nodes().Clear();
            splittedPath = Me.SplitPath(newPath);
            rootNode = Me.myTree.$Nodes().Add(null, TreeRelationshipConstants.tvwFirst, "ROOT", Strings.StrCat(splittedPath.valueOfStr(0), Me.fileSeparator));
            i = 1;
            {
                catch (Throwable throwable2) {}
            }
            h9 = splittedPath.getUBound(1);
            h10 = 1;
            boolean bl = true;
            do {
                block11: {
                    if (bl && !(bl = false)) {
                        if (true) continue;
                    }
                    break block11;
                    break block10;
                }
                rootNode = Me.myTree.$Nodes().Add(rootNode, TreeRelationshipConstants.tvwChild, null, splittedPath.valueOfStr(i));
                i += h10;
            } while (i <= h9);
            Me.myTree.makeVisible(rootNode);
            catch (Throwable throwable2) {
                break block10;
            }
            finally {
            }
        }
        Object var3_9 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Path() {
        String $Path = "";
        Throwable Err = null;
        try {
            DirListBox Me;
            if (Me.myTree.$SelectedItem() != null) return Me.getPath(Me.myTree.$SelectedItem());
            return $Path;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Path;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String getPath(Node Node2) {
        Throwable throwable2;
        Throwable Err;
        String getPath;
        block6: {
            getPath = "";
            Err = null;
            String sPath = "";
            Node oParentNode = null;
            try {
                sPath = Node2.$Text();
                oParentNode = Node2.$ParentNode();
                while (true) {
                    DirListBox Me;
                    if (!(oParentNode != null)) {
                        return Strings.Replace(sPath, Strings.StrCat(Me.fileSeparator, Me.fileSeparator), Me.fileSeparator);
                    }
                    if (Strings.StrComp(oParentNode.$Text(), "ROOT") == 0) return Strings.Replace(sPath, Strings.StrCat(Me.fileSeparator, Me.fileSeparator), Me.fileSeparator);
                    sPath = Strings.StrCat(Strings.StrCat(oParentNode.$Text(), Me.fileSeparator), sPath);
                    oParentNode = oParentNode.$ParentNode();
                    continue;
                    break;
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (Throwable throwable2) {
            }
        }
        Object var4_6 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return getPath;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void buildFolderTree(Node Node2) {
        Throwable throwable2;
        Throwable Err;
        block8: {
            DirListBox Me;
            Err = null;
            Iterator h7 = null;
            Node tmpNode = null;
            if (Node2 == null | Node2.$ChildCount() > 0) return;
            VBArray childFolders = new VBArray();
            childFolders = VBArray.createVBArray(new File(Me.getPath(Node2)).listFiles());
            File item = null;
            h7 = childFolders.iterator();
            while (h7.hasNext()) {
                item = (File)VBVariant.valueOf(h7.next()).toObject();
                if (!item.isDirectory()) continue;
                tmpNode = Me.myTree.$Nodes().Add(Node2, TreeRelationshipConstants.tvwChild, null, item.getName());
                Me.myTree.expandNode(tmpNode);
            }
            return;
            catch (Throwable throwable2) {}
            break block8;
            catch (Throwable throwable2) {}
            break block8;
            finally {
            }
        }
        Object var3_7 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private VBArrayString SplitPath(String FullDirPath) {
        VBArrayString SplitPath = null;
        Throwable Err = null;
        try {
            DirListBox Me;
            if (Strings.StrComp(Strings.Right(FullDirPath, 1), Me.fileSeparator) == 0) {
                FullDirPath = Strings.Left(FullDirPath, Strings.Len(FullDirPath) - 1);
            }
            return Strings.Split(FullDirPath, Me.fileSeparator);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return SplitPath;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void myTree_NodeClick(Node Node2) {
        Throwable Err = null;
        try {
            DirListBox Me;
            Me.buildFolderTree(Node2);
            Me._Change();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void myTree_Click() {
        Throwable Err = null;
        try {
            DirListBox Me;
            ((PictureBox)Me)._Click();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public DirListBox() {
        DirListBox Me;
        Me.initVarsII();
    }

    private void initVarsII() {
        DirListBox Me;
        Me.myPath = "";
        Me.fileSeparator = "";
        DirListBox dirListBox = Me;
        dirListBox.$Opaque(-1 != 0);
        dirListBox.$AutoRedraw(false);
        dirListBox.$AntiAliasing(false);
        dirListBox.$Transparency(0);
        dirListBox.$DrawWidth(1);
        dirListBox.$BorderColor(0);
        dirListBox.$Picture((IResource)null);
        dirListBox.$BorderStyle(fmBorderStyle.fmBorderStyleNone);
        dirListBox.$SpecialEffect(fmSpecialEffect.fmSpecialEffectFlat);
        dirListBox.$FontName("Arial");
        dirListBox.$FontBold(false);
        dirListBox.$FontItalic(false);
        dirListBox.$FontSize(9);
        dirListBox.$BackColor(-2147483633);
        dirListBox.$ForeColor(0);
        dirListBox.$Width(400);
        dirListBox.$Height(300);
        dirListBox.$ToolTip("");
        dirListBox.$Enabled(-1 != 0);
        dirListBox.$Tag("");
        dirListBox.$MousePointer(MousePointerConstants.vbDefault);
        dirListBox.$MouseIcon(null);
        dirListBox.$CanGetFocus(-1 != 0);
        dirListBox.$Anchor(AnchorStyles.vbTopLeft);
        DirListBox dirListBox2 = Me;
        dirListBox2.$Left(0.0f);
        dirListBox2.$Top(0.0f);
        dirListBox2.$Visible(-1 != 0);
        Me.myTree = new DirListBox$TreeView();
        Me.myTree.setOwner(Me, 1);
        DirListBox$TreeView dirListBox$TreeView = Me.myTree;
        dirListBox$TreeView.$BorderStyle(fmBorderStyle.fmBorderStyleSingle);
        dirListBox$TreeView.$Margin(1);
        dirListBox$TreeView.$BackColorSel(-2147483635);
        dirListBox$TreeView.$ForeColorSel(-2147483634);
        dirListBox$TreeView.$LabelEdit(LabelEditConstants.lvwAutomatic);
        dirListBox$TreeView.$LineStyle(TreeLineStyleConstants.tvwTreeLines);
        dirListBox$TreeView.$Style(TreeStyleConstants.tvwPictureText);
        dirListBox$TreeView.$FontName("Arial");
        dirListBox$TreeView.$FontBold(false);
        dirListBox$TreeView.$FontItalic(false);
        dirListBox$TreeView.$FontSize(9);
        dirListBox$TreeView.$BackColor(-2147483643);
        dirListBox$TreeView.$ForeColor(-2147483640);
        dirListBox$TreeView.$Width(337);
        dirListBox$TreeView.$Height(233);
        dirListBox$TreeView.$ToolTip("");
        dirListBox$TreeView.$Enabled(-1 != 0);
        dirListBox$TreeView.$Tag("");
        dirListBox$TreeView.$MousePointer(MousePointerConstants.vbDefault);
        dirListBox$TreeView.$MouseIcon(null);
        dirListBox$TreeView.$CanGetFocus(-1 != 0);
        dirListBox$TreeView.$Anchor(AnchorStyles.vbTopLeft);
        Me.add(Me.myTree);
        DirListBox$TreeView dirListBox$TreeView2 = Me.myTree;
        dirListBox$TreeView2.$Left(8);
        dirListBox$TreeView2.$Top(8);
        dirListBox$TreeView2.$Visible(-1 != 0);
        Me.fireLoaded();
    }
}
