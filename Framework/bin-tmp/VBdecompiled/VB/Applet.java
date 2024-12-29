/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Applet$PictureBox;
import VB.Applet$VBMenuBar;
import VB.Applet$VBToolBar;
import VB.Global;
import VB.IJabacoContainer;
import VB.IJabacoForm;
import VB.ILoadAdapter;
import VB.IMenuItem;
import VB.IToolBarItem;
import VB.LoadAdapter;
import VB.PictureBox;
import VB.VBMenuBar;
import VB.VBToolBar;
import VB.fmBorderStyle;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JApplet;
import javax.swing.SwingUtilities;

public class Applet
extends JApplet
implements ILoadAdapter,
IJabacoForm,
ComponentListener,
IJabacoContainer {
    private Applet$VBMenuBar myMenuBar;
    private Applet$VBToolBar myToolBar;
    private Applet$PictureBox myContent;
    private boolean myInitLookAndFeelFlag;
    private boolean StartVisibility;
    private boolean FormLoaded;
    private long myMenuBarBackColor;
    private long myMenuBarForeColor;
    private long myToolBarBackColor;
    private long myToolBarForeColor;
    private String myTag;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void init() {
        Throwable Err = null;
        try {
            Applet Me;
            Me.Applet_Init();
            Me.Refresh();
            Me.myContent.$Parent().updateUI();
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
    public void start() {
        Throwable Err = null;
        try {
            Applet Me;
            Global.LookAndFeelManager().setDefaultLookAndFeel();
            SwingUtilities.updateComponentTreeUI(Me);
            Me.Applet_Start();
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
    public void destroy() {
        Throwable Err = null;
        try {
            Applet Me;
            Me.Applet_Destroy();
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
    public JApplet $Parent() {
        Applet $Parent = null;
        Throwable Err = null;
        try {
            Applet Me;
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
            Applet Me;
            Me.myContent.$BorderStyle(fmBorderStyle.fmBorderStyleNone);
            super.getContentPane().add(Me.myContent);
            Me.myMenuBar.$Visible(false);
            Me.myToolBar.$Visible(false);
            Me.$Parent().setJMenuBar(Me.myMenuBar);
            Me.$Parent().getContentPane().add((Component)Me.myToolBar, BorderLayout.NORTH);
            Me.myContent.$Visible(true);
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
    public void fireLoaded() {
        Applet Me;
        Throwable Err = null;
        LoadAdapter tmpFireAdapter = new LoadAdapter(Me, Me);
        try {
            tmpFireAdapter.fireLoaded();
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
    @Override
    public void fireLoaded(Object sender) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.Applet_Initialize();
            Me.FormLoaded = true;
            Me.$Visible(Me.StartVisibility);
            Me.addComponentListener(Me);
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
    public void add(Component Component2) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.myContent.add(Component2);
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
    public void componentHidden(ComponentEvent e) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.Applet_Deactivate();
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
    public void componentMoved(ComponentEvent e) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.Applet_Move();
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
    public void componentResized(ComponentEvent e) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.Applet_Resize();
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
    public void componentShown(ComponentEvent e) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.Applet_Activate();
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
            Applet Me;
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
    public void Line(float x, float y) {
        Throwable Err = null;
        try {
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
    public int TextWidth(String text) {
        int TextWidth = 0;
        Throwable Err = null;
        try {
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
    public IResource $Picture() {
        IResource $Picture = null;
        Throwable Err = null;
        try {
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
    public int $Transparency() {
        int $Transparency = 0;
        Throwable Err = null;
        try {
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
    public String $FontName() {
        String $FontName = "";
        Throwable Err = null;
        try {
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
            Me.myContent.$FontName(String.valueOf(val));
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
    public boolean $Visible() {
        boolean $Visible = false;
        Throwable Err = null;
        try {
            Applet Me;
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
    @Override
    public void $Visible(boolean v) {
        Throwable Err = null;
        try {
            Applet Me;
            if (Me.FormLoaded) {
                Me.setVisible(v);
                return;
            }
            Me.StartVisibility = v;
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
    public VBMenuBar $MenuBar() {
        VBMenuBar $MenuBar = null;
        Throwable Err = null;
        try {
            Applet Me;
            return Me.myMenuBar;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MenuBar;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBToolBar $ToolBar() {
        VBToolBar $ToolBar = null;
        Throwable Err = null;
        try {
            Applet Me;
            return Me.myToolBar;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ToolBar;
    }

    public void Applet_Activate() {
        Object Err = null;
    }

    public void Applet_Deactivate() {
        Object Err = null;
    }

    public void Applet_Click() {
        Object Err = null;
    }

    public void Applet_DblClick() {
        Object Err = null;
    }

    public void Applet_GotFocus() {
        Object Err = null;
    }

    public void Applet_KeyDown(int KeyCode, int Shift) {
        Object Err = null;
    }

    public void Applet_KeyPress(int KeyAscii) {
        Object Err = null;
    }

    public void Applet_KeyUp(int KeyCode, int Shift) {
        Object Err = null;
    }

    public void Applet_Initialize() {
        Object Err = null;
    }

    public void Applet_LostFocus() {
        Object Err = null;
    }

    public void Applet_MouseDown(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Applet_MouseMove(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Applet_MouseUp(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Applet_MouseEntered() {
        Object Err = null;
    }

    public void Applet_MouseExited() {
        Object Err = null;
    }

    public void Applet_Paint() {
        Object Err = null;
    }

    public void Applet_Resize() {
        Object Err = null;
    }

    public void Applet_Move() {
        Object Err = null;
    }

    public void Applet_Unload(int Cancel) {
        Object Err = null;
    }

    public void Applet_MenuClick(IMenuItem MenuItem) {
        Object Err = null;
    }

    public void Applet_ToolBarClick(IToolBarItem ToolBarItem) {
        Object Err = null;
    }

    public void Applet_Start() {
        Object Err = null;
    }

    public void Applet_Init() {
        Object Err = null;
    }

    public void Applet_Destroy() {
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
            Applet Me;
            Me.Applet_MouseUp(Button, Shift, X, Y);
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
            Applet Me;
            Me.Applet_MouseMove(Button, Shift, X, Y);
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
            Applet Me;
            Me.Applet_MouseDown(Button, Shift, X, Y);
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
            Applet Me;
            Me.Applet_Click();
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
            Applet Me;
            Me.Applet_DblClick();
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
            Applet Me;
            Me.Applet_KeyDown(KeyCode, Shift);
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
            Applet Me;
            Me.Applet_KeyPress(KeyAscii);
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
            Applet Me;
            Me.Applet_KeyUp(KeyCode, Shift);
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
    public void myContent_Paint() {
        Throwable Err = null;
        try {
            Applet Me;
            Me.Applet_Paint();
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
            Applet Me;
            return Me.myContent;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ContentFrame;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
    @Override
    public float $Width() {
        float $Width = 0.0f;
        Throwable Err = null;
        try {
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
    public VBVariant Move(float Left, float Top, float Width, float Height) {
        VBVariant Move = new VBVariant();
        Throwable Err = null;
        try {
            Applet Me;
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
    public long $BackColor() {
        long $BackColor = 0L;
        Throwable Err = null;
        try {
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
            Applet Me;
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
    @Override
    public Color getBackground() {
        Color getBackground = null;
        Throwable Err = null;
        try {
            Applet Me;
            return Information.RGBtoColor(Me.myContent.$BackColor());
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
            Applet Me;
            return Information.RGBtoColor(Me.myContent.$ForeColor());
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
    public String $Tag() {
        String $Tag = "";
        Throwable Err = null;
        try {
            Applet Me;
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
    public void myMenuBar_Click(IMenuItem MenuItem) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.Applet_MenuClick(MenuItem);
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
    public void myMenuBar_Visible(boolean b) {
        Throwable Err = null;
        try {
            Applet Me;
            if (!b) {
                return;
            }
            Me.$Height(Me.$Height() + (float)Me.myMenuBar.$Height());
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
    public void myToolBar_Visible(boolean b) {
        Throwable Err = null;
        try {
            Applet Me;
            if (!b) {
                return;
            }
            Me.$Height(Me.$Height() + (float)Me.myToolBar.$Height());
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
            Applet Me;
            Me.Applet_ToolBarClick(ToolBarItem);
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
    public long $MenuBackColor() {
        long $MenuBackColor = 0L;
        Throwable Err = null;
        try {
            Applet Me;
            return Me.myMenuBarBackColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MenuBackColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $MenuBackColor(long v) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.myMenuBarBackColor = v;
            Me.myToolBar.$Parent().repaint();
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
    public long $MenuForeColor() {
        long $MenuForeColor = 0L;
        Throwable Err = null;
        try {
            Applet Me;
            return Me.myMenuBarForeColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MenuForeColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $MenuForeColor(long v) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.myMenuBarForeColor = v;
            Me.myToolBar.$Parent().repaint();
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
    public long $ToolBackColor() {
        long $ToolBackColor = 0L;
        Throwable Err = null;
        try {
            Applet Me;
            return Me.myToolBarBackColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ToolBackColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $ToolBackColor(long v) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.myToolBarBackColor = v;
            Me.myToolBar.$Parent().repaint();
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
    public long $ToolForeColor() {
        long $ToolForeColor = 0L;
        Throwable Err = null;
        try {
            Applet Me;
            return Me.myToolBarForeColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ToolForeColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $ToolForeColor(long v) {
        Throwable Err = null;
        try {
            Applet Me;
            Me.myToolBarForeColor = v;
            Me.myToolBar.$Parent().repaint();
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
    public void Refresh() {
        Throwable Err = null;
        try {
            Applet Me;
            Me.$Parent().invalidate();
            Me.$Parent().repaint(0, 0, 0, (int)Me.$Width(), (int)Me.$Height());
            Me.myContent.Refresh();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle) {
        Applet Me;
        Me.Circle(x, y, radius, color, startAngle, endAngle, 1.0f, -1 * 1);
    }

    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect) {
        Applet Me;
        Me.Circle(x, y, radius, color, startAngle, endAngle, aspect, -1 * 1);
    }

    public VBVariant Move(float Left) {
        Applet Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        Applet Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        Applet Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }

    public Applet() {
        Applet Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        Applet Me;
        Me.myMenuBar = new Applet$VBMenuBar(Me);
        Me.myMenuBar.setOwner(Me, 1);
        Me.myToolBar = new Applet$VBToolBar(Me);
        Me.myToolBar.setOwner(Me, 2);
        Me.myContent = new Applet$PictureBox();
        Me.myContent.setOwner(Me, 3);
        Me.myInitLookAndFeelFlag = Global.LookAndFeelManager().isInitialized();
        Me.StartVisibility = false;
        Me.FormLoaded = false;
        Me.myMenuBarBackColor = 0L;
        Me.myMenuBarForeColor = 0L;
        Me.myToolBarBackColor = 0L;
        Me.myToolBarForeColor = 0L;
        Me.myTag = "";
    }
}
