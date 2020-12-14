package com.ihbing.fridaapi;

public class FridaMethodParam {
    public static final String TAG = "FridaMethodParam";
    public Object thisObject;
    public Object[] args;
    public Object result;
    public String methodName;

    public FridaMethodParam setThisObject(Object thisObject) {
        this.thisObject = thisObject;
        return this;
    }

    public FridaMethodParam setArgs(Object[] args) {
        this.args = args;
        return this;
    }

    public FridaMethodParam setResult(Object result) {
        this.result = result;
        return this;
    }

    public FridaMethodParam setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
}
