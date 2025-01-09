package vineflowerVariableMeReplacedWithVariableThis;

import VBA.VBEnumClass;

public class VbFileAttribute extends VBEnumClass {
   public static final VB.VbFileAttribute vbNormal = new VB.VbFileAttribute(0);
   public static final VB.VbFileAttribute vbReadOnly = new VB.VbFileAttribute(1);
   public static final VB.VbFileAttribute vbHidden = new VB.VbFileAttribute(2);
   public static final VB.VbFileAttribute vbSystem = new VB.VbFileAttribute(4);
   public static final VB.VbFileAttribute vbVolume = new VB.VbFileAttribute(8);
   public static final VB.VbFileAttribute vbDirectory = new VB.VbFileAttribute(16);
   public static final VB.VbFileAttribute vbArchive = new VB.VbFileAttribute(32);
   public static final VB.VbFileAttribute vbAlias = new VB.VbFileAttribute(64);

   public VbFileAttribute() {
   }

   public VbFileAttribute(int var1) {
      super(var1);
   }

   public VbFileAttribute(long var1) {
      super(var1);
   }

   public VbFileAttribute(String var1) {
      super(var1);
   }
}
