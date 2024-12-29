/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AnchorStyles;
import VB.ChangeType;
import VB.Global;
import VB.IJabacoControl;
import VB.MousePointerConstants;
import VB.fmBorderStyle;
import VB.fmSpecialEffect;
import VB.vbScrollBarPolicy;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.TabAction;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextBox
extends JScrollPane
implements IJabacoControl,
MouseListener,
MouseMotionListener,
KeyListener,
FocusListener,
DocumentListener {
    private fmBorderStyle myBorderStyle;
    private fmSpecialEffect mySpecialEffect;
    private long myBorderColor;
    private String myTag;
    private JTextArea myText;
    private Action MemTabAction;
    private Action MemShiftTabAction;
    private boolean MemSetTabAction;
    private Border myDefaultBorder;
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

    public void _Change(ChangeType ChangeType2, DocumentEvent ChangeEvt) {
    }

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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JTextArea $Parent() {
        JTextArea $Parent = null;
        Throwable Err = null;
        try {
            TextBox Me;
            return Me.myText;
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
        TextBox Me;
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
            Me.setViewportView(Me.myText);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            Me.$Parent().getDocument().addDocumentListener(Me);
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
            TextBox Me;
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
            TextBox Me;
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
    public void insertUpdate(DocumentEvent evt) {
        Throwable Err = null;
        try {
            TextBox Me;
            Me._Change(ChangeType.vbChangeInsert, evt);
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
    public void removeUpdate(DocumentEvent evt) {
        Throwable Err = null;
        try {
            TextBox Me;
            Me._Change(ChangeType.vbChangeRemove, evt);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    @Override
    public void changedUpdate(DocumentEvent evt) {
        Object Err = null;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
            Me._MouseUp(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
            if (!(e.getX() > 0 & e.getY() > 0 & e.getX() < Me.getWidth() & e.getY() < Me.getHeight())) {
                return;
            }
            if (e.getClickCount() % 2 == 0) {
                Me._DblClick();
                return;
            }
            Me._Click();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object Err = null;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
            Me._KeyUp(Global.KeyEventToKeyCode(e), Global.KeyEventToShiftConstant(e));
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
            TextBox Me;
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
            TextBox Me;
            if (!Me.$MultiLine() && e.getKeyCode() == KeyEvent.VK_ENTER) {
                e.consume();
            }
            Me._KeyDown(Global.KeyEventToKeyCode(e), Global.KeyEventToShiftConstant(e));
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
    public fmBorderStyle $BorderStyle() {
        fmBorderStyle $BorderStyle = new fmBorderStyle();
        Throwable Err = null;
        try {
            TextBox Me;
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
            TextBox Me;
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
    public vbScrollBarPolicy $HScrollBar() {
        vbScrollBarPolicy $HScrollBar = new vbScrollBarPolicy();
        Throwable Err = null;
        try {
            TextBox Me;
            return Global.JScrollBarToVBScrollBarPolicy(super.getHorizontalScrollBarPolicy());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $HScrollBar;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $HScrollBar(vbScrollBarPolicy v) {
        Throwable Err = null;
        try {
            TextBox Me;
            super.setHorizontalScrollBarPolicy(Global.VBScrollBarToJScrollBarPolicy(v, true));
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
    public vbScrollBarPolicy $VScrollBar() {
        vbScrollBarPolicy $VScrollBar = new vbScrollBarPolicy();
        Throwable Err = null;
        try {
            TextBox Me;
            Me.$HScrollBar(Global.JScrollBarToVBScrollBarPolicy(super.getVerticalScrollBarPolicy()));
            return $VScrollBar;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $VScrollBar;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $VScrollBar(vbScrollBarPolicy v) {
        Throwable Err = null;
        try {
            TextBox Me;
            super.setVerticalScrollBarPolicy(Global.VBScrollBarToJScrollBarPolicy(v, false));
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
    public long $SelStart() {
        long $SelStart = 0L;
        Throwable Err = null;
        try {
            TextBox Me;
            return Me.$Parent().getSelectionStart();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $SelStart;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $SelStart(long v) {
        Throwable Err = null;
        try {
            TextBox Me;
            Me.$Parent().setSelectionStart((int)v);
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
    public long $SelLength() {
        long $SelLength = 0L;
        Throwable Err = null;
        try {
            TextBox Me;
            return (long)Me.$Parent().getSelectionStart() - Me.$SelStart();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $SelLength;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $SelLength(long v) {
        Throwable Err = null;
        try {
            TextBox Me;
            Me.myText.setSelectionEnd((int)(Me.$SelStart() + v));
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
    public String $Text() {
        String $Text = "";
        Throwable Err = null;
        try {
            TextBox Me;
            return Me.$Parent().getText();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Text;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Text(String s) {
        Throwable Err = null;
        try {
            TextBox Me;
            Me.$Parent().setText(s);
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
    public long $BackColorSel() {
        long $BackColorSel = 0L;
        Throwable Err = null;
        try {
            TextBox Me;
            return Information.ColorToRGB(Me.$Parent().getSelectionColor());
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
            TextBox Me;
            if (v == (long)(-1 * 1)) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.$Parent().setSelectionColor(Information.RGBtoColor(v));
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
            TextBox Me;
            return Information.ColorToRGB(Me.$Parent().getSelectedTextColor());
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
            TextBox Me;
            if (v == (long)(-1 * 1)) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.$Parent().setSelectedTextColor(Information.RGBtoColor(v));
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
    public boolean $MultiLine() {
        boolean $MultiLine = false;
        Throwable Err = null;
        try {
            TextBox Me;
            return Me.$Parent().getLineWrap();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MultiLine;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $MultiLine(boolean v) {
        Throwable Err = null;
        try {
            TextBox Me;
            Me.$Parent().setLineWrap(v);
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
    public int $TabSize() {
        int $TabSize = 0;
        Throwable Err = null;
        try {
            TextBox Me;
            return Me.$Parent().getTabSize();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $TabSize;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $TabSize(int v) {
        Throwable Err = null;
        try {
            TextBox Me;
            Me.$Parent().setTabSize(v);
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
    public void InsertText(String val, int pos) {
        Throwable Err = null;
        try {
            TextBox Me;
            Me.$Parent().insert(val, pos);
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
    public void AppendText(String val) {
        Throwable Err = null;
        try {
            TextBox Me;
            Me.$Parent().append(val);
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
    public int $LineCount() {
        int $LineCount = 0;
        Throwable Err = null;
        try {
            TextBox Me;
            return Me.$Parent().getLineCount();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $LineCount;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $ForwardTab() {
        boolean $ForwardTab = false;
        Throwable Err = null;
        try {
            TextBox Me;
            return Me.MemSetTabAction;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ForwardTab;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ForwardTab(boolean v) {
        TextBox Me;
        Throwable Err = null;
        InputMap im = Me.$Parent().getInputMap();
        KeyStroke tab = KeyStroke.getKeyStroke("TAB");
        VBVariant shiftTab = VBVariant.valueOf(KeyStroke.getKeyStroke("shift TAB"));
        try {
            im.put((KeyStroke)shiftTab.toObject(), shiftTab.toObject());
            if (v) {
                Me.MemTabAction = Me.$Parent().getActionMap().get(im.get(tab));
                Me.MemShiftTabAction = Me.$Parent().getActionMap().get(im.get((KeyStroke)shiftTab.toObject()));
                Me.MemSetTabAction = true;
                Me.$Parent().getActionMap().put(im.get(tab), new TabAction(true));
                Me.$Parent().getActionMap().put(im.get((KeyStroke)shiftTab.toObject()), new TabAction(false));
                return;
            }
            if (!Me.MemSetTabAction) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.$Parent().getActionMap().put(im.get(tab), Me.MemTabAction);
            Me.$Parent().getActionMap().put(im.get((KeyStroke)shiftTab.toObject()), Me.MemShiftTabAction);
            Me.MemSetTabAction = false;
            return;
        }
        catch (Throwable throwable) {
            Object var3_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Locked() {
        boolean $Locked = false;
        Throwable Err = null;
        try {
            TextBox Me;
            if (!Me.$Parent().isEditable()) return true;
            return false;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Locked;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Locked(boolean v) {
        Throwable Err = null;
        try {
            TextBox Me;
            Me.$Parent().setEditable(!v);
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
    public String toString() {
        String toString = "";
        Throwable Err = null;
        try {
            TextBox Me;
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $FontName() {
        String $FontName = "";
        Throwable Err = null;
        try {
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
            if (v != (long)(-1 * 1)) {
                Me.$Parent().setBackground(Information.RGBtoColor(v));
            }
            super.setBackground(Me.$Parent().getBackground());
            Me.$Parent().setCaretColor(new Color((int)Information.RGB(Me.$Parent().getBackground().getBlue() ^ 0xFF, Me.$Parent().getBackground().getGreen() ^ 0xFF, Me.$Parent().getBackground().getRed() ^ 0xFF)));
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
            TextBox Me;
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
            TextBox Me;
            if (v != (long)(-1 * 1)) {
                Me.$Parent().setForeground(Information.RGBtoColor(v));
            }
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
            return Me.$Parent().isEnabled();
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
            TextBox Me;
            Me.$Parent().setEnabled(v);
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
            TextBox Me;
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
        Object var2_2;
        TextBox Me;
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
            return;
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
            TextBox Me;
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
            TextBox Me;
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
        TextBox Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        TextBox Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        TextBox Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }

    public TextBox() {
        TextBox Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        Me.myBorderStyle = new fmBorderStyle();
        Me.mySpecialEffect = new fmSpecialEffect();
        Me.myBorderColor = 0L;
        Me.myTag = "";
        Me.myText = new JTextArea();
        Me.MemTabAction = null;
        Me.MemShiftTabAction = null;
        Me.MemSetTabAction = false;
        Me.myDefaultBorder = null;
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
