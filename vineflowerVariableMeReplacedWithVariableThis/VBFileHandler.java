package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Constants;
import VBA.Conversion;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayByte;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class VBFileHandler implements VB.IJabacoClass {
   private File myFile;
   private FileInputStream myInput;
   private BufferedReader myInputReader;
   private FileOutputStream myOutput;
   private String myInputReadLineMem;
   private String myFilename;
   private VB.VBFileMode myMode;
   private VB.VBFileAccess myAccess;
   private VB.VBFileLock myLock;

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void refresh() {
      Throwable Err = null;
      boolean bAppend = false;

      try {
         myFile = new File(myFilename);
         if (myMode.compareTo(VB.VBFileMode.Input) == 0 | myMode.compareTo(VB.VBFileMode.Random) == 0 && $exists()) {
            myInput = new FileInputStream(myFile);
            myInputReader = new BufferedReader(new InputStreamReader(myInput));
            if (myLock.compareTo(VB.VBFileLock.LockReadAndWrite) == 0 | myLock.compareTo(VB.VBFileLock.LockRead) == 0) {
               myInput.getChannel().lock();
            }
         }

         if (myMode.compareTo(VB.VBFileMode.Output) == 0 | myMode.compareTo(VB.VBFileMode.Append) == 0 | myMode.compareTo(VB.VBFileMode.Random) == 0) {
            if (!(myMode.compareTo(VB.VBFileMode.Random) == 0 | myMode.compareTo(VB.VBFileMode.Append) == 0)) {
               bAppend = false;
            } else {
               bAppend = true;
            }

            myOutput = new FileOutputStream(myFile, bAppend);
            if (myMode.compareTo(VB.VBFileMode.Append) == 0) {
               myOutput.getChannel().position($length());
            }

            if (myLock.compareTo(VB.VBFileLock.LockReadAndWrite) == 0 | myLock.compareTo(VB.VBFileLock.LockWrite) == 0) {
               myOutput.getChannel().lock();
            }
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public FileInputStream $InputStream() {
      FileInputStream $InputStream = null;
      Throwable Err = null;

      try {
         $InputStream = myInput;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $InputStream;
      }

      return $InputStream;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public FileOutputStream $OutputStream() {
      FileOutputStream $OutputStream = null;
      Throwable Err = null;

      try {
         $OutputStream = myOutput;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $OutputStream;
      }

      return $OutputStream;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBFileMode $Mode() {
      VB.VBFileMode $Mode = new VB.VBFileMode();
      Throwable Err = null;

      try {
         $Mode = myMode;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Mode;
      }

      return $Mode;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Mode(VB.VBFileMode v) {
      Throwable Err = null;

      try {
         myMode = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBFileAccess $Access() {
      VB.VBFileAccess $Access = new VB.VBFileAccess();
      Throwable Err = null;

      try {
         $Access = myAccess;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Access;
      }

      return $Access;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Access(VB.VBFileAccess v) {
      Throwable Err = null;

      try {
         myAccess = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public VB.VBFileLock $Lock() {
      VB.VBFileLock $Lock = new VB.VBFileLock();
      Throwable Err = null;

      try {
         $Lock = myLock;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Lock;
      }

      return $Lock;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Lock(VB.VBFileLock v) {
      Throwable Err = null;

      try {
         myLock = v;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Filename() {
      String $Filename = "";
      Throwable Err = null;

      try {
         $Filename = myFilename;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Filename;
      }

      return $Filename;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Filename(String s) {
      Throwable Err = null;

      try {
         myFilename = s;
         refresh();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean writeString(String s) {
      boolean writeString = false;
      Throwable Err = null;

      try {
         if (myOutput != null) {
            if (myMode.compareTo(VB.VBFileMode.Append) != 0) {
               myOutput.getChannel().truncate((long)0);
            }

            myOutput.write(Strings.StringToArray(s));
            writeString = true;
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return writeString;
      }

      return writeString;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean appendString(String s) {
      boolean appendString = false;
      Throwable Err = null;

      try {
         if (myOutput != null) {
            if (myMode.compareTo(VB.VBFileMode.Append) != 0) {
               appendString = writeString(s);
            } else {
               myOutput.write(Strings.StringToArray(s));
            }

            appendString = true;
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return appendString;
      }

      return appendString;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean putString(String s, int pos) {
      boolean putString = false;
      Throwable Err = null;

      try {
         if (myOutput != null) {
            if (myMode.compareTo(VB.VBFileMode.Append) != 0) {
               myOutput.getChannel().position((long)(pos - 1));
               myOutput.write(Strings.StringToArray(s));
               putString = true;
            }
         }
      } catch (Throwable var7) {
         Interaction.MsgBox(var7);
         return putString;
      }

      return putString;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $EOF() {
      boolean $EOF = false;
      Throwable Err = null;

      try {
         if (myInputReader != null) {
            if (Strings.StrComp(myInputReadLineMem, null) == 0) {
               myInputReadLineMem = myInputReader.readLine();
               if (Strings.StrComp(myInputReadLineMem, null) != 0) {
                  $EOF = false;
               } else {
                  $EOF = true;
               }
            } else {
               $EOF = false;
            }
         } else {
            $EOF = true;
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $EOF;
      }

      return $EOF;
   }

   public String read(int offset, int length) {
      String read = "";
      Throwable Err = null;

      label182: {
         try {
            if (myInput == null) {
               return read;
            }
         } finally {
            break label182;
         }

         FileInputStream myOffsetReader = new FileInputStream(myFile);
         VBArrayByte tmp = new VBArray();
         tmp.setBound(0, length - 1, false);

         try {
            myOffsetReader.skip((long)offset);
         } finally {
            break label182;
         }

         int retLen = myOffsetReader.read(tmp.byteArray(), 0, length);

         label164:
         try {
            if (retLen >= 0) {
               if (retLen != length) {
                  tmp.setBound(0, retLen - 1, true);
               }

               read = tmp.toString();
            } else {
               read = Constants.vbNullString;
            }

            myOffsetReader.close();
            return read;
         } finally {
            break label164;
         }
      }

      Interaction.MsgBox((Throwable)Err);
      return read;
   }

   public String readAll() {
      String readAll = "";
      Throwable Err = null;

      label87: {
         try {
            if (myInput == null) {
               return readAll;
            }
         } finally {
            break label87;
         }

         BufferedReader myBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));

         label73:
         try {
            readAll = Conversion.CStr(myBufferedReader);
            myBufferedReader.close();
            return readAll;
         } finally {
            break label73;
         }
      }

      Interaction.MsgBox((Throwable)Err);
      return readAll;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String readLine() {
      String readLine = "";
      Throwable Err = null;
      String ret = "";

      try {
         if (myInput != null) {
            if (myInputReader != null) {
               if (Strings.StrComp(myInputReadLineMem, null) != 0) {
                  ret = myInputReadLineMem;
                  myInputReadLineMem = null;
               } else {
                  ret = myInputReader.readLine();
               }

               if (Strings.StrComp(ret, null) != 0) {
                  readLine = ret;
               } else {
                  readLine = "";
               }
            }
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return readLine;
      }

      return readLine;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean close() {
      boolean close = false;
      Throwable Err = null;

      try {
         if (myInput != null) {
            myInput.close();
         }

         if (myOutput != null) {
            myOutput.close();
         }

         if (myInputReader != null) {
            myInputReader.close();
         }

         myInput = null;
         myOutput = null;
         myInputReader = null;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return close;
      }

      return close;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean delete() {
      boolean delete = false;
      Throwable Err = null;

      try {
         delete = $Parent().delete();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return delete;
      }

      return delete;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $exists() {
      boolean $exists = false;
      Throwable Err = null;

      try {
         $exists = $Parent().exists();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $exists;
      }

      return $exists;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public long $length() {
      long $length = 0L;
      Throwable Err = null;

      try {
         if (!$exists()) {
            $length = (long)(-1 * 1);
         } else {
            $length = myFile.length();
         }
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return $length;
      }

      return $length;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public File $Parent() {
      File $Parent = null;
      Throwable Err = null;

      try {
         $Parent = myFile;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   public VBFileHandler() {
      initVars();
   }

   private void initVars() {
      myFile = null;
      myInput = null;
      myInputReader = null;
      myOutput = null;
      myInputReadLineMem = null;
      myFilename = "";
      myMode = new VB.VBFileMode();
      myAccess = new VB.VBFileAccess();
      myLock = new VB.VBFileLock();
   }
}
