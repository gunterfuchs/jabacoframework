package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import VBA.Strings;
import VBA.VBVariant;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WinsockSendThread extends Thread {
   private VB.WinsockItemTCP Owner;
   private List DataHive;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void AddData(String NewData) {
      Throwable Err = null;

      try {
         if (Owner.$Owner().$State().compareTo(VB.StateConstants.sckConnected) != 0) {
            Owner.$Owner().OnError(VB.ErrorConstants.sckNotConnected);
         } else {
            DataHive.add((String)NewData);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public WinsockSendThread(VB.WinsockItemTCP RefOwner) {
      Throwable Err = null;
      super(RefOwner);
      initVars();

      try {
         Owner = RefOwner;
         Class_Initialize();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 1
      // 02: goto 0a
      // 05: nop
      // 06: aload 0
      // 07: invokespecial VB/WinsockSendThread.processData ()V
      // 0a: nop
      // 0b: bipush 1
      // 0c: ifne 05
      // 0f: nop
      // 10: goto 25
      // 13: nop
      // 14: aload 0
      // 15: getfield VB/WinsockSendThread.Owner LVB/WinsockItemTCP;
      // 18: invokevirtual VB/WinsockItemTCP.$Owner ()LVB/Winsock;
      // 1b: getstatic VB/ErrorConstants.sckInProgress LVB/ErrorConstants;
      // 1e: aload 1
      // 1f: invokevirtual java/lang/Throwable.toString ()Ljava/lang/String;
      // 22: invokevirtual VB/Winsock.OnError (LVB/ErrorConstants;Ljava/lang/String;)V
      // 25: nop
      // 26: return
      // 27: nop
      // 28: aload 1
      // 29: checkcast java/lang/Throwable
      // 2c: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // 2f: goto 25
      // 32: astore 2
      // 33: astore 1
      // 34: ret 2
      // 36: jsr 32
      // 39: goto 13
      // 3c: jsr 32
      // 3f: goto 13
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private synchronized void processData() {
      Throwable Err = null;
      String tmpData = "";

      try {
         if (DataHive.isEmpty()) {
            Thread.yield();
            Thread.sleep((long)1);
         } else {
            tmpData = DataHive.get(0).toString();
            DataHive.remove(0);
            SendData(tmpData);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void SendData(String data) {
      Throwable Err = null;
      DataOutputStream tmpStream = null;
      long DataSize = 0L;
      long CurrentSend = 0L;
      long CurrentDataSize = 0L;
      long CurrentPacketSize = 0L;

      label166: {
         Throwable var10000;
         label165: {
            try {
               tmpStream = new DataOutputStream(Owner.GetOutputStream());
               DataSize = (long)Strings.Len(data);
               CurrentDataSize = DataSize;
            } catch (Throwable var32) {
               var10000 = var32;
               boolean var10001 = false;
               break label165;
            }

            while (true) {
               try {
                  ;
               } catch (Throwable var30) {
                  var10000 = var30;
                  boolean var38 = false;
                  break;
               }

               boolean var37 = CurrentDataSize > (long)0;

               try {
                  if (!var37) {
                     Owner.$Owner().OnSendComplete();
                     return;
                  }
               } finally {
                  break label166;
               }

               try {
                  CurrentPacketSize = Interaction.IIF(
                        Owner.$Owner().$BlockSize() < CurrentDataSize, VBVariant.valueOf(Owner.$Owner().$BlockSize()), VBVariant.valueOf(CurrentDataSize)
                     )
                     .longValue();
                  tmpStream.write(Strings.StringToArray(data), (int)CurrentSend, (int)CurrentPacketSize);
                  CurrentSend += CurrentPacketSize;
                  CurrentDataSize -= CurrentPacketSize;
                  Owner.$Owner().OnSendProgress(CurrentSend, CurrentDataSize);
               } catch (Throwable var29) {
                  var10000 = var29;
                  boolean var39 = false;
                  break;
               }
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         DataHive = Collections.synchronizedList(new ArrayList());
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   private void initVars() {
      Owner = null;
      DataHive = null;
   }
}
