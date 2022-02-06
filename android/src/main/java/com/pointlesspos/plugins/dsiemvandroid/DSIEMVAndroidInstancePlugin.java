package com.pointlesspos.plugins.dsiemvandroid;

import android.content.Context;
import com.getcapacitor.JSObject;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.datacap.android.dsiEMVAndroid;

@CapacitorPlugin(name = "DSIEMVAndroidInstance")
public class DSIEMVAndroidInstance extends Plugin {
    private static volatile DSIEMVAndroid instance;

    @PluginMethod()
    public static dsiEMVAndroid getInstance(Context context){
        if (instance == null) {
            synchronized (dsiemvandroid .class){
                if(instance == null){
                    instance = new dsiEMVAndroid(context);
                }
            }
        }
        return instance;
    }

    @PluginMethod()
    public void echo(PluginCall call) {
        String value = call.getString("value");
        JSObject ret = new JSObject();
        ret.put("Output from Android Implementation", value);
        call.success(ret);
    }


 
}
