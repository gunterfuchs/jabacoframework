package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import java.net.Socket;
import javax.swing.SwingUtilities;

public class WinsockServerRequest implements Runnable {
   private Socket mySocket;
   private VB.Winsock myOwner;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public WinsockServerRequest(VB.Winsock RefOwner, Socket RefSocket) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myOwner = RefOwner;
         mySocket = RefSocket;
         if (!SwingUtilities.isEventDispatchThread()) {
            SwingUtilities.invokeAndWait(this);
         } else {
            run();
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void run() {
      Throwable Err = null;

      try {
         myOwner.OnConnectionRequest(mySocket);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   private void initVars() {
      mySocket = null;
      myOwner = null;
   }
}
