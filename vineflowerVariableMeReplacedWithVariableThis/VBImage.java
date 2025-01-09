package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class VBImage implements IResource {
   private BufferedImage myImage;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBImage(int width, int height) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBImage(BufferedImage refImage) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myImage = refImage;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBImage(Image refImage) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myImage = Interaction.createBufferedImage(refImage);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   public VBImage(String url) {
      Throwable Err = null;
      super();
      initVars();
      InputStream myStream = null;
      URL myUrl = null;

      label255:
      try {
         myUrl = new URL(url);
      } finally {
         break label255;
      }

      label259: {
         label251: {
            label250:
            try {
               if (myUrl != null) {
                  break label251;
               }
            } finally {
               break label250;
            }

            try {
               myStream = new FileInputStream(url);
               break label259;
            } finally {
               break label259;
            }
         }

         label240:
         try {
            ;
         } finally {
            break label240;
         }

         label238:
         try {
            myStream = myUrl.openStream();
         } finally {
            break label238;
         }
      }

      label235:
      try {
         ;
      } finally {
         break label235;
      }

      myImage = ImageIO.read(myStream);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBImage(URL url) {
      Throwable Err = null;
      super();
      initVars();
      InputStream myStream = url.openStream();

      try {
         myImage = ImageIO.read(myStream);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBImage(IResource refImage) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myImage = Interaction.createBufferedImage(VB.Global.LoadPicture(refImage));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VBImage(VB.VBImage refImage) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myImage = Interaction.createBufferedImage(refImage.getImage());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public BufferedImage getImage() {
      BufferedImage getImage = null;
      Throwable Err = null;

      try {
         getImage = myImage;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getImage;
      }

      return getImage;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $RGB(int x, int y) {
      long $RGB = 0L;
      Throwable Err = null;

      try {
         $RGB = (long)myImage.getRGB(x, y);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return $RGB;
      }

      return $RGB;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $RGB(int x, int y, long v) {
      Throwable Err = null;

      try {
         myImage.setRGB(x, y, (int)v);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBImage cutImage(int x, int y, int width, int height) {
      VB.VBImage cutImage = null;
      Throwable Err = null;

      try {
         myImage = myImage.getSubimage(x, y, width, height);
         cutImage = this;
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return cutImage;
      }

      return cutImage;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBImage scaleImage(int width, int height) {
      VB.VBImage scaleImage = null;
      Throwable Err = null;

      try {
         scaleImage(width, height, true);
         scaleImage = this;
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return scaleImage;
      }

      return scaleImage;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBImage scaleImage(int width, int height, boolean smooth) {
      VB.VBImage scaleImage = null;
      Throwable Err = null;

      try {
         myImage = Interaction.createBufferedImage(
            myImage
               .getScaledInstance(
                  width, height, Interaction.IIF(smooth, VBVariant.valueOf(Image.SCALE_SMOOTH), VBVariant.valueOf(Image.SCALE_DEFAULT)).intValue()
               )
         );
         scaleImage = this;
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return scaleImage;
      }

      return scaleImage;
   }

   public VB.VBImage rotateImage(Image Picture, double angle, int xAngle, int yAngle) {
      VB.VBImage rotateImage = null;
      Throwable Err = null;
      return (VB.VBImage)rotateImage;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Graphics $Graphics() {
      Graphics $Graphics = null;
      Throwable Err = null;

      try {
         $Graphics = myImage.getGraphics();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Graphics;
      }

      return $Graphics;
   }

   private void initVars() {
      myImage = null;
   }
}
