/**
 * DatosInmuebleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class DatosInmuebleType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SituacionInmuebleType situacionInmueble;

    private java.lang.String referenciaCatastral;

    public DatosInmuebleType() {
    }

    public DatosInmuebleType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SituacionInmuebleType situacionInmueble,
           java.lang.String referenciaCatastral) {
           this.situacionInmueble = situacionInmueble;
           this.referenciaCatastral = referenciaCatastral;
    }


    /**
     * Gets the situacionInmueble value for this DatosInmuebleType.
     * 
     * @return situacionInmueble
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SituacionInmuebleType getSituacionInmueble() {
        return situacionInmueble;
    }


    /**
     * Sets the situacionInmueble value for this DatosInmuebleType.
     * 
     * @param situacionInmueble
     */
    public void setSituacionInmueble(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SituacionInmuebleType situacionInmueble) {
        this.situacionInmueble = situacionInmueble;
    }


    /**
     * Gets the referenciaCatastral value for this DatosInmuebleType.
     * 
     * @return referenciaCatastral
     */
    public java.lang.String getReferenciaCatastral() {
        return referenciaCatastral;
    }


    /**
     * Sets the referenciaCatastral value for this DatosInmuebleType.
     * 
     * @param referenciaCatastral
     */
    public void setReferenciaCatastral(java.lang.String referenciaCatastral) {
        this.referenciaCatastral = referenciaCatastral;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosInmuebleType)) return false;
        DatosInmuebleType other = (DatosInmuebleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.situacionInmueble==null && other.getSituacionInmueble()==null) || 
             (this.situacionInmueble!=null &&
              this.situacionInmueble.equals(other.getSituacionInmueble()))) &&
            ((this.referenciaCatastral==null && other.getReferenciaCatastral()==null) || 
             (this.referenciaCatastral!=null &&
              this.referenciaCatastral.equals(other.getReferenciaCatastral())));
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
        if (getSituacionInmueble() != null) {
            _hashCode += getSituacionInmueble().hashCode();
        }
        if (getReferenciaCatastral() != null) {
            _hashCode += getReferenciaCatastral().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosInmuebleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DatosInmuebleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacionInmueble");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "SituacionInmueble"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "SituacionInmuebleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenciaCatastral");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ReferenciaCatastral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
