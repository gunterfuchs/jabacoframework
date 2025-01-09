package vineflowerVariableMeReplacedWithVariableThis;

public class JBCellEditor$TextBox extends VB.TextBox {
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
      if (1 == ID) {
         Owner.myText_KeyDown(h2, h3);
      }
   }
}
