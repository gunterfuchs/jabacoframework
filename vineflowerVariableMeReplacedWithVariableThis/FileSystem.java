package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Constants;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayByte;
import VBA.VBArrayObject;
import VBA.VBMsgBoxResult;
import VBA.VBMsgBoxStyle;
import VBA.VBVariant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

public class FileSystem {
   private static VBArrayObject myFHList = new VBArray();
   private static int myCurIndex = 0;
   private static VB.VBFileHandler myCurFHnd = null;
   private static int myFilePos = 1;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int FreeFile() {
      int FreeFile = 0;
      Throwable Err = null;
      VBVariant Nohting = new VBVariant();
      int i = 1;

      label143: {
         Throwable var10000;
         while (true) {
            try {
               ;
            } catch (Throwable var15) {
               var10000 = var15;
               boolean var10001 = false;
               break;
            }

            boolean var17 = VBVariant.valueOf((VB.VBFileHandler)myFHList.valueOfObj(i)).compareTo(Nohting) != 0;

            try {
               if (!var17) {
                  myCurIndex = i;
                  FreeFile = myCurIndex;
                  return FreeFile;
               }
            } finally {
               break label143;
            }

            try {
               if (++i > 255) {
                  throw new IOException();
               }
            } catch (Throwable var14) {
               var10000 = var14;
               boolean var18 = false;
               break;
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
      return FreeFile;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void SetCurFileHandler(int FileNr) {
      Throwable Err = null;

      try {
         if (FileNr > 255) {
            throw new ArrayIndexOutOfBoundsException();
         }

         if (FileNr > 512) {
            throw new ArrayIndexOutOfBoundsException();
         }

         if (myCurIndex != FileNr) {
            myCurIndex = FileNr;
            myCurFHnd = (VB.VBFileHandler)myFHList.valueOfObj(myCurIndex);
            if (myCurFHnd == null) {
               throw new IllegalArgumentException();
            }
         }
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.VBFileHandler Open(String Path) {
      VB.VBFileHandler Open = null;
      Throwable Err = null;

      try {
         Open = Open(Path, VB.VBFileMode.Random);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return Open;
      }

      return Open;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.VBFileHandler Open(String Path, VB.VBFileMode Mode) {
      VB.VBFileHandler Open = null;
      Throwable Err = null;

      try {
         Open = Open(Path, Mode, VB.VBFileAccess.ReadAndWrite);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return Open;
      }

      return Open;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.VBFileHandler Open(String Path, VB.VBFileMode Mode, VB.VBFileAccess Access) {
      VB.VBFileHandler Open = null;
      Throwable Err = null;

      try {
         Open = Open(Path, Mode, Access, VB.VBFileLock.Shared);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return Open;
      }

      return Open;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.VBFileHandler Open(String Path, VB.VBFileMode Mode, VB.VBFileAccess Access, VB.VBFileLock Lock) {
      VB.VBFileHandler Open = null;
      Throwable Err = null;
      VB.VBFileHandler tmpHandler = new VB.VBFileHandler();

      try {
         tmpHandler.$Mode(Mode);
         tmpHandler.$Access(Access);
         tmpHandler.$Lock(Lock);
         tmpHandler.$Filename(Path);
         Open = tmpHandler;
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return Open;
      }

      return Open;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Open(String Path, VB.VBFileMode Mode, int FileNr) {
      Throwable Err = null;

      try {
         Open(Path, Mode, VB.VBFileAccess.ReadAndWrite, VB.VBFileLock.Shared, FileNr);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Open(String Path, VB.VBFileMode Mode, VB.VBFileAccess Access, int FileNr) {
      Throwable Err = null;

      try {
         Open(Path, Mode, Access, VB.VBFileLock.Shared, FileNr);
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Open(String Path, VB.VBFileMode Mode, VB.VBFileAccess Access, VB.VBFileLock Lock, int FileNr) {
      Throwable Err = null;

      try {
         if (FileNr > 255) {
            throw new IOException();
         }

         if (FileNr > 512) {
            throw new IOException();
         }

         myFHList.setValueObj(FileNr, Open(Path, Mode, Access, Lock));
         SetCurFileHandler(FileNr);
      } catch (Throwable var8) {
         Interaction.MsgBox(var8);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean EOF(VB.VBFileHandler Handler) {
      boolean EOF = false;
      Throwable Err = null;

      try {
         if (Handler != null) {
            EOF = Handler.$EOF();
         } else {
            EOF = true;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return EOF;
      }

      return EOF;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean EOF(int FileNr) {
      boolean EOF = false;
      Throwable Err = null;

      try {
         SetCurFileHandler(FileNr);
         EOF = myCurFHnd.$EOF();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return EOF;
      }

      return EOF;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.VBFileHandler Write(VB.VBFileHandler Handler, String Text) {
      VB.VBFileHandler Write = null;
      Throwable Err = null;

      try {
         if (Handler != null) {
            Put(Handler, Text, myFilePos);
            myFilePos = myFilePos + Strings.Len(Text);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return (VB.VBFileHandler)Write;
      }

      return (VB.VBFileHandler)Write;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Write(int FileNr, String Text) {
      Throwable Err = null;

      try {
         SetCurFileHandler(FileNr);
         Put(myCurFHnd, Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.Chr(34), Text), Strings.Chr(34)), Constants.vbCrLf), myFilePos);
         myFilePos = myFilePos + Strings.Len(Text) + 4;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Write(int FileNr, String Text, VBVariant nx) {
      Throwable Err = null;

      try {
         SetCurFileHandler(FileNr);
         Put(myCurFHnd, Strings.StrCat(Strings.StrCat(Strings.Chr(34), Text), Strings.Chr(34)), myFilePos);
         myFilePos = myFilePos + Strings.Len(Text) + 2;
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.VBFileHandler Append(VB.VBFileHandler Handler, String Text) {
      VB.VBFileHandler Append = null;
      Throwable Err = null;

      try {
         if (Handler != null) {
            Handler.appendString(Text);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return (VB.VBFileHandler)Append;
      }

      return (VB.VBFileHandler)Append;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.VBFileHandler Put(VB.VBFileHandler Handler, String Text, int Pos) {
      VB.VBFileHandler Put = null;
      Throwable Err = null;

      try {
         if (Handler != null) {
            Handler.putString(Text, Pos);
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return (VB.VBFileHandler)Put;
      }

      return (VB.VBFileHandler)Put;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Get(VBVariant FileNr, VBVariant VBTypeClass) {
      Throwable Err = null;

      try {
         SetCurFileHandler(FileNr.intValue());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Put(VBVariant FileNr, VBVariant VBTypeClass) {
      Throwable Err = null;

      try {
         SetCurFileHandler(FileNr.intValue());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String ReadLine(VB.VBFileHandler Handler) {
      String ReadLine = "";
      Throwable Err = null;

      try {
         if (Handler != null) {
            ReadLine = Handler.readLine();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return ReadLine;
      }

      return ReadLine;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Print(int FileNr, String Text) {
      Throwable Err = null;

      try {
         SetCurFileHandler(FileNr);
         Put(myCurFHnd, Strings.StrCat(Text, Constants.vbCrLf), myFilePos);
         myFilePos = myFilePos + Strings.Len(Text) + 2;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Print(int FileNr, String Text, VBVariant nx) {
      Throwable Err = null;

      try {
         SetCurFileHandler(FileNr);
         Put(myCurFHnd, Text, myFilePos);
         myFilePos = myFilePos + Strings.Len(Text);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Line_Input(int FileNr, StringBuffer sBuff) {
      Throwable Err = null;

      try {
         SetCurFileHandler(FileNr);
         sBuff.setLength(0);
         sBuff.append(myCurFHnd.readLine());
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean Close(VB.VBFileHandler Handler) {
      boolean Close = false;
      Throwable Err = null;

      try {
         if (Handler != null) {
            Handler.close();
            myFilePos = 1;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return Close;
      }

      return Close;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void Close(int FileNr) {
      Throwable Err = null;

      try {
         SetCurFileHandler(FileNr);
         Close(myCurFHnd);
         myCurFHnd = null;
         myFHList.setValueObj(myCurIndex, null);
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean FileExists(String Path) {
      boolean FileExists = false;
      Throwable Err = null;
      VB.VBFileHandler tmpHandler = new VB.VBFileHandler();

      try {
         tmpHandler.$Filename(Path);
         FileExists = tmpHandler.$exists();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return FileExists;
      }

      return FileExists;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean Kill(String Path) {
      boolean Kill = false;
      Throwable Err = null;
      VB.VBFileHandler tmpHandler = new VB.VBFileHandler();

      try {
         tmpHandler.$Filename(Path);
         Kill = tmpHandler.delete();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return Kill;
      }

      return Kill;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static long FileLen(String Path) {
      long FileLen = 0L;
      Throwable Err = null;
      VB.VBFileHandler tmpHandler = new VB.VBFileHandler();

      try {
         tmpHandler.$Filename(Path);
         FileLen = tmpHandler.$length();
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return FileLen;
      }

      return FileLen;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean FileCopy(String Source, String Destination) {
      boolean FileCopy = false;
      Throwable Err = null;
      String Parent = null;
      File dir = null;
      File fromFile = new File(Source);
      File toFile = new File(Destination);

      label1106: {
         label1100: {
            Throwable var10000;
            label1099: {
               label1107: {
                  try {
                     if (!fromFile.exists()) {
                        Interaction.MsgBox(
                           Strings.StrCat(
                              Strings.StrCat(Strings.StrCat(Strings.StrCat("Source file does not exist: ", Constants.vbNewLine), Strings.Chr(34)), Source),
                              Strings.Chr(34)
                           ),
                           new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                           "FileCopy"
                        );
                        return FileCopy;
                     }

                     if (!fromFile.isFile()) {
                        Interaction.MsgBox(
                           Strings.StrCat(
                              Strings.StrCat(Strings.StrCat(Strings.StrCat("Can not copy directory: ", Constants.vbNewLine), Strings.Chr(34)), Source),
                              Strings.Chr(34)
                           ),
                           new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                           "FileCopy"
                        );
                        return FileCopy;
                     }

                     if (!fromFile.canRead()) {
                        Interaction.MsgBox(
                           Strings.StrCat(
                              Strings.StrCat(Strings.StrCat(Strings.StrCat("Source file is unreadable: ", Constants.vbNewLine), Strings.Chr(34)), Source),
                              Strings.Chr(34)
                           ),
                           new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                           "FileCopy"
                        );
                        return FileCopy;
                     }

                     if (toFile.isDirectory()) {
                        toFile = new File(toFile, fromFile.getName());
                     }

                     if (toFile.exists()) {
                        if (!toFile.canWrite()) {
                           Interaction.MsgBox(
                              Strings.StrCat(
                                 Strings.StrCat(
                                    Strings.StrCat(Strings.StrCat("Destination file is unwriteable: ", Constants.vbNewLine), Strings.Chr(34)), Destination
                                 ),
                                 Strings.Chr(34)
                              ),
                              new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                              "FileCopy"
                           );
                           return FileCopy;
                        }

                        if (Interaction.MsgBox(
                                 Strings.StrCat(
                                    Strings.StrCat(
                                       Strings.StrCat(Strings.StrCat("File already exists. Overwrite?", Constants.vbNewLine), Strings.Chr(34)),
                                       toFile.getName()
                                    ),
                                    Strings.Chr(34)
                                 ),
                                 new VBMsgBoxStyle(VBMsgBoxStyle.vbQuestion.intValue() | VBMsgBoxStyle.vbOKCancel.intValue()),
                                 "FileCopy"
                              )
                              .compareTo(VBMsgBoxResult.vbOK)
                           != 0) {
                           Interaction.MsgBox(
                              "Existing file was not overwritten!",
                              new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                              "FileCopy"
                           );
                           return FileCopy;
                        }
                        break label1107;
                     }
                  } finally {
                     break label1106;
                  }

                  Parent = toFile.getParent();

                  try {
                     if (Parent == null) {
                        Parent = System.getProperty("user.dir");
                     }
                  } finally {
                     break label1106;
                  }

                  dir = new File((String)Parent);

                  try {
                     if (!dir.exists()) {
                        dir.mkdirs();
                     }

                     if (dir.isFile()) {
                        Interaction.MsgBox(
                           Strings.StrCat(
                              Strings.StrCat(
                                 Strings.StrCat(Strings.StrCat("Destination is not a directory: ", Constants.vbNewLine), Strings.Chr(34)), (String)Parent
                              ),
                              Strings.Chr(34)
                           ),
                           new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                           "FileCopy"
                        );
                        return FileCopy;
                     }

                     if (!dir.canWrite()) {
                        Interaction.MsgBox(
                           Strings.StrCat(
                              Strings.StrCat(
                                 Strings.StrCat(Strings.StrCat("Destination directory is unwriteable: ", Constants.vbNewLine), Strings.Chr(34)), (String)Parent
                              ),
                              Strings.Chr(34)
                           ),
                           new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                           "FileCopy"
                        );
                        return FileCopy;
                     }
                  } catch (Throwable var100) {
                     var10000 = var100;
                     boolean var10001 = false;
                     break label1099;
                  }
               }

               label1078:
               try {
                  break label1100;
               } catch (Throwable var99) {
                  var10000 = var99;
                  boolean var108 = false;
                  break label1078;
               }
            }

            Err = var10000;
            break label1106;
         }

         FileInputStream fisFrom = new FileInputStream(fromFile);
         FileOutputStream fosTo = new FileOutputStream(toFile);
         VBArrayByte buffer = new VBArray();

         try {
            buffer.setBound(0, 4096, false);
         } finally {
            break label1106;
         }

         int bytesRead = 0;

         Throwable var106;
         label1056: {
            try {
               bytesRead = fisFrom.read(buffer.byteArray());
            } catch (Throwable var97) {
               var106 = var97;
               boolean var109 = false;
               break label1056;
            }

            while (true) {
               try {
                  ;
               } catch (Throwable var95) {
                  var106 = var95;
                  boolean var110 = false;
                  break;
               }

               boolean var107 = bytesRead != -1 * 1;

               try {
                  if (!var107) {
                     return FileCopy;
                  }
               } catch (Throwable var96) {
                  var106 = var96;
                  boolean var111 = false;
                  break;
               }

               try {
                  fosTo.write(buffer.byteArray(), 0, bytesRead);
                  bytesRead = fisFrom.read(buffer.byteArray());
               } catch (Throwable var94) {
                  var106 = var94;
                  boolean var112 = false;
                  break;
               }
            }
         }

         Err = var106;
      }

      Interaction.MsgBox(Err);
      return FileCopy;
   }

   public static boolean DirCopy(String Source, String Destination) {
      boolean DirCopy = false;
      Throwable Err = null;
      Iterator h11 = null;
      String tmpString = Strings.StrCat(Source, System.getProperty("file.separator"));

      label409: {
         try {
            if (Strings.Len(Destination) > Strings.Len(tmpString) && Strings.Left(Destination, Strings.Len(tmpString)).equals(tmpString)) {
               Interaction.MsgBox(
                  Strings.StrCat(
                     Strings.StrCat(
                        Strings.StrCat(
                           Strings.StrCat(
                              Strings.StrCat(
                                 Strings.StrCat(
                                    Strings.StrCat(
                                       Strings.StrCat(
                                          Strings.StrCat(
                                             Strings.StrCat(
                                                Strings.StrCat(
                                                   Strings.StrCat("This is not allowed. It ends with recursive, endless copying!", Constants.vbNewLine),
                                                   "Destination directory:"
                                                ),
                                                Constants.vbNewLine
                                             ),
                                             Strings.Chr(34)
                                          ),
                                          Destination
                                       ),
                                       Strings.Chr(34)
                                    ),
                                    Constants.vbNewLine
                                 ),
                                 "is a subdirectory of source:"
                              ),
                              Constants.vbNewLine
                           ),
                           Strings.Chr(34)
                        ),
                        Source
                     ),
                     Strings.Chr(34)
                  ),
                  new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                  "DirCopy"
               );
            }
         } finally {
            break label409;
         }

         File SourceFile = new File(Source);
         File DestinationFile = new File(Destination);

         try {
            DirCopy = true;
            if (!SourceFile.exists()) {
               Interaction.MsgBox(
                  Strings.StrCat(
                     Strings.StrCat(Strings.StrCat(Strings.StrCat("Source directory does not exist:", Constants.vbNewLine), Strings.Chr(34)), Source),
                     Strings.Chr(34)
                  ),
                  new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                  "DirCopy"
               );
               return false;
            }

            if (!SourceFile.isDirectory()) {
               Interaction.MsgBox(
                  Strings.StrCat(
                     Strings.StrCat(Strings.StrCat(Strings.StrCat("Source directory is not a directory:", Constants.vbNewLine), Strings.Chr(34)), Source),
                     Strings.Chr(34)
                  ),
                  new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                  "DirCopy"
               );
               return false;
            }

            if (!DestinationFile.exists()) {
               MkDir(Destination);
            }

            if (!DestinationFile.isDirectory()) {
               Interaction.MsgBox(
                  Strings.StrCat(
                     Strings.StrCat(
                        Strings.StrCat(Strings.StrCat("Destination directory is not a directory:", Constants.vbNewLine), Strings.Chr(34)), Destination
                     ),
                     Strings.Chr(34)
                  ),
                  new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()),
                  "DirCopy"
               );
               return false;
            }
         } finally {
            break label409;
         }

         new VBArray();

         VBArray childFolders;
         try {
            childFolders = VBArray.createVBArray(SourceFile.listFiles());
         } finally {
            break label409;
         }

         File item = null;

         label379:
         try {
            h11 = childFolders.iterator();

            while (h11.hasNext()) {
               item = (File)VBVariant.valueOf(h11.next()).toObject();
               if (!item.isFile()) {
                  if (item.isDirectory()) {
                     DirCopy(
                        Strings.StrCat(Strings.StrCat(Source, System.getProperty("file.separator")), item.getName()),
                        Strings.StrCat(Strings.StrCat(Destination, System.getProperty("file.separator")), item.getName())
                     );
                  }
               } else {
                  FileCopy(
                     Strings.StrCat(Strings.StrCat(Source, System.getProperty("file.separator")), item.getName()),
                     Strings.StrCat(Strings.StrCat(Destination, System.getProperty("file.separator")), item.getName())
                  );
               }
            }

            return DirCopy;
         } finally {
            break label379;
         }
      }

      Interaction.MsgBox((Throwable)Err);
      return DirCopy;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Date FileDateTime(String path) {
      Date var10000 = new Date();
      var10000.setTime((long)0);
      Date FileDateTime = var10000;
      Throwable Err = null;
      File file = new File(path);
      long modifiedTime = file.lastModified();
      Date myDate = new Date(modifiedTime);

      try {
         FileDateTime = myDate;
      } catch (Throwable var9) {
         Interaction.MsgBox(var9);
         return FileDateTime;
      }

      return FileDateTime;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String CurDir() {
      String CurDir = "";
      Throwable Err = null;
      String tmpString = "";

      try {
         tmpString = System.getProperties().getProperty("user.dir");
         if (Strings.StrComp(Strings.Right(tmpString, 1), System.getProperty("file.separator")) == 0) {
            tmpString = Strings.Left(tmpString, Strings.Len(tmpString) - 1);
         }

         if (Strings.InStr(tmpString, System.getProperty("file.separator")) == 0) {
            tmpString = Strings.StrCat(tmpString, System.getProperty("file.separator"));
         }

         CurDir = tmpString;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return CurDir;
      }

      return CurDir;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String TmpDir() {
      String TmpDir = "";
      Throwable Err = null;
      String tmpString = "";

      try {
         tmpString = System.getProperties().getProperty("java.io.tmpdir");
         if (Strings.StrComp(Strings.Right(tmpString, 1), System.getProperty("file.separator")) == 0) {
            tmpString = Strings.Left(tmpString, Strings.Len(tmpString) - 1);
         }

         if (Strings.InStr(tmpString, System.getProperty("file.separator")) == 0) {
            tmpString = Strings.StrCat(tmpString, System.getProperty("file.separator"));
         }

         TmpDir = tmpString;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return TmpDir;
      }

      return TmpDir;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String TempDir() {
      String TempDir = "";
      Throwable Err = null;

      try {
         TempDir = TmpDir();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return TempDir;
      }

      return TempDir;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String HomeDir() {
      String HomeDir = "";
      Throwable Err = null;
      String tmpString = "";

      try {
         tmpString = System.getProperties().getProperty("user.home");
         if (Strings.StrComp(Strings.Right(tmpString, 1), System.getProperty("file.separator")) == 0) {
            tmpString = Strings.Left(tmpString, Strings.Len(tmpString) - 1);
         }

         if (Strings.InStr(tmpString, System.getProperty("file.separator")) == 0) {
            tmpString = Strings.StrCat(tmpString, System.getProperty("file.separator"));
         }

         HomeDir = tmpString;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return HomeDir;
      }

      return HomeDir;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String JavaDir() {
      String JavaDir = "";
      Throwable Err = null;
      String tmpString = "";

      try {
         tmpString = System.getProperties().getProperty("java.home");
         if (Strings.StrComp(Strings.Right(tmpString, 1), System.getProperty("file.separator")) == 0) {
            tmpString = Strings.Left(tmpString, Strings.Len(tmpString) - 1);
         }

         if (Strings.InStr(tmpString, System.getProperty("file.separator")) == 0) {
            tmpString = Strings.StrCat(tmpString, System.getProperty("file.separator"));
         }

         JavaDir = tmpString;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return JavaDir;
      }

      return JavaDir;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void MkDir(String aPath) {
      Throwable Err = null;
      File mydir = new File(aPath);

      try {
         mydir.mkdirs();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void RmDir(String aPath) {
      Throwable Err = null;
      File mydir = new File(aPath);

      try {
         if (mydir.isDirectory()) {
            mydir.delete();
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean DirExists(String Path) {
      boolean DirExists = false;
      Throwable Err = null;
      File mydir = new File(Path);

      try {
         DirExists = mydir.isDirectory();
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return DirExists;
      }

      return DirExists;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String Dir(String PathName, VB.VbFileAttribute Attributes) {
      String Dir = "";
      Throwable Err = null;
      File mydir = new File(PathName);

      try {
         if (!((Attributes.intValue() & VB.VbFileAttribute.vbDirectory.intValue()) == VB.VbFileAttribute.vbDirectory.intValue() & mydir.isDirectory())) {
            if (Attributes.compareTo(VB.VbFileAttribute.vbNormal) == 0 & mydir.isFile()) {
               Dir = mydir.getCanonicalFile().toString();
               if ((Attributes.intValue() & VB.VbFileAttribute.vbHidden.intValue()) == VB.VbFileAttribute.vbHidden.intValue() && !mydir.isHidden()) {
                  Dir = "";
               }
            }
         } else {
            Dir = mydir.getParent();
            if ((Attributes.intValue() & VB.VbFileAttribute.vbHidden.intValue()) == VB.VbFileAttribute.vbHidden.intValue() && !mydir.isHidden()) {
               Dir = "";
            }
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return Dir;
      }

      return Dir;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static VB.VbFileAttribute GetAttr(String PathName) {
      VB.VbFileAttribute GetAttr = new VB.VbFileAttribute();
      Throwable Err = null;
      File mydir = new File(PathName);

      try {
         GetAttr = VB.VbFileAttribute.vbNormal;
         if (mydir.isDirectory()) {
            GetAttr = new VB.VbFileAttribute(GetAttr.intValue() | VB.VbFileAttribute.vbDirectory.intValue());
         }

         if (mydir.isHidden()) {
            GetAttr = new VB.VbFileAttribute(GetAttr.intValue() | VB.VbFileAttribute.vbHidden.intValue());
         }

         if (mydir.canRead() & !mydir.canWrite()) {
            GetAttr = new VB.VbFileAttribute(GetAttr.intValue() | VB.VbFileAttribute.vbReadOnly.intValue());
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return GetAttr;
      }

      return GetAttr;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void SetAttr(String PathName, VB.VbFileAttribute Attributes) {
      Throwable Err = null;
      File mydir = new File(PathName);

      try {
         if (Attributes.compareTo(VB.VbFileAttribute.vbNormal) != 0) {
            if ((Attributes.intValue() & VB.VbFileAttribute.vbReadOnly.intValue()) == VB.VbFileAttribute.vbReadOnly.intValue()) {
               mydir.setReadOnly();
            }
         } else {
            mydir.setWritable(true);
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return;
      }
   }

   public static String Dir(String PathName) {
      return Dir(PathName, VB.VbFileAttribute.vbNormal);
   }

   static {
      myFHList.setBound(0, 255, false);
   }
}
