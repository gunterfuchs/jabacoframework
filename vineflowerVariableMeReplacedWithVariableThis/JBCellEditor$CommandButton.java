package vineflowerVariableMeReplacedWithVariableThis;

public class JBCellEditor$CommandButton extends VB.CommandButton {
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
      if (3 == ID) {
         Owner.myButton_Click();
      }
   }
}
