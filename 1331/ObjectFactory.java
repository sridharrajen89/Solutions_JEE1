//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.14 at 06:34:24 PM EST 
//


package ex1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the assignment3 package. 
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

    private final static QName _Application_QNAME = new QName("http://www.htc.org/application", "application");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: assignment3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModulesType }
     * 
     */
    public ModulesType createModulesType() {
        return new ModulesType();
    }

    /**
     * Create an instance of {@link ModuleType }
     * 
     */
    public ModuleType createModuleType() {
        return new ModuleType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModulesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.htc.org/application", name = "application")
    public JAXBElement<ModulesType> createApplication(ModulesType value) {
        return new JAXBElement<ModulesType>(_Application_QNAME, ModulesType.class, null, value);
    }

}
