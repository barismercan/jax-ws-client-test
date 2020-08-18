
package com.baris.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FighterServiceImpl", targetNamespace = "http://services.baris.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FighterServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.baris.services.Fighter
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFighterById", targetNamespace = "http://services.baris.com/", className = "com.baris.services.GetFighterById")
    @ResponseWrapper(localName = "getFighterByIdResponse", targetNamespace = "http://services.baris.com/", className = "com.baris.services.GetFighterByIdResponse")
    @Action(input = "http://services.baris.com/FighterServiceImpl/getFighterByIdRequest", output = "http://services.baris.com/FighterServiceImpl/getFighterByIdResponse")
    public Fighter getFighterById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.baris.services.Fighter
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFighterByName", targetNamespace = "http://services.baris.com/", className = "com.baris.services.GetFighterByName")
    @ResponseWrapper(localName = "getFighterByNameResponse", targetNamespace = "http://services.baris.com/", className = "com.baris.services.GetFighterByNameResponse")
    @Action(input = "http://services.baris.com/FighterServiceImpl/getFighterByNameRequest", output = "http://services.baris.com/FighterServiceImpl/getFighterByNameResponse")
    public Fighter getFighterByName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
