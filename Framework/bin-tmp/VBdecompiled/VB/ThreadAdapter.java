/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.Interaction;

public class ThreadAdapter
implements Runnable {
    private Object myTargetObject;
    private String myTargetFunction;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ThreadAdapter(Object TargetObject, String TargetFunction) {
        ThreadAdapter Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myTargetObject = TargetObject;
            Me.myTargetFunction = TargetFunction;
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
    @Override
    public void run() {
        Throwable Err = null;
        try {
            ThreadAdapter Me;
            Interaction.CallByName(Me.myTargetObject, Me.myTargetFunction);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        Me.myTargetObject = null;
        Me.myTargetFunction = "";
    }
}
