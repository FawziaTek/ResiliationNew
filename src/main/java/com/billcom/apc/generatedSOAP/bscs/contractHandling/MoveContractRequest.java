/**
 * MoveContractRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class MoveContractRequest  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.contractHandling.BillingAccountReference billingAccount;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference contract;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference customer;

    public MoveContractRequest() {
    }

    public MoveContractRequest(
           com.billcom.apc.generatedSOAP.bscs.contractHandling.BillingAccountReference billingAccount,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference contract,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference customer) {
           this.billingAccount = billingAccount;
           this.contract = contract;
           this.customer = customer;
    }


    /**
     * Gets the billingAccount value for this MoveContractRequest.
     * 
     * @return billingAccount
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.BillingAccountReference getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this MoveContractRequest.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(com.billcom.apc.generatedSOAP.bscs.contractHandling.BillingAccountReference billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the contract value for this MoveContractRequest.
     * 
     * @return contract
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this MoveContractRequest.
     * 
     * @param contract
     */
    public void setContract(com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference contract) {
        this.contract = contract;
    }


    /**
     * Gets the customer value for this MoveContractRequest.
     * 
     * @return customer
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this MoveContractRequest.
     * 
     * @param customer
     */
    public void setCustomer(com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference customer) {
        this.customer = customer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoveContractRequest)) return false;
        MoveContractRequest other = (MoveContractRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount()))) &&
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer())));
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
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        if (getContract() != null) {
            _hashCode += getContract().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoveContractRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "MoveContractRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BillingAccountReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "contract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ContractReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "CustomerReference"));
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
