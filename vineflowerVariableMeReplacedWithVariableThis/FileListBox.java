package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import VBA.VBArray;
import VBA.VBVariant;
import java.io.File;

public class FileListBox extends VB.ListBox {
   private String myDirectory;
   private boolean myHidden;
   private String myPattern;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         myDirectory = VB.FileSystem.CurDir();
         super.$BackColorAlternating(super.$BackColor());
         Update_Filename_List();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public void Update_Filename_List() {
      Throwable Err = null;
      int h8 = 0;
      int h9 = 0;

      label160: {
         try {
            Clear();
         } finally {
            break label160;
         }

         File myFile = new File(myDirectory);
         VBVariant myList = VBVariant.valueOf(VBArray.createVBArray(myFile.listFiles()));
         String myItem = "";
         int i = 0;
         i = 0;
         h8 = myList.toObject().getUBound(1);
         h9 = 1;

         while (true) {
            if (i > h8) {
               return;
            }

            try {
               myItem = Interaction.CallByName(myList.toObject().valueOfVar(i).toObject(), "getName", VBArray.createParamArray(-1)).toString();
               if (Interaction.CallByName(myList.toObject().valueOfVar(i).toObject(), "isFile", VBArray.createParamArray(-1))
                        .compareTo(VBVariant.valueOf(true))
                     == 0
                  && !(
                     !myHidden
                        & Interaction.CallByName(myList.toObject().valueOfVar(i).toObject(), "isHidden", VBArray.createParamArray(-1))
                              .compareTo(VBVariant.valueOf(true))
                           == 0
                  )) {
                  AddItem(Interaction.CallByName(myList.toObject().valueOfVar(i).toObject(), "getName", VBArray.createParamArray(-1)).toString());
               }
            } finally {
               break;
            }

            i += h9;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Path(String myPath) {
      Throwable Err = null;

      try {
         myDirectory = myPath;
         Update_Filename_List();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Hidden() {
      boolean $Hidden = false;
      Throwable Err = null;

      try {
         $Hidden = myHidden;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Hidden;
      }

      return $Hidden;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Hidden(boolean val) {
      Throwable Err = null;

      try {
         myHidden = val;
         Update_Filename_List();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Pattern() {
      String $Pattern = "";
      Throwable Err = null;

      try {
         $Pattern = myPattern;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Pattern;
      }

      return $Pattern;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Pattern(String vals) {
      Throwable Err = null;

      try {
         myPattern = vals;
         Update_Filename_List();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   public FileListBox() {
      initVarsI();
      Class_Initialize();
   }

   private void initVarsI() {
      myDirectory = "";
      myHidden = false;
      myPattern = "*.*";
   }
}
