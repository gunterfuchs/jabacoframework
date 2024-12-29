/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Timer;
import VB.VBControlExtender;

public class VBControlExtender$Timer
extends Timer {
    int ID;
    VBControlExtender Owner;
    int Index;

    public VBControlExtender$Timer() {
        VBControlExtender$Timer Me;
    }

    public void setOwner(VBControlExtender vBControlExtender, int n) {
        Me.Owner = vBControlExtender;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Timer() {
        VBControlExtender$Timer Me;
        if (1 == Me.ID) {
            Me.Owner.myTimer_Timer();
            return;
        }
    }
}
