/**
 * DetailedInvoiceFileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class DetailedInvoiceFileResponse  extends com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse  implements java.io.Serializable {
    private byte[] document;

    private java.lang.String documentFormat;

    public DetailedInvoiceFileResponse() {
    }

    public DetailedInvoiceFileResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           byte[] document,
           java.lang.String documentFormat) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.document = document;
        this.documentFormat = documentFormat;
    }


    /**
     * Gets the document value for this DetailedInvoiceFileResponse.
     * 
     * @return document
     */
    public byte[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this DetailedInvoiceFileResponse.
     * 
     * @param document
     */
    public void setDocument(byte[] document) {
        this.document = document;
    }


    /**
     * Gets the documentFormat value for this DetailedInvoiceFileResponse.
     * 
     * @return documentFormat
     */
    public java.lang.String getDocumentFormat() {
        return documentFormat;
    }


    /**
     * Sets the documentFormat value for this DetailedInvoiceFileResponse.
     * 
     * @param documentFormat
     */
    public void setDocumentFormat(java.lang.String documentFormat) {
        this.documentFormat = documentFormat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetailedInvoiceFileResponse)) return false;
        DetailedInvoiceFileResponse other = (DetailedInvoiceFileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument()))) &&
            ((this.documentFormat==null && other.getDocumentFormat()==null) || 
             (this.documentFormat!=null &&
              this.documentFormat.equals(other.getDocumentFormat())));
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
        if (getDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentFormat() != null) {
            _hashCode += getDocumentFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetailedInvoiceFileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "DetailedInvoiceFileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "documentFormat"));
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
