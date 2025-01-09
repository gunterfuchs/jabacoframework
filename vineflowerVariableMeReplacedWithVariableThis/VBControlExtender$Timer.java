package vineflowerVariableMeReplacedWithVariableThis;

public class VBControlExtender$Timer extends VB.Timer {
   int ID;
   VB.VBControlExtender Owner;
   int Index;

   public void setOwner(VB.VBControlExtender var1, int var2) {
      Owner = var1;
      ID = var2;
      Index = -1;
   }

   @Override
   public void _Timer() {
      if (1 == ID) {
         Owner.myTimer_Timer();
      }
   }
}
