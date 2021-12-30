package com.pointlesspos.plugins.dsiemvandroid;

import com.getcapacitor.JSObject;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@CapacitorPlugin()
public class Admin {
    private String MerchantID;
    private String UserTrace;
    private String POSPackageID;
    private String TranCode;
    private String SecureDevice;
    private String ComPort;
    private String SequenceNo;
    private String BluetoothDeviceName;
    private String OperationMode;
    private String PinPadIpAddress;
    private String PinPadIpPort;

    @PluginMethod
    public Admin(String merchantID, String userTrace, String pOSPackageID, String tranCode, String secureDevice, String sequenceNo, String bluetoothDeviceName, String operationMode){
        this.MerchantID = merchantID;
        this.UserTrace = userTrace;
        this.POSPackageID = pOSPackageID;
        this.TranCode = tranCode;
        this.SecureDevice = secureDevice;
        this.ComPort = "1";
        this.SequenceNo = sequenceNo;
        this.BluetoothDeviceName = bluetoothDeviceName;
        this.OperationMode = operationMode;
    }
    @PluginMethod
    public Admin(String merchantID, String userTrace, String pOSPackageID, String tranCode, String secureDevice, String sequenceNo, String operationMode){
        this.MerchantID = merchantID;
        this.UserTrace = userTrace;
        this.POSPackageID = pOSPackageID;
        this.TranCode = tranCode;
        this.SecureDevice = secureDevice;
        this.ComPort = "1";
        this.SequenceNo = sequenceNo;
        this.OperationMode = operationMode;
    }
    @PluginMethod
    public Admin(String merchantID, String userTrace, String pOSPackageID, String tranCode, String secureDevice, String sequenceNo, String operationMode, String pinPadIpAddress, String pinPadIpPort){
        this.MerchantID = merchantID;
        this.UserTrace = userTrace;
        this.POSPackageID = pOSPackageID;
        this.TranCode = tranCode;
        this.SecureDevice = secureDevice;
        this.ComPort = "1";
        this.SequenceNo = sequenceNo;
        this.OperationMode = operationMode;
        this.PinPadIpAddress = pinPadIpAddress;
        this.PinPadIpPort = pinPadIpPort;
    }

    @PluginMethod
    public String getMerchantID() {
        return MerchantID;
    }

    @PluginMethod
    public void setMerchantID(String merchantID) {
        this.MerchantID = merchantID;
    }

    @PluginMethod
    public String getUserTrace() {
        return UserTrace;
    }

    @PluginMethod
    public void setUserTrace(String userTrace) {
        this.UserTrace = userTrace;
    }

    @PluginMethod
    public String getPOSPackageID() {
        return POSPackageID;
    }

    @PluginMethod
    public void setPOSPackageID(String POSPackageID) {
        this.POSPackageID = POSPackageID;
    }

    @PluginMethod
    public String getTranCode() {
        return TranCode;
    }

    @PluginMethod
    public void setTranCode(String tranCode) {
        this.TranCode = tranCode;
    }

    @PluginMethod
    public String getSecureDevice() {
        return SecureDevice;
    }

    @PluginMethod
    public void setSecureDevice(String secureDevice) {
        this.SecureDevice = secureDevice;
    }

    @PluginMethod
    public String getComPort() {
        return ComPort;
    }

    @PluginMethod
    public void setComPort(String comPort) {
        this.ComPort = comPort;
    }

    @PluginMethod
    public String getSequenceNo() {
        return SequenceNo;
    }

    @PluginMethod
    public void setSequenceNo(String sequenceNo) {
        this.SequenceNo = sequenceNo;
    }

    @PluginMethod
    public String getBluetoothDeviceName() {
        return BluetoothDeviceName;
    }

    @PluginMethod
    public void setBluetoothDeviceName(String bluetoothDeviceName) {
        this.BluetoothDeviceName = bluetoothDeviceName;
    }

    @PluginMethod
    public String getOperationMode() {
        return OperationMode;
    }

    @PluginMethod
    public void setOperationMode(String operationMode) {
        this.OperationMode = operationMode;
    }

    @PluginMethod
    public String getPinPadIpAddress() {
        return PinPadIpAddress;
    }

    @PluginMethod
    public void setPinPadIpAddress(String pinPadIpAddress) {
        PinPadIpAddress = pinPadIpAddress;
    }

    @PluginMethod
    public String getPinPadIpPort() {
        return PinPadIpPort;
    }

    @PluginMethod
    public void setPinPadIpPort(String pinPadIpPort) {
        PinPadIpPort = pinPadIpPort;
    }
}
