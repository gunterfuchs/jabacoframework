package vineflowerVariableMeReplacedWithVariableThis;

import java.awt.Graphics;

public class Form$PictureBox extends VB.PictureBox {
   int ID;
   VB.Form Owner;
   int Index;

   public void setOwner(VB.Form var1, int var2) {
      Owner = var1;
      ID = var2;
      Index = -1;
   }

   @Override
   public void _Click() {
      if (1 == ID) {
         Owner.myContent_Click();
      }
   }

   @Override
   public void _DblClick() {
      if (1 == ID) {
         Owner.myContent_DblClick();
      }
   }

   @Override
   public void _KeyDown(int h2, int h3) {
      if (1 == ID) {
         Owner.myContent_KeyDown(h2, h3);
      }
   }

   @Override
   public void _KeyPress(int h2) {
      if (1 == ID) {
         Owner.myContent_KeyPress(h2);
      }
   }

   @Override
   public void _KeyUp(int h2, int h3) {
      if (1 == ID) {
         Owner.myContent_KeyUp(h2, h3);
      }
   }

   @Override
   public void _MouseDown(int h2, int h3, float h4, float h5) {
      if (1 == ID) {
         Owner.myContent_MouseDown(h2, h3, h4, h5);
      }
   }

   @Override
   public void _MouseMove(int h2, int h3, float h4, float h5) {
      if (1 == ID) {
         Owner.myContent_MouseMove(h2, h3, h4, h5);
      }
   }

   @Override
   public void _MouseUp(int h2, int h3, float h4, float h5) {
      if (1 == ID) {
         Owner.myContent_MouseUp(h2, h3, h4, h5);
      }
   }

   @Override
   public void _Paint(Graphics h2) {
      if (1 == ID) {
         Owner.myContent_Paint(h2);
      }
   }
}
