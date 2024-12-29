/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.AbstractForm$VBMenuBar;
import VB.AbstractForm$VBToolBar;
import VB.FileSystem;
import VB.FormBorderStyleConstants;
import VB.FormWindowStateConstants;
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
import VB.VBFileHandler;
import VB.VBMenuBar;
import VB.VBToolBar;
import VBA.IResource;
import VBA.Interaction;
import VBA.VBArray;
import VBA.VBVariant;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class AbstractForm
extends JFrame
implements ILoadAdapter,
IJabacoForm,
ComponentListener,
WindowListener,
WindowFocusListener {
    private boolean myInitLookAndFeelFlag;
    private AbstractForm$VBMenuBar myMenuBar;
    private AbstractForm$VBToolBar myToolBar;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JFrame $Parent() {
        AbstractForm $Parent = null;
        Throwable Err = null;
        try {
            AbstractForm Me;
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
    public AbstractForm() {
        AbstractForm Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.$Parent().setVisible(false);
            Me.FormLoaded = false;
            Me.myMenuBar.$Visible(false);
            Me.myToolBar.$Visible(false);
            Me.$Parent().setJMenuBar(Me.myMenuBar);
            Me.$Parent().getContentPane().add((Component)Me.myToolBar, BorderLayout.NORTH);
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
        AbstractForm Me;
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
        Throwable throwable2;
        Throwable Err;
        block7: {
            AbstractForm Me;
            FormWindowStateConstants myMemWindowState;
            Err = null;
            try {
                Me.FormLoaded = true;
                myMemWindowState = new FormWindowStateConstants();
            }
            catch (Throwable throwable2) {
                break block7;
            }
            myMemWindowState = Me.$WindowState();
            Me.$Parent().setPreferredSize(new Dimension((int)(Me.$Width() + (Me.StartWidth - (float)Me.$Parent().getContentPane().getWidth())), (int)(Me.$Height() + (Me.StartHeight - (float)Me.$Parent().getContentPane().getHeight()))));
            Me.$Parent().pack();
            Me.$Height(Me.$Height() + (Me.StartHeight - (float)Me.$Parent().getContentPane().getHeight()));
            Me.$Width(Me.$Width() + (Me.StartWidth - (float)Me.$Parent().getContentPane().getWidth()));
            Me.Form_Load();
            Global.DoEvents();
            Me.StartLeft = (int)Me.$Left();
            Me.StartTop = (int)Me.$Top();
            if (Me.myMenuBar.$Visible()) {
                Me.$Height(Me.$Height() + (float)Me.myMenuBar.$Height());
            }
            if (Me.myToolBar.$Visible()) {
                Me.$Height(Me.$Height() + (float)Me.myToolBar.$Height());
            }
            Me.$StartUpPosition(Me.$StartUpPosition());
            Me.$WindowState(myMemWindowState);
            Me.$Visible(Me.StartVisibility);
            Me.Form_Resize();
            Me.$Parent().addWindowListener(Me);
            Me.$Parent().addWindowFocusListener(Me);
            Me.$Parent().addComponentListener(Me);
        }
        Object var3_4 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
    }

    @Override
    public void windowOpened(WindowEvent arg2) {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void windowClosing(WindowEvent arg2) {
        Object var3_3;
        AbstractForm Me;
        Throwable Err = null;
        try {
            Me.$Parent().setDefaultCloseOperation(0);
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        int close = 0;
        try {
            close = Me.Form_Unload();
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            if (close == 1) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            System.exit(0);
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return;
        }
    }

    @Override
    public void windowClosed(WindowEvent arg2) {
        Object Err = null;
    }

    @Override
    public void windowIconified(WindowEvent arg2) {
        Object Err = null;
    }

    @Override
    public void windowDeiconified(WindowEvent arg2) {
        Object Err = null;
    }

    @Override
    public void windowActivated(WindowEvent arg2) {
        Object Err = null;
    }

    @Override
    public void windowDeactivated(WindowEvent arg2) {
        Object Err = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void windowGainedFocus(WindowEvent arg2) {
        Throwable Err = null;
        try {
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
        AbstractForm Me;
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
            AbstractForm Me;
            Me.Form_Activate();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
            return;
        }
    }

    public int Form_Unload() {
        int Form_Unload = 0;
        Object Err = null;
        return Form_Unload;
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

    public void Form_KeyDown(int KeyCode, int Shift) {
        Object Err = null;
    }

    public void Form_KeyPress(int KeyAscii) {
        Object Err = null;
    }

    public void Form_KeyUp(int KeyCode, int Shift) {
        Object Err = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Show() {
        Throwable Err = null;
        try {
            AbstractForm Me;
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
    public void SetDefaultClose() {
        Throwable Err = null;
        try {
            AbstractForm Me;
            Me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            AbstractForm Me;
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
                AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
    public void Close(int FileNumber) {
        Throwable Err = null;
        try {
            FileSystem.Close(FileNumber);
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
    public void Close(VBFileHandler Handler) {
        Throwable Err = null;
        try {
            FileSystem.Close(Handler);
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
    public void $BorderStyle(FormBorderStyleConstants v) {
        Throwable Err = null;
        FormBorderStyleConstants h5 = new FormBorderStyleConstants();
        h5 = null;
        try {
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
    public FormWindowStateConstants $WindowState() {
        FormWindowStateConstants $WindowState = new FormWindowStateConstants();
        Throwable Err = null;
        int h5 = 0;
        h5 = 0;
        try {
            AbstractForm Me;
            h5 = super.getExtendedState();
            if (h5 == java.awt.Frame.ICONIFIED) {
                return FormWindowStateConstants.vbMinimized;
            }
            if (!(h5 == java.awt.Frame.MAXIMIZED_BOTH)) return FormWindowStateConstants.vbNormal;
            return FormWindowStateConstants.vbMaximized;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $WindowState;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $WindowState(FormWindowStateConstants val) {
        Throwable Err = null;
        FormWindowStateConstants h5 = new FormWindowStateConstants();
        h5 = null;
        try {
            AbstractForm Me;
            h5 = val;
            if (h5.compareTo(FormWindowStateConstants.vbNormal) == 0) {
                Me.setExtendedState(java.awt.Frame.NORMAL);
                return;
            }
            if (h5.compareTo(FormWindowStateConstants.vbMinimized) == 0) {
                Me.setExtendedState(java.awt.Frame.ICONIFIED);
                return;
            }
            if (h5.compareTo(FormWindowStateConstants.vbMaximized) != 0) {
                return;
            }
            boolean bl = true;
            if (!bl) {
                return;
            }
            Me.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
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
    public IResource $Icon() {
        IResource $Icon = null;
        Throwable Err = null;
        try {
            AbstractForm Me;
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
            AbstractForm Me;
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
    public Container getParentContainer() {
        Throwable throwable2;
        Throwable Err;
        Container getParentContainer;
        block31: {
            AbstractForm Me;
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
                if (((Component)comp.valueOfObj(i)).getClass().getName().equals("VB.Form$PictureBox") | ((Component)comp.valueOfObj(i)).getClass().getName().equals("javax.swing.JDesktopPane")) {
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void AnchorResize() {
        Err = null;
        h6 = 0;
        h7 = 0;
        myCont = null;
        comp = new VBArray();
        i = 0;
        try {
            comp = VBArray.createVBArray(Me.getParentContainer().getComponents());
        }
        catch (Throwable v0) {
            var2_7 = null;
            Err = v0;
        }
        i = 0;
        h6 = comp.getUBound(1);
        h7 = 1;
        if (true) ** GOTO lbl46
        do {
            block14: {
                block13: {
                    try {
                        if ((Component)comp.valueOfObj(i) instanceof IJabacoControl != false) break block13;
                        break block14;
                    }
                    catch (Throwable v1) {
                        var2_7 = null;
                        Err = v1;
                    }
                }
                try {
                    myCont = (IJabacoControl)((Component)comp.valueOfObj(i));
                }
                catch (Throwable v2) {
                    var2_7 = null;
                    Err = v2;
                }
                try {
                    myCont.ResizeTrigger(Me.$Parent().getContentPane().getWidth(), Me.$Parent().getContentPane().getHeight());
                }
                catch (Throwable v3) {
                    var2_7 = null;
                    Err = v3;
                }
            }
            i += h7;
lbl46:
            // 2 sources

            if (i > h6) {
                return;
            }
            v4 = true;
        } while (v4);
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
            AbstractForm Me;
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
    @Override
    public Font $Font() {
        Font $Font = null;
        Throwable Err = null;
        try {
            AbstractForm Me;
            return super.getFont();
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
    public void myMenuBar_Click(IMenuItem MenuItem) {
        Throwable Err = null;
        try {
            AbstractForm Me;
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
            AbstractForm Me;
            Me.Form_ToolBarClick(ToolBarItem);
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    private void initVars() {
        AbstractForm Me;
        Me.myInitLookAndFeelFlag = Global.LookAndFeelManager().isInitialized();
        Me.myMenuBar = new AbstractForm$VBMenuBar(Me);
        Me.myMenuBar.setOwner(Me, 1);
        Me.myToolBar = new AbstractForm$VBToolBar(Me);
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
    }

    public VBVariant Move(float Left) {
        AbstractForm Me;
        return Me.Move(Left, -1 * 1, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top) {
        AbstractForm Me;
        return Me.Move(Left, Top, -1 * 1, -1 * 1);
    }

    public VBVariant Move(float Left, float Top, float Width) {
        AbstractForm Me;
        return Me.Move(Left, Top, Width, -1 * 1);
    }
}
