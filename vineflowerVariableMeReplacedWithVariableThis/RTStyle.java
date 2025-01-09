package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

public class RTStyle {
   private Style myStyle;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public RTStyle(Style refStyle) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myStyle = refStyle;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Style getStyle() {
      Style getStyle = null;
      Throwable Err = null;

      try {
         getStyle = myStyle;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getStyle;
      }

      return getStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BidiLevel(int v) {
      Throwable Err = null;

      try {
         StyleConstants.setBidiLevel(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int $BidiLevel() {
      int $BidiLevel = 0;
      Throwable Err = null;

      try {
         $BidiLevel = StyleConstants.getBidiLevel(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $BidiLevel;
      }

      return $BidiLevel;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Superscript(boolean v) {
      Throwable Err = null;

      try {
         StyleConstants.setSuperscript(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Superscript() {
      boolean $Superscript = false;
      Throwable Err = null;

      try {
         $Superscript = StyleConstants.isSuperscript(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Superscript;
      }

      return $Superscript;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Subscript(boolean v) {
      Throwable Err = null;

      try {
         StyleConstants.setSubscript(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Subscript() {
      boolean $Subscript = false;
      Throwable Err = null;

      try {
         $Subscript = StyleConstants.isSubscript(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Subscript;
      }

      return $Subscript;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $SpaceAbove(float v) {
      Throwable Err = null;

      try {
         StyleConstants.setSpaceAbove(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $SpaceAbove() {
      float $SpaceAbove = 0.0F;
      Throwable Err = null;

      try {
         $SpaceAbove = StyleConstants.getSpaceAbove(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $SpaceAbove;
      }

      return $SpaceAbove;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $SpaceBelow(float v) {
      Throwable Err = null;

      try {
         StyleConstants.setSpaceBelow(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $SpaceBelow() {
      float $SpaceBelow = 0.0F;
      Throwable Err = null;

      try {
         $SpaceBelow = StyleConstants.getSpaceBelow(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $SpaceBelow;
      }

      return $SpaceBelow;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $RightIndent(float v) {
      Throwable Err = null;

      try {
         StyleConstants.setRightIndent(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $RightIndent() {
      float $RightIndent = 0.0F;
      Throwable Err = null;

      try {
         $RightIndent = StyleConstants.getRightIndent(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $RightIndent;
      }

      return $RightIndent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $LeftIndent(float v) {
      Throwable Err = null;

      try {
         StyleConstants.setLeftIndent(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $LeftIndent() {
      float $LeftIndent = 0.0F;
      Throwable Err = null;

      try {
         $LeftIndent = StyleConstants.getLeftIndent(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $LeftIndent;
      }

      return $LeftIndent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FirstLineIndent(float v) {
      Throwable Err = null;

      try {
         StyleConstants.setFirstLineIndent(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $FirstLineIndent() {
      float $FirstLineIndent = 0.0F;
      Throwable Err = null;

      try {
         $FirstLineIndent = StyleConstants.getFirstLineIndent(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FirstLineIndent;
      }

      return $FirstLineIndent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Bold(boolean v) {
      Throwable Err = null;

      try {
         StyleConstants.setBold(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Bold() {
      boolean $Bold = false;
      Throwable Err = null;

      try {
         $Bold = StyleConstants.isBold(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Bold;
      }

      return $Bold;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Italic(boolean v) {
      Throwable Err = null;

      try {
         StyleConstants.setItalic(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Italic() {
      boolean $Italic = false;
      Throwable Err = null;

      try {
         $Italic = StyleConstants.isItalic(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Italic;
      }

      return $Italic;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Underline(boolean v) {
      Throwable Err = null;

      try {
         StyleConstants.setUnderline(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Underline() {
      boolean $Underline = false;
      Throwable Err = null;

      try {
         $Underline = StyleConstants.isUnderline(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Underline;
      }

      return $Underline;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontName(String v) {
      Throwable Err = null;

      try {
         StyleConstants.setFontFamily(myStyle, v);
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
         $FontName = StyleConstants.getFontFamily(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontName;
      }

      return $FontName;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FontSize(int v) {
      Throwable Err = null;

      try {
         StyleConstants.setFontSize(myStyle, v);
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
         $FontSize = StyleConstants.getFontSize(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FontSize;
      }

      return $FontSize;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $TextColor(long v) {
      Throwable Err = null;

      try {
         StyleConstants.setForeground(myStyle, Information.RGBtoColor(v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $TextColor() {
      long $TextColor = 0L;
      Throwable Err = null;

      try {
         $TextColor = Information.ColorToRGB(StyleConstants.getForeground(myStyle));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $TextColor;
      }

      return $TextColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BackColor(long v) {
      Throwable Err = null;

      try {
         StyleConstants.setBackground(myStyle, Information.RGBtoColor(v));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColor() {
      long $BackColor = 0L;
      Throwable Err = null;

      try {
         $BackColor = Information.ColorToRGB(StyleConstants.getBackground(myStyle));
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BackColor;
      }

      return $BackColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Icon(IResource v) {
      Throwable Err = null;

      try {
         StyleConstants.setIcon(myStyle, VB.Global.LoadIcon(v));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $Icon() {
      IResource $Icon = null;
      Throwable Err = null;

      try {
         $Icon = new VB.VBImage(StyleConstants.getIcon(myStyle).toString());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Icon;
      }

      return $Icon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $StrikeThrough(boolean v) {
      Throwable Err = null;

      try {
         StyleConstants.setStrikeThrough(myStyle, v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $StrikeThrough() {
      boolean $StrikeThrough = false;
      Throwable Err = null;

      try {
         $StrikeThrough = StyleConstants.isStrikeThrough(myStyle);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $StrikeThrough;
      }

      return $StrikeThrough;
   }

   private void initVars() {
      myStyle = null;
   }
}
