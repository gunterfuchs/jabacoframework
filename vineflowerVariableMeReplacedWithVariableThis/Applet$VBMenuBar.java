package vineflowerVariableMeReplacedWithVariableThis;

public class Applet$VBMenuBar extends VB.VBMenuBar {
   int ID;
   VB.Applet Owner;
   int Index;

   public Applet$VBMenuBar(VB.IJabacoForm var1) {
      super(var1);
   }

   public void setOwner(VB.Applet var1, int var2) {
      Owner = var1;
      ID = var2;
      Index = -1;
   }

   @Override
   public void _Visible(boolean h2) {
      if (1 == ID) {
         Owner.myMenuBar_Visible(h2);
      }
   }

   @Override
   public void _Click(VB.IMenuItem h2) {
      if (1 == ID) {
         Owner.myMenuBar_Click(h2);
      }
   }
}
