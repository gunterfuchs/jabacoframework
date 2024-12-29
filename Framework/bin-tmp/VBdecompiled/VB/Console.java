/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VBA.Interaction;
import java.util.Scanner;

public class Console
implements IJabacoClass {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Print(String text) {
        Throwable Err = null;
        try {
            System.out.println(text);
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
    public void PrintError(String text) {
        Throwable Err = null;
        try {
            System.err.println(text);
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
    public String Input() {
        String Input = "";
        Throwable Err = null;
        try {
            return new Scanner(System.in).nextLine();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Input;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String Input(String text) {
        String Input = "";
        Throwable Err = null;
        try {
            Console Me;
            System.out.print(text);
            return Me.Input();
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Input;
    }

    public Console() {
        Console Me;
        Me.initVars();
    }

    private void initVars() {
    }
}
