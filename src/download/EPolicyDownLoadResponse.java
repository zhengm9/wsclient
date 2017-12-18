/**
 * EPolicyDownLoadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package download;

public class EPolicyDownLoadResponse  implements java.io.Serializable {
    private byte[] epolicyStream;

    private java.lang.String errorMessage;

    private java.lang.String policyNo;

    private java.lang.String policyURL;

    private java.lang.String proposalNo;

    private java.lang.String requestType;

    private java.lang.String responseCode;

    private download.Map result;

    private java.lang.String successFlag1;

    private java.lang.String successFlag2;

    private java.lang.String systemCode;

    private java.lang.String uRL;

    public EPolicyDownLoadResponse() {
    }

    public EPolicyDownLoadResponse(
           byte[] epolicyStream,
           java.lang.String errorMessage,
           java.lang.String policyNo,
           java.lang.String policyURL,
           java.lang.String proposalNo,
           java.lang.String requestType,
           java.lang.String responseCode,
           download.Map result,
           java.lang.String successFlag1,
           java.lang.String successFlag2,
           java.lang.String systemCode,
           java.lang.String uRL) {
           this.epolicyStream = epolicyStream;
           this.errorMessage = errorMessage;
           this.policyNo = policyNo;
           this.policyURL = policyURL;
           this.proposalNo = proposalNo;
           this.requestType = requestType;
           this.responseCode = responseCode;
           this.result = result;
           this.successFlag1 = successFlag1;
           this.successFlag2 = successFlag2;
           this.systemCode = systemCode;
           this.uRL = uRL;
    }


    /**
     * Gets the epolicyStream value for this EPolicyDownLoadResponse.
     * 
     * @return epolicyStream
     */
    public byte[] getEpolicyStream() {
        return epolicyStream;
    }


    /**
     * Sets the epolicyStream value for this EPolicyDownLoadResponse.
     * 
     * @param epolicyStream
     */
    public void setEpolicyStream(byte[] epolicyStream) {
        this.epolicyStream = epolicyStream;
    }


    /**
     * Gets the errorMessage value for this EPolicyDownLoadResponse.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this EPolicyDownLoadResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the policyNo value for this EPolicyDownLoadResponse.
     * 
     * @return policyNo
     */
    public java.lang.String getPolicyNo() {
        return policyNo;
    }


    /**
     * Sets the policyNo value for this EPolicyDownLoadResponse.
     * 
     * @param policyNo
     */
    public void setPolicyNo(java.lang.String policyNo) {
        this.policyNo = policyNo;
    }


    /**
     * Gets the policyURL value for this EPolicyDownLoadResponse.
     * 
     * @return policyURL
     */
    public java.lang.String getPolicyURL() {
        return policyURL;
    }


    /**
     * Sets the policyURL value for this EPolicyDownLoadResponse.
     * 
     * @param policyURL
     */
    public void setPolicyURL(java.lang.String policyURL) {
        this.policyURL = policyURL;
    }


    /**
     * Gets the proposalNo value for this EPolicyDownLoadResponse.
     * 
     * @return proposalNo
     */
    public java.lang.String getProposalNo() {
        return proposalNo;
    }


    /**
     * Sets the proposalNo value for this EPolicyDownLoadResponse.
     * 
     * @param proposalNo
     */
    public void setProposalNo(java.lang.String proposalNo) {
        this.proposalNo = proposalNo;
    }


    /**
     * Gets the requestType value for this EPolicyDownLoadResponse.
     * 
     * @return requestType
     */
    public java.lang.String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this EPolicyDownLoadResponse.
     * 
     * @param requestType
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the responseCode value for this EPolicyDownLoadResponse.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this EPolicyDownLoadResponse.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the result value for this EPolicyDownLoadResponse.
     * 
     * @return result
     */
    public download.Map getResult() {
        return result;
    }


    /**
     * Sets the result value for this EPolicyDownLoadResponse.
     * 
     * @param result
     */
    public void setResult(download.Map result) {
        this.result = result;
    }


    /**
     * Gets the successFlag1 value for this EPolicyDownLoadResponse.
     * 
     * @return successFlag1
     */
    public java.lang.String getSuccessFlag1() {
        return successFlag1;
    }


    /**
     * Sets the successFlag1 value for this EPolicyDownLoadResponse.
     * 
     * @param successFlag1
     */
    public void setSuccessFlag1(java.lang.String successFlag1) {
        this.successFlag1 = successFlag1;
    }


    /**
     * Gets the successFlag2 value for this EPolicyDownLoadResponse.
     * 
     * @return successFlag2
     */
    public java.lang.String getSuccessFlag2() {
        return successFlag2;
    }


    /**
     * Sets the successFlag2 value for this EPolicyDownLoadResponse.
     * 
     * @param successFlag2
     */
    public void setSuccessFlag2(java.lang.String successFlag2) {
        this.successFlag2 = successFlag2;
    }


    /**
     * Gets the systemCode value for this EPolicyDownLoadResponse.
     * 
     * @return systemCode
     */
    public java.lang.String getSystemCode() {
        return systemCode;
    }


    /**
     * Sets the systemCode value for this EPolicyDownLoadResponse.
     * 
     * @param systemCode
     */
    public void setSystemCode(java.lang.String systemCode) {
        this.systemCode = systemCode;
    }


    /**
     * Gets the uRL value for this EPolicyDownLoadResponse.
     * 
     * @return uRL
     */
    public java.lang.String getURL() {
        return uRL;
    }


    /**
     * Sets the uRL value for this EPolicyDownLoadResponse.
     * 
     * @param uRL
     */
    public void setURL(java.lang.String uRL) {
        this.uRL = uRL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EPolicyDownLoadResponse)) return false;
        EPolicyDownLoadResponse other = (EPolicyDownLoadResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.epolicyStream==null && other.getEpolicyStream()==null) || 
             (this.epolicyStream!=null &&
              java.util.Arrays.equals(this.epolicyStream, other.getEpolicyStream()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.policyNo==null && other.getPolicyNo()==null) || 
             (this.policyNo!=null &&
              this.policyNo.equals(other.getPolicyNo()))) &&
            ((this.policyURL==null && other.getPolicyURL()==null) || 
             (this.policyURL!=null &&
              this.policyURL.equals(other.getPolicyURL()))) &&
            ((this.proposalNo==null && other.getProposalNo()==null) || 
             (this.proposalNo!=null &&
              this.proposalNo.equals(other.getProposalNo()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.successFlag1==null && other.getSuccessFlag1()==null) || 
             (this.successFlag1!=null &&
              this.successFlag1.equals(other.getSuccessFlag1()))) &&
            ((this.successFlag2==null && other.getSuccessFlag2()==null) || 
             (this.successFlag2!=null &&
              this.successFlag2.equals(other.getSuccessFlag2()))) &&
            ((this.systemCode==null && other.getSystemCode()==null) || 
             (this.systemCode!=null &&
              this.systemCode.equals(other.getSystemCode()))) &&
            ((this.uRL==null && other.getURL()==null) || 
             (this.uRL!=null &&
              this.uRL.equals(other.getURL())));
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
        if (getEpolicyStream() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEpolicyStream());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEpolicyStream(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getPolicyNo() != null) {
            _hashCode += getPolicyNo().hashCode();
        }
        if (getPolicyURL() != null) {
            _hashCode += getPolicyURL().hashCode();
        }
        if (getProposalNo() != null) {
            _hashCode += getProposalNo().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getSuccessFlag1() != null) {
            _hashCode += getSuccessFlag1().hashCode();
        }
        if (getSuccessFlag2() != null) {
            _hashCode += getSuccessFlag2().hashCode();
        }
        if (getSystemCode() != null) {
            _hashCode += getSystemCode().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EPolicyDownLoadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "EPolicyDownLoadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epolicyStream");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "epolicyStream"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "policyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "policyURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "proposalNo"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://util.java/xsd", "Map"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successFlag1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "successFlag1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successFlag2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "successFlag2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "systemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.ePolicyDownload.GSTC.webServiceCenter.sinosoft.com/xsd", "uRL"));
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
