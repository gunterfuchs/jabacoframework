package vineflowerVariableMeReplacedWithVariableThis;

public class Applet$VBToolBar extends VB.VBToolBar {
   int ID;
   VB.Applet Owner;
   int Index;

   public Applet$VBToolBar(VB.IJabacoForm var1) {
      super(var1);
   }

   public void setOwner(VB.Applet var1, int var2) {
      Owner = var1;
      ID = var2;
      Index = -1;
   }

   @Override
   public void _Visible(boolean h2) {
      if (2 == ID) {
         Owner.myToolBar_Visible(h2);
      }
   }

   @Override
   public void _Click(VB.IToolBarItem h2) {
      if (2 == ID) {
         Owner.myToolBar_Click(h2);
      }
   }
}
