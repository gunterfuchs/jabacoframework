package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Constants;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.print.PrinterJob;
import java.io.File;
import javax.swing.JColorChooser;

public class CommonDialog implements VB.IJabacoClass {
   private String myDialogTitle;
   private String myFileName;
   private String myFilter;
   private String myInitDir;
   private long myColor;
   private boolean myIsCanceled;
   private String myHelpFile;
   private int myFlags;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void ShowColor() {
      Throwable Err = null;
      Color tmpColor = null;
      Color tmpColor2 = null;

      try {
         tmpColor2 = Information.RGBtoColor($Color());
         tmpColor = JColorChooser.showDialog(null, $DialogTitle(), (Color)tmpColor2);
         myIsCanceled = tmpColor == null;
         if (!myIsCanceled) {
            myColor = Information.ColorToRGB((Color)tmpColor);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $HelpFile() {
      String $HelpFile = "";
      Throwable Err = null;

      try {
         $HelpFile = myHelpFile;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $HelpFile;
      }

      return $HelpFile;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $HelpFile(String aFileName) {
      Throwable Err = null;

      try {
         myHelpFile = aFileName;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void ShowHelp() {
      Throwable Err = null;
      Desktop d = Desktop.getDesktop();

      try {
         d.open(new File($HelpFile()));
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void ShowPrinter() {
      Throwable Err = null;
      PrinterJob p = PrinterJob.getPrinterJob();

      try {
         myIsCanceled = !p.printDialog();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void ShowOpen() {
      Throwable Err = null;

      try {
         ShowOpen(true);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void ShowOpen(boolean Modal) {
      Throwable Err = null;

      try {
         ShowOpen(Modal, null);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   private FileDialog createDialog(java.awt.Frame Parent, String Title, int Flag) {
      FileDialog createDialog = null;
      Throwable Err = null;
      java.awt.Frame tmpParentFrame = null;

      label800:
      try {
         createDialog = new FileDialog(null, Title, Flag);
      } finally {
         break label800;
      }

      label804: {
         label805: {
            label795:
            try {
               if (Parent != null) {
                  break label805;
               }
            } finally {
               break label795;
            }

            label787:
            try {
               tmpParentFrame = (java.awt.Frame)VB.Global.SysInfo().FocusedWindow();
            } finally {
               break label787;
            }

            label784: {
               label807: {
                  try {
                     if (tmpParentFrame == null) {
                        break label807;
                     }
                  } finally {
                     break label807;
                  }

                  label775:
                  try {
                     ;
                  } finally {
                     break label775;
                  }

                  try {
                     createDialog = new FileDialog(tmpParentFrame, Title, Flag);
                     break label784;
                  } finally {
                     break label784;
                  }
               }

               label773:
               try {
                  createDialog = new FileDialog(null, Title, Flag);
               } finally {
                  break label773;
               }
            }

            try {
               break label804;
            } finally {
               break label804;
            }
         }

         label767:
         try {
            ;
         } finally {
            break label767;
         }

         label765:
         try {
            createDialog = new FileDialog(Parent, Title, Flag);
         } finally {
            break label765;
         }
      }

      label762:
      try {
         ;
      } finally {
         break label762;
      }

      try {
         createDialog.setDirectory(myInitDir);
      } finally {
         return createDialog;
      }

      return createDialog;
   }

   public void ShowOpen(boolean Modal, java.awt.Frame Parent) {
      Throwable Err = null;
      String tmpTitle = "";

      label258:
      try {
         if (Strings.Len($DialogTitle()) != 0) {
            tmpTitle = $DialogTitle();
         } else {
            tmpTitle = "Open";
         }
      } finally {
         break label258;
      }

      FileDialog tmpDialog = createDialog(Parent, tmpTitle, FileDialog.LOAD);

      label254:
      try {
         tmpDialog.setModal(Modal);
      } finally {
         break label254;
      }

      label251:
      try {
         tmpDialog.setFile($FileName());
      } finally {
         break label251;
      }

      label248:
      try {
         tmpDialog.show();
      } finally {
         break label248;
      }

      label245:
      try {
         myIsCanceled = Strings.StrComp(tmpDialog.getFile(), null) == 0;
      } finally {
         break label245;
      }

      try {
         $FileName(MergeFileAndFolder(tmpDialog.getDirectory(), tmpDialog.getFile()));
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void ShowSave() {
      Throwable Err = null;

      try {
         ShowSave(true);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public void ShowSave(boolean Modal) {
      Throwable Err = null;
      String tmpTitle = "";

      label90: {
         try {
            if (Strings.Len($DialogTitle()) != 0) {
               tmpTitle = $DialogTitle();
            } else {
               tmpTitle = "Save";
            }
         } finally {
            break label90;
         }

         FileDialog tmpDialog = createDialog(null, tmpTitle, FileDialog.SAVE);

         label81:
         try {
            tmpDialog.setModal(Modal);
            tmpDialog.setFile($FileName());
            tmpDialog.show();
            myIsCanceled = Strings.StrComp(tmpDialog.getFile(), null) == 0;
            $FileName(MergeFileAndFolder(tmpDialog.getDirectory(), tmpDialog.getFile()));
            return;
         } finally {
            break label81;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private String MergeFileAndFolder(String sFolder, String sFile) {
      String MergeFileAndFolder = "";
      Throwable Err = null;

      try {
         if (Strings.StrComp(sFile, null) == 0) {
            sFile = Constants.vbNullString;
         }

         if (Strings.StrComp(sFolder, null) == 0) {
            sFolder = Constants.vbNullString;
         }

         if (Strings.Len(sFile) != 0) {
            if (!(Strings.StrComp(Strings.Right(sFolder, 1), "\\") != 0 & Strings.StrComp(Strings.Right(sFolder, 1), "/") != 0)) {
               MergeFileAndFolder = Strings.StrCat(sFolder, sFile);
            } else {
               MergeFileAndFolder = Strings.StrCat(Strings.StrCat(sFolder, "\\"), sFile);
            }
         } else {
            MergeFileAndFolder = Constants.vbNullString;
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return MergeFileAndFolder;
      }

      return MergeFileAndFolder;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $IsCanceled() {
      boolean $IsCanceled = false;
      Throwable Err = null;

      try {
         $IsCanceled = myIsCanceled;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $IsCanceled;
      }

      return $IsCanceled;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Filter(String s) {
      Throwable Err = null;

      try {
         myFilter = s;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Filter() {
      String $Filter = "";
      Throwable Err = null;

      try {
         $Filter = myFilter;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Filter;
      }

      return $Filter;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $DialogTitle(String s) {
      Throwable Err = null;

      try {
         myDialogTitle = s;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $DialogTitle() {
      String $DialogTitle = "";
      Throwable Err = null;

      try {
         $DialogTitle = myDialogTitle;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $DialogTitle;
      }

      return $DialogTitle;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $FileName(String s) {
      Throwable Err = null;

      try {
         myFileName = s;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $FileName() {
      String $FileName = "";
      Throwable Err = null;

      try {
         $FileName = myFileName;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $FileName;
      }

      return $FileName;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $InitDir(String s) {
      Throwable Err = null;

      try {
         myInitDir = s;
         myInitDir = Strings.Replace(myInitDir, "\\\\", "\\");
         myInitDir = Strings.Replace(myInitDir, "\\", "\\\\");
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $InitDir() {
      String $InitDir = "";
      Throwable Err = null;

      try {
         $InitDir = myInitDir;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $InitDir;
      }

      return $InitDir;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $Color() {
      long $Color = 0L;
      Throwable Err = null;

      try {
         $Color = myColor;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $Color;
      }

      return $Color;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Color(long v) {
      Throwable Err = null;

      try {
         myColor = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   public boolean $CancelError() {
      boolean $CancelError = false;
      Throwable Err = null;
      return $CancelError;
   }

   public void $CancelError(boolean v) {
      Throwable Err = null;
   }

   public CommonDialog() {
      initVars();
   }

   private void initVars() {
      myDialogTitle = "";
      myFileName = "";
      myFilter = "";
      myInitDir = "";
      myColor = 0L;
      myIsCanceled = false;
      myHelpFile = "";
      myFlags = 0;
   }
}
