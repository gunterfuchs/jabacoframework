/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VB.VBImage;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

public class RTStyle {
    private Style myStyle;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public RTStyle(Style refStyle) {
        RTStyle Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myStyle = refStyle;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Style getStyle() {
        Style getStyle = null;
        Throwable Err = null;
        try {
            RTStyle Me;
            return Me.myStyle;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getStyle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BidiLevel(int v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setBidiLevel(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $BidiLevel() {
        int $BidiLevel = 0;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.getBidiLevel(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BidiLevel;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Superscript(boolean v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setSuperscript(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Superscript() {
        boolean $Superscript = false;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.isSuperscript(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Superscript;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Subscript(boolean v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setSubscript(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Subscript() {
        boolean $Subscript = false;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.isSubscript(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Subscript;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $SpaceAbove(float v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setSpaceAbove(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $SpaceAbove() {
        float $SpaceAbove = 0.0f;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.getSpaceAbove(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $SpaceAbove;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $SpaceBelow(float v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setSpaceBelow(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $SpaceBelow() {
        float $SpaceBelow = 0.0f;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.getSpaceBelow(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $SpaceBelow;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $RightIndent(float v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setRightIndent(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $RightIndent() {
        float $RightIndent = 0.0f;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.getRightIndent(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $RightIndent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $LeftIndent(float v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setLeftIndent(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $LeftIndent() {
        float $LeftIndent = 0.0f;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.getLeftIndent(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $LeftIndent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FirstLineIndent(float v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setFirstLineIndent(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $FirstLineIndent() {
        float $FirstLineIndent = 0.0f;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.getFirstLineIndent(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FirstLineIndent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Bold(boolean v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setBold(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Bold() {
        boolean $Bold = false;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.isBold(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Bold;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Italic(boolean v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setItalic(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Italic() {
        boolean $Italic = false;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.isItalic(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Italic;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Underline(boolean v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setUnderline(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Underline() {
        boolean $Underline = false;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.isUnderline(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Underline;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontName(String v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setFontFamily(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String $FontName() {
        String $FontName = "";
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.getFontFamily(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontName;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontSize(int v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setFontSize(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $FontSize() {
        int $FontSize = 0;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.getFontSize(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontSize;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $TextColor(long v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setForeground(Me.myStyle, Information.RGBtoColor(v));
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $TextColor() {
        long $TextColor = 0L;
        Throwable Err = null;
        try {
            RTStyle Me;
            return Information.ColorToRGB(StyleConstants.getForeground(Me.myStyle));
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $TextColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $BackColor(long v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setBackground(Me.myStyle, Information.RGBtoColor(v));
            return;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $BackColor() {
        long $BackColor = 0L;
        Throwable Err = null;
        try {
            RTStyle Me;
            return Information.ColorToRGB(StyleConstants.getBackground(Me.myStyle));
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BackColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Icon(IResource v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setIcon(Me.myStyle, Global.LoadIcon(v));
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IResource $Icon() {
        IResource $Icon = null;
        Throwable Err = null;
        try {
            RTStyle Me;
            return new VBImage(StyleConstants.getIcon(Me.myStyle).toString());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Icon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $StrikeThrough(boolean v) {
        Throwable Err = null;
        try {
            RTStyle Me;
            StyleConstants.setStrikeThrough(Me.myStyle, v);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $StrikeThrough() {
        boolean $StrikeThrough = false;
        Throwable Err = null;
        try {
            RTStyle Me;
            return StyleConstants.isStrikeThrough(Me.myStyle);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $StrikeThrough;
    }

    private void initVars() {
        Me.myStyle = null;
    }
}
