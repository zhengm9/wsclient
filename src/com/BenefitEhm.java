/**
 * BenefitEhm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class BenefitEhm  implements java.io.Serializable {
    private java.lang.String benefitAmount;

    private java.lang.String benefitFlag;

    private java.lang.String benefitName;

    private java.lang.String benefitRate;

    private java.lang.String identifyNumber;

    private java.lang.String identifyType;

    private java.lang.String insuredNature;

    private java.lang.String relation;

    public BenefitEhm() {
    }

    public BenefitEhm(
           java.lang.String benefitAmount,
           java.lang.String benefitFlag,
           java.lang.String benefitName,
           java.lang.String benefitRate,
           java.lang.String identifyNumber,
           java.lang.String identifyType,
           java.lang.String insuredNature,
           java.lang.String relation) {
           this.benefitAmount = benefitAmount;
           this.benefitFlag = benefitFlag;
           this.benefitName = benefitName;
           this.benefitRate = benefitRate;
           this.identifyNumber = identifyNumber;
           this.identifyType = identifyType;
           this.insuredNature = insuredNature;
           this.relation = relation;
    }


    /**
     * Gets the benefitAmount value for this BenefitEhm.
     * 
     * @return benefitAmount
     */
    public java.lang.String getBenefitAmount() {
        return benefitAmount;
    }


    /**
     * Sets the benefitAmount value for this BenefitEhm.
     * 
     * @param benefitAmount
     */
    public void setBenefitAmount(java.lang.String benefitAmount) {
        this.benefitAmount = benefitAmount;
    }


    /**
     * Gets the benefitFlag value for this BenefitEhm.
     * 
     * @return benefitFlag
     */
    public java.lang.String getBenefitFlag() {
        return benefitFlag;
    }


    /**
     * Sets the benefitFlag value for this BenefitEhm.
     * 
     * @param benefitFlag
     */
    public void setBenefitFlag(java.lang.String benefitFlag) {
        this.benefitFlag = benefitFlag;
    }


    /**
     * Gets the benefitName value for this BenefitEhm.
     * 
     * @return benefitName
     */
    public java.lang.String getBenefitName() {
        return benefitName;
    }


    /**
     * Sets the benefitName value for this BenefitEhm.
     * 
     * @param benefitName
     */
    public void setBenefitName(java.lang.String benefitName) {
        this.benefitName = benefitName;
    }


    /**
     * Gets the benefitRate value for this BenefitEhm.
     * 
     * @return benefitRate
     */
    public java.lang.String getBenefitRate() {
        return benefitRate;
    }


    /**
     * Sets the benefitRate value for this BenefitEhm.
     * 
     * @param benefitRate
     */
    public void setBenefitRate(java.lang.String benefitRate) {
        this.benefitRate = benefitRate;
    }


    /**
     * Gets the identifyNumber value for this BenefitEhm.
     * 
     * @return identifyNumber
     */
    public java.lang.String getIdentifyNumber() {
        return identifyNumber;
    }


    /**
     * Sets the identifyNumber value for this BenefitEhm.
     * 
     * @param identifyNumber
     */
    public void setIdentifyNumber(java.lang.String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }


    /**
     * Gets the identifyType value for this BenefitEhm.
     * 
     * @return identifyType
     */
    public java.lang.String getIdentifyType() {
        return identifyType;
    }


    /**
     * Sets the identifyType value for this BenefitEhm.
     * 
     * @param identifyType
     */
    public void setIdentifyType(java.lang.String identifyType) {
        this.identifyType = identifyType;
    }


    /**
     * Gets the insuredNature value for this BenefitEhm.
     * 
     * @return insuredNature
     */
    public java.lang.String getInsuredNature() {
        return insuredNature;
    }


    /**
     * Sets the insuredNature value for this BenefitEhm.
     * 
     * @param insuredNature
     */
    public void setInsuredNature(java.lang.String insuredNature) {
        this.insuredNature = insuredNature;
    }


    /**
     * Gets the relation value for this BenefitEhm.
     * 
     * @return relation
     */
    public java.lang.String getRelation() {
        return relation;
    }


    /**
     * Sets the relation value for this BenefitEhm.
     * 
     * @param relation
     */
    public void setRelation(java.lang.String relation) {
        this.relation = relation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BenefitEhm)) return false;
        BenefitEhm other = (BenefitEhm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.benefitAmount==null && other.getBenefitAmount()==null) || 
             (this.benefitAmount!=null &&
              this.benefitAmount.equals(other.getBenefitAmount()))) &&
            ((this.benefitFlag==null && other.getBenefitFlag()==null) || 
             (this.benefitFlag!=null &&
              this.benefitFlag.equals(other.getBenefitFlag()))) &&
            ((this.benefitName==null && other.getBenefitName()==null) || 
             (this.benefitName!=null &&
              this.benefitName.equals(other.getBenefitName()))) &&
            ((this.benefitRate==null && other.getBenefitRate()==null) || 
             (this.benefitRate!=null &&
              this.benefitRate.equals(other.getBenefitRate()))) &&
            ((this.identifyNumber==null && other.getIdentifyNumber()==null) || 
             (this.identifyNumber!=null &&
              this.identifyNumber.equals(other.getIdentifyNumber()))) &&
            ((this.identifyType==null && other.getIdentifyType()==null) || 
             (this.identifyType!=null &&
              this.identifyType.equals(other.getIdentifyType()))) &&
            ((this.insuredNature==null && other.getInsuredNature()==null) || 
             (this.insuredNature!=null &&
              this.insuredNature.equals(other.getInsuredNature()))) &&
            ((this.relation==null && other.getRelation()==null) || 
             (this.relation!=null &&
              this.relation.equals(other.getRelation())));
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
        if (getBenefitAmount() != null) {
            _hashCode += getBenefitAmount().hashCode();
        }
        if (getBenefitFlag() != null) {
            _hashCode += getBenefitFlag().hashCode();
        }
        if (getBenefitName() != null) {
            _hashCode += getBenefitName().hashCode();
        }
        if (getBenefitRate() != null) {
            _hashCode += getBenefitRate().hashCode();
        }
        if (getIdentifyNumber() != null) {
            _hashCode += getIdentifyNumber().hashCode();
        }
        if (getIdentifyType() != null) {
            _hashCode += getIdentifyType().hashCode();
        }
        if (getInsuredNature() != null) {
            _hashCode += getInsuredNature().hashCode();
        }
        if (getRelation() != null) {
            _hashCode += getRelation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BenefitEhm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "BenefitEhm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "benefitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "benefitFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "benefitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "benefitRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "identifyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "identifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredNature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "insuredNature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.SpringFestivalPolicySave.antFinancial.webServiceCenter.sinosoft.com/xsd", "relation"));
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
