
package com.baris.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baris.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFighterByNameResponse_QNAME = new QName("http://services.baris.com/", "getFighterByNameResponse");
    private final static QName _GetFighterById_QNAME = new QName("http://services.baris.com/", "getFighterById");
    private final static QName _GetFighterByIdResponse_QNAME = new QName("http://services.baris.com/", "getFighterByIdResponse");
    private final static QName _GetFighterByName_QNAME = new QName("http://services.baris.com/", "getFighterByName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baris.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFighterByIdResponse }
     * 
     */
    public GetFighterByIdResponse createGetFighterByIdResponse() {
        return new GetFighterByIdResponse();
    }

    /**
     * Create an instance of {@link GetFighterByName }
     * 
     */
    public GetFighterByName createGetFighterByName() {
        return new GetFighterByName();
    }

    /**
     * Create an instance of {@link GetFighterById }
     * 
     */
    public GetFighterById createGetFighterById() {
        return new GetFighterById();
    }

    /**
     * Create an instance of {@link GetFighterByNameResponse }
     * 
     */
    public GetFighterByNameResponse createGetFighterByNameResponse() {
        return new GetFighterByNameResponse();
    }

    /**
     * Create an instance of {@link Fighter }
     * 
     */
    public Fighter createFighter() {
        return new Fighter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFighterByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.baris.com/", name = "getFighterByNameResponse")
    public JAXBElement<GetFighterByNameResponse> createGetFighterByNameResponse(GetFighterByNameResponse value) {
        return new JAXBElement<GetFighterByNameResponse>(_GetFighterByNameResponse_QNAME, GetFighterByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFighterById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.baris.com/", name = "getFighterById")
    public JAXBElement<GetFighterById> createGetFighterById(GetFighterById value) {
        return new JAXBElement<GetFighterById>(_GetFighterById_QNAME, GetFighterById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFighterByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.baris.com/", name = "getFighterByIdResponse")
    public JAXBElement<GetFighterByIdResponse> createGetFighterByIdResponse(GetFighterByIdResponse value) {
        return new JAXBElement<GetFighterByIdResponse>(_GetFighterByIdResponse_QNAME, GetFighterByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFighterByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.baris.com/", name = "getFighterByName")
    public JAXBElement<GetFighterByName> createGetFighterByName(GetFighterByName value) {
        return new JAXBElement<GetFighterByName>(_GetFighterByName_QNAME, GetFighterByName.class, null, value);
    }

}
