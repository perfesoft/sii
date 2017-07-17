/**
 * SujetaPrestacionTypeExenta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class SujetaPrestacionTypeExenta  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CausaExencionType causaExencion;

    private java.lang.String baseImponible;

    public SujetaPrestacionTypeExenta() {
    }

    public SujetaPrestacionTypeExenta(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CausaExencionType causaExencion,
           java.lang.String baseImponible) {
           this.causaExencion = causaExencion;
           this.baseImponible = baseImponible;
    }


    /**
     * Gets the causaExencion value for this SujetaPrestacionTypeExenta.
     * 
     * @return causaExencion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CausaExencionType getCausaExencion() {
        return causaExencion;
    }


    /**
     * Sets the causaExencion value for this SujetaPrestacionTypeExenta.
     * 
     * @param causaExencion
     */
    public void setCausaExencion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CausaExencionType causaExencion) {
        this.causaExencion = causaExencion;
    }


    /**
     * Gets the baseImponible value for this SujetaPrestacionTypeExenta.
     * 
     * @return baseImponible
     */
    public java.lang.String getBaseImponible() {
        return baseImponible;
    }


    /**
     * Sets the baseImponible value for this SujetaPrestacionTypeExenta.
     * 
     * @param baseImponible
     */
    public void setBaseImponible(java.lang.String baseImponible) {
        this.baseImponible = baseImponible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SujetaPrestacionTypeExenta)) return false;
        SujetaPrestacionTypeExenta other = (SujetaPrestacionTypeExenta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.causaExencion==null && other.getCausaExencion()==null) || 
             (this.causaExencion!=null &&
              this.causaExencion.equals(other.getCausaExencion()))) &&
            ((this.baseImponible==null && other.getBaseImponible()==null) || 
             (this.baseImponible!=null &&
              this.baseImponible.equals(other.getBaseImponible())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCausaExencion() != null) {
            _hashCode += getCausaExencion().hashCode();
        }
        if (getBaseImponible() != null) {
            _hashCode += getBaseImponible().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SujetaPrestacionTypeExenta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", ">SujetaPrestacionType>Exenta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaExencion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CausaExencion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CausaExencionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseImponible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "BaseImponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
