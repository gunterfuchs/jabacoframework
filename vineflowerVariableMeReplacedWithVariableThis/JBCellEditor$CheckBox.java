package vineflowerVariableMeReplacedWithVariableThis;

public class JBCellEditor$CheckBox extends VB.CheckBox {
   int ID;
   VB.JBCellEditor Owner;
   int Index;

   public void setOwner(VB.JBCellEditor var1, int var2) {
      Owner = var1;
      ID = var2;
      Index = -1;
   }

   @Override
   public void _Click() {
      if (4 == ID) {
         Owner.myCheck_Click();
      }
   }
}
