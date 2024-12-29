/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VBA.IResource;

public interface IMenuItem
extends IJabacoClass {
    public String $ControlID();

    public void $ControlID(String var1);

    public String $Caption();

    public void $Caption(String var1);

    public IResource $Icon();

    public void $Icon(IResource var1);

    public boolean $Enabled();

    public void $Enabled(boolean var1);

    public boolean $Visible();

    public void $Visible(boolean var1);
}
