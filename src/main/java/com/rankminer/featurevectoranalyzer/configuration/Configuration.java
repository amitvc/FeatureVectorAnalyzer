//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.14 at 06:28:43 PM EDT 
//


package com.rankminer.featurevectoranalyzer.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ftp" type="{http://www.featurevectoranalyzer.rankminer.com/configuration}ftp"/>
 *         &lt;element name="dbConfiguration" type="{http://www.featurevectoranalyzer.rankminer.com/configuration}dbConfiguration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuration", propOrder = {
	"delimiter",
    "scpConfig",
    "dbConfiguration"
})
@XmlRootElement
public class Configuration {
	
	@XmlElement(required=true)
	protected String delimiter;
	@XmlElement(required = true)
    protected SCPConfig scpConfig;
    @XmlElement(required = true)
    protected DbConfiguration dbConfiguration;
    @XmlElement(required = true)
    protected MetaDataConfig metadataConfig;
    
    /**
     * Gets the value of the ftp property.
     * 
     * @return
     *     possible object is
     *     {@link Ftp }
     *     
     */
    public SCPConfig getSCPConfig() {
        return scpConfig;
    }

    /**
     * Sets the value of the ftp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ftp }
     *     
     */
    public void setSCPConfig(SCPConfig value) {
        this.scpConfig = value;
    }

    /**
     * Gets the value of the dbConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link DbConfiguration }
     *     
     */
    public DbConfiguration getDbConfiguration() {
        return dbConfiguration;
    }

    /**
     * Sets the value of the dbConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbConfiguration }
     *     
     */
    public void setDbConfiguration(DbConfiguration value) {
        this.dbConfiguration = value;
    }
    
    public String getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
	
	/**
     * Gets the value of the metadataConfig property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataConfig }
     *     
     */
    public MetaDataConfig getMetadataConfig() {
        return metadataConfig;
    }

    /**
     * Sets the value of the metadataConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataConfig }
     *     
     */
    public void setMetaDataConfig(MetaDataConfig value) {
        this.metadataConfig = value;
    }


}
