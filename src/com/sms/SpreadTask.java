/**
 * SpreadTask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sms;

public class SpreadTask  extends com.sms.AbstractTask  implements java.io.Serializable {
    private java.lang.String activityId;

    private java.lang.String endDate;

    private java.lang.String endTime;

    private java.lang.String organizationId;

    private java.lang.String relateBusinessInfo;

    private java.lang.String startDate;

    private java.lang.String startTime;

    private java.lang.String taskId;

    private com.sms.TaskTarget[] taskTargets;

    private java.lang.String taskValue;

    public SpreadTask() {
    }

    public SpreadTask(
           int packetLength,
           java.lang.String activityId,
           java.lang.String endDate,
           java.lang.String endTime,
           java.lang.String organizationId,
           java.lang.String relateBusinessInfo,
           java.lang.String startDate,
           java.lang.String startTime,
           java.lang.String taskId,
           com.sms.TaskTarget[] taskTargets,
           java.lang.String taskValue) {
        super(
            packetLength);
        this.activityId = activityId;
        this.endDate = endDate;
        this.endTime = endTime;
        this.organizationId = organizationId;
        this.relateBusinessInfo = relateBusinessInfo;
        this.startDate = startDate;
        this.startTime = startTime;
        this.taskId = taskId;
        this.taskTargets = taskTargets;
        this.taskValue = taskValue;
    }


    /**
     * Gets the activityId value for this SpreadTask.
     * 
     * @return activityId
     */
    public java.lang.String getActivityId() {
        return activityId;
    }


    /**
     * Sets the activityId value for this SpreadTask.
     * 
     * @param activityId
     */
    public void setActivityId(java.lang.String activityId) {
        this.activityId = activityId;
    }


    /**
     * Gets the endDate value for this SpreadTask.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SpreadTask.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the endTime value for this SpreadTask.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this SpreadTask.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the organizationId value for this SpreadTask.
     * 
     * @return organizationId
     */
    public java.lang.String getOrganizationId() {
        return organizationId;
    }


    /**
     * Sets the organizationId value for this SpreadTask.
     * 
     * @param organizationId
     */
    public void setOrganizationId(java.lang.String organizationId) {
        this.organizationId = organizationId;
    }


    /**
     * Gets the relateBusinessInfo value for this SpreadTask.
     * 
     * @return relateBusinessInfo
     */
    public java.lang.String getRelateBusinessInfo() {
        return relateBusinessInfo;
    }


    /**
     * Sets the relateBusinessInfo value for this SpreadTask.
     * 
     * @param relateBusinessInfo
     */
    public void setRelateBusinessInfo(java.lang.String relateBusinessInfo) {
        this.relateBusinessInfo = relateBusinessInfo;
    }


    /**
     * Gets the startDate value for this SpreadTask.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SpreadTask.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startTime value for this SpreadTask.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this SpreadTask.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the taskId value for this SpreadTask.
     * 
     * @return taskId
     */
    public java.lang.String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this SpreadTask.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.String taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the taskTargets value for this SpreadTask.
     * 
     * @return taskTargets
     */
    public com.sms.TaskTarget[] getTaskTargets() {
        return taskTargets;
    }


    /**
     * Sets the taskTargets value for this SpreadTask.
     * 
     * @param taskTargets
     */
    public void setTaskTargets(com.sms.TaskTarget[] taskTargets) {
        this.taskTargets = taskTargets;
    }


    /**
     * Gets the taskValue value for this SpreadTask.
     * 
     * @return taskValue
     */
    public java.lang.String getTaskValue() {
        return taskValue;
    }


    /**
     * Sets the taskValue value for this SpreadTask.
     * 
     * @param taskValue
     */
    public void setTaskValue(java.lang.String taskValue) {
        this.taskValue = taskValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpreadTask)) return false;
        SpreadTask other = (SpreadTask) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activityId==null && other.getActivityId()==null) || 
             (this.activityId!=null &&
              this.activityId.equals(other.getActivityId()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.organizationId==null && other.getOrganizationId()==null) || 
             (this.organizationId!=null &&
              this.organizationId.equals(other.getOrganizationId()))) &&
            ((this.relateBusinessInfo==null && other.getRelateBusinessInfo()==null) || 
             (this.relateBusinessInfo!=null &&
              this.relateBusinessInfo.equals(other.getRelateBusinessInfo()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.taskTargets==null && other.getTaskTargets()==null) || 
             (this.taskTargets!=null &&
              java.util.Arrays.equals(this.taskTargets, other.getTaskTargets()))) &&
            ((this.taskValue==null && other.getTaskValue()==null) || 
             (this.taskValue!=null &&
              this.taskValue.equals(other.getTaskValue())));
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
        if (getActivityId() != null) {
            _hashCode += getActivityId().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getOrganizationId() != null) {
            _hashCode += getOrganizationId().hashCode();
        }
        if (getRelateBusinessInfo() != null) {
            _hashCode += getRelateBusinessInfo().hashCode();
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
        if (getTaskTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaskTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaskTargets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaskValue() != null) {
            _hashCode += getTaskValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpreadTask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.net.sms.wisdom.com", "SpreadTask"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityId"));
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
        elemField.setFieldName("organizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relateBusinessInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relateBusinessInfo"));
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
        elemField.setFieldName("taskTargets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskTargets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.net.sms.wisdom.com", "TaskTarget"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskValue"));
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
