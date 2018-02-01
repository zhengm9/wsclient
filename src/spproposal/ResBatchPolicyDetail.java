/**
 * ResBatchPolicyDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package spproposal;

public class ResBatchPolicyDetail  implements java.io.Serializable {
    private java.lang.String errorMessage;

    private java.lang.String identifyNumber;

    private java.lang.String identifyType;

    private java.lang.String responseCode;

    public ResBatchPolicyDetail() {
    }

    public ResBatchPolicyDetail(
           java.lang.String errorMessage,
           java.lang.String identifyNumber,
           java.lang.String identifyType,
           java.lang.String responseCode) {
           this.errorMessage = errorMessage;
           this.identifyNumber = identifyNumber;
           this.identifyType = identifyType;
           this.responseCode = responseCode;
    }


    /**
     * Gets the errorMessage value for this ResBatchPolicyDetail.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ResBatchPolicyDetail.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the identifyNumber value for this ResBatchPolicyDetail.
     * 
     * @return identifyNumber
     */
    public java.lang.String getIdentifyNumber() {
        return identifyNumber;
    }


    /**
     * Sets the identifyNumber value for this ResBatchPolicyDetail.
     * 
     * @param identifyNumber
     */
    public void setIdentifyNumber(java.lang.String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }


    /**
     * Gets the identifyType value for this ResBatchPolicyDetail.
     * 
     * @return identifyType
     */
    public java.lang.String getIdentifyType() {
        return identifyType;
    }


    /**
     * Sets the identifyType value for this ResBatchPolicyDetail.
     * 
     * @param identifyType
     */
    public void setIdentifyType(java.lang.String identifyType) {
        this.identifyType = identifyType;
    }


    /**
     * Gets the responseCode value for this ResBatchPolicyDetail.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this ResBatchPolicyDetail.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResBatchPolicyDetail)) return false;
        ResBatchPolicyDetail other = (ResBatchPolicyDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.identifyNumber==null && other.getIdentifyNumber()==null) || 
             (this.identifyNumber!=null &&
              this.identifyNumber.equals(other.getIdentifyNumber()))) &&
            ((this.identifyType==null && other.getIdentifyType()==null) || 
             (this.identifyType!=null &&
              this.identifyType.equals(other.getIdentifyType()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode())));
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
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getIdentifyNumber() != null) {
            _hashCode += getIdentifyNumber().hashCode();
        }
        if (getIdentifyType() != null) {
            _hashCode += getIdentifyType().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResBatchPolicyDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "ResBatchPolicyDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "identifyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "identifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "responseCode"));
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
