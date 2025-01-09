package vineflowerVariableMeReplacedWithVariableThis;

public class DirListBox$TreeView extends VB.TreeView {
   int ID;
   VB.DirListBox Owner;
   int Index;

   public void setOwner(VB.DirListBox var1, int var2) {
      Owner = var1;
      ID = var2;
      Index = -1;
   }

   @Override
   public void _Click() {
      if (1 == ID) {
         Owner.myTree_Click();
      }
   }

   @Override
   public void _NodeClick(VB.Node h2) {
      if (1 == ID) {
         Owner.myTree_NodeClick(h2);
      }
   }
}
