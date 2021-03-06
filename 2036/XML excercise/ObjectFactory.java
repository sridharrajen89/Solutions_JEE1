//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.22 at 06:40:55 PM CST 
//


package com.htc.advnJava;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.htc.advnJava package. 
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

    private final static QName _ArrivalTime_QNAME = new QName("", "arrival-time");
    private final static QName _DepartureTime_QNAME = new QName("", "departure-time");
    private final static QName _TrainName_QNAME = new QName("", "train-name");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _From_QNAME = new QName("", "from");
    private final static QName _To_QNAME = new QName("", "to");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.htc.advnJava
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Journeyinfo }
     * 
     */
    public Journeyinfo createJourneyinfo() {
        return new Journeyinfo();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station(null, null, null);
    }

    /**
     * Create an instance of {@link Trains }
     * 
     */
    public Trains createTrains() {
        return new Trains();
    }

    /**
     * Create an instance of {@link Train }
     * 
     */
    public Train createTrain() {
        return new Train(null, null, null, null);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arrival-time")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArrivalTime(String value) {
        return new JAXBElement<String>(_ArrivalTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "departure-time")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDepartureTime(String value) {
        return new JAXBElement<String>(_DepartureTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "train-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTrainName(String value) {
        return new JAXBElement<String>(_TrainName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "from")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFrom(String value) {
        return new JAXBElement<String>(_From_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "to")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTo(String value) {
        return new JAXBElement<String>(_To_QNAME, String.class, null, value);
    }

}
