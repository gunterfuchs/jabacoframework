package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;
import VBA.VBArray;
import VBA.VBArrayObject;
import VBA.VBVariant;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class AbstractForm extends JFrame implements VB.ILoadAdapter, VB.IJabacoForm, ComponentListener, WindowListener, WindowFocusListener {
   private boolean myInitLookAndFeelFlag;
   private VB.AbstractForm$VBMenuBar myMenuBar;
   private VB.AbstractForm$VBToolBar myToolBar;
   private VB.StartUpPositionConstants StartUpPositionVal;
   private boolean StartVisibility;
   private int StartLeft;
   private int StartTop;
   private float StartWidth;
   private float StartHeight;
   private boolean FormLoaded;
   private String myTag;
   private long myMenuBarBackColor;
   private long myMenuBarForeColor;
   private long myToolBarBackColor;
   private long myToolBarForeColor;
   private IResource myMouseIcon;
   private IResource myIcon;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JFrame $Parent() {
      JFrame $Parent = null;
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
   public AbstractForm() {
      Throwable Err = null;
      super();
      initVars();

      try {
         $Parent().setVisible(false);
         FormLoaded = false;
         myMenuBar.$Visible(false);
         myToolBar.$Visible(false);
         $Parent().setJMenuBar(myMenuBar);
         $Parent().getContentPane().add(myToolBar, BorderLayout.NORTH);
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

   @Override
   public void fireLoaded(Object sender) {
      Throwable Err = null;

      label80: {
         try {
            FormLoaded = true;
         } finally {
            break label80;
         }

         new VB.FormWindowStateConstants();

         label71:
         try {
            VB.FormWindowStateConstants myMemWindowState = $WindowState();
            $Parent()
               .setPreferredSize(
                  new Dimension(
                     (int)($Width() + (StartWidth - (float)$Parent().getContentPane().getWidth())),
                     (int)($Height() + (StartHeight - (float)$Parent().getContentPane().getHeight()))
                  )
               );
            $Parent().pack();
            $Height($Height() + (StartHeight - (float)$Parent().getContentPane().getHeight()));
            $Width($Width() + (StartWidth - (float)$Parent().getContentPane().getWidth()));
            Form_Load();
            VB.Global.DoEvents();
            StartLeft = (int)$Left();
            StartTop = (int)$Top();
            if (myMenuBar.$Visible()) {
               $Height($Height() + (float)myMenuBar.$Height());
            }

            if (myToolBar.$Visible()) {
               $Height($Height() + (float)myToolBar.$Height());
            }

            $StartUpPosition($StartUpPosition());
            $WindowState(myMemWindowState);
            $Visible(StartVisibility);
            Form_Resize();
            $Parent().addWindowListener(this);
            $Parent().addWindowFocusListener(this);
            $Parent().addComponentListener(this);
            return;
         } finally {
            break label71;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   @Override
   public void windowOpened(WindowEvent arg2) {
      Throwable Err = null;
   }

   @Override
   public void windowClosing(WindowEvent arg2) {
      Throwable Err = null;

      label195:
      try {
         $Parent().setDefaultCloseOperation(0);
      } finally {
         break label195;
      }

      int close = 0;

      label191:
      try {
         close = Form_Unload();
      } finally {
         break label191;
      }

      label188: {
         label187:
         try {
            if (close == 1) {
               break label188;
            }
         } finally {
            break label187;
         }

         label181:
         try {
            System.exit(0);
         } finally {
            break label181;
         }
      }

      try {
         ;
      } finally {
         return;
      }
   }

   @Override
   public void windowClosed(WindowEvent arg2) {
      Throwable Err = null;
   }

   @Override
   public void windowIconified(WindowEvent arg2) {
      Throwable Err = null;
   }

   @Override
   public void windowDeiconified(WindowEvent arg2) {
      Throwable Err = null;
   }

   @Override
   public void windowActivated(WindowEvent arg2) {
      Throwable Err = null;
   }

   @Override
   public void windowDeactivated(WindowEvent arg2) {
      Throwable Err = null;
   }

   @Override
   public void windowGainedFocus(WindowEvent arg2) {
      Throwable Err = null;

      try {
         Form_GotFocus();
      } finally {
         return;
      }
   }

   @Override
   public void windowLostFocus(WindowEvent arg2) {
      Throwable Err = null;

      try {
         Form_LostFocus();
      } finally {
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

   public int Form_Unload() {
      int Form_Unload = 0;
      Throwable Err = null;
      return Form_Unload;
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

   public void Form_KeyDown(int KeyCode, int Shift) {
      Throwable Err = null;
   }

   public void Form_KeyPress(int KeyAscii) {
      Throwable Err = null;
   }

   public void Form_KeyUp(int KeyCode, int Shift) {
      Throwable Err = null;
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
   public void SetDefaultClose() {
      Throwable Err = null;

      try {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
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
               super.setLocation(StartLeft, StartTop);
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

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.FormBorderStyleConstants $BorderStyle() {
      VB.FormBorderStyleConstants $BorderStyle = new VB.FormBorderStyleConstants();
      Throwable Err = null;

      try {
         if (!super.isResizable()) {
            if (!super.isUndecorated()) {
               $BorderStyle = VB.FormBorderStyleConstants.vbFixedDialog;
            } else {
               $BorderStyle = VB.FormBorderStyleConstants.vbBSNone;
            }
         } else {
            $BorderStyle = VB.FormBorderStyleConstants.vbSizable;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $BorderStyle;
      }

      return $BorderStyle;
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

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Close(int FileNumber) {
      Throwable Err = null;

      try {
         VB.FileSystem.Close(FileNumber);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Close(VB.VBFileHandler Handler) {
      Throwable Err = null;

      try {
         VB.FileSystem.Close(Handler);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BorderStyle(VB.FormBorderStyleConstants v) {
      Throwable Err = null;
      new VB.FormBorderStyleConstants();
      VB.FormBorderStyleConstants h5 = null;

      try {
         if (v.compareTo(VB.FormBorderStyleConstants.vbBSNone) != 0) {
            if (v.compareTo(VB.FormBorderStyleConstants.vbFixedDialog) != 0) {
               if (v.compareTo(VB.FormBorderStyleConstants.vbFixedSingle) != 0) {
                  if (v.compareTo(VB.FormBorderStyleConstants.vbFixedToolWindow) != 0) {
                     if (v.compareTo(VB.FormBorderStyleConstants.vbSizable) != 0) {
                        if (v.compareTo(VB.FormBorderStyleConstants.vbSizableToolWindow) == 0) {
                           $Parent().setResizable(true);
                        }
                     } else {
                        $Parent().setResizable(true);
                     }
                  } else {
                     $Parent().setResizable(false);
                  }
               } else {
                  $Parent().setResizable(false);
               }
            } else {
               $Parent().setResizable(false);
            }
         } else {
            super.setResizable(false);
            super.setUndecorated(true);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
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
   public VB.FormWindowStateConstants $WindowState() {
      VB.FormWindowStateConstants $WindowState = new VB.FormWindowStateConstants();
      Throwable Err = null;
      int h5 = 0;
      h5 = (boolean)0;

      try {
         h5 = super.getExtendedState();
         if (h5 != java.awt.Frame.ICONIFIED) {
            if (h5 != java.awt.Frame.MAXIMIZED_BOTH) {
               $WindowState = VB.FormWindowStateConstants.vbNormal;
            } else {
               $WindowState = VB.FormWindowStateConstants.vbMaximized;
            }
         } else {
            $WindowState = VB.FormWindowStateConstants.vbMinimized;
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
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
                  setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
               }
            } else {
               setExtendedState(java.awt.Frame.ICONIFIED);
            }
         } else {
            setExtendedState(java.awt.Frame.NORMAL);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IResource $Icon() {
      IResource $Icon = null;
      Throwable Err = null;

      try {
         $Icon = myIcon;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Icon;
      }

      return $Icon;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Icon(IResource Path) {
      Throwable Err = null;

      try {
         myIcon = Path;
         $Parent().setIconImage(VB.Global.LoadPicture(Path));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
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

   public Container getParentContainer() {
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
               if (((Component)comp.valueOfObj(i)).getClass().getName().equals("VB.Form$PictureBox")
                  | ((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JDesktopPane")) {
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

   public void AnchorResize() {
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
   @Override
   public float $Left() {
      float $Left = 0.0F;
      Throwable Err = null;

      try {
         if (FormLoaded) {
            $Left = (float)getLocation().x;
         } else {
            $Left = (float)StartLeft;
         }
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
         if (!FormLoaded) {
            StartLeft = (int)v;
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
         if (FormLoaded) {
            $Top = (float)getLocation().y;
         } else {
            $Top = (float)StartTop;
         }
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
         if (!FormLoaded) {
            StartTop = (int)v;
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
   public float $Width() {
      float $Width = 0.0F;
      Throwable Err = null;

      try {
         if (FormLoaded) {
            $Width = (float)getSize().width;
         } else {
            $Width = StartWidth;
         }
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
         if (!FormLoaded) {
            StartWidth = v;
         }

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
         if (FormLoaded) {
            $Height = (float)getSize().height;
         } else {
            $Height = StartHeight;
         }
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
         if (!FormLoaded) {
            StartHeight = v;
         }

         setSize(getSize().width, (int)v);
         Refresh();
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
   public Font $Font() {
      Font $Font = null;
      Throwable Err = null;

      try {
         $Font = super.getFont();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Font;
      }

      return $Font;
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

   private void initVars() {
      myInitLookAndFeelFlag = VB.Global.LookAndFeelManager().isInitialized();
      myMenuBar = new VB.AbstractForm$VBMenuBar(this);
      myMenuBar.setOwner(this, 1);
      myToolBar = new VB.AbstractForm$VBToolBar(this);
      myToolBar.setOwner(this, 2);
      StartUpPositionVal = VB.StartUpPositionConstants.vbStartUpScreen;
      StartVisibility = false;
      StartLeft = 0;
      StartTop = 0;
      StartWidth = 0.0F;
      StartHeight = 0.0F;
      FormLoaded = false;
      myTag = "";
      myMenuBarBackColor = 0L;
      myMenuBarForeColor = 0L;
      myToolBarBackColor = 0L;
      myToolBarForeColor = 0L;
      myMouseIcon = null;
      myIcon = null;
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
