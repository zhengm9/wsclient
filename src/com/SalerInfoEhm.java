/**
 * SalerInfoEhm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class SalerInfoEhm  implements java.io.Serializable {
    private java.lang.String saler;

    private java.lang.String salerBranch;

    private java.lang.String salerBranchName;

    private java.lang.String salerName;

    public SalerInfoEhm() {
    }

    public SalerInfoEhm(
           java.lang.String saler,
           java.lang.String salerBranch,
           java.lang.String salerBranchName,
           java.lang.String salerName) {
           this.saler = saler;
           this.salerBranch = salerBranch;
           this.salerBranchName = salerBranchName;
           this.salerName = salerName;
    }


    /**
     * Gets the saler value for this SalerInfoEhm.
     * 
     * @return saler
     */
    public java.lang.String getSaler() {
        return saler;
    }


    /**
     * Sets the saler value for this SalerInfoEhm.
     * 
     * @param saler
     */
    public void setSaler(java.lang.String saler) {
        this.saler = saler;
    }


    /**
     * Gets the salerBranch value for this SalerInfoEhm.
     * 
     * @return salerBranch
     */
    public java.lang.String getSalerBranch() {
        return salerBranch;
    }


    /**
     * Sets the salerBranch value for this SalerInfoEhm.
     * 
     * @param salerBranch
     */
    public void setSalerBranch(java.lang.String salerBranch) {
        this.salerBranch = salerBranch;
    }


    /**
     * Gets the salerBranchName value for this SalerInfoEhm.
     * 
     * @return salerBranchName
     */
    public java.lang.String getSalerBranchName() {
        return salerBranchName;
    }


    /**
     * Sets the salerBranchName value for this SalerInfoEhm.
     * 
     * @param salerBranchName
     */
    public void setSalerBranchName(java.lang.String salerBranchName) {
        this.salerBranchName = salerBranchName;
    }


    /**
     * Gets the salerName value for this SalerInfoEhm.
     * 
     * @return salerName
     */
    public java.lang.String getSalerName() {
        return salerName;
    }


    /**
     * Sets the salerName value for this SalerInfoEhm.
     * 
     * @param salerName
     */
    public void setSalerName(java.lang.String salerName) {
        this.salerName = salerName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalerInfoEhm)) return false;
        SalerInfoEhm other = (SalerInfoEhm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.saler==null && other.getSaler()==null) || 
             (this.saler!=null &&
              this.saler.equals(other.getSaler()))) &&
            ((this.salerBranch==null && other.getSalerBranch()==null) || 
             (this.salerBranch!=null &&
              this.salerBranch.equals(other.getSalerBranch()))) &&
            ((this.salerBranchName==null && other.getSalerBranchName()==null) || 
             (this.salerBranchName!=null &&
              this.salerBranchName.equals(other.getSalerBranchName()))) &&
            ((this.salerName==null && other.getSalerName()==null) || 
             (this.salerName!=null &&
              this.salerName.equals(other.getSalerName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSaler() != null) {
            _hashCode += getSaler().hashCode();
        }
        if (getSalerBranch() != null) {
            _hashCode += getSalerBranch().hashCode();
        }
        if (getSalerBranchName() != null) {
            _hashCode += getSalerBranchName().hashCode();
        }
        if (getSalerName() != null) {
            _hashCode += getSalerName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalerInfoEhm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "SalerInfoEhm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saler");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "saler"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salerBranch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "salerBranch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salerBranchName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "salerBranchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "salerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
