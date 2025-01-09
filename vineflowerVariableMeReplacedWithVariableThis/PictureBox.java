package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayString;
import VBA.VBArrayVariant;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D.Float;
import java.awt.image.BufferedImage;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class PictureBox extends JPanel implements VB.IJabacoControl, MouseListener, MouseMotionListener, KeyListener, FocusListener {
   private boolean DoubleBuffering;
   private ButtonGroup RadioButtonGroup;
   private Image myImage;
   private IResource myImagePath;
   private Image myBufferedImage;
   private float myDrawWidth;
   private int myTransparency;
   private boolean myAntiAliasing;
   private VB.fmBorderStyle myBorderStyle;
   private VB.fmSpecialEffect mySpecialEffect;
   private long myBorderColor;
   private long myCurrentX;
   private long myCurrentY;
   private String myTag;
   private IResource myMouseIcon;
   private long myForeColor;
   private VB.AnchorStyles myAnchor;
   private float mySavedWidth;
   private float mySavedHeight;
   private float mySavedLeft;
   private float mySavedTop;
   private float hostSavedWidth;
   private float hostSavedHeight;
   private boolean isResizeTriggerInitialized;
   private boolean isLeftInitialized;
   private boolean isTopInitialized;
   private float smv;
   private float h3;

   public void _Activate() {
   }

   public void _Click() {
   }

   public void _DblClick() {
   }

   public void _Deactivate() {
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

   public void _MouseDown(int Button, int Shift, float X, float Y) {
   }

   public void _MouseMove(int Button, int Shift, float X, float Y) {
   }

   public void _MouseUp(int Button, int Shift, float X, float Y) {
   }

   public void _MouseEntered() {
   }

   public void _MouseExited() {
   }

   public void _Paint(Graphics g) {
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JPanel $Parent() {
      JPanel $Parent = null;
      Throwable Err = null;

      try {
         $Parent = this;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   public PictureBox() {
      Throwable Err = null;
      super();
      initVars();

      label594:
      try {
         $Parent().addKeyListener(this);
      } finally {
         break label594;
      }

      label591:
      try {
         $Parent().addFocusListener(this);
      } finally {
         break label591;
      }

      label588:
      try {
         $Parent().addMouseListener(this);
      } finally {
         break label588;
      }

      label585:
      try {
         $Parent().addMouseMotionListener(this);
      } finally {
         break label585;
      }

      label582:
      try {
         $Parent().setDoubleBuffered(true);
      } finally {
         break label582;
      }

      label579:
      try {
         super.setBorder(new EtchedBorder());
      } finally {
         break label579;
      }

      label576:
      try {
         super.setLayout(null);
      } finally {
         break label576;
      }

      label573:
      try {
         super.setFocusable(true);
      } finally {
         break label573;
      }

      label570:
      try {
         super.setFocusTraversalKeysEnabled(false);
      } finally {
         break label570;
      }

      label567:
      try {
         super.setRequestFocusEnabled(true);
      } finally {
         break label567;
      }

      label564:
      try {
         myTransparency = 0;
      } finally {
         break label564;
      }

      try {
         myDrawWidth = (float)1;
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void focusGained(FocusEvent arg2) {
      Throwable Err = null;

      try {
         _GotFocus();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void focusLost(FocusEvent arg2) {
      Throwable Err = null;

      try {
         _LostFocus();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseMoved(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseMove(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseDragged(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseMove(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mousePressed(MouseEvent e) {
      Throwable Err = null;

      try {
         SetFocus();
         _MouseDown(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseReleased(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseUp(VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), (float)e.getX(), (float)e.getY());
         if (e.getX() > 0 & e.getY() > 0 & e.getX() < getWidth() & e.getY() < getHeight()) {
            if (e.getClickCount() % 2 != 0) {
               _Click();
            } else {
               _DblClick();
            }
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   @Override
   public void mouseClicked(MouseEvent e) {
      Throwable Err = null;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseEntered(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseEntered();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void mouseExited(MouseEvent e) {
      Throwable Err = null;

      try {
         _MouseExited();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void keyReleased(KeyEvent e) {
      Throwable Err = null;

      try {
         _KeyUp(e.getKeyCode(), VB.Global.KeyEventToShiftConstant(e));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void keyTyped(KeyEvent e) {
      Throwable Err = null;

      try {
         _KeyPress(e.getKeyChar());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void keyPressed(KeyEvent e) {
      Throwable Err = null;

      try {
         _KeyDown(e.getKeyCode(), VB.Global.KeyEventToShiftConstant(e));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private Image GetBufferedImage() {
      Image GetBufferedImage = null;
      Throwable Err = null;
      Image oldImage = null;
      Graphics2D TmpGraphics2D = null;

      try {
         if (myBufferedImage == null) {
            smv = (float)0;
            h3 = (float)0;
         }

         if (smv != $Width() | h3 != $Height()) {
            oldImage = myBufferedImage;
            TmpGraphics2D = (Graphics2D)super.getGraphics();
            if (TmpGraphics2D == null) {
               return GetBufferedImage;
            }

            myBufferedImage = TmpGraphics2D.getDeviceConfiguration().createCompatibleImage((int)$Width(), (int)$Height(), Transparency.TRANSLUCENT);
            if (oldImage != null) {
               myBufferedImage.getGraphics().drawImage((Image)oldImage, 0, 0, null);
            }

            smv = $Width();
            h3 = $Height();
         }

         GetBufferedImage = myBufferedImage;
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return GetBufferedImage;
      }

      return GetBufferedImage;
   }

   public Graphics2D getGraphics() {
      Graphics2D getGraphics = null;
      Throwable Err = null;
      Graphics2D getGraphics2D = null;

      label100: {
         try {
            if (!DoubleBuffering) {
               getGraphics2D = (Graphics2D)super.getGraphics();
            } else {
               if (GetBufferedImage() == null) {
                  return getGraphics;
               }

               getGraphics2D = (Graphics2D)GetBufferedImage().getGraphics();
            }

            getGraphics2D.setFont(getFont());
            getGraphics2D.setColor(getForeground());
         } finally {
            break label100;
         }

         AlphaComposite tmpAlpha = null;
         float tmpAlphaValue = 0.0F;

         label91:
         try {
            tmpAlphaValue = (float)((double)(100 - myTransparency) / (double)100);
            tmpAlpha = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, tmpAlphaValue);
            getGraphics2D.setComposite((Composite)tmpAlpha);
            getGraphics2D.setStroke(new BasicStroke(myDrawWidth));
            getGraphics2D.setBackground(getBackground());
            if (myAntiAliasing) {
               getGraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            }

            getGraphics = getGraphics2D;
            return getGraphics2D;
         } finally {
            break label91;
         }
      }

      Interaction.MsgBox((Throwable)Err);
      return getGraphics;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void disposeGraphics(Graphics v) {
      Throwable Err = null;

      try {
         if (DoubleBuffering) {
            $Parent().repaint(0, 0, (int)$Width(), (int)$Height());
         }

         v.dispose();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   private void SetZOrder(Component Component) {
      Throwable Err = null;
      VBVariant ParentV = new VBVariant();

      label44:
      try {
         ParentV = VBVariant.valueOf($Parent());
      } finally {
         break label44;
      }

      try {
         Object var10000 = ParentV.toObject();
         VBArrayVariant var10002 = VBArray.createParamArray(1);
         var10002.setValueVar(0, VBVariant.valueOf(Component));
         var10002.setValueVar(1, VBVariant.valueOf(0));
         Interaction.CallByName(var10000, "setComponentZOrder", var10002);
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void add(Component Component) {
      Throwable Err = null;

      try {
         $Parent().add(Component);
         SetZOrder(Component);
      } catch (Throwable var77) {
         Interaction.MsgBox(var77);
         return;
      }

      JCheckBox ComponentCB = null;

      label440:
      try {
         ComponentCB = (JCheckBox)Component;
      } finally {
         break label440;
      }

      try {
         if (ComponentCB != null) {
            return;
         }
      } finally {
         return;
      }

      label430:
      try {
         ;
      } finally {
         break label430;
      }

      AbstractButton ComponentAB = null;

      label426:
      try {
         ComponentAB = (AbstractButton)Component;
      } finally {
         break label426;
      }

      label423: {
         label422:
         try {
            if (ComponentAB == null) {
               break label423;
            }
         } finally {
            break label422;
         }

         label417:
         try {
            RadioButtonGroup.add(ComponentAB);
         } finally {
            break label417;
         }
      }

      try {
         ;
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Opaque() {
      boolean $Opaque = false;
      Throwable Err = null;

      try {
         $Opaque = $Parent().isOpaque();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Opaque;
      }

      return $Opaque;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Opaque(boolean v) {
      Throwable Err = null;

      try {
         $Parent().setOpaque(v);
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
         $CurrentX = myCurrentX;
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
         myCurrentX = v;
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
         $CurrentY = myCurrentY;
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
         myCurrentY = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void PSet(float x, float y) {
      Throwable Err = null;

      try {
         Line(x, y, x, y);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void PSet(float x, float y, long col) {
      Throwable Err = null;
      long MemCol = 0L;

      try {
         MemCol = $ForeColor();
         $ForeColor(col);
         Line(x, y, x, y);
         $ForeColor(MemCol);
      } catch (Throwable var10) {
         Interaction.MsgBox(var10);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Line(float x, float y) {
      Throwable Err = null;

      try {
         Line((float)myCurrentX, (float)myCurrentY, x, y);
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
         Line(x1, y1, x2, y2, false);
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
         Line(x1, y1, x2, y2, Rect, (long)(-1 * 1));
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   public void Line(float x1, float y1, float x2, float y2, boolean Rect, long FillColor) {
      Throwable Err = null;
      Color tmpColor = null;
      Graphics2D my2DGraphics = null;

      label1076:
      try {
         my2DGraphics = getGraphics();
      } finally {
         break label1076;
      }

      label1080: {
         label1081: {
            label1071:
            try {
               if (!Rect) {
                  break label1081;
               }
            } finally {
               break label1071;
            }

            label1082: {
               label1063:
               try {
                  if (FillColor == (long)(-1 * 1)) {
                     break label1082;
                  }
               } finally {
                  break label1063;
               }

               label1060:
               try {
                  tmpColor = my2DGraphics.getColor();
               } finally {
                  break label1060;
               }

               label1057:
               try {
                  my2DGraphics.setColor(Information.RGBtoColor(FillColor));
               } finally {
                  break label1057;
               }

               label1054:
               try {
                  my2DGraphics.fill(new Float(x1 + (float)1, y1 + (float)1, x2 - x1 - (float)1, y2 - y1 - (float)1));
               } finally {
                  break label1054;
               }

               label1049:
               try {
                  my2DGraphics.setColor(tmpColor);
               } finally {
                  break label1049;
               }
            }

            label1046:
            try {
               ;
            } finally {
               break label1046;
            }

            try {
               my2DGraphics.draw(new Float(x1, y1, x2 - x1, y2 - y1));
               break label1080;
            } finally {
               break label1080;
            }
         }

         label1041:
         try {
            ;
         } finally {
            break label1041;
         }

         label1039:
         try {
            my2DGraphics.draw(new java.awt.geom.Line2D.Float(x1, y1, x2, y2));
         } finally {
            break label1039;
         }
      }

      label1036:
      try {
         ;
      } finally {
         break label1036;
      }

      label1033:
      try {
         disposeGraphics(my2DGraphics);
      } finally {
         break label1033;
      }

      label1030:
      try {
         myCurrentX = (long)x2;
      } finally {
         break label1030;
      }

      try {
         myCurrentY = (long)y2;
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void PaintPicture(Image Picture, int X1, int Y1) {
      Throwable Err = null;

      try {
         PaintPicture(Picture, X1, Y1, VB.RasterOpConstants.vbSrcCopy);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void PaintPicture(Image Picture, int X1, int Y1, VB.RasterOpConstants Opcode) {
      Throwable Err = null;
      Graphics2D my2DGraphics = null;

      try {
         my2DGraphics = getGraphics();
         my2DGraphics.drawImage(Picture, X1, Y1, null);
         disposeGraphics(my2DGraphics);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void PaintPicture(Image Picture, int X1, int Y1, int Width, int Height, int X2, int Y2, int Width2, int Height2) {
      Throwable Err = null;
      Graphics2D my2DGraphics = null;

      try {
         my2DGraphics = getGraphics();
         my2DGraphics.drawImage(Picture, X2, Y2, Width2, Height2, X1, Y1, Width, Height, null);
         disposeGraphics(my2DGraphics);
      } catch (Throwable var14) {
         Interaction.MsgBox(var14);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Circle(float x, float y, float radius) {
      Throwable Err = null;

      try {
         Circle(x, y, radius, $ForeColor());
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
         Circle(x, y, radius, color, (float)0, (float)((double)2 * Math.PI));
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return;
      }
   }

   public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect, long FillColor) {
      Throwable Err = null;

      label336: {
         try {
            if (endAngle <= (float)0 | !((double)endAngle <= (double)2 * Math.PI)) {
               endAngle = (float)((double)2 * Math.PI);
            }
         } finally {
            break label336;
         }

         float halfStep1 = 0.0F;
         float halfStep2 = 0.0F;
         Graphics2D my2DGraphics = null;

         try {
            my2DGraphics = getGraphics();
         } finally {
            break label336;
         }

         Color tmpColor = null;

         try {
            tmpColor = my2DGraphics.getColor();
         } finally {
            break label336;
         }

         float angleLen = 0.0F;

         label319:
         try {
            if (endAngle <= startAngle) {
               angleLen = (float)((double)endAngle + (double)2 * Math.PI - (double)startAngle);
            } else {
               angleLen = endAngle - startAngle;
            }

            halfStep1 = (float)((double)startAngle / Math.PI * (double)180);
            halfStep2 = (float)((double)angleLen / Math.PI * (double)180);
            my2DGraphics.setColor(Information.RGBtoColor(FillColor));
            if (FillColor != (long)(-1 * 1)) {
               if (aspect <= (float)1) {
                  my2DGraphics.fill(
                     new java.awt.geom.Arc2D.Float(x - radius, y - radius * aspect, radius * (float)2, radius * (float)2 * aspect, halfStep1, halfStep2, 0)
                  );
               } else {
                  my2DGraphics.fill(
                     new java.awt.geom.Arc2D.Float(
                        (float)((double)x - (double)radius / (double)aspect),
                        y - radius,
                        (float)((double)(radius * (float)2) / (double)aspect),
                        radius * (float)2,
                        halfStep1,
                        halfStep2,
                        0
                     )
                  );
               }
            }

            if (color == (long)(-1 * 1)) {
               color = $ForeColor();
            }

            my2DGraphics.setColor(Information.RGBtoColor(color));
            if (aspect <= (float)1) {
               my2DGraphics.draw(
                  new java.awt.geom.Arc2D.Float(
                     x - radius, y - radius * aspect, radius * (float)2, radius * (float)2 * aspect, (float)Math.round(halfStep1), halfStep2, 0
                  )
               );
            } else {
               my2DGraphics.draw(
                  new java.awt.geom.Arc2D.Float(
                     (float)((double)x - (double)radius / (double)aspect),
                     y - radius,
                     (float)((double)(radius * (float)2) / (double)aspect),
                     radius * (float)2,
                     halfStep1,
                     halfStep2,
                     0
                  )
               );
            }

            my2DGraphics.setColor((Color)tmpColor);
            disposeGraphics(my2DGraphics);
            return;
         } finally {
            break label319;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int TextWidth(String text) {
      int TextWidth = 0;
      Throwable Err = null;

      try {
         TextWidth = $Parent().getFontMetrics($Parent().getFont()).stringWidth(text);
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
         TextHeight = $Parent().getFontMetrics($Parent().getFont()).getHeight();
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
         Print(text, (float)$CurrentX(), (float)$CurrentY());
         $CurrentX((long)0);
         $CurrentY($CurrentY() + (long)TextHeight(""));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Print(String text, float x1, float y1) {
      Throwable Err = null;
      int h10 = 0;
      int h11 = false;
      new VBArray();
      Graphics2D my2DGraphics = null;
      String myString = Strings.Replace(text, Strings.StrCat(Strings.Chr(13), Strings.Chr(10)), Strings.Chr(13));

      label817: {
         try {
            myString = Strings.Replace(myString, Strings.Chr(10), Strings.Chr(13));
         } finally {
            break label817;
         }

         new VBArray();

         VBArrayString NewLineSplits;
         try {
            NewLineSplits = Strings.Split(myString, Strings.Chr(13));
         } finally {
            break label817;
         }

         int i = 0;

         Throwable var113;
         label803: {
            label802: {
               label818: {
                  label830: {
                     try {
                        if (NewLineSplits.getUBound(1) <= 0) {
                           break label830;
                        }
                     } finally {
                        break label817;
                     }

                     i = 0;
                     h10 = NewLineSplits.getUBound(1) - 1;

                     for (int var110 = 1; i <= h10; i += var110) {
                        try {
                           Print(NewLineSplits.valueOfStr(i));
                        } finally {
                           break label817;
                        }
                     }

                     try {
                        Print(NewLineSplits.valueOfStr(NewLineSplits.getUBound(1)), (float)$CurrentX(), (float)$CurrentY());
                        break label802;
                     } catch (Throwable var99) {
                        var113 = var99;
                        boolean var10001 = false;
                        break label818;
                     }
                  }

                  label822: {
                     VBArrayString TabSplits;
                     try {
                        TabSplits = Strings.Split(myString, Strings.Chr(9));
                        myString = TabSplits.valueOfStr(0);
                        if (TabSplits.getUBound(1) <= 0) {
                           break label822;
                        }
                     } catch (Throwable var98) {
                        var113 = var98;
                        boolean var114 = false;
                        break label818;
                     }

                     i = 1;
                     h10 = TabSplits.getUBound(1);

                     for (int var111 = 1; i <= h10; i += var111) {
                        try {
                           myString = Strings.StrCat(Strings.StrCat(myString, Strings.Space(8 - Strings.Len(myString) % 8)), TabSplits.valueOfStr(i));
                        } finally {
                           break label817;
                        }
                     }
                  }

                  try {
                     my2DGraphics = getGraphics();
                     y1 += (float)$Parent().getFontMetrics($Parent().getFont()).getMaxAscent();
                     my2DGraphics.drawString(myString, x1 + (float)1, y1 + (float)1);
                     disposeGraphics(my2DGraphics);
                     break label802;
                  } catch (Throwable var97) {
                     var113 = var97;
                     boolean var115 = false;
                     break label803;
                  }
               }

               Err = var113;
               break label817;
            }

            label759:
            try {
               return;
            } catch (Throwable var94) {
               var113 = var94;
               boolean var116 = false;
               break label759;
            }
         }

         Err = var113;
      }

      Interaction.MsgBox(Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Cls() {
      Throwable Err = null;

      try {
         myCurrentX = (long)0;
         myCurrentY = (long)0;
         if (!DoubleBuffering) {
            $Parent().repaint();
         } else {
            myBufferedImage = null;
            $Parent().repaint();
         }
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $AutoRedraw() {
      boolean $AutoRedraw = false;
      Throwable Err = null;

      try {
         $AutoRedraw = DoubleBuffering;
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
         DoubleBuffering = v;
         if (!v) {
            myBufferedImage = null;
         }
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
         $AntiAliasing = myAntiAliasing;
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
         myAntiAliasing = v;
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
         $Transparency = myTransparency;
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
         if (v < 0) {
            v = 0;
         }

         if (v > 99) {
            v = 99;
         }

         myTransparency = v;
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
         $DrawWidth = (int)myDrawWidth;
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
         myDrawWidth = (float)v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BorderColor() {
      long $BorderColor = 0L;
      Throwable Err = null;

      try {
         $BorderColor = myBorderColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BorderColor;
      }

      return $BorderColor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BorderColor(long v) {
      Throwable Err = null;

      try {
         if (v == (long)(-1 * 1)) {
            myBorderColor = Information.ColorToRGB(new JLabel().getForeground());
         } else {
            myBorderColor = v;
         }
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
         $Picture = myImagePath;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Picture;
      }

      return $Picture;
   }

   public void $Picture(IResource param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 2
      // 02: aload 1
      // 03: invokeinterface VBA/IResource.toString ()Ljava/lang/String; 1
      // 08: invokestatic VBA/Strings.Len (Ljava/lang/String;)I
      // 0b: bipush 0
      // 0c: if_icmpgt 13
      // 0f: bipush 0
      // 10: goto 14
      // 13: bipush 1
      // 14: ifne 1a
      // 17: goto 43
      // 1a: nop
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokestatic VB/Global.LoadPicture (LVBA/IResource;)Ljava/awt/Image;
      // 20: putfield VB/PictureBox.myImage Ljava/awt/Image;
      // 23: aload 0
      // 24: getfield VB/PictureBox.myImage Ljava/awt/Image;
      // 27: aconst_null
      // 28: if_acmpne 2f
      // 2b: bipush 0
      // 2c: goto 30
      // 2f: bipush 1
      // 30: ifne 36
      // 33: goto 3f
      // 36: nop
      // 37: aload 0
      // 38: aload 1
      // 39: putfield VB/PictureBox.myImagePath LVBA/IResource;
      // 3c: goto 3f
      // 3f: nop
      // 40: goto 43
      // 43: nop
      // 44: nop
      // 45: nop
      // 46: return
      // 47: nop
      // 48: aload 2
      // 49: checkcast java/lang/Throwable
      // 4c: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // 4f: goto 45
      // 52: astore 3
      // 53: astore 2
      // 54: ret 3
      // 56: jsr 52
      // 59: goto 44
   }

   public void $Picture(Image param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 2
      // 02: new VB/VBImage
      // 05: dup
      // 06: aload 1
      // 07: invokespecial VB/VBImage.<init> (Ljava/awt/Image;)V
      // 0a: astore 4
      // 0c: aload 0
      // 0d: aload 4
      // 0f: checkcast VBA/IResource
      // 12: putfield VB/PictureBox.myImagePath LVBA/IResource;
      // 15: aload 0
      // 16: aload 4
      // 18: invokevirtual VB/VBImage.getImage ()Ljava/awt/image/BufferedImage;
      // 1b: checkcast java/awt/Image
      // 1e: putfield VB/PictureBox.myImage Ljava/awt/Image;
      // 21: nop
      // 22: nop
      // 23: return
      // 24: nop
      // 25: aload 2
      // 26: checkcast java/lang/Throwable
      // 29: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // 2c: goto 22
      // 2f: astore 3
      // 30: astore 2
      // 31: ret 3
      // 33: jsr 2f
      // 36: goto 21
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.fmBorderStyle $BorderStyle() {
      VB.fmBorderStyle $BorderStyle = new VB.fmBorderStyle();
      Throwable Err = null;

      try {
         $BorderStyle = myBorderStyle;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $BorderStyle;
      }

      return $BorderStyle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BorderStyle(VB.fmBorderStyle v) {
      Throwable Err = null;

      try {
         myBorderStyle = v;
         SetMyBorder();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.fmSpecialEffect $SpecialEffect() {
      VB.fmSpecialEffect $SpecialEffect = new VB.fmSpecialEffect();
      Throwable Err = null;

      try {
         $SpecialEffect = mySpecialEffect;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $SpecialEffect;
      }

      return $SpecialEffect;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $SpecialEffect(VB.fmSpecialEffect v) {
      Throwable Err = null;

      try {
         mySpecialEffect = v;
         SetMyBorder();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void SetMyBorder() {
      Throwable Err = null;

      try {
         super.setBorder(VB.Global.GetVBBorder($BorderStyle(), $SpecialEffect(), $BorderColor()));
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   @Override
   protected void paintComponent(Graphics g) {
      Throwable Err = null;
      Image tmpImage = null;
      Graphics dg = null;

      label652:
      try {
         super.paintComponent(g);
      } finally {
         break label652;
      }

      label649:
      try {
         if (myImage != null) {
            g.drawImage(myImage, 0, 0, this);
         }
      } finally {
         break label649;
      }

      label657: {
         label658: {
            label644:
            try {
               if (!DoubleBuffering) {
                  break label658;
               }
            } finally {
               break label644;
            }

            label637:
            try {
               tmpImage = GetBufferedImage();
            } finally {
               break label637;
            }

            label634:
            try {
               dg = tmpImage.getGraphics();
            } finally {
               break label634;
            }

            label631:
            try {
               _Paint(dg);
            } finally {
               break label631;
            }

            label628:
            try {
               g.drawImage(tmpImage, 0, 0, this);
            } finally {
               break label628;
            }

            try {
               dg.dispose();
               break label657;
            } finally {
               break label657;
            }
         }

         label623:
         try {
            ;
         } finally {
            break label623;
         }

         label621:
         try {
            _Paint(g);
         } finally {
            break label621;
         }
      }

      try {
         ;
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Image $Image() {
      Image $Image = null;
      Throwable Err = null;
      Image tmpImage = null;
      Graphics2D TmpGraphics2D = null;

      try {
         TmpGraphics2D = getGraphics();
         if (TmpGraphics2D != null) {
            tmpImage = TmpGraphics2D.getDeviceConfiguration().createCompatibleImage((int)$Width(), (int)$Height(), Transparency.TRANSLUCENT);
            TmpGraphics2D.dispose();
            Graphics2D var10 = (Graphics2D)tmpImage.getGraphics();
            if (myImage != null) {
               var10.drawImage(myImage, 0, 0, this);
            }

            var10.drawImage(GetBufferedImage(), 0, 0, this);
            $Image = tmpImage;
            var10.dispose();
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
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
         $ImageBuffer = Interaction.createBufferedImage($Image());
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
         $Point = Information.ColorToRGB(new Color($ImageBuffer().getRGB((int)x, (int)y)));
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return $Point;
      }

      return $Point;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $ScaleLeft() {
      float $ScaleLeft = 0.0F;
      Throwable Err = null;

      try {
         $ScaleLeft = (float)super.getRootPane().getLayeredPane().getLocation().x;
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
         $ScaleTop = (float)super.getRootPane().getLayeredPane().getLocation().y;
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
         $ScaleWidth = $Width();
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
         $ScaleHeight = $Height();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ScaleHeight;
      }

      return $ScaleHeight;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $FontName() {
      String $FontName = "";
      Throwable Err = null;

      try {
         $FontName = $Parent().getFont().getFamily();
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
         $Parent()
            .setFont(
               new Font(
                  val,
                  (int)(
                     Interaction.IIF($FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue()
                        | Interaction.IIF($FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()
                  ),
                  VB.Global.VBFontSizeToJFontSize($FontSize())
               )
            );
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
         $FontBold = $Parent().getFont().isBold();
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
         $Parent()
            .setFont(
               new Font(
                  $FontName(),
                  (int)(
                     Interaction.IIF(val, VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue()
                        | Interaction.IIF($FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()
                  ),
                  VB.Global.VBFontSizeToJFontSize($FontSize())
               )
            );
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
         $FontItalic = $Parent().getFont().isItalic();
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
         $Parent()
            .setFont(
               new Font(
                  $FontName(),
                  (int)(
                     Interaction.IIF($FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue()
                        | Interaction.IIF(val, VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()
                  ),
                  VB.Global.VBFontSizeToJFontSize($FontSize())
               )
            );
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
         $FontSize = VB.Global.JFontSizeToVBFontSize($Font().getSize());
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
         $Parent()
            .setFont(
               new Font(
                  $FontName(),
                  (int)(
                     Interaction.IIF($FontBold(), VBVariant.valueOf(Font.BOLD), VBVariant.valueOf(0)).longValue()
                        | Interaction.IIF($FontItalic(), VBVariant.valueOf(Font.ITALIC), VBVariant.valueOf(0)).longValue()
                  ),
                  VB.Global.VBFontSizeToJFontSize(val)
               )
            );
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Font $Font() {
      Font $Font = null;
      Throwable Err = null;

      try {
         $Font = $Parent().getFont();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Font;
      }

      return $Font;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BackColor() {
      long $BackColor = 0L;
      Throwable Err = null;

      try {
         $BackColor = Information.ColorToRGB(super.getBackground());
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
         if (v != (long)(-1 * 1)) {
            super.setBackground(Information.RGBtoColor(v));
         }
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
         $ForeColor = myForeColor;
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
         if (v != (long)(-1 * 1)) {
            myForeColor = v;
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Color getForeground() {
      Color getForeground = null;
      Throwable Err = null;

      try {
         getForeground = Information.RGBtoColor(myForeColor);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return getForeground;
      }

      return getForeground;
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
         if (!isLeftInitialized) {
            mySavedLeft = v;
            isLeftInitialized = true;
         }

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
         if (!isTopInitialized) {
            mySavedTop = v;
            isTopInitialized = true;
         }

         setLocation(getLocation().x, (int)v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.AnchorStyles $Anchor() {
      VB.AnchorStyles $Anchor = new VB.AnchorStyles();
      Throwable Err = null;

      try {
         $Anchor = myAnchor;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Anchor;
      }

      return $Anchor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Anchor(VB.AnchorStyles val) {
      Throwable Err = null;

      try {
         myAnchor = val;
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
   public String $ToolTip() {
      String $ToolTip = "";
      Throwable Err = null;

      try {
         $ToolTip = $Parent().getToolTipText();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ToolTip;
      }

      return $ToolTip;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $ToolTip(String v) {
      Throwable Err = null;

      try {
         if (Strings.Len(v) != 0) {
            $Parent().setToolTipText(v);
         } else {
            $Parent().setToolTipText(null);
         }
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
         $Enabled = super.isEnabled();
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
         super.setEnabled(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean $Visible() {
      boolean $Visible = false;
      Throwable Err = null;

      try {
         $Visible = super.isVisible();
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
         super.setVisible(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
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
         $Parent().revalidate();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void ResizeTriggerInit(float w, float h) {
      Throwable Err = null;

      try {
         hostSavedWidth = w;
         hostSavedHeight = h;
         mySavedWidth = $Width();
         mySavedHeight = $Height();
         isResizeTriggerInitialized = true;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void ResizeTrigger(float w, float h) {
      Throwable Err = null;
      int h6 = 0;

      label369: {
         Throwable var10000;
         label368: {
            label374: {
               try {
                  if (!(isResizeTriggerInitialized & isLeftInitialized & isTopInitialized)) {
                     break label374;
                  }
               } finally {
                  break label369;
               }

               h6 = (boolean)0;

               try {
                  h6 = myAnchor.intValue() & 12;
                  if (h6 != VB.AnchorStyles.vbLeft.intValue()) {
                     if (h6 != VB.AnchorStyles.vbRight.intValue()) {
                        if (h6 != VB.AnchorStyles.vbLeftRight.intValue()) {
                           if (h6 == VB.AnchorStyles.vbNone.intValue()) {
                              $Left((float)((double)(w - mySavedWidth) / (double)(hostSavedWidth - mySavedWidth) * (double)mySavedLeft));
                           }
                        } else {
                           $Width(w - hostSavedWidth + mySavedWidth);
                        }
                     } else {
                        $Left(w - hostSavedWidth + mySavedLeft);
                     }
                  }
               } finally {
                  break label369;
               }

               int var28 = 0;

               try {
                  var28 = myAnchor.intValue() & 3;
                  if (var28 != VB.AnchorStyles.vbTop.intValue()) {
                     if (var28 != VB.AnchorStyles.vbBottom.intValue()) {
                        if (var28 != VB.AnchorStyles.vbTopBottom.intValue()) {
                           if (var28 == VB.AnchorStyles.vbNone.intValue()) {
                              $Top((float)((double)(h - mySavedHeight) / (double)(hostSavedHeight - mySavedHeight) * (double)mySavedTop));
                           }
                        } else {
                           $Height(h - hostSavedHeight + mySavedHeight);
                        }
                     } else {
                        $Top(h - hostSavedHeight + mySavedTop);
                     }
                  }
               } catch (Throwable var24) {
                  var10000 = var24;
                  boolean var10001 = false;
                  break label368;
               }
            }

            label354:
            try {
               return;
            } catch (Throwable var22) {
               var10000 = var22;
               boolean var30 = false;
               break label354;
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
   }

   private void initVars() {
      DoubleBuffering = false;
      RadioButtonGroup = new ButtonGroup();
      myImage = null;
      myImagePath = null;
      myBufferedImage = null;
      myDrawWidth = 0.0F;
      myTransparency = 0;
      myAntiAliasing = false;
      myBorderStyle = new VB.fmBorderStyle();
      mySpecialEffect = new VB.fmSpecialEffect();
      myBorderColor = 0L;
      myCurrentX = 0L;
      myCurrentY = 0L;
      myTag = "";
      myMouseIcon = null;
      myForeColor = 0L;
      myAnchor = VB.AnchorStyles.vbTopLeft;
      mySavedWidth = 0.0F;
      mySavedHeight = 0.0F;
      mySavedLeft = 0.0F;
      mySavedTop = 0.0F;
      hostSavedWidth = 0.0F;
      hostSavedHeight = 0.0F;
      isResizeTriggerInitialized = false;
      isLeftInitialized = false;
      isTopInitialized = false;
      smv = 0.0F;
      smv = 0.0F;
      h3 = 0.0F;
      h3 = 0.0F;
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
