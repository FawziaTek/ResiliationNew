/**
 * InfoConsoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class InfoConsoResponse  extends com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConso infoConso;

    public InfoConsoResponse() {
    }

    public InfoConsoResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConso infoConso) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.infoConso = infoConso;
    }


    /**
     * Gets the infoConso value for this InfoConsoResponse.
     * 
     * @return infoConso
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConso getInfoConso() {
        return infoConso;
    }


    /**
     * Sets the infoConso value for this InfoConsoResponse.
     * 
     * @param infoConso
     */
    public void setInfoConso(com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoConso infoConso) {
        this.infoConso = infoConso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoConsoResponse)) return false;
        InfoConsoResponse other = (InfoConsoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.infoConso==null && other.getInfoConso()==null) || 
             (this.infoConso!=null &&
              this.infoConso.equals(other.getInfoConso())));
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
        if (getInfoConso() != null) {
            _hashCode += getInfoConso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoConsoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InfoConsoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoConso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "infoConso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InfoConso"));
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
