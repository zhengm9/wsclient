/**
 * ProposalSaveRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package spproposal;

public class ProposalSaveRequest  implements java.io.Serializable {
    private spproposal.ApplicantEhm applicantEhm;

    private spproposal.CarEhm carEhm;

    private spproposal.FlightEhm flightEhm;

    private spproposal.InsuredEhm[] insuredEhmArray;

    private spproposal.MainEhm mainEhm;

    private spproposal.NameEhm[] nameEhmArray;

    private spproposal.OperteLogEhm operteLogEhm;

    private java.lang.String requestType;

    private spproposal.SalerInfoEhm salerInfoEhm;

    private spproposal.SpecialInfoEhm specialInfoEhm;

    private java.lang.String systemCode;

    public ProposalSaveRequest() {
    }

    public ProposalSaveRequest(
           spproposal.ApplicantEhm applicantEhm,
           spproposal.CarEhm carEhm,
           spproposal.FlightEhm flightEhm,
           spproposal.InsuredEhm[] insuredEhmArray,
           spproposal.MainEhm mainEhm,
           spproposal.NameEhm[] nameEhmArray,
           spproposal.OperteLogEhm operteLogEhm,
           java.lang.String requestType,
           spproposal.SalerInfoEhm salerInfoEhm,
           spproposal.SpecialInfoEhm specialInfoEhm,
           java.lang.String systemCode) {
           this.applicantEhm = applicantEhm;
           this.carEhm = carEhm;
           this.flightEhm = flightEhm;
           this.insuredEhmArray = insuredEhmArray;
           this.mainEhm = mainEhm;
           this.nameEhmArray = nameEhmArray;
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
    public spproposal.ApplicantEhm getApplicantEhm() {
        return applicantEhm;
    }


    /**
     * Sets the applicantEhm value for this ProposalSaveRequest.
     * 
     * @param applicantEhm
     */
    public void setApplicantEhm(spproposal.ApplicantEhm applicantEhm) {
        this.applicantEhm = applicantEhm;
    }


    /**
     * Gets the carEhm value for this ProposalSaveRequest.
     * 
     * @return carEhm
     */
    public spproposal.CarEhm getCarEhm() {
        return carEhm;
    }


    /**
     * Sets the carEhm value for this ProposalSaveRequest.
     * 
     * @param carEhm
     */
    public void setCarEhm(spproposal.CarEhm carEhm) {
        this.carEhm = carEhm;
    }


    /**
     * Gets the flightEhm value for this ProposalSaveRequest.
     * 
     * @return flightEhm
     */
    public spproposal.FlightEhm getFlightEhm() {
        return flightEhm;
    }


    /**
     * Sets the flightEhm value for this ProposalSaveRequest.
     * 
     * @param flightEhm
     */
    public void setFlightEhm(spproposal.FlightEhm flightEhm) {
        this.flightEhm = flightEhm;
    }


    /**
     * Gets the insuredEhmArray value for this ProposalSaveRequest.
     * 
     * @return insuredEhmArray
     */
    public spproposal.InsuredEhm[] getInsuredEhmArray() {
        return insuredEhmArray;
    }


    /**
     * Sets the insuredEhmArray value for this ProposalSaveRequest.
     * 
     * @param insuredEhmArray
     */
    public void setInsuredEhmArray(spproposal.InsuredEhm[] insuredEhmArray) {
        this.insuredEhmArray = insuredEhmArray;
    }

    public spproposal.InsuredEhm getInsuredEhmArray(int i) {
        return this.insuredEhmArray[i];
    }

    public void setInsuredEhmArray(int i, spproposal.InsuredEhm _value) {
        this.insuredEhmArray[i] = _value;
    }


    /**
     * Gets the mainEhm value for this ProposalSaveRequest.
     * 
     * @return mainEhm
     */
    public spproposal.MainEhm getMainEhm() {
        return mainEhm;
    }


    /**
     * Sets the mainEhm value for this ProposalSaveRequest.
     * 
     * @param mainEhm
     */
    public void setMainEhm(spproposal.MainEhm mainEhm) {
        this.mainEhm = mainEhm;
    }


    /**
     * Gets the nameEhmArray value for this ProposalSaveRequest.
     * 
     * @return nameEhmArray
     */
    public spproposal.NameEhm[] getNameEhmArray() {
        return nameEhmArray;
    }


    /**
     * Sets the nameEhmArray value for this ProposalSaveRequest.
     * 
     * @param nameEhmArray
     */
    public void setNameEhmArray(spproposal.NameEhm[] nameEhmArray) {
        this.nameEhmArray = nameEhmArray;
    }

    public spproposal.NameEhm getNameEhmArray(int i) {
        return this.nameEhmArray[i];
    }

    public void setNameEhmArray(int i, spproposal.NameEhm _value) {
        this.nameEhmArray[i] = _value;
    }


    /**
     * Gets the operteLogEhm value for this ProposalSaveRequest.
     * 
     * @return operteLogEhm
     */
    public spproposal.OperteLogEhm getOperteLogEhm() {
        return operteLogEhm;
    }


    /**
     * Sets the operteLogEhm value for this ProposalSaveRequest.
     * 
     * @param operteLogEhm
     */
    public void setOperteLogEhm(spproposal.OperteLogEhm operteLogEhm) {
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
    public spproposal.SalerInfoEhm getSalerInfoEhm() {
        return salerInfoEhm;
    }


    /**
     * Sets the salerInfoEhm value for this ProposalSaveRequest.
     * 
     * @param salerInfoEhm
     */
    public void setSalerInfoEhm(spproposal.SalerInfoEhm salerInfoEhm) {
        this.salerInfoEhm = salerInfoEhm;
    }


    /**
     * Gets the specialInfoEhm value for this ProposalSaveRequest.
     * 
     * @return specialInfoEhm
     */
    public spproposal.SpecialInfoEhm getSpecialInfoEhm() {
        return specialInfoEhm;
    }


    /**
     * Sets the specialInfoEhm value for this ProposalSaveRequest.
     * 
     * @param specialInfoEhm
     */
    public void setSpecialInfoEhm(spproposal.SpecialInfoEhm specialInfoEhm) {
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
            ((this.carEhm==null && other.getCarEhm()==null) || 
             (this.carEhm!=null &&
              this.carEhm.equals(other.getCarEhm()))) &&
            ((this.flightEhm==null && other.getFlightEhm()==null) || 
             (this.flightEhm!=null &&
              this.flightEhm.equals(other.getFlightEhm()))) &&
            ((this.insuredEhmArray==null && other.getInsuredEhmArray()==null) || 
             (this.insuredEhmArray!=null &&
              java.util.Arrays.equals(this.insuredEhmArray, other.getInsuredEhmArray()))) &&
            ((this.mainEhm==null && other.getMainEhm()==null) || 
             (this.mainEhm!=null &&
              this.mainEhm.equals(other.getMainEhm()))) &&
            ((this.nameEhmArray==null && other.getNameEhmArray()==null) || 
             (this.nameEhmArray!=null &&
              java.util.Arrays.equals(this.nameEhmArray, other.getNameEhmArray()))) &&
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
        if (getCarEhm() != null) {
            _hashCode += getCarEhm().hashCode();
        }
        if (getFlightEhm() != null) {
            _hashCode += getFlightEhm().hashCode();
        }
        if (getInsuredEhmArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsuredEhmArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsuredEhmArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMainEhm() != null) {
            _hashCode += getMainEhm().hashCode();
        }
        if (getNameEhmArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameEhmArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameEhmArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "ProposalSaveRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicantEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "applicantEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "ApplicantEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "carEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "CarEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "flightEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "FlightEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredEhmArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "insuredEhmArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "InsuredEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "mainEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "MainEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameEhmArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "nameEhmArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "NameEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operteLogEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "operteLogEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "OperteLogEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "requestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salerInfoEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "salerInfoEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "SalerInfoEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialInfoEhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "specialInfoEhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "SpecialInfoEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "systemCode"));
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
