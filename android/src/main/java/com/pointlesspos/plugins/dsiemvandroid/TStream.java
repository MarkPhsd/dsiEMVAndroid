package com.pointlesspos.plugins.dsiemvandroid;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.PluginMethod;

@CapacitorPlugin()
public class TStream {

    private Transaction Transaction;
    private Admin Admin;

    @PluginMethod()
    public TStream( Transaction transaction){
        this.Transaction = transaction;
    }

    @PluginMethod()
    public TStream( Admin admin){
        this.Admin = admin;
    }

    @PluginMethod()
    public com.pointlesspos.plugins.dsiemvandroid.Admin getAdmin() {
        return Admin;
    }

    @PluginMethod()
    public void setAdmin(com.pointlesspos.plugins.dsiemvandroid.Admin admin) {
        Admin = admin;
    }

    @PluginMethod()
    public com.pointlesspos.plugins.dsiemvandroid.Transaction getTransaction() {
        return Transaction;
    }

    @PluginMethod()
    public void setTransaction(com.pointlesspos.plugins.dsiemvandroid.Transaction transaction) {
        Transaction = transaction;
    }

}
