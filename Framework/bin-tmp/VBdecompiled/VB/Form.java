/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AbstractForm;
import VB.Form$PictureBox;
import VB.IJabacoContainer;
import VB.IJabacoControl;
import VB.IJabacoForm;
import VB.IMenuItem;
import VB.IToolBarItem;
import VB.PictureBox;
import VB.fmBorderStyle;
import VBA.IResource;
import VBA.Interaction;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Form
extends AbstractForm
implements IJabacoForm,
IJabacoContainer {
    private Form$PictureBox myContent;

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
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            Form Me;
            Me.myContent.$BorderStyle(fmBorderStyle.fmBorderStyleNone);
            super.getContentPane().add(Me.myContent);
            Me.myContent.$Visible(true);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    @Override
    public int Form_Unload() {
        int Form_Unload = 0;
        Object Err = null;
        return Form_Unload;
    }

    @Override
    public void Form_Activate() {
        Object Err = null;
    }

    @Override
    public void Form_Deactivate() {
        Object Err = null;
    }

    @Override
    public void Form_GotFocus() {
        Object Err = null;
    }

    @Override
    public void Form_LostFocus() {
        Object Err = null;
    }

    @Override
    public void Form_Load() {
        Object Err = null;
    }

    @Override
    public void Form_Resize() {
        Object Err = null;
    }

    @Override
    public void Form_Move() {
        Object Err = null;
    }

    @Override
    public void Form_MenuClick(IMenuItem MenuItem) {
        Object Err = null;
    }

    @Override
    public void Form_ToolBarClick(IToolBarItem ToolBarItem) {
        Object Err = null;
    }

    public void Form_Click() {
        Object Err = null;
    }

    public void Form_DblClick() {
        Object Err = null;
    }

    @Override
    public void Form_KeyDown(int KeyCode, int Shift) {
        Object Err = null;
    }

    @Override
    public void Form_KeyPress(int KeyAscii) {
        Object Err = null;
    }

    @Override
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void myContent_MouseUp(int Button, int Shift, float X, float Y) {
        Throwable Err = null;
        try {
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
    public int $Transparency() {
        int $Transparency = 0;
        Throwable Err = null;
        try {
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
    public void Print(String text) {
        Throwable Err = null;
        try {
            Form Me;
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
    public void Print(String text, float x1, float y1) {
        Throwable Err = null;
        try {
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
    public long $CurrentX() {
        long $CurrentX = 0L;
        Throwable Err = null;
        try {
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
    @Override
    public Color getBackground() {
        Color getBackground = null;
        Throwable Err = null;
        try {
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
    public String $FontName() {
        String $FontName = "";
        Throwable Err = null;
        try {
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
            Form Me;
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
    @Override
    public PictureBox $ContentFrame() {
        PictureBox $ContentFrame = null;
        Throwable Err = null;
        try {
            Form Me;
            return Me.myContent;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ContentFrame;
    }

    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle) {
        Form Me;
        Me.Circle(x, y, radius, color, startAngle, endAngle, 1.0f, -1 * 1);
    }

    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect) {
        Form Me;
        Me.Circle(x, y, radius, color, startAngle, endAngle, aspect, -1 * 1);
    }

    public Form() {
        Form Me;
        Me.initVarsI();
        Me.Class_Initialize();
    }

    private void initVarsI() {
        Form Me;
        Me.myContent = new Form$PictureBox();
        Me.myContent.setOwner(Me, 1);
    }
}
