package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import VBA.VBArray;
import VBA.VBArrayVariant;
import VBA.VBVariant;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class Usercontrol extends VB.PictureBox implements VB.ILoadAdapter, VB.IJabacoContainer, ComponentListener {
   private boolean bLoaded;
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
   private boolean countTop;
   private boolean countLeft;
   private ButtonGroup RadioButtonGroup;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Usercontrol() {
      Throwable Err = null;
      super();
      initVarsI();

      try {
         $Parent().addComponentListener(this);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   @Override
   public void componentHidden(ComponentEvent e) {
      Throwable Err = null;
   }

   @Override
   public void componentMoved(ComponentEvent e) {
      Throwable Err = null;
   }

   @Override
   public void componentResized(ComponentEvent e) {
      Throwable Err = null;

      label125:
      try {
         AnchorResize();
      } finally {
         break label125;
      }

      label122: {
         label121:
         try {
            if (!bLoaded) {
               break label122;
            }
         } finally {
            break label121;
         }

         label116:
         try {
            Usercontrol_Resize();
         } finally {
            break label116;
         }
      }

      try {
         ;
      } finally {
         return;
      }
   }

   @Override
   public void componentShown(ComponentEvent e) {
      Throwable Err = null;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
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
   @Override
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
         Usercontrol_Initialize();
         bLoaded = true;
         Usercontrol_Resize();
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
         if (countLeft) {
            if (!isLeftInitialized) {
               mySavedLeft = v;
               isLeftInitialized = true;
            }
         } else {
            countLeft = true;
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
         if (countTop) {
            if (!isTopInitialized) {
               mySavedTop = v;
               isTopInitialized = true;
            }
         } else {
            countTop = true;
         }

         setLocation(getLocation().x, (int)v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
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
   @Override
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
   @Override
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

   public void Usercontrol_Initialize() {
      Throwable Err = null;
   }

   public void Usercontrol_Click() {
      Throwable Err = null;
   }

   public void Usercontrol_DblClick() {
      Throwable Err = null;
   }

   public void Usercontrol_GotFocus() {
      Throwable Err = null;
   }

   public void Usercontrol_KeyDown(int KeyCode, int Shift) {
      Throwable Err = null;
   }

   public void Usercontrol_KeyPress(int KeyAscii) {
      Throwable Err = null;
   }

   public void Usercontrol_KeyUp(int KeyCode, int Shift) {
      Throwable Err = null;
   }

   public void Usercontrol_LostFocus() {
      Throwable Err = null;
   }

   public void Usercontrol_MouseDown(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Usercontrol_MouseMove(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Usercontrol_MouseUp(int Button, int Shift, float X, float Y) {
      Throwable Err = null;
   }

   public void Usercontrol_MouseEntered() {
      Throwable Err = null;
   }

   public void Usercontrol_MouseExited() {
      Throwable Err = null;
   }

   public void Usercontrol_Paint(Graphics g) {
      Throwable Err = null;
   }

   public void Usercontrol_Resize() {
      Throwable Err = null;
   }

   public void Usercontrol_MenuClick(VB.IMenuItem MenuItem) {
      Throwable Err = null;
   }

   public void Usercontrol_ToolBarClick(VB.IToolBarItem ToolBarItem) {
      Throwable Err = null;
   }

   public void Usercontrol_Unload(int Cancel) {
      Throwable Err = null;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _Click() {
      Throwable Err = null;

      try {
         Usercontrol_Click();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _DblClick() {
      Throwable Err = null;

      try {
         Usercontrol_DblClick();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _GotFocus() {
      Throwable Err = null;

      try {
         Usercontrol_GotFocus();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _KeyDown(int KeyCode, int Shift) {
      Throwable Err = null;

      try {
         Usercontrol_KeyDown(KeyCode, Shift);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _KeyPress(int KeyAscii) {
      Throwable Err = null;

      try {
         Usercontrol_KeyPress(KeyAscii);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _KeyUp(int KeyCode, int Shift) {
      Throwable Err = null;

      try {
         Usercontrol_KeyUp(KeyCode, Shift);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _LostFocus() {
      Throwable Err = null;

      try {
         Usercontrol_LostFocus();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _MouseDown(int Button, int Shift, float X, float Y) {
      Throwable Err = null;

      try {
         Usercontrol_MouseDown(Button, Shift, X, Y);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _MouseMove(int Button, int Shift, float X, float Y) {
      Throwable Err = null;

      try {
         Usercontrol_MouseMove(Button, Shift, X, Y);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _MouseUp(int Button, int Shift, float X, float Y) {
      Throwable Err = null;

      try {
         Usercontrol_MouseUp(Button, Shift, X, Y);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _MouseEntered() {
      Throwable Err = null;

      try {
         Usercontrol_MouseEntered();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _MouseExited() {
      Throwable Err = null;

      try {
         Usercontrol_MouseExited();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void _Paint(Graphics g) {
      Throwable Err = null;

      try {
         Usercontrol_Paint(g);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void _Unload(int Cancel) {
      Throwable Err = null;

      try {
         Usercontrol_Unload(Cancel);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
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
         $ContentFrame = this;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $ContentFrame;
      }

      return $ContentFrame;
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

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void add(Component Component) {
      Throwable Err = null;
      VB.IJabacoControl Component2 = null;

      label983: {
         label957: {
            Throwable var10000;
            label956: {
               label964: {
                  try {
                     if (!(Component instanceof VB.IJabacoControl)) {
                        break label964;
                     }
                  } finally {
                     break label957;
                  }

                  Component2 = (VB.IJabacoControl)Component;

                  try {
                     Component2.ResizeTriggerInit($Width(), $Height());
                  } catch (Throwable var161) {
                     var10000 = var161;
                     boolean var10001 = false;
                     break label956;
                  }
               }

               label945:
               try {
                  $Parent().add(Component);
                  SetZOrder(Component);
                  break label983;
               } catch (Throwable var160) {
                  var10000 = var160;
                  boolean var164 = false;
                  break label945;
               }
            }

            Err = var10000;
         }

         Interaction.MsgBox(Err);
         return;
      }

      JCheckBox ComponentCB = null;

      label939:
      try {
         ComponentCB = (JCheckBox)Component;
      } finally {
         break label939;
      }

      label935: {
         try {
            if (ComponentCB == null) {
               break label935;
            }
         } catch (Throwable var158) {
            boolean var165 = false;
            return;
         }

         try {
            return;
         } catch (Throwable var157) {
            boolean var166 = false;
            return;
         }
      }

      label925:
      try {
         ;
      } finally {
         break label925;
      }

      AbstractButton ComponentAB = null;

      label921:
      try {
         ComponentAB = (AbstractButton)Component;
      } finally {
         break label921;
      }

      label971: {
         label916: {
            try {
               if (ComponentAB == null) {
                  break label971;
               }
            } catch (Throwable var154) {
               boolean var167 = false;
               break label916;
            }

            label913:
            try {
               ;
            } catch (Throwable var153) {
               boolean var168 = false;
               break label913;
            }
         }

         label908:
         try {
            RadioButtonGroup.add(ComponentAB);
         } finally {
            break label908;
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

   private void AnchorResize() {
      Throwable Err = null;
      int h6 = 0;
      int h7 = 0;
      VB.IJabacoControl myCont = null;
      new VBArray();
      int i = 0;

      label122: {
         VBArray comp;
         try {
            comp = VBArray.createVBArray(getComponents());
         } finally {
            break label122;
         }

         i = 0;
         h6 = comp.getUBound(1);
         h7 = 1;

         while (true) {
            if (i > h6) {
               return;
            }

            try {
               if ((Component)comp.valueOfObj(i) instanceof VB.IJabacoControl) {
                  myCont = (VB.IJabacoControl)((Component)comp.valueOfObj(i));
                  myCont.ResizeTrigger((float)$Parent().getWidth(), (float)$Parent().getHeight());
               }
            } finally {
               break;
            }

            i += h7;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   private void initVarsI() {
      bLoaded = false;
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
      countTop = false;
      countLeft = false;
      RadioButtonGroup = new ButtonGroup();
   }
}
