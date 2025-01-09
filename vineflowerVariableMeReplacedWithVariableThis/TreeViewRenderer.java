package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Information;
import VBA.Interaction;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

public class TreeViewRenderer extends DefaultTreeCellRenderer {
   private VB.TreeView myTree;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public TreeViewRenderer(VB.TreeView refTreeView) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myTree = refTreeView;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   @Override
   public Component getTreeCellRendererComponent(
      JTree pTree, Object pValue, boolean pIsSelected, boolean pIsExpanded, boolean pIsLeaf, int pRow, boolean pHasFocus
   ) {
      Component getTreeCellRendererComponent = null;
      Throwable Err = null;

      label143: {
         try {
            super.getTreeCellRendererComponent(pTree, pValue, pIsSelected, pIsExpanded, pIsLeaf, pRow, pHasFocus);
         } finally {
            break label143;
         }

         VB.Node myNode = (VB.Node)pValue;

         label134:
         try {
            if (myNode != null && myTree != null) {
               setText(myNode.$Text());
               setBackground(Information.RGBtoColor(myTree.$BackColor()));
               setBackgroundNonSelectionColor(Information.RGBtoColor(myNode.$BackColor()));
               setBackgroundSelectionColor(Information.RGBtoColor(myNode.$BackColorSel()));
               if (!pIsSelected) {
                  setForeground(Information.RGBtoColor(myNode.$ForeColor()));
               } else {
                  setForeground(Information.RGBtoColor(myNode.$ForeColorSel()));
               }

               if (!usePicture(myTree)) {
                  setClosedIcon(null);
                  setOpenIcon(null);
                  setLeafIcon(null);
                  setIcon(null);
                  setDisabledIcon(null);
               } else if (myNode.GetIcon(VB.TreeIconEnum.TreeIconDefault) != null) {
                  setIcon(myNode.GetIcon(VB.TreeIconEnum.TreeIconDefault));
                  setDisabledIcon(myNode.GetIcon(VB.TreeIconEnum.TreeIconDisabled));
               } else {
                  setClosedIcon(myNode.GetIcon(VB.TreeIconEnum.TreeIconClosed));
                  setOpenIcon(myNode.GetIcon(VB.TreeIconEnum.TreeIconOpen));
                  setLeafIcon(myNode.GetIcon(VB.TreeIconEnum.TreeIconLeaf));
               }

               setFont(myNode.$Font());
            }

            getTreeCellRendererComponent = this;
            return getTreeCellRendererComponent;
         } finally {
            break label134;
         }
      }

      Interaction.MsgBox((Throwable)Err);
      return getTreeCellRendererComponent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean usePicture(VB.TreeView refTree) {
      boolean usePicture = false;
      Throwable Err = null;
      new VB.TreeStyleConstants();
      VB.TreeStyleConstants h6 = null;

      try {
         h6 = refTree.$Style();
         if (h6.compareTo(VB.TreeStyleConstants.tvwPictureText) != 0
            && h6.compareTo(VB.TreeStyleConstants.tvwPlusPictureText) != 0
            && h6.compareTo(VB.TreeStyleConstants.tvwTreelinesPictureText) != 0
            && h6.compareTo(VB.TreeStyleConstants.tvwTreelinesPlusMinusPictureText) != 0) {
            usePicture = false;
         } else {
            usePicture = true;
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return usePicture;
      }

      return usePicture;
   }

   private void initVars() {
      myTree = null;
   }
}
