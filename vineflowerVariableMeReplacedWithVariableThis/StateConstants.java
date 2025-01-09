package vineflowerVariableMeReplacedWithVariableThis;

import VBA.VBEnumClass;

public class StateConstants extends VBEnumClass {
   public static final VB.StateConstants sckClosed = new VB.StateConstants(0);
   public static final VB.StateConstants sckOpen = new VB.StateConstants(1);
   public static final VB.StateConstants sckListening = new VB.StateConstants(2);
   public static final VB.StateConstants sckConnectionPending = new VB.StateConstants(3);
   public static final VB.StateConstants sckResolvingHost = new VB.StateConstants(4);
   public static final VB.StateConstants sckHostResolved = new VB.StateConstants(5);
   public static final VB.StateConstants sckConnecting = new VB.StateConstants(6);
   public static final VB.StateConstants sckConnected = new VB.StateConstants(7);
   public static final VB.StateConstants sckClosing = new VB.StateConstants(8);
   public static final VB.StateConstants sckError = new VB.StateConstants(9);

   public StateConstants() {
   }

   public StateConstants(int var1) {
      super(var1);
   }

   public StateConstants(long var1) {
      super(var1);
   }

   public StateConstants(String var1) {
      super(var1);
   }
}
