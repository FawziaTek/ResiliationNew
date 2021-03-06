/**
 * TakeOverRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class TakeOverRequest  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.contractHandling.BillingAccountReference billingAccount;

    private java.lang.Boolean chargeSubscriptionFees;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference contract;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference customer;

    private com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoFields infoFields;

    private java.lang.Long reasonId;

    public TakeOverRequest() {
    }

    public TakeOverRequest(
           com.billcom.apc.generatedSOAP.bscs.contractHandling.BillingAccountReference billingAccount,
           java.lang.Boolean chargeSubscriptionFees,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference contract,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference customer,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoFields infoFields,
           java.lang.Long reasonId) {
           this.billingAccount = billingAccount;
           this.chargeSubscriptionFees = chargeSubscriptionFees;
           this.contract = contract;
           this.customer = customer;
           this.infoFields = infoFields;
           this.reasonId = reasonId;
    }


    /**
     * Gets the billingAccount value for this TakeOverRequest.
     * 
     * @return billingAccount
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.BillingAccountReference getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this TakeOverRequest.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(com.billcom.apc.generatedSOAP.bscs.contractHandling.BillingAccountReference billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the chargeSubscriptionFees value for this TakeOverRequest.
     * 
     * @return chargeSubscriptionFees
     */
    public java.lang.Boolean getChargeSubscriptionFees() {
        return chargeSubscriptionFees;
    }


    /**
     * Sets the chargeSubscriptionFees value for this TakeOverRequest.
     * 
     * @param chargeSubscriptionFees
     */
    public void setChargeSubscriptionFees(java.lang.Boolean chargeSubscriptionFees) {
        this.chargeSubscriptionFees = chargeSubscriptionFees;
    }


    /**
     * Gets the contract value for this TakeOverRequest.
     * 
     * @return contract
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this TakeOverRequest.
     * 
     * @param contract
     */
    public void setContract(com.billcom.apc.generatedSOAP.bscs.contractHandling.ContractReference contract) {
        this.contract = contract;
    }


    /**
     * Gets the customer value for this TakeOverRequest.
     * 
     * @return customer
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TakeOverRequest.
     * 
     * @param customer
     */
    public void setCustomer(com.billcom.apc.generatedSOAP.bscs.contractHandling.CustomerReference customer) {
        this.customer = customer;
    }


    /**
     * Gets the infoFields value for this TakeOverRequest.
     * 
     * @return infoFields
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoFields getInfoFields() {
        return infoFields;
    }


    /**
     * Sets the infoFields value for this TakeOverRequest.
     * 
     * @param infoFields
     */
    public void setInfoFields(com.billcom.apc.generatedSOAP.bscs.contractHandling.InfoFields infoFields) {
        this.infoFields = infoFields;
    }


    /**
     * Gets the reasonId value for this TakeOverRequest.
     * 
     * @return reasonId
     */
    public java.lang.Long getReasonId() {
        return reasonId;
    }


    /**
     * Sets the reasonId value for this TakeOverRequest.
     * 
     * @param reasonId
     */
    public void setReasonId(java.lang.Long reasonId) {
        this.reasonId = reasonId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TakeOverRequest)) return false;
        TakeOverRequest other = (TakeOverRequest) obj;
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
            ((this.chargeSubscriptionFees==null && other.getChargeSubscriptionFees()==null) || 
             (this.chargeSubscriptionFees!=null &&
              this.chargeSubscriptionFees.equals(other.getChargeSubscriptionFees()))) &&
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.infoFields==null && other.getInfoFields()==null) || 
             (this.infoFields!=null &&
              this.infoFields.equals(other.getInfoFields()))) &&
            ((this.reasonId==null && other.getReasonId()==null) || 
             (this.reasonId!=null &&
              this.reasonId.equals(other.getReasonId())));
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
        if (getChargeSubscriptionFees() != null) {
            _hashCode += getChargeSubscriptionFees().hashCode();
        }
        if (getContract() != null) {
            _hashCode += getContract().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getInfoFields() != null) {
            _hashCode += getInfoFields().hashCode();
        }
        if (getReasonId() != null) {
            _hashCode += getReasonId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TakeOverRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "TakeOverRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "BillingAccountReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeSubscriptionFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "chargeSubscriptionFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "infoFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "InfoFields"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "reasonId"));
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
