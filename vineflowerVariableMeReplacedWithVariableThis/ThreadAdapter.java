package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;

public class ThreadAdapter implements Runnable {
   private Object myTargetObject;
   private String myTargetFunction;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public ThreadAdapter(Object TargetObject, String TargetFunction) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myTargetObject = TargetObject;
         myTargetFunction = TargetFunction;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void run() {
      Throwable Err = null;

      try {
         Interaction.CallByName(myTargetObject, myTargetFunction);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   private void initVars() {
      myTargetObject = null;
      myTargetFunction = "";
   }
}
