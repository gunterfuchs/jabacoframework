/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VBA.Interaction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

public class Timer
extends TimerTask
implements IJabacoClass,
ActionListener {
    private javax.swing.Timer MyTimer;
    private long MyFirstInterval;
    private long MyInterval;
    private boolean MyEnabled;
    private boolean MyEnabledState;

    public void _Timer() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Throwable Err = null;
        try {
            Timer Me;
            Me._Timer();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        Throwable Err = null;
        try {
            Timer Me;
            Me._Timer();
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            Me.MyFirstInterval = 0;
            Me.MyInterval = 0;
            Me.MyEnabled = false;
            Me.MyEnabledState = false;
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
    public float $Interval() {
        float $Interval = 0.0f;
        Throwable Err = null;
        try {
            Timer Me;
            return Me.MyInterval;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Interval;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Interval(float v) {
        Throwable Err = null;
        try {
            Timer Me;
            if (v < 0.0f) {
                v = 0.0f;
            }
            Me.MyInterval = (long)v;
            Me.MyFirstInterval = (long)v;
            Me.InitTimer();
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
    public boolean $Enabled() {
        boolean $Enabled = false;
        Throwable Err = null;
        try {
            Timer Me;
            return Me.MyEnabled;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Enabled;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Enabled(boolean v) {
        Throwable Err = null;
        try {
            Timer Me;
            Me.MyEnabled = v;
            Me.InitTimer();
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
    public boolean booleanValue() {
        boolean booleanValue = false;
        Throwable Err = null;
        try {
            Timer Me;
            return Me.$Enabled();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return booleanValue;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void InitTimer() {
        Throwable Err = null;
        try {
            block5: {
                Timer Me;
                block4: {
                    block3: {
                        if (Me.MyEnabled) break block3;
                        if (Me.MyEnabledState) break block4;
                        break block5;
                    }
                    if (Me.MyFirstInterval > (long)0) {
                        Me.MyTimer.setInitialDelay((int)Me.MyInterval);
                        Me.MyTimer.setDelay((int)Me.MyInterval);
                    }
                    Me.MyTimer.start();
                    Me.MyEnabledState = true;
                    return;
                }
                Me.MyTimer.stop();
            }
            Me.MyEnabledState = false;
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
    public TimerTask $Parent() {
        Timer $Parent = null;
        Throwable Err = null;
        try {
            Timer Me;
            return Me;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    public Timer() {
        Timer Me;
        Me.initVars();
        Me.Class_Initialize();
    }

    private void initVars() {
        Timer Me;
        Me.MyTimer = new javax.swing.Timer(0, Me);
        Me.MyFirstInterval = 0L;
        Me.MyInterval = 0L;
        Me.MyEnabled = false;
        Me.MyEnabledState = false;
    }
}
