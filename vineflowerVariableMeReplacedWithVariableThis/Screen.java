package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import VBA.VBArray;
import VBA.VBArrayString;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

public class Screen implements VB.IJabacoClass {
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $Width() {
      float $Width = 0.0F;
      Throwable Err = null;

      try {
         $Width = (float)Toolkit.getDefaultToolkit().getScreenSize().width;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Width;
      }

      return $Width;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $Height() {
      float $Height = 0.0F;
      Throwable Err = null;

      try {
         $Height = (float)Toolkit.getDefaultToolkit().getScreenSize().height;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Height;
      }

      return $Height;
   }

   public String $Fonts(int Index) {
      String $Fonts = "";
      Throwable Err = null;
      VBArrayString tmpList = new VBArray();

      label44:
      try {
         tmpList = VBArray.createVBArray(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
      } finally {
         break label44;
      }

      try {
         $Fonts = tmpList.valueOfStr(Index);
      } finally {
         return $Fonts;
      }

      return $Fonts;
   }

   public int $FontCount() {
      int $FontCount = 0;
      Throwable Err = null;
      VBArrayString tmpList = new VBArray();

      label44:
      try {
         tmpList = VBArray.createVBArray(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
      } finally {
         break label44;
      }

      try {
         $FontCount = tmpList.getUBound(1);
      } finally {
         return $FontCount;
      }

      return $FontCount;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $TwipsPerPixelX() {
      float $TwipsPerPixelX = 0.0F;
      Throwable Err = null;

      try {
         $TwipsPerPixelX = (float)1;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $TwipsPerPixelX;
      }

      return $TwipsPerPixelX;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $TwipsPerPixelY() {
      float $TwipsPerPixelY = 0.0F;
      Throwable Err = null;

      try {
         $TwipsPerPixelY = (float)1;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $TwipsPerPixelY;
      }

      return $TwipsPerPixelY;
   }

   public Screen() {
      initVars();
   }

   private void initVars() {
   }
}
