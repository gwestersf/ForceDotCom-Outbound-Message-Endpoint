
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sforce.soap.enterprise.sobject package. 
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

    private final static QName _GwestrShipmentCGwestrTrackingURLC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__Tracking_URL__c");
    private final static QName _GwestrShipmentCIsDeleted_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted");
    private final static QName _GwestrShipmentCCreatedDate_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate");
    private final static QName _GwestrShipmentCGwestrContactPhoneC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__Contact_Phone__c");
    private final static QName _GwestrShipmentCCreatedById_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "CreatedById");
    private final static QName _GwestrShipmentCGwestrScheduledDeliveryC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__Scheduled_Delivery__c");
    private final static QName _GwestrShipmentCSystemModstamp_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp");
    private final static QName _GwestrShipmentCGwestrOverWeightC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__OverWeight__c");
    private final static QName _GwestrShipmentCGwestrContactEmailC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__ContactEmail__c");
    private final static QName _GwestrShipmentCGwestrStatusC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__Status__c");
    private final static QName _GwestrShipmentCGwestrWeightC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__Weight__c");
    private final static QName _GwestrShipmentCName_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "Name");
    private final static QName _GwestrShipmentCGwestrTrackingExtIdC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__TrackingExtId__c");
    private final static QName _GwestrShipmentCGwestrRushC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__Rush__c");
    private final static QName _GwestrShipmentCLastModifiedDate_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate");
    private final static QName _GwestrShipmentCGwestrInsuranceC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__Insurance__c");
    private final static QName _GwestrShipmentCOwnerId_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "OwnerId");
    private final static QName _GwestrShipmentCGwestrWarningsC_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "gwestr__Warnings__c");
    private final static QName _GwestrShipmentCLastModifiedById_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sforce.soap.enterprise.sobject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SObject }
     * 
     */
    public SObject createSObject() {
        return new SObject();
    }

    /**
     * Create an instance of {@link AggregateResult }
     * 
     */
    public AggregateResult createAggregateResult() {
        return new AggregateResult();
    }

    /**
     * Create an instance of {@link GwestrShipmentC }
     * 
     */
    public GwestrShipmentC createGwestrShipmentC() {
        return new GwestrShipmentC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__Tracking_URL__c", scope = GwestrShipmentC.class)
    public JAXBElement<String> createGwestrShipmentCGwestrTrackingURLC(String value) {
        return new JAXBElement<String>(_GwestrShipmentCGwestrTrackingURLC_QNAME, String.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "IsDeleted", scope = GwestrShipmentC.class)
    public JAXBElement<Boolean> createGwestrShipmentCIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_GwestrShipmentCIsDeleted_QNAME, Boolean.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "CreatedDate", scope = GwestrShipmentC.class)
    public JAXBElement<XMLGregorianCalendar> createGwestrShipmentCCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GwestrShipmentCCreatedDate_QNAME, XMLGregorianCalendar.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__Contact_Phone__c", scope = GwestrShipmentC.class)
    public JAXBElement<String> createGwestrShipmentCGwestrContactPhoneC(String value) {
        return new JAXBElement<String>(_GwestrShipmentCGwestrContactPhoneC_QNAME, String.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "CreatedById", scope = GwestrShipmentC.class)
    public JAXBElement<String> createGwestrShipmentCCreatedById(String value) {
        return new JAXBElement<String>(_GwestrShipmentCCreatedById_QNAME, String.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__Scheduled_Delivery__c", scope = GwestrShipmentC.class)
    public JAXBElement<XMLGregorianCalendar> createGwestrShipmentCGwestrScheduledDeliveryC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GwestrShipmentCGwestrScheduledDeliveryC_QNAME, XMLGregorianCalendar.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "SystemModstamp", scope = GwestrShipmentC.class)
    public JAXBElement<XMLGregorianCalendar> createGwestrShipmentCSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GwestrShipmentCSystemModstamp_QNAME, XMLGregorianCalendar.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__OverWeight__c", scope = GwestrShipmentC.class)
    public JAXBElement<Double> createGwestrShipmentCGwestrOverWeightC(Double value) {
        return new JAXBElement<Double>(_GwestrShipmentCGwestrOverWeightC_QNAME, Double.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__ContactEmail__c", scope = GwestrShipmentC.class)
    public JAXBElement<String> createGwestrShipmentCGwestrContactEmailC(String value) {
        return new JAXBElement<String>(_GwestrShipmentCGwestrContactEmailC_QNAME, String.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__Status__c", scope = GwestrShipmentC.class)
    public JAXBElement<String> createGwestrShipmentCGwestrStatusC(String value) {
        return new JAXBElement<String>(_GwestrShipmentCGwestrStatusC_QNAME, String.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__Weight__c", scope = GwestrShipmentC.class)
    public JAXBElement<Double> createGwestrShipmentCGwestrWeightC(Double value) {
        return new JAXBElement<Double>(_GwestrShipmentCGwestrWeightC_QNAME, Double.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "Name", scope = GwestrShipmentC.class)
    public JAXBElement<String> createGwestrShipmentCName(String value) {
        return new JAXBElement<String>(_GwestrShipmentCName_QNAME, String.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__TrackingExtId__c", scope = GwestrShipmentC.class)
    public JAXBElement<String> createGwestrShipmentCGwestrTrackingExtIdC(String value) {
        return new JAXBElement<String>(_GwestrShipmentCGwestrTrackingExtIdC_QNAME, String.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__Rush__c", scope = GwestrShipmentC.class)
    public JAXBElement<Boolean> createGwestrShipmentCGwestrRushC(Boolean value) {
        return new JAXBElement<Boolean>(_GwestrShipmentCGwestrRushC_QNAME, Boolean.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "LastModifiedDate", scope = GwestrShipmentC.class)
    public JAXBElement<XMLGregorianCalendar> createGwestrShipmentCLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GwestrShipmentCLastModifiedDate_QNAME, XMLGregorianCalendar.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__Insurance__c", scope = GwestrShipmentC.class)
    public JAXBElement<Double> createGwestrShipmentCGwestrInsuranceC(Double value) {
        return new JAXBElement<Double>(_GwestrShipmentCGwestrInsuranceC_QNAME, Double.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "OwnerId", scope = GwestrShipmentC.class)
    public JAXBElement<String> createGwestrShipmentCOwnerId(String value) {
        return new JAXBElement<String>(_GwestrShipmentCOwnerId_QNAME, String.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "gwestr__Warnings__c", scope = GwestrShipmentC.class)
    public JAXBElement<String> createGwestrShipmentCGwestrWarningsC(String value) {
        return new JAXBElement<String>(_GwestrShipmentCGwestrWarningsC_QNAME, String.class, GwestrShipmentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "LastModifiedById", scope = GwestrShipmentC.class)
    public JAXBElement<String> createGwestrShipmentCLastModifiedById(String value) {
        return new JAXBElement<String>(_GwestrShipmentCLastModifiedById_QNAME, String.class, GwestrShipmentC.class, value);
    }

}
