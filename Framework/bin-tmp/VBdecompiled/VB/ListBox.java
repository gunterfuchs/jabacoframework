/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AnchorStyles;
import VB.Global;
import VB.IJabacoClass;
import VB.IJabacoControl;
import VB.IListCellDataOwner;
import VB.ListBoxConstants;
import VB.ListBoxModel;
import VB.ListCellData;
import VB.ListCellDataRenderer;
import VB.MousePointerConstants;
import VB.Usercontrol;
import VB.fmBorderStyle;
import VB.fmMultiSelect;
import VB.lstOrientation;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListBox
extends JScrollPane
implements IJabacoControl,
IJabacoClass,
IListCellDataOwner,
MouseListener,
MouseMotionListener,
KeyListener,
FocusListener,
ListSelectionListener {
    private ListBoxModel myModel;
    private JList myList;
    private String myTag;
    private long myMargin;
    private long myMarginItem;
    private fmBorderStyle myBorderStyle;
    private Border myDefaultBorder;
    private ListCellDataRenderer myRenderer;
    private ListBoxConstants myStyle;
    private int myMemListIndex;
    private long myBorderColorSel;
    private long myBackColorAlternating;
    private IResource myMouseIcon;
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

    public void _ItemCheck(int Item) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JList $Parent() {
        JList $Parent = null;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.myList;
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
        Object var2_2;
        ListBox Me;
        Throwable Err = null;
        try {
            Me.$Parent().addFocusListener(Me);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().addMouseListener(Me);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().addMouseMotionListener(Me);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().addKeyListener(Me);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().addListSelectionListener(Me);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().setCellRenderer(Me.myRenderer);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.setViewportView(Me.myList);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.myDefaultBorder = super.getBorder();
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            super.setOpaque(false);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
            return;
        }
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
            Me.ReDispatch(e);
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
            ListBox Me;
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
        Throwable throwable2;
        Throwable Err;
        block6: {
            int Index;
            ListBox Me;
            Err = null;
            try {
                Me.ReDispatch(e);
                Index = Me.HitTest(e.getX(), e.getY());
            }
            catch (Throwable throwable2) {
                break block6;
            }
            if (Me.IsCheckBox(Index)) {
                Me.$Selected(Index, !Me.$Selected(Index));
            }
            Me._MouseDown(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
        }
        Object var3_4 = null;
        Err = throwable2;
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
            ListBox Me;
            Me.ReDispatch(e);
            Me._MouseUp(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
            if (!(e.getX() > 0 & e.getY() > 0 & e.getX() < Me.getWidth() & e.getY() < Me.getHeight())) {
                return;
            }
            if (e.getClickCount() % 2 != 0) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me._DblClick();
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
            ListBox Me;
            Me.ReDispatch(e);
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
    @Override
    public void valueChanged(ListSelectionEvent arg2) {
        Throwable Err = null;
        try {
            ListBox Me;
            if (Me.myMemListIndex == Me.$ListIndex()) return;
            Me.myMemListIndex = Me.$ListIndex();
            Me._Click();
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
    public void RemoveItem(int v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.myModel.removeElementAt(v);
            Me.fireChange();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void ReDispatch(MouseEvent e) {
        Throwable throwable2;
        Throwable Err;
        block11: {
            block10: {
                ListBox Me;
                Object vCDataComponent;
                Err = null;
                Object tmpTarget = null;
                Component retTarget = null;
                Object tmpLocation = null;
                long tx = 0L;
                long ty = 0L;
                boolean vIndex = false;
                Object vCData = null;
                try {
                    if (vCData == null) return;
                    boolean bl = false;
                    if (bl) return;
                    vCDataComponent = null;
                }
                catch (Throwable throwable2) {}
                try {
                    if (vCDataComponent == null) {
                        return;
                    }
                    boolean bl = true;
                    if (!bl) break block10;
                }
                catch (Throwable throwable2) {}
                tx = tmpLocation.x;
                ty = tmpLocation.y;
                if (retTarget == null) {
                    retTarget = vCDataComponent;
                }
                retTarget.setFocusable(true);
                retTarget.dispatchEvent(new MouseEvent(retTarget, e.getID(), e.getWhen(), e.getModifiers(), (int)((long)e.getX() - tx), (int)((long)e.getY() - ty), e.getClickCount(), e.isPopupTrigger(), e.getButton()));
                Me.Refresh();
            }
            return;
            break block11;
            finally {
            }
        }
        Object var3_11 = null;
        Err = throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public fmMultiSelect $MultiSelect() {
        fmMultiSelect $MultiSelect = new fmMultiSelect();
        Throwable Err = null;
        try {
            ListBox Me;
            if (!(Me.myList.getSelectionMode() == ListSelectionModel.SINGLE_INTERVAL_SELECTION)) return fmMultiSelect.fmMultiSelectSingle;
            return fmMultiSelect.fmMultiSelectSingle;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MultiSelect;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $MultiSelect(fmMultiSelect v) {
        Throwable Err = null;
        fmMultiSelect h5 = new fmMultiSelect();
        h5 = null;
        try {
            ListBox Me;
            h5 = v;
            if (h5.compareTo(fmMultiSelect.fmMultiSelectExtended) == 0) {
                Me.$Parent().setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                return;
            }
            if (h5.compareTo(fmMultiSelect.fmMultiSelectMulti) == 0) {
                Me.$Parent().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                return;
            }
            if (h5.compareTo(fmMultiSelect.fmMultiSelectSingle) != 0) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.$Parent().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
    public long $Margin() {
        long $Margin = 0L;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.myMargin;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Margin;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Margin(long v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.myMargin = v;
            Me.$Parent().setBorder(BorderFactory.createEmptyBorder((int)v, (int)v, (int)v, (int)v));
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
    public void $MarginItem(long v) {
        Throwable Err = null;
        try {
            Me.myMarginItem = v;
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
    public long $MarginItem() {
        long $MarginItem = 0L;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.myMarginItem;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MarginItem;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $FixedCellHeight() {
        long $FixedCellHeight = 0L;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().getFixedCellHeight();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FixedCellHeight;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FixedCellHeight(long v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.$Parent().setFixedCellHeight((int)v);
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
    public long $FixedCellWidth() {
        long $FixedCellWidth = 0L;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().getFixedCellWidth();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FixedCellWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FixedCellWidth(long v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.$Parent().setFixedCellWidth((int)v);
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
    public long $BorderColorSel() {
        long $BorderColorSel = 0L;
        Throwable Err = null;
        try {
            ListBox Me;
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
    @Override
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
    @Override
    public long $BackColorSel() {
        long $BackColorSel = 0L;
        Throwable Err = null;
        try {
            ListBox Me;
            return Information.ColorToRGB(Me.myList.getSelectionBackground());
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
    @Override
    public void $BackColorSel(long v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.myList.setSelectionBackground(Information.RGBtoColor(v));
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
    public long $BackColorAlternating() {
        long $BackColorAlternating = 0L;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.myBackColorAlternating;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BackColorAlternating;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BackColorAlternating(long v) {
        Throwable Err = null;
        try {
            Me.myBackColorAlternating = v;
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
    public long $ForeColorSel() {
        long $ForeColorSel = 0L;
        Throwable Err = null;
        try {
            ListBox Me;
            return Information.ColorToRGB(Me.myList.getSelectionForeground());
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
    @Override
    public void $ForeColorSel(long v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.myList.setSelectionForeground(Information.RGBtoColor(v));
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
            ListBox Me;
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
            ListBox Me;
            Me.myBorderStyle = v;
            if (v.compareTo(fmBorderStyle.fmBorderStyleNone) == 0) {
                Me.setBorder(null);
                return;
            }
            Me.setBorder(Me.myDefaultBorder);
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
    public void Clear() {
        Throwable Err = null;
        try {
            ListBox Me;
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
    public void ensureIndexIsVisible(int Index) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.$Parent().ensureIndexIsVisible(Index);
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
    public int getFirstVisibleIndex() {
        int getFirstVisibleIndex = 0;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().getFirstVisibleIndex();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getFirstVisibleIndex;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getVisibleRowCount() {
        int getVisibleRowCount = 0;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().getVisibleRowCount();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getVisibleRowCount;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int HitTest(int x, int y) {
        int HitTest = 0;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().locationToIndex(new Point(x, y));
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return HitTest;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized void AddItem(String Item) {
        ListBox Me;
        Throwable Err = null;
        ListCellData tmpCellData = new ListCellData(Item, null, Me.myStyle.intValue() != 0);
        try {
            tmpCellData.$Owner(Me);
            Me.myModel.addElement((Object)tmpCellData);
            Me.fireChange();
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
    public synchronized void AddItem(ListCellData Item) {
        Throwable Err = null;
        try {
            ListBox Me;
            Item.$Owner(Me);
            Me.myModel.addElement((Object)Item);
            Me.fireChange();
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
    public synchronized void AddItem(Usercontrol v) {
        Throwable Err = null;
        ListCellData tmpCellData = new ListCellData(v);
        try {
            ListBox Me;
            tmpCellData.$Owner(Me);
            Me.myModel.addElement((Object)tmpCellData);
            Me.fireChange();
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
    public synchronized void AddItem(Usercontrol v, int Index) {
        Throwable Err = null;
        ListCellData tmpCellData = new ListCellData(v);
        try {
            ListBox Me;
            tmpCellData.$Owner(Me);
            Me.myModel.insertElementAt((Object)tmpCellData, Index);
            Me.fireChange();
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
    public synchronized void AddItem(String Item, int Index) {
        ListBox Me;
        Throwable Err = null;
        ListCellData tmpCellData = new ListCellData(Item, null, Me.myStyle.intValue() != 0);
        try {
            tmpCellData.$Owner(Me);
            Me.myModel.insertElementAt((Object)tmpCellData, Index);
            Me.fireChange();
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
    public synchronized void AddItem(ListCellData Item, int Index) {
        Throwable Err = null;
        try {
            ListBox Me;
            Item.$Owner(Me);
            Me.myModel.insertElementAt((Object)Item, Index);
            Me.fireChange();
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
    private void fireChange() {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.myModel.fireChangeEvent(0, (int)Me.$ListCount());
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
    public long $ListCount() {
        long $ListCount = 0L;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.myModel.getSize();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ListCount;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private ListCellData GetCellData(long Index) {
        ListCellData GetCellData = null;
        Throwable Err = null;
        try {
            ListBox Me;
            return (ListCellData)Me.myModel.getElementAt((int)Index);
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return GetCellData;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Component GetCellComponent(long Index) {
        Component GetCellComponent = null;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.GetCellData(Index).getComponent(Me, null, Me.$Selected(Index), (long)Me.$ListIndex() == Index);
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return GetCellComponent;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String $List(long Index) {
        String $List = "";
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.GetCellData(Index).$Text();
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return $List;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void $List(long Index, String v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.GetCellData(Index).$Text(v);
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String $ListData(long Index) {
        String $ListData = "";
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.GetCellData(Index).$Data();
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return $ListData;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void $ListData(long Index, String v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.GetCellData(Index).$Data(v);
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public IResource $ListIcon(long Index) {
        IResource $ListIcon = null;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.GetCellData(Index).$Icon();
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return $ListIcon;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void $ListIcon(long Index, IResource v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.GetCellData(Index).$Icon(v);
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IsCheckBox(long Index) {
        boolean IsCheckBox = false;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.GetCellData(Index).$AsCheckBox();
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return IsCheckBox;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Selected(long Index, boolean v) {
        Throwable Err = null;
        try {
            ListBox Me;
            if (Me.IsCheckBox(Index)) {
                Me.GetCellData(Index).$Checked(v);
                Me._ItemCheck((int)Index);
                return;
            }
            Me.$ListIndex((int)Index);
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
    public boolean $Selected(long Index) {
        boolean $Selected = false;
        Throwable Err = null;
        try {
            ListBox Me;
            if (Me.IsCheckBox(Index)) {
                return Me.GetCellData(Index).$Checked();
            }
            if ((long)Me.$ListIndex() == Index) return true;
            return false;
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Selected;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $ListIndex() {
        int $ListIndex = 0;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().getSelectedIndex();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ListIndex;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ListIndex(int val) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.$Parent().setSelectedIndex(val);
            Me.ensureIndexIsVisible(val);
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
    public ListBoxConstants $Style() {
        ListBoxConstants $Style = new ListBoxConstants();
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.myStyle;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Style;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Style(ListBoxConstants val) {
        Throwable Err = null;
        try {
            Me.myStyle = val;
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
    public lstOrientation $Orientation() {
        lstOrientation $Orientation = new lstOrientation();
        Throwable Err = null;
        try {
            ListBox Me;
            if (!(Me.$Parent().getLayoutOrientation() == JList.VERTICAL)) return lstOrientation.lstOrientationHorizontal;
            return lstOrientation.lstOrientationVertical;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Orientation;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Orientation(lstOrientation v) {
        Throwable Err = null;
        try {
            ListBox Me;
            if (v.compareTo(lstOrientation.lstOrientationVertical) == 0) {
                Me.$Parent().setLayoutOrientation(JList.VERTICAL);
                Me.$Parent().setVisibleRowCount(8);
                return;
            }
            Me.$Parent().setLayoutOrientation(JList.VERTICAL_WRAP);
            Me.$Parent().setVisibleRowCount(-1 * 1);
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
    public String $FontName() {
        String $FontName = "";
        Throwable Err = null;
        try {
            ListBox Me;
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
            ListBox Me;
            Me.$Parent().setFont(new Font(val, (int)(Interaction.IIF(Me.$FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(Me.$FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(Me.$FontSize())));
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
            ListBox Me;
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
            ListBox Me;
            Me.$Parent().setFont(new Font(Me.$FontName(), (int)(Interaction.IIF(val, VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(Me.$FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(Me.$FontSize())));
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
            ListBox Me;
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
            ListBox Me;
            Me.$Parent().setFont(new Font(Me.$FontName(), (int)(Interaction.IIF(Me.$FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(val, VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(Me.$FontSize())));
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
            ListBox Me;
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
            ListBox Me;
            Me.$Parent().setFont(new Font(Me.$FontName(), (int)(Interaction.IIF(Me.$FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue() | Interaction.IIF(Me.$FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()), Global.VBFontSizeToJFontSize(val)));
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
            ListBox Me;
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
            ListBox Me;
            $BackColor = Information.ColorToRGB(Me.$Parent().getBackground());
            super.setBackground(Me.$Parent().getBackground());
            return $BackColor;
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
            ListBox Me;
            Me.$Parent().setBackground(Information.RGBtoColor(v));
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
            ListBox Me;
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
            ListBox Me;
            Me.$Parent().setForeground(Information.RGBtoColor(v));
            super.setForeground(Me.$Parent().getForeground());
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
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
            ListBox Me;
            super.setVisible(v);
            Me.Refresh();
            Me.RefreshModel();
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
            ListBox Me;
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
    public MousePointerConstants $MousePointer() {
        MousePointerConstants $MousePointer = new MousePointerConstants();
        Throwable Err = null;
        try {
            ListBox Me;
            return Global.JCursorToVBMousePointer(Me.$Parent().getCursor());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MousePointer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $MousePointer(MousePointerConstants v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.$Parent().setCursor(Global.VBMousePointerToJCursor(v));
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
    public IResource $MouseIcon() {
        IResource $MouseIcon = null;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.myMouseIcon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MouseIcon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $MouseIcon(IResource v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.myMouseIcon = v;
            Me.$Parent().setCursor(Global.VBMouseIconToJCursor(v, Me));
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
    public boolean $CanGetFocus() {
        boolean $CanGetFocus = false;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().isFocusable();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CanGetFocus;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CanGetFocus(boolean v) {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.$Parent().setFocusable(v);
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
            ListBox Me;
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void RefreshModel() {
        Throwable Err = null;
        try {
            ListBox Me;
            Me.myModel.fireChangeEvent(0, (int)Me.$ListCount());
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void Refresh() {
        Object var2_2;
        ListBox Me;
        Throwable Err = null;
        try {
            Me.$Parent().invalidate();
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().repaint(0, 0, 0, (int)Me.$Width(), (int)Me.$Height());
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().setSize(Me.getSize());
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().revalidate();
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Font getFont() {
        Font getFont = null;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().getFont();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return getFont;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Color getSelectionBackground() {
        Color getSelectionBackground = null;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().getSelectionBackground();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getSelectionBackground;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Color getSelectionForeground() {
        Color getSelectionForeground = null;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().getSelectionForeground();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getSelectionForeground;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Color getBackground() {
        Color getBackground = null;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().getBackground();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return getBackground;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Color getForeground() {
        Color getForeground = null;
        Throwable Err = null;
        try {
            ListBox Me;
            return Me.$Parent().getForeground();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return getForeground;
        }
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
            ListBox Me;
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
            ListBox Me;
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
        ListBox Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        ListBox Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        ListBox Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }

    public ListBox() {
        ListBox Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        ListBox Me;
        Me.myModel = new ListBoxModel();
        Me.myList = new JList(Me.myModel);
        Me.myTag = "";
        Me.myMargin = 0L;
        Me.myMarginItem = 0L;
        Me.myBorderStyle = new fmBorderStyle();
        Me.myDefaultBorder = null;
        Me.myRenderer = new ListCellDataRenderer(Me);
        Me.myStyle = new ListBoxConstants();
        Me.myMemListIndex = -1 * 1;
        Me.myBorderColorSel = -1 * 0x7FFFFFF6;
        Me.myBackColorAlternating = 0L;
        Me.myMouseIcon = null;
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
