/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Global;
import VBA.IResource;
import VBA.Interaction;
import VBA.VBVariant;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class VBImage
implements IResource {
    private BufferedImage myImage;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBImage(int width, int height) {
        VBImage Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
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
    public VBImage(BufferedImage refImage) {
        VBImage Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myImage = refImage;
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
    public VBImage(Image refImage) {
        VBImage Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myImage = Interaction.createBufferedImage(refImage);
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
    public VBImage(String url) {
        InputStream myStream;
        block15: {
            Object var3_5;
            URL myUrl;
            Throwable Err;
            block14: {
                block13: {
                    VBImage Me;
                    Err = null;
                    Me.initVars();
                    myStream = null;
                    myUrl = null;
                    try {
                        myUrl = new URL(url);
                    }
                    catch (Throwable throwable) {
                        var3_5 = null;
                        Err = throwable;
                    }
                    try {
                        if (myUrl == null) break block13;
                        break block14;
                    }
                    catch (Throwable throwable) {
                        var3_5 = null;
                        Err = throwable;
                    }
                }
                try {
                    try {
                        myStream = new FileInputStream(url);
                    }
                    catch (Throwable throwable) {
                        var3_5 = null;
                        Err = throwable;
                    }
                    break block15;
                }
                catch (Throwable throwable) {
                    var3_5 = null;
                    Err = throwable;
                }
            }
            try {
                myStream = myUrl.openStream();
                return myStream;
            }
            catch (Throwable throwable) {
                var3_5 = null;
                Err = throwable;
            }
        }
        Me.myImage = ImageIO.read(myStream);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBImage(URL url) {
        VBImage Me;
        Throwable Err = null;
        Me.initVars();
        InputStream myStream = url.openStream();
        try {
            Me.myImage = ImageIO.read(myStream);
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
    public VBImage(IResource refImage) {
        VBImage Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myImage = Interaction.createBufferedImage(Global.LoadPicture(refImage));
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
    public VBImage(VBImage refImage) {
        VBImage Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myImage = Interaction.createBufferedImage(refImage.getImage());
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
    public BufferedImage getImage() {
        BufferedImage getImage = null;
        Throwable Err = null;
        try {
            VBImage Me;
            return Me.myImage;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return getImage;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long $RGB(int x, int y) {
        long $RGB = 0L;
        Throwable Err = null;
        try {
            VBImage Me;
            return Me.myImage.getRGB(x, y);
        }
        catch (Throwable throwable) {
            Object var6_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $RGB;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void $RGB(int x, int y, long v) {
        Throwable Err = null;
        try {
            VBImage Me;
            Me.myImage.setRGB(x, y, (int)v);
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
    public VBImage cutImage(int x, int y, int width, int height) {
        VBImage cutImage = null;
        Throwable Err = null;
        try {
            VBImage Me;
            Me.myImage = Me.myImage.getSubimage(x, y, width, height);
            return Me;
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return cutImage;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBImage scaleImage(int width, int height) {
        VBImage scaleImage = null;
        Throwable Err = null;
        try {
            VBImage Me;
            Me.scaleImage(width, height, true);
            return Me;
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return scaleImage;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VBImage scaleImage(int width, int height, boolean smooth) {
        VBImage scaleImage = null;
        Throwable Err = null;
        try {
            VBImage Me;
            Me.myImage = Interaction.createBufferedImage(Me.myImage.getScaledInstance(width, height, Interaction.IIF(smooth, VBVariant.valueOf(Image.SCALE_SMOOTH), VBVariant.valueOf(Image.SCALE_DEFAULT)).intValue()));
            return Me;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return scaleImage;
    }

    public VBImage rotateImage(Image Picture, double angle, int xAngle, int yAngle) {
        VBImage rotateImage = null;
        Object Err = null;
        return rotateImage;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Graphics $Graphics() {
        Graphics $Graphics = null;
        Throwable Err = null;
        try {
            VBImage Me;
            return Me.myImage.getGraphics();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Graphics;
    }

    private void initVars() {
        Me.myImage = null;
    }
}
