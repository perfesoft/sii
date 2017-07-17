/**
 * LRFiltroOperacionesSegurosTypeClavePaginacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd;

public class LRFiltroOperacionesSegurosTypeClavePaginacion  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType claveOperacion;

    public LRFiltroOperacionesSegurosTypeClavePaginacion() {
    }

    public LRFiltroOperacionesSegurosTypeClavePaginacion(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType claveOperacion) {
           this.contraparte = contraparte;
           this.claveOperacion = claveOperacion;
    }


    /**
     * Gets the contraparte value for this LRFiltroOperacionesSegurosTypeClavePaginacion.
     * 
     * @return contraparte
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType getContraparte() {
        return contraparte;
    }


    /**
     * Sets the contraparte value for this LRFiltroOperacionesSegurosTypeClavePaginacion.
     * 
     * @param contraparte
     */
    public void setContraparte(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte) {
        this.contraparte = contraparte;
    }


    /**
     * Gets the claveOperacion value for this LRFiltroOperacionesSegurosTypeClavePaginacion.
     * 
     * @return claveOperacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType getClaveOperacion() {
        return claveOperacion;
    }


    /**
     * Sets the claveOperacion value for this LRFiltroOperacionesSegurosTypeClavePaginacion.
     * 
     * @param claveOperacion
     */
    public void setClaveOperacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType claveOperacion) {
        this.claveOperacion = claveOperacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LRFiltroOperacionesSegurosTypeClavePaginacion)) return false;
        LRFiltroOperacionesSegurosTypeClavePaginacion other = (LRFiltroOperacionesSegurosTypeClavePaginacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contraparte==null && other.getContraparte()==null) || 
             (this.contraparte!=null &&
              this.contraparte.equals(other.getContraparte()))) &&
            ((this.claveOperacion==null && other.getClaveOperacion()==null) || 
             (this.claveOperacion!=null &&
              this.claveOperacion.equals(other.getClaveOperacion())));
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
        if (getContraparte() != null) {
            _hashCode += getContraparte().hashCode();
        }
        if (getClaveOperacion() != null) {
            _hashCode += getClaveOperacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LRFiltroOperacionesSegurosTypeClavePaginacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", ">LRFiltroOperacionesSegurosType>ClavePaginacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contraparte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "Contraparte"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "PersonaFisicaJuridicaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "ClaveOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ClaveOperacionType"));
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
