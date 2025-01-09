package vineflowerVariableMeReplacedWithVariableThis;

import java.awt.Graphics;
import javax.swing.event.DocumentEvent;

public class RichTextBox$RTTextPane extends VB.RTTextPane {
   int ID;
   VB.RichTextBox Owner;
   int Index;

   public void setOwner(VB.RichTextBox var1, int var2) {
      Owner = var1;
      ID = var2;
      Index = -1;
   }

   @Override
   public void _Modified(VB.MODTYPE h2, DocumentEvent h3) {
      if (1 == ID) {
         Owner.myText_Modified(h2, h3);
      }
   }

   @Override
   public void _Paint(Graphics h2) {
      if (1 == ID) {
         Owner.myText_Paint(h2);
      }
   }
}
