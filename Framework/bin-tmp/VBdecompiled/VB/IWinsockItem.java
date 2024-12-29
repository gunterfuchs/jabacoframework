/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Winsock;

public interface IWinsockItem {
    public Winsock $Owner();

    public String GetData();

    public void SendData(String var1);

    public void Close();
}
