package vineflowerVariableMeReplacedWithVariableThis;

public class AbstractForm$VBToolBar extends VB.VBToolBar {
   int ID;
   VB.AbstractForm Owner;
   int Index;

   public AbstractForm$VBToolBar(VB.IJabacoForm var1) {
      super(var1);
   }

   public void setOwner(VB.AbstractForm var1, int var2) {
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
