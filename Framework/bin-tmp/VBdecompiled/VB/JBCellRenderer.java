/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.JBCellData;
import VB.JBGrid;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBVariant;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class JBCellRenderer
extends DefaultTableCellRenderer {
    private JBGrid myGrid;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JBCellRenderer(JBGrid refGrid) {
        JBCellRenderer Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myGrid = refGrid;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        block13: {
            block11: {
                block12: {
                    getTableCellRendererComponent = null;
                    Err = null;
                    myCheck = null;
                    ColSelR = 0;
                    ColSelG = 0;
                    ColSelB = 0;
                    ColBackR = 0;
                    ColBackG = 0;
                    ColBackB = 0;
                    myCellData = null;
                    if (!(value instanceof JBCellData != false)) ** GOTO lbl53
                    myCellData = (JBCellData)value;
                    if (!(Strings.StrComp(myCellData.$Text(), null) != 0)) ** GOTO lbl31
                    if (!(Me.myGrid.$AutoCheckBox() == true & Global.IsStringBoolean(myCellData.$Text()) == true)) ** GOTO lbl28
                    myCheck = new JCheckBox();
                    myCheck.setHorizontalAlignment(0);
                    myCheck.setOpaque(true);
                    myCheck.setBackground(myCellData.getComponent(Me.myGrid, isSelected, hasFocus, row).getBackground());
                    myCheck.setSelected(Global.GetStringAsBoolean(myCellData.$Text()));
                    myCheck.setBorderPainted(hasFocus);
                    if (hasFocus == true) {
                        myCheck.setBorder(UIManager.getBorder("List.focusCellHighlightBorder"));
                    }
                    getTableCellRendererComponent = myCheck;
                    break block12;
lbl28:
                    // 1 sources

                    getTableCellRendererComponent = myCellData.getComponent(Me.myGrid, isSelected, hasFocus, row);
                    break block12;
lbl31:
                    // 1 sources

                    getTableCellRendererComponent = myCellData.getComponent(Me.myGrid, isSelected, hasFocus, row);
                }
                if (!(isSelected == true)) break block11;
                if (!(Me.myGrid.$DataMatrix(row, col).$CellBackColor() != (long)(-1 * 1))) ** GOTO lbl48
                ColSelR = getTableCellRendererComponent.getBackground().getRed();
                ColSelG = getTableCellRendererComponent.getBackground().getGreen();
                ColSelB = getTableCellRendererComponent.getBackground().getBlue();
                ColBackR = (int)((long)((double)Me.myGrid.$DataMatrix(row, col).$CellBackColor() / (double)true) & (long)255);
                ColBackG = (int)((long)((double)Me.myGrid.$DataMatrix(row, col).$CellBackColor() / (double)256) & (long)255);
                ColBackB = (int)((long)((double)Me.myGrid.$DataMatrix(row, col).$CellBackColor() / (double)65536) & (long)255);
                ColSelR = (int)((double)ColSelR / (double)3 * (double)2 + (double)ColBackR / (double)3);
                ColSelG = (int)((double)ColSelG / (double)3 * (double)2 + (double)ColBackG / (double)3);
                ColSelB = (int)((double)ColSelB / (double)3 * (double)2 + (double)ColBackB / (double)3);
                getTableCellRendererComponent.setBackground(Information.RGBtoColor(Information.RGB(ColSelR, ColSelG, ColSelB)));
lbl48:
                // 2 sources

                if (Me.myGrid.$DataMatrix(row, col).$CellForeColor() != (long)(-1 * 1)) {
                    getTableCellRendererComponent.setForeground(Information.RGBtoColor(Me.myGrid.$DataMatrix(row, col).$CellForeColor()));
                }
                break block11;
lbl53:
                // 1 sources

                getTableCellRendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                getTableCellRendererComponent.setBackground(Information.RGBtoColor(Interaction.IIF(isSelected, VBVariant.valueOf(Me.myGrid.$BackColorSel()), Interaction.IIF(row % 2 == 1, VBVariant.valueOf(Me.myGrid.$BackColorCellsAlternating()), VBVariant.valueOf(Me.myGrid.$BackColorCells()))).longValue()));
            }
lbl57:
            // 2 sources

            return getTableCellRendererComponent;
lbl59:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            catch (Throwable v0) {}
            break block13;
            catch (Throwable v0) {}
            break block13;
            finally {
            }
        }
        var9_17 = null;
        Err = v0;
        ** while (true)
    }

    private void initVars() {
        Me.myGrid = null;
    }
}
