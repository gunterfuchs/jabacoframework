package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import java.awt.Component;
import java.util.EventObject;
import javax.swing.JTree;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;

public class TreeViewEditor extends DefaultTreeCellEditor implements CellEditorListener {
   private VB.TreeView myOwner;
   private DefaultTreeCellRenderer myRenderer;
   private boolean myRegisterStartEdit;
   private boolean myRegisterStopEdit;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public DefaultTreeCellEditor $Parent() {
      DefaultTreeCellEditor $Parent = null;
      Throwable Err = null;

      try {
         $Parent = this;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.TreeView $Owner() {
      VB.TreeView $Owner = null;
      Throwable Err = null;

      try {
         $Owner = myOwner;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Owner;
      }

      return $Owner;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Owner(VB.TreeView tree) {
      Throwable Err = null;

      try {
         myOwner = tree;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public TreeViewEditor(JTree tree, DefaultTreeCellRenderer renderer) {
      Throwable Err = null;
      super(tree, renderer);
      initVars();

      try {
         myRenderer = renderer;
         $Parent().addCellEditorListener(this);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void registerStartEdit() {
      Throwable Err = null;

      try {
         myRegisterStartEdit = true;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void registerStopEdit() {
      Throwable Err = null;

      try {
         myRegisterStopEdit = true;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean isCellEditable(EventObject anEvent) {
      boolean isCellEditable = false;
      Throwable Err = null;
      boolean MemRegisterStartEdit = false;

      try {
         MemRegisterStartEdit = myRegisterStartEdit;
         myRegisterStartEdit = false;
         if (myOwner != null) {
            if (!(myOwner.$LabelEdit().compareTo(VB.LabelEditConstants.lvwAutomatic) == 0 | MemRegisterStartEdit)) {
               isCellEditable = false;
            } else {
               myRegisterStopEdit = false;
               $Owner().fireBeforeLabelEdit();
               if (!myRegisterStopEdit) {
                  isCellEditable = super.isCellEditable(anEvent);
               } else {
                  isCellEditable = false;
               }
            }
         } else {
            isCellEditable = super.isCellEditable(anEvent);
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return isCellEditable;
      }

      return isCellEditable;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Component getTreeCellEditorComponent(JTree pTree, Object pValue, boolean pIsSelected, boolean pIsExpanded, boolean pIsLeaf, int pRow) {
      Component getTreeCellEditorComponent = null;
      Throwable Err = null;

      try {
         getTreeCellEditorComponent = super.getTreeCellEditorComponent(pTree, pValue, pIsSelected, pIsExpanded, pIsLeaf, pRow);
      } catch (Throwable var11) {
         Interaction.MsgBox(var11);
         return getTreeCellEditorComponent;
      }

      return getTreeCellEditorComponent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void editingStopped(ChangeEvent arg2) {
      Throwable Err = null;

      try {
         $Owner().fireAfterLabelEdit(false);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void editingCanceled(ChangeEvent arg2) {
      Throwable Err = null;

      try {
         $Owner().fireAfterLabelEdit(true);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   private void initVars() {
      myOwner = null;
      myRenderer = null;
      myRegisterStartEdit = false;
      myRegisterStopEdit = false;
   }
}
