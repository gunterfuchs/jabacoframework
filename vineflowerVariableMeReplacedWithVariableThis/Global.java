package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Cursors;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.JabacoEventQueue;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayVariant;
import VBA.VBVariant;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Hashtable;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class Global {
   private static VB.Debug myDebug = null;
   private static VB.Console myConsole = null;
   private static VB.VBClipboard myClipboard = null;
   private static VB.Screen myScreen = null;
   private static VB.SysInfo mySysInfo = null;
   private static VB.JBCLookAndFeel myLookAndFeelManager = null;
   private static VB.App myApp = null;
   private static VB.MDIForm myGlobalMDIForm = null;
   private static Hashtable myForms = null;
   private static boolean bEmptyEnd = false;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VBVariant setGlobalMDIForm(VB.MDIForm refMDI) {
      VBVariant setGlobalMDIForm = new VBVariant();
      Throwable Err = null;

      try {
         myGlobalMDIForm = refMDI;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return setGlobalMDIForm;
      }

      return setGlobalMDIForm;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.MDIForm $GlobalMDIForm() {
      VB.MDIForm $GlobalMDIForm = null;
      Throwable Err = null;

      try {
         $GlobalMDIForm = myGlobalMDIForm;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return $GlobalMDIForm;
      }

      return $GlobalMDIForm;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.App App() {
      VB.App App = null;
      Throwable Err = null;

      try {
         if (myApp == null) {
            myApp = new VB.App();
         }

         App = myApp;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return App;
      }

      return App;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.VBClipboard Clipboard() {
      VB.VBClipboard Clipboard = null;
      Throwable Err = null;

      try {
         if (myClipboard == null) {
            myClipboard = new VB.VBClipboard();
         }

         Clipboard = myClipboard;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return Clipboard;
      }

      return Clipboard;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Hashtable Forms() {
      Hashtable Forms = null;
      Throwable Err = null;

      try {
         if (myForms == null) {
            myForms = new Hashtable();
         }

         Forms = myForms;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return Forms;
      }

      return Forms;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.Screen Screen() {
      VB.Screen Screen = null;
      Throwable Err = null;

      try {
         if (myScreen == null) {
            myScreen = new VB.Screen();
         }

         Screen = myScreen;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return Screen;
      }

      return Screen;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.Debug Debug() {
      VB.Debug Debug = null;
      Throwable Err = null;

      try {
         if (myDebug == null) {
            myDebug = new VB.Debug();
         }

         Debug = myDebug;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return Debug;
      }

      return Debug;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.Console Console() {
      VB.Console Console = null;
      Throwable Err = null;

      try {
         if (myConsole == null) {
            myConsole = new VB.Console();
         }

         Console = myConsole;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return Console;
      }

      return Console;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.SysInfo SysInfo() {
      VB.SysInfo SysInfo = null;
      Throwable Err = null;

      try {
         if (mySysInfo == null) {
            mySysInfo = new VB.SysInfo();
         }

         SysInfo = mySysInfo;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return SysInfo;
      }

      return SysInfo;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.JBCLookAndFeel LookAndFeelManager() {
      VB.JBCLookAndFeel LookAndFeelManager = null;
      Throwable Err = null;

      try {
         if (myLookAndFeelManager == null) {
            myLookAndFeelManager = new VB.JBCLookAndFeel();
         }

         LookAndFeelManager = myLookAndFeelManager;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return LookAndFeelManager;
      }

      return LookAndFeelManager;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Object Load(Object obj) {
      Object Load = null;
      Throwable Err = null;
      Object o = null;

      try {
         o = Forms().put(new Integer(obj.hashCode()), obj);
         Load = obj;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return Load;
      }

      return Load;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Unload(VB.Form Form) {
      Throwable Err = null;

      try {
         RemoveForm(Form);
         Form.$Visible(false);
         Form.dispose();
         VB.Form var5 = null;
         EmptyEnd();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Unload(VB.MDIForm Form) {
      Throwable Err = null;

      try {
         RemoveForm(Form);
         Form.$Visible(false);
         Form.dispose();
         VB.MDIForm var5 = null;
         EmptyEnd();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Unload(VB.MDIChild Form) {
      Throwable Err = null;

      try {
         RemoveForm(Form);
         Form.$Visible(false);
         Form.dispose();
         VB.MDIChild var5 = null;
         EmptyEnd();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Unload(VB.Dialog Form) {
      Throwable Err = null;

      try {
         RemoveForm(Form);
         Form.$Visible(false);
         Form.dispose();
         VB.Dialog var5 = null;
         EmptyEnd();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void RemoveForm(Object obj) {
      Throwable Err = null;

      try {
         if (!Forms().containsKey(new Integer(obj.hashCode()))) {
            bEmptyEnd = false;
         } else {
            Forms().remove(new Integer(obj.hashCode()));
         }
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void EmptyEnd() {
      Throwable Err = null;

      try {
         if (bEmptyEnd & Forms().isEmpty()) {
            System.exit(0);
         }
      } catch (Throwable var3) {
         Interaction.MsgBox(var3);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static ImageIcon CreateIcon(int Width, int Height) {
      ImageIcon CreateIcon = null;
      Throwable Err = null;
      GraphicsConfiguration tmpConfig = null;
      BufferedImage tmpImageVirtual = null;
      Graphics tmpGFX = null;

      try {
         tmpConfig = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
         tmpImageVirtual = tmpConfig.createCompatibleImage(Width, Height, Transparency.BITMASK);
         CreateIcon = new ImageIcon((Image)tmpImageVirtual);
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return CreateIcon;
      }

      return CreateIcon;
   }

   public static ImageIcon LoadIcon(IResource Resource) {
      ImageIcon LoadIcon = null;
      Throwable Err = null;
      Image tmpImage = LoadPicture(Resource);

      label67:
      try {
         if (tmpImage == null) {
            return LoadIcon;
         }
      } finally {
         break label67;
      }

      try {
         LoadIcon = new ImageIcon(tmpImage);
      } finally {
         return LoadIcon;
      }

      return LoadIcon;
   }

   public static ByteArrayOutputStream LoadResource(IResource Resource) {
      ByteArrayOutputStream LoadResource = null;
      Throwable Err = null;

      label67:
      try {
         if (Resource == null) {
            return LoadResource;
         }
      } finally {
         break label67;
      }

      try {
         LoadResource = Interaction.getResourceAsByteArray(Resource.getClass(), Resource.toString());
      } finally {
         return LoadResource;
      }

      return LoadResource;
   }

   public static InputStream LoadResData(IResource Resource) {
      InputStream LoadResData = null;
      Throwable Err = null;

      label67:
      try {
         if (Resource == null) {
            return LoadResData;
         }
      } finally {
         break label67;
      }

      try {
         LoadResData = Resource.getClass().getResourceAsStream(Resource.toString());
      } finally {
         return LoadResData;
      }

      return LoadResData;
   }

   public static InputStream LoadResData(String ResID) {
      InputStream LoadResData = null;
      Throwable Err = null;

      label67:
      try {
         if (ResID == null) {
            return LoadResData;
         }
      } finally {
         break label67;
      }

      try {
         LoadResData = ResID.getClass().getResourceAsStream(ResID.toString());
      } finally {
         return LoadResData;
      }

      return LoadResData;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Image LoadPicture(String Resource) {
      Image LoadPicture = null;
      Throwable Err = null;

      try {
         LoadPicture = new VB.VBImage(Resource).getImage();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return LoadPicture;
      }

      return LoadPicture;
   }

   public static Image LoadPicture(IResource Resource) {
      Image LoadPicture = null;
      Throwable Err = null;

      label293:
      try {
         if (Resource == null) {
            return LoadPicture;
         }
      } finally {
         break label293;
      }

      label286: {
         label300: {
            try {
               if (Resource instanceof VB.VBImage) {
                  break label300;
               }
            } finally {
               break label300;
            }

            label277:
            try {
               ;
            } finally {
               break label277;
            }

            try {
               LoadPicture = Interaction.getResourceAsImage(Resource.getClass(), Resource.toString());
               break label286;
            } finally {
               break label286;
            }
         }

         label275:
         try {
            LoadPicture = ((VB.VBImage)Resource).getImage();
         } finally {
            break label275;
         }
      }

      try {
         ;
      } finally {
         return LoadPicture;
      }

      return LoadPicture;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int KeyEventToKeyCode(KeyEvent e) {
      int KeyEventToKeyCode = 0;
      Throwable Err = null;

      try {
         if (e.getKeyCode() != KeyEvent.VK_ENTER) {
            KeyEventToKeyCode = e.getKeyCode();
         } else {
            KeyEventToKeyCode = 13;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return KeyEventToKeyCode;
      }

      return KeyEventToKeyCode;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int KeyEventToShiftConstant(KeyEvent e) {
      int KeyEventToShiftConstant = 0;
      Throwable Err = null;
      int ret = 0;

      try {
         ret = 0;
         if (e.isShiftDown()) {
            ret = Double.valueOf(Strings.StrCat(String.valueOf(ret), VB.ShiftConstants.vbShiftMask.toString())).intValue();
         }

         if (e.isControlDown()) {
            ret = Double.valueOf(Strings.StrCat(String.valueOf(ret), VB.ShiftConstants.vbCtrlMask.toString())).intValue();
         }

         if (e.isAltDown()) {
            ret = Double.valueOf(Strings.StrCat(String.valueOf(ret), VB.ShiftConstants.vbAltMask.toString())).intValue();
         }

         KeyEventToShiftConstant = ret;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return KeyEventToShiftConstant;
      }

      return KeyEventToShiftConstant;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Border GetVBBorder(VB.fmBorderStyle style, VB.fmSpecialEffect effect, long bordercolor) {
      Border GetVBBorder = null;
      Throwable Err = null;
      new VB.fmBorderStyle();
      new VB.fmSpecialEffect();

      label342: {
         try {
            if (style == null) {
               return GetVBBorder;
            }
         } finally {
            break label342;
         }

         VB.fmBorderStyle h8 = null;

         Throwable var10000;
         label327: {
            label344: {
               try {
                  if (style.compareTo(VB.fmBorderStyle.fmBorderStyleNone) == 0) {
                     GetVBBorder = BorderFactory.createEmptyBorder();
                     break label344;
                  }

                  if (style.compareTo(VB.fmBorderStyle.fmBorderStyleSingle) != 0) {
                     break label344;
                  }
               } finally {
                  break label342;
               }

               VB.fmSpecialEffect h9 = null;

               try {
                  if (effect.compareTo(VB.fmSpecialEffect.fmSpecialEffectFlat) != 0) {
                     if (effect.compareTo(VB.fmSpecialEffect.fmSpecialEffectRaised) != 0) {
                        if (effect.compareTo(VB.fmSpecialEffect.fmSpecialEffectSunken) != 0) {
                           if (effect.compareTo(VB.fmSpecialEffect.fmSpecialEffectEtched) == 0) {
                              GetVBBorder = BorderFactory.createEtchedBorder();
                           }
                        } else {
                           GetVBBorder = BorderFactory.createLoweredBevelBorder();
                        }
                     } else {
                        GetVBBorder = BorderFactory.createRaisedBevelBorder();
                     }
                  } else {
                     GetVBBorder = BorderFactory.createLineBorder(Information.RGBtoColor(bordercolor));
                  }
               } catch (Throwable var26) {
                  var10000 = var26;
                  boolean var10001 = false;
                  break label327;
               }
            }

            label312:
            try {
               return GetVBBorder;
            } catch (Throwable var25) {
               var10000 = var25;
               boolean var29 = false;
               break label312;
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
      return GetVBBorder;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int VBScrollBarToJScrollBarPolicy(VB.vbScrollBarPolicy v, boolean bHorizontal) {
      int VBScrollBarToJScrollBarPolicy = 0;
      Throwable Err = null;
      new VB.vbScrollBarPolicy();

      label383: {
         Throwable var37;
         label382: {
            label381: {
               label388: {
                  label389: {
                     try {
                        if (!bHorizontal) {
                           break label389;
                        }
                     } finally {
                        break label383;
                     }

                     VB.vbScrollBarPolicy h6 = null;

                     try {
                        if (v.compareTo(VB.vbScrollBarPolicy.sbShowAsNeeded) != 0) {
                           if (v.compareTo(VB.vbScrollBarPolicy.sbShowNever) != 0) {
                              if (v.compareTo(VB.vbScrollBarPolicy.sbShowAlways) == 0) {
                                 VBScrollBarToJScrollBarPolicy = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
                              }
                           } else {
                              VBScrollBarToJScrollBarPolicy = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
                           }
                        } else {
                           VBScrollBarToJScrollBarPolicy = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
                        }
                        break label381;
                     } catch (Throwable var34) {
                        var37 = var34;
                        boolean var10001 = false;
                        break label388;
                     }
                  }

                  try {
                     ;
                  } catch (Throwable var33) {
                     var37 = var33;
                     boolean var38 = false;
                     break label388;
                  }

                  VB.vbScrollBarPolicy var36 = null;

                  try {
                     if (v.compareTo(VB.vbScrollBarPolicy.sbShowAsNeeded) != 0) {
                        if (v.compareTo(VB.vbScrollBarPolicy.sbShowNever) != 0) {
                           if (v.compareTo(VB.vbScrollBarPolicy.sbShowAlways) == 0) {
                              VBScrollBarToJScrollBarPolicy = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
                           }
                        } else {
                           VBScrollBarToJScrollBarPolicy = ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER;
                        }
                     } else {
                        VBScrollBarToJScrollBarPolicy = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
                     }
                     break label381;
                  } catch (Throwable var32) {
                     var37 = var32;
                     boolean var39 = false;
                     break label382;
                  }
               }

               Err = var37;
               break label383;
            }

            label362:
            try {
               return VBScrollBarToJScrollBarPolicy;
            } catch (Throwable var31) {
               var37 = var31;
               boolean var40 = false;
               break label362;
            }
         }

         Err = var37;
      }

      Interaction.MsgBox(Err);
      return VBScrollBarToJScrollBarPolicy;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.vbScrollBarPolicy JScrollBarToVBScrollBarPolicy(int v) {
      VB.vbScrollBarPolicy JScrollBarToVBScrollBarPolicy = new VB.vbScrollBarPolicy();
      Throwable Err = null;
      int h5 = false;
      h5 = false;

      try {
         if (v != ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED) {
            if (v != ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER) {
               if (v != ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS) {
                  if (v != ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED) {
                     if (v != ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER) {
                        if (v == ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS) {
                           JScrollBarToVBScrollBarPolicy = VB.vbScrollBarPolicy.sbShowAlways;
                        }
                     } else {
                        JScrollBarToVBScrollBarPolicy = VB.vbScrollBarPolicy.sbShowNever;
                     }
                  } else {
                     JScrollBarToVBScrollBarPolicy = VB.vbScrollBarPolicy.sbShowAsNeeded;
                  }
               } else {
                  JScrollBarToVBScrollBarPolicy = VB.vbScrollBarPolicy.sbShowAlways;
               }
            } else {
               JScrollBarToVBScrollBarPolicy = VB.vbScrollBarPolicy.sbShowNever;
            }
         } else {
            JScrollBarToVBScrollBarPolicy = VB.vbScrollBarPolicy.sbShowAsNeeded;
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return JScrollBarToVBScrollBarPolicy;
      }

      return JScrollBarToVBScrollBarPolicy;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.MousePointerConstants JCursorToVBMousePointer(Cursor v) {
      VB.MousePointerConstants JCursorToVBMousePointer = new VB.MousePointerConstants();
      Throwable Err = null;
      Cursor h5 = null;
      h5 = null;

      try {
         if (v != new Cursor(java.awt.Frame.DEFAULT_CURSOR)) {
            if (v != new Cursor(java.awt.Frame.CROSSHAIR_CURSOR)) {
               if (v != new Cursor(java.awt.Frame.TEXT_CURSOR)) {
                  if (v != new Cursor(Cursor.CUSTOM_CURSOR)) {
                     if (v != new Cursor(java.awt.Frame.MOVE_CURSOR)) {
                        if (v == new Cursor(java.awt.Frame.SW_RESIZE_CURSOR) || v == new Cursor(java.awt.Frame.NE_RESIZE_CURSOR)) {
                           JCursorToVBMousePointer = VB.MousePointerConstants.vbSizeNESW;
                        } else if (v == new Cursor(java.awt.Frame.N_RESIZE_CURSOR) || v == new Cursor(java.awt.Frame.S_RESIZE_CURSOR)) {
                           JCursorToVBMousePointer = VB.MousePointerConstants.vbSizeNS;
                        } else if (v == new Cursor(java.awt.Frame.SE_RESIZE_CURSOR) || v == new Cursor(java.awt.Frame.NW_RESIZE_CURSOR)) {
                           JCursorToVBMousePointer = VB.MousePointerConstants.vbSizeNWSE;
                        } else if (v == new Cursor(java.awt.Frame.E_RESIZE_CURSOR) || v == new Cursor(java.awt.Frame.W_RESIZE_CURSOR)) {
                           JCursorToVBMousePointer = VB.MousePointerConstants.vbSizeWE;
                        } else if (v != new Cursor(java.awt.Frame.WAIT_CURSOR)) {
                           if (v != new Cursor(java.awt.Frame.MOVE_CURSOR)) {
                              if (v != new Cursor(java.awt.Frame.HAND_CURSOR)) {
                                 JCursorToVBMousePointer = VB.MousePointerConstants.vbDefault;
                              } else {
                                 JCursorToVBMousePointer = VB.MousePointerConstants.vbHandCursor;
                              }
                           } else {
                              JCursorToVBMousePointer = VB.MousePointerConstants.vbSizeAll;
                           }
                        } else {
                           JCursorToVBMousePointer = VB.MousePointerConstants.vbHourglass;
                        }
                     } else {
                        JCursorToVBMousePointer = VB.MousePointerConstants.vbSizePointer;
                     }
                  } else {
                     JCursorToVBMousePointer = VB.MousePointerConstants.vbIconPointer;
                  }
               } else {
                  JCursorToVBMousePointer = VB.MousePointerConstants.vbIbeam;
               }
            } else {
               JCursorToVBMousePointer = VB.MousePointerConstants.vbCrosshair;
            }
         } else {
            JCursorToVBMousePointer = VB.MousePointerConstants.vbDefault;
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return JCursorToVBMousePointer;
      }

      return JCursorToVBMousePointer;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Cursor VBMousePointerToJCursor(VB.MousePointerConstants v) {
      Cursor VBMousePointerToJCursor = null;
      Throwable Err = null;
      new VB.MousePointerConstants();
      VB.MousePointerConstants h5 = null;

      label8877:
      try {
         h5 = v;
      } finally {
         break label8877;
      }

      label8906: {
         label8907: {
            label8870: {
               label8881: {
                  label8908: {
                     label8865: {
                        label8882: {
                           label8909: {
                              label8860: {
                                 label8883: {
                                    label8910: {
                                       label8855: {
                                          label8884: {
                                             label8911: {
                                                label8850: {
                                                   label8885: {
                                                      label8912: {
                                                         label8845: {
                                                            label8886: {
                                                               label8913: {
                                                                  label8840: {
                                                                     label8887: {
                                                                        label8914: {
                                                                           label8835: {
                                                                              label8888: {
                                                                                 label8915: {
                                                                                    try {
                                                                                       if (h5.compareTo(VB.MousePointerConstants.vbDefault) != 0) {
                                                                                          break label8915;
                                                                                       }
                                                                                    } catch (Throwable var1486) {
                                                                                       boolean var10001 = false;
                                                                                       break label8888;
                                                                                    }

                                                                                    try {
                                                                                       VBMousePointerToJCursor = new Cursor(java.awt.Frame.DEFAULT_CURSOR);
                                                                                       break label8906;
                                                                                    } catch (Throwable var1469) {
                                                                                       boolean var1488 = false;
                                                                                       break label8888;
                                                                                    }
                                                                                 }

                                                                                 try {
                                                                                    if (h5.compareTo(VB.MousePointerConstants.vbArrow) == 0) {
                                                                                       break label8888;
                                                                                    }
                                                                                 } catch (Throwable var1485) {
                                                                                    boolean var1489 = false;
                                                                                    break label8835;
                                                                                 }

                                                                                 try {
                                                                                    if (h5.compareTo(VB.MousePointerConstants.vbCrosshair) != 0) {
                                                                                       break label8914;
                                                                                    }
                                                                                    break label8835;
                                                                                 } catch (Throwable var1484) {
                                                                                    boolean var1490 = false;
                                                                                    break label8887;
                                                                                 }
                                                                              }

                                                                              label8728:
                                                                              try {
                                                                                 VBMousePointerToJCursor = new Cursor(java.awt.Frame.DEFAULT_CURSOR);
                                                                                 break label8906;
                                                                              } catch (Throwable var1468) {
                                                                                 boolean var1505 = false;
                                                                                 break label8728;
                                                                              }
                                                                           }

                                                                           try {
                                                                              VBMousePointerToJCursor = new Cursor(java.awt.Frame.CROSSHAIR_CURSOR);
                                                                              break label8906;
                                                                           } catch (Throwable var1467) {
                                                                              boolean var1506 = false;
                                                                              break label8887;
                                                                           }
                                                                        }

                                                                        try {
                                                                           if (h5.compareTo(VB.MousePointerConstants.vbIbeam) == 0) {
                                                                              break label8887;
                                                                           }
                                                                        } catch (Throwable var1483) {
                                                                           boolean var1491 = false;
                                                                           break label8840;
                                                                        }

                                                                        try {
                                                                           if (h5.compareTo(VB.MousePointerConstants.vbIconPointer) != 0) {
                                                                              break label8913;
                                                                           }
                                                                           break label8840;
                                                                        } catch (Throwable var1482) {
                                                                           boolean var1492 = false;
                                                                           break label8886;
                                                                        }
                                                                     }

                                                                     label8724:
                                                                     try {
                                                                        VBMousePointerToJCursor = new Cursor(java.awt.Frame.TEXT_CURSOR);
                                                                        break label8906;
                                                                     } catch (Throwable var1466) {
                                                                        boolean var1507 = false;
                                                                        break label8724;
                                                                     }
                                                                  }

                                                                  try {
                                                                     VBMousePointerToJCursor = new Cursor(java.awt.Frame.DEFAULT_CURSOR);
                                                                     break label8906;
                                                                  } catch (Throwable var1465) {
                                                                     boolean var1508 = false;
                                                                     break label8886;
                                                                  }
                                                               }

                                                               try {
                                                                  if (h5.compareTo(VB.MousePointerConstants.vbSizePointer) == 0) {
                                                                     break label8886;
                                                                  }
                                                               } catch (Throwable var1481) {
                                                                  boolean var1493 = false;
                                                                  break label8845;
                                                               }

                                                               try {
                                                                  if (h5.compareTo(VB.MousePointerConstants.vbSizeNESW) != 0) {
                                                                     break label8912;
                                                                  }
                                                                  break label8845;
                                                               } catch (Throwable var1480) {
                                                                  boolean var1494 = false;
                                                                  break label8885;
                                                               }
                                                            }

                                                            label8720:
                                                            try {
                                                               VBMousePointerToJCursor = new Cursor(java.awt.Frame.MOVE_CURSOR);
                                                               break label8906;
                                                            } catch (Throwable var1464) {
                                                               boolean var1509 = false;
                                                               break label8720;
                                                            }
                                                         }

                                                         try {
                                                            VBMousePointerToJCursor = new Cursor(java.awt.Frame.SW_RESIZE_CURSOR);
                                                            break label8906;
                                                         } catch (Throwable var1463) {
                                                            boolean var1510 = false;
                                                            break label8885;
                                                         }
                                                      }

                                                      try {
                                                         if (h5.compareTo(VB.MousePointerConstants.vbSizeNS) == 0) {
                                                            break label8885;
                                                         }
                                                      } catch (Throwable var1479) {
                                                         boolean var1495 = false;
                                                         break label8850;
                                                      }

                                                      try {
                                                         if (h5.compareTo(VB.MousePointerConstants.vbSizeNWSE) != 0) {
                                                            break label8911;
                                                         }
                                                         break label8850;
                                                      } catch (Throwable var1478) {
                                                         boolean var1496 = false;
                                                         break label8884;
                                                      }
                                                   }

                                                   label8716:
                                                   try {
                                                      VBMousePointerToJCursor = new Cursor(java.awt.Frame.N_RESIZE_CURSOR);
                                                      break label8906;
                                                   } catch (Throwable var1462) {
                                                      boolean var1511 = false;
                                                      break label8716;
                                                   }
                                                }

                                                try {
                                                   VBMousePointerToJCursor = new Cursor(java.awt.Frame.SE_RESIZE_CURSOR);
                                                   break label8906;
                                                } catch (Throwable var1461) {
                                                   boolean var1512 = false;
                                                   break label8884;
                                                }
                                             }

                                             try {
                                                if (h5.compareTo(VB.MousePointerConstants.vbSizeWE) == 0) {
                                                   break label8884;
                                                }
                                             } catch (Throwable var1477) {
                                                boolean var1497 = false;
                                                break label8855;
                                             }

                                             try {
                                                if (h5.compareTo(VB.MousePointerConstants.vbUpArrow) != 0) {
                                                   break label8910;
                                                }
                                                break label8855;
                                             } catch (Throwable var1476) {
                                                boolean var1498 = false;
                                                break label8883;
                                             }
                                          }

                                          label8712:
                                          try {
                                             VBMousePointerToJCursor = new Cursor(java.awt.Frame.E_RESIZE_CURSOR);
                                             break label8906;
                                          } catch (Throwable var1460) {
                                             boolean var1513 = false;
                                             break label8712;
                                          }
                                       }

                                       try {
                                          VBMousePointerToJCursor = new Cursor(java.awt.Frame.DEFAULT_CURSOR);
                                          break label8906;
                                       } catch (Throwable var1459) {
                                          boolean var1514 = false;
                                          break label8883;
                                       }
                                    }

                                    try {
                                       if (h5.compareTo(VB.MousePointerConstants.vbHourglass) == 0) {
                                          break label8883;
                                       }
                                    } catch (Throwable var1475) {
                                       boolean var1499 = false;
                                       break label8860;
                                    }

                                    try {
                                       if (h5.compareTo(VB.MousePointerConstants.vbNoDrop) != 0) {
                                          break label8909;
                                       }
                                       break label8860;
                                    } catch (Throwable var1474) {
                                       boolean var1500 = false;
                                       break label8882;
                                    }
                                 }

                                 label8708:
                                 try {
                                    VBMousePointerToJCursor = new Cursor(java.awt.Frame.WAIT_CURSOR);
                                    break label8906;
                                 } catch (Throwable var1458) {
                                    boolean var1515 = false;
                                    break label8708;
                                 }
                              }

                              try {
                                 VBMousePointerToJCursor = new Cursor(java.awt.Frame.DEFAULT_CURSOR);
                                 break label8906;
                              } catch (Throwable var1457) {
                                 boolean var1516 = false;
                                 break label8882;
                              }
                           }

                           try {
                              if (h5.compareTo(VB.MousePointerConstants.vbArrowHourglass) == 0) {
                                 break label8882;
                              }
                           } catch (Throwable var1473) {
                              boolean var1501 = false;
                              break label8865;
                           }

                           try {
                              if (h5.compareTo(VB.MousePointerConstants.vbArrowQuestion) != 0) {
                                 break label8908;
                              }
                              break label8865;
                           } catch (Throwable var1472) {
                              boolean var1502 = false;
                              break label8881;
                           }
                        }

                        label8704:
                        try {
                           VBMousePointerToJCursor = new Cursor(java.awt.Frame.DEFAULT_CURSOR);
                           break label8906;
                        } catch (Throwable var1456) {
                           boolean var1517 = false;
                           break label8704;
                        }
                     }

                     try {
                        VBMousePointerToJCursor = new Cursor(java.awt.Frame.DEFAULT_CURSOR);
                        break label8906;
                     } catch (Throwable var1455) {
                        boolean var1518 = false;
                        break label8881;
                     }
                  }

                  try {
                     if (h5.compareTo(VB.MousePointerConstants.vbSizeAll) == 0) {
                        break label8881;
                     }
                  } catch (Throwable var1471) {
                     boolean var1503 = false;
                     break label8870;
                  }

                  try {
                     if (h5.compareTo(VB.MousePointerConstants.vbHandCursor) != 0) {
                        break label8907;
                     }
                     break label8870;
                  } catch (Throwable var1470) {
                     boolean var1504 = false;
                     break label8907;
                  }
               }

               label8700:
               try {
                  VBMousePointerToJCursor = new Cursor(java.awt.Frame.MOVE_CURSOR);
                  break label8906;
               } catch (Throwable var1454) {
                  boolean var1519 = false;
                  break label8700;
               }
            }

            label8698:
            try {
               VBMousePointerToJCursor = new Cursor(java.awt.Frame.HAND_CURSOR);
               break label8906;
            } catch (Throwable var1453) {
               boolean var1520 = false;
               break label8698;
            }
         }

         label8695:
         try {
            VBMousePointerToJCursor = new Cursor(java.awt.Frame.DEFAULT_CURSOR);
         } finally {
            break label8695;
         }
      }

      label8692:
      try {
         ;
      } finally {
         break label8692;
      }

      VBVariant cur = VBVariant.valueOf(new Cursors());

      try {
         Object var10000 = cur.toObject();
         VBArrayVariant var10002 = VBArray.createParamArray(0);
         var10002.setValueVar(0, VBVariant.valueOf(v));
         VBMousePointerToJCursor = (Cursor)Interaction.CallByName(var10000, "getVBACursor", var10002).toObject();
      } finally {
         return VBMousePointerToJCursor;
      }

      return VBMousePointerToJCursor;
   }

   public static Cursor VBMouseIconToJCursor(IResource param0, Component param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 2
      // 02: aconst_null
      // 03: astore 3
      // 04: aload 0
      // 05: aconst_null
      // 06: if_acmpeq 0d
      // 09: bipush 0
      // 0a: goto 0e
      // 0d: bipush 1
      // 0e: ifne 14
      // 11: goto 20
      // 14: nop
      // 15: aload 1
      // 16: invokevirtual java/awt/Component.getCursor ()Ljava/awt/Cursor;
      // 19: astore 2
      // 1a: goto 6f
      // 1d: goto 20
      // 20: nop
      // 21: aconst_null
      // 22: astore 5
      // 24: aload 0
      // 25: invokestatic VB/Global.LoadPicture (LVBA/IResource;)Ljava/awt/Image;
      // 28: astore 5
      // 2a: aload 5
      // 2c: aconst_null
      // 2d: if_acmpeq 34
      // 30: bipush 0
      // 31: goto 35
      // 34: bipush 1
      // 35: ifne 3b
      // 38: goto 44
      // 3b: nop
      // 3c: aload 1
      // 3d: invokevirtual java/awt/Component.getCursor ()Ljava/awt/Cursor;
      // 40: astore 2
      // 41: goto 5d
      // 44: nop
      // 45: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 48: aload 5
      // 4a: new java/awt/Point
      // 4d: dup
      // 4e: bipush 1
      // 4f: bipush 1
      // 50: invokespecial java/awt/Point.<init> (II)V
      // 53: ldc_w "VBMouseIcon"
      // 56: invokevirtual java/awt/Toolkit.createCustomCursor (Ljava/awt/Image;Ljava/awt/Point;Ljava/lang/String;)Ljava/awt/Cursor;
      // 59: astore 2
      // 5a: goto 5d
      // 5d: nop
      // 5e: goto 6f
      // 61: nop
      // 62: getstatic java/awt/Frame.DEFAULT_CURSOR I
      // 65: new java/awt/Cursor
      // 68: dup
      // 69: dup2_x1
      // 6a: pop2
      // 6b: invokespecial java/awt/Cursor.<init> (I)V
      // 6e: astore 2
      // 6f: nop
      // 70: aload 2
      // 71: areturn
      // 72: nop
      // 73: aload 3
      // 74: checkcast java/lang/Throwable
      // 77: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // 7a: goto 6f
      // 7d: astore 4
      // 7f: astore 3
      // 80: ret 4
      // 82: jsr 7d
      // 85: goto 61
      // 88: jsr 7d
      // 8b: goto 61
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int VBFontSizeToJFontSize(int v) {
      int VBFontSizeToJFontSize = 0;
      Throwable Err = null;

      try {
         VBFontSizeToJFontSize = (int)((double)v * GetFontFactor());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return VBFontSizeToJFontSize;
      }

      return VBFontSizeToJFontSize;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int JFontSizeToVBFontSize(int v) {
      int JFontSizeToVBFontSize = 0;
      Throwable Err = null;

      try {
         JFontSizeToVBFontSize = (int)((double)v / GetFontFactor() + 0.85);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return JFontSizeToVBFontSize;
      }

      return JFontSizeToVBFontSize;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static double GetFontFactor() {
      double GetFontFactor = 0.0;
      Throwable Err = null;

      try {
         GetFontFactor = 1.4;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return GetFontFactor;
      }

      return GetFontFactor;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean SavePicture(Image picture, String filename) {
      boolean SavePicture = false;
      Throwable Err = null;

      try {
         SavePicture = SavePicture(picture, filename, "png");
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return SavePicture;
      }

      return SavePicture;
   }

   public static boolean SavePicture(Image param0, String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: aconst_null
      // 03: astore 4
      // 05: bipush 0
      // 06: istore 3
      // 07: aload 0
      // 08: invokestatic VBA/Interaction.createBufferedImage (Ljava/awt/Image;)Ljava/awt/image/BufferedImage;
      // 0b: astore 6
      // 0d: new java/io/File
      // 10: dup
      // 11: aload 1
      // 12: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 15: astore 7
      // 17: aload 6
      // 19: checkcast java/awt/image/RenderedImage
      // 1c: aload 2
      // 1d: aload 7
      // 1f: invokestatic javax/imageio/ImageIO.write (Ljava/awt/image/RenderedImage;Ljava/lang/String;Ljava/io/File;)Z
      // 22: pop
      // 23: bipush 1
      // 24: istore 3
      // 25: nop
      // 26: nop
      // 27: iload 3
      // 28: ireturn
      // 29: nop
      // 2a: aload 4
      // 2c: checkcast java/lang/Throwable
      // 2f: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // 32: goto 26
      // 35: astore 5
      // 37: astore 4
      // 39: ret 5
      // 3b: jsr 35
      // 3e: goto 25
      // 41: jsr 35
      // 44: goto 25
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void PopupMenu(VB.VBMenuGroup MenuGroup) {
      Throwable Err = null;
      Component Owner = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
      VBVariant OwnerV = VBVariant.valueOf(Owner);
      int X = 0;
      int Y = 0;

      try {
         if (Owner != null) {
            X = Interaction.CallByName(
                  Interaction.CallByName(OwnerV.toObject(), "getMousePosition", VBArray.createParamArray(-1)).toObject(), "getX", VBArray.createParamArray(-1)
               )
               .intValue();
            Y = Interaction.CallByName(
                  Interaction.CallByName(OwnerV.toObject(), "getMousePosition", VBArray.createParamArray(-1)).toObject(), "getY", VBArray.createParamArray(-1)
               )
               .intValue();
         }

         MenuGroup.GetAsPopupMenu().show(Owner, X, Y);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void PopupMenu(VB.VBMenuGroup MenuGroup, int X, int Y) {
      Throwable Err = null;
      Component Owner = SysInfo().FocusedComponent();

      try {
         MenuGroup.GetAsPopupMenu().show(Owner, X, Y);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void PopupMenu(VB.VBMenuGroup MenuGroup, JComponent Owner, int X, int Y) {
      Throwable Err = null;

      try {
         MenuGroup.GetAsPopupMenu().show(Owner, X, Y);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   public static void DoEvents() {
      Throwable Err = null;

      try {
         JabacoEventQueue.getJabacoEventQueue().dispatchEvents();
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void End() {
      Throwable Err = null;

      try {
         System.exit(0);
      } catch (Throwable var3) {
         Interaction.MsgBox(var3);
         return;
      }
   }

   public static void Beep() {
      Throwable Err = null;

      try {
         Toolkit.getDefaultToolkit().beep();
      } finally {
         return;
      }
   }

   public static boolean IsStringBoolean(String v) {
      boolean IsStringBoolean = false;
      Throwable Err = null;
      String h5 = "";

      label100: {
         try {
            v = Strings.LCase(v);
         } finally {
            break label100;
         }

         h5 = "";

         label91:
         try {
            if (Strings.StrComp(v, "true") != 0 && Strings.StrComp(v, "false") != 0) {
               IsStringBoolean = false;
            } else {
               IsStringBoolean = true;
            }

            return IsStringBoolean;
         } finally {
            break label91;
         }
      }

      Interaction.MsgBox((Throwable)Err);
      return IsStringBoolean;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean GetStringAsBoolean(String v) {
      boolean GetStringAsBoolean = false;
      Throwable Err = null;

      try {
         GetStringAsBoolean = Boolean.parseBoolean(v);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return GetStringAsBoolean;
      }

      return GetStringAsBoolean;
   }
}
