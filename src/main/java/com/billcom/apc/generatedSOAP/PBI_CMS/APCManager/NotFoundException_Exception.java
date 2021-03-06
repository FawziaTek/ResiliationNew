
package com.billcom.apc.generatedSOAP.PBI_CMS.APCManager;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.11
 * 2021-03-18T12:52:04.480+01:00
 * Generated source version: 3.1.11
 */

@WebFault(name = "NotFoundException", targetNamespace = "http://manager.ws.apc.billcom.com/")
public class NotFoundException_Exception extends Exception {
    
    private com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.NotFoundException notFoundException;

    public NotFoundException_Exception() {
        super();
    }
    
    public NotFoundException_Exception(String message) {
        super(message);
    }
    
    public NotFoundException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException_Exception(String message, com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.NotFoundException notFoundException) {
        super(message);
        this.notFoundException = notFoundException;
    }

    public NotFoundException_Exception(String message, com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.NotFoundException notFoundException, Throwable cause) {
        super(message, cause);
        this.notFoundException = notFoundException;
    }

    public com.billcom.apc.generatedSOAP.PBI_CMS.APCManager.NotFoundException getFaultInfo() {
        return this.notFoundException;
    }
}
