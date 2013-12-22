/*
 * This file is in PUBLIC DOMAIN. You can use it freely. No guarantee.
 */
package android.os;

/**
 * @author Fan Hongtao &ltfanhongtao@gmail.com&gt
 */
public final class StrictMode {
    /**
     * Called from Parcel.writeNoException()
     */
    /* package */static boolean hasGatheredViolations() {
        return false;
    }

    /**
     * Called from Parcel.writeException(), so we drop this memory and
     * don't incorrectly attribute it to the wrong caller on the next
     * Binder call on this thread.
     */
    /* package */static void clearGatheredViolations() {
    }

    /**
     * Called from Parcel.writeNoException()
     */
    /* package */static void writeGatheredViolationsToParcel(Parcel p) {
    }
    
    /**
     * Called from Parcel.readException() when the exception is EX_STRICT_MODE_VIOLATIONS,
     * we here read back all the encoded violations.
     */
    /* package */ static void readAndHandleBinderCallViolations(Parcel p) {
    }
}
