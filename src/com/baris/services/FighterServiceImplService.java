
package com.baris.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FighterServiceImplService", targetNamespace = "http://services.baris.com/", wsdlLocation = "http://localhost:8091/fighterservice?wsdl")
public class FighterServiceImplService
    extends Service
{

    private final static URL FIGHTERSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException FIGHTERSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName FIGHTERSERVICEIMPLSERVICE_QNAME = new QName("http://services.baris.com/", "FighterServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8091/fighterservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FIGHTERSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        FIGHTERSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public FighterServiceImplService() {
        super(__getWsdlLocation(), FIGHTERSERVICEIMPLSERVICE_QNAME);
    }

    public FighterServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FIGHTERSERVICEIMPLSERVICE_QNAME, features);
    }

    public FighterServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, FIGHTERSERVICEIMPLSERVICE_QNAME);
    }

    public FighterServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FIGHTERSERVICEIMPLSERVICE_QNAME, features);
    }

    public FighterServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FighterServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FighterServiceImpl
     */
    @WebEndpoint(name = "FighterServiceImplPort")
    public FighterServiceImpl getFighterServiceImplPort() {
        return super.getPort(new QName("http://services.baris.com/", "FighterServiceImplPort"), FighterServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FighterServiceImpl
     */
    @WebEndpoint(name = "FighterServiceImplPort")
    public FighterServiceImpl getFighterServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.baris.com/", "FighterServiceImplPort"), FighterServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FIGHTERSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw FIGHTERSERVICEIMPLSERVICE_EXCEPTION;
        }
        return FIGHTERSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
