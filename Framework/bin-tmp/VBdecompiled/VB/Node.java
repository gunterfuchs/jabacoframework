/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.IJabacoClass;
import VB.TreeIconEnum;
import VB.TreeView;
import VBA.IResource;
import VBA.Interaction;
import VBA.VBArray;
import VBA.VBVariant;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Node
extends DefaultMutableTreeNode
implements IJabacoClass {
    private TreeView myTree;
    private String myKey;
    private long myForeColor;
    private long myForeColorSel;
    private long myBackColor;
    private long myBackColorSel;
    private IResource myOpenIcon;
    private Icon resOpenIcon;
    private IResource myClosedIcon;
    private Icon resClosedIcon;
    private IResource myIcon;
    private Icon resDefaultIcon;
    private IResource myLeafIcon;
    private Icon resLeafIcon;
    private IResource myDisabledIcon;
    private Icon resDisabledIcon;
    private String myFontName;
    private boolean myFontBold;
    private boolean myFontItalic;
    private int myFontSize;
    private Font myFont;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TreeView $OwnerTree() {
        TreeView $OwnerTree = null;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myTree;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $OwnerTree;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void SetDefaultIcons() {
        Throwable Err = null;
        try {
            Me.resOpenIcon = UIManager.getIcon("Tree.openIcon");
            Me.resClosedIcon = UIManager.getIcon("Tree.closedIcon");
            Me.resLeafIcon = UIManager.getIcon("Tree.leafIcon");
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
    private void SetDefaults() {
        Throwable Err = null;
        try {
            Node Me;
            Me.setAllowsChildren(true);
            Me.$FontName("Arial");
            Me.$FontSize(9);
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
    public Node(TreeView refTree) {
        Node Me;
        Throwable Err = null;
        super(refTree);
        Me.initVars();
        try {
            Me.myTree = refTree;
            Me.SetDefaults();
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
    public Node(TreeView refTree, String Text) {
        Node Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myTree = refTree;
            Me.$Text(Text);
            Me.SetDefaults();
            Me.Class_Initialize();
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
    public boolean $Expand() {
        boolean $Expand = false;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myTree.isExpanded(Me);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Expand;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Expand(boolean v) {
        Throwable Err = null;
        try {
            Node Me;
            if (v) {
                Me.myTree.expandNode(Me);
                return;
            }
            Me.myTree.collapseNode(Me);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean $Selected() {
        boolean $Selected = false;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myTree.$Parent().isPathSelected(Me.$TreePath());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return $Selected;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Selected(boolean v) {
        Object var3_3;
        Node Me;
        Throwable Err;
        block14: {
            block13: {
                Err = null;
                try {
                    if (Me.$Selected() == v) return;
                }
                catch (Throwable throwable) {
                    var3_3 = null;
                    Err = throwable;
                }
                try {
                    if (v) break block13;
                    break block14;
                }
                catch (Throwable throwable) {
                    var3_3 = null;
                    Err = throwable;
                }
            }
            try {
                try {
                    Me.myTree.$Parent().setSelectionPath(Me.$TreePath());
                    return;
                }
                catch (Throwable throwable) {
                    var3_3 = null;
                    Err = throwable;
                    return;
                }
            }
            catch (Throwable throwable) {
                var3_3 = null;
                Err = throwable;
            }
        }
        try {
            Me.myTree.$Parent().setSelectionPath(null);
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
    public String $Key() {
        String $Key = "";
        Throwable Err = null;
        try {
            Node Me;
            return Me.myKey;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Key;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Key(String sKey) {
        Throwable Err = null;
        try {
            Me.myKey = sKey;
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
    public boolean $Visible() {
        boolean $Visible = false;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myTree.isVisible(Me);
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
            Node Me;
            if (v) {
                Me.myTree.expandNode(Me);
                return;
            }
            Me.myTree.collapseNode(Me);
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
    public Node $ParentNode() {
        Node $ParentNode = null;
        Throwable Err = null;
        try {
            Node Me;
            return (Node)super.getParent();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ParentNode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $ChildCount() {
        int $ChildCount = 0;
        Throwable Err = null;
        try {
            Node Me;
            return super.getChildCount();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ChildCount;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DefaultMutableTreeNode $AsMutableTreeNode() {
        Node $AsMutableTreeNode = null;
        Throwable Err = null;
        try {
            Node Me;
            return Me;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AsMutableTreeNode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Text() {
        String $Text = "";
        Throwable Err = null;
        try {
            Node Me;
            return super.getUserObject().toString();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Text;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Text(String s) {
        Object var3_3;
        Node Me;
        Throwable Err = null;
        try {
            super.setUserObject(s);
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            Me.myTree.$Model().nodeChanged(Me);
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
    public IResource $OpenIcon() {
        IResource $OpenIcon = null;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myOpenIcon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $OpenIcon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $OpenIcon(IResource refIcon) {
        Throwable Err = null;
        try {
            Me.myOpenIcon = refIcon;
            Me.resOpenIcon = null;
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
    public boolean $AllowsChildren() {
        boolean $AllowsChildren = false;
        Throwable Err = null;
        try {
            Node Me;
            return super.getAllowsChildren();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AllowsChildren;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $AllowsChildren(boolean v) {
        Throwable Err = null;
        try {
            Node Me;
            super.setAllowsChildren(v);
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
    public IResource $ClosedIcon() {
        IResource $ClosedIcon = null;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myClosedIcon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ClosedIcon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ClosedIcon(IResource refIcon) {
        Throwable Err = null;
        try {
            Me.myClosedIcon = refIcon;
            Me.resClosedIcon = null;
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
    public IResource $Icon() {
        IResource $Icon = null;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myIcon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Icon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Icon(IResource refIcon) {
        Throwable Err = null;
        try {
            Me.myIcon = refIcon;
            Me.resDefaultIcon = null;
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
    public IResource $DisabledIcon() {
        IResource $DisabledIcon = null;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myDisabledIcon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $DisabledIcon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $DisabledIcon(IResource refIcon) {
        Throwable Err = null;
        try {
            Me.myDisabledIcon = refIcon;
            Me.resDisabledIcon = null;
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
    public IResource $LeafIcon() {
        IResource $LeafIcon = null;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myLeafIcon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $LeafIcon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $LeafIcon(IResource refIcon) {
        Throwable Err = null;
        try {
            Me.myLeafIcon = refIcon;
            Me.resLeafIcon = null;
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
    public Icon GetIcon(TreeIconEnum IconType) {
        Icon GetIcon = null;
        Throwable Err = null;
        TreeIconEnum h6 = new TreeIconEnum();
        h6 = null;
        try {
            Node Me;
            block12: {
                block11: {
                    block10: {
                        block9: {
                            block8: {
                                h6 = IconType;
                                if (h6.compareTo(TreeIconEnum.TreeIconDefault) == 0) break block8;
                                if (h6.compareTo(TreeIconEnum.TreeIconOpen) == 0) break block9;
                                if (h6.compareTo(TreeIconEnum.TreeIconClosed) == 0) break block10;
                                if (h6.compareTo(TreeIconEnum.TreeIconDisabled) == 0) break block11;
                                if (!(h6.compareTo(TreeIconEnum.TreeIconLeaf) == 0)) {
                                    return GetIcon;
                                }
                                break block12;
                            }
                            if (Me.resDefaultIcon == null) {
                                Me.resDefaultIcon = Global.LoadIcon(Me.$Icon());
                            }
                            return Me.resDefaultIcon;
                        }
                        if (Me.resOpenIcon == null) {
                            Me.resOpenIcon = Global.LoadIcon(Me.$OpenIcon());
                        }
                        return Me.resOpenIcon;
                    }
                    if (Me.resClosedIcon == null) {
                        Me.resClosedIcon = Global.LoadIcon(Me.$ClosedIcon());
                    }
                    return Me.resClosedIcon;
                }
                if (Me.resDefaultIcon == null) {
                    Me.resDisabledIcon = Global.LoadIcon(Me.$DisabledIcon());
                }
                return Me.resDisabledIcon;
            }
            if (Me.resLeafIcon == null) {
                Me.resLeafIcon = Global.LoadIcon(Me.$LeafIcon());
            }
            return Me.resLeafIcon;
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetIcon;
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
            Node Me;
            return Me.myFontName;
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
            Me.myFontName = val;
            Me.myFont = null;
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
            Node Me;
            return Me.myFontBold;
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
            Me.myFontBold = val;
            Me.myFont = null;
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
            Node Me;
            return Me.myFontItalic;
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
            Me.myFontItalic = val;
            Me.myFont = null;
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
            Node Me;
            return Me.myFontSize;
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
            Me.myFontSize = val;
            Me.myFont = null;
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
            Node Me;
            if (Me.myFont == null) {
                Me.myFont = new Font(Me.$FontName(), (int)(Interaction.IIF(Me.$FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(Me.$FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(Me.$FontSize()));
            }
            return Me.myFont;
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
    public long $BackColorSel() {
        long $BackColorSel = 0L;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myBackColorSel;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BackColorSel;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BackColorSel(long v) {
        Throwable Err = null;
        try {
            Me.myBackColorSel = v;
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
    public long $BackColor() {
        long $BackColor = 0L;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myBackColor;
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
            Me.myBackColor = v;
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
    public long $ForeColorSel() {
        long $ForeColorSel = 0L;
        Throwable Err = null;
        try {
            Node Me;
            return Me.myForeColorSel;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ForeColorSel;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ForeColorSel(long v) {
        Throwable Err = null;
        try {
            Me.myForeColorSel = v;
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
            Node Me;
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
    public TreePath $TreePath() {
        TreePath $TreePath = null;
        Throwable Err = null;
        try {
            Node Me;
            return new TreePath(VBArray.createVBArray(super.getPath()).objectArray());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $TreePath;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String toString() {
        String toString = "";
        Throwable Err = null;
        try {
            Node Me;
            return Me.$Text();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return toString;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void removeAllChildren() {
        Throwable Err = null;
        try {
            Node Me;
            super.removeAllChildren();
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
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            Node Me;
            Me.SetDefaultIcons();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        Me.myTree = null;
        Me.myKey = "";
        Me.myForeColor = 0L;
        Me.myForeColorSel = 0L;
        Me.myBackColor = 0L;
        Me.myBackColorSel = 0L;
        Me.myOpenIcon = null;
        Me.resOpenIcon = null;
        Me.myClosedIcon = null;
        Me.resClosedIcon = null;
        Me.myIcon = null;
        Me.resDefaultIcon = null;
        Me.myLeafIcon = null;
        Me.resLeafIcon = null;
        Me.myDisabledIcon = null;
        Me.resDisabledIcon = null;
        Me.myFontName = "";
        Me.myFontBold = false;
        Me.myFontItalic = false;
        Me.myFontSize = 0;
        Me.myFont = null;
    }
}
