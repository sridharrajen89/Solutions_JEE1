//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.13 at 01:28:58 PM CST 
//


package com.htcinc.jaxbappresult;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.htcinc.jaxbappresult package. 
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

    private final static QName _Modules_QNAME = new QName("", "modules");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.htcinc.jaxbappresult
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AppType }
     * 
     */
    public AppType createAppType() {
        return new AppType();
    }

    /**
     * Create an instance of {@link ModuleType }
     * 
     */
    public ModuleType createModuleType() {
        return new ModuleType();
    }

    /**
     * Create an instance of {@link Menuitem2Type }
     * 
     */
    public Menuitem2Type createMenuitem2Type() {
        return new Menuitem2Type();
    }

    /**
     * Create an instance of {@link Menuitem1Type }
     * 
     */
    public Menuitem1Type createMenuitem1Type() {
        return new Menuitem1Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modules")
    public JAXBElement<AppType> createModules(AppType value) {
        return new JAXBElement<AppType>(_Modules_QNAME, AppType.class, null, value);
    }

}