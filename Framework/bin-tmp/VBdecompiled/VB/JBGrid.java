/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AnchorStyles;
import VB.Global;
import VB.IJabacoControl;
import VB.JBCellData;
import VB.JBCellEditor;
import VB.JBCellEditorComponent;
import VB.JBCellRenderer;
import VB.JBEditable;
import VB.JBGridModel;
import VB.JBHeaderRenderer;
import VB.SelectionModeSettings;
import VB.fmBorderStyle;
import VB.fmSpecialEffect;
import VB.fmTextAlign;
import VB.jbAutoResize;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class JBGrid
extends JScrollPane
implements IJabacoControl,
MouseListener,
MouseMotionListener,
KeyListener,
FocusListener {
    private JBGridModel myModel;
    private JTable myTable;
    private JBHeaderRenderer myHeaderRenderer;
    private JBCellRenderer myRenderer;
    private JBCellEditor myCellEditor;
    private boolean myAutoCheckBox;
    private IResource myHeaderIcon;
    private boolean myFlatHeader;
    private boolean myGradientHeader;
    private long myBackColorHeader;
    private fmBorderStyle myBorderStyle;
    private fmSpecialEffect mySpecialEffect;
    private int myColHeaderIndex;
    private boolean myShowSortIndicator;
    private int mySortIndicatorIndex;
    private int myHeaderHeight;
    private long myBorderColorSel;
    private long myBorderColor;
    private long myBackColorCells;
    private long myBackColorCellsAlternating;
    private String myTag;
    private String myComboList;
    private JBEditable myEditable;
    private AnchorStyles myAnchor;
    private float mySavedWidth;
    private float mySavedHeight;
    private float mySavedLeft;
    private float mySavedTop;
    private float hostSavedWidth;
    private float hostSavedHeight;
    private boolean isResizeTriggerInitialized;
    private boolean isLeftInitialized;
    private boolean isTopInitialized;

    public void _Click() {
    }

    public void _DblClick() {
    }

    public void _GotFocus() {
    }

    public void _ColHeaderClick() {
    }

    public void _KeyDown(int KeyCode, int Shift) {
    }

    public void _KeyPress(int KeyAscii) {
    }

    public void _KeyUp(int KeyCode, int Shift) {
    }

    public void _LostFocus() {
    }

    public void _MouseEntered() {
    }

    public void _MouseExited() {
    }

    public void _MouseDown(int Button, int Shift, float X, float Y) {
    }

    public void _MouseMove(int Button, int Shift, float X, float Y) {
    }

    public void _MouseUp(int Button, int Shift, float X, float Y) {
    }

    public void _Paint(Graphics g) {
    }

    public void _RowColChange() {
    }

    public void _BeforeCellEdit(int row, int col) {
    }

    public void _AfterCellEdit(int row, int col) {
    }

    public void _CellButtonClick() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JTable $Parent() {
        JTable $Parent = null;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myTable;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable throwable2;
        Throwable Err;
        block5: {
            Object tmpObject;
            JBGrid Me;
            Err = null;
            try {
                Me.myModel = new JBGridModel(Me);
                Me.myTable = new JTable(Me.myModel);
                Me.myHeaderRenderer = new JBHeaderRenderer(Me);
                Me.myRenderer = new JBCellRenderer(Me);
                Me.myCellEditor = new JBCellEditor(Me);
                Me.$Parent().addFocusListener(Me);
                super.setViewportView(Me.myTable);
                Me.$Parent().addMouseListener(Me);
                Me.$Parent().getTableHeader().addMouseListener(Me);
                Me.$Parent().addMouseMotionListener(Me);
                Me.$Parent().addKeyListener(Me);
                tmpObject = new Object();
            }
            catch (Throwable throwable2) {
                break block5;
            }
            Me.$Parent().getTableHeader().setDefaultRenderer(Me.myHeaderRenderer);
            Me.$Parent().setDefaultRenderer(tmpObject.getClass(), Me.myRenderer);
            Me.$Parent().setDefaultEditor(tmpObject.getClass(), Me.myCellEditor);
            Me.$Parent().getTableHeader().setReorderingAllowed(false);
            Me.$Parent().setDoubleBuffered(true);
            super.setDoubleBuffered(true);
            super.setIgnoreRepaint(false);
        }
        Object var2_3 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void focusGained(FocusEvent arg2) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._GotFocus();
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
    @Override
    public void focusLost(FocusEvent arg2) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._LostFocus();
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
    @Override
    public void mouseMoved(MouseEvent e) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._MouseMove(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
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
    @Override
    public void mouseDragged(MouseEvent e) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._MouseMove(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
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
    @Override
    public void mousePressed(MouseEvent e) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._MouseDown(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
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
    @Override
    public void mouseReleased(MouseEvent e) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._MouseUp(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
            if (e.getX() > 0 & e.getY() > 0 & (double)e.getX() < Me.$Parent().getBounds().getWidth() & (double)e.getY() < Me.$Parent().getBounds().getHeight() && Me.$Parent().getTableHeader().getMousePosition() == null) {
                if (!(e.getClickCount() % 2 == 0)) {
                    Me._Click();
                } else {
                    Me._DblClick();
                }
            }
            Me.$CellEditor().$Component(JBCellEditorComponent.JBTextBox);
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
    @Override
    public void mouseClicked(MouseEvent e) {
        Throwable Err = null;
        try {
            JBGrid Me;
            block4: {
                boolean bl;
                block8: {
                    block6: {
                        block7: {
                            block5: {
                                if (Me.$Parent().getTableHeader().getMousePosition() == null) {
                                    return;
                                }
                                boolean bl2 = true;
                                if (!bl2) {
                                    return;
                                }
                                if (!Me.myShowSortIndicator) break block4;
                                if (Me.$Parent().getTableHeader().columnAtPoint(Me.$Parent().getTableHeader().getMousePosition()) == -1 * 1) break block5;
                                if (Me.$ColHeaderIndex() == Me.$Parent().getTableHeader().columnAtPoint(Me.$Parent().getTableHeader().getMousePosition())) break block6;
                                break block7;
                            }
                            Me.mySortIndicatorIndex = -1 * 1;
                            break block4;
                        }
                        bl = false;
                        break block8;
                    }
                    bl = true;
                }
                Me.mySortIndicatorIndex = !bl ? 0 : (!(Me.mySortIndicatorIndex == 0) ? 0 : 1);
            }
            Me.$ColHeaderIndex(Me.$Parent().getTableHeader().columnAtPoint(Me.$Parent().getTableHeader().getMousePosition()));
            Me.$Parent().getTableHeader().repaint();
            Me._ColHeaderClick();
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
    @Override
    public void mouseEntered(MouseEvent e) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._MouseEntered();
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
    @Override
    public void mouseExited(MouseEvent e) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._MouseExited();
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
    @Override
    public void keyReleased(KeyEvent e) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._KeyUp(e.getKeyCode(), Global.KeyEventToShiftConstant(e));
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
    @Override
    public void keyTyped(KeyEvent e) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._KeyPress(e.getKeyChar());
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
    @Override
    public void keyPressed(KeyEvent e) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._KeyDown(e.getKeyCode(), Global.KeyEventToShiftConstant(e));
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
    public boolean $ShowSortIndicator() {
        boolean $ShowSortIndicator = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myShowSortIndicator;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ShowSortIndicator;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ShowSortIndicator(boolean v) {
        Throwable Err = null;
        try {
            Me.myShowSortIndicator = v;
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
    public int $SortIndicatorIndex() {
        int $SortIndicatorIndex = 0;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.mySortIndicatorIndex;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $SortIndicatorIndex;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $SortIndicatorIndex(int v) {
        Throwable Err = null;
        try {
            Me.mySortIndicatorIndex = v;
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
    public void StartEdit(int row, int col) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().editCellAt(row, col);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void StopEdit() {
        Throwable Err = null;
        try {
            JBGrid Me;
            if (Me.myModel.registerStopEditEvent()) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.myCellEditor.stopCellEditing();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBVariant isCellSelected(int row, int col) {
        VBVariant isCellSelected = new VBVariant();
        Throwable Err = null;
        try {
            JBGrid Me;
            return VBVariant.valueOf(Me.$Parent().isCellSelected(row, col));
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return isCellSelected;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BorderColorSel() {
        long $BorderColorSel = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myBorderColorSel;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BorderColorSel;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BorderColorSel(long v) {
        Throwable Err = null;
        try {
            Me.myBorderColorSel = v;
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $GridColor() {
        long $GridColor = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Information.ColorToRGB(Me.$Parent().getGridColor());
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $GridColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $GridColor(long v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().setGridColor(Information.RGBtoColor(v));
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BackColorSel() {
        long $BackColorSel = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Information.ColorToRGB(Me.$Parent().getSelectionBackground());
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BackColorSel;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BackColorSel(long v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().setSelectionBackground(Information.RGBtoColor(v));
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $ForeColorSel() {
        long $ForeColorSel = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Information.ColorToRGB(Me.$Parent().getSelectionForeground());
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ForeColorSel;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ForeColorSel(long v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().setSelectionForeground(Information.RGBtoColor(v));
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SelectionModeSettings $SelectionMode() {
        SelectionModeSettings $SelectionMode = new SelectionModeSettings();
        Throwable Err = null;
        int h5 = 0;
        h5 = 0;
        try {
            JBGrid Me;
            h5 = Me.$Parent().getSelectionModel().getSelectionMode();
            if (h5 == ListSelectionModel.SINGLE_SELECTION) {
                return SelectionModeSettings.flexSelectionFree;
            }
            if (h5 == ListSelectionModel.SINGLE_INTERVAL_SELECTION) {
                return SelectionModeSettings.flexSelectionByRow;
            }
            if (h5 == ListSelectionModel.MULTIPLE_INTERVAL_SELECTION) return SelectionModeSettings.flexSelectionByColumn;
            return $SelectionMode;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $SelectionMode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $SelectionMode(SelectionModeSettings v) {
        Throwable Err = null;
        SelectionModeSettings h5 = new SelectionModeSettings();
        h5 = null;
        try {
            JBGrid Me;
            h5 = v;
            if (h5.compareTo(SelectionModeSettings.flexSelectionFree) == 0) {
                Me.$Parent().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                return;
            }
            if (h5.compareTo(SelectionModeSettings.flexSelectionByRow) == 0) {
                Me.$Parent().setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                return;
            }
            if (h5.compareTo(SelectionModeSettings.flexSelectionByColumn) != 0) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.$Parent().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            return;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public jbAutoResize $AutoResize() {
        jbAutoResize $AutoResize = new jbAutoResize();
        Throwable Err = null;
        int h5 = 0;
        h5 = 0;
        try {
            JBGrid Me;
            h5 = Me.$Parent().getAutoResizeMode();
            if (h5 == JTable.AUTO_RESIZE_OFF) {
                return jbAutoResize.jbAutoResizeOff;
            }
            if (h5 == JTable.AUTO_RESIZE_NEXT_COLUMN) {
                return jbAutoResize.jbAutoResizeNextColumn;
            }
            if (h5 == JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS) {
                return jbAutoResize.jbAutoResizeSubSequentColumn;
            }
            if (h5 == JTable.AUTO_RESIZE_LAST_COLUMN) {
                return jbAutoResize.jbAutoResizeLastColumn;
            }
            if (h5 == JTable.AUTO_RESIZE_ALL_COLUMNS) return jbAutoResize.jbAutoResizeAllColumns;
            return $AutoResize;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AutoResize;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $AutoResize(jbAutoResize v) {
        Throwable Err = null;
        jbAutoResize h5 = new jbAutoResize();
        h5 = null;
        try {
            JBGrid Me;
            h5 = v;
            if (h5.compareTo(jbAutoResize.jbAutoResizeOff) == 0) {
                Me.$Parent().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                return;
            }
            if (h5.compareTo(jbAutoResize.jbAutoResizeNextColumn) == 0) {
                Me.$Parent().setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
                return;
            }
            if (h5.compareTo(jbAutoResize.jbAutoResizeSubSequentColumn) == 0) {
                Me.$Parent().setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
                return;
            }
            if (h5.compareTo(jbAutoResize.jbAutoResizeLastColumn) == 0) {
                Me.$Parent().setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
                return;
            }
            if (h5.compareTo(jbAutoResize.jbAutoResizeAllColumns) != 0) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.$Parent().setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            return;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BackColorHeader() {
        long $BackColorHeader = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myBackColorHeader;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BackColorHeader;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BackColorHeader(long v) {
        Throwable Err = null;
        try {
            Me.myBackColorHeader = v;
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $ForeColorHeader() {
        long $ForeColorHeader = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Information.ColorToRGB(Me.$Parent().getTableHeader().getForeground());
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ForeColorHeader;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ForeColorHeader(long v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().getTableHeader().setForeground(Information.RGBtoColor(v));
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BackColorCells() {
        long $BackColorCells = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myBackColorCells;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BackColorCells;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BackColorCells(long v) {
        Throwable Err = null;
        try {
            Me.myBackColorCells = v;
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BackColorCellsAlternating() {
        long $BackColorCellsAlternating = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myBackColorCellsAlternating;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BackColorCellsAlternating;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BackColorCellsAlternating(long v) {
        Throwable Err = null;
        try {
            Me.myBackColorCellsAlternating = v;
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $FlatHeader() {
        boolean $FlatHeader = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myFlatHeader;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FlatHeader;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FlatHeader(boolean v) {
        Throwable Err = null;
        try {
            Me.myFlatHeader = v;
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
    public boolean $GradientHeader() {
        boolean $GradientHeader = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myGradientHeader;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $GradientHeader;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $GradientHeader(boolean v) {
        Throwable Err = null;
        try {
            Me.myGradientHeader = v;
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
    public long $BorderColor() {
        long $BorderColor = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myBorderColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BorderColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BorderColor(long v) {
        Throwable Err = null;
        try {
            Me.myBorderColor = v;
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public fmBorderStyle $BorderStyle() {
        fmBorderStyle $BorderStyle = new fmBorderStyle();
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myBorderStyle;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BorderStyle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BorderStyle(fmBorderStyle v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.myBorderStyle = v;
            Me.SetMyBorder();
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
    public fmSpecialEffect $SpecialEffect() {
        fmSpecialEffect $SpecialEffect = new fmSpecialEffect();
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.mySpecialEffect;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $SpecialEffect;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $SpecialEffect(fmSpecialEffect v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.mySpecialEffect = v;
            Me.SetMyBorder();
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
    private void SetMyBorder() {
        Throwable Err = null;
        Border myBorder = null;
        try {
            JBGrid Me;
            myBorder = Global.GetVBBorder(Me.$BorderStyle(), Me.$SpecialEffect(), Me.$BorderColor());
            super.setBorder(myBorder);
            return;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JBEditable $Editable() {
        JBEditable $Editable = new JBEditable();
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myEditable;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Editable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Editable(JBEditable v) {
        Throwable Err = null;
        try {
            Me.myEditable = v;
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
    public boolean $Redraw() {
        boolean $Redraw = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            if (!Me.$Parent().getIgnoreRepaint()) return true;
            return false;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Redraw;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Redraw(boolean v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().setIgnoreRepaint(!v);
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
    public String $Header(int Index) {
        String $Header = "";
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myModel.getColumnName(Index);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Header;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Header(int Index, String value) {
        Throwable Err = null;
        JBCellData tmpHeaderItem = new JBCellData(value);
        try {
            JBGrid Me;
            Me.myModel.setColumnName(Index, tmpHeaderItem.toString());
            Me.Refresh();
            return;
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $HeaderAlign(int Index, fmTextAlign value) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.myModel.setColumnAlign(Index, value);
            Me.Refresh();
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public fmTextAlign $HeaderAlign(int Index) {
        fmTextAlign $HeaderAlign = new fmTextAlign();
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myModel.getColumnAlign(Index);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $HeaderAlign;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IResource $HeaderIcon(int Index) {
        IResource $HeaderIcon = null;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myModel.getColumnIcon(Index);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $HeaderIcon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $HeaderIcon(int Index, IResource value) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.myModel.setColumnIcon(Index, value);
            Me.Refresh();
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $ColHeaderIndex() {
        int $ColHeaderIndex = 0;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myColHeaderIndex;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ColHeaderIndex;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ColHeaderIndex(int v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            if (!(v > -1 * 2 & v < Me.$Cols())) {
                return;
            }
            Me.myColHeaderIndex = v;
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
    public boolean isEditing() {
        boolean isEditing = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().isEditing();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return isEditing;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isEditing(int row, int col) {
        boolean isEditing = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            if (!Me.isEditing()) {
                return isEditing;
            }
            if (Me.$Col() == (long)col & Me.$Row() == (long)row) return true;
            return isEditing;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return isEditing;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Cols(int v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.myModel.setColumnCount(v);
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
    public int $Cols() {
        int $Cols = 0;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myModel.getColumnCount();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Cols;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Rows(int v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.myModel.setRowCount(v);
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
    public int $Rows() {
        int $Rows = 0;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myModel.getRowCount();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Rows;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $HeaderHeight(int v) {
        Throwable Err = null;
        try {
            Me.myHeaderHeight = v;
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
    public int $HeaderHeight() {
        int $HeaderHeight = 0;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myHeaderHeight;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $HeaderHeight;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $TextMatrix(long row, long col, String text) {
        Object var7_6;
        JBGrid Me;
        JBCellData tmpCellItem;
        Throwable Err;
        block16: {
            block15: {
                Err = null;
                tmpCellItem = null;
                try {
                    tmpCellItem = (JBCellData)Me.myModel.getValueAt((int)row, (int)col);
                }
                catch (Throwable throwable) {
                    var7_6 = null;
                    Err = throwable;
                }
                try {
                    if (tmpCellItem == null) break block15;
                    break block16;
                }
                catch (Throwable throwable) {
                    var7_6 = null;
                    Err = throwable;
                }
            }
            try {
                tmpCellItem = new JBCellData();
            }
            catch (Throwable throwable) {
                var7_6 = null;
                Err = throwable;
            }
        }
        try {
            tmpCellItem.$Text(text);
        }
        catch (Throwable throwable) {
            var7_6 = null;
            Err = throwable;
        }
        try {
            Me.myModel.setValueAt(tmpCellItem, (int)row, (int)col);
        }
        catch (Throwable throwable) {
            var7_6 = null;
            Err = throwable;
        }
        try {
            Me.Refresh();
        }
        catch (Throwable throwable) {
            var7_6 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $TextMatrix(long row, long col) {
        String $TextMatrix = "";
        Throwable Err = null;
        JBCellData tmpCellItem = null;
        Object tmpData = null;
        try {
            JBGrid Me;
            tmpData = Me.myModel.getValueAt((int)row, (int)col);
            tmpCellItem = (JBCellData)tmpData;
            if (!(tmpCellItem != null)) return tmpData.toString();
            return tmpCellItem.$Text();
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $TextMatrix;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CellBackColor(long row, long col, long backcolor) {
        Object var8_6;
        JBGrid Me;
        JBCellData tmpCellItem;
        Throwable Err;
        block16: {
            block15: {
                Err = null;
                tmpCellItem = null;
                try {
                    tmpCellItem = (JBCellData)Me.myModel.getValueAt((int)row, (int)col);
                }
                catch (Throwable throwable) {
                    var8_6 = null;
                    Err = throwable;
                }
                try {
                    if (tmpCellItem == null) break block15;
                    break block16;
                }
                catch (Throwable throwable) {
                    var8_6 = null;
                    Err = throwable;
                }
            }
            try {
                tmpCellItem = new JBCellData();
            }
            catch (Throwable throwable) {
                var8_6 = null;
                Err = throwable;
            }
        }
        try {
            tmpCellItem.$CellBackColor(backcolor);
        }
        catch (Throwable throwable) {
            var8_6 = null;
            Err = throwable;
        }
        try {
            Me.myModel.setValueAt(tmpCellItem, (int)row, (int)col);
        }
        catch (Throwable throwable) {
            var8_6 = null;
            Err = throwable;
        }
        try {
            Me.Refresh();
        }
        catch (Throwable throwable) {
            var8_6 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $CellBackColor(long row, long col) {
        long $CellBackColor = 0L;
        Throwable Err = null;
        JBCellData tmpCellItem = null;
        Object tmpData = null;
        try {
            JBGrid Me;
            tmpData = Me.myModel.getValueAt((int)row, (int)col);
            tmpCellItem = (JBCellData)tmpData;
            if (tmpCellItem == null) {
                return -1L;
            }
            boolean bl = true;
            if (!bl) return -1 * 1;
            return tmpCellItem.$CellBackColor();
        }
        catch (Throwable throwable) {
            Object var8_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CellBackColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CellForeColor(long row, long col, long forecolor) {
        Object var8_6;
        JBGrid Me;
        JBCellData tmpCellItem;
        Throwable Err;
        block16: {
            block15: {
                Err = null;
                tmpCellItem = null;
                try {
                    tmpCellItem = (JBCellData)Me.myModel.getValueAt((int)row, (int)col);
                }
                catch (Throwable throwable) {
                    var8_6 = null;
                    Err = throwable;
                }
                try {
                    if (tmpCellItem == null) break block15;
                    break block16;
                }
                catch (Throwable throwable) {
                    var8_6 = null;
                    Err = throwable;
                }
            }
            try {
                tmpCellItem = new JBCellData();
            }
            catch (Throwable throwable) {
                var8_6 = null;
                Err = throwable;
            }
        }
        try {
            tmpCellItem.$CellForeColor(forecolor);
        }
        catch (Throwable throwable) {
            var8_6 = null;
            Err = throwable;
        }
        try {
            Me.myModel.setValueAt(tmpCellItem, (int)row, (int)col);
        }
        catch (Throwable throwable) {
            var8_6 = null;
            Err = throwable;
        }
        try {
            Me.Refresh();
        }
        catch (Throwable throwable) {
            var8_6 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $CellForeColor(long row, long col) {
        long $CellForeColor = 0L;
        Throwable Err = null;
        JBCellData tmpCellItem = null;
        Object tmpData = null;
        try {
            JBGrid Me;
            tmpData = Me.myModel.getValueAt((int)row, (int)col);
            tmpCellItem = (JBCellData)tmpData;
            if (tmpCellItem == null) {
                return -1L;
            }
            boolean bl = true;
            if (!bl) return -1 * 1;
            return tmpCellItem.$CellForeColor();
        }
        catch (Throwable throwable) {
            Object var8_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CellForeColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $DataMatrix(long row, long col, JBCellData data) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.myModel.setValueAt(data, (int)row, (int)col);
            return;
        }
        catch (Throwable throwable) {
            Object var7_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JBCellData $DataMatrix(long row, long col) {
        JBCellData $DataMatrix = null;
        Throwable Err = null;
        try {
            JBGrid Me;
            return (JBCellData)Me.myModel.getValueAt((int)row, (int)col);
        }
        catch (Throwable throwable) {
            Object var7_5 = null;
            Err = throwable;
            return $DataMatrix;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void ClearData() {
        Throwable Err = null;
        try {
            JBGrid Me;
            if (Me.isEditing()) {
                Me.myCellEditor.stopCellEditing();
            }
            Me.myModel.clear();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TableCellRenderer getDefaultRenderer(Class columnClass) {
        TableCellRenderer getDefaultRenderer = null;
        Throwable Err = null;
        try {
            return null;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getDefaultRenderer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void fireBeforeEdit(int row, int col) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._BeforeCellEdit(row, col);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void fireAfterEdit(int row, int col) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._AfterCellEdit(row, col);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void fireCellButtonClick() {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me._CellButtonClick();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JBCellRenderer $Renderer() {
        JBCellRenderer $Renderer = null;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myRenderer;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Renderer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JBCellEditor $CellEditor() {
        JBCellEditor $CellEditor = null;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myCellEditor;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CellEditor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Row(long val) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().setEditingRow((int)val);
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $Row() {
        long $Row = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getSelectedRow();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Row;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Col(long val) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().setEditingColumn((int)val);
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $Col() {
        long $Col = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getSelectedColumn();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Col;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ColWidth(long col, long val) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().getColumnModel().getColumn((int)col).setPreferredWidth((int)val);
            return;
        }
        catch (Throwable throwable) {
            Object var6_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $ColWidth(long col) {
        long $ColWidth = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getColumnModel().getColumn((int)col).getPreferredWidth();
        }
        catch (Throwable throwable) {
            Object var6_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ColWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $RowHeightGlobal(int v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            if (v < 1) return;
            Me.$Parent().setRowHeight(v);
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
    public int $RowHeightGlobal() {
        int $RowHeightGlobal = 0;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getRowHeight();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $RowHeightGlobal;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $RowHeight(long row, int v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            if (v < 1) return;
            Me.$Parent().setRowHeight((int)row, v);
            return;
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $RowHeight(long row) {
        int $RowHeight = 0;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getRowHeight((int)row);
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $RowHeight;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ShowHorizontalLines(boolean v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().setShowHorizontalLines(v);
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
    public boolean $ShowHorizontalLines() {
        boolean $ShowHorizontalLines = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getShowHorizontalLines();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ShowHorizontalLines;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ShowVerticalLines(boolean v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().setShowVerticalLines(v);
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
    public boolean $ShowVerticalLines() {
        boolean $ShowVerticalLines = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getShowVerticalLines();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ShowVerticalLines;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $HeaderVisible(boolean v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().getTableHeader().setVisible(v);
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
    public boolean $HeaderVisible() {
        boolean $HeaderVisible = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getTableHeader().isVisible();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $HeaderVisible;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $AutoCheckBox(boolean v) {
        Throwable Err = null;
        try {
            Me.myAutoCheckBox = v;
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
    public boolean $AutoCheckBox() {
        boolean $AutoCheckBox = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myAutoCheckBox;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AutoCheckBox;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $FontName() {
        String $FontName = "";
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getFont().getFamily();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontName;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontName(String val) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.setFont(new Font(val, (int)(Interaction.IIF(Me.$FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(Me.$FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(Me.$FontSize())));
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
    public boolean $FontBold() {
        boolean $FontBold = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getFont().isBold();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontBold;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontBold(boolean val) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.setFont(new Font(Me.$FontName(), (int)(Interaction.IIF(val, VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(Me.$FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(Me.$FontSize())));
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
    public boolean $FontItalic() {
        boolean $FontItalic = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getFont().isItalic();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontItalic;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontItalic(boolean val) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.setFont(new Font(Me.$FontName(), (int)(Interaction.IIF(Me.$FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(val, VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(Me.$FontSize())));
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
    public int $FontSize() {
        int $FontSize = 0;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Global.JFontSizeToVBFontSize(Me.$Font().getSize());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontSize;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontSize(int val) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.setFont(new Font(Me.$FontName(), (int)(Interaction.IIF(Me.$FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(Me.$FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(val)));
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
    @Override
    public void setFont(Font refFont) {
        Throwable Err = null;
        try {
            JBGrid Me;
            super.setFont(refFont);
            if (Me.$Parent() == null) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.$Parent().setFont(refFont);
            Me.$Parent().getTableHeader().setFont(refFont);
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
    public Font $Font() {
        Font $Font = null;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getFont();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Font;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BackColor() {
        long $BackColor = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Information.ColorToRGB(Me.$Parent().getBackground());
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BackColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BackColor(long v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            super.setBackground(Information.RGBtoColor(v));
            super.getViewport().setBackground(Information.RGBtoColor(v));
            Me.$Parent().getTableHeader().setBackground(Information.RGBtoColor(v));
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $ForeColor() {
        long $ForeColor = 0L;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Information.ColorToRGB(Me.$Parent().getForeground());
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ForeColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ForeColor(long v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().setForeground(Information.RGBtoColor(v));
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public float $Width() {
        float $Width = 0.0f;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.getSize().width;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Width;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Width(float v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.setSize((int)v, Me.getSize().height);
            Me.Refresh();
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
    @Override
    public float $Height() {
        float $Height = 0.0f;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.getSize().height;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Height;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Height(float v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.setSize(Me.getSize().width, (int)v);
            Me.Refresh();
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
    @Override
    public float $Left() {
        float $Left = 0.0f;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.getLocation().x;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Left;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Left(float v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            if (!Me.isLeftInitialized) {
                Me.mySavedLeft = v;
                Me.isLeftInitialized = true;
            }
            Me.setLocation((int)v, Me.getLocation().y);
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
    @Override
    public float $Top() {
        float $Top = 0.0f;
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.getLocation().y;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Top;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Top(float v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            if (!Me.isTopInitialized) {
                Me.mySavedTop = v;
                Me.isTopInitialized = true;
            }
            Me.setLocation(Me.getLocation().x, (int)v);
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
    public AnchorStyles $Anchor() {
        AnchorStyles $Anchor = new AnchorStyles();
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myAnchor;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Anchor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Anchor(AnchorStyles val) {
        Throwable Err = null;
        try {
            Me.myAnchor = val;
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
    public VBVariant Move(float Left, float Top, float Width, float Height) {
        VBVariant Move = new VBVariant();
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Left(Left);
            if (Top != (float)(-1 * 1)) {
                Me.$Top(Top);
            }
            if (Width != (float)(-1 * 1)) {
                Me.$Width(Width);
            }
            if (!(Height != (float)(-1 * 1))) {
                return Move;
            }
            Me.$Height(Height);
            return Move;
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Move;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $ToolTip() {
        String $ToolTip = "";
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.$Parent().getToolTipText();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ToolTip;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ToolTip(String v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            if (Strings.Len(v) == 0) {
                Me.$Parent().setToolTipText(null);
                return;
            }
            Me.$Parent().setToolTipText(v);
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
    public boolean $Enabled() {
        boolean $Enabled = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return super.isEnabled();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Enabled;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Enabled(boolean v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            super.setEnabled(v);
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
    @Override
    public boolean $Visible() {
        boolean $Visible = false;
        Throwable Err = null;
        try {
            JBGrid Me;
            return super.isVisible();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Visible;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Visible(boolean v) {
        Throwable Err = null;
        try {
            JBGrid Me;
            super.setVisible(v);
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
    public String $Tag() {
        String $Tag = "";
        Throwable Err = null;
        try {
            JBGrid Me;
            return Me.myTag;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Tag;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Tag(String v) {
        Throwable Err = null;
        try {
            Me.myTag = v;
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
    public void SetFocus() {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().requestFocus();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Refresh() {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.$Parent().invalidate();
            Me.$Parent().repaint(0, 0, 0, (int)Me.$Width(), (int)Me.$Height());
            Me.$Parent().setSize(Me.getSize());
            Me.$Parent().revalidate();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void ResizeTriggerInit(float w, float h) {
        Throwable Err = null;
        try {
            JBGrid Me;
            Me.hostSavedWidth = w;
            Me.hostSavedHeight = h;
            Me.mySavedWidth = Me.$Width();
            Me.mySavedHeight = Me.$Height();
            Me.isResizeTriggerInitialized = true;
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void ResizeTrigger(float w, float h) {
        Throwable throwable2;
        Throwable Err;
        block15: {
            JBGrid Me;
            Err = null;
            int h6 = 0;
            try {
                if (!(Me.isResizeTriggerInitialized & Me.isLeftInitialized & Me.isTopInitialized)) {
                    return;
                }
                h6 = 0;
            }
            catch (Throwable throwable2) {}
            try {
                block11: {
                    block14: {
                        block13: {
                            block12: {
                                h6 = Me.myAnchor.intValue() & 0xC;
                                if (h6 == AnchorStyles.vbLeft.intValue()) break block11;
                                if (h6 == AnchorStyles.vbRight.intValue()) break block12;
                                if (h6 == AnchorStyles.vbLeftRight.intValue()) break block13;
                                if (h6 == AnchorStyles.vbNone.intValue()) break block14;
                                break block11;
                            }
                            Me.$Left(w - Me.hostSavedWidth + Me.mySavedLeft);
                            break block11;
                        }
                        Me.$Width(w - Me.hostSavedWidth + Me.mySavedWidth);
                        break block11;
                    }
                    Me.$Left((float)((double)(w - Me.mySavedWidth) / (double)(Me.hostSavedWidth - Me.mySavedWidth) * (double)Me.mySavedLeft));
                }
                h6 = 0;
            }
            catch (Throwable throwable2) {}
            h6 = Me.myAnchor.intValue() & 3;
            if (h6 == AnchorStyles.vbTop.intValue()) return;
            if (h6 == AnchorStyles.vbBottom.intValue()) {
                Me.$Top(h - Me.hostSavedHeight + Me.mySavedTop);
                return;
            }
            if (h6 == AnchorStyles.vbTopBottom.intValue()) {
                Me.$Height(h - Me.hostSavedHeight + Me.mySavedHeight);
                return;
            }
            if (!(h6 == AnchorStyles.vbNone.intValue())) {
                return;
            }
            Me.$Top((float)((double)(h - Me.mySavedHeight) / (double)(Me.hostSavedHeight - Me.mySavedHeight) * (double)Me.mySavedTop));
            break block15;
            finally {
            }
        }
        Object var4_5 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    public VBVariant Move(float Left) {
        JBGrid Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        JBGrid Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        JBGrid Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }

    public JBGrid() {
        JBGrid Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        Me.myModel = null;
        Me.myTable = null;
        Me.myHeaderRenderer = null;
        Me.myRenderer = null;
        Me.myCellEditor = null;
        Me.myAutoCheckBox = false;
        Me.myHeaderIcon = null;
        Me.myFlatHeader = false;
        Me.myGradientHeader = false;
        Me.myBackColorHeader = 0L;
        Me.myBorderStyle = new fmBorderStyle();
        Me.mySpecialEffect = new fmSpecialEffect();
        Me.myColHeaderIndex = 0;
        Me.myShowSortIndicator = false;
        Me.mySortIndicatorIndex = 0;
        Me.myHeaderHeight = 0;
        Me.myBorderColorSel = 0L;
        Me.myBorderColor = 0L;
        Me.myBackColorCells = 0L;
        Me.myBackColorCellsAlternating = 0L;
        Me.myTag = "";
        Me.myComboList = "";
        Me.myEditable = new JBEditable();
        Me.myAnchor = AnchorStyles.vbTopLeft;
        Me.mySavedWidth = 0.0f;
        Me.mySavedHeight = 0.0f;
        Me.mySavedLeft = 0.0f;
        Me.mySavedTop = 0.0f;
        Me.hostSavedWidth = 0.0f;
        Me.hostSavedHeight = 0.0f;
        Me.isResizeTriggerInitialized = false;
        Me.isLeftInitialized = false;
        Me.isTopInitialized = false;
    }
}
