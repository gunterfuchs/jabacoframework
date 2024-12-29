/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.JBGrid;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class JBHeaderRenderer
extends DefaultTableCellRenderer {
    private JBGrid myGrid;
    private int myColumn;
    private IResource myHeaderIcon;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JBHeaderRenderer(JBGrid refGrid) {
        JBHeaderRenderer Me;
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Border getMarginBorder(Border refBorder, int LeftMargin, int RightMargin) {
        Border getMarginBorder = null;
        Throwable Err = null;
        try {
            return new CompoundBorder(refBorder, new EmptyBorder(0, LeftMargin, 0, RightMargin));
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getMarginBorder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        Component getTableCellRendererComponent = null;
        Throwable Err = null;
        Component myBaseComponent = null;
        try {
            JBHeaderRenderer Me;
            myBaseComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
            Me.myHeaderIcon = Me.myGrid.$HeaderIcon(col);
            Me.myColumn = col;
            if (!Me.myGrid.$FlatHeader()) {
                super.setBorder(Me.getMarginBorder(BorderFactory.createRaisedBevelBorder(), 1, 0));
            } else {
                super.setBorder(Me.getMarginBorder(BorderFactory.createEtchedBorder(), 1, 0));
            }
            super.setHorizontalAlignment(Me.myGrid.$HeaderAlign(col).intValue());
            super.setFont(myBaseComponent.getFont());
            super.setBackground(Information.RGBtoColor(Me.myGrid.$BackColorHeader()));
            super.setForeground(Information.RGBtoColor(Me.myGrid.$ForeColorHeader()));
            super.setPreferredSize(new Dimension((int)super.getPreferredSize().getWidth(), Me.myGrid.$HeaderHeight()));
            return Me;
        }
        catch (Throwable throwable) {
            Object var9_10 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getTableCellRendererComponent;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void paint(Graphics g) {
        block17: {
            block21: {
                block20: {
                    block19: {
                        block18: {
                            block16: {
                                block15: {
                                    Err = null;
                                    g2 = null;
                                    gradientPaint = null;
                                    myHeaderImage = null;
                                    c = null;
                                    SortIndicatorTop = 0;
                                    SortIndicatorLeft = 0;
                                    super.setOpaque(false);
                                    if (!Me.myGrid.$GradientHeader()) ** GOTO lbl27
                                    g.setColor(Information.RGBtoColor(Me.myGrid.$GridColor()));
                                    g.fillRect(0, 0, Me.myGrid.$Parent().getColumnModel().getTotalColumnWidth(), super.getHeight());
                                    if (!Me.myGrid.$FlatHeader()) break block15;
                                    g.setColor(Information.RGBtoColor(Me.myGrid.$BackColorHeader()));
                                    g.fillRect(0, 0, super.getWidth() - 1, super.getHeight() - 1);
                                    break block16;
                                }
                                g2 = (Graphics2D)g;
                                gradientPaint = new GradientPaint((float)false, (float)((double)Me.myGrid.$HeaderHeight() / (double)100 * (double)5), new Color(0xFFFFFF), (float)false, Me.myGrid.$HeaderHeight(), Information.RGBtoColor(Me.myGrid.$BackColorHeader()), false);
                                g2.setPaint(gradientPaint);
                                g2.fillRect(0, 0, super.getWidth() - 1, super.getHeight() - 1);
                                break block16;
lbl27:
                                // 1 sources

                                g.setColor(Information.RGBtoColor(Me.myGrid.$BackColorHeader()));
                                super.paintBorder(g);
                            }
                            myRightMargin = Interaction.IIF(Me.myGrid.$ColHeaderIndex() == Me.myColumn, VBVariant.valueOf(15), VBVariant.valueOf(4)).intValue();
                            if (!(Me.myHeaderIcon != null)) ** GOTO lbl40
                            myHeaderImage = Global.LoadPicture(Me.myHeaderIcon);
                            super.setBorder(new EmptyBorder(0, myHeaderImage.getWidth(null) + 5, 0, myRightMargin));
                            g.drawImage(myHeaderImage, 3, (int)((double)super.getHeight() / (double)2 - (double)myHeaderImage.getHeight(null) / (double)2), null);
                            break block18;
lbl40:
                            // 1 sources

                            super.setBorder(new EmptyBorder(0, 3, 0, myRightMargin));
                        }
                        if (!(Me.myGrid.$ShowSortIndicator() == true) || !(Me.myColumn == Me.myGrid.$ColHeaderIndex())) ** GOTO lbl67
                        c = Information.RGBtoColor(Me.myGrid.$GridColor());
                        g.setColor(c);
                        SortIndicatorTop = (int)((double)super.getHeight() / (double)2);
                        SortIndicatorLeft = super.getWidth();
                        if (Me.myGrid.$SortIndicatorIndex() == 0) break block19;
                        if (Me.myGrid.$SortIndicatorIndex() == 1) break block20;
                        break block21;
                    }
                    g.drawLine(SortIndicatorLeft - 5, SortIndicatorTop - 2, (int)((double)SortIndicatorLeft - (double)15 / (double)2), SortIndicatorTop + 2);
                    g.setColor(c.darker());
                    g.drawLine(SortIndicatorLeft - 10, SortIndicatorTop - 2, SortIndicatorLeft - 6, SortIndicatorTop - 2);
                    g.drawLine(SortIndicatorLeft - 11, SortIndicatorTop - 2, (int)((double)SortIndicatorLeft - (double)15 / (double)2), SortIndicatorTop + 2);
                    break block21;
                }
                g.drawLine(SortIndicatorLeft - 5, SortIndicatorTop + 2, (int)((double)SortIndicatorLeft - (double)15 / (double)2), SortIndicatorTop - 2);
                g.setColor(c.darker());
                g.drawLine(SortIndicatorLeft - 10, SortIndicatorTop + 2, SortIndicatorLeft - 6, SortIndicatorTop + 2);
                g.drawLine(SortIndicatorLeft - 11, SortIndicatorTop + 2, (int)((double)SortIndicatorLeft - (double)15 / (double)2), SortIndicatorTop - 2);
            }
            super.paintComponent(g);
lbl69:
            // 1 sources

            return;
lbl71:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            catch (Throwable v0) {
                break block17;
            }
            catch (Throwable v0) {}
            break block17;
            catch (Throwable v0) {
                break block17;
            }
            catch (Throwable v0) {}
            break block17;
            catch (Throwable v0) {
                break block17;
            }
            finally {
            }
        }
        var3_10 = null;
        Err = v0;
        ** while (true)
    }

    private void initVars() {
        Me.myGrid = null;
        Me.myColumn = 0;
        Me.myHeaderIcon = null;
    }
}
