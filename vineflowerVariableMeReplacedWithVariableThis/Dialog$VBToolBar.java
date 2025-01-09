package vineflowerVariableMeReplacedWithVariableThis;

public class Dialog$VBToolBar extends VB.VBToolBar {
   int ID;
   VB.Dialog Owner;
   int Index;

   public Dialog$VBToolBar(VB.IJabacoForm var1) {
      super(var1);
   }

   public void setOwner(VB.Dialog var1, int var2) {
      Owner = var1;
      ID = var2;
      Index = -1;
   }

   @Override
   public void _Click(VB.IToolBarItem h2) {
      if (2 == ID) {
         Owner.myToolBar_Click(h2);
      }
   }
}
