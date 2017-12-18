/**
 * ProposalSaveResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class ProposalSaveResponse  implements java.io.Serializable {
    private java.lang.String comID;

    private java.lang.String errorMessage;

    private java.lang.String fromID;

    private java.lang.String othSerialNo;

    private java.lang.String policyNo;

    private java.lang.String policyURL;

    private java.lang.String proposalNo;

    private java.lang.String requestType;

    private java.lang.String responseCode;

    private java.lang.String sendTime;

    private java.lang.String serialNo;

    private java.lang.String uuid;

    public ProposalSaveResponse() {
    }

    public ProposalSaveResponse(
           java.lang.String comID,
           java.lang.String errorMessage,
           java.lang.String fromID,
           java.lang.String othSerialNo,
           java.lang.String policyNo,
           java.lang.String policyURL,
           java.lang.String proposalNo,
           java.lang.String requestType,
           java.lang.String responseCode,
           java.lang.String sendTime,
           java.lang.String serialNo,
           java.lang.String uuid) {
           this.comID = comID;
           this.errorMessage = errorMessage;
           this.fromID = fromID;
           this.othSerialNo = othSerialNo;
           this.policyNo = policyNo;
           this.policyURL = policyURL;
           this.proposalNo = proposalNo;
           this.requestType = requestType;
           this.responseCode = responseCode;
           this.sendTime = sendTime;
           this.serialNo = serialNo;
           this.uuid = uuid;
    }


    /**
     * Gets the comID value for this ProposalSaveResponse.
     * 
     * @return comID
     */
    public java.lang.String getComID() {
        return comID;
    }


    /**
     * Sets the comID value for this ProposalSaveResponse.
     * 
     * @param comID
     */
    public void setComID(java.lang.String comID) {
        this.comID = comID;
    }


    /**
     * Gets the errorMessage value for this ProposalSaveResponse.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ProposalSaveResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the fromID value for this ProposalSaveResponse.
     * 
     * @return fromID
     */
    public java.lang.String getFromID() {
        return fromID;
    }


    /**
     * Sets the fromID value for this ProposalSaveResponse.
     * 
     * @param fromID
     */
    public void setFromID(java.lang.String fromID) {
        this.fromID = fromID;
    }


    /**
     * Gets the othSerialNo value for this ProposalSaveResponse.
     * 
     * @return othSerialNo
     */
    public java.lang.String getOthSerialNo() {
        return othSerialNo;
    }


    /**
     * Sets the othSerialNo value for this ProposalSaveResponse.
     * 
     * @param othSerialNo
     */
    public void setOthSerialNo(java.lang.String othSerialNo) {
        this.othSerialNo = othSerialNo;
    }


    /**
     * Gets the policyNo value for this ProposalSaveResponse.
     * 
     * @return policyNo
     */
    public java.lang.String getPolicyNo() {
        return policyNo;
    }


    /**
     * Sets the policyNo value for this ProposalSaveResponse.
     * 
     * @param policyNo
     */
    public void setPolicyNo(java.lang.String policyNo) {
        this.policyNo = policyNo;
    }


    /**
     * Gets the policyURL value for this ProposalSaveResponse.
     * 
     * @return policyURL
     */
    public java.lang.String getPolicyURL() {
        return policyURL;
    }


    /**
     * Sets the policyURL value for this ProposalSaveResponse.
     * 
     * @param policyURL
     */
    public void setPolicyURL(java.lang.String policyURL) {
        this.policyURL = policyURL;
    }


    /**
     * Gets the proposalNo value for this ProposalSaveResponse.
     * 
     * @return proposalNo
     */
    public java.lang.String getProposalNo() {
        return proposalNo;
    }


    /**
     * Sets the proposalNo value for this ProposalSaveResponse.
     * 
     * @param proposalNo
     */
    public void setProposalNo(java.lang.String proposalNo) {
        this.proposalNo = proposalNo;
    }


    /**
     * Gets the requestType value for this ProposalSaveResponse.
     * 
     * @return requestType
     */
    public java.lang.String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this ProposalSaveResponse.
     * 
     * @param requestType
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the responseCode value for this ProposalSaveResponse.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this ProposalSaveResponse.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the sendTime value for this ProposalSaveResponse.
     * 
     * @return sendTime
     */
    public java.lang.String getSendTime() {
        return sendTime;
    }


    /**
     * Sets the sendTime value for this ProposalSaveResponse.
     * 
     * @param sendTime
     */
    public void setSendTime(java.lang.String sendTime) {
        this.sendTime = sendTime;
    }


    /**
     * Gets the serialNo value for this ProposalSaveResponse.
     * 
     * @return serialNo
     */
    public java.lang.String getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this ProposalSaveResponse.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.String serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the uuid value for this ProposalSaveResponse.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this ProposalSaveResponse.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalSaveResponse)) return false;
        ProposalSaveResponse other = (ProposalSaveResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comID==null && other.getComID()==null) || 
             (this.comID!=null &&
              this.comID.equals(other.getComID()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.fromID==null && other.getFromID()==null) || 
             (this.fromID!=null &&
              this.fromID.equals(other.getFromID()))) &&
            ((this.othSerialNo==null && other.getOthSerialNo()==null) || 
             (this.othSerialNo!=null &&
              this.othSerialNo.equals(other.getOthSerialNo()))) &&
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
            ((this.sendTime==null && other.getSendTime()==null) || 
             (this.sendTime!=null &&
              this.sendTime.equals(other.getSendTime()))) &&
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid())));
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
        if (getComID() != null) {
            _hashCode += getComID().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getFromID() != null) {
            _hashCode += getFromID().hashCode();
        }
        if (getOthSerialNo() != null) {
            _hashCode += getOthSerialNo().hashCode();
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
        if (getSendTime() != null) {
            _hashCode += getSendTime().hashCode();
        }
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalSaveResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "ProposalSaveResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "comID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "fromID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("othSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "othSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "policyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "policyURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "proposalNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "requestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "sendTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "uuid"));
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
