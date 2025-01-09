package vineflowerVariableMeReplacedWithVariableThis;

import java.awt.Color;
import java.awt.Font;

public interface IListCellDataOwner {
   void $BackColorSel(long var1);

   long $BackColorSel();

   long $BackColorAlternating();

   void $MarginItem(long var1);

   long $MarginItem();

   void $BorderColorSel(long var1);

   long $BorderColorSel();

   long $ForeColorSel();

   void $ForeColorSel(long var1);

   Font getFont();

   Color getSelectionBackground();

   Color getSelectionForeground();

   Color getBackground();

   Color getForeground();

   void Refresh();
}
