/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.VBEnumClass;

public class VBFileAccess
extends VBEnumClass {
    public static final VBFileAccess Read = new VBFileAccess(0);
    public static final VBFileAccess Write = new VBFileAccess(1);
    public static final VBFileAccess ReadAndWrite = new VBFileAccess(2);

    public VBFileAccess() {
        VBFileAccess Me;
    }

    public VBFileAccess(int n) {
        super(n);
        VBFileAccess Me;
    }

    public VBFileAccess(long l) {
        super(l);
        VBFileAccess Me;
    }

    public VBFileAccess(String string) {
        super(string);
        VBFileAccess Me;
    }
}
