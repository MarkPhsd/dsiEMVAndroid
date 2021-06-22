package com.pointlesspos.plugins.dsiemvandroid;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class Amount {
    private String Purchase;

    @PluginMethod
    public Amount(String mpurchase){
        Purchase = mpurchase;
    }

}
