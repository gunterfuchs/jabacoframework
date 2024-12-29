/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Node;
import VB.TreeIconEnum;
import VB.TreeStyleConstants;
import VB.TreeView;
import VBA.Information;
import VBA.Interaction;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

public class TreeViewRenderer
extends DefaultTreeCellRenderer {
    private TreeView myTree;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TreeViewRenderer(TreeView refTreeView) {
        TreeViewRenderer Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myTree = refTreeView;
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
    public Component getTreeCellRendererComponent(JTree pTree, Object pValue, boolean pIsSelected, boolean pIsExpanded, boolean pIsLeaf, int pRow, boolean pHasFocus) {
        Throwable throwable2;
        Throwable Err;
        Component getTreeCellRendererComponent;
        block12: {
            TreeViewRenderer Me;
            getTreeCellRendererComponent = null;
            Err = null;
            try {
                super.getTreeCellRendererComponent(pTree, pValue, pIsSelected, pIsExpanded, pIsLeaf, pRow, pHasFocus);
            }
            catch (Throwable throwable2) {
                break block12;
            }
            Node myNode = (Node)pValue;
            if (myNode != null && Me.myTree != null) {
                Me.setText(myNode.$Text());
                Me.setBackground(Information.RGBtoColor(Me.myTree.$BackColor()));
                Me.setBackgroundNonSelectionColor(Information.RGBtoColor(myNode.$BackColor()));
                Me.setBackgroundSelectionColor(Information.RGBtoColor(myNode.$BackColorSel()));
                if (!pIsSelected) {
                    Me.setForeground(Information.RGBtoColor(myNode.$ForeColor()));
                } else {
                    Me.setForeground(Information.RGBtoColor(myNode.$ForeColorSel()));
                }
                if (!Me.usePicture(Me.myTree)) {
                    Me.setClosedIcon(null);
                    Me.setOpenIcon(null);
                    Me.setLeafIcon(null);
                    Me.setIcon(null);
                    Me.setDisabledIcon(null);
                } else if (!(myNode.GetIcon(TreeIconEnum.TreeIconDefault) == null)) {
                    Me.setIcon(myNode.GetIcon(TreeIconEnum.TreeIconDefault));
                    Me.setDisabledIcon(myNode.GetIcon(TreeIconEnum.TreeIconDisabled));
                } else {
                    Me.setClosedIcon(myNode.GetIcon(TreeIconEnum.TreeIconClosed));
                    Me.setOpenIcon(myNode.GetIcon(TreeIconEnum.TreeIconOpen));
                    Me.setLeafIcon(myNode.GetIcon(TreeIconEnum.TreeIconLeaf));
                }
                Me.setFont(myNode.$Font());
            }
            getTreeCellRendererComponent = Me;
            return getTreeCellRendererComponent;
        }
        Object var10_11 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return getTreeCellRendererComponent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean usePicture(TreeView refTree) {
        boolean usePicture = false;
        Throwable Err = null;
        TreeStyleConstants h6 = new TreeStyleConstants();
        h6 = null;
        try {
            h6 = refTree.$Style();
            if (h6.compareTo(TreeStyleConstants.tvwPictureText) == 0) return true;
            boolean bl = false;
            if (bl) return true;
            if (h6.compareTo(TreeStyleConstants.tvwPlusPictureText) == 0) return true;
            boolean bl2 = false;
            if (bl2) return true;
            if (h6.compareTo(TreeStyleConstants.tvwTreelinesPictureText) == 0) return true;
            boolean bl3 = false;
            if (bl3) return true;
            if (h6.compareTo(TreeStyleConstants.tvwTreelinesPlusMinusPictureText) == 0) return true;
            return false;
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return usePicture;
    }

    private void initVars() {
        Me.myTree = null;
    }
}
