/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.IJabacoClass;
import VBA.Constants;
import VBA.Information;
import VBA.Interaction;
import VBA.Strings;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.print.PrinterJob;
import java.io.File;
import javax.swing.JColorChooser;

public class CommonDialog
implements IJabacoClass {
    private String myDialogTitle;
    private String myFileName;
    private String myFilter;
    private String myInitDir;
    private long myColor;
    private boolean myIsCanceled;
    private String myHelpFile;
    private int myFlags;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void ShowColor() {
        Throwable Err = null;
        Color tmpColor = null;
        Color tmpColor2 = null;
        try {
            CommonDialog Me;
            tmpColor2 = Information.RGBtoColor(Me.$Color());
            tmpColor = JColorChooser.showDialog(null, Me.$DialogTitle(), tmpColor2);
            boolean bl = Me.myIsCanceled = tmpColor == null;
            if (Me.myIsCanceled) {
                return;
            }
            boolean bl2 = true;
            if (!bl2) {
                return;
            }
            Me.myColor = Information.ColorToRGB(tmpColor);
            return;
        }
        catch (Throwable throwable) {
            Object var2_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $HelpFile() {
        String $HelpFile = "";
        Throwable Err = null;
        try {
            CommonDialog Me;
            return Me.myHelpFile;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $HelpFile;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $HelpFile(String aFileName) {
        Throwable Err = null;
        try {
            Me.myHelpFile = aFileName;
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
    public void ShowHelp() {
        Throwable Err = null;
        Desktop d = Desktop.getDesktop();
        try {
            CommonDialog Me;
            d.open(new File(Me.$HelpFile()));
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
    public void ShowPrinter() {
        Throwable Err = null;
        PrinterJob p = PrinterJob.getPrinterJob();
        try {
            Me.myIsCanceled = !p.printDialog();
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
    public void ShowOpen() {
        Throwable Err = null;
        try {
            CommonDialog Me;
            Me.ShowOpen(true);
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
    public void ShowOpen(boolean Modal) {
        Throwable Err = null;
        try {
            CommonDialog Me;
            Me.ShowOpen(Modal, null);
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
    private FileDialog createDialog(Frame Parent, String Title, int Flag) {
        Object var6_7;
        Throwable Err;
        FileDialog createDialog;
        block29: {
            block26: {
                Frame tmpParentFrame;
                block28: {
                    block27: {
                        block25: {
                            createDialog = null;
                            Err = null;
                            tmpParentFrame = null;
                            try {
                                createDialog = new FileDialog(null, Title, Flag);
                            }
                            catch (Throwable throwable) {
                                var6_7 = null;
                                Err = throwable;
                            }
                            try {
                                if (Parent == null) break block25;
                                break block26;
                            }
                            catch (Throwable throwable) {
                                var6_7 = null;
                                Err = throwable;
                            }
                        }
                        try {
                            tmpParentFrame = (Frame)Global.SysInfo().FocusedWindow();
                        }
                        catch (Throwable throwable) {
                            var6_7 = null;
                            Err = throwable;
                        }
                        try {
                            if (tmpParentFrame == null) break block27;
                            break block28;
                        }
                        catch (Throwable throwable) {
                            var6_7 = null;
                            Err = throwable;
                        }
                    }
                    try {
                        try {
                            createDialog = new FileDialog(null, Title, Flag);
                        }
                        catch (Throwable throwable) {
                            var6_7 = null;
                            Err = throwable;
                        }
                        break block29;
                    }
                    catch (Throwable throwable) {
                        var6_7 = null;
                        Err = throwable;
                    }
                }
                try {
                    try {
                        try {
                            createDialog = new FileDialog(tmpParentFrame, Title, Flag);
                        }
                        catch (Throwable throwable) {
                            var6_7 = null;
                            Err = throwable;
                            break block29;
                        }
                    }
                    catch (Throwable throwable) {
                        var6_7 = null;
                        Err = throwable;
                    }
                    break block29;
                }
                catch (Throwable throwable) {
                    var6_7 = null;
                    Err = throwable;
                }
            }
            try {
                createDialog = new FileDialog(Parent, Title, Flag);
                return createDialog;
            }
            catch (Throwable throwable) {
                var6_7 = null;
                Err = throwable;
            }
        }
        try {
            CommonDialog Me;
            createDialog.setDirectory(Me.myInitDir);
        }
        catch (Throwable throwable) {
            var6_7 = null;
            Err = throwable;
            return createDialog;
        }
        return createDialog;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void ShowOpen(boolean Modal, Frame Parent) {
        Object var4_5;
        CommonDialog Me;
        Throwable Err = null;
        String tmpTitle = "";
        try {
            tmpTitle = !(Strings.Len(Me.$DialogTitle()) == 0) ? Me.$DialogTitle() : "Open";
        }
        catch (Throwable throwable) {
            var4_5 = null;
            Err = throwable;
        }
        FileDialog tmpDialog = Me.createDialog(Parent, tmpTitle, FileDialog.LOAD);
        try {
            tmpDialog.setModal(Modal);
        }
        catch (Throwable throwable) {
            var4_5 = null;
            Err = throwable;
        }
        try {
            tmpDialog.setFile(Me.$FileName());
        }
        catch (Throwable throwable) {
            var4_5 = null;
            Err = throwable;
        }
        try {
            tmpDialog.show();
        }
        catch (Throwable throwable) {
            var4_5 = null;
            Err = throwable;
        }
        try {
            Me.myIsCanceled = Strings.StrComp(tmpDialog.getFile(), null) == 0;
        }
        catch (Throwable throwable) {
            var4_5 = null;
            Err = throwable;
        }
        try {
            Me.$FileName(Me.MergeFileAndFolder(tmpDialog.getDirectory(), tmpDialog.getFile()));
        }
        catch (Throwable throwable) {
            var4_5 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void ShowSave() {
        Throwable Err = null;
        try {
            CommonDialog Me;
            Me.ShowSave(true);
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
    public void ShowSave(boolean Modal) {
        Throwable throwable2;
        Throwable Err;
        block5: {
            FileDialog tmpDialog;
            CommonDialog Me;
            Err = null;
            String tmpTitle = "";
            try {
                tmpTitle = !(Strings.Len(Me.$DialogTitle()) == 0) ? Me.$DialogTitle() : "Save";
                tmpDialog = Me.createDialog(null, tmpTitle, FileDialog.SAVE);
            }
            catch (Throwable throwable2) {
                break block5;
            }
            tmpDialog.setModal(Modal);
            tmpDialog.setFile(Me.$FileName());
            tmpDialog.show();
            Me.myIsCanceled = Strings.StrComp(tmpDialog.getFile(), null) == 0;
            Me.$FileName(Me.MergeFileAndFolder(tmpDialog.getDirectory(), tmpDialog.getFile()));
        }
        Object var3_5 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String MergeFileAndFolder(String sFolder, String sFile) {
        String MergeFileAndFolder = "";
        Throwable Err = null;
        try {
            if (Strings.StrComp(sFile, null) == 0) {
                sFile = Constants.vbNullString;
            }
            if (Strings.StrComp(sFolder, null) == 0) {
                sFolder = Constants.vbNullString;
            }
            if (Strings.Len(sFile) == 0) {
                return Constants.vbNullString;
            }
            if (!(Strings.StrComp(Strings.Right(sFolder, 1), "\\") != 0 & Strings.StrComp(Strings.Right(sFolder, 1), "/") != 0)) return Strings.StrCat(sFolder, sFile);
            return Strings.StrCat(Strings.StrCat(sFolder, "\\"), sFile);
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return MergeFileAndFolder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $IsCanceled() {
        boolean $IsCanceled = false;
        Throwable Err = null;
        try {
            CommonDialog Me;
            return Me.myIsCanceled;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $IsCanceled;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Filter(String s) {
        Throwable Err = null;
        try {
            Me.myFilter = s;
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
    public String $Filter() {
        String $Filter = "";
        Throwable Err = null;
        try {
            CommonDialog Me;
            return Me.myFilter;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Filter;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $DialogTitle(String s) {
        Throwable Err = null;
        try {
            Me.myDialogTitle = s;
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
    public String $DialogTitle() {
        String $DialogTitle = "";
        Throwable Err = null;
        try {
            CommonDialog Me;
            return Me.myDialogTitle;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $DialogTitle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FileName(String s) {
        Throwable Err = null;
        try {
            Me.myFileName = s;
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
    public String $FileName() {
        String $FileName = "";
        Throwable Err = null;
        try {
            CommonDialog Me;
            return Me.myFileName;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FileName;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $InitDir(String s) {
        Throwable Err = null;
        try {
            CommonDialog Me;
            Me.myInitDir = s;
            Me.myInitDir = Strings.Replace(Me.myInitDir, "\\\\", "\\");
            Me.myInitDir = Strings.Replace(Me.myInitDir, "\\", "\\\\");
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
    public String $InitDir() {
        String $InitDir = "";
        Throwable Err = null;
        try {
            CommonDialog Me;
            return Me.myInitDir;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $InitDir;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $Color() {
        long $Color = 0L;
        Throwable Err = null;
        try {
            CommonDialog Me;
            return Me.myColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Color;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Color(long v) {
        Throwable Err = null;
        try {
            Me.myColor = v;
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public boolean $CancelError() {
        boolean $CancelError = false;
        Object Err = null;
        return $CancelError;
    }

    public void $CancelError(boolean v) {
        Object Err = null;
    }

    public CommonDialog() {
        CommonDialog Me;
        Me.initVars();
    }

    private void initVars() {
        Me.myDialogTitle = "";
        Me.myFileName = "";
        Me.myFilter = "";
        Me.myInitDir = "";
        Me.myColor = 0L;
        Me.myIsCanceled = false;
        Me.myHelpFile = "";
        Me.myFlags = 0;
    }
}
