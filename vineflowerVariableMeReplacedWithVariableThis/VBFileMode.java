package vineflowerVariableMeReplacedWithVariableThis;

import VBA.VBEnumClass;

public class VBFileMode extends VBEnumClass {
   public static final VB.VBFileMode Random = new VB.VBFileMode(0);
   public static final VB.VBFileMode Binary = new VB.VBFileMode(1);
   public static final VB.VBFileMode Append = new VB.VBFileMode(2);
   public static final VB.VBFileMode Input = new VB.VBFileMode(3);
   public static final VB.VBFileMode Output = new VB.VBFileMode(4);

   public VBFileMode() {
   }

   public VBFileMode(int var1) {
      super(var1);
   }

   public VBFileMode(long var1) {
      super(var1);
   }

   public VBFileMode(String var1) {
      super(var1);
   }
}
