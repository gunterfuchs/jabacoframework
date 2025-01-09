package vineflowerVariableMeReplacedWithVariableThis;

public class JBCellEditor$ComboBox extends VB.ComboBox {
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
      if (2 == ID) {
         Owner.myCombo_Click();
      }
   }
}
