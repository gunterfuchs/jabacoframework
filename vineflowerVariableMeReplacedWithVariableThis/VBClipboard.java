package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Constants;
import VBA.Interaction;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class VBClipboard implements VB.IJabacoClass {
   private Clipboard myClipBoardInternal;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private Clipboard myClipBoard() {
      Clipboard myClipBoard = null;
      Throwable Err = null;

      try {
         if (myClipBoardInternal == null) {
            myClipBoardInternal = Toolkit.getDefaultToolkit().getSystemClipboard();
         }

         myClipBoard = myClipBoardInternal;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return myClipBoard;
      }

      return myClipBoard;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void SetText(String val) {
      Throwable Err = null;
      StringSelection myStringSelection = null;

      label117: {
         Throwable var10000;
         label116: {
            label122: {
               try {
                  if (VB.Global.SysInfo().$SecurityMode()) {
                     break label122;
                  }
               } finally {
                  break label117;
               }

               myStringSelection = new StringSelection(val);

               try {
                  myClipBoard().setContents((Transferable)myStringSelection, null);
               } catch (Throwable var15) {
                  var10000 = var15;
                  boolean var10001 = false;
                  break label116;
               }
            }

            label105:
            try {
               return;
            } catch (Throwable var14) {
               var10000 = var14;
               boolean var18 = false;
               break label105;
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String GetText() {
      String GetText = "";
      Throwable Err = null;
      Transferable tmpData = null;

      label149: {
         try {
            if (VB.Global.SysInfo().$SecurityMode()) {
               break label149;
            }
         } catch (Throwable var24) {
            Interaction.MsgBox(var24);
            return GetText;
         }

         label137:
         try {
            tmpData = myClipBoard().getContents(null);
         } finally {
            break label137;
         }

         label135:
         try {
            GetText = (String)tmpData.getTransferData(DataFlavor.stringFlavor);
         } finally {
            break label135;
         }
      }

      try {
         ;
      } finally {
         return GetText;
      }

      return GetText;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void SetData(Transferable obj) {
      Throwable Err = null;

      try {
         if (!VB.Global.SysInfo().$SecurityMode()) {
            myClipBoard().setContents(obj, null);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Transferable GetData() {
      Transferable GetData = null;
      Throwable Err = null;

      label100: {
         try {
            if (VB.Global.SysInfo().$SecurityMode()) {
               break label100;
            }
         } catch (Throwable var15) {
            Interaction.MsgBox(var15);
            return GetData;
         }

         label94:
         try {
            GetData = myClipBoard().getContents(null);
         } finally {
            break label94;
         }
      }

      try {
         ;
      } finally {
         return GetData;
      }

      return GetData;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Clear() {
      Throwable Err = null;

      try {
         if (!VB.Global.SysInfo().$SecurityMode()) {
            SetText(Constants.vbNullString);
         }
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public VBClipboard() {
      initVars();
   }

   private void initVars() {
      myClipBoardInternal = null;
   }
}
