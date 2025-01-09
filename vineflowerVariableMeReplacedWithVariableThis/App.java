package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayString;
import VBA.VBVariant;
import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

public class App {
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Path() {
      String $Path = "";
      Throwable Err = null;
      String tmpFile = "";
      String tmpString = "";
      new VBArray();

      try {
         VBArrayString tmpFileParts = Strings.Split(System.getProperty("sun.java.command"), " ");
         tmpFile = tmpFileParts.valueOfStr(0);
         if (Strings.InStr(System.getProperty("sun.java.command"), System.getProperty("file.separator")) != 0) {
            tmpString = Strings.Left(
               System.getProperty("sun.java.command"), Strings.InStrRev(System.getProperty("sun.java.command"), System.getProperty("file.separator")) - 1
            );
         } else if (!(Strings.Len(tmpFile) > 3 & Strings.Mid(tmpFile, Strings.Len(tmpFile) - 3).equalsIgnoreCase(".jar"))) {
            tmpString = new File(
                  Class.forName(tmpFile, false, ClassLoader.getSystemClassLoader()).getProtectionDomain().getCodeSource().getLocation().toURI().getPath()
               )
               .getAbsolutePath();
         } else {
            tmpString = ".";
         }

         if (Strings.StrComp(Strings.Right(tmpString, 1), System.getProperty("file.separator")) == 0) {
            tmpString = Strings.Left(tmpString, Strings.Len(tmpString) - 1);
         }

         if (Strings.InStr(tmpString, System.getProperty("file.separator")) == 0) {
            tmpString = Strings.StrCat(tmpString, System.getProperty("file.separator"));
         }

         $Path = tmpString;
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return $Path;
      }

      return $Path;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $JabacoFrameworkPath() {
      String $JabacoFrameworkPath = "";
      Throwable Err = null;
      File tmpFile = null;
      String tmpString = "";

      try {
         tmpFile = new File(super.getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
         if (!tmpFile.isFile()) {
            tmpString = tmpFile.getAbsolutePath();
         } else {
            tmpString = Strings.Left(tmpFile.getAbsolutePath(), Strings.InStrRev(tmpFile.getAbsolutePath(), System.getProperty("file.separator")) - 1);
         }

         if (Strings.StrComp(Strings.Right(tmpString, 1), System.getProperty("file.separator")) == 0) {
            tmpString = Strings.Left(tmpString, Strings.Len(tmpString) - 1);
         }

         if (Strings.InStr(tmpString, System.getProperty("file.separator")) == 0) {
            tmpString = Strings.StrCat(tmpString, System.getProperty("file.separator"));
         }

         $JabacoFrameworkPath = tmpString;
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return $JabacoFrameworkPath;
      }

      return $JabacoFrameworkPath;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $ExeName() {
      String $ExeName = "";
      Throwable Err = null;
      String tmpFile = "";
      String tmpString = "";
      new VBArray();

      try {
         VBArrayString tmpFileParts = Strings.Split(System.getProperty("sun.java.command"), " ");
         tmpFile = tmpFileParts.valueOfStr(0);
         if (!(Strings.Len(tmpFile) > 3 & Strings.Mid(tmpFile, Strings.Len(tmpFile) - 3).equalsIgnoreCase(".jar"))) {
            tmpString = Strings.StrCat(tmpFile, ".class");
         } else {
            tmpFileParts = Strings.Split(tmpFile, System.getProperty("file.separator"));
            tmpFile = tmpFileParts.valueOfStr(tmpFileParts.getUBound(1));
            tmpString = tmpFile;
         }

         $ExeName = tmpString;
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return $ExeName;
      }

      return $ExeName;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $StartCommand() {
      String $StartCommand = "";
      Throwable Err = null;

      try {
         $StartCommand = System.getProperty("sun.java.command");
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $StartCommand;
      }

      return $StartCommand;
   }

   public String $JVMArguments() {
      String $JVMArguments = "";
      Throwable Err = null;
      int h9 = 0;
      int h10 = false;
      VBVariant tmpString = VBVariant.valueOf("");
      RuntimeMXBean rbean = null;

      label232: {
         try {
            rbean = ManagementFactory.getRuntimeMXBean();
         } finally {
            break label232;
         }

         List argumentList = null;

         try {
            argumentList = rbean.getInputArguments();
         } finally {
            break label232;
         }

         int i = 0;
         i = 0;
         h9 = argumentList.size() - 1;

         for (int var34 = 1; i <= h9; i += var34) {
            try {
               if (i > 0) {
                  tmpString = VBVariant.valueOf(Strings.StrCat(tmpString.toString(), " "));
               }

               tmpString = VBVariant.valueOf(Strings.StrCat(tmpString.toString(), argumentList.get(i).toString()));
            } finally {
               break label232;
            }
         }

         label203:
         try {
            $JVMArguments = tmpString.toString();
            return $JVMArguments;
         } finally {
            break label203;
         }
      }

      Interaction.MsgBox((Throwable)Err);
      return $JVMArguments;
   }

   public App() {
      initVars();
   }

   private void initVars() {
   }
}
