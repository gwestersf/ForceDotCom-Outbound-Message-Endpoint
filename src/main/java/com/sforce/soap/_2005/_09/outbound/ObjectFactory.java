
package com.sforce.soap._2005._09.outbound;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sforce.soap._2005._09.outbound package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sforce.soap._2005._09.outbound
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationsResponse }
     * 
     */
    public NotificationsResponse createNotificationsResponse() {
        return new NotificationsResponse();
    }

    /**
     * Create an instance of {@link Notifications }
     * 
     */
    public Notifications createNotifications() {
        return new Notifications();
    }

    /**
     * Create an instance of {@link GwestrShipmentCNotification }
     * 
     */
    public GwestrShipmentCNotification createGwestrShipmentCNotification() {
        return new GwestrShipmentCNotification();
    }

}
