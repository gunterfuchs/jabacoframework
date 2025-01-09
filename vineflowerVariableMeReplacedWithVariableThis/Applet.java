package vineflowerVariableMeReplacedWithVariableThis;

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

public class Applet extends JApplet implements VB.ILoadAdapter, VB.IJabacoForm, ComponentListener, VB.IJabacoContainer {
   private VB.Applet$VBMenuBar myMenuBar;
   private VB.Applet$VBToolBar myToolBar;
   private VB.Applet$PictureBox myContent;
   private boolean myInitLookAndFeelFlag;
   private boolean StartVisibility;
   private boolean FormLoaded;
   private long myMenuBarBackColor;
   private long myMenuBarForeColor;
   private long myToolBarBackColor;
   private long myToolBarForeColor;
   private String myTag;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void init() {
      Throwable Err = null;

      try {
         Applet_Init();
         Refresh();
         myContent.$Parent().updateUI();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void start() {
      Throwable Err = null;

      try {
         VB.Global.LookAndFeelManager().setDefaultLookAndFeel();
         SwingUtilities.updateComponentTreeUI(this);
         Applet_Start();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void destroy() {
      Throwable Err = null;

      try {
         Applet_Destroy();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JApplet $Parent() {
      JApplet $Parent = null;
      Throwable Err = null;

      try {
         $Parent = this;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         myContent.$BorderStyle(VB.fmBorderStyle.fmBorderStyleNone);
         super.getContentPane().add(myContent);
         myMenuBar.$Visible(false);
         myToolBar.$Visible(false);
         $Parent().setJMenuBar(myMenuBar);
         $Parent().getContentPane().add(myToolBar, BorderLayout.NORTH);
         myContent.$Visible(true);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void fireLoaded() {
      Throwable Err = null;
      VB.LoadAdapter tmpFireAdapter = new VB.LoadAdapter(this, this);

      try {
         tmpFireAdapter.fireLoaded();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void fireLoaded(Object sender) {
      Throwable Err = null;

      try {
         Applet_Initialize();
         FormLoaded = true;
         $Visible(StartVisibility);
         addComponentListener(this);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void add(Component Component) {
      Throwable Err = null;

      try {
         myContent.add(Component);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void componentHidden(ComponentEvent e) {
      Throwable Err = null;

      try {
         Applet_Deactivate();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void componentMoved(ComponentEvent e) {
      Throwable Err = null;

      try {
         Applet_Move();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void componentResized(ComponentEvent e) {
      Throwable Err = null;

      try {
         Applet_Resize();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void componentShown(ComponentEvent e) {
      Throwable Err = null;

      try {
         Applet_Activate();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void PSet(float x, float y) {
      Throwable Err = null;

      try {
         myContent.PSet(x, y);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Line(float x, float y) {
      Throwable Err = null;

      try {
         myContent.Line(x, y);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Line(float x1, float y1, float x2, float y2) {
      Throwable Err = null;

      try {
         myContent.Line(x1, y1, x2, y2);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Line(float x1, float y1, float x2, float y2, boolean Rect) {
      Throwable Err = null;

      try {
         myContent.Line(x1, y1, x2, y2, Rect);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Line(float x1, float y1, float x2, float y2, boolean Rect, long FillColor) {
      Throwable Err = null;

      try {
         myContent.Line(x1, y1, x2, y2, Rect, FillColor);
      } catch (Throwable var11) {
         Interaction.MsgBox(var11);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Circle(float x, float y, float radius) {
      Throwable Err = null;

      try {
         myContent.Circle(x, y, radius);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Circle(float x, float y, float radius, long color) {
      Throwable Err = null;

      try {
         myContent.Circle(x, y, radius, color);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect, long FillColor) {
      Throwable Err = null;

      try {
         myContent.Circle(x, y, radius, color, startAngle, endAngle, aspect, FillColor);
      } catch (Throwable var14) {
         Interaction.MsgBox(var14);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void PaintPicture(Image refImage, float x, float y) {
      Throwable Err = null;

      try {
         myContent.PaintPicture(refImage, (int)x, (int)y);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Print(String text, float x1, float y1) {
      Throwable Err = null;

      try {
         myContent.Print(text, x1, y1);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Cls() {
      Throwable Err = null;

      try {
         myContent.Cls();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int TextWidth(String text) {
      int TextWidth = 0;
      Throwable Err = null;

      try {
         TextWidth = myContent.TextWidth(text);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return TextWidth;
      }

      return TextWidth;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int TextHeight(String text) {
      int TextHeight = 0;
      Throwable Err = null;

      try {
         TextHeight = myContent.TextHeight(text);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return TextHeight;
      }

      return TextHeight;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Print(String text) {
      Throwable Err = null;

      try {
         myContent.Print(text);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $CurrentX() {
      long $CurrentX = 0L;
      Throwable Err = null;

      try {
         $CurrentX = myContent.$CurrentX();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $CurrentX;
      }

      return $CurrentX;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $CurrentX(long v) {
      Throwable Err = null;

      try {
         myContent.$CurrentX(v);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $CurrentY() {
      long $CurrentY = 0L;
      Throwable Err = null;

      try {
         $CurrentY = myContent.$CurrentY();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $CurrentY;
      }

      return $CurrentY;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $CurrentY(long v) {
      Throwable Err = null;

      try {
         myContent.$CurrentY(v);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $Picture() {
      IResource $Picture = null;
      Throwable Err = null;

      try {
         $Picture = myContent.$Picture();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Picture;
      }

      return $Picture;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Picture(IResource Path) {
      Throwable Err = null;

      try {
         myContent.$Picture(Path);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $DrawWidth() {
      int $DrawWidth = 0;
      Throwable Err = null;

      try {
         $Transparency(myContent.$DrawWidth());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $DrawWidth;
      }

      return $DrawWidth;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $DrawWidth(int v) {
      Throwable Err = null;

      try {
         myContent.$DrawWidth(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $Transparency() {
      int $Transparency = 0;
      Throwable Err = null;

      try {
         $Transparency = myContent.$Transparency();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Transparency;
      }

      return $Transparency;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Transparency(int v) {
      Throwable Err = null;

      try {
         myContent.$Transparency(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $AntiAliasing() {
      boolean $AntiAliasing = false;
      Throwable Err = null;

      try {
         $AntiAliasing = myContent.$AntiAliasing();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $AntiAliasing;
      }

      return $AntiAliasing;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $AntiAliasing(boolean v) {
      Throwable Err = null;

      try {
         myContent.$AntiAliasing(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $AutoRedraw() {
      boolean $AutoRedraw = false;
      Throwable Err = null;

      try {
         $AutoRedraw = myContent.$AutoRedraw();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $AutoRedraw;
      }

      return $AutoRedraw;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $AutoRedraw(boolean v) {
      Throwable Err = null;

      try {
         myContent.$AutoRedraw(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $FontName() {
      String $FontName = "";
      Throwable Err = null;

      try {
         $FontName = myContent.$FontName();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontName;
      }

      return $FontName;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontName(String val) {
      Throwable Err = null;

      try {
         myContent.$FontName(val);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $FontBold() {
      boolean $FontBold = false;
      Throwable Err = null;

      try {
         $FontBold = myContent.$FontBold();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontBold;
      }

      return $FontBold;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontBold(boolean val) {
      Throwable Err = null;

      try {
         myContent.$FontName(String.valueOf(val));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $FontItalic() {
      boolean $FontItalic = false;
      Throwable Err = null;

      try {
         $FontItalic = myContent.$FontItalic();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontItalic;
      }

      return $FontItalic;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontItalic(boolean val) {
      Throwable Err = null;

      try {
         myContent.$FontItalic(val);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $FontSize() {
      int $FontSize = 0;
      Throwable Err = null;

      try {
         $FontSize = myContent.$FontSize();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontSize;
      }

      return $FontSize;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontSize(int val) {
      Throwable Err = null;

      try {
         myContent.$FontSize(val);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Font $Font() {
      Font $Font = null;
      Throwable Err = null;

      try {
         $Font = myContent.getFont();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Font;
      }

      return $Font;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean $Visible() {
      boolean $Visible = false;
      Throwable Err = null;

      try {
         $Visible = isVisible();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Visible;
      }

      return $Visible;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Visible(boolean v) {
      Throwable Err = null;

      try {
         if (!FormLoaded) {
            StartVisibility = v;
         } else {
            setVisible(v);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBMenuBar $MenuBar() {
      VB.VBMenuBar $MenuBar = null;
      Throwable Err = null;

      try {
         $MenuBar = myMenuBar;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $MenuBar;
      }

      return $MenuBar;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBToolBar $ToolBar() {
      VB.VBToolBar $ToolBar = null;
      Throwable Err = null;

      try {
         $ToolBar = myToolBar;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ToolBar;
      }

      return $ToolBar;
   }

   public void Applet_Activate() {
      Throwable Err = null;
   }

   public void Applet_Deactivate() {
      Throwable Err = null;
   }

   public void Applet_Click() {
      Throwable Err = null;
   }

   public void Applet_DblClick() {
      Throwable Err = null;
   }

   public void Applet_GotFocus() {
      Throwable Err = null;
   }

   public void Applet_KeyDown(int KeyCode, int Shift) {
      Throwable Err = null;
   }

   public void Applet_KeyPress(int KeyAscii) {
      Throwable Err = null;
   }

   public void Applet_KeyUp(int KeyCode, int Shift) {
      Throwable Err = null;
   }

   public void Applet_Initialize() {
      Throwable Err = null;
   }

   public void Applet_LostFocus() {
      Throwable Err = null;
   }

   public void Applet_MouseDown(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Applet_MouseMove(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Applet_MouseUp(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Applet_MouseEntered() {
      Throwable Err = null;
   }

   public void Applet_MouseExited() {
      Throwable Err = null;
   }

   public void Applet_Paint() {
      Throwable Err = null;
   }

   public void Applet_Resize() {
      Throwable Err = null;
   }

   public void Applet_Move() {
      Throwable Err = null;
   }

   public void Applet_Unload(int Cancel) {
      Throwable Err = null;
   }

   public void Applet_MenuClick(VB.IMenuItem MenuItem) {
      Throwable Err = null;
   }

   public void Applet_ToolBarClick(VB.IToolBarItem ToolBarItem) {
      Throwable Err = null;
   }

   public void Applet_Start() {
      Throwable Err = null;
   }

   public void Applet_Init() {
      Throwable Err = null;
   }

   public void Applet_Destroy() {
      Throwable Err = null;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_MouseUp(int Button, int Shift, float X, float Y) {
      Throwable Err = null;

      try {
         Applet_MouseUp(Button, Shift, X, Y);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_MouseMove(int Button, int Shift, float X, float Y) {
      Throwable Err = null;

      try {
         Applet_MouseMove(Button, Shift, X, Y);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_MouseDown(int Button, int Shift, float X, float Y) {
      Throwable Err = null;

      try {
         Applet_MouseDown(Button, Shift, X, Y);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_Click() {
      Throwable Err = null;

      try {
         Applet_Click();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_DblClick() {
      Throwable Err = null;

      try {
         Applet_DblClick();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_KeyDown(int KeyCode, int Shift) {
      Throwable Err = null;

      try {
         Applet_KeyDown(KeyCode, Shift);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_KeyPress(int KeyAscii) {
      Throwable Err = null;

      try {
         Applet_KeyPress(KeyAscii);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_KeyUp(int KeyCode, int Shift) {
      Throwable Err = null;

      try {
         Applet_KeyUp(KeyCode, Shift);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_Paint() {
      Throwable Err = null;

      try {
         Applet_Paint();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public VB.PictureBox $ContentFrame() {
      VB.PictureBox $ContentFrame = null;
      Throwable Err = null;

      try {
         $ContentFrame = myContent;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ContentFrame;
      }

      return $ContentFrame;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float $Left() {
      float $Left = 0.0F;
      Throwable Err = null;

      try {
         $Left = (float)getLocation().x;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Left;
      }

      return $Left;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Left(float v) {
      Throwable Err = null;

      try {
         setLocation((int)v, getLocation().y);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float $Top() {
      float $Top = 0.0F;
      Throwable Err = null;

      try {
         $Top = (float)getLocation().y;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Top;
      }

      return $Top;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Top(float v) {
      Throwable Err = null;

      try {
         setLocation(getLocation().x, (int)v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float $Width() {
      float $Width = 0.0F;
      Throwable Err = null;

      try {
         $Width = (float)getSize().width;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Width;
      }

      return $Width;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Width(float v) {
      Throwable Err = null;

      try {
         setSize((int)v, getSize().height);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float $Height() {
      float $Height = 0.0F;
      Throwable Err = null;

      try {
         $Height = (float)getSize().height;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Height;
      }

      return $Height;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $Height(float v) {
      Throwable Err = null;

      try {
         setSize(getSize().width, (int)v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBVariant Move(float Left, float Top, float Width, float Height) {
      VBVariant Move = new VBVariant();
      Throwable Err = null;

      try {
         $Left(Left);
         if (Top != (float)(-1 * 1)) {
            $Top(Top);
         }

         if (Width != (float)(-1 * 1)) {
            $Width(Width);
         }

         if (Height != (float)(-1 * 1)) {
            $Height(Height);
         }
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return Move;
      }

      return Move;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColor() {
      long $BackColor = 0L;
      Throwable Err = null;

      try {
         $BackColor = myContent.$BackColor();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColor;
      }

      return $BackColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackColor(long v) {
      Throwable Err = null;

      try {
         myContent.$BackColor(v);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $ForeColor() {
      long $ForeColor = 0L;
      Throwable Err = null;

      try {
         $ForeColor = myContent.$ForeColor();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ForeColor;
      }

      return $ForeColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ForeColor(long v) {
      Throwable Err = null;

      try {
         myContent.$ForeColor(v);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getBackground() {
      Color getBackground = null;
      Throwable Err = null;

      try {
         getBackground = Information.RGBtoColor(myContent.$BackColor());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getBackground;
      }

      return getBackground;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getForeground() {
      Color getForeground = null;
      Throwable Err = null;

      try {
         getForeground = Information.RGBtoColor(myContent.$ForeColor());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getForeground;
      }

      return getForeground;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Tag() {
      String $Tag = "";
      Throwable Err = null;

      try {
         $Tag = myTag;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Tag;
      }

      return $Tag;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Tag(String v) {
      Throwable Err = null;

      try {
         myTag = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myMenuBar_Click(VB.IMenuItem MenuItem) {
      Throwable Err = null;

      try {
         Applet_MenuClick(MenuItem);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myMenuBar_Visible(boolean b) {
      Throwable Err = null;

      try {
         if (b) {
            $Height($Height() + (float)myMenuBar.$Height());
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myToolBar_Visible(boolean b) {
      Throwable Err = null;

      try {
         if (b) {
            $Height($Height() + (float)myToolBar.$Height());
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myToolBar_Click(VB.IToolBarItem ToolBarItem) {
      Throwable Err = null;

      try {
         Applet_ToolBarClick(ToolBarItem);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public long $MenuBackColor() {
      long $MenuBackColor = 0L;
      Throwable Err = null;

      try {
         $MenuBackColor = myMenuBarBackColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $MenuBackColor;
      }

      return $MenuBackColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $MenuBackColor(long v) {
      Throwable Err = null;

      try {
         myMenuBarBackColor = v;
         myToolBar.$Parent().repaint();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public long $MenuForeColor() {
      long $MenuForeColor = 0L;
      Throwable Err = null;

      try {
         $MenuForeColor = myMenuBarForeColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $MenuForeColor;
      }

      return $MenuForeColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $MenuForeColor(long v) {
      Throwable Err = null;

      try {
         myMenuBarForeColor = v;
         myToolBar.$Parent().repaint();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public long $ToolBackColor() {
      long $ToolBackColor = 0L;
      Throwable Err = null;

      try {
         $ToolBackColor = myToolBarBackColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ToolBackColor;
      }

      return $ToolBackColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $ToolBackColor(long v) {
      Throwable Err = null;

      try {
         myToolBarBackColor = v;
         myToolBar.$Parent().repaint();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public long $ToolForeColor() {
      long $ToolForeColor = 0L;
      Throwable Err = null;

      try {
         $ToolForeColor = myToolBarForeColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $ToolForeColor;
      }

      return $ToolForeColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void $ToolForeColor(long v) {
      Throwable Err = null;

      try {
         myToolBarForeColor = v;
         myToolBar.$Parent().repaint();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Refresh() {
      Throwable Err = null;

      try {
         $Parent().invalidate();
         $Parent().repaint((long)0, 0, 0, (int)$Width(), (int)$Height());
         myContent.Refresh();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle) {
      Circle(x, y, radius, color, startAngle, endAngle, (float)1, (long)(-1 * 1));
   }

   public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect) {
      Circle(x, y, radius, color, startAngle, endAngle, aspect, (long)(-1 * 1));
   }

   public VBVariant Move(float Left) {
      return Move(Left, (float)(-1 * 1), (float)(-1 * 1), (float)(-1 * 1));
   }

   public VBVariant Move(float Left, float Top) {
      return Move(Left, Top, (float)(-1 * 1), (float)(-1 * 1));
   }

   public VBVariant Move(float Left, float Top, float Width) {
      return Move(Left, Top, Width, (float)(-1 * 1));
   }

   public Applet() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
      myMenuBar = new VB.Applet$VBMenuBar(this);
      myMenuBar.setOwner(this, 1);
      myToolBar = new VB.Applet$VBToolBar(this);
      myToolBar.setOwner(this, 2);
      myContent = new VB.Applet$PictureBox();
      myContent.setOwner(this, 3);
      myInitLookAndFeelFlag = VB.Global.LookAndFeelManager().isInitialized();
      StartVisibility = false;
      FormLoaded = false;
      myMenuBarBackColor = 0L;
      myMenuBarForeColor = 0L;
      myToolBarBackColor = 0L;
      myToolBarForeColor = 0L;
      myTag = "";
   }
}
