/*
 * Decompiled with CFR 0.152.
 */
package VB;

import java.awt.Color;
import java.awt.Font;

public interface IListCellDataOwner {
    public void $BackColorSel(long var1);

    public long $BackColorSel();

    public long $BackColorAlternating();

    public void $MarginItem(long var1);

    public long $MarginItem();

    public void $BorderColorSel(long var1);

    public long $BorderColorSel();

    public long $ForeColorSel();

    public void $ForeColorSel(long var1);

    public Font getFont();

    public Color getSelectionBackground();

    public Color getSelectionForeground();

    public Color getBackground();

    public Color getForeground();

    public void Refresh();
}
