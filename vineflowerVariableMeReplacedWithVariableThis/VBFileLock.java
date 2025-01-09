package vineflowerVariableMeReplacedWithVariableThis;

import VBA.VBEnumClass;

public class VBFileLock extends VBEnumClass {
   public static final VB.VBFileLock Shared = new VB.VBFileLock(0);
   public static final VB.VBFileLock LockRead = new VB.VBFileLock(1);
   public static final VB.VBFileLock LockWrite = new VB.VBFileLock(2);
   public static final VB.VBFileLock LockReadAndWrite = new VB.VBFileLock(3);

   public VBFileLock() {
   }

   public VBFileLock(int var1) {
      super(var1);
   }

   public VBFileLock(long var1) {
      super(var1);
   }

   public VBFileLock(String var1) {
      super(var1);
   }
}
