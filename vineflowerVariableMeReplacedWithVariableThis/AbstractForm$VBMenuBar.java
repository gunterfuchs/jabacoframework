package vineflowerVariableMeReplacedWithVariableThis;

public class AbstractForm$VBMenuBar extends VB.VBMenuBar {
   int ID;
   VB.AbstractForm Owner;
   int Index;

   public AbstractForm$VBMenuBar(VB.IJabacoForm var1) {
      super(var1);
   }

   public void setOwner(VB.AbstractForm var1, int var2) {
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
