package com.billcom.apc.ws.manager;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2021-07-28T15:25:44.754+01:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "APCManagerService", 
                  wsdlLocation = "file:/C:/Users/fethi.hachana/Desktop/ResiliationLivr%c3%a9/ResiliationWorkItemHandlers/src/main/resources/wsdl/APCManager.wsdl",
                  targetNamespace = "http://manager.ws.apc.billcom.com/") 
public class APCManagerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://manager.ws.apc.billcom.com/", "APCManagerService");
    public final static QName APCManagerPort = new QName("http://manager.ws.apc.billcom.com/", "APCManagerPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/fethi.hachana/Desktop/ResiliationLivr%c3%a9/ResiliationWorkItemHandlers/src/main/resources/wsdl/APCManager.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(APCManagerService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/fethi.hachana/Desktop/ResiliationLivr%c3%a9/ResiliationWorkItemHandlers/src/main/resources/wsdl/APCManager.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public APCManagerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public APCManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public APCManagerService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public APCManagerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public APCManagerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public APCManagerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns APCManager
     */
    @WebEndpoint(name = "APCManagerPort")
    public APCManager getAPCManagerPort() {
        return super.getPort(APCManagerPort, APCManager.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns APCManager
     */
    @WebEndpoint(name = "APCManagerPort")
    public APCManager getAPCManagerPort(WebServiceFeature... features) {
        return super.getPort(APCManagerPort, APCManager.class, features);
    }

}
