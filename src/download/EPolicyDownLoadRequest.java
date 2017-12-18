/**
 * EPolicyDownLoadRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package download;

public class EPolicyDownLoadRequest  implements java.io.Serializable {
    private java.lang.String policyNo;

    private java.lang.String requestInfo1;

    private java.lang.String requestInfo2;

    private java.lang.String requestType;

    public EPolicyDownLoadRequest() {
    }

    public EPolicyDownLoadRequest(
           java.lang.String policyNo,
           java.lang.String requestInfo1,
           java.lang.String requestInfo2,
           java.lang.String requestType) {
           this.policyNo = policyNo;
           this.requestInfo1 = requestInfo1;
           this.requestInfo2 = requestInfo2;
           this.requestType = requestType;
    }


    /**
     * Gets the policyNo value for this EPolicyDownLoadRequest.
     * 
     * @return policyNo
     */
    public java.lang.String getPolicyNo() {
        return policyNo;
    }


    /**
     * Sets the policyNo value for this EPolicyDownLoadRequest.
     * 
     * @param policyNo
     */
    public void setPolicyNo(java.lang.String policyNo) {
        this.policyNo = policyNo;
    }


    /**
     * Gets the requestInfo1 value for this EPolicyDownLoadRequest.
     * 
     * @return requestInfo1
     */
    public java.lang.String getRequestInfo1() {
        return requestInfo1;
    }


    /**
     * Sets the requestInfo1 value for this EPolicyDownLoadRequest.
     * 
     * @param requestInfo1
     */
    public void setRequestInfo1(java.lang.String requestInfo1) {
        this.requestInfo1 = requestInfo1;
    }


    /**
     * Gets the requestInfo2 value for this EPolicyDownLoadRequest.
     * 
     * @return requestInfo2
     */
    public java.lang.String getRequestInfo2() {
        return requestInfo2;
    }


    /**
     * Sets the requestInfo2 value for this EPolicyDownLoadRequest.
     * 
     * @param requestInfo2
     */
    public void setRequestInfo2(java.lang.String requestInfo2) {
        this.requestInfo2 = requestInfo2;
    }


    /**
     * Gets the requestType value for this EPolicyDownLoadRequest.
     * 
     * @return requestType
     */
    public java.lang.String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this EPolicyDownLoadRequest.
     * 
     * @param requestType
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EPolicyDownLoadRequest)) return false;
        EPolicyDownLoadRequest other = (EPolicyDownLoadRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyNo==null && other.getPolicyNo()==null) || 
             (this.policyNo!=null &&
              this.policyNo.equals(other.getPolicyNo()))) &&
            ((this.requestInfo1==null && other.getRequestInfo1()==null) || 
             (this.requestInfo1!=null &&
              this.requestInfo1.equals(other.getRequestInfo1()))) &&
            ((this.requestInfo2==null && other.getRequestInfo2()==null) || 
             (this.requestInfo2!=null &&
              this.requestInfo2.equals(other.getRequestInfo2()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType())));
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
        if (getPolicyNo() != null) {
            _hashCode += getPolicyNo().hashCode();
        }
        if (getRequestInfo1() != null) {
            _hashCode += getRequestInfo1().hashCode();
        }
        if (getRequestInfo2() != null) {
            _hashCode += getRequestInfo2().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EPolicyDownLoadRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "EPolicyDownLoadRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "policyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestInfo1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "requestInfo1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestInfo2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "requestInfo2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "requestType"));
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
