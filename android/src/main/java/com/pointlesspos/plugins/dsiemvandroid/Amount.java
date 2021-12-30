package com.pointlesspos.plugins.dsiemvandroid;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin()
public class Amount {
    private String Purchase;

    @PluginMethod
    public Amount(String mpurchase){
        Purchase = mpurchase;
    }

}
