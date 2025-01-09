package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayObject;
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

public class MDIChild extends JInternalFrame implements VB.ILoadAdapter, ComponentListener, VB.IJabacoContainer {
   private boolean myInitLookAndFeelFlag;
   private boolean FormLoaded;
   private boolean StartUpVisible;
   private VB.StartUpPositionConstants StartUpPositionVal;
   private String myTag;
   private IResource myMouseIcon;
   private IResource myIcon;
   private VB.MDIChildFocusHandler myMDIChildFocusHandler;
   private VB.MDIChild$PictureBox myContent;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void add(Component Component) {
      Throwable Err = null;
      VB.IJabacoControl Component2 = null;

      label143: {
         Throwable var10000;
         label142: {
            label148: {
               try {
                  if (!(Component instanceof VB.IJabacoControl)) {
                     break label148;
                  }
               } finally {
                  break label143;
               }

               Component2 = (VB.IJabacoControl)Component;

               try {
                  Component2.ResizeTriggerInit($Width(), $Height());
               } catch (Throwable var15) {
                  var10000 = var15;
                  boolean var10001 = false;
                  break label142;
               }
            }

            label131:
            try {
               if (myContent != null) {
                  myContent.add(Component);
               } else {
                  super.getContentPane().add(Component);
               }

               return;
            } catch (Throwable var14) {
               var10000 = var14;
               boolean var18 = false;
               break label131;
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JInternalFrame $Parent() {
      JInternalFrame $Parent = null;
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
         myMDIChildFocusHandler = new VB.MDIChildFocusHandler(this);
         $Parent().addPropertyChangeListener(myMDIChildFocusHandler);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public MDIChild() {
      Throwable Err = null;
      super();
      initVars();

      try {
         FormLoaded = false;
         if (VB.Global.$GlobalMDIForm() != null) {
            VB.Global.$GlobalMDIForm().addChild(this);
         }

         Class_Initialize();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   @Override
   public void fireLoaded() {
      Throwable Err = null;
      VB.LoadAdapter tmpFireAdapter = new VB.LoadAdapter(this, this);

      try {
         tmpFireAdapter.fireLoaded();
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void fireLoaded(Object sender) {
      Throwable Err = null;
      boolean MemVisible = isVisible();

      try {
         $Height($Height() + ($Height() - (float)$Parent().getContentPane().getHeight()));
         $Width($Width() + ($Width() - (float)$Parent().getContentPane().getWidth()));
         Form_Load();
         myContent.$Visible(true);
         setVisible(MemVisible);
         FormLoaded = true;
         $Visible(StartUpVisible);
         $Parent().addComponentListener(this);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void dispose() {
      Throwable Err = null;

      try {
         Form_Unload();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   @Override
   public void componentHidden(ComponentEvent e) {
      Throwable Err = null;

      try {
         Form_Deactivate();
      } finally {
         return;
      }
   }

   @Override
   public void componentMoved(ComponentEvent e) {
      Throwable Err = null;

      try {
         Form_Move();
      } finally {
         return;
      }
   }

   @Override
   public void componentResized(ComponentEvent e) {
      Throwable Err = null;

      label44:
      try {
         Form_Resize();
      } finally {
         break label44;
      }

      try {
         AnchorResize();
      } finally {
         return;
      }
   }

   @Override
   public void componentShown(ComponentEvent e) {
      Throwable Err = null;

      try {
         Form_Activate();
      } finally {
         return;
      }
   }

   public void Form_Activate() {
      Throwable Err = null;
   }

   public void Form_Deactivate() {
      Throwable Err = null;
   }

   public void Form_GotFocus() {
      Throwable Err = null;
   }

   public void Form_LostFocus() {
      Throwable Err = null;
   }

   public void Form_Load() {
      Throwable Err = null;
   }

   public void Form_Resize() {
      Throwable Err = null;
   }

   public void Form_Move() {
      Throwable Err = null;
   }

   public void Form_MenuClick(VB.IMenuItem MenuItem) {
      Throwable Err = null;
   }

   public void Form_ToolBarClick(VB.IToolBarItem ToolBarItem) {
      Throwable Err = null;
   }

   public void Form_Click() {
      Throwable Err = null;
   }

   public void Form_DblClick() {
      Throwable Err = null;
   }

   public void Form_KeyDown(int KeyCode, int Shift) {
      Throwable Err = null;
   }

   public void Form_KeyPress(int KeyAscii) {
      Throwable Err = null;
   }

   public void Form_KeyUp(int KeyCode, int Shift) {
      Throwable Err = null;
   }

   public void Form_MouseDown(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Form_MouseMove(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Form_MouseUp(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Form_Paint(Graphics g) {
      Throwable Err = null;
   }

   public int Form_Unload() {
      int Form_Unload = 0;
      Throwable Err = null;
      return Form_Unload;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_MouseUp(int Button, int Shift, float X, float Y) {
      Throwable Err = null;

      try {
         Form_MouseUp(Button, Shift, X, Y);
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
         Form_MouseMove(Button, Shift, X, Y);
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
         Form_MouseDown(Button, Shift, X, Y);
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
         Form_Click();
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
         Form_DblClick();
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
         Form_KeyDown(KeyCode, Shift);
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
         Form_KeyPress(KeyAscii);
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
         Form_KeyUp(KeyCode, Shift);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myContent_Paint(Graphics g) {
      Throwable Err = null;

      try {
         Form_Paint(g);
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
         Form_MenuClick(MenuItem);
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
         Form_ToolBarClick(ToolBarItem);
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
         if (!FormLoaded) {
            myContent.$Visible(v);
         }

         myContent.$AutoRedraw(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
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
   public void PSet(float x, float y, long col) {
      Throwable Err = null;

      try {
         myContent.PSet(x, y, col);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
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
   public Image $Image() {
      Image $Image = null;
      Throwable Err = null;

      try {
         $Image = myContent.$Image();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Image;
      }

      return $Image;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public BufferedImage $ImageBuffer() {
      BufferedImage $ImageBuffer = null;
      Throwable Err = null;

      try {
         $ImageBuffer = myContent.$ImageBuffer();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ImageBuffer;
      }

      return $ImageBuffer;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $Point(float x, float y) {
      long $Point = 0L;
      Throwable Err = null;

      try {
         $Point = myContent.$Point(x, y);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return $Point;
      }

      return $Point;
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
   public float $ScaleLeft() {
      float $ScaleLeft = 0.0F;
      Throwable Err = null;

      try {
         $ScaleLeft = myContent.$Left();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ScaleLeft;
      }

      return $ScaleLeft;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $ScaleTop() {
      float $ScaleTop = 0.0F;
      Throwable Err = null;

      try {
         $ScaleTop = myContent.$Top();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ScaleTop;
      }

      return $ScaleTop;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $ScaleWidth() {
      float $ScaleWidth = 0.0F;
      Throwable Err = null;

      try {
         $ScaleWidth = myContent.$Width();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ScaleWidth;
      }

      return $ScaleWidth;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $ScaleHeight() {
      float $ScaleHeight = 0.0F;
      Throwable Err = null;

      try {
         $ScaleHeight = myContent.$Height();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ScaleHeight;
      }

      return $ScaleHeight;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Close() {
      Throwable Err = null;

      try {
         $Parent().dispose();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public ArrayList $Controls() {
      ArrayList $Controls = null;
      Throwable Err = null;
      int h8 = 0;
      int h9 = false;
      VB.PictureBox pbControl = null;
      int h11 = 0;
      int h12 = 0;
      VB.Frame frControl = null;
      VBArrayObject comp = new VBArray();

      label1032:
      try {
         comp = VBArray.createVBArray(getParentContainer().getComponents());
      } finally {
         break label1032;
      }

      label1029:
      try {
         $Controls = new ArrayList();
      } finally {
         break label1029;
      }

      int i = 0;
      int v = 0;
      i = comp.getUBound(1);
      h8 = 0;

      for (int var127 = -1 * 1; var127 < 0 ? i >= h8 : i <= h8; i += var127) {
         label1022:
         try {
            $Controls.add((Component)((Component)comp.valueOfObj(i)));
         } finally {
            break label1022;
         }

         label1037: {
            label1038: {
               try {
                  if ((Component)comp.valueOfObj(i) instanceof VB.PictureBox) {
                     break label1038;
                  }
               } finally {
                  break label1038;
               }

               label1009:
               try {
                  if (!((Component)comp.valueOfObj(i) instanceof VB.Frame)) {
                     break label1037;
                  }
               } finally {
                  break label1009;
               }

               label987:
               try {
                  frControl = (VB.Frame)((Component)comp.valueOfObj(i));
               } finally {
                  break label987;
               }

               v = 0;
               h11 = frControl.getComponentCount() - 1;
               h12 = 1;

               while (true) {
                  if (v > h11) {
                     break label1037;
                  }

                  label980:
                  try {
                     $Controls.add((Component)frControl.$Parent().getComponent(v));
                  } finally {
                     break label980;
                  }

                  v += h12;
               }
            }

            label1002:
            try {
               pbControl = (VB.PictureBox)((Component)comp.valueOfObj(i));
            } finally {
               break label1002;
            }

            v = 0;
            h11 = pbControl.getComponentCount() - 1;

            for (int var131 = 1; v <= h11; v += var131) {
               try {
                  $Controls.add((Component)pbControl.$Parent().getComponent(v));
               } finally {
                  continue;
               }
            }
         }

         try {
            ;
         } finally {
            continue;
         }
      }

      return $Controls;
   }

   private Container getParentContainer() {
      Container getParentContainer = null;
      Throwable Err = null;
      int h8 = 0;
      int h9 = false;
      new VBArray();
      int i = 0;

      label1039: {
         VBArray comp;
         try {
            comp = VBArray.createVBArray(getComponents());
         } finally {
            break label1039;
         }

         Container rootComp = null;
         i = 0;
         h8 = comp.getUBound(1);

         for (int var113 = 1; i <= h8; i += var113) {
            try {
               if (((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JRootPane")) {
                  rootComp = (Container)((Component)comp.valueOfObj(i));
               }
            } finally {
               break label1039;
            }
         }

         try {
            comp = VBArray.createVBArray(rootComp.getComponents());
         } finally {
            break label1039;
         }

         Container layerComp = null;
         i = 0;
         h8 = comp.getUBound(1);

         for (int var114 = 1; i <= h8; i += var114) {
            try {
               if (((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JLayeredPane")) {
                  layerComp = (Container)((Component)comp.valueOfObj(i));
               }
            } finally {
               break label1039;
            }
         }

         try {
            comp = VBArray.createVBArray(layerComp.getComponents());
         } finally {
            break label1039;
         }

         Container panelComp = null;
         i = 0;
         h8 = comp.getUBound(1);

         for (int var115 = 1; i <= h8; i += var115) {
            try {
               if (((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JPanel")) {
                  panelComp = (Container)((Component)comp.valueOfObj(i));
               }
            } finally {
               break label1039;
            }
         }

         try {
            comp = VBArray.createVBArray(panelComp.getComponents());
         } finally {
            break label1039;
         }

         Container boxComp = null;
         i = 0;
         h8 = comp.getUBound(1);

         for (int var116 = 1; i <= h8; i += var116) {
            try {
               if (((Component)comp.valueOfObj(i)).getClass().getName().equals(Strings.StrCat(getClass().getSuperclass().getName(), "$PictureBox"))) {
                  boxComp = (Container)((Component)comp.valueOfObj(i));
               }
            } finally {
               break label1039;
            }
         }

         label958:
         try {
            getParentContainer = boxComp;
            return boxComp;
         } finally {
            break label958;
         }
      }

      Interaction.MsgBox((Throwable)Err);
      return getParentContainer;
   }

   private void AnchorResize() {
      Throwable Err = null;
      int h6 = 0;
      int h7 = false;
      VB.IJabacoControl myCont = null;
      VBArrayObject comp = new VBArray();
      int i = 0;

      label260:
      try {
         comp = VBArray.createVBArray(getParentContainer().getComponents());
      } finally {
         break label260;
      }

      i = 0;
      h6 = comp.getUBound(1);

      for (int var40 = 1; i <= h6; i += var40) {
         label265: {
            label252:
            try {
               if (!((Component)comp.valueOfObj(i) instanceof VB.IJabacoControl)) {
                  break label265;
               }
            } finally {
               break label252;
            }

            label245:
            try {
               myCont = (VB.IJabacoControl)((Component)comp.valueOfObj(i));
            } finally {
               break label245;
            }

            label243:
            try {
               myCont.ResizeTrigger((float)$Parent().getContentPane().getWidth(), (float)$Parent().getContentPane().getHeight());
            } finally {
               break label243;
            }
         }

         try {
            ;
         } finally {
            continue;
         }
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
         myContent.$FontBold(val);
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
   public void Show() {
      Throwable Err = null;

      try {
         $Parent().show();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Caption() {
      String $Caption = "";
      Throwable Err = null;

      try {
         $Caption = getTitle();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Caption;
      }

      return $Caption;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Caption(String v) {
      Throwable Err = null;

      try {
         setTitle(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.StartUpPositionConstants $StartUpPosition() {
      VB.StartUpPositionConstants $StartUpPosition = new VB.StartUpPositionConstants();
      Throwable Err = null;

      try {
         $StartUpPosition = StartUpPositionVal;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $StartUpPosition;
      }

      return $StartUpPosition;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $StartUpPosition(VB.StartUpPositionConstants val) {
      Throwable Err = null;
      Dimension tmpDimension = null;

      try {
         if (val.compareTo(VB.StartUpPositionConstants.vbStartUpScreen) != 0) {
            if (val.compareTo(VB.StartUpPositionConstants.vbStartUpManual) == 0) {
               ;
            }
         } else {
            tmpDimension = Toolkit.getDefaultToolkit().getScreenSize();
            super.setLocation(
               (int)((double)((float)((Dimension)tmpDimension).width - $Width()) / (double)2),
               (int)((double)((float)((Dimension)tmpDimension).height - $Height()) / (double)2)
            );
         }

         StartUpPositionVal = val;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Resizable() {
      boolean $Resizable = false;
      Throwable Err = null;

      try {
         $Resizable = $Parent().isResizable();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Resizable;
      }

      return $Resizable;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Resizable(boolean v) {
      Throwable Err = null;

      try {
         $Parent().setResizable(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Closable() {
      boolean $Closable = false;
      Throwable Err = null;

      try {
         $Closable = $Parent().isClosable();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Closable;
      }

      return $Closable;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Closable(boolean v) {
      Throwable Err = null;

      try {
         $Parent().setClosable(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Minimizable() {
      boolean $Minimizable = false;
      Throwable Err = null;

      try {
         $Minimizable = $Parent().isIconifiable();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Minimizable;
      }

      return $Minimizable;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Minimizable(boolean v) {
      Throwable Err = null;

      try {
         $Parent().setIconifiable(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Maximizable() {
      boolean $Maximizable = false;
      Throwable Err = null;

      try {
         $Maximizable = $Parent().isMaximizable();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Maximizable;
      }

      return $Maximizable;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Maximizable(boolean v) {
      Throwable Err = null;

      try {
         $Parent().setMaximizable(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.FormWindowStateConstants $WindowState() {
      VB.FormWindowStateConstants $WindowState = new VB.FormWindowStateConstants();
      Throwable Err = null;

      try {
         if (!$Parent().isMaximum()) {
            if (!$Parent().isIconifiable()) {
               $WindowState = VB.FormWindowStateConstants.vbNormal;
            } else {
               $WindowState = VB.FormWindowStateConstants.vbMinimized;
            }
         } else {
            $WindowState = VB.FormWindowStateConstants.vbMaximized;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $WindowState;
      }

      return $WindowState;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $WindowState(VB.FormWindowStateConstants val) {
      Throwable Err = null;
      new VB.FormWindowStateConstants();
      VB.FormWindowStateConstants h5 = null;

      try {
         if (val.compareTo(VB.FormWindowStateConstants.vbNormal) != 0) {
            if (val.compareTo(VB.FormWindowStateConstants.vbMinimized) != 0) {
               if (val.compareTo(VB.FormWindowStateConstants.vbMaximized) == 0) {
                  $Parent().setMaximum(true);
                  $Parent().setIcon(false);
               }
            } else {
               $Parent().setIcon(true);
               $Parent().setMaximum(false);
            }
         } else {
            $Parent().setMaximum(false);
            $Parent().setIcon(false);
         }
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
         if (myContent != null) {
            getBackground = myContent.$Parent().getBackground();
         } else {
            getBackground = super.getBackground();
         }
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
         if (myContent != null) {
            getForeground = myContent.$Parent().getForeground();
         } else {
            getForeground = super.getForeground();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getForeground;
      }

      return getForeground;
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
   public void $Height(float v) {
      Throwable Err = null;

      try {
         setSize(getSize().width, (int)v);
         Refresh();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Enabled() {
      boolean $Enabled = false;
      Throwable Err = null;

      try {
         $Enabled = isEnabled();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Enabled;
      }

      return $Enabled;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Enabled(boolean v) {
      Throwable Err = null;

      try {
         setEnabled(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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
   public void $Visible(boolean v) {
      Throwable Err = null;

      try {
         if (!FormLoaded) {
            StartUpVisible = v;
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
   public VB.MousePointerConstants $MousePointer() {
      VB.MousePointerConstants $MousePointer = new VB.MousePointerConstants();
      Throwable Err = null;

      try {
         $MousePointer = VB.Global.JCursorToVBMousePointer($Parent().getCursor());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $MousePointer;
      }

      return $MousePointer;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $MousePointer(VB.MousePointerConstants v) {
      Throwable Err = null;

      try {
         $Parent().setCursor(VB.Global.VBMousePointerToJCursor(v));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $MouseIcon() {
      IResource $MouseIcon = null;
      Throwable Err = null;

      try {
         $MouseIcon = myMouseIcon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $MouseIcon;
      }

      return $MouseIcon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $MouseIcon(IResource v) {
      Throwable Err = null;

      try {
         myMouseIcon = v;
         $Parent().setCursor(VB.Global.VBMouseIconToJCursor(v, this));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $CanGetFocus() {
      boolean $CanGetFocus = false;
      Throwable Err = null;

      try {
         $CanGetFocus = $Parent().isFocusable();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $CanGetFocus;
      }

      return $CanGetFocus;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $CanGetFocus(boolean v) {
      Throwable Err = null;

      try {
         $Parent().setFocusable(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void SetFocus() {
      Throwable Err = null;

      try {
         $Parent().requestFocus();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
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

   private void initVars() {
      myInitLookAndFeelFlag = VB.Global.LookAndFeelManager().isInitialized();
      FormLoaded = false;
      StartUpVisible = false;
      StartUpPositionVal = VB.StartUpPositionConstants.vbStartUpScreen;
      myTag = "";
      myMouseIcon = null;
      myIcon = null;
      myMDIChildFocusHandler = null;
      myContent = new VB.MDIChild$PictureBox();
      myContent.setOwner(this, 1);
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
}
