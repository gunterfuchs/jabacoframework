package vineflowerVariableMeReplacedWithVariableThis;

public class Dialog$VBMenuBar extends VB.VBMenuBar {
   int ID;
   VB.Dialog Owner;
   int Index;

   public Dialog$VBMenuBar(VB.IJabacoForm var1) {
      super(var1);
   }

   public void setOwner(VB.Dialog var1, int var2) {
      Owner = var1;
      ID = var2;
      Index = -1;
   }

   @Override
   public void _Click(VB.IMenuItem h2) {
      if (1 == ID) {
         Owner.myMenuBar_Click(h2);
      }
   }
}
