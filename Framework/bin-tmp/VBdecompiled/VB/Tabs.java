/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.TabStrip;
import VB.Usercontrol;
import VBA.IResource;
import VBA.Interaction;

public class Tabs {
    private TabStrip myTabStrip;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Tabs(TabStrip refTabStrip) {
        Tabs Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myTabStrip = refTabStrip;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int $TabCount() {
        int $TabCount = 0;
        Throwable Err = null;
        try {
            Tabs Me;
            return Me.myTabStrip.$Parent().getComponentCount();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return $TabCount;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String $Caption(int Index) {
        String $Caption = "";
        Throwable Err = null;
        try {
            Tabs Me;
            return Me.myTabStrip.$Parent().getTitleAt(Index - 1);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
            return $Caption;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void $Caption(int Index, String Title) {
        Throwable Err = null;
        try {
            Tabs Me;
            Me.myTabStrip.$Parent().setTitleAt(Index - 1, Title);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Usercontrol $Item(int Index) {
        Usercontrol $Item = null;
        Throwable Err = null;
        try {
            Tabs Me;
            return (Usercontrol)Me.myTabStrip.$Parent().getComponentAt(Index - 1);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
            return $Item;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void $Item(int Index, Usercontrol v) {
        Throwable Err = null;
        try {
            Tabs Me;
            Me.myTabStrip.$Parent().setComponentAt(Index - 1, v);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Clear() {
        Throwable Err = null;
        try {
            Tabs Me;
            Me.myTabStrip.$Parent().removeAll();
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Remove(int Index) {
        Throwable Err = null;
        try {
            Tabs Me;
            Me.myTabStrip.$Parent().remove(Index);
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
    public void Remove(Usercontrol v) {
        Throwable Err = null;
        try {
            Tabs Me;
            Me.myTabStrip.$Parent().remove(v);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Add(Usercontrol Component2, String Title) {
        Object var4_4;
        Throwable Err = null;
        try {
            Component2.$Opaque(false);
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            Tabs Me;
            Me.myTabStrip.$Parent().addTab(Title, Component2);
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Add(Usercontrol Component2, String Title, IResource IconPath) {
        Object var5_5;
        Throwable Err = null;
        try {
            Component2.$Opaque(false);
        }
        catch (Throwable throwable) {
            var5_5 = null;
            Err = throwable;
        }
        try {
            Tabs Me;
            Me.myTabStrip.$Parent().addTab(Title, Global.LoadIcon(IconPath), Component2);
        }
        catch (Throwable throwable) {
            var5_5 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Add(Usercontrol Component2, String Title, IResource IconPath, String ToolTip) {
        Object var6_6;
        Throwable Err = null;
        try {
            Component2.$Opaque(false);
        }
        catch (Throwable throwable) {
            var6_6 = null;
            Err = throwable;
        }
        try {
            Tabs Me;
            Me.myTabStrip.$Parent().addTab(Title, Global.LoadIcon(IconPath), Component2, ToolTip);
        }
        catch (Throwable throwable) {
            var6_6 = null;
            Err = throwable;
            return;
        }
    }

    private void initVars() {
        Me.myTabStrip = null;
    }
}
