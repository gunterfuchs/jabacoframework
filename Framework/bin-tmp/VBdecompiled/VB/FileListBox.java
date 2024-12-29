/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.FileSystem;
import VB.ListBox;
import VBA.Interaction;
import VBA.VBArray;
import VBA.VBVariant;
import java.io.File;

public class FileListBox
extends ListBox {
    private String myDirectory;
    private boolean myHidden;
    private String myPattern;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            FileListBox Me;
            Me.myDirectory = FileSystem.CurDir();
            super.$BackColorAlternating(super.$BackColor());
            Me.Update_Filename_List();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Unable to fully structure code
     */
    public void Update_Filename_List() {
        block8: {
            Err = null;
            h8 = 0;
            h9 = 0;
            try {
                Me.Clear();
                myFile = new File(Me.myDirectory);
            }
            catch (Throwable v0) {}
            myList = VBVariant.valueOf(VBArray.createVBArray(myFile.listFiles()));
            myItem = "";
            i = 0;
            i = 0;
            h8 = myList.toObject().getUBound(1);
            h9 = 1;
            while (i <= h8) {
                myItem = Interaction.CallByName(myList.toObject().valueOfVar(i).toObject(), "getName", VBArray.createParamArray(-1)).toString();
                if (Interaction.CallByName(myList.toObject().valueOfVar(i).toObject(), "isFile", VBArray.createParamArray(-1)).compareTo(VBVariant.valueOf(true)) == 0 && (Me.myHidden == false & Interaction.CallByName(myList.toObject().valueOfVar(i).toObject(), "isHidden", VBArray.createParamArray(-1)).compareTo(VBVariant.valueOf(true)) == 0) == false) {
                    Me.AddItem(Interaction.CallByName(myList.toObject().valueOfVar(i).toObject(), "getName", VBArray.createParamArray(-1)).toString());
                }
                i += h9;
            }
lbl23:
            // 2 sources

            return;
lbl25:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            break block8;
            catch (Throwable v0) {
            }
        }
        var2_8 = null;
        Err = v0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Path(String myPath) {
        Throwable Err = null;
        try {
            FileListBox Me;
            Me.myDirectory = myPath;
            Me.Update_Filename_List();
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
    public boolean $Hidden() {
        boolean $Hidden = false;
        Throwable Err = null;
        try {
            FileListBox Me;
            return Me.myHidden;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Hidden;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Hidden(boolean val) {
        Throwable Err = null;
        try {
            FileListBox Me;
            Me.myHidden = val;
            Me.Update_Filename_List();
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
    public String $Pattern() {
        String $Pattern = "";
        Throwable Err = null;
        try {
            FileListBox Me;
            return Me.myPattern;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Pattern;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Pattern(String vals) {
        Throwable Err = null;
        try {
            FileListBox Me;
            Me.myPattern = vals;
            Me.Update_Filename_List();
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public FileListBox() {
        FileListBox Me;
        Me.initVarsI();
        Me.Class_Initialize();
    }

    private void initVarsI() {
        Me.myDirectory = "";
        Me.myHidden = false;
        Me.myPattern = "*.*";
    }
}
