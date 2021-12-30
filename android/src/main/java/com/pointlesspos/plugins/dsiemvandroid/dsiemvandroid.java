package com.pointlesspos.plugins.dsiemvandroid;

import com.getcapacitor.JSObject;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@CapacitorPlugin
public class dsiemvandroid extends Plugin {
    public void load() {
        // Called when the plugin is first constructed in the bridge
    }

    @PluginMethod()
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("Output from Android Implementation", value);
        call.success(ret);
    }

}
