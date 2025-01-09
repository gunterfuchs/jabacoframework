package vineflowerVariableMeReplacedWithVariableThis;

import VBA.VBEnumClass;

public class JBEditable extends VBEnumClass {
   public static final VB.JBEditable jbNotEditable = new VB.JBEditable(0);
   public static final VB.JBEditable jbEditOnClick = new VB.JBEditable(1);
   public static final VB.JBEditable jbEditOnDblClick = new VB.JBEditable(2);

   public JBEditable() {
   }

   public JBEditable(int var1) {
      super(var1);
   }

   public JBEditable(long var1) {
      super(var1);
   }

   public JBEditable(String var1) {
      super(var1);
   }
}
