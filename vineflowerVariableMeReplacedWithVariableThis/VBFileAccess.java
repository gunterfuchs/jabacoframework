package vineflowerVariableMeReplacedWithVariableThis;

import VBA.VBEnumClass;

public class VBFileAccess extends VBEnumClass {
   public static final VB.VBFileAccess Read = new VB.VBFileAccess(0);
   public static final VB.VBFileAccess Write = new VB.VBFileAccess(1);
   public static final VB.VBFileAccess ReadAndWrite = new VB.VBFileAccess(2);

   public VBFileAccess() {
   }

   public VBFileAccess(int var1) {
      super(var1);
   }

   public VBFileAccess(long var1) {
      super(var1);
   }

   public VBFileAccess(String var1) {
      super(var1);
   }
}
