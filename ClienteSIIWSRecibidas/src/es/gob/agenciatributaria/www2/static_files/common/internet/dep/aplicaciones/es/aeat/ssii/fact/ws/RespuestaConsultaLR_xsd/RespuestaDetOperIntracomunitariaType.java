/**
 * RespuestaDetOperIntracomunitariaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd;

public class RespuestaDetOperIntracomunitariaType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaType detOperIntracomunitarias;

    public RespuestaDetOperIntracomunitariaType() {
    }

    public RespuestaDetOperIntracomunitariaType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaType detOperIntracomunitarias) {
           this.contraparte = contraparte;
           this.detOperIntracomunitarias = detOperIntracomunitarias;
    }


    /**
     * Gets the contraparte value for this RespuestaDetOperIntracomunitariaType.
     * 
     * @return contraparte
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType getContraparte() {
        return contraparte;
    }


    /**
     * Sets the contraparte value for this RespuestaDetOperIntracomunitariaType.
     * 
     * @param contraparte
     */
    public void setContraparte(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte) {
        this.contraparte = contraparte;
    }


    /**
     * Gets the detOperIntracomunitarias value for this RespuestaDetOperIntracomunitariaType.
     * 
     * @return detOperIntracomunitarias
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaType getDetOperIntracomunitarias() {
        return detOperIntracomunitarias;
    }


    /**
     * Sets the detOperIntracomunitarias value for this RespuestaDetOperIntracomunitariaType.
     * 
     * @param detOperIntracomunitarias
     */
    public void setDetOperIntracomunitarias(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaType detOperIntracomunitarias) {
        this.detOperIntracomunitarias = detOperIntracomunitarias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaDetOperIntracomunitariaType)) return false;
        RespuestaDetOperIntracomunitariaType other = (RespuestaDetOperIntracomunitariaType) obj;
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
            ((this.detOperIntracomunitarias==null && other.getDetOperIntracomunitarias()==null) || 
             (this.detOperIntracomunitarias!=null &&
              this.detOperIntracomunitarias.equals(other.getDetOperIntracomunitarias())));
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
        if (getDetOperIntracomunitarias() != null) {
            _hashCode += getDetOperIntracomunitarias().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaDetOperIntracomunitariaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RespuestaDetOperIntracomunitariaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contraparte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "Contraparte"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "PersonaFisicaJuridicaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detOperIntracomunitarias");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "DetOperIntracomunitarias"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "OperacionIntracomunitariaType"));
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
