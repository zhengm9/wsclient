/**
 * SmsMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sms;

public class SmsMessage  extends com.sms.AbstractMessage  implements java.io.Serializable {
    private java.lang.String contents;

    private com.sms.Label[] labels;

    private java.lang.String orgCode;

    private java.lang.String receiver;

    public SmsMessage() {
    }

    public SmsMessage(
           int packetLength,
           java.lang.String contents,
           com.sms.Label[] labels,
           java.lang.String orgCode,
           java.lang.String receiver) {
        super(
            packetLength);
        this.contents = contents;
        this.labels = labels;
        this.orgCode = orgCode;
        this.receiver = receiver;
    }


    /**
     * Gets the contents value for this SmsMessage.
     * 
     * @return contents
     */
    public java.lang.String getContents() {
        return contents;
    }


    /**
     * Sets the contents value for this SmsMessage.
     * 
     * @param contents
     */
    public void setContents(java.lang.String contents) {
        this.contents = contents;
    }


    /**
     * Gets the labels value for this SmsMessage.
     * 
     * @return labels
     */
    public com.sms.Label[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this SmsMessage.
     * 
     * @param labels
     */
    public void setLabels(com.sms.Label[] labels) {
        this.labels = labels;
    }


    /**
     * Gets the orgCode value for this SmsMessage.
     * 
     * @return orgCode
     */
    public java.lang.String getOrgCode() {
        return orgCode;
    }


    /**
     * Sets the orgCode value for this SmsMessage.
     * 
     * @param orgCode
     */
    public void setOrgCode(java.lang.String orgCode) {
        this.orgCode = orgCode;
    }


    /**
     * Gets the receiver value for this SmsMessage.
     * 
     * @return receiver
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this SmsMessage.
     * 
     * @param receiver
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmsMessage)) return false;
        SmsMessage other = (SmsMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contents==null && other.getContents()==null) || 
             (this.contents!=null &&
              this.contents.equals(other.getContents()))) &&
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
            ((this.orgCode==null && other.getOrgCode()==null) || 
             (this.orgCode!=null &&
              this.orgCode.equals(other.getOrgCode()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getContents() != null) {
            _hashCode += getContents().hashCode();
        }
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrgCode() != null) {
            _hashCode += getOrgCode().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmsMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.net.sms.wisdom.com", "SmsMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.net.sms.wisdom.com", "Label"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
