package com.pointlesspos.plugins.dsiemvandroid;

import android.content.Context;
import com.getcapacitor.JSObject;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.datacap.android.dsiEMVAndroid;

@CapacitorPlugin()
public class dsiEMVAndroidinstance {
    private static volatile dsiEMVAndroid instance;

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

}
