/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;

public interface IJabacoControl
extends IJabacoClass {
    public float $Width();

    public void $Width(float var1);

    public float $Height();

    public void $Height(float var1);

    public float $Left();

    public void $Left(float var1);

    public float $Top();

    public void $Top(float var1);

    public boolean $Visible();

    public void $Visible(boolean var1);

    public void ResizeTriggerInit(float var1, float var2);

    public void ResizeTrigger(float var1, float var2);
}
