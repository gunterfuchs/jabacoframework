/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AnchorStyles;
import VB.Global;
import VB.IJabacoControl;
import VB.IListCellDataOwner;
import VB.JBComboBoxStyle;
import VB.ListCellData;
import VB.ListCellDataRenderer;
import VB.MousePointerConstants;
import VB.Usercontrol;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ComboBox
extends JComboBox
implements IJabacoControl,
IListCellDataOwner,
MouseListener,
MouseMotionListener,
KeyListener,
ActionListener,
FocusListener {
    private JBComboBoxStyle myComboBoxStyle;
    private String myTag;
    private IResource myMouseIcon;
    private ListCellDataRenderer myRenderer;
    private long myBorderColorSel;
    private long myMarginItem;
    private long myForeColorSel;
    private long myBackColorSel;
    private long myBackColorAlternating;
    private int myPreviousSelectedIndex;
    private boolean mySorted;
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

    public void _EditorClick() {
    }

    public void _ListClick() {
    }

    public void _Change() {
    }

    public void _GotFocus() {
    }

    public void _DropDown() {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JComboBox $Parent() {
        ComboBox $Parent = null;
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me;
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
        Throwable Err = null;
        try {
            ComboBox Me;
            Me.$Parent().addFocusListener(Me);
            Me.$Parent().getEditor().getEditorComponent().addFocusListener(Me);
            Me.$Parent().addMouseListener(Me);
            Me.$Parent().getEditor().getEditorComponent().addMouseListener(Me);
            Me.$Parent().addMouseMotionListener(Me);
            Me.$Parent().getEditor().getEditorComponent().addMouseMotionListener(Me);
            Me.$Parent().addKeyListener(Me);
            Me.$Parent().getEditor().getEditorComponent().addKeyListener(Me);
            Me.$Parent().setRenderer(Me.myRenderer);
            Me.$Parent().getComponent(0).addMouseListener(Me);
            Me.$Parent().addActionListener(Me);
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
    public void focusGained(FocusEvent arg2) {
        Throwable Err = null;
        try {
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
            Me.myPreviousSelectedIndex = Me.$Parent().getSelectedIndex();
            if (Me.$Parent().isPopupVisible()) {
                Me._DropDown();
            }
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
            ComboBox Me;
            Me._MouseUp(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
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
            ComboBox Me;
            if (e.getSource() instanceof JButton) return;
            boolean bl = false;
            if (bl) {
                return;
            }
            boolean bl2 = true;
            if (!bl2) {
                return;
            }
            Me._EditorClick();
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
            ComboBox Me;
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
            ComboBox Me;
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
     * Unable to fully structure code
     */
    @Override
    public void keyReleased(KeyEvent e) {
        block20: {
            block19: {
                block23: {
                    block22: {
                        block21: {
                            Err = null;
                            bFound = false;
                            i = 0;
                            h7 = 0;
                            h8 = 0;
                            SelStart = 0;
                            tmpText = "";
                            if (!(Me.myComboBoxStyle.compareTo(JBComboBoxStyle.jbDropdownCombo) == 0 | Me.myComboBoxStyle.compareTo(JBComboBoxStyle.jbDropdownComboAutocomplete) == 0)) ** GOTO lbl63
                            if (Me.getParentEditor().getText().length() == 0) break block21;
                            if (e.getKeyCode() != 10 & e.getKeyCode() < 37 | e.getKeyCode() > 40) break block22;
                            ** GOTO lbl59
                        }
                        Me.$Parent().setSelectedIndex(-1 * 1);
                        if (e.getKeyCode() != 40) {
                            Me.$Parent().setPopupVisible(false);
                        }
                        Me._Change();
                        ** GOTO lbl59
                    }
                    bFound = false;
                    if (!(Me.myComboBoxStyle.compareTo(JBComboBoxStyle.jbDropdownComboAutocomplete) == 0)) ** GOTO lbl37
                    i = 0;
                    h7 = (int)(Me.$ListCount() - (long)1);
                    h8 = 1;
                    while (i <= h7) {
                        if (Me.$Parent().getModel().getElementAt(i).toString().toLowerCase().startsWith(Me.getParentEditor().getText().toLowerCase())) {
                            bFound = true;
                            break;
                        }
                        i += h8;
                    }
lbl37:
                    // 2 sources

                    if (!(bFound == true)) break block19;
                    if (!(e.getKeyCode() == 8 & Me.$Parent().getSelectedIndex() == i)) break block23;
                    Me.$Parent().setSelectedIndex(i);
                    ** GOTO lbl59
                }
                SelStart = Me.getParentEditor().getText().length();
                Me.$Parent().setSelectedIndex(i);
                Me.getParentEditor().setText(Me.$Parent().getModel().getElementAt(i).toString());
                Me.getParentEditor().setCaretPosition(SelStart);
                Me.getParentEditor().setSelectionStart(SelStart);
                Me.getParentEditor().setSelectionEnd(Me.$Parent().getModel().getElementAt(i).toString().length());
                ** GOTO lbl59
            }
            tmpText = Me.getParentEditor().getText();
            Me.$Parent().setSelectedIndex(-1 * 1);
            Me.getParentEditor().setText(tmpText);
            Me._Change();
lbl59:
            // 5 sources

            if (e.getKeyCode() == 10) {
                Me.getParentEditor().selectAll();
            }
lbl63:
            // 4 sources

            Me._KeyUp(e.getKeyCode(), Global.KeyEventToShiftConstant(e));
lbl64:
            // 1 sources

            return;
lbl66:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            catch (Throwable v0) {}
            break block20;
            catch (Throwable v0) {}
            break block20;
            catch (Throwable v0) {
                break block20;
            }
            catch (Throwable v0) {}
            break block20;
            catch (Throwable v0) {
                break block20;
            }
            finally {
            }
        }
        var3_9 = null;
        Err = v0;
        ** while (true)
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
            ComboBox Me;
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
            ComboBox Me;
            Me.myPreviousSelectedIndex = Me.$Parent().getSelectedIndex();
            Me._KeyDown(e.getKeyCode(), Global.KeyEventToShiftConstant(e));
            if (!(Me.myComboBoxStyle.compareTo(JBComboBoxStyle.jbDropdownCombo) == 0 | Me.myComboBoxStyle.compareTo(JBComboBoxStyle.jbDropdownComboAutocomplete) == 0)) {
                return;
            }
            if (!(e.getKeyCode() == 38 | e.getKeyCode() == 40)) {
                return;
            }
            if (Me.$Parent().isPopupVisible()) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me._DropDown();
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
    public void actionPerformed(ActionEvent arg) {
        Throwable Err = null;
        try {
            ComboBox Me;
            if (Me.$Parent().getSelectedIndex() == -1 * 1) return;
            if (Me.myPreviousSelectedIndex != Me.$Parent().getSelectedIndex()) {
                Me._Click();
            }
            if (arg.getModifiers() == 16 && Me.myPreviousSelectedIndex != Me.$Parent().getSelectedIndex()) {
                Me._ListClick();
            }
            Me._Change();
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
    private JTextField getParentEditor() {
        JTextField getParentEditor = null;
        Throwable Err = null;
        try {
            ComboBox Me;
            return (JTextField)super.getEditor().getEditorComponent();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getParentEditor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Clear() {
        Throwable Err = null;
        try {
            ComboBox Me;
            Me.$Parent().removeAllItems();
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
    public void Add_Item(ListCellData Item) {
        Object var3_6;
        ComboBox Me;
        Throwable Err;
        block20: {
            block19: {
                int h7;
                int h6;
                int i;
                block18: {
                    Err = null;
                    i = 0;
                    h6 = 0;
                    h7 = 0;
                    try {
                        if (Me.mySorted) break block18;
                        break block19;
                    }
                    catch (Throwable throwable) {
                        var3_6 = null;
                        Err = throwable;
                    }
                }
                i = 0;
                h6 = Me.$Parent().getModel().getSize() - 1;
                h7 = 1;
                while (i <= h6) {
                    try {
                        if (Double.parseDouble(Me.$Parent().getModel().getElementAt(i).toString()) < Double.parseDouble(Item.toString())) break;
                    }
                    catch (Throwable throwable) {
                        var3_6 = null;
                        Err = throwable;
                    }
                    try {
                        if (Me.$Parent().getModel().getElementAt(i).toString().compareToIgnoreCase(Item.toString()) > 0) break;
                    }
                    catch (Throwable throwable) {
                        var3_6 = null;
                        Err = throwable;
                    }
                    i += h7;
                }
                try {
                    try {
                        Me.$Parent().insertItemAt((Object)Item, i);
                    }
                    catch (Throwable throwable) {
                        var3_6 = null;
                        Err = throwable;
                    }
                    break block20;
                }
                catch (Throwable throwable) {
                    var3_6 = null;
                    Err = throwable;
                }
            }
            try {
                Me.$Parent().addItem((Object)Item);
            }
            catch (Throwable throwable) {
                var3_6 = null;
                Err = throwable;
            }
        }
        try {
            Me.fireChange();
        }
        catch (Throwable throwable) {
            var3_6 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void AddItem(String Item) {
        Throwable Err = null;
        ListCellData tmpCellData = new ListCellData(Item, null, false);
        try {
            ComboBox Me;
            tmpCellData.$Owner(Me);
            Me.Add_Item(tmpCellData);
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
    public void AddItem(String Item, int Index) {
        Throwable Err = null;
        ListCellData tmpCellData = new ListCellData(Item, null, false);
        try {
            ComboBox Me;
            tmpCellData.$Owner(Me);
            Me.$Parent().insertItemAt((Object)tmpCellData, Index);
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
    public void AddItem(ListCellData Item) {
        Throwable Err = null;
        try {
            ComboBox Me;
            Item.$Owner(Me);
            Me.Add_Item(Item);
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
    public void AddItem(ListCellData Item, int Index) {
        Throwable Err = null;
        try {
            ComboBox Me;
            Item.$Owner(Me);
            Me.$Parent().insertItemAt((Object)Item, Index);
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
    public void AddItem(Usercontrol v) {
        Throwable Err = null;
        ListCellData tmpCellData = new ListCellData(v);
        try {
            ComboBox Me;
            tmpCellData.$Owner(Me);
            Me.$Parent().addItem((Object)tmpCellData);
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
    public void AddItem(Usercontrol v, int Index) {
        Throwable Err = null;
        ListCellData tmpCellData = new ListCellData(v);
        try {
            ComboBox Me;
            tmpCellData.$Owner(Me);
            Me.$Parent().insertItemAt((Object)tmpCellData, Index);
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
    public void RemoveItem(int Index) {
        Throwable Err = null;
        try {
            ComboBox Me;
            Me.$Parent().removeItemAt(Index);
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
    public boolean $Sorted() {
        boolean $Sorted = false;
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.mySorted;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Sorted;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Sorted(boolean v) {
        Throwable Err = null;
        try {
            Me.mySorted = v;
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
    public long $ListCount() {
        long $ListCount = 0L;
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.$Parent().getItemCount();
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
    public String $ListData(long Index) {
        String $ListData = "";
        Throwable Err = null;
        try {
            ComboBox Me;
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
            ComboBox Me;
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
    public String List(long Index) {
        String List2 = "";
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.$Parent().getItemAt((int)Index).toString();
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return List2;
        }
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
            ComboBox Me;
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
            ComboBox Me;
            if (!(val >= -1 * 1 & (long)val < Me.$ListCount())) {
                return;
            }
            Me.$Parent().setSelectedIndex(val);
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
    private ListCellData GetCellData(long Index) {
        ListCellData GetCellData = null;
        Throwable Err = null;
        try {
            ComboBox Me;
            return (ListCellData)Me.$Parent().getItemAt((int)Index);
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
            ComboBox Me;
            return Me.GetCellData(Index).getComponent(Me, null, (long)Me.$ListIndex() == Index, (long)Me.$ListIndex() == Index);
        }
        catch (Throwable throwable) {
            Object var5_4 = null;
            Err = throwable;
            return GetCellComponent;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Text() {
        String $Text = "";
        Throwable Err = null;
        JBComboBoxStyle h5 = new JBComboBoxStyle();
        h5 = null;
        try {
            ComboBox Me;
            h5 = Me.myComboBoxStyle;
            if (h5.compareTo(new JBComboBoxStyle(0)) == 0) return Me.getParentEditor().getText();
            if (h5.compareTo(new JBComboBoxStyle(3)) == 0) return Me.getParentEditor().getText();
            if (h5.compareTo(new JBComboBoxStyle(1)) == 0) return Me.List(Me.$ListIndex());
            if (h5.compareTo(new JBComboBoxStyle(2)) == 0) return Me.List(Me.$ListIndex());
            return $Text;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Text;
    }

    /*
     * Unable to fully structure code
     */
    public void $Text(String v) {
        block16: {
            block15: {
                Err = null;
                h5 = new JBComboBoxStyle();
                i = 0;
                h7 = 0;
                h8 = 0;
                h5 = null;
                h5 = Me.myComboBoxStyle;
                if (h5.compareTo(new JBComboBoxStyle(0)) == 0) ** GOTO lbl-1000
                if (!(h5.compareTo(new JBComboBoxStyle(3)) == 0)) {
                    if (!(h5.compareTo(new JBComboBoxStyle(1)) == 0)) {
                        if (!(h5.compareTo(new JBComboBoxStyle(2)) == 0)) {
                            break block15;
                        }
                    }
                } else lbl-1000:
                // 2 sources

                {
                    Me.getParentEditor().setText(v);
                    break block15;
                }
                i = 0;
                h7 = (int)Me.$ListCount();
                h8 = 1;
                while (i <= h7) {
                    if (Strings.StrComp(Me.List(i), v) == 0) {
                        Me.$ListIndex(i);
                        break;
                    }
                    i += h8;
                }
            }
lbl39:
            // 2 sources

            return;
lbl41:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            catch (Throwable v0) {}
            break block16;
            catch (Throwable v0) {
                break block16;
            }
            finally {
            }
        }
        var3_7 = null;
        Err = v0;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void $ComboList(String v) {
        block7: {
            Err = null;
            h7 = 0;
            h8 = 0;
            ary = new VBArray();
            i = 0;
            try {
                ary = Strings.Split(v, "|");
                Me.Clear();
                i = 0;
            }
            catch (Throwable v0) {}
            h7 = ary.getUBound(1);
            h8 = 1;
            while (i <= h7) {
                Me.AddItem(ary.valueOfStr(i));
                i += h8;
            }
lbl18:
            // 2 sources

            return;
lbl20:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            break block7;
            catch (Throwable v0) {
            }
        }
        var3_7 = null;
        Err = v0;
        ** while (true)
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
            ComboBox Me;
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
    public JBComboBoxStyle $Style() {
        JBComboBoxStyle $Style = new JBComboBoxStyle();
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.myComboBoxStyle;
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
    public void $Style(JBComboBoxStyle v) {
        Throwable Err = null;
        JBComboBoxStyle h5 = new JBComboBoxStyle();
        h5 = null;
        try {
            block4: {
                ComboBox Me;
                block3: {
                    block2: {
                        h5 = v;
                        if (h5.compareTo(new JBComboBoxStyle(0)) == 0) break block2;
                        if (h5.compareTo(new JBComboBoxStyle(3)) == 0) break block2;
                        if (h5.compareTo(new JBComboBoxStyle(1)) == 0) break block3;
                        if (h5.compareTo(new JBComboBoxStyle(2)) == 0) break block3;
                        break block4;
                    }
                    Me.$Parent().setEditable(true);
                    break block4;
                }
                Me.$Parent().setEditable(false);
            }
            Me.myComboBoxStyle = v;
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
    public boolean $DropedDown() {
        boolean $DropedDown = false;
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.$Parent().isPopupVisible();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $DropedDown;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void DropDown() {
        Throwable Err = null;
        try {
            ComboBox Me;
            Me.$Parent().setPopupVisible(true);
            Me._DropDown();
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
    public String toString() {
        String toString = "";
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.$Text();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return toString;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String $FontName() {
        String $FontName = "";
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.$Parent().getFont().getFamily();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return $FontName;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontName(String val) {
        Throwable Err = null;
        try {
            ComboBox Me;
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean $FontBold() {
        boolean $FontBold = false;
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.$Parent().getFont().isBold();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return $FontBold;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontBold(boolean val) {
        Throwable Err = null;
        try {
            ComboBox Me;
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean $FontItalic() {
        boolean $FontItalic = false;
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.$Parent().getFont().isItalic();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return $FontItalic;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontItalic(boolean val) {
        Throwable Err = null;
        try {
            ComboBox Me;
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int $FontSize() {
        int $FontSize = 0;
        Throwable Err = null;
        try {
            ComboBox Me;
            return Global.JFontSizeToVBFontSize(Me.$Font().getSize());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return $FontSize;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontSize(int val) {
        Throwable Err = null;
        try {
            ComboBox Me;
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Font $Font() {
        Font $Font = null;
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.$Parent().getFont();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return $Font;
        }
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
            ComboBox Me;
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
            ComboBox Me;
            Me.$Parent().setBackground(Information.RGBtoColor(v));
            if (!(Me.myComboBoxStyle.intValue() == 0 | Me.myComboBoxStyle.intValue() == 3)) {
                return;
            }
            Me.getParentEditor().setOpaque(true);
            Me.getParentEditor().setBackground(Me.$Parent().getBackground());
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
            ComboBox Me;
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
            ComboBox Me;
            Me.$Parent().setForeground(Information.RGBtoColor(v));
            Me.getParentEditor().setForeground(Me.$Parent().getForeground());
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
            ComboBox Me;
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
            ComboBox Me;
            Me.setSize((int)v, Me.getSize().height);
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
            ComboBox Me;
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
            ComboBox Me;
            Me.setSize(Me.getSize().width, (int)v);
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
            ComboBox Me;
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
    @Override
    public void Refresh() {
        Throwable Err = null;
        try {
            ComboBox Me;
            Me.$Parent().invalidate();
            Me.$Parent().repaint(0, 0, 0, (int)Me.$Width(), (int)Me.$Height());
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
    private void fireChange() {
        Throwable Err = null;
        try {
            ComboBox Me;
            Me.Refresh();
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
    public void $BackColorSel(long color) {
        Throwable Err = null;
        try {
            Me.myBackColorSel = color;
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
            ComboBox Me;
            return Me.myBackColorSel;
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
    public void $MarginItem(long margin) {
        Throwable Err = null;
        try {
            Me.myMarginItem = margin;
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
            ComboBox Me;
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
    @Override
    public void $BorderColorSel(long color) {
        Throwable Err = null;
        try {
            Me.myBorderColorSel = color;
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
            ComboBox Me;
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
    public long $ForeColorSel() {
        long $ForeColorSel = 0L;
        Throwable Err = null;
        try {
            ComboBox Me;
            return Me.myForeColorSel;
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
    public void $ForeColorSel(long color) {
        Throwable Err = null;
        try {
            Me.myForeColorSel = color;
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
    public Font getFont() {
        Font getFont = null;
        Throwable Err = null;
        try {
            ComboBox Me;
            return super.getFont();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getFont;
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
            ComboBox Me;
            return Information.RGBtoColor(Me.$BackColorSel());
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
            ComboBox Me;
            return Information.RGBtoColor(Me.$ForeColorSel());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getSelectionForeground;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Color getBackground() {
        Color getBackground = null;
        Throwable Err = null;
        try {
            ComboBox Me;
            return super.getBackground();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getBackground;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Color getForeground() {
        Color getForeground = null;
        Throwable Err = null;
        try {
            ComboBox Me;
            return super.getForeground();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getForeground;
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
            ComboBox Me;
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
            ComboBox Me;
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
        ComboBox Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        ComboBox Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        ComboBox Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }

    public ComboBox() {
        ComboBox Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        ComboBox Me;
        Me.myComboBoxStyle = new JBComboBoxStyle();
        Me.myTag = "";
        Me.myMouseIcon = null;
        Me.myRenderer = new ListCellDataRenderer(Me);
        Me.myBorderColorSel = 0L;
        Me.myMarginItem = 0L;
        Me.myForeColorSel = 0L;
        Me.myBackColorSel = 0L;
        Me.myBackColorAlternating = 0L;
        Me.myPreviousSelectedIndex = 0;
        Me.mySorted = false;
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
