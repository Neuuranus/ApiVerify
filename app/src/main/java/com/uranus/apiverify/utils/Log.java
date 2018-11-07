package com.uranus.apiverify.utils;

public class Log {
    private static final String TAG = "ApiVerify";
    private static final int STACK_TRACE_INDEX = 4;
    private static final int PKG_NAME_LENGH = "com.uranus.apiverify".length();

    private static String getLogPrefix(boolean m, boolean c, boolean fl){
        StackTraceElement ste = Thread.currentThread().getStackTrace()[STACK_TRACE_INDEX];
        StringBuffer sb = new StringBuffer();
        boolean brackets = false;
        if (c) {
            sb.append(ste.getClassName().substring(PKG_NAME_LENGH));
            if(m){
                sb.append("#");
            }
            brackets = true;
        }
        if (m) {
            sb.append(ste.getMethodName());
            brackets = true;
        }
        if (fl) {
            if (brackets) {
                sb.append("(");
            }
            sb.append(ste.getFileName()).append(":").append(ste.getLineNumber());
            if (brackets) {
                sb.append(")");
            }
        }
        sb.append(": ");
        return sb.toString();
    }

    public static void i(String s) {
        android.util.Log.println(android.util.Log.INFO, TAG, ""+getLogPrefix(true, true, true) + s);
    }
    public static void w(String s) {
        android.util.Log.println(android.util.Log.WARN, TAG, ""+getLogPrefix(true, true, true) + s);
    }
    public static void d(String s) {
        android.util.Log.println(android.util.Log.DEBUG, TAG, ""+getLogPrefix(true, true, true) + s);
    }
    public static void e(String s) {
        android.util.Log.println(android.util.Log.ERROR, TAG, ""+getLogPrefix(true, true, true) + s);
    }
    public static void v(String s) {
        android.util.Log.println(android.util.Log.VERBOSE, TAG, ""+getLogPrefix(true, true, true) + s);
    }
}
