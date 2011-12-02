//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.28 at 03:20:55 PM PDT 
//


package org.apache.karaf.region.persist.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.karaf.region.persist.model package. 
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

    private final static QName _Regions_QNAME = new QName("http://karaf.apache.org/xmlns/region/v1.0.0", "regions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.karaf.region.persist.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FilterNamespaceType }
     * 
     */
    public FilterNamespaceType createFilterNamespaceType() {
        return new FilterNamespaceType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link RegionBundleType }
     * 
     */
    public RegionBundleType createRegionBundleType() {
        return new RegionBundleType();
    }

    /**
     * Create an instance of {@link FilterBundleType }
     * 
     */
    public FilterBundleType createFilterBundleType() {
        return new FilterBundleType();
    }

    /**
     * Create an instance of {@link FilterPackageType }
     * 
     */
    public FilterPackageType createFilterPackageType() {
        return new FilterPackageType();
    }

    /**
     * Create an instance of {@link FilterAttributeType }
     * 
     */
    public FilterAttributeType createFilterAttributeType() {
        return new FilterAttributeType();
    }

    /**
     * Create an instance of {@link RegionType }
     * 
     */
    public RegionType createRegionType() {
        return new RegionType();
    }

    /**
     * Create an instance of {@link RegionsType }
     * 
     */
    public RegionsType createRegionsType() {
        return new RegionsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://karaf.apache.org/xmlns/region/v1.0.0", name = "regions")
    public JAXBElement<RegionsType> createRegions(RegionsType value) {
        return new JAXBElement<RegionsType>(_Regions_QNAME, RegionsType.class, null, value);
    }

}
