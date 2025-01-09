package vineflowerVariableMeReplacedWithVariableThis;

import VBA.VBEnumClass;

public class ErrorConstants extends VBEnumClass {
   public static final VB.ErrorConstants sckOutOfMemory = new VB.ErrorConstants(7);
   public static final VB.ErrorConstants sckInvalidPropertyValue = new VB.ErrorConstants(380);
   public static final VB.ErrorConstants sckSetNotSupported = new VB.ErrorConstants(383);
   public static final VB.ErrorConstants sckGetNotSupported = new VB.ErrorConstants(394);
   public static final VB.ErrorConstants sckOpCanceled = new VB.ErrorConstants(10004);
   public static final VB.ErrorConstants sckInvalidArgument = new VB.ErrorConstants(10014);
   public static final VB.ErrorConstants sckWouldBlock = new VB.ErrorConstants(10035);
   public static final VB.ErrorConstants sckInProgress = new VB.ErrorConstants(10036);
   public static final VB.ErrorConstants sckAlreadyComplete = new VB.ErrorConstants(10037);
   public static final VB.ErrorConstants sckNotSocket = new VB.ErrorConstants(10038);
   public static final VB.ErrorConstants sckMsgTooBig = new VB.ErrorConstants(10040);
   public static final VB.ErrorConstants sckPortNotSupported = new VB.ErrorConstants(10043);
   public static final VB.ErrorConstants sckAddressInUse = new VB.ErrorConstants(10048);
   public static final VB.ErrorConstants sckAddressNotAvailable = new VB.ErrorConstants(10049);
   public static final VB.ErrorConstants sckNetworkSubsystemFailed = new VB.ErrorConstants(10050);
   public static final VB.ErrorConstants sckNetworkUnreachable = new VB.ErrorConstants(10051);
   public static final VB.ErrorConstants sckNetReset = new VB.ErrorConstants(10052);
   public static final VB.ErrorConstants sckConnectAborted = new VB.ErrorConstants(10053);
   public static final VB.ErrorConstants sckConnectionReset = new VB.ErrorConstants(10054);
   public static final VB.ErrorConstants sckNoBufferSpace = new VB.ErrorConstants(10055);
   public static final VB.ErrorConstants sckAlreadyConnected = new VB.ErrorConstants(10056);
   public static final VB.ErrorConstants sckNotConnected = new VB.ErrorConstants(10057);
   public static final VB.ErrorConstants sckSocketShutdown = new VB.ErrorConstants(10058);
   public static final VB.ErrorConstants sckTimedout = new VB.ErrorConstants(10060);
   public static final VB.ErrorConstants sckConnectionRefused = new VB.ErrorConstants(10061);
   public static final VB.ErrorConstants sckNotInitialized = new VB.ErrorConstants(10093);
   public static final VB.ErrorConstants sckHostNotFound = new VB.ErrorConstants(11001);
   public static final VB.ErrorConstants sckHostNotFoundTryAgain = new VB.ErrorConstants(11002);
   public static final VB.ErrorConstants sckNonRecoverableError = new VB.ErrorConstants(11003);
   public static final VB.ErrorConstants sckNoData = new VB.ErrorConstants(11004);
   public static final VB.ErrorConstants sckBadState = new VB.ErrorConstants(40006);
   public static final VB.ErrorConstants sckInvalidArg = new VB.ErrorConstants(40014);
   public static final VB.ErrorConstants sckSuccess = new VB.ErrorConstants(40017);
   public static final VB.ErrorConstants sckUnsupported = new VB.ErrorConstants(40018);
   public static final VB.ErrorConstants sckInvalidOp = new VB.ErrorConstants(40020);
   public static final VB.ErrorConstants sckOutOfRange = new VB.ErrorConstants(40021);
   public static final VB.ErrorConstants sckWrongProtocol = new VB.ErrorConstants(40026);

   public ErrorConstants() {
   }

   public ErrorConstants(int var1) {
      super(var1);
   }

   public ErrorConstants(long var1) {
      super(var1);
   }

   public ErrorConstants(String var1) {
      super(var1);
   }
}
