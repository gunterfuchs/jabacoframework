/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.VBEnumClass;

public class TreeRelationshipConstants
extends VBEnumClass {
    public static final TreeRelationshipConstants tvwFirst = new TreeRelationshipConstants(0);
    public static final TreeRelationshipConstants tvwLast = new TreeRelationshipConstants(1);
    public static final TreeRelationshipConstants tvwNext = new TreeRelationshipConstants(2);
    public static final TreeRelationshipConstants tvwPrevious = new TreeRelationshipConstants(3);
    public static final TreeRelationshipConstants tvwChild = new TreeRelationshipConstants(4);

    public TreeRelationshipConstants() {
        TreeRelationshipConstants Me;
    }

    public TreeRelationshipConstants(int n) {
        super(n);
        TreeRelationshipConstants Me;
    }

    public TreeRelationshipConstants(long l) {
        super(l);
        TreeRelationshipConstants Me;
    }

    public TreeRelationshipConstants(String string) {
        super(string);
        TreeRelationshipConstants Me;
    }
}
