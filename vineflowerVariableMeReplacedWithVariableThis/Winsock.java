package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import VBA.Strings;
import java.net.InetAddress;
import java.net.Socket;

public class Winsock implements VB.IJabacoClass {
   private VB.IWinsockItem mySocket;
   private VB.WinsockServer myServer;
   private String myRemoteHost;
   private long myRemotePort;
   private String myLocalHost;
   private long myLocalPort;
   private VB.ProtocolConstants myProtocol;
   private long myBlockSize;
   private VB.StateConstants myState;

   public void _Error(VB.ErrorConstants Number, String Description) {
   }

   public void _Connect() {
   }

   public void _Close() {
   }

   public void _SendProgress(long bytesSent, long bytesRemaining) {
   }

   public void _DataArrival(long bytesTotal) {
   }

   public void _ConnectionRequest(Socket requestSocket) {
   }

   public void _SendComplete() {
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.IWinsockItem $Parent() {
      VB.IWinsockItem $Parent = null;
      Throwable Err = null;

      try {
         $Parent = mySocket;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.StateConstants $State() {
      VB.StateConstants $State = new VB.StateConstants();
      Throwable Err = null;

      try {
         $State = myState;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $State;
      }

      return $State;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean Listen() {
      boolean Listen = false;
      Throwable Err = null;

      try {
         myServer.startServer();
         Listen = false;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return Listen;
      }

      return Listen;
   }

   public void Accept(Socket requestSocket) {
      Throwable Err = null;

      label69: {
         try {
            Close();
         } finally {
            break label69;
         }

         VB.WinsockItemTCP tmpSocket = new VB.WinsockItemTCP(this);

         label60:
         try {
            mySocket = tmpSocket;
            myState = VB.StateConstants.sckConnected;
            if (tmpSocket.Connect(requestSocket)) {
               tmpSocket.start();
            }

            return;
         } finally {
            break label60;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void OnDataArrival(long bytesTotal) {
      Throwable Err = null;

      try {
         _DataArrival(bytesTotal);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void OnConnect() {
      Throwable Err = null;

      try {
         _Connect();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void OnClose() {
      Throwable Err = null;

      try {
         myState = VB.StateConstants.sckClosing;
         Close();
         _Close();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void OnConnectionRequest(Socket requestSocket) {
      Throwable Err = null;

      try {
         _ConnectionRequest(requestSocket);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void OnSendProgress(long bytesSent, long bytesRemaining) {
      Throwable Err = null;

      try {
         _SendProgress(bytesSent, bytesRemaining);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void OnSendComplete() {
      Throwable Err = null;

      try {
         _SendComplete();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String GetData() {
      String GetData = "";
      Throwable Err = null;

      try {
         GetData = mySocket.GetData();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return GetData;
      }

      return GetData;
   }

   public void Connect() {
      Throwable Err = null;

      label69: {
         try {
            myState = VB.StateConstants.sckConnecting;
            Close();
         } finally {
            break label69;
         }

         VB.WinsockItemTCP tmpSocket = new VB.WinsockItemTCP(this);

         label60:
         try {
            mySocket = tmpSocket;
            if (tmpSocket.Connect()) {
               myState = VB.StateConstants.sckConnected;
               tmpSocket.start();
            }

            return;
         } finally {
            break label60;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Connect(String RefRemoteHost, long RefRemotePort) {
      Throwable Err = null;

      try {
         $RemoteHost(RefRemoteHost);
         $RemotePort(RefRemotePort);
         Connect();
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean isMulticastAddress() {
      boolean isMulticastAddress = false;
      Throwable Err = null;

      try {
         isMulticastAddress = InetAddress.getByName($RemoteHost()).isMulticastAddress();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return isMulticastAddress;
      }

      return isMulticastAddress;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void SendData(String data) {
      Throwable Err = null;

      try {
         if (mySocket != null) {
            mySocket.SendData(data);
         } else {
            OnError(VB.ErrorConstants.sckNotInitialized);
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Close() {
      Throwable Err = null;

      try {
         if (myServer != null) {
            myServer.closeServer();
         }

         if (mySocket != null) {
            mySocket.Close();
         }

         mySocket = null;
         myState = VB.StateConstants.sckClosed;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $LocalHost(String Host) {
      Throwable Err = null;

      try {
         myLocalHost = Host;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $LocalHost() {
      String $LocalHost = "";
      Throwable Err = null;

      try {
         if (Strings.Len(myLocalHost) != 0) {
            $LocalHost = myLocalHost;
         } else {
            $LocalHost = "127.0.0.1";
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $LocalHost;
      }

      return $LocalHost;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $LocalPort(long Port) {
      Throwable Err = null;

      try {
         myLocalPort = Port;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $LocalPort() {
      long $LocalPort = 0L;
      Throwable Err = null;

      try {
         $LocalPort = myLocalPort;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $LocalPort;
      }

      return $LocalPort;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $RemoteHost(String Host) {
      Throwable Err = null;

      try {
         myRemoteHost = Host;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $RemoteHost() {
      String $RemoteHost = "";
      Throwable Err = null;

      try {
         $RemoteHost = myRemoteHost;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $RemoteHost;
      }

      return $RemoteHost;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $RemotePort(long Port) {
      Throwable Err = null;

      try {
         myRemotePort = Port;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $RemotePort() {
      long $RemotePort = 0L;
      Throwable Err = null;

      try {
         $RemotePort = myRemotePort;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $RemotePort;
      }

      return $RemotePort;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Protocol(VB.ProtocolConstants v) {
      Throwable Err = null;

      try {
         myProtocol = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.ProtocolConstants $Protocol() {
      VB.ProtocolConstants $Protocol = new VB.ProtocolConstants();
      Throwable Err = null;

      try {
         $Protocol = myProtocol;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Protocol;
      }

      return $Protocol;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $BlockSize(long v) {
      Throwable Err = null;

      try {
         myBlockSize = v;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $BlockSize() {
      long $BlockSize = 0L;
      Throwable Err = null;

      try {
         if (myBlockSize > (long)0) {
            $BlockSize = myBlockSize;
         } else {
            $BlockSize = (long)16000;
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $BlockSize;
      }

      return $BlockSize;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         myBlockSize = (long)16000;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void OnError(VB.ErrorConstants Number) {
      Throwable Err = null;
      new VB.ErrorConstants();
      String Description = "";
      VB.ErrorConstants h6 = null;

      try {
         if (Number.compareTo(VB.ErrorConstants.sckOutOfMemory) != 0) {
            if (Number.compareTo(VB.ErrorConstants.sckInProgress) != 0) {
               if (Number.compareTo(VB.ErrorConstants.sckAlreadyComplete) != 0) {
                  if (Number.compareTo(VB.ErrorConstants.sckNotSocket) != 0) {
                     if (Number.compareTo(VB.ErrorConstants.sckMsgTooBig) != 0) {
                        if (Number.compareTo(VB.ErrorConstants.sckPortNotSupported) != 0) {
                           if (Number.compareTo(VB.ErrorConstants.sckAddressInUse) != 0) {
                              if (Number.compareTo(VB.ErrorConstants.sckAddressNotAvailable) != 0) {
                                 if (Number.compareTo(VB.ErrorConstants.sckNetworkSubsystemFailed) != 0) {
                                    if (Number.compareTo(VB.ErrorConstants.sckNetworkUnreachable) != 0) {
                                       if (Number.compareTo(VB.ErrorConstants.sckNetReset) != 0) {
                                          if (Number.compareTo(VB.ErrorConstants.sckConnectAborted) != 0) {
                                             if (Number.compareTo(VB.ErrorConstants.sckConnectionReset) != 0) {
                                                if (Number.compareTo(VB.ErrorConstants.sckNoBufferSpace) != 0) {
                                                   if (Number.compareTo(VB.ErrorConstants.sckAlreadyConnected) != 0) {
                                                      if (Number.compareTo(VB.ErrorConstants.sckNotConnected) != 0) {
                                                         if (Number.compareTo(VB.ErrorConstants.sckSocketShutdown) != 0) {
                                                            if (Number.compareTo(VB.ErrorConstants.sckTimedout) != 0) {
                                                               if (Number.compareTo(VB.ErrorConstants.sckConnectionRefused) != 0) {
                                                                  if (Number.compareTo(VB.ErrorConstants.sckNotInitialized) != 0) {
                                                                     if (Number.compareTo(VB.ErrorConstants.sckHostNotFound) != 0) {
                                                                        if (Number.compareTo(VB.ErrorConstants.sckHostNotFoundTryAgain) != 0) {
                                                                           if (Number.compareTo(VB.ErrorConstants.sckNonRecoverableError) != 0) {
                                                                              if (Number.compareTo(VB.ErrorConstants.sckNoData) != 0) {
                                                                                 if (Number.compareTo(VB.ErrorConstants.sckBadState) != 0) {
                                                                                    if (Number.compareTo(VB.ErrorConstants.sckUnsupported) != 0) {
                                                                                       if (Number.compareTo(VB.ErrorConstants.sckInvalidOp) != 0) {
                                                                                          if (Number.compareTo(VB.ErrorConstants.sckOutOfRange) != 0) {
                                                                                             if (Number.compareTo(VB.ErrorConstants.sckWrongProtocol) != 0) {
                                                                                                Description = "Unknown";
                                                                                             } else {
                                                                                                Description = "WrongProtocol";
                                                                                             }
                                                                                          } else {
                                                                                             Description = "OutOfRange";
                                                                                          }
                                                                                       } else {
                                                                                          Description = "InvalidOp";
                                                                                       }
                                                                                    } else {
                                                                                       Description = "Unsupported";
                                                                                    }
                                                                                 } else {
                                                                                    Description = "BadState";
                                                                                 }
                                                                              } else {
                                                                                 Description = "NoData";
                                                                              }
                                                                           } else {
                                                                              Description = "NonRecoverableError";
                                                                           }
                                                                        } else {
                                                                           Description = "HostNotFoundTryAgain";
                                                                        }
                                                                     } else {
                                                                        Description = "HostNotFound";
                                                                     }
                                                                  } else {
                                                                     Description = "NotInitialized";
                                                                  }
                                                               } else {
                                                                  Description = "ConnectionRefused";
                                                               }
                                                            } else {
                                                               Description = "Timedout";
                                                            }
                                                         } else {
                                                            Description = "SocketShutdown";
                                                         }
                                                      } else {
                                                         Description = "NotConnected";
                                                      }
                                                   } else {
                                                      Description = "AlreadyConnected";
                                                   }
                                                } else {
                                                   Description = "NoBufferSpace";
                                                }
                                             } else {
                                                Description = "ConnectionReset";
                                             }
                                          } else {
                                             Description = "ConnectAborted";
                                          }
                                       } else {
                                          Description = "NetReset";
                                       }
                                    } else {
                                       Description = "NetworkUnreachable";
                                    }
                                 } else {
                                    Description = "NetworkSubsystemFailed";
                                 }
                              } else {
                                 Description = "AddressNotAvailable";
                              }
                           } else {
                              Description = "AddressInUse";
                           }
                        } else {
                           Description = "PortNotSupported";
                        }
                     } else {
                        Description = "MsgTooBig";
                     }
                  } else {
                     Description = "NotSocket";
                  }
               } else {
                  Description = "AlreadyComplete";
               }
            } else {
               Description = "InProgress";
            }
         } else {
            Description = "OutOfMemory";
         }

         OnError(Number, Strings.StrCat("[Socket] Error: ", Description));
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void OnError(VB.ErrorConstants Number, String Description) {
      Throwable Err = null;

      try {
         myState = VB.StateConstants.sckError;
         _Error(Number, Description);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   public Winsock() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
      mySocket = null;
      myServer = new VB.WinsockServer(this);
      myRemoteHost = "";
      myRemotePort = 0L;
      myLocalHost = "";
      myLocalPort = 0L;
      myProtocol = new VB.ProtocolConstants();
      myBlockSize = 0L;
      myState = VB.StateConstants.sckClosed;
   }
}
