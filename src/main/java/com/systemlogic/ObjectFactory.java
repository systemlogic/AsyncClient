
package com.systemlogic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.systemlogic package. 
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

    private final static QName _AsyncAddResponse_QNAME = new QName("http://systemlogic.com/", "asyncAddResponse");
    private final static QName _AsyncAdd_QNAME = new QName("http://systemlogic.com/", "asyncAdd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.systemlogic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsyncAdd }
     * 
     */
    public AsyncAdd createAsyncAdd() {
        return new AsyncAdd();
    }

    /**
     * Create an instance of {@link AsyncAddResponse }
     * 
     */
    public AsyncAddResponse createAsyncAddResponse() {
        return new AsyncAddResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncAddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://systemlogic.com/", name = "asyncAddResponse")
    public JAXBElement<AsyncAddResponse> createAsyncAddResponse(AsyncAddResponse value) {
        return new JAXBElement<AsyncAddResponse>(_AsyncAddResponse_QNAME, AsyncAddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncAdd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://systemlogic.com/", name = "asyncAdd")
    public JAXBElement<AsyncAdd> createAsyncAdd(AsyncAdd value) {
        return new JAXBElement<AsyncAdd>(_AsyncAdd_QNAME, AsyncAdd.class, null, value);
    }

}
