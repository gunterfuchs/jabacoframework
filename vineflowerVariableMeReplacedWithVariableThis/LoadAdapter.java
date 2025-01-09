package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import javax.swing.SwingUtilities;

public class LoadAdapter implements Runnable {
   private VB.ILoadAdapter myContainer;
   private Object mySender;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public LoadAdapter(Object refSender, VB.ILoadAdapter refContainer) {
      Throwable Err = null;
      super();
      initVars();

      try {
         mySender = refSender;
         myContainer = refContainer;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void fireLoaded() {
      Throwable Err = null;

      try {
         if (!SwingUtilities.isEventDispatchThread()) {
            SwingUtilities.invokeAndWait(this);
         } else {
            myContainer.fireLoaded(mySender);
         }
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public void fireLoaded(Object sender) {
      Throwable Err = null;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void run() {
      Throwable Err = null;

      try {
         myContainer.fireLoaded(mySender);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   private void initVars() {
      myContainer = null;
      mySender = null;
   }
}
