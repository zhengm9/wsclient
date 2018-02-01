/**
 * FlightEhm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package spproposal;

public class FlightEhm  implements java.io.Serializable {
    private java.lang.String flightDate;

    private java.lang.String flightNo;

    private java.lang.String flightTer;

    private java.lang.String rFlightDate;

    private java.lang.String rFlightNo;

    private java.lang.String rFlightTer;

    public FlightEhm() {
    }

    public FlightEhm(
           java.lang.String flightDate,
           java.lang.String flightNo,
           java.lang.String flightTer,
           java.lang.String rFlightDate,
           java.lang.String rFlightNo,
           java.lang.String rFlightTer) {
           this.flightDate = flightDate;
           this.flightNo = flightNo;
           this.flightTer = flightTer;
           this.rFlightDate = rFlightDate;
           this.rFlightNo = rFlightNo;
           this.rFlightTer = rFlightTer;
    }


    /**
     * Gets the flightDate value for this FlightEhm.
     * 
     * @return flightDate
     */
    public java.lang.String getFlightDate() {
        return flightDate;
    }


    /**
     * Sets the flightDate value for this FlightEhm.
     * 
     * @param flightDate
     */
    public void setFlightDate(java.lang.String flightDate) {
        this.flightDate = flightDate;
    }


    /**
     * Gets the flightNo value for this FlightEhm.
     * 
     * @return flightNo
     */
    public java.lang.String getFlightNo() {
        return flightNo;
    }


    /**
     * Sets the flightNo value for this FlightEhm.
     * 
     * @param flightNo
     */
    public void setFlightNo(java.lang.String flightNo) {
        this.flightNo = flightNo;
    }


    /**
     * Gets the flightTer value for this FlightEhm.
     * 
     * @return flightTer
     */
    public java.lang.String getFlightTer() {
        return flightTer;
    }


    /**
     * Sets the flightTer value for this FlightEhm.
     * 
     * @param flightTer
     */
    public void setFlightTer(java.lang.String flightTer) {
        this.flightTer = flightTer;
    }


    /**
     * Gets the rFlightDate value for this FlightEhm.
     * 
     * @return rFlightDate
     */
    public java.lang.String getRFlightDate() {
        return rFlightDate;
    }


    /**
     * Sets the rFlightDate value for this FlightEhm.
     * 
     * @param rFlightDate
     */
    public void setRFlightDate(java.lang.String rFlightDate) {
        this.rFlightDate = rFlightDate;
    }


    /**
     * Gets the rFlightNo value for this FlightEhm.
     * 
     * @return rFlightNo
     */
    public java.lang.String getRFlightNo() {
        return rFlightNo;
    }


    /**
     * Sets the rFlightNo value for this FlightEhm.
     * 
     * @param rFlightNo
     */
    public void setRFlightNo(java.lang.String rFlightNo) {
        this.rFlightNo = rFlightNo;
    }


    /**
     * Gets the rFlightTer value for this FlightEhm.
     * 
     * @return rFlightTer
     */
    public java.lang.String getRFlightTer() {
        return rFlightTer;
    }


    /**
     * Sets the rFlightTer value for this FlightEhm.
     * 
     * @param rFlightTer
     */
    public void setRFlightTer(java.lang.String rFlightTer) {
        this.rFlightTer = rFlightTer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightEhm)) return false;
        FlightEhm other = (FlightEhm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flightDate==null && other.getFlightDate()==null) || 
             (this.flightDate!=null &&
              this.flightDate.equals(other.getFlightDate()))) &&
            ((this.flightNo==null && other.getFlightNo()==null) || 
             (this.flightNo!=null &&
              this.flightNo.equals(other.getFlightNo()))) &&
            ((this.flightTer==null && other.getFlightTer()==null) || 
             (this.flightTer!=null &&
              this.flightTer.equals(other.getFlightTer()))) &&
            ((this.rFlightDate==null && other.getRFlightDate()==null) || 
             (this.rFlightDate!=null &&
              this.rFlightDate.equals(other.getRFlightDate()))) &&
            ((this.rFlightNo==null && other.getRFlightNo()==null) || 
             (this.rFlightNo!=null &&
              this.rFlightNo.equals(other.getRFlightNo()))) &&
            ((this.rFlightTer==null && other.getRFlightTer()==null) || 
             (this.rFlightTer!=null &&
              this.rFlightTer.equals(other.getRFlightTer())));
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
        if (getFlightDate() != null) {
            _hashCode += getFlightDate().hashCode();
        }
        if (getFlightNo() != null) {
            _hashCode += getFlightNo().hashCode();
        }
        if (getFlightTer() != null) {
            _hashCode += getFlightTer().hashCode();
        }
        if (getRFlightDate() != null) {
            _hashCode += getRFlightDate().hashCode();
        }
        if (getRFlightNo() != null) {
            _hashCode += getRFlightNo().hashCode();
        }
        if (getRFlightTer() != null) {
            _hashCode += getRFlightTer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightEhm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "FlightEhm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "flightDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "flightNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightTer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "flightTer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFlightDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "rFlightDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFlightNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "rFlightNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFlightTer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "rFlightTer"));
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
