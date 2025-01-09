package vineflowerVariableMeReplacedWithVariableThis;

import VBA.VBEnumClass;

public class SelectionModeSettings extends VBEnumClass {
   public static final VB.SelectionModeSettings flexSelectionFree = new VB.SelectionModeSettings(0);
   public static final VB.SelectionModeSettings flexSelectionByRow = new VB.SelectionModeSettings(1);
   public static final VB.SelectionModeSettings flexSelectionByColumn = new VB.SelectionModeSettings(2);

   public SelectionModeSettings() {
   }

   public SelectionModeSettings(int var1) {
      super(var1);
   }

   public SelectionModeSettings(long var1) {
      super(var1);
   }

   public SelectionModeSettings(String var1) {
      super(var1);
   }
}
