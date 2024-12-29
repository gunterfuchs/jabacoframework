/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.FormWindowStateConstants;
import VB.Frame;
import VB.Global;
import VB.IJabacoContainer;
import VB.IJabacoControl;
import VB.ILoadAdapter;
import VB.IMenuItem;
import VB.IToolBarItem;
import VB.LoadAdapter;
import VB.MDIChild$PictureBox;
import VB.MDIChildFocusHandler;
import VB.MousePointerConstants;
import VB.PictureBox;
import VB.StartUpPositionConstants;
import VB.fmBorderStyle;
import VBA.IResource;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBVariant;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JInternalFrame;

public class MDIChild
extends JInternalFrame
implements ILoadAdapter,
ComponentListener,
IJabacoContainer {
    private boolean myInitLookAndFeelFlag;
    private boolean FormLoaded;
    private boolean StartUpVisible;
    private StartUpPositionConstants StartUpPositionVal;
    private String myTag;
    private IResource myMouseIcon;
    private IResource myIcon;
    private MDIChildFocusHandler myMDIChildFocusHandler;
    private MDIChild$PictureBox myContent;

    /*
     * Unable to fully structure code
     */
    public void add(Component Component) {
        block9: {
            block8: {
                Err = null;
                Component2 = null;
                if (!(Component instanceof IJabacoControl != false)) ** GOTO lbl9
                Component2 = (IJabacoControl)Component;
                Component2.ResizeTriggerInit(Me.$Width(), Me.$Height());
lbl9:
                // 2 sources

                if (Me.myContent == null) {
                    super.getContentPane().add(Component);
                    break block8;
                }
                Me.myContent.add(Component);
            }
lbl16:
            // 2 sources

            return;
lbl18:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            catch (Throwable v0) {
                break block9;
            }
            finally {
            }
        }
        var3_4 = null;
        Err = v0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JInternalFrame $Parent() {
        MDIChild $Parent = null;
        Throwable Err = null;
        try {
            MDIChild Me;
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
            MDIChild Me;
            Me.myContent.$BorderStyle(fmBorderStyle.fmBorderStyleNone);
            super.getContentPane().add(Me.myContent);
            Me.myMDIChildFocusHandler = new MDIChildFocusHandler(Me);
            Me.$Parent().addPropertyChangeListener(Me.myMDIChildFocusHandler);
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
    public MDIChild() {
        MDIChild Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.FormLoaded = false;
            if (Global.$GlobalMDIForm() != null) {
                Global.$GlobalMDIForm().addChild(Me);
            }
            Me.Class_Initialize();
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
    @Override
    public void fireLoaded() {
        MDIChild Me;
        Throwable Err = null;
        LoadAdapter tmpFireAdapter = new LoadAdapter(Me, Me);
        try {
            tmpFireAdapter.fireLoaded();
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
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
    public void fireLoaded(Object sender) {
        MDIChild Me;
        Throwable Err = null;
        boolean MemVisible = Me.isVisible();
        try {
            Me.$Height(Me.$Height() + (Me.$Height() - (float)Me.$Parent().getContentPane().getHeight()));
            Me.$Width(Me.$Width() + (Me.$Width() - (float)Me.$Parent().getContentPane().getWidth()));
            Me.Form_Load();
            Me.myContent.$Visible(true);
            Me.setVisible(MemVisible);
            Me.FormLoaded = true;
            Me.$Visible(Me.StartUpVisible);
            Me.$Parent().addComponentListener(Me);
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
    @Override
    public void dispose() {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_Unload();
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
    @Override
    public void componentHidden(ComponentEvent e) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_Deactivate();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void componentMoved(ComponentEvent e) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_Move();
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
    @Override
    public void componentResized(ComponentEvent e) {
        Object var3_3;
        MDIChild Me;
        Throwable Err = null;
        try {
            Me.Form_Resize();
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            Me.AnchorResize();
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void componentShown(ComponentEvent e) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_Activate();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    public void Form_Activate() {
        Object Err = null;
    }

    public void Form_Deactivate() {
        Object Err = null;
    }

    public void Form_GotFocus() {
        Object Err = null;
    }

    public void Form_LostFocus() {
        Object Err = null;
    }

    public void Form_Load() {
        Object Err = null;
    }

    public void Form_Resize() {
        Object Err = null;
    }

    public void Form_Move() {
        Object Err = null;
    }

    public void Form_MenuClick(IMenuItem MenuItem) {
        Object Err = null;
    }

    public void Form_ToolBarClick(IToolBarItem ToolBarItem) {
        Object Err = null;
    }

    public void Form_Click() {
        Object Err = null;
    }

    public void Form_DblClick() {
        Object Err = null;
    }

    public void Form_KeyDown(int KeyCode, int Shift) {
        Object Err = null;
    }

    public void Form_KeyPress(int KeyAscii) {
        Object Err = null;
    }

    public void Form_KeyUp(int KeyCode, int Shift) {
        Object Err = null;
    }

    public void Form_MouseDown(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Form_MouseMove(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Form_MouseUp(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Form_Paint(Graphics g) {
        Object Err = null;
    }

    public int Form_Unload() {
        int Form_Unload = 0;
        Object Err = null;
        return Form_Unload;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void myContent_MouseUp(int Button, int Shift, float X, float Y) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_MouseUp(Button, Shift, X, Y);
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
    public void myContent_MouseMove(int Button, int Shift, float X, float Y) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_MouseMove(Button, Shift, X, Y);
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
    public void myContent_MouseDown(int Button, int Shift, float X, float Y) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_MouseDown(Button, Shift, X, Y);
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
    public void myContent_Click() {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_Click();
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
    public void myContent_DblClick() {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_DblClick();
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
    public void myContent_KeyDown(int KeyCode, int Shift) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_KeyDown(KeyCode, Shift);
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
    public void myContent_KeyPress(int KeyAscii) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_KeyPress(KeyAscii);
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
    public void myContent_KeyUp(int KeyCode, int Shift) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_KeyUp(KeyCode, Shift);
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
    public void myContent_Paint(Graphics g) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_Paint(g);
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
    public void myMenuBar_Click(IMenuItem MenuItem) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_MenuClick(MenuItem);
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
    public void myToolBar_Click(IToolBarItem ToolBarItem) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.Form_ToolBarClick(ToolBarItem);
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
    public int $Transparency() {
        int $Transparency = 0;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$Transparency();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Transparency;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Transparency(int v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.$Transparency(v);
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
    public boolean $AntiAliasing() {
        boolean $AntiAliasing = false;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$AntiAliasing();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AntiAliasing;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $AntiAliasing(boolean v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.$AntiAliasing(v);
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
    public boolean $AutoRedraw() {
        boolean $AutoRedraw = false;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$AutoRedraw();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AutoRedraw;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $AutoRedraw(boolean v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            if (!Me.FormLoaded) {
                Me.myContent.$Visible(v);
            }
            Me.myContent.$AutoRedraw(v);
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
    public IResource $Picture() {
        IResource $Picture = null;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$Picture();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Picture;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Picture(IResource Path) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.$Picture(Path);
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
    public int $DrawWidth() {
        int $DrawWidth = 0;
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.$Transparency(Me.myContent.$DrawWidth());
            return $DrawWidth;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $DrawWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $DrawWidth(int v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.$DrawWidth(v);
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
    public void PSet(float x, float y) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.PSet(x, y);
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
    public void PSet(float x, float y, long col) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.PSet(x, y, col);
            return;
        }
        catch (Throwable throwable) {
            Object var6_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Line(float x, float y) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.Line(x, y);
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
    public void Line(float x1, float y1, float x2, float y2) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.Line(x1, y1, x2, y2);
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
    public void Line(float x1, float y1, float x2, float y2, boolean Rect) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.Line(x1, y1, x2, y2, Rect);
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
    public void Line(float x1, float y1, float x2, float y2, boolean Rect, long FillColor) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.Line(x1, y1, x2, y2, Rect, FillColor);
            return;
        }
        catch (Throwable throwable) {
            Object var9_8 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Circle(float x, float y, float radius) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.Circle(x, y, radius);
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Circle(float x, float y, float radius, long color) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.Circle(x, y, radius, color);
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
    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect, long FillColor) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.Circle(x, y, radius, color, startAngle, endAngle, aspect, FillColor);
            return;
        }
        catch (Throwable throwable) {
            Object var12_10 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void PaintPicture(Image refImage, float x, float y) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.PaintPicture(refImage, (int)x, (int)y);
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Print(String text, float x1, float y1) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.Print(text, x1, y1);
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Cls() {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.Cls();
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
    public Image $Image() {
        Image $Image = null;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$Image();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Image;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public BufferedImage $ImageBuffer() {
        BufferedImage $ImageBuffer = null;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$ImageBuffer();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ImageBuffer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $Point(float x, float y) {
        long $Point = 0L;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$Point(x, y);
        }
        catch (Throwable throwable) {
            Object var6_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Point;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int TextWidth(String text) {
        int TextWidth = 0;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.TextWidth(text);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return TextWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int TextHeight(String text) {
        int TextHeight = 0;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.TextHeight(text);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return TextHeight;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Print(String text) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.Print(text);
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
    public long $CurrentX() {
        long $CurrentX = 0L;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$CurrentX();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CurrentX;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CurrentX(long v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.$CurrentX(v);
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
    public long $CurrentY() {
        long $CurrentY = 0L;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$CurrentY();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CurrentY;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CurrentY(long v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.myContent.$CurrentY(v);
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
    public float $ScaleLeft() {
        float $ScaleLeft = 0.0f;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$Left();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleLeft;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $ScaleTop() {
        float $ScaleTop = 0.0f;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$Top();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleTop;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $ScaleWidth() {
        float $ScaleWidth = 0.0f;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$Width();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $ScaleHeight() {
        float $ScaleHeight = 0.0f;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$Height();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleHeight;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Close() {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.$Parent().dispose();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ArrayList $Controls() {
        $Controls = null;
        Err = null;
        h8 = 0;
        h9 = 0;
        pbControl = null;
        h11 = 0;
        h12 = 0;
        frControl = null;
        comp = new VBArray();
        try {
            comp = VBArray.createVBArray(Me.getParentContainer().getComponents());
        }
        catch (Throwable v0) {
            var3_10 = null;
            Err = v0;
        }
        try {
            $Controls = new ArrayList<Object>();
        }
        catch (Throwable v1) {
            var3_10 = null;
            Err = v1;
        }
        i = 0;
        v = 0;
        i = comp.getUBound(1);
        h8 = 0;
        h9 = -1 * 1;
        if (true) ** GOTO lbl113
        do {
            block30: {
                block29: {
                    block28: {
                        try {
                            $Controls.add((Component)comp.valueOfObj(i));
                        }
                        catch (Throwable v2) {
                            var3_10 = null;
                            Err = v2;
                        }
                        if ((Component)comp.valueOfObj(i) instanceof PictureBox != false) break block28;
                        if ((Component)comp.valueOfObj(i) instanceof Frame != false) break block29;
                        break block30;
                    }
                    try {
                    }
                    catch (Throwable v3) {
                        var3_10 = null;
                        Err = v3;
                    }
                    try {
                        pbControl = (PictureBox)((Component)comp.valueOfObj(i));
                    }
                    catch (Throwable v4) {
                        var3_10 = null;
                        Err = v4;
                    }
                    v = 0;
                    h11 = pbControl.getComponentCount() - 1;
                    h12 = 1;
                    while (v <= h11) {
                        try {
                            $Controls.add(pbControl.$Parent().getComponent(v));
                        }
                        catch (Throwable v5) {
                            var3_10 = null;
                            Err = v5;
                        }
                        v += h12;
                    }
                    try {
                        break block30;
                    }
                    catch (Throwable v6) {
                        var3_10 = null;
                        Err = v6;
                    }
                }
                try {
                    frControl = (Frame)((Component)comp.valueOfObj(i));
                }
                catch (Throwable v7) {
                    var3_10 = null;
                    Err = v7;
                }
                v = 0;
                h11 = frControl.getComponentCount() - 1;
                h12 = 1;
                while (v <= h11) {
                    try {
                        $Controls.add(frControl.$Parent().getComponent(v));
                    }
                    catch (Throwable v8) {
                        var3_10 = null;
                        Err = v8;
                    }
                    v += h12;
                }
                try {
                }
                catch (Throwable v9) {
                    var3_10 = null;
                    Err = v9;
                }
            }
            i += h9;
lbl113:
            // 2 sources

            v10 = i;
            v11 = h8;
            if (h9 < 0) {
                if (v10 < v11) {
                    v12 = false;
                    continue;
                }
                v12 = true;
                continue;
            }
            if (v10 > v11) {
                v12 = false;
                continue;
            }
            v12 = true;
        } while (v12);
        return $Controls;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Container getParentContainer() {
        Throwable throwable2;
        Throwable Err;
        Container getParentContainer;
        block31: {
            MDIChild Me;
            getParentContainer = null;
            Err = null;
            int h8 = 0;
            int h9 = 0;
            VBArray comp = new VBArray();
            int i = 0;
            comp = VBArray.createVBArray(Me.getComponents());
            Container rootComp = null;
            i = 0;
            {
                catch (Throwable throwable2) {}
            }
            h8 = comp.getUBound(1);
            h9 = 1;
            boolean bl = true;
            do {
                block32: {
                    if (bl && !(bl = false)) {
                        if (true) continue;
                    }
                    break block32;
                    break block31;
                }
                if (((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JRootPane")) {
                    rootComp = (Container)((Component)comp.valueOfObj(i));
                }
                i += h9;
            } while (i <= h8);
            comp = VBArray.createVBArray(rootComp.getComponents());
            Container layerComp = null;
            i = 0;
            {
                catch (Throwable throwable2) {}
            }
            h8 = comp.getUBound(1);
            h9 = 1;
            boolean bl2 = true;
            do {
                block33: {
                    if (bl2 && !(bl2 = false)) {
                        if (true) continue;
                    }
                    break block33;
                    catch (Throwable throwable2) {
                        break block31;
                    }
                    break block31;
                }
                if (((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JLayeredPane")) {
                    layerComp = (Container)((Component)comp.valueOfObj(i));
                }
                i += h9;
            } while (i <= h8);
            comp = VBArray.createVBArray(layerComp.getComponents());
            Container panelComp = null;
            i = 0;
            {
                catch (Throwable throwable2) {}
            }
            h8 = comp.getUBound(1);
            h9 = 1;
            boolean bl3 = true;
            do {
                block34: {
                    if (bl3 && !(bl3 = false)) {
                        if (true) continue;
                    }
                    break block34;
                    catch (Throwable throwable2) {
                        break block31;
                    }
                    break block31;
                }
                if (((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JPanel")) {
                    panelComp = (Container)((Component)comp.valueOfObj(i));
                }
                i += h9;
            } while (i <= h8);
            comp = VBArray.createVBArray(panelComp.getComponents());
            Container boxComp = null;
            i = 0;
            {
                catch (Throwable throwable2) {}
            }
            h8 = comp.getUBound(1);
            h9 = 1;
            boolean bl4 = true;
            do {
                block35: {
                    if (bl4 && !(bl4 = false)) {
                        if (true) continue;
                    }
                    break block35;
                    catch (Throwable throwable2) {
                        break block31;
                    }
                    break block31;
                }
                if (((Component)comp.valueOfObj(i)).getClass().getName().equals(Strings.StrCat(Me.getClass().getSuperclass().getName(), "$PictureBox"))) {
                    boxComp = (Container)((Component)comp.valueOfObj(i));
                }
                i += h9;
            } while (i <= h8);
            getParentContainer = boxComp;
            return getParentContainer;
            catch (Throwable throwable2) {
                break block31;
            }
            finally {
            }
        }
        Object var3_11 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return getParentContainer;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void AnchorResize() {
        Err = null;
        h6 = 0;
        h7 = 0;
        myCont = null;
        comp = new VBArray();
        i = 0;
        try {
            comp = VBArray.createVBArray(Me.getParentContainer().getComponents());
        }
        catch (Throwable v0) {
            var2_7 = null;
            Err = v0;
        }
        i = 0;
        h6 = comp.getUBound(1);
        h7 = 1;
        if (true) ** GOTO lbl46
        do {
            block14: {
                block13: {
                    try {
                        if ((Component)comp.valueOfObj(i) instanceof IJabacoControl != false) break block13;
                        break block14;
                    }
                    catch (Throwable v1) {
                        var2_7 = null;
                        Err = v1;
                    }
                }
                try {
                    myCont = (IJabacoControl)((Component)comp.valueOfObj(i));
                }
                catch (Throwable v2) {
                    var2_7 = null;
                    Err = v2;
                }
                try {
                    myCont.ResizeTrigger(Me.$Parent().getContentPane().getWidth(), Me.$Parent().getContentPane().getHeight());
                }
                catch (Throwable v3) {
                    var2_7 = null;
                    Err = v3;
                }
            }
            i += h7;
lbl46:
            // 2 sources

            if (i > h6) {
                return;
            }
            v4 = true;
        } while (v4);
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
            MDIChild Me;
            return Me.myContent.$FontName();
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
            MDIChild Me;
            Me.myContent.$FontName(val);
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
            MDIChild Me;
            return Me.myContent.$FontBold();
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
            MDIChild Me;
            Me.myContent.$FontBold(val);
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
            MDIChild Me;
            return Me.myContent.$FontItalic();
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
            MDIChild Me;
            Me.myContent.$FontItalic(val);
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
            MDIChild Me;
            return Me.myContent.$FontSize();
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
            MDIChild Me;
            Me.myContent.$FontSize(val);
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
    public Font $Font() {
        Font $Font = null;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.getFont();
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
    public void Show() {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.$Parent().show();
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
    public String $Caption() {
        String $Caption = "";
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.getTitle();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Caption;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Caption(String v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.setTitle(v);
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
    public StartUpPositionConstants $StartUpPosition() {
        StartUpPositionConstants $StartUpPosition = new StartUpPositionConstants();
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.StartUpPositionVal;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $StartUpPosition;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $StartUpPosition(StartUpPositionConstants val) {
        Throwable Err = null;
        Dimension tmpDimension = null;
        try {
            if (!(val.compareTo(StartUpPositionConstants.vbStartUpScreen) == 0)) {
                if (!(val.compareTo(StartUpPositionConstants.vbStartUpManual) == 0)) {
                    // empty if block
                }
            } else {
                MDIChild Me;
                tmpDimension = Toolkit.getDefaultToolkit().getScreenSize();
                super.setLocation((int)((double)((float)tmpDimension.width - Me.$Width()) / (double)2), (int)((double)((float)tmpDimension.height - Me.$Height()) / (double)2));
            }
            Me.StartUpPositionVal = val;
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
    public boolean $Resizable() {
        boolean $Resizable = false;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.$Parent().isResizable();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Resizable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Resizable(boolean v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.$Parent().setResizable(v);
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
    public boolean $Closable() {
        boolean $Closable = false;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.$Parent().isClosable();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Closable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Closable(boolean v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.$Parent().setClosable(v);
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
    public boolean $Minimizable() {
        boolean $Minimizable = false;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.$Parent().isIconifiable();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Minimizable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Minimizable(boolean v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.$Parent().setIconifiable(v);
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
    public boolean $Maximizable() {
        boolean $Maximizable = false;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.$Parent().isMaximizable();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Maximizable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Maximizable(boolean v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            Me.$Parent().setMaximizable(v);
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
    public FormWindowStateConstants $WindowState() {
        FormWindowStateConstants $WindowState = new FormWindowStateConstants();
        Throwable Err = null;
        try {
            MDIChild Me;
            if (Me.$Parent().isMaximum()) {
                return FormWindowStateConstants.vbMaximized;
            }
            if (!Me.$Parent().isIconifiable()) return FormWindowStateConstants.vbNormal;
            return FormWindowStateConstants.vbMinimized;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $WindowState;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $WindowState(FormWindowStateConstants val) {
        Throwable Err = null;
        FormWindowStateConstants h5 = new FormWindowStateConstants();
        h5 = null;
        try {
            MDIChild Me;
            h5 = val;
            if (h5.compareTo(FormWindowStateConstants.vbNormal) == 0) {
                Me.$Parent().setMaximum(false);
                Me.$Parent().setIcon(false);
                return;
            }
            if (h5.compareTo(FormWindowStateConstants.vbMinimized) == 0) {
                Me.$Parent().setIcon(true);
                Me.$Parent().setMaximum(false);
                return;
            }
            if (h5.compareTo(FormWindowStateConstants.vbMaximized) != 0) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.$Parent().setMaximum(true);
            Me.$Parent().setIcon(false);
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
    @Override
    public Color getBackground() {
        Color getBackground = null;
        Throwable Err = null;
        try {
            MDIChild Me;
            if (!(Me.myContent == null)) return Me.myContent.$Parent().getBackground();
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
            MDIChild Me;
            if (!(Me.myContent == null)) return Me.myContent.$Parent().getForeground();
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
    public long $BackColor() {
        long $BackColor = 0L;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent.$BackColor();
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
            MDIChild Me;
            Me.myContent.$BackColor(v);
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
            MDIChild Me;
            return Me.myContent.$ForeColor();
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
            MDIChild Me;
            Me.myContent.$ForeColor(v);
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
    public float $Left() {
        float $Left = 0.0f;
        Throwable Err = null;
        try {
            MDIChild Me;
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
    public void $Left(float v) {
        Throwable Err = null;
        try {
            MDIChild Me;
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
    public float $Top() {
        float $Top = 0.0f;
        Throwable Err = null;
        try {
            MDIChild Me;
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
    public void $Top(float v) {
        Throwable Err = null;
        try {
            MDIChild Me;
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
    public VBVariant Move(float Left, float Top, float Width, float Height) {
        VBVariant Move = new VBVariant();
        Throwable Err = null;
        try {
            MDIChild Me;
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
    public float $Width() {
        float $Width = 0.0f;
        Throwable Err = null;
        try {
            MDIChild Me;
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
    public void $Width(float v) {
        Throwable Err = null;
        try {
            MDIChild Me;
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
    public float $Height() {
        float $Height = 0.0f;
        Throwable Err = null;
        try {
            MDIChild Me;
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
    public void $Height(float v) {
        Throwable Err = null;
        try {
            MDIChild Me;
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
    public boolean $Enabled() {
        boolean $Enabled = false;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.isEnabled();
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
            MDIChild Me;
            Me.setEnabled(v);
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
    public boolean $Visible() {
        boolean $Visible = false;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.isVisible();
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
    public void $Visible(boolean v) {
        Throwable Err = null;
        try {
            MDIChild Me;
            if (Me.FormLoaded) {
                Me.setVisible(v);
                return;
            }
            Me.StartUpVisible = v;
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
            MDIChild Me;
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
            MDIChild Me;
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
            MDIChild Me;
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
            MDIChild Me;
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
            MDIChild Me;
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
            MDIChild Me;
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
            MDIChild Me;
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
            MDIChild Me;
            Me.$Parent().invalidate();
            Me.$Parent().repaint(0, 0, 0, (int)Me.$Width(), (int)Me.$Height());
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
    public PictureBox $ContentFrame() {
        PictureBox $ContentFrame = null;
        Throwable Err = null;
        try {
            MDIChild Me;
            return Me.myContent;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ContentFrame;
    }

    private void initVars() {
        MDIChild Me;
        Me.myInitLookAndFeelFlag = Global.LookAndFeelManager().isInitialized();
        Me.FormLoaded = false;
        Me.StartUpVisible = false;
        Me.StartUpPositionVal = StartUpPositionConstants.vbStartUpScreen;
        Me.myTag = "";
        Me.myMouseIcon = null;
        Me.myIcon = null;
        Me.myMDIChildFocusHandler = null;
        Me.myContent = new MDIChild$PictureBox();
        Me.myContent.setOwner(Me, 1);
    }

    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle) {
        MDIChild Me;
        Me.Circle(x, y, radius, color, startAngle, endAngle, 1.0f, -1 * 1);
    }

    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect) {
        MDIChild Me;
        Me.Circle(x, y, radius, color, startAngle, endAngle, aspect, -1 * 1);
    }

    public VBVariant Move(float Left) {
        MDIChild Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        MDIChild Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        MDIChild Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }
}
