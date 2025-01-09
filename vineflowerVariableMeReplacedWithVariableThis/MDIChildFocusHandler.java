package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import VBA.Strings;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JInternalFrame;

public class MDIChildFocusHandler implements PropertyChangeListener {
   private VB.MDIChild myMDIChild;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public MDIChildFocusHandler(VB.MDIChild refMDIChild) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myMDIChild = refMDIChild;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   @Override
   public void propertyChange(PropertyChangeEvent arg2) {
      Throwable Err = null;
      String propertyName = "";

      label385: {
         label380:
         try {
            if (VB.Global.$GlobalMDIForm() == null) {
               break label385;
            }
         } finally {
            break label380;
         }

         propertyName = arg2.getPropertyName();

         label387: {
            label371:
            try {
               if (Strings.StrComp(propertyName, JInternalFrame.IS_SELECTED_PROPERTY) != 0) {
                  break label387;
               }
            } finally {
               break label371;
            }

            label368:
            try {
               if (VB.Global.GetStringAsBoolean(arg2.getOldValue().toString())) {
                  myMDIChild.Form_LostFocus();
               }
            } finally {
               break label368;
            }

            label363:
            try {
               if (myMDIChild.isSelected()) {
                  myMDIChild.Form_GotFocus();
               }
            } finally {
               break label363;
            }
         }

         label361:
         try {
            ;
         } finally {
            break label361;
         }
      }

      try {
         ;
      } finally {
         return;
      }
   }

   private void initVars() {
      myMDIChild = null;
   }
}
