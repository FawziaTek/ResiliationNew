/**
 * GetOffreRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class GetOffreRequest  implements java.io.Serializable {
    private java.lang.Long coId;

    private java.lang.Long rpCode;

    public GetOffreRequest() {
    }

    public GetOffreRequest(
           java.lang.Long coId,
           java.lang.Long rpCode) {
           this.coId = coId;
           this.rpCode = rpCode;
    }


    /**
     * Gets the coId value for this GetOffreRequest.
     * 
     * @return coId
     */
    public java.lang.Long getCoId() {
        return coId;
    }


    /**
     * Sets the coId value for this GetOffreRequest.
     * 
     * @param coId
     */
    public void setCoId(java.lang.Long coId) {
        this.coId = coId;
    }


    /**
     * Gets the rpCode value for this GetOffreRequest.
     * 
     * @return rpCode
     */
    public java.lang.Long getRpCode() {
        return rpCode;
    }


    /**
     * Sets the rpCode value for this GetOffreRequest.
     * 
     * @param rpCode
     */
    public void setRpCode(java.lang.Long rpCode) {
        this.rpCode = rpCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOffreRequest)) return false;
        GetOffreRequest other = (GetOffreRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coId==null && other.getCoId()==null) || 
             (this.coId!=null &&
              this.coId.equals(other.getCoId()))) &&
            ((this.rpCode==null && other.getRpCode()==null) || 
             (this.rpCode!=null &&
              this.rpCode.equals(other.getRpCode())));
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
        if (getCoId() != null) {
            _hashCode += getCoId().hashCode();
        }
        if (getRpCode() != null) {
            _hashCode += getRpCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOffreRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetOffreRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "coId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "rpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
