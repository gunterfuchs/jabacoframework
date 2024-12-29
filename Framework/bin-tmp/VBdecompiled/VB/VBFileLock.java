/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.VBEnumClass;

public class VBFileLock
extends VBEnumClass {
    public static final VBFileLock Shared = new VBFileLock(0);
    public static final VBFileLock LockRead = new VBFileLock(1);
    public static final VBFileLock LockWrite = new VBFileLock(2);
    public static final VBFileLock LockReadAndWrite = new VBFileLock(3);

    public VBFileLock() {
        VBFileLock Me;
    }

    public VBFileLock(int n) {
        super(n);
        VBFileLock Me;
    }

    public VBFileLock(long l) {
        super(l);
        VBFileLock Me;
    }

    public VBFileLock(String string) {
        super(string);
        VBFileLock Me;
    }
}
