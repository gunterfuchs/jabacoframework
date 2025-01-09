package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import javax.swing.DefaultListModel;

public class ListBoxModel extends DefaultListModel {
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void fireChangeEvent(int fromIndex, int toIndex) {
      Throwable Err = null;

      try {
         super.fireContentsChanged(this, fromIndex, toIndex);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   public ListBoxModel() {
      initVars();
   }

   private void initVars() {
   }
}
