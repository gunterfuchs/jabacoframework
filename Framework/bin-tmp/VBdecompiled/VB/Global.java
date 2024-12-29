/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.App;
import VB.Console;
import VB.Debug;
import VB.Dialog;
import VB.Form;
import VB.JBCLookAndFeel;
import VB.MDIChild;
import VB.MDIForm;
import VB.MousePointerConstants;
import VB.Screen;
import VB.ShiftConstants;
import VB.SysInfo;
import VB.VBClipboard;
import VB.VBImage;
import VB.VBMenuGroup;
import VB.fmBorderStyle;
import VB.fmSpecialEffect;
import VB.vbScrollBarPolicy;
import VBA.Cursors;
import VBA.IResource;
import VBA.Information;
import VBA.Interaction;
import VBA.JabacoEventQueue;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayVariant;
import VBA.VBVariant;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Hashtable;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class Global {
    private static Debug myDebug = null;
    private static Console myConsole = null;
    private static VBClipboard myClipboard = null;
    private static Screen myScreen = null;
    private static SysInfo mySysInfo = null;
    private static JBCLookAndFeel myLookAndFeelManager = null;
    private static App myApp = null;
    private static MDIForm myGlobalMDIForm = null;
    private static Hashtable myForms = null;
    private static boolean bEmptyEnd = false;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VBVariant setGlobalMDIForm(MDIForm refMDI) {
        VBVariant setGlobalMDIForm = new VBVariant();
        Throwable Err = null;
        try {
            myGlobalMDIForm = refMDI;
            return setGlobalMDIForm;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return setGlobalMDIForm;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MDIForm $GlobalMDIForm() {
        MDIForm $GlobalMDIForm = null;
        Throwable Err = null;
        try {
            return myGlobalMDIForm;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $GlobalMDIForm;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static App App() {
        App App2 = null;
        Throwable Err = null;
        try {
            if (myApp == null) {
                myApp = new App();
            }
            return myApp;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return App2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VBClipboard Clipboard() {
        VBClipboard Clipboard2 = null;
        Throwable Err = null;
        try {
            if (myClipboard == null) {
                myClipboard = new VBClipboard();
            }
            return myClipboard;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Clipboard2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Hashtable Forms() {
        Hashtable Forms = null;
        Throwable Err = null;
        try {
            if (myForms == null) {
                myForms = new Hashtable();
            }
            return myForms;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Forms;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Screen Screen() {
        Screen Screen2 = null;
        Throwable Err = null;
        try {
            if (myScreen == null) {
                myScreen = new Screen();
            }
            return myScreen;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Screen2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Debug Debug() {
        Debug Debug2 = null;
        Throwable Err = null;
        try {
            if (myDebug == null) {
                myDebug = new Debug();
            }
            return myDebug;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Debug2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Console Console() {
        Console Console2 = null;
        Throwable Err = null;
        try {
            if (myConsole == null) {
                myConsole = new Console();
            }
            return myConsole;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Console2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static SysInfo SysInfo() {
        SysInfo SysInfo2 = null;
        Throwable Err = null;
        try {
            if (mySysInfo == null) {
                mySysInfo = new SysInfo();
            }
            return mySysInfo;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return SysInfo2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JBCLookAndFeel LookAndFeelManager() {
        JBCLookAndFeel LookAndFeelManager = null;
        Throwable Err = null;
        try {
            if (myLookAndFeelManager == null) {
                myLookAndFeelManager = new JBCLookAndFeel();
            }
            return myLookAndFeelManager;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return LookAndFeelManager;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object Load(Object obj) {
        Object Load = null;
        Throwable Err = null;
        Object o = null;
        try {
            o = Global.Forms().put(new Integer(obj.hashCode()), obj);
            return obj;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Load;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Unload(Form Form2) {
        Throwable Err = null;
        try {
            Global.RemoveForm(Form2);
            Form2.$Visible(false);
            Form2.dispose();
            Form2 = null;
            Global.EmptyEnd();
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
    public static void Unload(MDIForm Form2) {
        Throwable Err = null;
        try {
            Global.RemoveForm(Form2);
            Form2.$Visible(false);
            Form2.dispose();
            Form2 = null;
            Global.EmptyEnd();
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
    public static void Unload(MDIChild Form2) {
        Throwable Err = null;
        try {
            Global.RemoveForm(Form2);
            Form2.$Visible(false);
            Form2.dispose();
            Form2 = null;
            Global.EmptyEnd();
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
    public static void Unload(Dialog Form2) {
        Throwable Err = null;
        try {
            Global.RemoveForm(Form2);
            Form2.$Visible(false);
            Form2.dispose();
            Form2 = null;
            Global.EmptyEnd();
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
    private static void RemoveForm(Object obj) {
        Throwable Err = null;
        try {
            if (Global.Forms().containsKey(new Integer(obj.hashCode()))) {
                Global.Forms().remove(new Integer(obj.hashCode()));
                return;
            }
            bEmptyEnd = false;
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
    private static void EmptyEnd() {
        Throwable Err = null;
        try {
            if (!(bEmptyEnd & Global.Forms().isEmpty())) {
                return;
            }
            System.exit(0);
            return;
        }
        catch (Throwable throwable) {
            Object var1_1 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ImageIcon CreateIcon(int Width, int Height) {
        ImageIcon CreateIcon = null;
        Throwable Err = null;
        GraphicsConfiguration tmpConfig = null;
        BufferedImage tmpImageVirtual = null;
        Object tmpGFX = null;
        try {
            tmpConfig = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
            tmpImageVirtual = tmpConfig.createCompatibleImage(Width, Height, Transparency.BITMASK);
            return new ImageIcon(tmpImageVirtual);
        }
        catch (Throwable throwable) {
            Object var4_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return CreateIcon;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ImageIcon LoadIcon(IResource Resource) {
        Object var3_4;
        ImageIcon LoadIcon = null;
        Throwable Err = null;
        Image tmpImage = Global.LoadPicture(Resource);
        try {
            if (tmpImage == null) return LoadIcon;
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        try {
            return new ImageIcon(tmpImage);
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
            return LoadIcon;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ByteArrayOutputStream LoadResource(IResource Resource) {
        Object var3_3;
        ByteArrayOutputStream LoadResource = null;
        Throwable Err = null;
        try {
            if (Resource == null) return LoadResource;
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            return Interaction.getResourceAsByteArray(Resource.getClass(), Resource.toString());
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return LoadResource;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static InputStream LoadResData(IResource Resource) {
        Object var3_3;
        InputStream LoadResData = null;
        Throwable Err = null;
        try {
            if (Resource == null) return LoadResData;
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            return Resource.getClass().getResourceAsStream(Resource.toString());
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return LoadResData;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static InputStream LoadResData(String ResID) {
        Object var3_3;
        InputStream LoadResData = null;
        Throwable Err = null;
        try {
            if (ResID == null) return LoadResData;
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
        }
        try {
            return ResID.getClass().getResourceAsStream(ResID.toString());
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return LoadResData;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Image LoadPicture(String Resource) {
        Image LoadPicture = null;
        Throwable Err = null;
        try {
            return new VBImage(Resource).getImage();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return LoadPicture;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Image LoadPicture(IResource Resource) {
        Object var3_3;
        Throwable Err;
        Image LoadPicture;
        block14: {
            block13: {
                LoadPicture = null;
                Err = null;
                try {
                    if (Resource == null) return LoadPicture;
                }
                catch (Throwable throwable) {
                    var3_3 = null;
                    Err = throwable;
                }
                try {
                    if (Resource instanceof VBImage) break block13;
                    break block14;
                }
                catch (Throwable throwable) {
                    var3_3 = null;
                    Err = throwable;
                }
            }
            try {
                try {
                    return ((VBImage)Resource).getImage();
                }
                catch (Throwable throwable) {
                    var3_3 = null;
                    Err = throwable;
                    return LoadPicture;
                }
            }
            catch (Throwable throwable) {
                var3_3 = null;
                Err = throwable;
            }
        }
        try {
            LoadPicture = Interaction.getResourceAsImage(Resource.getClass(), Resource.toString());
            return LoadPicture;
        }
        catch (Throwable throwable) {
            var3_3 = null;
            Err = throwable;
            return LoadPicture;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int KeyEventToKeyCode(KeyEvent e) {
        int KeyEventToKeyCode = 0;
        Throwable Err = null;
        try {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) return 13;
            boolean bl = false;
            if (!bl) return e.getKeyCode();
            return 13;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return KeyEventToKeyCode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int KeyEventToShiftConstant(KeyEvent e) {
        int KeyEventToShiftConstant = 0;
        Throwable Err = null;
        int ret = 0;
        try {
            ret = 0;
            if (e.isShiftDown()) {
                ret = Double.valueOf(Strings.StrCat(String.valueOf(ret), ShiftConstants.vbShiftMask.toString())).intValue();
            }
            if (e.isControlDown()) {
                ret = Double.valueOf(Strings.StrCat(String.valueOf(ret), ShiftConstants.vbCtrlMask.toString())).intValue();
            }
            if (e.isAltDown()) {
                ret = Double.valueOf(Strings.StrCat(String.valueOf(ret), ShiftConstants.vbAltMask.toString())).intValue();
            }
            return ret;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return KeyEventToShiftConstant;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Border GetVBBorder(fmBorderStyle style, fmSpecialEffect effect, long bordercolor) {
        Throwable throwable2;
        Throwable Err;
        Border GetVBBorder;
        block13: {
            GetVBBorder = null;
            Err = null;
            fmBorderStyle h8 = new fmBorderStyle();
            fmSpecialEffect h9 = new fmSpecialEffect();
            try {
                if (style == null) return GetVBBorder;
                h8 = null;
            }
            catch (Throwable throwable2) {}
            try {
                h8 = style;
                if (h8.compareTo(fmBorderStyle.fmBorderStyleNone) == 0) {
                    return BorderFactory.createEmptyBorder();
                }
                if (!(h8.compareTo(fmBorderStyle.fmBorderStyleSingle) == 0)) {
                    return GetVBBorder;
                }
                h9 = null;
            }
            catch (Throwable throwable2) {}
            h9 = effect;
            if (h9.compareTo(fmSpecialEffect.fmSpecialEffectFlat) == 0) {
                GetVBBorder = BorderFactory.createLineBorder(Information.RGBtoColor(bordercolor));
                return GetVBBorder;
            }
            if (h9.compareTo(fmSpecialEffect.fmSpecialEffectRaised) == 0) {
                GetVBBorder = BorderFactory.createRaisedBevelBorder();
                return GetVBBorder;
            }
            if (h9.compareTo(fmSpecialEffect.fmSpecialEffectSunken) == 0) {
                GetVBBorder = BorderFactory.createLoweredBevelBorder();
                return GetVBBorder;
            }
            if (!(h9.compareTo(fmSpecialEffect.fmSpecialEffectEtched) == 0)) {
                return GetVBBorder;
            }
            GetVBBorder = BorderFactory.createEtchedBorder();
            break block13;
            finally {
            }
        }
        Object var6_7 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return GetVBBorder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int VBScrollBarToJScrollBarPolicy(vbScrollBarPolicy v, boolean bHorizontal) {
        Throwable throwable2;
        Throwable Err;
        int VBScrollBarToJScrollBarPolicy;
        block13: {
            vbScrollBarPolicy h6;
            block12: {
                VBScrollBarToJScrollBarPolicy = 0;
                Err = null;
                h6 = new vbScrollBarPolicy();
                try {
                    if (!bHorizontal) break block12;
                    h6 = null;
                }
                catch (Throwable throwable2) {}
                try {
                    h6 = v;
                    if (h6.compareTo(vbScrollBarPolicy.sbShowAsNeeded) == 0) {
                        return ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
                    }
                    if (h6.compareTo(vbScrollBarPolicy.sbShowNever) == 0) {
                        return ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
                    }
                    if (h6.compareTo(vbScrollBarPolicy.sbShowAlways) == 0) return ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
                    return VBScrollBarToJScrollBarPolicy;
                }
                catch (Throwable throwable2) {}
            }
            h6 = null;
            h6 = v;
            if (h6.compareTo(vbScrollBarPolicy.sbShowAsNeeded) == 0) {
                VBScrollBarToJScrollBarPolicy = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
                return VBScrollBarToJScrollBarPolicy;
            }
            if (h6.compareTo(vbScrollBarPolicy.sbShowNever) == 0) {
                VBScrollBarToJScrollBarPolicy = ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER;
                return VBScrollBarToJScrollBarPolicy;
            }
            if (!(h6.compareTo(vbScrollBarPolicy.sbShowAlways) == 0)) {
                return VBScrollBarToJScrollBarPolicy;
            }
            VBScrollBarToJScrollBarPolicy = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
            break block13;
            finally {
            }
        }
        Object var4_5 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return VBScrollBarToJScrollBarPolicy;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static vbScrollBarPolicy JScrollBarToVBScrollBarPolicy(int v) {
        vbScrollBarPolicy JScrollBarToVBScrollBarPolicy = new vbScrollBarPolicy();
        Throwable Err = null;
        int h5 = 0;
        h5 = 0;
        try {
            h5 = v;
            if (h5 == ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED) {
                return vbScrollBarPolicy.sbShowAsNeeded;
            }
            if (h5 == ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER) {
                return vbScrollBarPolicy.sbShowNever;
            }
            if (h5 == ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS) {
                return vbScrollBarPolicy.sbShowAlways;
            }
            if (h5 == ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED) {
                return vbScrollBarPolicy.sbShowAsNeeded;
            }
            if (h5 == ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER) {
                return vbScrollBarPolicy.sbShowNever;
            }
            if (h5 == ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS) return vbScrollBarPolicy.sbShowAlways;
            return JScrollBarToVBScrollBarPolicy;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return JScrollBarToVBScrollBarPolicy;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MousePointerConstants JCursorToVBMousePointer(Cursor v) {
        MousePointerConstants JCursorToVBMousePointer = new MousePointerConstants();
        Throwable Err = null;
        Cursor h5 = null;
        h5 = null;
        try {
            h5 = v;
            if (h5 == new Cursor(Frame.DEFAULT_CURSOR)) {
                return MousePointerConstants.vbDefault;
            }
            if (h5 == new Cursor(Frame.CROSSHAIR_CURSOR)) {
                return MousePointerConstants.vbCrosshair;
            }
            if (h5 == new Cursor(Frame.TEXT_CURSOR)) {
                return MousePointerConstants.vbIbeam;
            }
            if (h5 == new Cursor(Cursor.CUSTOM_CURSOR)) {
                return MousePointerConstants.vbIconPointer;
            }
            if (h5 == new Cursor(Frame.MOVE_CURSOR)) {
                return MousePointerConstants.vbSizePointer;
            }
            if (h5 == new Cursor(Frame.SW_RESIZE_CURSOR)) return MousePointerConstants.vbSizeNESW;
            if (h5 == new Cursor(Frame.NE_RESIZE_CURSOR)) return MousePointerConstants.vbSizeNESW;
            if (h5 == new Cursor(Frame.N_RESIZE_CURSOR)) return MousePointerConstants.vbSizeNS;
            if (h5 == new Cursor(Frame.S_RESIZE_CURSOR)) return MousePointerConstants.vbSizeNS;
            if (h5 == new Cursor(Frame.SE_RESIZE_CURSOR)) return MousePointerConstants.vbSizeNWSE;
            if (h5 == new Cursor(Frame.NW_RESIZE_CURSOR)) return MousePointerConstants.vbSizeNWSE;
            if (h5 == new Cursor(Frame.E_RESIZE_CURSOR)) return MousePointerConstants.vbSizeWE;
            if (h5 == new Cursor(Frame.W_RESIZE_CURSOR)) return MousePointerConstants.vbSizeWE;
            if (h5 == new Cursor(Frame.WAIT_CURSOR)) {
                return MousePointerConstants.vbHourglass;
            }
            if (h5 == new Cursor(Frame.MOVE_CURSOR)) {
                return MousePointerConstants.vbSizeAll;
            }
            if (!(h5 == new Cursor(Frame.HAND_CURSOR))) return MousePointerConstants.vbDefault;
            return MousePointerConstants.vbHandCursor;
        }
        catch (Throwable throwable) {
            Object var3_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return JCursorToVBMousePointer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Cursor VBMousePointerToJCursor(MousePointerConstants v) {
        Object var3_4;
        Throwable Err;
        Cursor VBMousePointerToJCursor;
        block77: {
            block76: {
                block75: {
                    block74: {
                        block73: {
                            block72: {
                                block71: {
                                    block70: {
                                        block69: {
                                            block68: {
                                                block67: {
                                                    block66: {
                                                        block65: {
                                                            block64: {
                                                                block63: {
                                                                    block62: {
                                                                        block61: {
                                                                            block60: {
                                                                                VBMousePointerToJCursor = null;
                                                                                Err = null;
                                                                                MousePointerConstants h5 = new MousePointerConstants();
                                                                                h5 = null;
                                                                                try {
                                                                                    h5 = v;
                                                                                }
                                                                                catch (Throwable throwable) {
                                                                                    var3_4 = null;
                                                                                    Err = throwable;
                                                                                }
                                                                                if (h5.compareTo(MousePointerConstants.vbDefault) == 0) break block60;
                                                                                if (h5.compareTo(MousePointerConstants.vbArrow) == 0) break block61;
                                                                                if (h5.compareTo(MousePointerConstants.vbCrosshair) == 0) break block62;
                                                                                if (h5.compareTo(MousePointerConstants.vbIbeam) == 0) break block63;
                                                                                if (h5.compareTo(MousePointerConstants.vbIconPointer) == 0) break block64;
                                                                                if (h5.compareTo(MousePointerConstants.vbSizePointer) == 0) break block65;
                                                                                if (h5.compareTo(MousePointerConstants.vbSizeNESW) == 0) break block66;
                                                                                if (h5.compareTo(MousePointerConstants.vbSizeNS) == 0) break block67;
                                                                                if (h5.compareTo(MousePointerConstants.vbSizeNWSE) == 0) break block68;
                                                                                if (h5.compareTo(MousePointerConstants.vbSizeWE) == 0) break block69;
                                                                                if (h5.compareTo(MousePointerConstants.vbUpArrow) == 0) break block70;
                                                                                if (h5.compareTo(MousePointerConstants.vbHourglass) == 0) break block71;
                                                                                if (h5.compareTo(MousePointerConstants.vbNoDrop) == 0) break block72;
                                                                                if (h5.compareTo(MousePointerConstants.vbArrowHourglass) == 0) break block73;
                                                                                if (h5.compareTo(MousePointerConstants.vbArrowQuestion) == 0) break block74;
                                                                                if (h5.compareTo(MousePointerConstants.vbSizeAll) == 0) break block75;
                                                                                if (!(h5.compareTo(MousePointerConstants.vbHandCursor) == 0)) {
                                                                                }
                                                                                break block76;
                                                                            }
                                                                            try {
                                                                                VBMousePointerToJCursor = new Cursor(Frame.DEFAULT_CURSOR);
                                                                                break block77;
                                                                            }
                                                                            catch (Throwable throwable) {
                                                                                var3_4 = null;
                                                                                Err = throwable;
                                                                            }
                                                                        }
                                                                        try {
                                                                            VBMousePointerToJCursor = new Cursor(Frame.DEFAULT_CURSOR);
                                                                            break block77;
                                                                        }
                                                                        catch (Throwable throwable) {
                                                                            var3_4 = null;
                                                                            Err = throwable;
                                                                        }
                                                                    }
                                                                    try {
                                                                        VBMousePointerToJCursor = new Cursor(Frame.CROSSHAIR_CURSOR);
                                                                        break block77;
                                                                    }
                                                                    catch (Throwable throwable) {
                                                                        var3_4 = null;
                                                                        Err = throwable;
                                                                    }
                                                                }
                                                                try {
                                                                    VBMousePointerToJCursor = new Cursor(Frame.TEXT_CURSOR);
                                                                    break block77;
                                                                }
                                                                catch (Throwable throwable) {
                                                                    var3_4 = null;
                                                                    Err = throwable;
                                                                }
                                                            }
                                                            try {
                                                                VBMousePointerToJCursor = new Cursor(Frame.DEFAULT_CURSOR);
                                                                break block77;
                                                            }
                                                            catch (Throwable throwable) {
                                                                var3_4 = null;
                                                                Err = throwable;
                                                            }
                                                        }
                                                        try {
                                                            VBMousePointerToJCursor = new Cursor(Frame.MOVE_CURSOR);
                                                            break block77;
                                                        }
                                                        catch (Throwable throwable) {
                                                            var3_4 = null;
                                                            Err = throwable;
                                                        }
                                                    }
                                                    try {
                                                        VBMousePointerToJCursor = new Cursor(Frame.SW_RESIZE_CURSOR);
                                                        break block77;
                                                    }
                                                    catch (Throwable throwable) {
                                                        var3_4 = null;
                                                        Err = throwable;
                                                    }
                                                }
                                                try {
                                                    VBMousePointerToJCursor = new Cursor(Frame.N_RESIZE_CURSOR);
                                                    break block77;
                                                }
                                                catch (Throwable throwable) {
                                                    var3_4 = null;
                                                    Err = throwable;
                                                }
                                            }
                                            try {
                                                VBMousePointerToJCursor = new Cursor(Frame.SE_RESIZE_CURSOR);
                                                break block77;
                                            }
                                            catch (Throwable throwable) {
                                                var3_4 = null;
                                                Err = throwable;
                                            }
                                        }
                                        try {
                                            VBMousePointerToJCursor = new Cursor(Frame.E_RESIZE_CURSOR);
                                            break block77;
                                        }
                                        catch (Throwable throwable) {
                                            var3_4 = null;
                                            Err = throwable;
                                        }
                                    }
                                    try {
                                        VBMousePointerToJCursor = new Cursor(Frame.DEFAULT_CURSOR);
                                        break block77;
                                    }
                                    catch (Throwable throwable) {
                                        var3_4 = null;
                                        Err = throwable;
                                    }
                                }
                                try {
                                    VBMousePointerToJCursor = new Cursor(Frame.WAIT_CURSOR);
                                    break block77;
                                }
                                catch (Throwable throwable) {
                                    var3_4 = null;
                                    Err = throwable;
                                }
                            }
                            try {
                                VBMousePointerToJCursor = new Cursor(Frame.DEFAULT_CURSOR);
                                break block77;
                            }
                            catch (Throwable throwable) {
                                var3_4 = null;
                                Err = throwable;
                            }
                        }
                        try {
                            VBMousePointerToJCursor = new Cursor(Frame.DEFAULT_CURSOR);
                            break block77;
                        }
                        catch (Throwable throwable) {
                            var3_4 = null;
                            Err = throwable;
                        }
                    }
                    try {
                        VBMousePointerToJCursor = new Cursor(Frame.DEFAULT_CURSOR);
                        break block77;
                    }
                    catch (Throwable throwable) {
                        var3_4 = null;
                        Err = throwable;
                    }
                }
                try {
                    VBMousePointerToJCursor = new Cursor(Frame.MOVE_CURSOR);
                    break block77;
                }
                catch (Throwable throwable) {
                    var3_4 = null;
                    Err = throwable;
                }
            }
            try {
                VBMousePointerToJCursor = new Cursor(Frame.HAND_CURSOR);
                break block77;
            }
            catch (Throwable throwable) {
                var3_4 = null;
                Err = throwable;
            }
            try {
                VBMousePointerToJCursor = new Cursor(Frame.DEFAULT_CURSOR);
            }
            catch (Throwable throwable) {
                var3_4 = null;
                Err = throwable;
            }
        }
        try {
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
        }
        VBVariant cur = VBVariant.valueOf(new Cursors());
        try {
            VBArrayVariant vBArrayVariant = VBArray.createParamArray(0);
            vBArrayVariant.setValueVar(0, VBVariant.valueOf(v));
            return (Cursor)Interaction.CallByName(cur.toObject(), "getVBACursor", vBArrayVariant).toObject();
        }
        catch (Throwable throwable) {
            var3_4 = null;
            Err = throwable;
            return VBMousePointerToJCursor;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Cursor VBMouseIconToJCursor(IResource v, Component c) {
        Throwable throwable2;
        Cursor VBMouseIconToJCursor = null;
        Throwable Err = null;
        if (v == null) {
            return c.getCursor();
        }
        Image img = null;
        {
            catch (Throwable throwable2) {}
        }
        img = Global.LoadPicture(v);
        if (!(img == null)) {
            VBMouseIconToJCursor = Toolkit.getDefaultToolkit().createCustomCursor(img, new Point(1, 1), "VBMouseIcon");
            return VBMouseIconToJCursor;
        }
        VBMouseIconToJCursor = c.getCursor();
        return VBMouseIconToJCursor;
        Object var4_5 = null;
        Err = throwable2;
        VBMouseIconToJCursor = new Cursor(Frame.DEFAULT_CURSOR);
        return VBMouseIconToJCursor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int VBFontSizeToJFontSize(int v) {
        int VBFontSizeToJFontSize = 0;
        Throwable Err = null;
        try {
            return (int)((double)v * Global.GetFontFactor());
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return VBFontSizeToJFontSize;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int JFontSizeToVBFontSize(int v) {
        int JFontSizeToVBFontSize = 0;
        Throwable Err = null;
        try {
            return (int)((double)v / Global.GetFontFactor() + 0.85);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return JFontSizeToVBFontSize;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static double GetFontFactor() {
        double GetFontFactor = 0.0;
        Throwable Err = null;
        try {
            return 1.4;
        }
        catch (Throwable throwable) {
            Object var3_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetFontFactor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean SavePicture(Image picture, String filename) {
        boolean SavePicture = false;
        Throwable Err = null;
        try {
            return Global.SavePicture(picture, filename, "png");
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return SavePicture;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean SavePicture(Image image, String filename, String filetype) {
        Throwable throwable2;
        Throwable Err;
        boolean SavePicture;
        block6: {
            SavePicture = false;
            Err = null;
            try {
                SavePicture = false;
            }
            catch (Throwable throwable2) {
                break block6;
            }
            BufferedImage tmpBufferedImage = Interaction.createBufferedImage(image);
            File tmpFile = new File(filename);
            ImageIO.write((RenderedImage)tmpBufferedImage, filetype, tmpFile);
            SavePicture = true;
        }
        Object var5_7 = null;
        Err = throwable2;
        return SavePicture;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void PopupMenu(VBMenuGroup MenuGroup) {
        Throwable Err = null;
        Component Owner = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        VBVariant OwnerV = VBVariant.valueOf(Owner);
        int X = 0;
        int Y = 0;
        try {
            if (Owner != null) {
                X = Interaction.CallByName(Interaction.CallByName(OwnerV.toObject(), "getMousePosition", VBArray.createParamArray(-1)).toObject(), "getX", VBArray.createParamArray(-1)).intValue();
                Y = Interaction.CallByName(Interaction.CallByName(OwnerV.toObject(), "getMousePosition", VBArray.createParamArray(-1)).toObject(), "getY", VBArray.createParamArray(-1)).intValue();
            }
            MenuGroup.GetAsPopupMenu().show(Owner, X, Y);
            return;
        }
        catch (Throwable throwable) {
            Object var2_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void PopupMenu(VBMenuGroup MenuGroup, int X, int Y) {
        Throwable Err = null;
        Component Owner = Global.SysInfo().FocusedComponent();
        try {
            MenuGroup.GetAsPopupMenu().show(Owner, X, Y);
            return;
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void PopupMenu(VBMenuGroup MenuGroup, JComponent Owner, int X, int Y) {
        Throwable Err = null;
        try {
            MenuGroup.GetAsPopupMenu().show(Owner, X, Y);
            return;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void DoEvents() {
        Throwable Err = null;
        try {
            JabacoEventQueue.getJabacoEventQueue().dispatchEvents();
        }
        catch (Throwable throwable) {
            Object var1_1 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void End() {
        Throwable Err = null;
        try {
            System.exit(0);
            return;
        }
        catch (Throwable throwable) {
            Object var1_1 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void Beep() {
        Throwable Err = null;
        try {
            Toolkit.getDefaultToolkit().beep();
        }
        catch (Throwable throwable) {
            Object var1_1 = null;
            Err = throwable;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean IsStringBoolean(String v) {
        Throwable throwable2;
        Throwable Err;
        boolean IsStringBoolean;
        block6: {
            IsStringBoolean = false;
            Err = null;
            String h5 = "";
            try {
                v = Strings.LCase(v);
                h5 = "";
            }
            catch (Throwable throwable2) {
                break block6;
            }
            h5 = v;
            if (!(Strings.StrComp(h5, "true") == 0) && !(Strings.StrComp(h5, "false") == 0)) {
                IsStringBoolean = false;
            }
            IsStringBoolean = true;
            return IsStringBoolean;
        }
        Object var3_4 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return IsStringBoolean;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean GetStringAsBoolean(String v) {
        boolean GetStringAsBoolean = false;
        Throwable Err = null;
        try {
            return Boolean.parseBoolean(v);
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return GetStringAsBoolean;
    }

    public Global() {
        Global Me;
    }
}
