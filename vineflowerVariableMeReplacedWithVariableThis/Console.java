package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import java.util.Scanner;

public class Console implements VB.IJabacoClass {
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Print(String text) {
      Throwable Err = null;

      try {
         System.out.println(text);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void PrintError(String text) {
      Throwable Err = null;

      try {
         System.err.println(text);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String Input() {
      String Input = "";
      Throwable Err = null;

      try {
         Input = new Scanner(System.in).nextLine();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return Input;
      }

      return Input;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String Input(String text) {
      String Input = "";
      Throwable Err = null;

      try {
         System.out.print(text);
         Input = Input();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return Input;
      }

      return Input;
   }

   public Console() {
      initVars();
   }

   private void initVars() {
   }
}
