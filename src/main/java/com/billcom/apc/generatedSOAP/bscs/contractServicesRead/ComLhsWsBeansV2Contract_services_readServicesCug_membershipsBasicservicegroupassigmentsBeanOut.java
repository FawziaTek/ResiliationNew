/**
 * ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractServicesRead;

public class ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut  extends com.billcom.apc.generatedSOAP.bscs.contractServicesRead.BaseSOIBean  implements java.io.Serializable {
    private java.lang.String bsgDes;

    private java.lang.Long bsgId;

    public ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut() {
    }

    public ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut(
           java.lang.String bsgDes,
           java.lang.Long bsgId) {
        this.bsgDes = bsgDes;
        this.bsgId = bsgId;
    }


    /**
     * Gets the bsgDes value for this ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut.
     * 
     * @return bsgDes
     */
    public java.lang.String getBsgDes() {
        return bsgDes;
    }


    /**
     * Sets the bsgDes value for this ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut.
     * 
     * @param bsgDes
     */
    public void setBsgDes(java.lang.String bsgDes) {
        this.bsgDes = bsgDes;
    }


    /**
     * Gets the bsgId value for this ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut.
     * 
     * @return bsgId
     */
    public java.lang.Long getBsgId() {
        return bsgId;
    }


    /**
     * Sets the bsgId value for this ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut.
     * 
     * @param bsgId
     */
    public void setBsgId(java.lang.Long bsgId) {
        this.bsgId = bsgId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut)) return false;
        ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut other = (ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bsgDes==null && other.getBsgDes()==null) || 
             (this.bsgDes!=null &&
              this.bsgDes.equals(other.getBsgDes()))) &&
            ((this.bsgId==null && other.getBsgId()==null) || 
             (this.bsgId!=null &&
              this.bsgId.equals(other.getBsgId())));
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
        if (getBsgDes() != null) {
            _hashCode += getBsgDes().hashCode();
        }
        if (getBsgId() != null) {
            _hashCode += getBsgId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComLhsWsBeansV2Contract_services_readServicesCug_membershipsBasicservicegroupassigmentsBeanOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "com.lhs.ws.beans.v2.contract_services_read.services.cug_memberships.BasicservicegroupassigmentsBeanOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bsgDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "bsgDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bsgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.lhsgroup.com/ws_v2", "bsgId"));
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
