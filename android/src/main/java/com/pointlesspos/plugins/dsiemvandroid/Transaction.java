package com.pointlesspos.plugins.dsiemvandroid;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.PluginMethod;

@CapacitorPlugin()
public class Transaction {
    private String MerchantID;
    private String UserTrace;
    private String POSPackageID;
    private String TranType;
    private String TranCode;
    private String SecureDevice;
    private String ComPort;
    private String InvoiceNo;
    private String RefNo;
    private String AuthCode;
    private Amount Amount;
    private String SequenceNo;
    private String AcqRefData;
    private String ProcessData;
    private String RecordNo;
    private String Frequency;
    private String BluetoothDeviceName;
    private String OperationMode;
    private String PinPadIpAddress;
    private String PinPadIpPort;

 
    @PluginMethod()
    public Transaction(String merchantID, String userTrace, String pOSPackageID, String tranCode, String secureDevice, String invoiceNo,  Amount amount, String sequenceNo,  String bluetoothDeviceName, String operationMode, String recordNo, String refNo){
        this.MerchantID = merchantID;
        this.UserTrace = userTrace;
        this.POSPackageID = pOSPackageID;
        this.TranCode = tranCode;
        this.SecureDevice = secureDevice;
        this.InvoiceNo = invoiceNo;
        this.Amount = amount;
        this.SequenceNo = sequenceNo;
        this.BluetoothDeviceName = bluetoothDeviceName;
        this.OperationMode = operationMode;
        this.RecordNo = recordNo;
        this.RefNo = refNo;
    }

    @PluginMethod()
    public Transaction(String merchantID, String userTrace, String pOSPackageID, String tranCode, String secureDevice, String invoiceNo,  Amount amount, String sequenceNo, String operationMode, String recordNo, String refNo){
        this.MerchantID = merchantID;
        this.UserTrace = userTrace;
        this.POSPackageID = pOSPackageID;
        this.TranCode = tranCode;
        this.SecureDevice = secureDevice;
        this.InvoiceNo = invoiceNo;
        this.Amount = amount;
        this.SequenceNo = sequenceNo;
        this.OperationMode = operationMode;
        this.RecordNo = recordNo;
        this.RefNo = refNo;
    }

    @PluginMethod
    public Transaction(String merchantID, String userTrace, String pOSPackageID, String tranCode, String secureDevice, String invoiceNo,  Amount amount, String sequenceNo, String operationMode, String recordNo, String refNo, String pinPadIpAddress, String pinPadIpPort){
        this.MerchantID = merchantID;
        this.UserTrace = userTrace;
        this.POSPackageID = pOSPackageID;
        this.TranCode = tranCode;
        this.SecureDevice = secureDevice;
        this.InvoiceNo = invoiceNo;
        this.Amount = amount;
        this.SequenceNo = sequenceNo;
        this.OperationMode = operationMode;
        this.RecordNo = recordNo;
        this.RefNo = refNo;
        this.PinPadIpAddress = pinPadIpAddress;
        this.PinPadIpPort = pinPadIpPort;
    }

    @PluginMethod()
    public String getMerchantID() {
        return MerchantID;
    }

    @PluginMethod()
    public void setMerchantID(String merchantID) {
        this.MerchantID = merchantID;
    }

    @PluginMethod()
    public String getUserTrace() {
        return UserTrace;
    }

    @PluginMethod()
    public void setUserTrace(String userTrace) {
        this.UserTrace = userTrace;
    }

    @PluginMethod()
    public String getPOSPackageID() {
        return POSPackageID;
    }

    @PluginMethod()
    public void setPOSPackageID(String POSPackageID) {
        this.POSPackageID = POSPackageID;
    }

    @PluginMethod()
    public String getTranType() {
        return TranType;
    }

    @PluginMethod()
    public void setTranType(String tranType) {
        this.TranType = tranType;
    }

    @PluginMethod()
    public String getTranCode() {
        return TranCode;
    }

    @PluginMethod()
    public void setTranCode(String tranCode) {
        this.TranCode = tranCode;
    }

    @PluginMethod()
    public String getSecureDevice() {
        return SecureDevice;
    }

    @PluginMethod()
    public void setSecureDevice(String secureDevice) {
        this.SecureDevice = secureDevice;
    }

    @PluginMethod()
    public String getComPort() {
        return ComPort;
    }

    @PluginMethod()
    public void setComPort(String comPort) {
        this.ComPort = comPort;
    }

    @PluginMethod()
    public String getInvoiceNo() {
        return InvoiceNo;
    }

    @PluginMethod()
    public void setInvoiceNo(String invoiceNo) {
        this.InvoiceNo = invoiceNo;
    }

    @PluginMethod()
    public String getRefNo() {
        return RefNo;
    }

    @PluginMethod()
    public void setRefNo(String refNo) {
        this.RefNo = refNo;
    }

    @PluginMethod()
    public String getAuthCode() {
        return AuthCode;
    }

    @PluginMethod()
    public void setAuthCode(String authCode) {
        this.AuthCode = authCode;
    }

    @PluginMethod()
    public Amount getAmount() {
        return Amount;
    }

    @PluginMethod()
    public void setAmount(Amount amount) {
        this.Amount = amount;
    }

    @PluginMethod()
    public String getSequenceNo() {
        return SequenceNo;
    }

    @PluginMethod()
    public void setSequenceNo(String sequenceNo) {
        this.SequenceNo = sequenceNo;
    }

    @PluginMethod()
    public String getAcqRefData() {
        return AcqRefData;
    }

    @PluginMethod()
    public void setAcqRefData(String acqRefData) {
        this.AcqRefData = acqRefData;
    }

    @PluginMethod()
    public String getProcessData() {
        return ProcessData;
    }

    @PluginMethod()
    public void setProcessData(String processData) {
        this.ProcessData = processData;
    }

    @PluginMethod()
    public String getRecordNo() {
        return RecordNo;
    }

    @PluginMethod()
    public void setRecordNo(String recordNo) {
        this.RecordNo = recordNo;
    }

    @PluginMethod()
    public String getFrequency() {
        return Frequency;
    }

    @PluginMethod()
    public void setFrequency(String frequency) {
        this.Frequency = frequency;
    }

    @PluginMethod()
    public String getBluetoothDeviceName() {
        return BluetoothDeviceName;
    }

    @PluginMethod()
    public void setBluetoothDeviceName(String bluetoothDeviceName) {
        this.BluetoothDeviceName = bluetoothDeviceName;
    }

    @PluginMethod()
    public String getOperationMode() {
        return OperationMode;
    }

    @PluginMethod()
    public void setOperationMode(String operationMode) {
        this.OperationMode = operationMode;
    }

    @PluginMethod()
    public String getPinPadIpAddress() {
        return PinPadIpAddress;
    }
    @PluginMethod()
    public void setPinPadIpAddress(String pinPadIpAddress) {
        PinPadIpAddress = pinPadIpAddress;
    }
}