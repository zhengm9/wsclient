/**
 * SmsMessages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sms;

public class SmsMessages  extends com.sms.AbstractMessage  implements java.io.Serializable {
    private java.lang.String access;

    private java.lang.String endDate;

    private java.lang.String endTime;

    private java.lang.String extension;

    private java.lang.String extensionValue;

    private java.util.HashMap hashMap;

    private java.util.HashMap hashMapExten;

    private java.lang.Object[] message;

    private com.sms.SmsMessage[] messages;

    private java.lang.String needUseTemplateFlag;

    private java.lang.String organizationId;

    private java.lang.String serviceType;

    private java.lang.String smTaskID;

    private java.lang.String startDate;

    private java.lang.String startTime;

    private java.lang.String taskId;

    private java.lang.String taskValue;

    private java.lang.String templatId;

    public SmsMessages() {
    }

    public SmsMessages(
           int packetLength,
           java.lang.String access,
           java.lang.String endDate,
           java.lang.String endTime,
           java.lang.String extension,
           java.lang.String extensionValue,
           java.util.HashMap hashMap,
           java.util.HashMap hashMapExten,
           java.lang.Object[] message,
           com.sms.SmsMessage[] messages,
           java.lang.String needUseTemplateFlag,
           java.lang.String organizationId,
           java.lang.String serviceType,
           java.lang.String smTaskID,
           java.lang.String startDate,
           java.lang.String startTime,
           java.lang.String taskId,
           java.lang.String taskValue,
           java.lang.String templatId) {
        super(
            packetLength);
        this.access = access;
        this.endDate = endDate;
        this.endTime = endTime;
        this.extension = extension;
        this.extensionValue = extensionValue;
        this.hashMap = hashMap;
        this.hashMapExten = hashMapExten;
        this.message = message;
        this.messages = messages;
        this.needUseTemplateFlag = needUseTemplateFlag;
        this.organizationId = organizationId;
        this.serviceType = serviceType;
        this.smTaskID = smTaskID;
        this.startDate = startDate;
        this.startTime = startTime;
        this.taskId = taskId;
        this.taskValue = taskValue;
        this.templatId = templatId;
    }


    /**
     * Gets the access value for this SmsMessages.
     * 
     * @return access
     */
    public java.lang.String getAccess() {
        return access;
    }


    /**
     * Sets the access value for this SmsMessages.
     * 
     * @param access
     */
    public void setAccess(java.lang.String access) {
        this.access = access;
    }


    /**
     * Gets the endDate value for this SmsMessages.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SmsMessages.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the endTime value for this SmsMessages.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this SmsMessages.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the extension value for this SmsMessages.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this SmsMessages.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the extensionValue value for this SmsMessages.
     * 
     * @return extensionValue
     */
    public java.lang.String getExtensionValue() {
        return extensionValue;
    }


    /**
     * Sets the extensionValue value for this SmsMessages.
     * 
     * @param extensionValue
     */
    public void setExtensionValue(java.lang.String extensionValue) {
        this.extensionValue = extensionValue;
    }


    /**
     * Gets the hashMap value for this SmsMessages.
     * 
     * @return hashMap
     */
    public java.util.HashMap getHashMap() {
        return hashMap;
    }


    /**
     * Sets the hashMap value for this SmsMessages.
     * 
     * @param hashMap
     */
    public void setHashMap(java.util.HashMap hashMap) {
        this.hashMap = hashMap;
    }


    /**
     * Gets the hashMapExten value for this SmsMessages.
     * 
     * @return hashMapExten
     */
    public java.util.HashMap getHashMapExten() {
        return hashMapExten;
    }


    /**
     * Sets the hashMapExten value for this SmsMessages.
     * 
     * @param hashMapExten
     */
    public void setHashMapExten(java.util.HashMap hashMapExten) {
        this.hashMapExten = hashMapExten;
    }


    /**
     * Gets the message value for this SmsMessages.
     * 
     * @return message
     */
    public java.lang.Object[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SmsMessages.
     * 
     * @param message
     */
    public void setMessage(java.lang.Object[] message) {
        this.message = message;
    }


    /**
     * Gets the messages value for this SmsMessages.
     * 
     * @return messages
     */
    public com.sms.SmsMessage[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this SmsMessages.
     * 
     * @param messages
     */
    public void setMessages(com.sms.SmsMessage[] messages) {
        this.messages = messages;
    }


    /**
     * Gets the needUseTemplateFlag value for this SmsMessages.
     * 
     * @return needUseTemplateFlag
     */
    public java.lang.String getNeedUseTemplateFlag() {
        return needUseTemplateFlag;
    }


    /**
     * Sets the needUseTemplateFlag value for this SmsMessages.
     * 
     * @param needUseTemplateFlag
     */
    public void setNeedUseTemplateFlag(java.lang.String needUseTemplateFlag) {
        this.needUseTemplateFlag = needUseTemplateFlag;
    }


    /**
     * Gets the organizationId value for this SmsMessages.
     * 
     * @return organizationId
     */
    public java.lang.String getOrganizationId() {
        return organizationId;
    }


    /**
     * Sets the organizationId value for this SmsMessages.
     * 
     * @param organizationId
     */
    public void setOrganizationId(java.lang.String organizationId) {
        this.organizationId = organizationId;
    }


    /**
     * Gets the serviceType value for this SmsMessages.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this SmsMessages.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the smTaskID value for this SmsMessages.
     * 
     * @return smTaskID
     */
    public java.lang.String getSmTaskID() {
        return smTaskID;
    }


    /**
     * Sets the smTaskID value for this SmsMessages.
     * 
     * @param smTaskID
     */
    public void setSmTaskID(java.lang.String smTaskID) {
        this.smTaskID = smTaskID;
    }


    /**
     * Gets the startDate value for this SmsMessages.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SmsMessages.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startTime value for this SmsMessages.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this SmsMessages.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the taskId value for this SmsMessages.
     * 
     * @return taskId
     */
    public java.lang.String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this SmsMessages.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.String taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the taskValue value for this SmsMessages.
     * 
     * @return taskValue
     */
    public java.lang.String getTaskValue() {
        return taskValue;
    }


    /**
     * Sets the taskValue value for this SmsMessages.
     * 
     * @param taskValue
     */
    public void setTaskValue(java.lang.String taskValue) {
        this.taskValue = taskValue;
    }


    /**
     * Gets the templatId value for this SmsMessages.
     * 
     * @return templatId
     */
    public java.lang.String getTemplatId() {
        return templatId;
    }


    /**
     * Sets the templatId value for this SmsMessages.
     * 
     * @param templatId
     */
    public void setTemplatId(java.lang.String templatId) {
        this.templatId = templatId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmsMessages)) return false;
        SmsMessages other = (SmsMessages) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.access==null && other.getAccess()==null) || 
             (this.access!=null &&
              this.access.equals(other.getAccess()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.extensionValue==null && other.getExtensionValue()==null) || 
             (this.extensionValue!=null &&
              this.extensionValue.equals(other.getExtensionValue()))) &&
            ((this.hashMap==null && other.getHashMap()==null) || 
             (this.hashMap!=null &&
              this.hashMap.equals(other.getHashMap()))) &&
            ((this.hashMapExten==null && other.getHashMapExten()==null) || 
             (this.hashMapExten!=null &&
              this.hashMapExten.equals(other.getHashMapExten()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages()))) &&
            ((this.needUseTemplateFlag==null && other.getNeedUseTemplateFlag()==null) || 
             (this.needUseTemplateFlag!=null &&
              this.needUseTemplateFlag.equals(other.getNeedUseTemplateFlag()))) &&
            ((this.organizationId==null && other.getOrganizationId()==null) || 
             (this.organizationId!=null &&
              this.organizationId.equals(other.getOrganizationId()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.smTaskID==null && other.getSmTaskID()==null) || 
             (this.smTaskID!=null &&
              this.smTaskID.equals(other.getSmTaskID()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.taskValue==null && other.getTaskValue()==null) || 
             (this.taskValue!=null &&
              this.taskValue.equals(other.getTaskValue()))) &&
            ((this.templatId==null && other.getTemplatId()==null) || 
             (this.templatId!=null &&
              this.templatId.equals(other.getTemplatId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccess() != null) {
            _hashCode += getAccess().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getExtensionValue() != null) {
            _hashCode += getExtensionValue().hashCode();
        }
        if (getHashMap() != null) {
            _hashCode += getHashMap().hashCode();
        }
        if (getHashMapExten() != null) {
            _hashCode += getHashMapExten().hashCode();
        }
        if (getMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNeedUseTemplateFlag() != null) {
            _hashCode += getNeedUseTemplateFlag().hashCode();
        }
        if (getOrganizationId() != null) {
            _hashCode += getOrganizationId().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getSmTaskID() != null) {
            _hashCode += getSmTaskID().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getTaskValue() != null) {
            _hashCode += getTaskValue().hashCode();
        }
        if (getTemplatId() != null) {
            _hashCode += getTemplatId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmsMessages.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.net.sms.wisdom.com", "SmsMessages"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access");
        elemField.setXmlName(new javax.xml.namespace.QName("", "access"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extensionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashMap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashMapExten");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashMapExten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.net.sms.wisdom.com", "SmsMessage"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needUseTemplateFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needUseTemplateFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smTaskID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smTaskID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
