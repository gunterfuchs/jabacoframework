/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VBA.Interaction;
import VBA.VBArray;
import VBA.VBArrayString;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

public class Screen
implements IJabacoClass {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $Width() {
        float $Width = 0.0f;
        Throwable Err = null;
        try {
            return Toolkit.getDefaultToolkit().getScreenSize().width;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Width;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $Height() {
        float $Height = 0.0f;
        Throwable Err = null;
        try {
            return Toolkit.getDefaultToolkit().getScreenSize().height;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Height;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $Fonts(int Index) {
        Object var4_5;
        String $Fonts = "";
        Throwable Err = null;
        VBArrayString tmpList = new VBArray();
        try {
            tmpList = VBArray.createVBArray(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
        }
        catch (Throwable throwable) {
            var4_5 = null;
            Err = throwable;
        }
        try {
            return tmpList.valueOfStr(Index);
        }
        catch (Throwable throwable) {
            var4_5 = null;
            Err = throwable;
            return $Fonts;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $FontCount() {
        Object var3_4;
        int $FontCount = 0;
        Throwable Err = null;
        VBArrayString tmpList = new VBArray();
        try {
            tmpList = VBArray.createVBArray(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        try {
            return tmpList.getUBound(1);
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
            return $FontCount;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $TwipsPerPixelX() {
        float $TwipsPerPixelX = 0.0f;
        Throwable Err = null;
        try {
            return 1.0f;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $TwipsPerPixelX;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $TwipsPerPixelY() {
        float $TwipsPerPixelY = 0.0f;
        Throwable Err = null;
        try {
            return 1.0f;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $TwipsPerPixelY;
    }

    public Screen() {
        Screen Me;
        Me.initVars();
    }

    private void initVars() {
    }
}
