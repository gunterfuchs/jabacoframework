/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.VBEnumClass;

public class ColorConstants
extends VBEnumClass {
    public static final ColorConstants vbBlack = new ColorConstants(0);
    public static final ColorConstants vbRed = new ColorConstants(255);
    public static final ColorConstants vbGreen = new ColorConstants(65280);
    public static final ColorConstants vbYellow = new ColorConstants(65535);
    public static final ColorConstants vbBlue = new ColorConstants(0xFF0000);
    public static final ColorConstants vbMagenta = new ColorConstants(0xFF00FF);
    public static final ColorConstants vbCyan = new ColorConstants(0xFFFF00);
    public static final ColorConstants vbWhite = new ColorConstants(0xFFFFFF);

    public ColorConstants() {
        ColorConstants Me;
    }

    public ColorConstants(int n) {
        super(n);
        ColorConstants Me;
    }

    public ColorConstants(long l) {
        super(l);
        ColorConstants Me;
    }

    public ColorConstants(String string) {
        super(string);
        ColorConstants Me;
    }
}
