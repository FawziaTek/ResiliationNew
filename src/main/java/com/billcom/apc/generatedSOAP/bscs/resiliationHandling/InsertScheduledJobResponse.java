/**
 * InsertScheduledJobResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.resiliationHandling;

public class InsertScheduledJobResponse  extends com.billcom.apc.generatedSOAP.bscs.resiliationHandling.OperationResponse  implements java.io.Serializable {
    private java.lang.Long jobId;

    private java.lang.String jobIdPub;

    public InsertScheduledJobResponse() {
    }

    public InsertScheduledJobResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           java.lang.Long jobId,
           java.lang.String jobIdPub) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.jobId = jobId;
        this.jobIdPub = jobIdPub;
    }


    /**
     * Gets the jobId value for this InsertScheduledJobResponse.
     * 
     * @return jobId
     */
    public java.lang.Long getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this InsertScheduledJobResponse.
     * 
     * @param jobId
     */
    public void setJobId(java.lang.Long jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the jobIdPub value for this InsertScheduledJobResponse.
     * 
     * @return jobIdPub
     */
    public java.lang.String getJobIdPub() {
        return jobIdPub;
    }


    /**
     * Sets the jobIdPub value for this InsertScheduledJobResponse.
     * 
     * @param jobIdPub
     */
    public void setJobIdPub(java.lang.String jobIdPub) {
        this.jobIdPub = jobIdPub;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertScheduledJobResponse)) return false;
        InsertScheduledJobResponse other = (InsertScheduledJobResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.jobId==null && other.getJobId()==null) || 
             (this.jobId!=null &&
              this.jobId.equals(other.getJobId()))) &&
            ((this.jobIdPub==null && other.getJobIdPub()==null) || 
             (this.jobIdPub!=null &&
              this.jobIdPub.equals(other.getJobIdPub())));
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
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        if (getJobIdPub() != null) {
            _hashCode += getJobIdPub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertScheduledJobResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InsertScheduledJobResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "jobId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobIdPub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "jobIdPub"));
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
