/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.LabelEditConstants;
import VB.TreeView;
import VBA.Interaction;
import java.awt.Component;
import java.util.EventObject;
import javax.swing.JTree;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;

public class TreeViewEditor
extends DefaultTreeCellEditor
implements CellEditorListener {
    private TreeView myOwner;
    private DefaultTreeCellRenderer myRenderer;
    private boolean myRegisterStartEdit;
    private boolean myRegisterStopEdit;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DefaultTreeCellEditor $Parent() {
        TreeViewEditor $Parent = null;
        Throwable Err = null;
        try {
            TreeViewEditor Me;
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
    public TreeView $Owner() {
        TreeView $Owner = null;
        Throwable Err = null;
        try {
            TreeViewEditor Me;
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
    public void $Owner(TreeView tree) {
        Throwable Err = null;
        try {
            Me.myOwner = tree;
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
    public TreeViewEditor(JTree tree, DefaultTreeCellRenderer renderer) {
        TreeViewEditor Me;
        Throwable Err = null;
        super(tree, renderer);
        Me.initVars();
        try {
            Me.myRenderer = renderer;
            Me.$Parent().addCellEditorListener(Me);
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
    public void registerStartEdit() {
        Throwable Err = null;
        try {
            Me.myRegisterStartEdit = true;
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
    public void registerStopEdit() {
        Throwable Err = null;
        try {
            Me.myRegisterStopEdit = true;
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
    public boolean isCellEditable(EventObject anEvent) {
        boolean isCellEditable = false;
        Throwable Err = null;
        boolean MemRegisterStartEdit = false;
        try {
            TreeViewEditor Me;
            MemRegisterStartEdit = Me.myRegisterStartEdit;
            Me.myRegisterStartEdit = false;
            if (Me.myOwner == null) {
                return super.isCellEditable(anEvent);
            }
            if (!(Me.myOwner.$LabelEdit().compareTo(LabelEditConstants.lvwAutomatic) == 0 | MemRegisterStartEdit)) {
                return false;
            }
            Me.myRegisterStopEdit = false;
            Me.$Owner().fireBeforeLabelEdit();
            if (Me.myRegisterStopEdit) return false;
            return super.isCellEditable(anEvent);
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return isCellEditable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Component getTreeCellEditorComponent(JTree pTree, Object pValue, boolean pIsSelected, boolean pIsExpanded, boolean pIsLeaf, int pRow) {
        Component getTreeCellEditorComponent = null;
        Throwable Err = null;
        try {
            TreeViewEditor Me;
            return super.getTreeCellEditorComponent(pTree, pValue, pIsSelected, pIsExpanded, pIsLeaf, pRow);
        }
        catch (Throwable throwable) {
            Object var9_9 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getTreeCellEditorComponent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void editingStopped(ChangeEvent arg2) {
        Throwable Err = null;
        try {
            TreeViewEditor Me;
            Me.$Owner().fireAfterLabelEdit(false);
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
    public void editingCanceled(ChangeEvent arg2) {
        Throwable Err = null;
        try {
            TreeViewEditor Me;
            Me.$Owner().fireAfterLabelEdit(true);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        Me.myOwner = null;
        Me.myRenderer = null;
        Me.myRegisterStartEdit = false;
        Me.myRegisterStopEdit = false;
    }
}
