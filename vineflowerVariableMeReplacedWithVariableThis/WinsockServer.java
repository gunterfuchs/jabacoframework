package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.SwingUtilities;

public class WinsockServer implements VB.IJabacoClass, Runnable {
   private boolean bWithGUI;
   private Thread myThread;
   private ServerSocket myServer;
   private VB.Winsock Owner;

   public void _Connect() {
   }

   public void _Close() {
   }

   public void _SendComplete() {
   }

   public void _SendProgress(long bytesSent, long bytesRemaining) {
   }

   public void _DataArrival(long bytesTotal) {
   }

   public void _ConnectionRequest(long requestID) {
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public WinsockServer(VB.Winsock RefOwner) {
      Throwable Err = null;
      super();
      initVars();

      try {
         Owner = RefOwner;
         myThread = new Thread(this);
         myThread.start();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void closeServer() {
      Throwable Err = null;

      try {
         if (myServer != null) {
            myServer.close();
         }

         myServer = null;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void startServer() {
      Throwable Err = null;

      try {
         bWithGUI = SwingUtilities.isEventDispatchThread();
         if (myServer != null) {
            myServer.close();
         }

         myServer = new ServerSocket((int)Owner.$LocalPort());
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void run() {
      Throwable Err = null;
      Socket tmpSocket = null;
      VB.WinsockServerRequest tmpRequest = null;

      while (true) {
         try {
            ;
         } finally {
            break;
         }

         boolean var10000 = true;

         label2858: {
            try {
               if (!var10000) {
                  break label2858;
               }
            } finally {
               break label2858;
            }

            try {
               ;
            } catch (Throwable var603) {
               boolean var10001 = false;
               break;
            }

            label2859: {
               label2866: {
                  label2834: {
                     try {
                        if (myServer != null) {
                           break label2866;
                        }
                     } catch (Throwable var601) {
                        boolean var605 = false;
                        break label2834;
                     }

                     label2831:
                     try {
                        ;
                     } catch (Throwable var600) {
                        boolean var606 = false;
                        break label2831;
                     }
                  }

                  try {
                     Thread.sleep((long)1);
                     break label2859;
                  } finally {
                     break label2859;
                  }
               }

               label2821:
               try {
                  ;
               } finally {
                  break label2821;
               }

               label2867: {
                  label2816: {
                     try {
                        if (!myServer.isBound()) {
                           break label2867;
                        }
                     } catch (Throwable var597) {
                        boolean var607 = false;
                        break label2816;
                     }

                     label2813:
                     try {
                        ;
                     } catch (Throwable var596) {
                        boolean var608 = false;
                        break label2813;
                     }
                  }

                  label2809:
                  try {
                     tmpSocket = myServer.accept();
                  } finally {
                     break label2809;
                  }

                  label2861: {
                     label2868: {
                        label2803: {
                           try {
                              if (tmpSocket == null) {
                                 break label2868;
                              }
                           } catch (Throwable var594) {
                              boolean var609 = false;
                              break label2803;
                           }

                           label2800:
                           try {
                              ;
                           } catch (Throwable var593) {
                              boolean var610 = false;
                              break label2800;
                           }
                        }

                        label2792: {
                           label2863: {
                              label2869: {
                                 try {
                                    if (!bWithGUI) {
                                       break label2869;
                                    }
                                 } catch (Throwable var592) {
                                    boolean var611 = false;
                                    break label2863;
                                 }

                                 try {
                                    break label2863;
                                 } catch (Throwable var591) {
                                    boolean var612 = false;
                                    break label2863;
                                 }
                              }

                              label2780:
                              try {
                                 ;
                              } finally {
                                 break label2780;
                              }

                              try {
                                 Owner.OnConnectionRequest(tmpSocket);
                                 break label2792;
                              } finally {
                                 break label2792;
                              }
                           }

                           label2778:
                           try {
                              new VB.WinsockServerRequest(Owner, tmpSocket);
                           } finally {
                              break label2778;
                           }
                        }

                        try {
                           break label2861;
                        } finally {
                           break label2861;
                        }
                     }

                     label2772:
                     try {
                        ;
                     } finally {
                        break label2772;
                     }

                     label2770:
                     try {
                        Thread.sleep((long)1);
                     } finally {
                        break label2770;
                     }
                  }

                  label2767:
                  try {
                     ;
                  } finally {
                     break label2767;
                  }
               }

               label2765:
               try {
                  ;
               } finally {
                  break label2765;
               }
            }

            try {
               continue;
            } finally {
               continue;
            }
         }

         try {
            break;
         } catch (Throwable var602) {
            boolean var613 = false;
            break;
         }
      }
   }

   private void initVars() {
      bWithGUI = false;
      myThread = new Thread(this);
      myServer = null;
      Owner = null;
   }
}
