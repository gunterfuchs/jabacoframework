/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.VBEnumClass;

public class SelectionModeSettings
extends VBEnumClass {
    public static final SelectionModeSettings flexSelectionFree = new SelectionModeSettings(0);
    public static final SelectionModeSettings flexSelectionByRow = new SelectionModeSettings(1);
    public static final SelectionModeSettings flexSelectionByColumn = new SelectionModeSettings(2);

    public SelectionModeSettings() {
        SelectionModeSettings Me;
    }

    public SelectionModeSettings(int n) {
        super(n);
        SelectionModeSettings Me;
    }

    public SelectionModeSettings(long l) {
        super(l);
        SelectionModeSettings Me;
    }

    public SelectionModeSettings(String string) {
        super(string);
        SelectionModeSettings Me;
    }
}
