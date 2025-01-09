package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Form extends VB.AbstractForm implements VB.IJabacoForm, VB.IJabacoContainer {
   private VB.Form$PictureBox myContent;

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
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         myContent.$BorderStyle(VB.fmBorderStyle.fmBorderStyleNone);
         super.getContentPane().add(myContent);
         myContent.$Visible(true);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   @Override
   public int Form_Unload() {
      int Form_Unload = 0;
      Throwable Err = null;
      return Form_Unload;
   }

   @Override
   public void Form_Activate() {
      Throwable Err = null;
   }

   @Override
   public void Form_Deactivate() {
      Throwable Err = null;
   }

   @Override
   public void Form_GotFocus() {
      Throwable Err = null;
   }

   @Override
   public void Form_LostFocus() {
      Throwable Err = null;
   }

   @Override
   public void Form_Load() {
      Throwable Err = null;
   }

   @Override
   public void Form_Resize() {
      Throwable Err = null;
   }

   @Override
   public void Form_Move() {
      Throwable Err = null;
   }

   @Override
   public void Form_MenuClick(VB.IMenuItem MenuItem) {
      Throwable Err = null;
   }

   @Override
   public void Form_ToolBarClick(VB.IToolBarItem ToolBarItem) {
      Throwable Err = null;
   }

   public void Form_Click() {
      Throwable Err = null;
   }

   public void Form_DblClick() {
      Throwable Err = null;
   }

   @Override
   public void Form_KeyDown(int KeyCode, int Shift) {
      Throwable Err = null;
   }

   @Override
   public void Form_KeyPress(int KeyAscii) {
      Throwable Err = null;
   }

   @Override
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

   public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle) {
      Circle(x, y, radius, color, startAngle, endAngle, (float)1, (long)(-1 * 1));
   }

   public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect) {
      Circle(x, y, radius, color, startAngle, endAngle, aspect, (long)(-1 * 1));
   }

   public Form() {
      initVarsI();
      Class_Initialize();
   }

   private void initVarsI() {
      myContent = new VB.Form$PictureBox();
      myContent.setOwner(this, 1);
   }
}
