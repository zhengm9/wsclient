/**
 * Label.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sms;

public class Label  extends com.sms.AbstractMessage  implements java.io.Serializable {
    private java.lang.String labelName;

    private java.lang.String labelValue;

    public Label() {
    }

    public Label(
           int packetLength,
           java.lang.String labelName,
           java.lang.String labelValue) {
        super(
            packetLength);
        this.labelName = labelName;
        this.labelValue = labelValue;
    }


    /**
     * Gets the labelName value for this Label.
     * 
     * @return labelName
     */
    public java.lang.String getLabelName() {
        return labelName;
    }


    /**
     * Sets the labelName value for this Label.
     * 
     * @param labelName
     */
    public void setLabelName(java.lang.String labelName) {
        this.labelName = labelName;
    }


    /**
     * Gets the labelValue value for this Label.
     * 
     * @return labelValue
     */
    public java.lang.String getLabelValue() {
        return labelValue;
    }


    /**
     * Sets the labelValue value for this Label.
     * 
     * @param labelValue
     */
    public void setLabelValue(java.lang.String labelValue) {
        this.labelValue = labelValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Label)) return false;
        Label other = (Label) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.labelName==null && other.getLabelName()==null) || 
             (this.labelName!=null &&
              this.labelName.equals(other.getLabelName()))) &&
            ((this.labelValue==null && other.getLabelValue()==null) || 
             (this.labelValue!=null &&
              this.labelValue.equals(other.getLabelValue())));
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
        if (getLabelName() != null) {
            _hashCode += getLabelName().hashCode();
        }
        if (getLabelValue() != null) {
            _hashCode += getLabelValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Label.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.net.sms.wisdom.com", "Label"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelValue"));
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
