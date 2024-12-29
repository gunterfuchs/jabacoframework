/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Dialog$PictureBox;
import VB.Dialog$VBMenuBar;
import VB.Dialog$VBToolBar;
import VB.FormBorderStyleConstants;
import VB.FormShowConstants;
import VB.Frame;
import VB.Global;
import VB.IJabacoControl;
import VB.IJabacoForm;
import VB.ILoadAdapter;
import VB.IMenuItem;
import VB.IToolBarItem;
import VB.LoadAdapter;
import VB.MousePointerConstants;
import VB.PictureBox;
import VB.StartUpPositionConstants;
import VB.VBMenuBar;
import VB.VBToolBar;
import VB.fmBorderStyle;
import VBA.IResource;
import VBA.Interaction;
import VBA.VBArray;
import VBA.VBVariant;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.WindowConstants;

public class Dialog
extends JDialog
implements ILoadAdapter,
IJabacoForm,
ComponentListener,
WindowFocusListener {
    private boolean myInitLookAndFeelFlag;
    private Dialog$VBMenuBar myMenuBar;
    private Dialog$VBToolBar myToolBar;
    private StartUpPositionConstants StartUpPositionVal;
    private boolean StartVisibility;
    private int StartLeft;
    private int StartTop;
    private float StartWidth;
    private float StartHeight;
    private boolean FormLoaded;
    private String myTag;
    private long myMenuBarBackColor;
    private long myMenuBarForeColor;
    private long myToolBarBackColor;
    private long myToolBarForeColor;
    private IResource myMouseIcon;
    private IResource myIcon;
    private Dialog$PictureBox myContent;

    /*
     * Unable to fully structure code
     */
    public void add(Component Component) {
        block9: {
            block8: {
                Err = null;
                Component2 = null;
                if (!(Component instanceof IJabacoControl != false)) ** GOTO lbl9
                Component2 = (IJabacoControl)Component;
                Component2.ResizeTriggerInit(Me.$Width(), Me.$Height());
lbl9:
                // 2 sources

                if (Me.myContent == null) {
                    super.getContentPane().add(Component);
                    break block8;
                }
                Me.myContent.add(Component);
            }
lbl16:
            // 2 sources

            return;
lbl18:
            // 1 sources

            while (true) {
                Interaction.MsgBox(Err);
                ** continue;
                break;
            }
            catch (Throwable v0) {
                break block9;
            }
            finally {
            }
        }
        var3_4 = null;
        Err = v0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Class_Initialize() {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$BorderStyle(fmBorderStyle.fmBorderStyleNone);
            super.getContentPane().add(Me.myContent);
            Me.myContent.$Visible(true);
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
    public JDialog $Parent() {
        Dialog $Parent = null;
        Throwable Err = null;
        try {
            Dialog Me;
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
    public Dialog() {
        Dialog Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.$Parent().setVisible(false);
            Me.FormLoaded = false;
            Me.myMenuBar.$Visible(false);
            Me.myToolBar.$Visible(false);
            Me.$Parent().setJMenuBar(Me.myMenuBar);
            Me.$Parent().getContentPane().add((Component)Me.myToolBar, BorderLayout.NORTH);
            Me.Class_Initialize();
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
    public void fireLoaded() {
        Dialog Me;
        Throwable Err = null;
        LoadAdapter tmpFireAdapter = new LoadAdapter(Me, Me);
        try {
            tmpFireAdapter.fireLoaded();
            return;
        }
        catch (Throwable throwable) {
            Object var2_3 = null;
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
    public void fireLoaded(Object sender) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.FormLoaded = true;
            Me.$Parent().pack();
            Me.$Height(Me.$Height() + (Me.StartHeight - (float)Me.$Parent().getContentPane().getHeight()));
            Me.$Width(Me.$Width() + (Me.StartWidth - (float)Me.$Parent().getContentPane().getWidth()));
            Me.myContent.$Parent().setSize(new Dimension((int)Me.$Width(), (int)Me.$Height()));
            Me.Form_Load();
            Global.DoEvents();
            if (Me.myMenuBar.$Visible()) {
                Me.$Height(Me.$Height() + (float)Me.myMenuBar.$Height());
            }
            if (Me.myToolBar.$Visible()) {
                Me.$Height(Me.$Height() + (float)Me.myToolBar.$Height());
            }
            Me.$StartUpPosition(Me.$StartUpPosition());
            Me.Form_Resize();
            Me.$Parent().addWindowFocusListener(Me);
            Me.$Parent().addComponentListener(Me);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void windowGainedFocus(WindowEvent arg2) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_GotFocus();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void windowLostFocus(WindowEvent arg2) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_LostFocus();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void componentHidden(ComponentEvent e) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_Deactivate();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void componentMoved(ComponentEvent e) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_Move();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void componentResized(ComponentEvent e) {
        Object var3_3;
        Dialog Me;
        Throwable Err = null;
        try {
            Me.Form_Resize();
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            Me.AnchorResize();
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void componentShown(ComponentEvent e) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_Activate();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Show() {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.$Parent().show();
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
    public void Show(FormShowConstants Modal) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.$Parent().setModal(true);
            Me.$Parent().show();
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
    public void SetDefaultClose() {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
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
    public StartUpPositionConstants $StartUpPosition() {
        StartUpPositionConstants $StartUpPosition = new StartUpPositionConstants();
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.StartUpPositionVal;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $StartUpPosition;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $StartUpPosition(StartUpPositionConstants val) {
        Throwable Err = null;
        Dimension tmpDimension = null;
        try {
            block4: {
                Dialog Me;
                block3: {
                    block2: {
                        if (val.compareTo(StartUpPositionConstants.vbStartUpScreen) == 0) break block2;
                        if (val.compareTo(StartUpPositionConstants.vbStartUpManual) == 0) break block3;
                        break block4;
                    }
                    tmpDimension = Toolkit.getDefaultToolkit().getScreenSize();
                    super.setLocation((int)((double)((float)tmpDimension.width - Me.$Width()) / (double)2), (int)((double)((float)tmpDimension.height - Me.$Height()) / (double)2));
                    break block4;
                }
                super.setLocation(Me.StartLeft, Me.StartTop);
            }
            Me.StartUpPositionVal = val;
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
    public VBMenuBar $MenuBar() {
        VBMenuBar $MenuBar = null;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myMenuBar;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MenuBar;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBToolBar $ToolBar() {
        VBToolBar $ToolBar = null;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myToolBar;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ToolBar;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FormBorderStyleConstants $BorderStyle() {
        FormBorderStyleConstants $BorderStyle = new FormBorderStyleConstants();
        Throwable Err = null;
        try {
            Dialog Me;
            if (super.isResizable()) {
                return FormBorderStyleConstants.vbSizable;
            }
            if (!super.isUndecorated()) return FormBorderStyleConstants.vbFixedDialog;
            return FormBorderStyleConstants.vbBSNone;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $BorderStyle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Close() {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.$Parent().dispose();
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
    public void $BorderStyle(FormBorderStyleConstants v) {
        Throwable Err = null;
        FormBorderStyleConstants h5 = new FormBorderStyleConstants();
        h5 = null;
        try {
            Dialog Me;
            h5 = v;
            if (h5.compareTo(FormBorderStyleConstants.vbBSNone) == 0) {
                super.setResizable(false);
                super.setUndecorated(true);
                return;
            }
            if (h5.compareTo(FormBorderStyleConstants.vbFixedDialog) == 0) {
                Me.$Parent().setResizable(false);
                return;
            }
            if (h5.compareTo(FormBorderStyleConstants.vbFixedSingle) == 0) {
                Me.$Parent().setResizable(false);
                return;
            }
            if (h5.compareTo(FormBorderStyleConstants.vbFixedToolWindow) == 0) {
                Me.$Parent().setResizable(false);
                return;
            }
            if (h5.compareTo(FormBorderStyleConstants.vbSizable) == 0) {
                Me.$Parent().setResizable(true);
                return;
            }
            if (h5.compareTo(FormBorderStyleConstants.vbSizableToolWindow) != 0) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.$Parent().setResizable(true);
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
    public String $Caption() {
        String $Caption = "";
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.getTitle();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Caption;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Caption(String v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.setTitle(v);
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
    public long $MenuBackColor() {
        long $MenuBackColor = 0L;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myMenuBarBackColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MenuBackColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $MenuBackColor(long v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myMenuBarBackColor = v;
            Me.myToolBar.$Parent().repaint();
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
    @Override
    public long $MenuForeColor() {
        long $MenuForeColor = 0L;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myMenuBarForeColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MenuForeColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $MenuForeColor(long v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myMenuBarForeColor = v;
            Me.myToolBar.$Parent().repaint();
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
    @Override
    public long $ToolBackColor() {
        long $ToolBackColor = 0L;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myToolBarBackColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ToolBackColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $ToolBackColor(long v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myToolBarBackColor = v;
            Me.myToolBar.$Parent().repaint();
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
    @Override
    public long $ToolForeColor() {
        long $ToolForeColor = 0L;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myToolBarForeColor;
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ToolForeColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $ToolForeColor(long v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myToolBarForeColor = v;
            Me.myToolBar.$Parent().repaint();
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
    public IResource $Icon() {
        IResource $Icon = null;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myIcon;
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
    public void $Icon(IResource Path) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myIcon = Path;
            Me.$Parent().setIconImage(Global.LoadPicture(Path));
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ArrayList $Controls() {
        $Controls = null;
        Err = null;
        h8 = 0;
        h9 = 0;
        pbControl = null;
        h11 = 0;
        h12 = 0;
        frControl = null;
        comp = new VBArray();
        try {
            comp = VBArray.createVBArray(Me.getParentContainer().getComponents());
        }
        catch (Throwable v0) {
            var3_10 = null;
            Err = v0;
        }
        try {
            $Controls = new ArrayList<Object>();
        }
        catch (Throwable v1) {
            var3_10 = null;
            Err = v1;
        }
        i = 0;
        v = 0;
        i = comp.getUBound(1);
        h8 = 0;
        h9 = -1 * 1;
        if (true) ** GOTO lbl113
        do {
            block30: {
                block29: {
                    block28: {
                        try {
                            $Controls.add((Component)comp.valueOfObj(i));
                        }
                        catch (Throwable v2) {
                            var3_10 = null;
                            Err = v2;
                        }
                        if ((Component)comp.valueOfObj(i) instanceof PictureBox != false) break block28;
                        if ((Component)comp.valueOfObj(i) instanceof Frame != false) break block29;
                        break block30;
                    }
                    try {
                    }
                    catch (Throwable v3) {
                        var3_10 = null;
                        Err = v3;
                    }
                    try {
                        pbControl = (PictureBox)((Component)comp.valueOfObj(i));
                    }
                    catch (Throwable v4) {
                        var3_10 = null;
                        Err = v4;
                    }
                    v = 0;
                    h11 = pbControl.getComponentCount() - 1;
                    h12 = 1;
                    while (v <= h11) {
                        try {
                            $Controls.add(pbControl.$Parent().getComponent(v));
                        }
                        catch (Throwable v5) {
                            var3_10 = null;
                            Err = v5;
                        }
                        v += h12;
                    }
                    try {
                        break block30;
                    }
                    catch (Throwable v6) {
                        var3_10 = null;
                        Err = v6;
                    }
                }
                try {
                    frControl = (Frame)((Component)comp.valueOfObj(i));
                }
                catch (Throwable v7) {
                    var3_10 = null;
                    Err = v7;
                }
                v = 0;
                h11 = frControl.getComponentCount() - 1;
                h12 = 1;
                while (v <= h11) {
                    try {
                        $Controls.add(frControl.$Parent().getComponent(v));
                    }
                    catch (Throwable v8) {
                        var3_10 = null;
                        Err = v8;
                    }
                    v += h12;
                }
                try {
                }
                catch (Throwable v9) {
                    var3_10 = null;
                    Err = v9;
                }
            }
            i += h9;
lbl113:
            // 2 sources

            v10 = i;
            v11 = h8;
            if (h9 < 0) {
                if (v10 < v11) {
                    v12 = false;
                    continue;
                }
                v12 = true;
                continue;
            }
            if (v10 > v11) {
                v12 = false;
                continue;
            }
            v12 = true;
        } while (v12);
        return $Controls;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Container getParentContainer() {
        Throwable throwable2;
        Throwable Err;
        Container getParentContainer;
        block31: {
            Dialog Me;
            getParentContainer = null;
            Err = null;
            int h8 = 0;
            int h9 = 0;
            VBArray comp = new VBArray();
            int i = 0;
            comp = VBArray.createVBArray(Me.getComponents());
            Container rootComp = null;
            i = 0;
            {
                catch (Throwable throwable2) {}
            }
            h8 = comp.getUBound(1);
            h9 = 1;
            boolean bl = true;
            do {
                block32: {
                    if (bl && !(bl = false)) {
                        if (true) continue;
                    }
                    break block32;
                    break block31;
                }
                if (((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JRootPane")) {
                    rootComp = (Container)((Component)comp.valueOfObj(i));
                }
                i += h9;
            } while (i <= h8);
            comp = VBArray.createVBArray(rootComp.getComponents());
            Container layerComp = null;
            i = 0;
            {
                catch (Throwable throwable2) {}
            }
            h8 = comp.getUBound(1);
            h9 = 1;
            boolean bl2 = true;
            do {
                block33: {
                    if (bl2 && !(bl2 = false)) {
                        if (true) continue;
                    }
                    break block33;
                    catch (Throwable throwable2) {
                        break block31;
                    }
                    break block31;
                }
                if (((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JLayeredPane")) {
                    layerComp = (Container)((Component)comp.valueOfObj(i));
                }
                i += h9;
            } while (i <= h8);
            comp = VBArray.createVBArray(layerComp.getComponents());
            Container panelComp = null;
            i = 0;
            {
                catch (Throwable throwable2) {}
            }
            h8 = comp.getUBound(1);
            h9 = 1;
            boolean bl3 = true;
            do {
                block34: {
                    if (bl3 && !(bl3 = false)) {
                        if (true) continue;
                    }
                    break block34;
                    catch (Throwable throwable2) {
                        break block31;
                    }
                    break block31;
                }
                if (((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JPanel")) {
                    panelComp = (Container)((Component)comp.valueOfObj(i));
                }
                i += h9;
            } while (i <= h8);
            comp = VBArray.createVBArray(panelComp.getComponents());
            Container boxComp = null;
            i = 0;
            {
                catch (Throwable throwable2) {}
            }
            h8 = comp.getUBound(1);
            h9 = 1;
            boolean bl4 = true;
            do {
                block35: {
                    if (bl4 && !(bl4 = false)) {
                        if (true) continue;
                    }
                    break block35;
                    catch (Throwable throwable2) {
                        break block31;
                    }
                    break block31;
                }
                if (((Component)comp.valueOfObj(i)).getClass().getName().equals("VB.Dialog$PictureBox")) {
                    boxComp = (Container)((Component)comp.valueOfObj(i));
                }
                i += h9;
            } while (i <= h8);
            getParentContainer = boxComp;
            return getParentContainer;
            catch (Throwable throwable2) {
                break block31;
            }
            finally {
            }
        }
        Object var3_11 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return getParentContainer;
    }

    /*
     * Unable to fully structure code
     */
    private void AnchorResize() {
        block8: {
            Err = null;
            h6 = 0;
            h7 = 0;
            myCont = null;
            comp = new VBArray();
            i = 0;
            try {
                comp = VBArray.createVBArray(Me.getParentContainer().getComponents());
                i = 0;
            }
            catch (Throwable v0) {}
            h6 = comp.getUBound(1);
            h7 = 1;
            while (i <= h6) {
                if ((Component)comp.valueOfObj(i) instanceof IJabacoControl != false) {
                    myCont = (IJabacoControl)((Component)comp.valueOfObj(i));
                    myCont.ResizeTrigger(Me.$Parent().getContentPane().getWidth(), Me.$Parent().getContentPane().getHeight());
                }
                i += h7;
            }
lbl21:
            // 2 sources

            return;
lbl23:
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
        var2_7 = null;
        Err = v0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public float $Left() {
        float $Left = 0.0f;
        Throwable Err = null;
        try {
            Dialog Me;
            if (!(!Me.FormLoaded)) return Me.getLocation().x;
            return Me.StartLeft;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Left;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Left(float v) {
        Throwable Err = null;
        try {
            Dialog Me;
            if (!Me.FormLoaded) {
                Me.StartLeft = (int)v;
            }
            Me.setLocation((int)v, Me.getLocation().y);
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
    public float $Top() {
        float $Top = 0.0f;
        Throwable Err = null;
        try {
            Dialog Me;
            if (!(!Me.FormLoaded)) return Me.getLocation().y;
            return Me.StartTop;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Top;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void $Top(float v) {
        Throwable Err = null;
        try {
            Dialog Me;
            if (!Me.FormLoaded) {
                Me.StartTop = (int)v;
            }
            Me.setLocation(Me.getLocation().x, (int)v);
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
    public float $Width() {
        float $Width = 0.0f;
        Throwable Err = null;
        try {
            Dialog Me;
            if (!(!Me.FormLoaded)) return Me.getSize().width;
            return Me.StartWidth;
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
    @Override
    public void $Width(float v) {
        Throwable Err = null;
        try {
            Dialog Me;
            if (!Me.FormLoaded) {
                Me.StartWidth = v;
            }
            Me.setSize((int)v, Me.getSize().height);
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
    public float $Height() {
        float $Height = 0.0f;
        Throwable Err = null;
        try {
            Dialog Me;
            if (!(!Me.FormLoaded)) return Me.getSize().height;
            return Me.StartHeight;
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
    @Override
    public void $Height(float v) {
        Throwable Err = null;
        try {
            Dialog Me;
            if (!Me.FormLoaded) {
                Me.StartHeight = v;
            }
            Me.setSize(Me.getSize().width, (int)v);
            Me.Refresh();
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
    public VBVariant Move(float Left, float Top, float Width, float Height) {
        VBVariant Move = new VBVariant();
        Throwable Err = null;
        try {
            Dialog Me;
            Me.$Left(Left);
            if (Top != (float)(-1 * 1)) {
                Me.$Top(Top);
            }
            if (Width != (float)(-1 * 1)) {
                Me.$Width(Width);
            }
            if (!(Height != (float)(-1 * 1))) {
                return Move;
            }
            Me.$Height(Height);
            return Move;
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Move;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean $Enabled() {
        boolean $Enabled = false;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.isEnabled();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Enabled;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Enabled(boolean v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.setEnabled(v);
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
    public boolean $Visible() {
        boolean $Visible = false;
        Throwable Err = null;
        try {
            Dialog Me;
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
    @Override
    public void $Visible(boolean v) {
        Throwable Err = null;
        try {
            Dialog Me;
            if (Me.FormLoaded) {
                Me.setVisible(v);
                return;
            }
            Me.StartVisibility = v;
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
    public MousePointerConstants $MousePointer() {
        MousePointerConstants $MousePointer = new MousePointerConstants();
        Throwable Err = null;
        try {
            Dialog Me;
            return Global.JCursorToVBMousePointer(Me.$Parent().getCursor());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MousePointer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $MousePointer(MousePointerConstants v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.$Parent().setCursor(Global.VBMousePointerToJCursor(v));
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
    public IResource $MouseIcon() {
        IResource $MouseIcon = null;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myMouseIcon;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $MouseIcon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $MouseIcon(IResource v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myMouseIcon = v;
            Me.$Parent().setCursor(Global.VBMouseIconToJCursor(v, Me));
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
    public boolean $CanGetFocus() {
        boolean $CanGetFocus = false;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.$Parent().isFocusable();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CanGetFocus;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CanGetFocus(boolean v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.$Parent().setFocusable(v);
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
    public void SetFocus() {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.$Parent().requestFocus();
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
    public void Refresh() {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.$Parent().invalidate();
            Me.$Parent().repaint(0, 0, 0, (int)Me.$Width(), (int)Me.$Height());
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
    public void myMenuBar_Click(IMenuItem MenuItem) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_MenuClick(MenuItem);
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
    public void myToolBar_Click(IToolBarItem ToolBarItem) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_ToolBarClick(ToolBarItem);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    public void Form_Activate() {
        Object Err = null;
    }

    public void Form_Deactivate() {
        Object Err = null;
    }

    public void Form_GotFocus() {
        Object Err = null;
    }

    public void Form_LostFocus() {
        Object Err = null;
    }

    public void Form_Load() {
        Object Err = null;
    }

    public void Form_Resize() {
        Object Err = null;
    }

    public void Form_Move() {
        Object Err = null;
    }

    public void Form_MenuClick(IMenuItem MenuItem) {
        Object Err = null;
    }

    public void Form_ToolBarClick(IToolBarItem ToolBarItem) {
        Object Err = null;
    }

    public void Form_Click() {
        Object Err = null;
    }

    public void Form_DblClick() {
        Object Err = null;
    }

    public void Form_KeyDown(int KeyCode, int Shift) {
        Object Err = null;
    }

    public void Form_KeyPress(int KeyAscii) {
        Object Err = null;
    }

    public void Form_KeyUp(int KeyCode, int Shift) {
        Object Err = null;
    }

    public void Form_MouseDown(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Form_MouseMove(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Form_MouseUp(int Button, int Shift, float X, float Y) {
        Object Err = null;
    }

    public void Form_Paint(Graphics g) {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void myContent_MouseUp(int Button, int Shift, float X, float Y) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_MouseUp(Button, Shift, X, Y);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void myContent_MouseMove(int Button, int Shift, float X, float Y) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_MouseMove(Button, Shift, X, Y);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void myContent_MouseDown(int Button, int Shift, float X, float Y) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_MouseDown(Button, Shift, X, Y);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void myContent_Click() {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_Click();
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
    public void myContent_DblClick() {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_DblClick();
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
    public void myContent_KeyDown(int KeyCode, int Shift) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_KeyDown(KeyCode, Shift);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void myContent_KeyPress(int KeyAscii) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_KeyPress(KeyAscii);
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
    public void myContent_KeyUp(int KeyCode, int Shift) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_KeyUp(KeyCode, Shift);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void myContent_Paint(Graphics g) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.Form_Paint(g);
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
    public int $Transparency() {
        int $Transparency = 0;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$Transparency();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Transparency;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Transparency(int v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$Transparency(v);
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
    public boolean $AntiAliasing() {
        boolean $AntiAliasing = false;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$AntiAliasing();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AntiAliasing;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $AntiAliasing(boolean v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$AntiAliasing(v);
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
    public boolean $AutoRedraw() {
        boolean $AutoRedraw = false;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$AutoRedraw();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $AutoRedraw;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $AutoRedraw(boolean v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$AutoRedraw(v);
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
    public IResource $Picture() {
        IResource $Picture = null;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$Picture();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Picture;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $Picture(IResource Path) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$Picture(Path);
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
    public int $DrawWidth() {
        int $DrawWidth = 0;
        Throwable Err = null;
        try {
            Dialog Me;
            Me.$Transparency(Me.myContent.$DrawWidth());
            return $DrawWidth;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $DrawWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $DrawWidth(int v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$DrawWidth(v);
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
    public void PSet(float x, float y) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.PSet(x, y);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void PSet(float x, float y, long col) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.PSet(x, y, col);
            return;
        }
        catch (Throwable throwable) {
            Object var6_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Line(float x, float y) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.Line(x, y);
            return;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Line(float x1, float y1, float x2, float y2) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.Line(x1, y1, x2, y2);
            return;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Line(float x1, float y1, float x2, float y2, boolean Rect) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.Line(x1, y1, x2, y2, Rect);
            return;
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Line(float x1, float y1, float x2, float y2, boolean Rect, long FillColor) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.Line(x1, y1, x2, y2, Rect, FillColor);
            return;
        }
        catch (Throwable throwable) {
            Object var9_8 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Circle(float x, float y, float radius) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.Circle(x, y, radius);
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Circle(float x, float y, float radius, long color) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.Circle(x, y, radius, color);
            return;
        }
        catch (Throwable throwable) {
            Object var7_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect, long FillColor) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.Circle(x, y, radius, color, startAngle, endAngle, aspect, FillColor);
            return;
        }
        catch (Throwable throwable) {
            Object var12_10 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void PaintPicture(Image refImage, float x, float y) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.PaintPicture(refImage, (int)x, (int)y);
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Print(String text, float x1, float y1) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.Print(text, x1, y1);
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Cls() {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.Cls();
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
    public Image $Image() {
        Image $Image = null;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$Image();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Image;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public BufferedImage $ImageBuffer() {
        BufferedImage $ImageBuffer = null;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$ImageBuffer();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ImageBuffer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $Point(float x, float y) {
        long $Point = 0L;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$Point(x, y);
        }
        catch (Throwable throwable) {
            Object var6_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Point;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int TextWidth(String text) {
        int TextWidth = 0;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.TextWidth(text);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return TextWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int TextHeight(String text) {
        int TextHeight = 0;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.TextHeight(text);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return TextHeight;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Print(String text) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.Print(text);
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
    public long $CurrentX() {
        long $CurrentX = 0L;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$CurrentX();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CurrentX;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CurrentX(long v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$CurrentX(v);
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
    public long $CurrentY() {
        long $CurrentY = 0L;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$CurrentY();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $CurrentY;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $CurrentY(long v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$CurrentY(v);
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
    public float $ScaleLeft() {
        float $ScaleLeft = 0.0f;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$Left();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleLeft;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $ScaleTop() {
        float $ScaleTop = 0.0f;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$Top();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleTop;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $ScaleWidth() {
        float $ScaleWidth = 0.0f;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$Width();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleWidth;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float $ScaleHeight() {
        float $ScaleHeight = 0.0f;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$Height();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ScaleHeight;
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
            Dialog Me;
            if (!(Me.myContent == null)) return Me.myContent.$Parent().getBackground();
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
            Dialog Me;
            if (!(Me.myContent == null)) return Me.myContent.$Parent().getForeground();
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
    public long $BackColor() {
        long $BackColor = 0L;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$BackColor();
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
    public void $BackColor(long v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$BackColor(v);
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
    public long $ForeColor() {
        long $ForeColor = 0L;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$ForeColor();
        }
        catch (Throwable throwable) {
            Object var4_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ForeColor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $ForeColor(long v) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$ForeColor(v);
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
    public String $FontName() {
        String $FontName = "";
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$FontName();
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
    public void $FontName(String val) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$FontName(val);
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
    public boolean $FontBold() {
        boolean $FontBold = false;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$FontBold();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontBold;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontBold(boolean val) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$FontBold(val);
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
    public boolean $FontItalic() {
        boolean $FontItalic = false;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.$FontItalic();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $FontItalic;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $FontItalic(boolean val) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$FontItalic(val);
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
            Dialog Me;
            return Me.myContent.$FontSize();
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
    public void $FontSize(int val) {
        Throwable Err = null;
        try {
            Dialog Me;
            Me.myContent.$FontSize(val);
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
    public Font $Font() {
        Font $Font = null;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent.getFont();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Font;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PictureBox $ContentFrame() {
        PictureBox $ContentFrame = null;
        Throwable Err = null;
        try {
            Dialog Me;
            return Me.myContent;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $ContentFrame;
    }

    private void initVars() {
        Dialog Me;
        Me.myInitLookAndFeelFlag = Global.LookAndFeelManager().isInitialized();
        Me.myMenuBar = new Dialog$VBMenuBar(Me);
        Me.myMenuBar.setOwner(Me, 1);
        Me.myToolBar = new Dialog$VBToolBar(Me);
        Me.myToolBar.setOwner(Me, 2);
        Me.StartUpPositionVal = StartUpPositionConstants.vbStartUpScreen;
        Me.StartVisibility = false;
        Me.StartLeft = 0;
        Me.StartTop = 0;
        Me.StartWidth = 0.0f;
        Me.StartHeight = 0.0f;
        Me.FormLoaded = false;
        Me.myTag = "";
        Me.myMenuBarBackColor = 0L;
        Me.myMenuBarForeColor = 0L;
        Me.myToolBarBackColor = 0L;
        Me.myToolBarForeColor = 0L;
        Me.myMouseIcon = null;
        Me.myIcon = null;
        Me.myContent = new Dialog$PictureBox();
        Me.myContent.setOwner(Me, 3);
    }

    public VBVariant Move(float Left) {
        Dialog Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        Dialog Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        Dialog Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }

    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle) {
        Dialog Me;
        Me.Circle(x, y, radius, color, startAngle, endAngle, 1.0f, -1 * 1);
    }

    public void Circle(float x, float y, float radius, long color, float startAngle, float endAngle, float aspect) {
        Dialog Me;
        Me.Circle(x, y, radius, color, startAngle, endAngle, aspect, -1 * 1);
    }
}
