/**
 * LimitEhm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package spproposal;

public class LimitEhm  implements java.io.Serializable {
    private java.lang.String limitFee;

    private java.lang.String limitType;

    public LimitEhm() {
    }

    public LimitEhm(
           java.lang.String limitFee,
           java.lang.String limitType) {
           this.limitFee = limitFee;
           this.limitType = limitType;
    }


    /**
     * Gets the limitFee value for this LimitEhm.
     * 
     * @return limitFee
     */
    public java.lang.String getLimitFee() {
        return limitFee;
    }


    /**
     * Sets the limitFee value for this LimitEhm.
     * 
     * @param limitFee
     */
    public void setLimitFee(java.lang.String limitFee) {
        this.limitFee = limitFee;
    }


    /**
     * Gets the limitType value for this LimitEhm.
     * 
     * @return limitType
     */
    public java.lang.String getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this LimitEhm.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LimitEhm)) return false;
        LimitEhm other = (LimitEhm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitFee==null && other.getLimitFee()==null) || 
             (this.limitFee!=null &&
              this.limitFee.equals(other.getLimitFee()))) &&
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType())));
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
        if (getLimitFee() != null) {
            _hashCode += getLimitFee().hashCode();
        }
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LimitEhm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "LimitEhm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "limitFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "limitType"));
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
