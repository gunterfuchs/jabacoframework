/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VBA.VBEnumClass;

public class ErrorConstants
extends VBEnumClass {
    public static final ErrorConstants sckOutOfMemory = new ErrorConstants(7);
    public static final ErrorConstants sckInvalidPropertyValue = new ErrorConstants(380);
    public static final ErrorConstants sckSetNotSupported = new ErrorConstants(383);
    public static final ErrorConstants sckGetNotSupported = new ErrorConstants(394);
    public static final ErrorConstants sckOpCanceled = new ErrorConstants(10004);
    public static final ErrorConstants sckInvalidArgument = new ErrorConstants(10014);
    public static final ErrorConstants sckWouldBlock = new ErrorConstants(10035);
    public static final ErrorConstants sckInProgress = new ErrorConstants(10036);
    public static final ErrorConstants sckAlreadyComplete = new ErrorConstants(10037);
    public static final ErrorConstants sckNotSocket = new ErrorConstants(10038);
    public static final ErrorConstants sckMsgTooBig = new ErrorConstants(10040);
    public static final ErrorConstants sckPortNotSupported = new ErrorConstants(10043);
    public static final ErrorConstants sckAddressInUse = new ErrorConstants(10048);
    public static final ErrorConstants sckAddressNotAvailable = new ErrorConstants(10049);
    public static final ErrorConstants sckNetworkSubsystemFailed = new ErrorConstants(10050);
    public static final ErrorConstants sckNetworkUnreachable = new ErrorConstants(10051);
    public static final ErrorConstants sckNetReset = new ErrorConstants(10052);
    public static final ErrorConstants sckConnectAborted = new ErrorConstants(10053);
    public static final ErrorConstants sckConnectionReset = new ErrorConstants(10054);
    public static final ErrorConstants sckNoBufferSpace = new ErrorConstants(10055);
    public static final ErrorConstants sckAlreadyConnected = new ErrorConstants(10056);
    public static final ErrorConstants sckNotConnected = new ErrorConstants(10057);
    public static final ErrorConstants sckSocketShutdown = new ErrorConstants(10058);
    public static final ErrorConstants sckTimedout = new ErrorConstants(10060);
    public static final ErrorConstants sckConnectionRefused = new ErrorConstants(10061);
    public static final ErrorConstants sckNotInitialized = new ErrorConstants(10093);
    public static final ErrorConstants sckHostNotFound = new ErrorConstants(11001);
    public static final ErrorConstants sckHostNotFoundTryAgain = new ErrorConstants(11002);
    public static final ErrorConstants sckNonRecoverableError = new ErrorConstants(11003);
    public static final ErrorConstants sckNoData = new ErrorConstants(11004);
    public static final ErrorConstants sckBadState = new ErrorConstants(40006);
    public static final ErrorConstants sckInvalidArg = new ErrorConstants(40014);
    public static final ErrorConstants sckSuccess = new ErrorConstants(40017);
    public static final ErrorConstants sckUnsupported = new ErrorConstants(40018);
    public static final ErrorConstants sckInvalidOp = new ErrorConstants(40020);
    public static final ErrorConstants sckOutOfRange = new ErrorConstants(40021);
    public static final ErrorConstants sckWrongProtocol = new ErrorConstants(40026);

    public ErrorConstants() {
        ErrorConstants Me;
    }

    public ErrorConstants(int n) {
        super(n);
        ErrorConstants Me;
    }

    public ErrorConstants(long l) {
        super(l);
        ErrorConstants Me;
    }

    public ErrorConstants(String string) {
        super(string);
        ErrorConstants Me;
    }
}
