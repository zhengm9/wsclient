/**
 * ProposalSaveRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class ProposalSaveRequest  implements java.io.Serializable {
    private com.ApplicantEhm applicantEhm;

    private com.BenefitEhm[] benefitEhm;

    private com.FlightEhm flightEhm;

    private com.InsuredEhm insuredEhm;

    private com.ItemKindAddrEhm itemKindAddrEhm;

    private com.MainEhm mainEhm;

    private com.OperteLogEhm operteLogEhm;

    private java.lang.String requestType;

    private com.SalerInfoEhm salerInfoEhm;

    private com.SpecialInfoEhm specialInfoEhm;

    private java.lang.String systemCode;

    public ProposalSaveRequest() {
    }

    public ProposalSaveRequest(
           com.ApplicantEhm applicantEhm,
           com.BenefitEhm[] benefitEhm,
           com.FlightEhm flightEhm,
           com.InsuredEhm insuredEhm,
           com.ItemKindAddrEhm itemKindAddrEhm,
           com.MainEhm mainEhm,
           com.OperteLogEhm operteLogEhm,
           java.lang.String requestType,
           com.SalerInfoEhm salerInfoEhm,
           com.SpecialInfoEhm specialInfoEhm,
           java.lang.String systemCode) {
           this.applicantEhm = applicantEhm;
           this.benefitEhm = benefitEhm;
           this.flightEhm = flightEhm;
           this.insuredEhm = insuredEhm;
           this.itemKindAddrEhm = itemKindAddrEhm;
           this.mainEhm = mainEhm;
           this.operteLogEhm = operteLogEhm;
           this.requestType = requestType;
           this.salerInfoEhm = salerInfoEhm;
           this.specialInfoEhm = specialInfoEhm;
           this.systemCode = systemCode;
    }


    /**
     * Gets the applicantEhm value for this ProposalSaveRequest.
     * 
     * @return applicantEhm
     */
    public com.ApplicantEhm getApplicantEhm() {
        return applicantEhm;
    }


    /**
     * Sets the applicantEhm value for this ProposalSaveRequest.
     * 
     * @param applicantEhm
     */
    public void setApplicantEhm(com.ApplicantEhm applicantEhm) {
        this.applicantEhm = applicantEhm;
    }


    /**
     * Gets the benefitEhm value for this ProposalSaveRequest.
     * 
     * @return benefitEhm
     */
    public com.BenefitEhm[] getBenefitEhm() {
        return benefitEhm;
    }


    /**
     * Sets the benefitEhm value for this ProposalSaveRequest.
     * 
     * @param benefitEhm
     */
    public void setBenefitEhm(com.BenefitEhm[] benefitEhm) {
        this.benefitEhm = benefitEhm;
    }

    public com.BenefitEhm getBenefitEhm(int i) {
        return this.benefitEhm[i];
    }

    public void setBenefitEhm(int i, com.BenefitEhm _value) {
        this.benefitEhm[i] = _value;
    }


    /**
     * Gets the flightEhm value for this ProposalSaveRequest.
     * 
     * @return flightEhm
     */
    public com.FlightEhm getFlightEhm() {
        return flightEhm;
    }


    /**
     * Sets the flightEhm value for this ProposalSaveRequest.
     * 
     * @param flightEhm
     */
    public void setFlightEhm(com.FlightEhm flightEhm) {
        this.flightEhm = flightEhm;
    }


    /**
     * Gets the insuredEhm value for this ProposalSaveRequest.
     * 
     * @return insuredEhm
     */
    public com.InsuredEhm getInsuredEhm() {
        return insuredEhm;
    }


    /**
     * Sets the insuredEhm value for this ProposalSaveRequest.
     * 
     * @param insuredEhm
     */
    public void setInsuredEhm(com.InsuredEhm insuredEhm) {
        this.insuredEhm = insuredEhm;
    }


    /**
     * Gets the itemKindAddrEhm value for this ProposalSaveRequest.
     * 
     * @return itemKindAddrEhm
     */
    public com.ItemKindAddrEhm getItemKindAddrEhm() {
        return itemKindAddrEhm;
    }


    /**
     * Sets the itemKindAddrEhm value for this ProposalSaveRequest.
     * 
     * @param itemKindAddrEhm
     */
    public void setItemKindAddrEhm(com.ItemKindAddrEhm itemKindAddrEhm) {
        this.itemKindAddrEhm = itemKindAddrEhm;
    }


    /**
     * Gets the mainEhm value for this ProposalSaveRequest.
     * 
     * @return mainEhm
     */
    public com.MainEhm getMainEhm() {
        return mainEhm;
    }


    /**
     * Sets the mainEhm value for this ProposalSaveRequest.
     * 
     * @param mainEhm
     */
    public void setMainEhm(com.MainEhm mainEhm) {
        this.mainEhm = mainEhm;
    }


    /**
     * Gets the operteLogEhm value for this ProposalSaveRequest.
     * 
     * @return operteLogEhm
     */
    public com.OperteLogEhm getOperteLogEhm() {
        return operteLogEhm;
    }


    /**
     * Sets the operteLogEhm value for this ProposalSaveRequest.
     * 
     * @param operteLogEhm
     */
    public void setOperteLogEhm(com.OperteLogEhm operteLogEhm) {
        this.operteLogEhm = operteLogEhm;
    }


    /**
     * Gets the requestType value for this ProposalSaveRequest.
     * 
     * @return requestType
     */
    public java.lang.String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this ProposalSaveRequest.
     * 
     * @param requestType
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the salerInfoEhm value for this ProposalSaveRequest.
     * 
     * @return salerInfoEhm
     */
    public com.SalerInfoEhm getSalerInfoEhm() {
        return salerInfoEhm;
    }


    /**
     * Sets the salerInfoEhm value for this ProposalSaveRequest.
     * 
     * @param salerInfoEhm
     */
    public void setSalerInfoEhm(com.SalerInfoEhm salerInfoEhm) {
        this.salerInfoEhm = salerInfoEhm;
    }


    /**
     * Gets the specialInfoEhm value for this ProposalSaveRequest.
     * 
     * @return specialInfoEhm
     */
    public com.SpecialInfoEhm getSpecialInfoEhm() {
        return specialInfoEhm;
    }


    /**
     * Sets the specialInfoEhm value for this ProposalSaveRequest.
     * 
     * @param specialInfoEhm
     */
    public void setSpecialInfoEhm(com.SpecialInfoEhm specialInfoEhm) {
        this.specialInfoEhm = specialInfoEhm;
    }


    /**
     * Gets the systemCode value for this ProposalSaveRequest.
     * 
     * @return systemCode
     */
    public java.lang.String getSystemCode() {
        return systemCode;
    }


    /**
     * Sets the systemCode value for this ProposalSaveRequest.
     * 
     * @param systemCode
     */
    public void setSystemCode(java.lang.String systemCode) {
        this.systemCode = systemCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalSaveRequest)) return false;
        ProposalSaveRequest other = (ProposalSaveRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicantEhm==null && other.getApplicantEhm()==null) || 
             (this.applicantEhm!=null &&
              this.applicantEhm.equals(other.getApplicantEhm()))) &&
            ((this.benefitEhm==null && other.getBenefitEhm()==null) || 
             (this.benefitEhm!=null &&
              java.util.Arrays.equals(this.benefitEhm, other.getBenefitEhm()))) &&
            ((this.flightEhm==null && other.getFlightEhm()==null) || 
             (this.flightEhm!=null &&
              this.flightEhm.equals(other.getFlightEhm()))) &&
            ((this.insuredEhm==null && other.getInsuredEhm()==null) || 
             (this.insuredEhm!=null &&
              this.insuredEhm.equals(other.getInsuredEhm()))) &&
            ((this.itemKindAddrEhm==null && other.getItemKindAddrEhm()==null) || 
             (this.itemKindAddrEhm!=null &&
              this.itemKindAddrEhm.equals(other.getItemKindAddrEhm()))) &&
            ((this.mainEhm==null && other.getMainEhm()==null) || 
             (this.mainEhm!=null &&
              this.mainEhm.equals(other.getMainEhm()))) &&
            ((this.operteLogEhm==null && other.getOperteLogEhm()==null) || 
             (this.operteLogEhm!=null &&
              this.operteLogEhm.equals(other.getOperteLogEhm()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.salerInfoEhm==null && other.getSalerInfoEhm()==null) || 
             (this.salerInfoEhm!=null &&
              this.salerInfoEhm.equals(other.getSalerInfoEhm()))) &&
            ((this.specialInfoEhm==null && other.getSpecialInfoEhm()==null) || 
             (this.specialInfoEhm!=null &&
              this.specialInfoEhm.equals(other.getSpecialInfoEhm()))) &&
            ((this.systemCode==null && other.getSystemCode()==null) || 
             (this.systemCode!=null &&
              this.systemCode.equals(other.getSystemCode())));
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
        if (getApplicantEhm() != null) {
            _hashCode += getApplicantEhm().hashCode();
        }
        if (getBenefitEhm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBenefitEhm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBenefitEhm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFlightEhm() != null) {
            _hashCode += getFlightEhm().hashCode();
        }
        if (getInsuredEhm() != null) {
            _hashCode += getInsuredEhm().hashCode();
        }
        if (getItemKindAddrEhm() != null) {
            _hashCode += getItemKindAddrEhm().hashCode();
        }
        if (getMainEhm() != null) {
            _hashCode += getMainEhm().hashCode();
        }
        if (getOperteLogEhm() != null) {
            _hashCode += getOperteLogEhm().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getSalerInfoEhm() != null) {
            _hashCode += getSalerInfoEhm().hashCode();
        }
        if (getSpecialInfoEhm() != null) {
            _hashCode += getSpecialInfoEhm().hashCode();
        }
        if (getSystemCode() != null) {
            _hashCode += getSystemCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalSaveRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "ProposalSaveRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicantEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "applicantEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "ApplicantEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "benefitEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "BenefitEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "flightEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "FlightEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "insuredEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "InsuredEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemKindAddrEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "itemKindAddrEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "ItemKindAddrEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "mainEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "MainEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operteLogEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "operteLogEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "OperteLogEhm"));
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
        elemField.setFieldName("salerInfoEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "salerInfoEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "SalerInfoEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialInfoEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "specialInfoEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "SpecialInfoEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "systemCode"));
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
