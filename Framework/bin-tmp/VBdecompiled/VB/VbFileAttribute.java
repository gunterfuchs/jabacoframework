/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.VBEnumClass;

public class VbFileAttribute
extends VBEnumClass {
    public static final VbFileAttribute vbNormal = new VbFileAttribute(0);
    public static final VbFileAttribute vbReadOnly = new VbFileAttribute(1);
    public static final VbFileAttribute vbHidden = new VbFileAttribute(2);
    public static final VbFileAttribute vbSystem = new VbFileAttribute(4);
    public static final VbFileAttribute vbVolume = new VbFileAttribute(8);
    public static final VbFileAttribute vbDirectory = new VbFileAttribute(16);
    public static final VbFileAttribute vbArchive = new VbFileAttribute(32);
    public static final VbFileAttribute vbAlias = new VbFileAttribute(64);

    public VbFileAttribute() {
        VbFileAttribute Me;
    }

    public VbFileAttribute(int n) {
        super(n);
        VbFileAttribute Me;
    }

    public VbFileAttribute(long l) {
        super(l);
        VbFileAttribute Me;
    }

    public VbFileAttribute(String string) {
        super(string);
        VbFileAttribute Me;
    }
}
