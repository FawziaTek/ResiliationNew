
package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.11
 * 2021-08-20T10:22:32.910+01:00
 * Generated source version: 3.1.11
 */

@WebFault(name = "Exception", targetNamespace = "http://manager.ws.resiliation.billcom.com/")
public class Exception_Exception extends java.lang.Exception {
    
    private com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.Exception exception;

    public Exception_Exception() {
        super();
    }
    
    public Exception_Exception(String message) {
        super(message);
    }
    
    public Exception_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager.Exception getFaultInfo() {
        return this.exception;
    }
}
