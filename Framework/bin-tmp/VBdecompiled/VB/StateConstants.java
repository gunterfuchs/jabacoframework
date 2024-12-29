/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.VBEnumClass;

public class StateConstants
extends VBEnumClass {
    public static final StateConstants sckClosed = new StateConstants(0);
    public static final StateConstants sckOpen = new StateConstants(1);
    public static final StateConstants sckListening = new StateConstants(2);
    public static final StateConstants sckConnectionPending = new StateConstants(3);
    public static final StateConstants sckResolvingHost = new StateConstants(4);
    public static final StateConstants sckHostResolved = new StateConstants(5);
    public static final StateConstants sckConnecting = new StateConstants(6);
    public static final StateConstants sckConnected = new StateConstants(7);
    public static final StateConstants sckClosing = new StateConstants(8);
    public static final StateConstants sckError = new StateConstants(9);

    public StateConstants() {
        StateConstants Me;
    }

    public StateConstants(int n) {
        super(n);
        StateConstants Me;
    }

    public StateConstants(long l) {
        super(l);
        StateConstants Me;
    }

    public StateConstants(String string) {
        super(string);
        StateConstants Me;
    }
}
