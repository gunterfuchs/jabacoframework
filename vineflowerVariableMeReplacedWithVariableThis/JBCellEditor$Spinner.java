package vineflowerVariableMeReplacedWithVariableThis;

public class JBCellEditor$Spinner extends VB.Spinner {
   int ID;
   VB.JBCellEditor Owner;
   int Index;

   public void setOwner(VB.JBCellEditor var1, int var2) {
      Owner = var1;
      ID = var2;
      Index = -1;
   }

   @Override
   public void _KeyDown(int h2, int h3) {
      if (5 == ID) {
         Owner.mySpinner_KeyDown(h2, h3);
      }
   }
}
