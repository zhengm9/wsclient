/**
 * ItemKindAddrEhm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package spproposal;

public class ItemKindAddrEhm  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String addressNo;

    private java.lang.String appNum;

    private java.lang.String city;

    private java.lang.String district;

    private java.lang.String postCode;

    private java.lang.String province;

    public ItemKindAddrEhm() {
    }

    public ItemKindAddrEhm(
           java.lang.String address,
           java.lang.String addressNo,
           java.lang.String appNum,
           java.lang.String city,
           java.lang.String district,
           java.lang.String postCode,
           java.lang.String province) {
           this.address = address;
           this.addressNo = addressNo;
           this.appNum = appNum;
           this.city = city;
           this.district = district;
           this.postCode = postCode;
           this.province = province;
    }


    /**
     * Gets the address value for this ItemKindAddrEhm.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ItemKindAddrEhm.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the addressNo value for this ItemKindAddrEhm.
     * 
     * @return addressNo
     */
    public java.lang.String getAddressNo() {
        return addressNo;
    }


    /**
     * Sets the addressNo value for this ItemKindAddrEhm.
     * 
     * @param addressNo
     */
    public void setAddressNo(java.lang.String addressNo) {
        this.addressNo = addressNo;
    }


    /**
     * Gets the appNum value for this ItemKindAddrEhm.
     * 
     * @return appNum
     */
    public java.lang.String getAppNum() {
        return appNum;
    }


    /**
     * Sets the appNum value for this ItemKindAddrEhm.
     * 
     * @param appNum
     */
    public void setAppNum(java.lang.String appNum) {
        this.appNum = appNum;
    }


    /**
     * Gets the city value for this ItemKindAddrEhm.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ItemKindAddrEhm.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the district value for this ItemKindAddrEhm.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this ItemKindAddrEhm.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the postCode value for this ItemKindAddrEhm.
     * 
     * @return postCode
     */
    public java.lang.String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this ItemKindAddrEhm.
     * 
     * @param postCode
     */
    public void setPostCode(java.lang.String postCode) {
        this.postCode = postCode;
    }


    /**
     * Gets the province value for this ItemKindAddrEhm.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this ItemKindAddrEhm.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemKindAddrEhm)) return false;
        ItemKindAddrEhm other = (ItemKindAddrEhm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.addressNo==null && other.getAddressNo()==null) || 
             (this.addressNo!=null &&
              this.addressNo.equals(other.getAddressNo()))) &&
            ((this.appNum==null && other.getAppNum()==null) || 
             (this.appNum!=null &&
              this.appNum.equals(other.getAppNum()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.postCode==null && other.getPostCode()==null) || 
             (this.postCode!=null &&
              this.postCode.equals(other.getPostCode()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAddressNo() != null) {
            _hashCode += getAddressNo().hashCode();
        }
        if (getAppNum() != null) {
            _hashCode += getAppNum().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getPostCode() != null) {
            _hashCode += getPostCode().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemKindAddrEhm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "ItemKindAddrEhm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "addressNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "appNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "postCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "province"));
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
