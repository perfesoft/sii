/**
 * CabeceraSii.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;


/**
 * Datos de contexto de un suministro
 */
public class CabeceraSii  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.VersionSiiType IDVersionSii;

    /* Titular de los libros de registro que suministra la información */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaESType titular;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoComunicacionType tipoComunicacion;

    public CabeceraSii() {
    }

    public CabeceraSii(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.VersionSiiType IDVersionSii,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaESType titular,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoComunicacionType tipoComunicacion) {
           this.IDVersionSii = IDVersionSii;
           this.titular = titular;
           this.tipoComunicacion = tipoComunicacion;
    }


    /**
     * Gets the IDVersionSii value for this CabeceraSii.
     * 
     * @return IDVersionSii
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.VersionSiiType getIDVersionSii() {
        return IDVersionSii;
    }


    /**
     * Sets the IDVersionSii value for this CabeceraSii.
     * 
     * @param IDVersionSii
     */
    public void setIDVersionSii(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.VersionSiiType IDVersionSii) {
        this.IDVersionSii = IDVersionSii;
    }


    /**
     * Gets the titular value for this CabeceraSii.
     * 
     * @return titular   * Titular de los libros de registro que suministra la información
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaESType getTitular() {
        return titular;
    }


    /**
     * Sets the titular value for this CabeceraSii.
     * 
     * @param titular   * Titular de los libros de registro que suministra la información
     */
    public void setTitular(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaESType titular) {
        this.titular = titular;
    }


    /**
     * Gets the tipoComunicacion value for this CabeceraSii.
     * 
     * @return tipoComunicacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoComunicacionType getTipoComunicacion() {
        return tipoComunicacion;
    }


    /**
     * Sets the tipoComunicacion value for this CabeceraSii.
     * 
     * @param tipoComunicacion
     */
    public void setTipoComunicacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoComunicacionType tipoComunicacion) {
        this.tipoComunicacion = tipoComunicacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CabeceraSii)) return false;
        CabeceraSii other = (CabeceraSii) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDVersionSii==null && other.getIDVersionSii()==null) || 
             (this.IDVersionSii!=null &&
              this.IDVersionSii.equals(other.getIDVersionSii()))) &&
            ((this.titular==null && other.getTitular()==null) || 
             (this.titular!=null &&
              this.titular.equals(other.getTitular()))) &&
            ((this.tipoComunicacion==null && other.getTipoComunicacion()==null) || 
             (this.tipoComunicacion!=null &&
              this.tipoComunicacion.equals(other.getTipoComunicacion())));
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
        if (getIDVersionSii() != null) {
            _hashCode += getIDVersionSii().hashCode();
        }
        if (getTitular() != null) {
            _hashCode += getTitular().hashCode();
        }
        if (getTipoComunicacion() != null) {
            _hashCode += getTipoComunicacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CabeceraSii.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CabeceraSii"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDVersionSii");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDVersionSii"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "VersionSiiType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titular");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "Titular"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "PersonaFisicaJuridicaESType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoComunicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "TipoComunicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ClaveTipoComunicacionType"));
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
