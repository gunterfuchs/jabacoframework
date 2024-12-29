/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VB.IListCellDataOwner;
import VB.ListCellData;
import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class ListCellDataRenderer
extends DefaultListCellRenderer
implements IJabacoClass {
    private IListCellDataOwner myOwner;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ListCellDataRenderer(IListCellDataOwner owner) {
        ListCellDataRenderer Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myOwner = owner;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Component getListCellRendererComponent(JList List2, Object Value, int Index, boolean IsSelected, boolean CellHasFocus) {
        Object var8_10;
        ListCellDataRenderer Me;
        Throwable Err;
        Component getListCellRendererComponent;
        block33: {
            ListCellData tmpCellData;
            block37: {
                block36: {
                    block38: {
                        block35: {
                            block34: {
                                Component tmpComponent;
                                block32: {
                                    getListCellRendererComponent = null;
                                    Err = null;
                                    tmpComponent = null;
                                    tmpCellData = (ListCellData)Value;
                                    try {
                                        if (tmpCellData != null & Me.myOwner != null) break block32;
                                        break block33;
                                    }
                                    catch (Throwable throwable) {
                                        var8_10 = null;
                                        Err = throwable;
                                    }
                                }
                                try {
                                    if (Index > -1 * 1) {
                                        tmpComponent = (Component)Interaction.IIF(tmpCellData.$Icon() == null & !tmpCellData.$AsCheckBox(), VBVariant.valueOf(Me), new VBVariant(null)).toObject();
                                    }
                                }
                                catch (Throwable throwable) {
                                    var8_10 = null;
                                    Err = throwable;
                                }
                                try {
                                    getListCellRendererComponent = tmpCellData.getComponent(Me.myOwner, tmpComponent, IsSelected, CellHasFocus);
                                }
                                catch (Throwable throwable) {
                                    var8_10 = null;
                                    Err = throwable;
                                }
                                if (Index % 2 == 1) break block34;
                                return getListCellRendererComponent;
                            }
                            if (!IsSelected) break block35;
                            return getListCellRendererComponent;
                        }
                        catch (Throwable throwable) {
                            var8_10 = null;
                            Err = throwable;
                        }
                        break block38;
                        catch (Throwable throwable) {
                            var8_10 = null;
                            Err = throwable;
                        }
                    }
                    try {
                        if (Me.myOwner.$BackColorAlternating() == (long)0) break block36;
                        break block37;
                    }
                    catch (Throwable throwable) {
                        var8_10 = null;
                        Err = throwable;
                    }
                }
                try {
                    try {
                        getListCellRendererComponent.setBackground(tmpCellData.$Owner().getBackground());
                        return getListCellRendererComponent;
                    }
                    catch (Throwable throwable) {
                        var8_10 = null;
                        Err = throwable;
                        return getListCellRendererComponent;
                    }
                }
                catch (Throwable throwable) {
                    var8_10 = null;
                    Err = throwable;
                }
            }
            try {
                try {
                    try {
                        getListCellRendererComponent.setBackground(Information.RGBtoColor(tmpCellData.$Owner().$BackColorAlternating()));
                    }
                    catch (Throwable throwable) {
                        var8_10 = null;
                        Err = throwable;
                        return getListCellRendererComponent;
                    }
                }
                catch (Throwable throwable) {
                    var8_10 = null;
                    Err = throwable;
                    return getListCellRendererComponent;
                }
            }
            catch (Throwable throwable) {
                var8_10 = null;
                Err = throwable;
            }
        }
        try {
            getListCellRendererComponent = super.getListCellRendererComponent((JList<?>)List2, Value, Index, IsSelected, CellHasFocus);
            return getListCellRendererComponent;
        }
        catch (Throwable throwable) {
            var8_10 = null;
            Err = throwable;
            return getListCellRendererComponent;
        }
    }

    private void initVars() {
        Me.myOwner = null;
    }
}
