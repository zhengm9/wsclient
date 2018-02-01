/**
 * SpecialInfoEhm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package spproposal;

public class SpecialInfoEhm  implements java.io.Serializable {
    private java.lang.String businessType;

    private java.lang.String companyType;

    private java.lang.String dogImmuneNo;

    private java.lang.String dogLicenseNo;

    private java.lang.String dogStyle;

    private java.lang.String insuredArea;

    private java.lang.String specialInfoNo;

    public SpecialInfoEhm() {
    }

    public SpecialInfoEhm(
           java.lang.String businessType,
           java.lang.String companyType,
           java.lang.String dogImmuneNo,
           java.lang.String dogLicenseNo,
           java.lang.String dogStyle,
           java.lang.String insuredArea,
           java.lang.String specialInfoNo) {
           this.businessType = businessType;
           this.companyType = companyType;
           this.dogImmuneNo = dogImmuneNo;
           this.dogLicenseNo = dogLicenseNo;
           this.dogStyle = dogStyle;
           this.insuredArea = insuredArea;
           this.specialInfoNo = specialInfoNo;
    }


    /**
     * Gets the businessType value for this SpecialInfoEhm.
     * 
     * @return businessType
     */
    public java.lang.String getBusinessType() {
        return businessType;
    }


    /**
     * Sets the businessType value for this SpecialInfoEhm.
     * 
     * @param businessType
     */
    public void setBusinessType(java.lang.String businessType) {
        this.businessType = businessType;
    }


    /**
     * Gets the companyType value for this SpecialInfoEhm.
     * 
     * @return companyType
     */
    public java.lang.String getCompanyType() {
        return companyType;
    }


    /**
     * Sets the companyType value for this SpecialInfoEhm.
     * 
     * @param companyType
     */
    public void setCompanyType(java.lang.String companyType) {
        this.companyType = companyType;
    }


    /**
     * Gets the dogImmuneNo value for this SpecialInfoEhm.
     * 
     * @return dogImmuneNo
     */
    public java.lang.String getDogImmuneNo() {
        return dogImmuneNo;
    }


    /**
     * Sets the dogImmuneNo value for this SpecialInfoEhm.
     * 
     * @param dogImmuneNo
     */
    public void setDogImmuneNo(java.lang.String dogImmuneNo) {
        this.dogImmuneNo = dogImmuneNo;
    }


    /**
     * Gets the dogLicenseNo value for this SpecialInfoEhm.
     * 
     * @return dogLicenseNo
     */
    public java.lang.String getDogLicenseNo() {
        return dogLicenseNo;
    }


    /**
     * Sets the dogLicenseNo value for this SpecialInfoEhm.
     * 
     * @param dogLicenseNo
     */
    public void setDogLicenseNo(java.lang.String dogLicenseNo) {
        this.dogLicenseNo = dogLicenseNo;
    }


    /**
     * Gets the dogStyle value for this SpecialInfoEhm.
     * 
     * @return dogStyle
     */
    public java.lang.String getDogStyle() {
        return dogStyle;
    }


    /**
     * Sets the dogStyle value for this SpecialInfoEhm.
     * 
     * @param dogStyle
     */
    public void setDogStyle(java.lang.String dogStyle) {
        this.dogStyle = dogStyle;
    }


    /**
     * Gets the insuredArea value for this SpecialInfoEhm.
     * 
     * @return insuredArea
     */
    public java.lang.String getInsuredArea() {
        return insuredArea;
    }


    /**
     * Sets the insuredArea value for this SpecialInfoEhm.
     * 
     * @param insuredArea
     */
    public void setInsuredArea(java.lang.String insuredArea) {
        this.insuredArea = insuredArea;
    }


    /**
     * Gets the specialInfoNo value for this SpecialInfoEhm.
     * 
     * @return specialInfoNo
     */
    public java.lang.String getSpecialInfoNo() {
        return specialInfoNo;
    }


    /**
     * Sets the specialInfoNo value for this SpecialInfoEhm.
     * 
     * @param specialInfoNo
     */
    public void setSpecialInfoNo(java.lang.String specialInfoNo) {
        this.specialInfoNo = specialInfoNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpecialInfoEhm)) return false;
        SpecialInfoEhm other = (SpecialInfoEhm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessType==null && other.getBusinessType()==null) || 
             (this.businessType!=null &&
              this.businessType.equals(other.getBusinessType()))) &&
            ((this.companyType==null && other.getCompanyType()==null) || 
             (this.companyType!=null &&
              this.companyType.equals(other.getCompanyType()))) &&
            ((this.dogImmuneNo==null && other.getDogImmuneNo()==null) || 
             (this.dogImmuneNo!=null &&
              this.dogImmuneNo.equals(other.getDogImmuneNo()))) &&
            ((this.dogLicenseNo==null && other.getDogLicenseNo()==null) || 
             (this.dogLicenseNo!=null &&
              this.dogLicenseNo.equals(other.getDogLicenseNo()))) &&
            ((this.dogStyle==null && other.getDogStyle()==null) || 
             (this.dogStyle!=null &&
              this.dogStyle.equals(other.getDogStyle()))) &&
            ((this.insuredArea==null && other.getInsuredArea()==null) || 
             (this.insuredArea!=null &&
              this.insuredArea.equals(other.getInsuredArea()))) &&
            ((this.specialInfoNo==null && other.getSpecialInfoNo()==null) || 
             (this.specialInfoNo!=null &&
              this.specialInfoNo.equals(other.getSpecialInfoNo())));
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
        if (getBusinessType() != null) {
            _hashCode += getBusinessType().hashCode();
        }
        if (getCompanyType() != null) {
            _hashCode += getCompanyType().hashCode();
        }
        if (getDogImmuneNo() != null) {
            _hashCode += getDogImmuneNo().hashCode();
        }
        if (getDogLicenseNo() != null) {
            _hashCode += getDogLicenseNo().hashCode();
        }
        if (getDogStyle() != null) {
            _hashCode += getDogStyle().hashCode();
        }
        if (getInsuredArea() != null) {
            _hashCode += getInsuredArea().hashCode();
        }
        if (getSpecialInfoNo() != null) {
            _hashCode += getSpecialInfoNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecialInfoEhm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "SpecialInfoEhm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "businessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "companyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dogImmuneNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "dogImmuneNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dogLicenseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "dogLicenseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dogStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "dogStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "insuredArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialInfoNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "specialInfoNo"));
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
