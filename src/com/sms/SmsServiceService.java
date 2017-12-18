/**
 * SmsServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sms;

public interface SmsServiceService extends javax.xml.rpc.Service {
    public java.lang.String getSmsServiceAddress();

    public com.sms.SmsService_PortType getSmsService() throws javax.xml.rpc.ServiceException;

    public com.sms.SmsService_PortType getSmsService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
