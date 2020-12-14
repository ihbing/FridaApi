package com.ihbing.fridaapi;

public abstract class FridaCallback {
    public static final String TAG = "FridaCallback";
    public abstract void beforeInvokeMethod(FridaMethodParam param);
    public abstract void afterInvokeMethod(FridaMethodParam param);
}
