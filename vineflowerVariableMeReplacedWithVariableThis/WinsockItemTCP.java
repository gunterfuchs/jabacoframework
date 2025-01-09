package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Conversion;
import VBA.Interaction;
import VBA.Strings;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WinsockItemTCP extends Thread implements VB.IJabacoClass, VB.IWinsockItem, Runnable {
   private VB.Winsock myOwner;
   private Socket mySocket;
   private VB.WinsockSendThread mySendThread;
   private long myBytesReceived;
   private String myBuffer;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BytesReceived() {
      long $BytesReceived = 0L;
      Throwable Err = null;

      try {
         $BytesReceived = myBytesReceived + (long)GetInputStream().available();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BytesReceived;
      }

      return $BytesReceived;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public WinsockItemTCP(VB.Winsock RefOwner) {
      Throwable Err = null;
      super();
      initVars();

      try {
         myOwner = RefOwner;
         Class_Initialize();
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

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean Connect() {
      boolean Connect = false;
      Throwable Err = null;
      Socket tmpSocket = null;

      try {
         tmpSocket = new Socket($Owner().$RemoteHost(), (int)$Owner().$RemotePort());
         Connect = Connect((Socket)tmpSocket);
      } catch (Throwable var10) {
         boolean var10001 = false;

         while (true) {
            try {
               Connect = false;
               break;
            } catch (Throwable var9) {
               var10001 = false;
               continue;
            }
         }
      }

      return Connect;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean Connect(Socket refSocket) {
      boolean Connect = false;
      Throwable Err = null;

      try {
         mySocket = refSocket;
         Connect = true;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return Connect;
      }

      return Connect;
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
      // 02: aconst_null
      // 03: astore 3
      // 04: new VBA/VBArray
      // 07: dup
      // 08: invokespecial VBA/VBArray.<init> ()V
      // 0b: astore 4
      // 0d: aload 4
      // 0f: bipush 0
      // 10: bipush 0
      // 11: bipush 0
      // 12: invokeinterface VBA/IVBArray.setBound (IIZ)V 4
      // 17: bipush 0
      // 18: istore 5
      // 1a: aload 0
      // 1b: getfield VB/WinsockItemTCP.mySocket Ljava/net/Socket;
      // 1e: invokevirtual java/net/Socket.isConnected ()Z
      // 21: ifne 27
      // 24: goto a0
      // 27: nop
      // 28: aload 0
      // 29: invokevirtual VB/WinsockItemTCP.$Owner ()LVB/Winsock;
      // 2c: invokevirtual VB/Winsock.OnConnect ()V
      // 2f: goto 91
      // 32: nop
      // 33: bipush 1
      // 34: i2l
      // 35: invokestatic java/lang/Thread.sleep (J)V
      // 38: aload 0
      // 39: getfield VB/WinsockItemTCP.mySocket Ljava/net/Socket;
      // 3c: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 3f: astore 3
      // 40: aload 3
      // 41: aload 4
      // 43: invokeinterface VBA/IVBArray.byteArray ()[B 1
      // 48: bipush 0
      // 49: bipush 1
      // 4a: invokevirtual java/io/InputStream.read ([BII)I
      // 4d: istore 5
      // 4f: iload 5
      // 51: bipush 1
      // 52: if_icmpeq 59
      // 55: bipush 0
      // 56: goto 5a
      // 59: bipush 1
      // 5a: ifne 60
      // 5d: goto 82
      // 60: nop
      // 61: aload 0
      // 62: aload 0
      // 63: getfield VB/WinsockItemTCP.myBuffer Ljava/lang/String;
      // 66: aload 4
      // 68: invokeinterface VBA/IVBArray.toString ()Ljava/lang/String; 1
      // 6d: invokestatic VBA/Strings.StrMerge (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 70: putfield VB/WinsockItemTCP.myBuffer Ljava/lang/String;
      // 73: aload 0
      // 74: invokevirtual VB/WinsockItemTCP.$Owner ()LVB/Winsock;
      // 77: aload 3
      // 78: invokevirtual java/io/InputStream.available ()I
      // 7b: i2l
      // 7c: invokevirtual VB/Winsock.OnDataArrival (J)V
      // 7f: goto 90
      // 82: nop
      // 83: aload 0
      // 84: invokevirtual VB/WinsockItemTCP.$Owner ()LVB/Winsock;
      // 87: invokevirtual VB/Winsock.OnClose ()V
      // 8a: goto b3
      // 8d: goto 90
      // 90: nop
      // 91: nop
      // 92: aload 0
      // 93: getfield VB/WinsockItemTCP.mySocket Ljava/net/Socket;
      // 96: invokevirtual java/net/Socket.isConnected ()Z
      // 99: ifne 32
      // 9c: nop
      // 9d: goto a0
      // a0: nop
      // a1: aload 0
      // a2: invokevirtual VB/WinsockItemTCP.$Owner ()LVB/Winsock;
      // a5: invokevirtual VB/Winsock.OnClose ()V
      // a8: goto b3
      // ab: nop
      // ac: aload 0
      // ad: invokevirtual VB/WinsockItemTCP.$Owner ()LVB/Winsock;
      // b0: invokevirtual VB/Winsock.OnClose ()V
      // b3: nop
      // b4: return
      // b5: nop
      // b6: aload 1
      // b7: checkcast java/lang/Throwable
      // ba: invokestatic VBA/Interaction.MsgBox (Ljava/lang/Throwable;)V
      // bd: goto b3
      // c0: astore 2
      // c1: astore 1
      // c2: ret 2
      // c4: jsr c0
      // c7: goto ab
      // ca: jsr c0
      // cd: goto ab
   }

   public InputStream GetInputStream() {
      InputStream GetInputStream = null;
      Throwable Err = null;

      try {
         GetInputStream = mySocket.getInputStream();
      } finally {
         return GetInputStream;
      }

      return GetInputStream;
   }

   public OutputStream GetOutputStream() {
      OutputStream GetOutputStream = null;
      Throwable Err = null;

      try {
         GetOutputStream = mySocket.getOutputStream();
      } finally {
         return GetOutputStream;
      }

      return GetOutputStream;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public synchronized String GetData() {
      String GetData = "";
      Throwable Err = null;

      try {
         GetData = Strings.StrCat(myBuffer, GetDataFromBuffer());
         myBuffer = VBA.Constants.vbNullString;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return GetData;
      }

      return GetData;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private synchronized String GetDataFromBuffer() {
      String GetDataFromBuffer = "";
      Throwable Err = null;
      DataInputStream tmpStream = null;

      try {
         tmpStream = new DataInputStream(GetInputStream());
         myBytesReceived = myBytesReceived + (long)tmpStream.available();
         GetDataFromBuffer = Conversion.CStr(tmpStream);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return GetDataFromBuffer;
      }

      return GetDataFromBuffer;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void SendData(String data) {
      Throwable Err = null;

      try {
         mySendThread.AddData(data);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Socket $Parent() {
      Socket $Parent = null;
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

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         mySendThread = new VB.WinsockSendThread(this);
         mySendThread.start();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   private void initVars() {
      myOwner = null;
      mySocket = null;
      mySendThread = null;
      myBytesReceived = 0L;
      myBuffer = "";
   }
}
