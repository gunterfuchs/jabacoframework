/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Collection;
import VB.Global;
import VB.IJabacoClass;
import VB.IJabacoContainer;
import VB.IJabacoControl;
import VB.PictureBox;
import VB.VBControlExtender$Timer;
import VBA.Conversion;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBMouseEvent;
import VBA.VBVariant;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

public class VBControlExtender
implements IJabacoClass,
MouseListener,
MouseMotionListener,
KeyListener {
    private VBControlExtender$Timer myTimer;
    private PictureBox Owner;
    private Collection Controls;
    private Collection DeathList;

    public void _DblClick(String ControlID) {
    }

    public void _Click(String ControlID) {
    }

    public void _KeyDown(String ControlID, int KeyCode, int Shift) {
    }

    public void _KeyPress(String ControlID, int KeyAscii) {
    }

    public void _KeyUp(String ControlID, int KeyCode, int Shift) {
    }

    public void _MouseDown(String ControlID, int Button, int Shift, float X, float Y) {
    }

    public void _MouseMove(String ControlID, int Button, int Shift, float X, float Y) {
    }

    public void _MouseUp(String ControlID, int Button, int Shift, float X, float Y) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBControlExtender(IJabacoContainer RefOwner) {
        VBControlExtender Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.Owner = RefOwner.$ContentFrame();
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
     * Unable to fully structure code
     */
    public IJabacoControl GetControl(String ControlID) {
        block8: {
            GetControl = null;
            Err = null;
            h8 = 0;
            h9 = 0;
            i = 0;
            tmpComponents = new VBArray();
            try {
                tmpComponents = VBArray.createVBArray(Me.Owner.getComponents());
                i = 0;
            }
            catch (Throwable v0) {}
            h8 = tmpComponents.getUBound(1);
            h9 = 1;
            while (i <= h8) {
                if (Strings.StrComp(Me.GetControlID((Component)tmpComponents.valueOfObj(i)), ControlID) == 0) {
                    GetControl = (IJabacoControl)((Component)tmpComponents.valueOfObj(i));
                    break;
                }
                i += h9;
            }
lbl20:
            // 3 sources

            return GetControl;
lbl22:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            break block8;
            catch (Throwable v0) {
            }
        }
        var4_8 = null;
        Err = v0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean AddListener(IJabacoControl RefOwner) {
        boolean AddListener = false;
        Throwable Err = null;
        JComponent tmpComponent = null;
        try {
            VBControlExtender Me;
            tmpComponent = (JComponent)((Object)RefOwner);
            if (!(tmpComponent != null)) {
                return AddListener;
            }
            tmpComponent.addMouseMotionListener(Me);
            tmpComponent.addMouseListener(Me);
            tmpComponent.addKeyListener(Me);
            return true;
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return AddListener;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean AddControl(String ControlID, IJabacoControl RefControl, float Left, float Top, float Width, float Height, boolean Visible) {
        boolean AddControl = false;
        Throwable Err = null;
        try {
            VBControlExtender Me;
            if (!Me.AddControlID(ControlID, RefControl)) return AddControl;
            Me.Owner.add((JComponent)((Object)RefControl));
            RefControl.$Left(Left);
            RefControl.$Top(Top);
            RefControl.$Width(Width);
            RefControl.$Height(Height);
            RefControl.$Visible(Visible);
            Me.AddListener(RefControl);
            Me.Owner.invalidate();
            Me.Owner.$Parent().repaint();
            return true;
        }
        catch (Throwable throwable) {
            Object var10_10 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return AddControl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void RemoveControl(String ControlID) {
        Throwable Err = null;
        try {
            VBControlExtender Me;
            if (!Me.IsControlID(ControlID)) return;
            Me.DeathList.Add(VBVariant.valueOf(ControlID));
            Me.myTimer.$Enabled(true);
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
    private String GetKeyFromControl(Object Control) {
        String GetKeyFromControl = "";
        Throwable Err = null;
        try {
            return Conversion.CStr(VBVariant.valueOf(Control.hashCode()));
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetKeyFromControl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean IsControlID(String ControlID) {
        boolean IsControlID = false;
        Throwable Err = null;
        Object tmpControl = null;
        try {
            VBControlExtender Me;
            tmpControl = Me.GetControl(ControlID);
            if (tmpControl == null) {
                return false;
            }
            boolean bl = true;
            if (!bl) return false;
            return Me.Controls.KeyExists(Conversion.CStr(VBVariant.valueOf(tmpControl.hashCode())));
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return IsControlID;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean AddControlID(String ControlID, Object Control) {
        boolean AddControlID = false;
        Throwable Err = null;
        try {
            VBControlExtender Me;
            if (Me.IsControlID(ControlID)) return AddControlID;
            Me.Controls.Add(VBVariant.valueOf(ControlID), Me.GetKeyFromControl(Control));
            return true;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return AddControlID;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String GetControlID(Object Control) {
        String GetControlID = "";
        Throwable Err = null;
        try {
            VBControlExtender Me;
            return Me.Controls.Item(Me.GetKeyFromControl(Control)).toString();
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetControlID;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void mousePressed(MouseEvent e) {
        Throwable Err = null;
        Component tmpComponents = null;
        try {
            VBControlExtender Me;
            tmpComponents = (Component)e.getSource();
            if (tmpComponents == null) return;
            if (e.getX() > 0 & e.getY() > 0 & e.getX() < tmpComponents.getWidth() & e.getY() < tmpComponents.getHeight()) {
                if (!(e.getClickCount() >= 2)) {
                    Me._Click(Me.GetControlID(e.getSource()));
                } else {
                    Me._DblClick(Me.GetControlID(e.getSource()));
                }
            }
            Me._MouseDown(Me.GetControlID(e.getSource()), VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
            return;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
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
    public void mouseReleased(MouseEvent e) {
        Throwable Err = null;
        try {
            VBControlExtender Me;
            Me._MouseUp(Me.GetControlID(e.getSource()), VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object Err = null;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object Err = null;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void mouseMoved(MouseEvent e) {
        Throwable Err = null;
        try {
            VBControlExtender Me;
            Me._MouseMove(Me.GetControlID(e.getSource()), VBMouseEvent.getVBMouseButton(e), VBMouseEvent.getVBMouseShift(e), e.getX(), e.getY());
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
    @Override
    public void keyTyped(KeyEvent e) {
        Throwable Err = null;
        try {
            VBControlExtender Me;
            Me._KeyPress(Me.GetControlID(e.getSource()), e.getKeyChar());
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
    @Override
    public void keyPressed(KeyEvent e) {
        Throwable Err = null;
        try {
            VBControlExtender Me;
            Me._KeyDown(Me.GetControlID(e.getSource()), e.getKeyCode(), Global.KeyEventToShiftConstant(e));
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
    @Override
    public void keyReleased(KeyEvent e) {
        Throwable Err = null;
        try {
            VBControlExtender Me;
            Me._KeyUp(Me.GetControlID(e.getSource()), e.getKeyCode(), Global.KeyEventToShiftConstant(e));
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object Err = null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void myTimer_Timer() {
        boolean bInProcess;
        block8: {
            VBControlExtender Me;
            Throwable throwable2;
            Throwable Err = null;
            bInProcess = false;
            if (bInProcess) return;
            bInProcess = true;
            String tmpControlID = "";
            JComponent tmpControl = null;
            {
                catch (Throwable throwable2) {}
            }
            tmpControlID = Me.DeathList.Item(1).toString();
            tmpControl = (JComponent)((Object)Me.GetControl(tmpControlID));
            if (!(tmpControl == null)) {
                Me.Owner.remove(tmpControl);
                Me.Controls.Remove(tmpControl.toString());
                Me.DeathList.Remove(1);
            } else {
                Me.DeathList.Remove(1);
            }
            if (Me.DeathList.Count() == 0) {
                Me.Owner.$Parent().invalidate();
                Me.Owner.$Parent().repaint();
                Me.myTimer.$Enabled(false);
            }
            break block8;
            Object var2_5 = null;
            Err = throwable2;
        }
        bInProcess = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            VBControlExtender Me;
            Me.myTimer.$Interval(1.0f);
            Me.myTimer.$Enabled(false);
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        VBControlExtender Me;
        Me.myTimer = new VBControlExtender$Timer();
        Me.myTimer.setOwner(Me, 1);
        Me.Owner = null;
        Me.Controls = new Collection();
        Me.DeathList = new Collection();
    }
}
