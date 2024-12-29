/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AnchorStyles;
import VB.Collection;
import VB.Global;
import VB.IJabacoControl;
import VB.MODTYPE;
import VB.MousePointerConstants;
import VB.RTFCursorState;
import VB.RTStyle;
import VB.RichTextBox$RTTextPane;
import VB.fmBorderStyle;
import VB.fmSpecialEffect;
import VB.vbScrollBarPolicy;
import VBA.Constants;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;
import java.io.StringReader;
import java.util.LinkedList;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.rtf.RTFEditorKit;

public class RichTextBox
extends JScrollPane
implements IJabacoControl,
MouseListener,
MouseMotionListener,
KeyListener,
FocusListener,
AdjustmentListener {
    private fmBorderStyle myBorderStyle;
    private fmSpecialEffect mySpecialEffect;
    private long myBorderColor;
    private String myTag;
    private IResource myMouseIcon;
    private StyleContext myStyle;
    private long myStyleCount;
    private Collection myCursorHive;
    private LinkedList myCursorHiveLL;
    private IResource myHTMLPath;
    private RichTextBox$RTTextPane myText;
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

    public void _Paint(Graphics g) {
    }

    public void _Scroll(float X, float Y) {
    }

    public void _Modified(MODTYPE action, DocumentEvent e) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JTextPane $Parent() {
        JTextPane $Parent = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
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
        RichTextBox Me;
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
            super.setOpaque(false);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            super.getVerticalScrollBar().addAdjustmentListener(Me);
        }
        catch (Throwable throwable) {
            var2_2 = null;
            Err = throwable;
        }
        try {
            super.getHorizontalScrollBar().addAdjustmentListener(Me);
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void adjustmentValueChanged(AdjustmentEvent arg2) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me._Scroll(Me.$HScrollPos(), Me.$VScrollPos());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $HScrollPos() {
        Object var3_3;
        RichTextBox Me;
        int $HScrollPos = 0;
        Throwable Err = null;
        try {
            if (Double.valueOf(super.getHorizontalScrollBar().toString()).intValue() != 0) return $HScrollPos;
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            if (Double.valueOf(super.getHorizontalScrollBar().getModel().toString()).intValue() != 0) return $HScrollPos;
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            return super.getHorizontalScrollBar().getModel().getValue();
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return $HScrollPos;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $HScrollPos(int v) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            super.getHorizontalScrollBar().getModel().setValue(v);
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
    public int $VScrollPos() {
        Object var3_3;
        RichTextBox Me;
        int $VScrollPos = 0;
        Throwable Err = null;
        try {
            if (Double.valueOf(super.getVerticalScrollBar().toString()).intValue() != 0) return $VScrollPos;
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            if (Double.valueOf(super.getVerticalScrollBar().getModel().toString()).intValue() != 0) return $VScrollPos;
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            return super.getVerticalScrollBar().getModel().getValue();
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return $VScrollPos;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $VScrollPos(int v) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            super.getVerticalScrollBar().getModel().setValue(v);
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
    public int $HScrollMax() {
        int $HScrollMax = 0;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return super.getHorizontalScrollBar().getModel().getMaximum() - super.getViewport().getWidth();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $HScrollMax;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $VScrollMax() {
        int $VScrollMax = 0;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return super.getVerticalScrollBar().getModel().getMaximum() - super.getViewport().getHeight();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $VScrollMax;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
            return (long)Me.$Parent().getSelectionEnd() - Me.$SelStart();
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
            RichTextBox Me;
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
    public String $SelText() {
        String $SelText = "";
        Throwable Err = null;
        try {
            RichTextBox Me;
            return Me.$Parent().getSelectedText();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $SelText;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $SelText(String v) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.$Parent().replaceSelection(v);
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
    public IResource $HtmlFile() {
        IResource $HtmlFile = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return Me.myHTMLPath;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $HtmlFile;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void $HtmlFile(IResource Path) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            if (Strings.Len(Path.toString()) > 0) {
                Me.myText.setContentType("text/html");
                Me.myText.setAutoscrolls(true);
                Me.myText.setPage(Me.$Parent().getClass().getResource(Strings.StrMerge("/", Path.toString())));
                return;
            }
            Me.myText.setContentType("text/plain");
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void appendText(String text) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.insertText(text, Me.$Parent().getStyledDocument().getLength());
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
    public void replaceText(String text, int pos, int length) {
        Throwable throwable2;
        Throwable Err;
        block5: {
            boolean MemLocked;
            RichTextBox Me;
            Err = null;
            try {
                Me.saveCursorState();
                Me.$SelStart(pos);
                Me.$SelLength(length);
                MemLocked = Me.$Locked();
            }
            catch (Throwable throwable2) {
                break block5;
            }
            Me.$Locked(false);
            Me.$Parent().replaceSelection(text);
            Me.$Locked(MemLocked);
            Me.restoreCursorState();
        }
        Object var5_6 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void insertText(String text, int pos) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.replaceText(text, pos, 0);
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
    public void insertText(String text, int pos, boolean Bold, boolean Italic, long TextColor) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$Bold(Bold);
            tmpStyle.$Italic(Italic);
            tmpStyle.$TextColor(TextColor);
            Me.insertText(text, pos, tmpStyle);
            return;
        }
        catch (Throwable throwable) {
            Object var8_8 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void insertText(String text, int pos, RTStyle style) {
        RichTextBox Me;
        Throwable Err = null;
        int iOldLen = Strings.Len(Me.$Text());
        try {
            Me.insertText(text, pos);
            Me.setStyle(pos, (long)Strings.Len(text), style, true);
            return;
        }
        catch (Throwable throwable) {
            Object var5_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void replaceText(String text, int pos, int length, boolean Bold, boolean Italic, long TextColor) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$Bold(Bold);
            tmpStyle.$Italic(Italic);
            tmpStyle.$TextColor(TextColor);
            Me.replaceText(text, pos, length, tmpStyle);
            return;
        }
        catch (Throwable throwable) {
            Object var9_9 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void replaceText(String text, int pos, int length, RTStyle style) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.replaceText(text, pos, length);
            Interaction.MsgBox(String.valueOf(Strings.Len(text)));
            Me.setStyle(pos, (long)Strings.Len(text), style, true);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void appendText(String text, boolean Bold, boolean Italic, long TextColor) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$Bold(Bold);
            tmpStyle.$Italic(Italic);
            tmpStyle.$TextColor(TextColor);
            Me.appendText(text, tmpStyle);
            return;
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void appendText(String text, RTStyle style) {
        RichTextBox Me;
        Throwable Err = null;
        int iOldLen = Strings.Len(Me.$Text());
        try {
            Me.appendText(text);
            Me.setStyle(iOldLen, (long)Strings.Len(text), style, true);
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
    private void saveCursorState() {
        Throwable Err = null;
        RTFCursorState tmpItem = new RTFCursorState();
        try {
            RichTextBox Me;
            tmpItem.Redraw = Me.$Redraw();
            tmpItem.SelStart = (int)Me.$SelStart();
            tmpItem.SelLength = (int)Me.$SelLength();
            tmpItem.VScrollPos = Me.$VScrollPos();
            tmpItem.HScrollPos = Me.$HScrollPos();
            Me.myCursorHiveLL.addLast((Object)tmpItem);
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
    private void restoreCursorState() {
        Throwable Err = null;
        RTFCursorState tmpItem = new RTFCursorState();
        try {
            RichTextBox Me;
            if (Me.myCursorHiveLL.size() < 1) return;
            tmpItem = (RTFCursorState)((RTFCursorState)Me.myCursorHiveLL.removeLast()).clone();
            Me.$SelStart(tmpItem.SelStart);
            Me.$SelLength(tmpItem.SelLength);
            Me.revalidateRT();
            Me.$VScrollPos(tmpItem.VScrollPos);
            Me.$HScrollPos(tmpItem.HScrollPos);
            Me.$Redraw(tmpItem.Redraw);
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
    public void revalidateRT() {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.$Parent().revalidate();
            Me.$Parent().updateUI();
            super.revalidate();
            super.updateUI();
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
    public boolean $Redraw() {
        boolean $Redraw = false;
        Throwable Err = null;
        try {
            RichTextBox Me;
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
            RichTextBox Me;
            super.setIgnoreRepaint(!v);
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
    public StyleContext setStyle(int start, long length, RTStyle style, boolean overwrite) {
        StyleContext setStyle = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.$StyledDoc().setCharacterAttributes(start, (int)length, style.getStyle(), overwrite);
            return setStyle;
        }
        catch (Throwable throwable) {
            Object var8_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return setStyle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public StyleContext setStyle(int start, long length, Style style, boolean overwrite) {
        StyleContext setStyle = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.$StyledDoc().setCharacterAttributes(start, (int)length, style, overwrite);
            return setStyle;
        }
        catch (Throwable throwable) {
            Object var8_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return setStyle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public RTStyle getStyle(int pos) {
        RTStyle getStyle = null;
        Throwable Err = null;
        Style tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.$StyledDoc().getLogicalStyle(pos);
            if (tmpStyle != null) return new RTStyle(tmpStyle);
            return getStyle;
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getStyle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getText(int start, int length) {
        String getText = "";
        Throwable Err = null;
        try {
            RichTextBox Me;
            if (start < 1) return getText;
            if (length < 0) return getText;
            return Strings.Mid(Me.$Text(), start, length);
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getText;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int GetPosByXY(int x, int y) {
        int GetPosByXY = 0;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return Me.GetPosByXY(new Point(x, y));
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetPosByXY;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int GetPosByXY(Point v) {
        int GetPosByXY = 0;
        Throwable Err = null;
        int ret = 0;
        try {
            RichTextBox Me;
            ret = Me.$Parent().viewToModel(v);
            return ret;
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetPosByXY;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Point GetXYByPos(int pos) {
        Point GetXYByPos = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return Me.$Parent().modelToView(pos).getLocation();
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetXYByPos;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Rectangle GetRectByPos(int pos) {
        Rectangle GetRectByPos = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return Me.$Parent().modelToView(pos);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetRectByPos;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setBidiLevel(int start, long length, int v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$BidiLevel(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setSuperscript(int start, long length, boolean v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$Superscript(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setSubscript(int start, long length, boolean v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$Subscript(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setSpaceAbove(int start, long length, float v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$SpaceAbove(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setSpaceBelow(int start, long length, float v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$SpaceBelow(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setRightIndent(int start, long length, float v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$RightIndent(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setLeftIndent(int start, long length, float v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$LeftIndent(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setFirstLineIndent(int start, long length, float v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$FirstLineIndent(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setBold(int start, long length, boolean v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$Bold(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setItalic(int start, long length, boolean v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$Italic(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setUnderline(int start, long length, boolean v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$Underline(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setFontName(int start, long length, String v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$FontName(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setFontSize(int start, long length, int v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$FontSize(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setTextColor(int start, long length, long v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$TextColor(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var7_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setBackColor(int start, long length, long v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$BackColor(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var7_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setIcon(int start, long length, IResource v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$Icon(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setStrikeThrough(int start, long length, boolean v) {
        Throwable Err = null;
        RTStyle tmpStyle = null;
        try {
            RichTextBox Me;
            tmpStyle = Me.createStyle();
            tmpStyle.$StrikeThrough(v);
            Me.setStyle(start, length, tmpStyle, false);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public RTStyle createStyle() {
        RTStyle createStyle = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return new RTStyle(Me.$StyledDoc().addStyle(null, null));
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createStyle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public RTStyle createStyle(String styleName) {
        RTStyle createStyle = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return new RTStyle(Me.$StyledDoc().addStyle(styleName, null));
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createStyle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void removeStyle(String styleName) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.$StyledDoc().removeStyle(styleName);
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
    public StyledDocument $StyledDoc() {
        StyledDocument $StyledDoc = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return Me.$Parent().getStyledDocument();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $StyledDoc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public StyleContext $StyleContext() {
        StyleContext $StyleContext = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return Me.myStyle;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $StyleContext;
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
            RichTextBox Me;
            return Me.$Parent().getDocument().getText(0, Me.$Parent().getDocument().getLength());
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
        RichTextBox Me;
        Throwable Err = null;
        Document tmpDoc = Me.$Parent().getDocument();
        try {
            tmpDoc.remove(0, tmpDoc.getLength());
            Me.$Parent().getEditorKit().read(new StringReader(s), tmpDoc, 0);
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
    public void Print(String s) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.$Text(Strings.StrCat(Strings.StrCat(Me.$Text(), s), Constants.vbNewLine));
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
    public void LoadFile(String FileName) {
        Object var3_6;
        FileInputStream fis;
        Throwable Err;
        block16: {
            block15: {
                RichTextBox Me;
                Err = null;
                fis = new FileInputStream(FileName);
                DefaultStyledDocument doc = new DefaultStyledDocument(new StyleContext());
                RTFEditorKit kit = new RTFEditorKit();
                try {
                    Me.$Parent().setEditorKit(kit);
                }
                catch (Throwable throwable) {
                    var3_6 = null;
                    Err = throwable;
                }
                try {
                    Me.$Parent().setDocument(doc);
                }
                catch (Throwable throwable) {
                    var3_6 = null;
                    Err = throwable;
                }
                try {
                    kit.read(fis, (Document)doc, 0);
                }
                catch (Throwable throwable) {
                    var3_6 = null;
                    Err = throwable;
                }
                try {
                    if (Err != null) break block15;
                    break block16;
                }
                catch (Throwable throwable) {
                    var3_6 = null;
                    Err = throwable;
                }
            }
            try {
                Interaction.MsgBox(Err.getMessage());
            }
            catch (Throwable throwable) {
                var3_6 = null;
                Err = throwable;
            }
        }
        try {
            fis.close();
        }
        catch (Throwable throwable) {
            var3_6 = null;
            Err = throwable;
            return;
        }
    }

    public String $StyledText() {
        String $StyledText = "";
        Object Err = null;
        return $StyledText;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public StyledDocument $Style() {
        StyledDocument $Style = null;
        Throwable Err = null;
        try {
            RichTextBox Me;
            return Me.$Parent().getStyledDocument();
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
    public void InsertIcon(IResource IconPath, int pos) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.saveCursorState();
            Me.$SelStart(pos);
            Me.$SelLength(0);
            Me.InsertIcon(IconPath);
            Me.restoreCursorState();
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
    public void InsertComponent(Component v, int pos) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.saveCursorState();
            Me.$SelStart(pos);
            Me.$SelLength(0);
            Me.InsertComponent(v);
            Me.restoreCursorState();
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
    public void InsertIcon(IResource IconPath) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.$Parent().insertIcon(Global.LoadIcon(IconPath));
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
    public void InsertComponent(Component v) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me.$Parent().insertComponent(v);
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
            Me.$BackColorSel(Information.ColorToRGB(Me.$Parent().getSelectedTextColor()));
            return $ForeColorSel;
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
            RichTextBox Me;
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
    @Override
    public String toString() {
        String toString = "";
        Throwable Err = null;
        try {
            RichTextBox Me;
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
    public boolean $Locked() {
        boolean $Locked = false;
        Throwable Err = null;
        try {
            RichTextBox Me;
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
            RichTextBox Me;
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
    public void myText_Paint(Graphics g) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me._Paint(g);
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
            if (v != (long)(-1 * 1)) {
                Me.$Parent().setBackground(Information.RGBtoColor(v));
            }
            super.setBackground(Me.$Parent().getBackground());
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
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
            RichTextBox Me;
            Me.$Parent().invalidate();
            Me.$Parent().repaint(0, 0, 0, (int)Me.$Width(), (int)Me.$Height());
            Me.$Parent().setSize(Me.getSize());
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
    public void myText_Modified(MODTYPE action, DocumentEvent e) {
        Throwable Err = null;
        try {
            RichTextBox Me;
            Me._Modified(action, e);
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
    public void ResizeTriggerInit(float w, float h) {
        Throwable Err = null;
        try {
            RichTextBox Me;
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
            RichTextBox Me;
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
        RichTextBox Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        RichTextBox Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        RichTextBox Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }

    public RichTextBox() {
        RichTextBox Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        RichTextBox Me;
        Me.myBorderStyle = new fmBorderStyle();
        Me.mySpecialEffect = new fmSpecialEffect();
        Me.myBorderColor = 0L;
        Me.myTag = "";
        Me.myMouseIcon = null;
        Me.myStyle = new StyleContext();
        Me.myStyleCount = 0L;
        Me.myCursorHive = new Collection();
        Me.myCursorHiveLL = new LinkedList();
        Me.myHTMLPath = null;
        Me.myText = new RichTextBox$RTTextPane();
        Me.myText.setOwner(Me, 1);
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
