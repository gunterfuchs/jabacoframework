/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VB.IJabacoForm;
import VB.IToolBarItem;
import VB.VBToolBarItem;
import VB.fmPicturePosition;
import VBA.Constants;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToolBar;

public class VBToolBar
extends JToolBar
implements IJabacoClass,
ActionListener {
    private long myForeColor;
    private long myBackColor;
    private IJabacoForm myOwner;

    public void _Visible(boolean b) {
    }

    public void _Click(IToolBarItem ToolBarItem) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Color getBackground() {
        Color getBackground = null;
        Throwable Err = null;
        try {
            VBToolBar Me;
            if (!(Me.myOwner == null)) return Information.RGBtoColor(Me.myOwner.$ToolBackColor());
            return super.getBackground();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getBackground;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Color getForeground() {
        Color getForeground = null;
        Throwable Err = null;
        try {
            VBToolBar Me;
            if (!(Me.myOwner == null)) return Information.RGBtoColor(Me.myOwner.$ToolForeColor());
            return super.getForeground();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getForeground;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Font getFont() {
        Font getFont = null;
        Throwable Err = null;
        try {
            VBToolBar Me;
            if (!(Me.myOwner == null)) return Me.myOwner.$Font();
            return super.getFont();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getFont;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBToolBar(IJabacoForm Owner) {
        VBToolBar Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myOwner = Owner;
            Me.Class_Initialize();
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
    private void GoClick(Object e) {
        VBToolBar Me;
        Throwable Err = null;
        IToolBarItem tmpComponent = null;
        try {
            tmpComponent = (IToolBarItem)e;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Me._Click(tmpComponent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Add(Component Component2) {
        VBToolBar Me;
        Object var3_4;
        Throwable Err = null;
        VBToolBarItem tmpItem = null;
        try {
            tmpItem = (VBToolBarItem)Component2;
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        try {
            super.add(Component2);
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        try {
            Me.$Visible(true);
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Visible() {
        boolean $Visible = false;
        Throwable Err = null;
        try {
            VBToolBar Me;
            return Me.isVisible();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Visible;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Visible(boolean v) {
        Throwable Err = null;
        try {
            VBToolBar Me;
            if (Me.$Parent().isVisible() == v) return;
            Me.$Parent().setVisible(v);
            if (Me.$Parent().isVisible() != v) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me._Visible(v);
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
    public JToolBar $Parent() {
        JToolBar $Parent = null;
        Throwable Err = null;
        try {
            VBToolBar Me;
            return Me;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $Height() {
        int $Height = 0;
        Throwable Err = null;
        try {
            VBToolBar Me;
            if (!Me.$Visible()) {
                return 0;
            }
            $Height = Me.$Parent().getHeight();
            if ($Height == 0) return (int)Me.$Parent().getPreferredSize().getHeight();
            return $Height;
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
    public void addSeperator() {
        Throwable Err = null;
        try {
            VBToolBar Me;
            Me.addSeperator(20);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void addSeperator(int width) {
        Throwable Err = null;
        try {
            VBToolBar Me;
            Me.$Parent().addSeparator();
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
    public VBToolBarItem createToolBarItem(String ControlID, String Caption) {
        VBToolBarItem createToolBarItem = null;
        Throwable Err = null;
        try {
            VBToolBar Me;
            return Me.createToolBarItem(ControlID, Caption, Constants.vbNullString);
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createToolBarItem;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBToolBarItem createToolBarItem(String ControlID, String Caption, String ToolTip) {
        VBToolBarItem createToolBarItem = null;
        Throwable Err = null;
        try {
            VBToolBar Me;
            return Me.createToolBarItem(ControlID, Caption, ToolTip, null);
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createToolBarItem;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBToolBarItem createToolBarItem(String ControlID, String Caption, String ToolTip, IResource IconPath) {
        VBToolBarItem createToolBarItem = null;
        Throwable Err = null;
        try {
            VBToolBar Me;
            return Me.createToolBarItem(ControlID, Caption, ToolTip, IconPath, fmPicturePosition.fmPicturePositionLeftCenter);
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createToolBarItem;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBToolBarItem createToolBarItem(String ControlID, String Caption, String ToolTip, IResource IconPath, fmPicturePosition IconPosition) {
        VBToolBarItem createToolBarItem = null;
        Throwable Err = null;
        try {
            VBToolBar Me;
            return Me.createToolBarItem(ControlID, Caption, ToolTip, IconPath, fmPicturePosition.fmPicturePositionLeftCenter, null);
        }
        catch (Throwable throwable) {
            Object var8_8 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createToolBarItem;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBToolBarItem createToolBarItem(String ControlID, String Caption, String ToolTip, IResource IconPath, fmPicturePosition IconPosition, IResource RolloverIconPath) {
        VBToolBar Me;
        VBToolBarItem createToolBarItem = null;
        Throwable Err = null;
        VBToolBarItem tmpItem = new VBToolBarItem(Me);
        try {
            tmpItem.$Parent().addActionListener(Me);
            tmpItem.$Caption(Caption);
            tmpItem.$ControlID(ControlID);
            tmpItem.$ToolTip(ToolTip);
            tmpItem.$Visible(true);
            tmpItem.$Parent().setFont(Me.getFont());
            tmpItem.$Picture(IconPath);
            tmpItem.$PicturePosition(IconPosition);
            tmpItem.$RolloverPicture(RolloverIconPath);
            Me.Add(tmpItem);
            return tmpItem;
        }
        catch (Throwable throwable) {
            Object var9_10 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return createToolBarItem;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            VBToolBar Me;
            Me.$Parent().setFocusable(false);
            Me.$Parent().setMinimumSize(new Dimension(400, 400));
            Me.$Parent().setRollover(true);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Throwable Err = null;
        try {
            VBToolBar Me;
            Me.GoClick(e.getSource());
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        Me.myForeColor = 0L;
        Me.myBackColor = 0L;
        Me.myOwner = null;
    }
}
