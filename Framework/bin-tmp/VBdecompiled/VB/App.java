/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayString;
import VBA.VBVariant;
import java.io.File;
import java.lang.management.ManagementFactory;

public class App {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Path() {
        String $Path = "";
        Throwable Err = null;
        String tmpFile = "";
        String tmpString = "";
        VBArrayString tmpFileParts = new VBArray();
        try {
            tmpFileParts = Strings.Split(System.getProperty("sun.java.command"), " ");
            tmpFile = tmpFileParts.valueOfStr(0);
            tmpString = !(Strings.InStr(System.getProperty("sun.java.command"), System.getProperty("file.separator")) == 0) ? Strings.Left(System.getProperty("sun.java.command"), Strings.InStrRev(System.getProperty("sun.java.command"), System.getProperty("file.separator")) - 1) : (!(Strings.Len(tmpFile) > 3 & Strings.Mid(tmpFile, Strings.Len(tmpFile) - 3).equalsIgnoreCase(".jar")) ? new File(Class.forName(tmpFile, false, ClassLoader.getSystemClassLoader()).getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getAbsolutePath() : ".");
            if (Strings.StrComp(Strings.Right(tmpString, 1), System.getProperty("file.separator")) == 0) {
                tmpString = Strings.Left(tmpString, Strings.Len(tmpString) - 1);
            }
            if (Strings.InStr(tmpString, System.getProperty("file.separator")) == 0) {
                tmpString = Strings.StrCat(tmpString, System.getProperty("file.separator"));
            }
            return tmpString;
        }
        catch (Throwable throwable) {
            Object var3_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Path;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $JabacoFrameworkPath() {
        String $JabacoFrameworkPath = "";
        Throwable Err = null;
        File tmpFile = null;
        String tmpString = "";
        try {
            App Me;
            tmpFile = new File(super.getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
            tmpString = !tmpFile.isFile() ? tmpFile.getAbsolutePath() : Strings.Left(tmpFile.getAbsolutePath(), Strings.InStrRev(tmpFile.getAbsolutePath(), System.getProperty("file.separator")) - 1);
            if (Strings.StrComp(Strings.Right(tmpString, 1), System.getProperty("file.separator")) == 0) {
                tmpString = Strings.Left(tmpString, Strings.Len(tmpString) - 1);
            }
            if (Strings.InStr(tmpString, System.getProperty("file.separator")) == 0) {
                tmpString = Strings.StrCat(tmpString, System.getProperty("file.separator"));
            }
            return tmpString;
        }
        catch (Throwable throwable) {
            Object var3_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $JabacoFrameworkPath;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $ExeName() {
        String $ExeName = "";
        Throwable Err = null;
        String tmpFile = "";
        String tmpString = "";
        VBArrayString tmpFileParts = new VBArray();
        try {
            tmpFileParts = Strings.Split(System.getProperty("sun.java.command"), " ");
            tmpFile = tmpFileParts.valueOfStr(0);
            if (!(Strings.Len(tmpFile) > 3 & Strings.Mid(tmpFile, Strings.Len(tmpFile) - 3).equalsIgnoreCase(".jar"))) {
                tmpString = Strings.StrCat(tmpFile, ".class");
                return tmpString;
            } else {
                tmpFileParts = Strings.Split(tmpFile, System.getProperty("file.separator"));
                tmpString = tmpFile = tmpFileParts.valueOfStr(tmpFileParts.getUBound(1));
            }
            return tmpString;
        }
        catch (Throwable throwable) {
            Object var3_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ExeName;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $StartCommand() {
        String $StartCommand = "";
        Throwable Err = null;
        try {
            return System.getProperty("sun.java.command");
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $StartCommand;
    }

    /*
     * Unable to fully structure code
     */
    public String $JVMArguments() {
        block13: {
            $JVMArguments = "";
            Err = null;
            h9 = 0;
            h10 = 0;
            tmpString = VBVariant.valueOf("");
            rbean = null;
            rbean = ManagementFactory.getRuntimeMXBean();
            argumentList = null;
            argumentList = rbean.getInputArguments();
            i = 0;
            i = 0;
            h9 = argumentList.size() - 1;
            h10 = 1;
            ** while (i <= h9)
lbl-1000:
            // 1 sources

            {
                if (i > 0) {
                    tmpString = VBVariant.valueOf(Strings.StrCat(tmpString.toString(), " "));
                }
                tmpString = VBVariant.valueOf(Strings.StrCat(tmpString.toString(), argumentList.get(i).toString()));
                i += h10;
                continue;
            }
lbl26:
            // 2 sources

            $JVMArguments = tmpString.toString();
            return $JVMArguments;
lbl28:
            // 1 sources

            return $JVMArguments;
lbl30:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            catch (Throwable v0) {}
            break block13;
            catch (Throwable v0) {}
            break block13;
            catch (Throwable v0) {
                break block13;
            }
            finally {
            }
        }
        var3_9 = null;
        Err = v0;
        ** while (true)
    }

    public App() {
        App Me;
        Me.initVars();
    }

    private void initVars() {
    }
}
