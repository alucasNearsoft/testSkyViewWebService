
package org.sdss.skyserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ra_" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dec_" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scale_" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="width_" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height_" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="opt_" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ra",
    "dec",
    "scale",
    "width",
    "height",
    "opt"
})
@XmlRootElement(name = "GetJpeg")
public class GetJpeg {

    @XmlElement(name = "ra_")
    protected double ra;
    @XmlElement(name = "dec_")
    protected double dec;
    @XmlElement(name = "scale_")
    protected double scale;
    @XmlElement(name = "width_")
    protected int width;
    @XmlElement(name = "height_")
    protected int height;
    @XmlElement(name = "opt_")
    protected String opt;

    /**
     * Gets the value of the ra property.
     * 
     */
    public double getRa() {
        return ra;
    }

    /**
     * Sets the value of the ra property.
     * 
     */
    public void setRa(double value) {
        this.ra = value;
    }

    /**
     * Gets the value of the dec property.
     * 
     */
    public double getDec() {
        return dec;
    }

    /**
     * Sets the value of the dec property.
     * 
     */
    public void setDec(double value) {
        this.dec = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     */
    public double getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     */
    public void setScale(double value) {
        this.scale = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the opt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpt() {
        return opt;
    }

    /**
     * Sets the value of the opt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpt(String value) {
        this.opt = value;
    }

}
