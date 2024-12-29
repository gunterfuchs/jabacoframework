/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.VBFileAccess;
import VB.VBFileHandler;
import VB.VBFileLock;
import VB.VBFileMode;
import VB.VbFileAttribute;
import VBA.Constants;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
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
    private static int myCurIndex;
    private static VBFileHandler myCurFHnd;
    private static int myFilePos;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int FreeFile() {
        Throwable throwable2;
        Throwable Err;
        int FreeFile;
        block6: {
            FreeFile = 0;
            Err = null;
            VBVariant Nohting = new VBVariant();
            int i = 1;
            try {
                while (true) {
                    if (!(VBVariant.valueOf((VBFileHandler)myFHList.valueOfObj(i)).compareTo(Nohting) != 0)) {
                        myCurIndex = i;
                        return myCurIndex;
                    }
                    if (++i > 255) throw new IOException();
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (Throwable throwable2) {
            }
        }
        Object var2_4 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return FreeFile;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void SetCurFileHandler(int FileNr) {
        Throwable Err = null;
        try {
            if (FileNr > 255) throw new ArrayIndexOutOfBoundsException();
            if (FileNr > 512) throw new ArrayIndexOutOfBoundsException();
            if (myCurIndex == FileNr) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            myCurIndex = FileNr;
            myCurFHnd = (VBFileHandler)myFHList.valueOfObj(myCurIndex);
            if (myCurFHnd == null) throw new IllegalArgumentException();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VBFileHandler Open(String Path) {
        VBFileHandler Open = null;
        Throwable Err = null;
        try {
            return FileSystem.Open(Path, VBFileMode.Random);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Open;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VBFileHandler Open(String Path, VBFileMode Mode) {
        VBFileHandler Open = null;
        Throwable Err = null;
        try {
            return FileSystem.Open(Path, Mode, VBFileAccess.ReadAndWrite);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Open;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VBFileHandler Open(String Path, VBFileMode Mode, VBFileAccess Access) {
        VBFileHandler Open = null;
        Throwable Err = null;
        try {
            return FileSystem.Open(Path, Mode, Access, VBFileLock.Shared);
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Open;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VBFileHandler Open(String Path, VBFileMode Mode, VBFileAccess Access, VBFileLock Lock) {
        VBFileHandler Open = null;
        Throwable Err = null;
        VBFileHandler tmpHandler = new VBFileHandler();
        try {
            tmpHandler.$Mode(Mode);
            tmpHandler.$Access(Access);
            tmpHandler.$Lock(Lock);
            tmpHandler.$Filename(Path);
            return tmpHandler;
        }
        catch (Throwable throwable) {
            Object var6_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Open;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Open(String Path, VBFileMode Mode, int FileNr) {
        Throwable Err = null;
        try {
            FileSystem.Open(Path, Mode, VBFileAccess.ReadAndWrite, VBFileLock.Shared, FileNr);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Open(String Path, VBFileMode Mode, VBFileAccess Access, int FileNr) {
        Throwable Err = null;
        try {
            FileSystem.Open(Path, Mode, Access, VBFileLock.Shared, FileNr);
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Open(String Path, VBFileMode Mode, VBFileAccess Access, VBFileLock Lock, int FileNr) {
        Throwable Err = null;
        try {
            if (FileNr > 255) throw new IOException();
            if (FileNr > 512) throw new IOException();
            myFHList.setValueObj(FileNr, FileSystem.Open(Path, Mode, Access, Lock));
            FileSystem.SetCurFileHandler(FileNr);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean EOF(VBFileHandler Handler) {
        boolean EOF = false;
        Throwable Err = null;
        try {
            if (Handler == null) return true;
            boolean bl = false;
            if (!bl) return Handler.$EOF();
            return true;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return EOF;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean EOF(int FileNr) {
        boolean EOF = false;
        Throwable Err = null;
        try {
            FileSystem.SetCurFileHandler(FileNr);
            return myCurFHnd.$EOF();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return EOF;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VBFileHandler Write(VBFileHandler Handler, String Text) {
        VBFileHandler Write = null;
        Throwable Err = null;
        try {
            if (Handler == null) return Write;
            FileSystem.Put(Handler, Text, myFilePos);
            myFilePos += Strings.Len(Text);
            return Write;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Write;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Write(int FileNr, String Text) {
        Throwable Err = null;
        try {
            FileSystem.SetCurFileHandler(FileNr);
            FileSystem.Put(myCurFHnd, Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.Chr(34), Text), Strings.Chr(34)), Constants.vbCrLf), myFilePos);
            myFilePos = myFilePos + Strings.Len(Text) + 4;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Write(int FileNr, String Text, VBVariant nx) {
        Throwable Err = null;
        try {
            FileSystem.SetCurFileHandler(FileNr);
            FileSystem.Put(myCurFHnd, Strings.StrCat(Strings.StrCat(Strings.Chr(34), Text), Strings.Chr(34)), myFilePos);
            myFilePos = myFilePos + Strings.Len(Text) + 2;
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VBFileHandler Append(VBFileHandler Handler, String Text) {
        VBFileHandler Append = null;
        Throwable Err = null;
        try {
            if (Handler == null) return Append;
            Handler.appendString(Text);
            return Append;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Append;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VBFileHandler Put(VBFileHandler Handler, String Text, int Pos) {
        VBFileHandler Put = null;
        Throwable Err = null;
        try {
            if (Handler == null) return Put;
            Handler.putString(Text, Pos);
            return Put;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Put;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Get(VBVariant FileNr, VBVariant VBTypeClass2) {
        Throwable Err = null;
        try {
            FileSystem.SetCurFileHandler(FileNr.intValue());
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Put(VBVariant FileNr, VBVariant VBTypeClass2) {
        Throwable Err = null;
        try {
            FileSystem.SetCurFileHandler(FileNr.intValue());
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String ReadLine(VBFileHandler Handler) {
        String ReadLine = "";
        Throwable Err = null;
        try {
            if (Handler == null) return ReadLine;
            return Handler.readLine();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return ReadLine;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Print(int FileNr, String Text) {
        Throwable Err = null;
        try {
            FileSystem.SetCurFileHandler(FileNr);
            FileSystem.Put(myCurFHnd, Strings.StrCat(Text, Constants.vbCrLf), myFilePos);
            myFilePos = myFilePos + Strings.Len(Text) + 2;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Print(int FileNr, String Text, VBVariant nx) {
        Throwable Err = null;
        try {
            FileSystem.SetCurFileHandler(FileNr);
            FileSystem.Put(myCurFHnd, Text, myFilePos);
            myFilePos += Strings.Len(Text);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Line_Input(int FileNr, StringBuffer sBuff) {
        Throwable Err = null;
        try {
            FileSystem.SetCurFileHandler(FileNr);
            sBuff.setLength(0);
            sBuff.append(myCurFHnd.readLine());
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean Close(VBFileHandler Handler) {
        boolean Close = false;
        Throwable Err = null;
        try {
            if (Handler == null) return Close;
            Handler.close();
            myFilePos = 1;
            return Close;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Close;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Close(int FileNr) {
        Throwable Err = null;
        try {
            FileSystem.SetCurFileHandler(FileNr);
            FileSystem.Close(myCurFHnd);
            myCurFHnd = null;
            myFHList.setValueObj(myCurIndex, null);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean FileExists(String Path) {
        boolean FileExists = false;
        Throwable Err = null;
        VBFileHandler tmpHandler = new VBFileHandler();
        try {
            tmpHandler.$Filename(Path);
            return tmpHandler.$exists();
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return FileExists;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean Kill(String Path) {
        boolean Kill = false;
        Throwable Err = null;
        VBFileHandler tmpHandler = new VBFileHandler();
        try {
            tmpHandler.$Filename(Path);
            return tmpHandler.delete();
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Kill;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long FileLen(String Path) {
        long FileLen = 0L;
        Throwable Err = null;
        VBFileHandler tmpHandler = new VBFileHandler();
        try {
            tmpHandler.$Filename(Path);
            return tmpHandler.$length();
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return FileLen;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean FileCopy(String Source, String Destination) {
        Throwable throwable2;
        Throwable Err;
        boolean FileCopy;
        block23: {
            int bytesRead;
            VBArray buffer;
            FileOutputStream fosTo;
            FileInputStream fisFrom;
            block24: {
                File toFile;
                File fromFile;
                block22: {
                    FileCopy = false;
                    Err = null;
                    String Parent = null;
                    File dir = null;
                    fromFile = new File(Source);
                    toFile = new File(Destination);
                    try {
                        if (!fromFile.exists()) {
                            Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("Source file does not exist: ", Constants.vbNewLine), Strings.Chr(34)), Source), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "FileCopy");
                            return FileCopy;
                        }
                        if (!fromFile.isFile()) {
                            Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("Can not copy directory: ", Constants.vbNewLine), Strings.Chr(34)), Source), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "FileCopy");
                            return FileCopy;
                        }
                        if (!fromFile.canRead()) {
                            Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("Source file is unreadable: ", Constants.vbNewLine), Strings.Chr(34)), Source), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "FileCopy");
                            return FileCopy;
                        }
                        if (toFile.isDirectory()) {
                            toFile = new File(toFile, fromFile.getName());
                        }
                        if (toFile.exists()) {
                            if (!toFile.canWrite()) {
                                Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("Destination file is unwriteable: ", Constants.vbNewLine), Strings.Chr(34)), Destination), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "FileCopy");
                                return FileCopy;
                            }
                            if (Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("File already exists. Overwrite?", Constants.vbNewLine), Strings.Chr(34)), toFile.getName()), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbQuestion.intValue() | VBMsgBoxStyle.vbOKCancel.intValue()), "FileCopy").compareTo(VBMsgBoxResult.vbOK) != 0) {
                                Interaction.MsgBox("Existing file was not overwritten!", new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "FileCopy");
                                return FileCopy;
                            }
                            break block22;
                        }
                        Parent = toFile.getParent();
                    }
                    catch (Throwable throwable2) {}
                    try {
                        if (Parent == null) {
                            Parent = System.getProperty("user.dir");
                        }
                        dir = new File(Parent);
                    }
                    catch (Throwable throwable2) {}
                    try {
                        if (!dir.exists()) {
                            dir.mkdirs();
                        }
                        if (dir.isFile()) {
                            Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("Destination is not a directory: ", Constants.vbNewLine), Strings.Chr(34)), Parent), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "FileCopy");
                            return FileCopy;
                        }
                        if (!(!dir.canWrite())) break block22;
                        Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("Destination directory is unwriteable: ", Constants.vbNewLine), Strings.Chr(34)), Parent), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "FileCopy");
                        return FileCopy;
                    }
                    catch (Throwable throwable2) {}
                }
                fisFrom = new FileInputStream(fromFile);
                fosTo = new FileOutputStream(toFile);
                buffer = new VBArray();
                try {
                    buffer.setBound(0, 4096, false);
                    bytesRead = 0;
                }
                catch (Throwable throwable2) {}
                try {}
                catch (Throwable throwable2) {
                    break block23;
                }
                break block24;
                break block23;
            }
            bytesRead = fisFrom.read(buffer.byteArray());
            while (bytesRead != -1 * 1) {
                fosTo.write(buffer.byteArray(), 0, bytesRead);
                bytesRead = fisFrom.read(buffer.byteArray());
            }
            return FileCopy;
        }
        Object var4_12 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return FileCopy;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean DirCopy(String Source, String Destination) {
        Throwable throwable2;
        Throwable Err;
        boolean DirCopy;
        block18: {
            DirCopy = false;
            Err = null;
            Iterator h11 = null;
            String tmpString = Strings.StrCat(Source, System.getProperty("file.separator"));
            if (Strings.Len(Destination) > Strings.Len(tmpString) && Strings.Left(Destination, Strings.Len(tmpString)).equals(tmpString)) {
                Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("This is not allowed. It ends with recursive, endless copying!", Constants.vbNewLine), "Destination directory:"), Constants.vbNewLine), Strings.Chr(34)), Destination), Strings.Chr(34)), Constants.vbNewLine), "is a subdirectory of source:"), Constants.vbNewLine), Strings.Chr(34)), Source), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "DirCopy");
            }
            File SourceFile = new File(Source);
            File DestinationFile = new File(Destination);
            DirCopy = true;
            if (!SourceFile.exists()) {
                Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("Source directory does not exist:", Constants.vbNewLine), Strings.Chr(34)), Source), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "DirCopy");
                return false;
            }
            if (!SourceFile.isDirectory()) {
                Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("Source directory is not a directory:", Constants.vbNewLine), Strings.Chr(34)), Source), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "DirCopy");
                return false;
            }
            if (!DestinationFile.exists()) {
                FileSystem.MkDir(Destination);
            }
            if (!DestinationFile.isDirectory()) {
                Interaction.MsgBox(Strings.StrCat(Strings.StrCat(Strings.StrCat(Strings.StrCat("Destination directory is not a directory:", Constants.vbNewLine), Strings.Chr(34)), Destination), Strings.Chr(34)), new VBMsgBoxStyle(VBMsgBoxStyle.vbExclamation.intValue() | VBMsgBoxStyle.vbOKOnly.intValue()), "DirCopy");
                return false;
            }
            VBArray childFolders = new VBArray();
            childFolders = VBArray.createVBArray(SourceFile.listFiles());
            File item = null;
            h11 = childFolders.iterator();
            while (h11.hasNext()) {
                item = (File)VBVariant.valueOf(h11.next()).toObject();
                if (!item.isFile()) {
                    if (!item.isDirectory()) {
                        continue;
                    }
                } else {
                    FileSystem.FileCopy(Strings.StrCat(Strings.StrCat(Source, System.getProperty("file.separator")), item.getName()), Strings.StrCat(Strings.StrCat(Destination, System.getProperty("file.separator")), item.getName()));
                    continue;
                }
                FileSystem.DirCopy(Strings.StrCat(Strings.StrCat(Source, System.getProperty("file.separator")), item.getName()), Strings.StrCat(Strings.StrCat(Destination, System.getProperty("file.separator")), item.getName()));
            }
            return DirCopy;
            catch (Throwable throwable2) {}
            break block18;
            catch (Throwable throwable2) {}
            break block18;
            catch (Throwable throwable2) {}
            break block18;
            finally {
            }
        }
        Object var4_10 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return DirCopy;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Date FileDateTime(String path) {
        Date date = new Date();
        date.setTime(0);
        Date FileDateTime = date;
        Throwable Err = null;
        File file = new File(path);
        long modifiedTime = file.lastModified();
        Date myDate = new Date(modifiedTime);
        try {
            return myDate;
        }
        catch (Throwable throwable) {
            Object var3_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return FileDateTime;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
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
            return tmpString;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return CurDir;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
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
            return tmpString;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return TmpDir;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String TempDir() {
        String TempDir = "";
        Throwable Err = null;
        try {
            return FileSystem.TmpDir();
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return TempDir;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
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
            return tmpString;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return HomeDir;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
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
            return tmpString;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return JavaDir;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void MkDir(String aPath) {
        Throwable Err = null;
        File mydir = new File(aPath);
        try {
            mydir.mkdirs();
            return;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void RmDir(String aPath) {
        Throwable Err = null;
        File mydir = new File(aPath);
        try {
            if (!mydir.isDirectory()) {
                return;
            }
            mydir.delete();
            return;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean DirExists(String Path2) {
        boolean DirExists = false;
        Throwable Err = null;
        File mydir = new File(Path2);
        try {
            return mydir.isDirectory();
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return DirExists;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String Dir(String PathName, VbFileAttribute Attributes) {
        String Dir = "";
        Throwable Err = null;
        File mydir = new File(PathName);
        try {
            if (!((Attributes.intValue() & VbFileAttribute.vbDirectory.intValue()) == VbFileAttribute.vbDirectory.intValue() & mydir.isDirectory())) {
                if (!(Attributes.compareTo(VbFileAttribute.vbNormal) == 0 & mydir.isFile())) {
                    return Dir;
                }
            } else {
                Dir = mydir.getParent();
                if (!((Attributes.intValue() & VbFileAttribute.vbHidden.intValue()) == VbFileAttribute.vbHidden.intValue())) {
                    return Dir;
                }
                if (!mydir.isHidden()) return "";
                boolean bl = false;
                if (bl) return "";
                return Dir;
            }
            Dir = mydir.getCanonicalFile().toString();
            if (!((Attributes.intValue() & VbFileAttribute.vbHidden.intValue()) == VbFileAttribute.vbHidden.intValue())) {
                return Dir;
            }
            if (!mydir.isHidden()) return "";
            boolean bl = false;
            if (bl) return "";
            return Dir;
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Dir;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VbFileAttribute GetAttr(String PathName) {
        VbFileAttribute GetAttr = new VbFileAttribute();
        Throwable Err = null;
        File mydir = new File(PathName);
        try {
            GetAttr = VbFileAttribute.vbNormal;
            if (mydir.isDirectory()) {
                GetAttr = new VbFileAttribute(GetAttr.intValue() | VbFileAttribute.vbDirectory.intValue());
            }
            if (mydir.isHidden()) {
                GetAttr = new VbFileAttribute(GetAttr.intValue() | VbFileAttribute.vbHidden.intValue());
            }
            if (mydir.canRead() & !mydir.canWrite()) return new VbFileAttribute(GetAttr.intValue() | VbFileAttribute.vbReadOnly.intValue());
            return GetAttr;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetAttr;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void SetAttr(String PathName, VbFileAttribute Attributes) {
        Throwable Err = null;
        File mydir = new File(PathName);
        try {
            if (Attributes.compareTo(VbFileAttribute.vbNormal) == 0) {
                mydir.setWritable(true);
                return;
            }
            if ((Attributes.intValue() & VbFileAttribute.vbReadOnly.intValue()) != VbFileAttribute.vbReadOnly.intValue()) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            mydir.setReadOnly();
            return;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public static String Dir(String PathName) {
        return FileSystem.Dir(PathName, VbFileAttribute.vbNormal);
    }

    public FileSystem() {
        FileSystem Me;
    }

    static {
        myFHList.setBound(0, 255, false);
        myCurIndex = 0;
        myCurFHnd = null;
        myFilePos = 1;
    }
}
