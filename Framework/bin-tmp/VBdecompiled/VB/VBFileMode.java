/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.VBEnumClass;

public class VBFileMode
extends VBEnumClass {
    public static final VBFileMode Random = new VBFileMode(0);
    public static final VBFileMode Binary = new VBFileMode(1);
    public static final VBFileMode Append = new VBFileMode(2);
    public static final VBFileMode Input = new VBFileMode(3);
    public static final VBFileMode Output = new VBFileMode(4);

    public VBFileMode() {
        VBFileMode Me;
    }

    public VBFileMode(int n) {
        super(n);
        VBFileMode Me;
    }

    public VBFileMode(long l) {
        super(l);
        VBFileMode Me;
    }

    public VBFileMode(String string) {
        super(string);
        VBFileMode Me;
    }
}
