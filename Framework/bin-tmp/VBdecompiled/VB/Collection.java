/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.IJabacoClass;
import VBA.Conversion;
import VBA.Interaction;
import VBA.Math;
import VBA.Strings;
import VBA.VBVariant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection
implements IJabacoClass {
    private HashMap myObjectList;
    private LinkedList myKeyArray;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String createUniqueKey(int KeyLength) {
        Throwable throwable2;
        Throwable Err;
        String createUniqueKey;
        block6: {
            createUniqueKey = "";
            Err = null;
            int h8 = 0;
            int h9 = 0;
            int i = 0;
            String ret = "";
            i = 1;
            h8 = KeyLength;
            h9 = 1;
            while (i <= h8) {
                try {
                    ret = Strings.StrCat(ret, Conversion.CStr(VBVariant.valueOf(Strings.Chr(Conversion.CInt(VBVariant.valueOf(Math.Rnd() * (double)26)) + 65))));
                    i += h9;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            createUniqueKey = ret;
            return createUniqueKey;
        }
        Object var4_8 = null;
        Err = throwable2;
        Interaction.MsgBox(Err);
        return createUniqueKey;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized boolean Add(VBVariant Item) {
        boolean Add = false;
        Throwable Err = null;
        try {
            Collection Me;
            return Me.Add(Item, Me.Count());
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Add;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized boolean Add(VBVariant Item, int After) {
        boolean Add = false;
        Throwable Err = null;
        try {
            Collection Me;
            return Me.Add(Item, After, Me.createUniqueKey(32));
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Add;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized boolean Add(VBVariant Item, String Key) {
        boolean Add = false;
        Throwable Err = null;
        try {
            Collection Me;
            return Me.Add(Item, Me.Count(), Key);
        }
        catch (Throwable throwable) {
            Object var5_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Add;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private synchronized boolean Add(VBVariant Item, int After, String Key) {
        boolean Add = false;
        Throwable Err = null;
        try {
            Collection Me;
            if (Me.Item(Key).compareTo(new VBVariant(null)) != 0) return Add;
            Me.myObjectList.put((Object)Key, Item.toObject());
            Me.myKeyArray.add(After, (Object)Key);
            return true;
        }
        catch (Throwable throwable) {
            Object var6_6 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Add;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized void Clear() {
        Throwable Err = null;
        try {
            Collection Me;
            Me.myObjectList.clear();
            Me.myKeyArray.clear();
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
    public synchronized boolean KeyExists(String Key) {
        boolean KeyExists = false;
        Throwable Err = null;
        try {
            Collection Me;
            return Me.myObjectList.containsKey(Key);
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return KeyExists;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized int Count() {
        int Count = 0;
        Throwable Err = null;
        try {
            Collection Me;
            return Me.myObjectList.size();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Count;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized Iterator Iterator() {
        Iterator Iterator2 = null;
        Throwable Err = null;
        try {
            Collection Me;
            return Me.myObjectList.values().iterator();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Iterator2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized LinkedList Keys() {
        LinkedList Keys = null;
        Throwable Err = null;
        try {
            Collection Me;
            return Me.myKeyArray;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Keys;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized VBVariant Item(int Index) {
        Object var4_4;
        VBVariant Item = new VBVariant();
        Throwable Err = null;
        try {
            --Index;
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            Collection Me;
            return Me.Item(Conversion.CStr((String)Me.myKeyArray.get(Index)));
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
            return Item;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized VBVariant Item(String Key) {
        VBVariant Item = new VBVariant();
        Throwable Err = null;
        try {
            Collection Me;
            return VBVariant.valueOf(Me.myObjectList.get(Key));
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Item;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized boolean Remove(String Key) {
        Object var4_5;
        Collection Me;
        boolean bl = false;
        Throwable Err = null;
        try {
            Me.myKeyArray.remove(Me.myKeyArray.indexOf(Key));
        }
        catch (Throwable throwable) {
            var4_5 = null;
            Err = throwable;
        }
        try {
            return Double.valueOf(Me.myObjectList.remove(Key).toString()).intValue() != 0;
        }
        catch (Throwable throwable) {
            boolean bl2;
            var4_5 = null;
            Err = throwable;
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean Remove(int Index) {
        Object var4_4;
        boolean Remove = false;
        Throwable Err = null;
        try {
            --Index;
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
        }
        try {
            Collection Me;
            return Me.Remove(Conversion.CStr((String)Me.myKeyArray.get(Index)));
        }
        catch (Throwable throwable) {
            var4_4 = null;
            Err = throwable;
            return Remove;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ArrayList $Parent() {
        ArrayList $Parent = null;
        Throwable Err = null;
        try {
            return null;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Parent;
    }

    public Collection() {
        Collection Me;
        Me.initVars();
    }

    private void initVars() {
        Me.myObjectList = new HashMap();
        Me.myKeyArray = new LinkedList();
    }
}
