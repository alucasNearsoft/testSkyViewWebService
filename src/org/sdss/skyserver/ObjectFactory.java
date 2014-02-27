
package org.sdss.skyserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sdss.skyserver package. 
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

    private final static QName _ArrayOfString_QNAME = new QName("http://skyserver.sdss.org/", "ArrayOfString");
    private final static QName _Base64Binary_QNAME = new QName("http://skyserver.sdss.org/", "base64Binary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sdss.skyserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DimeJpeg }
     * 
     */
    public DimeJpeg createDimeJpeg() {
        return new DimeJpeg();
    }

    /**
     * Create an instance of {@link GetJpegQueryResponse }
     * 
     */
    public GetJpegQueryResponse createGetJpegQueryResponse() {
        return new GetJpegQueryResponse();
    }

    /**
     * Create an instance of {@link DimeJpegResponse }
     * 
     */
    public DimeJpegResponse createDimeJpegResponse() {
        return new DimeJpegResponse();
    }

    /**
     * Create an instance of {@link RevisionsResponse }
     * 
     */
    public RevisionsResponse createRevisionsResponse() {
        return new RevisionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetJpegQuery }
     * 
     */
    public GetJpegQuery createGetJpegQuery() {
        return new GetJpegQuery();
    }

    /**
     * Create an instance of {@link GetJpeg }
     * 
     */
    public GetJpeg createGetJpeg() {
        return new GetJpeg();
    }

    /**
     * Create an instance of {@link GetJpegResponse }
     * 
     */
    public GetJpegResponse createGetJpegResponse() {
        return new GetJpegResponse();
    }

    /**
     * Create an instance of {@link Revisions }
     * 
     */
    public Revisions createRevisions() {
        return new Revisions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skyserver.sdss.org/", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://skyserver.sdss.org/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

}
