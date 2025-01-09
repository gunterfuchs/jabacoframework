package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import java.net.DatagramSocket;

public class WinsockItemUDP extends Thread implements VB.IJabacoClass, VB.IWinsockItem, Runnable {
   private VB.Winsock myOwner;
   private DatagramSocket mySocket;

   public long $BytesReceived() {
      long $BytesReceived = 0L;
      Throwable Err = null;
      return $BytesReceived;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void WinsockItem(VB.Winsock RefOwner) {
      Throwable Err = null;

      try {
         myOwner = RefOwner;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public VB.Winsock $Owner() {
      VB.Winsock $Owner = null;
      Throwable Err = null;

      try {
         $Owner = myOwner;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Owner;
      }

      return $Owner;
   }

   @Override
   public void run() {
      Throwable Err = null;
   }

   @Override
   public synchronized String GetData() {
      String GetData = "";
      Throwable Err = null;
      return GetData;
   }

   @Override
   public void SendData(String data) {
      Throwable Err = null;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public DatagramSocket $Parent() {
      DatagramSocket $Parent = null;
      Throwable Err = null;

      try {
         $Parent = mySocket;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   @Override
   public void Close() {
      Throwable Err = null;

      try {
         mySocket.close();
      } finally {
         return;
      }
   }

   private void Class_Initialize() {
      Throwable Err = null;
   }

   public WinsockItemUDP() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
      myOwner = null;
      mySocket = null;
   }
}
