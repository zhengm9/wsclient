/**
 * SmsService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sms;

public interface SmsService_PortType extends java.rmi.Remote {
    public com.sms.Response createActivitySpreadTask(java.lang.String userName, java.lang.String password, com.sms.SpreadTask spreakTask) throws java.rmi.RemoteException;
    public com.sms.Response sendSMS(java.lang.String userName, java.lang.String password, com.sms.SmsMessages msgs) throws java.rmi.RemoteException;
}
