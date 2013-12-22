/*
 * This file is in PUBLIC DOMAIN. You can use it freely. No guarantee.
 */
package com.android.internal.os;

/**
 * @author Fan Hongtao &ltfanhongtao@gmail.com&gt
 */
public class RuntimeInit {
    /**
     * Report a serious error in the current process.  May or may not cause
     * the process to terminate (depends on system settings).
     *
     * @param tag to record with the error
     * @param t exception describing the error site and conditions
     */
    public static void wtf(String tag, Throwable t) {
    }
}
