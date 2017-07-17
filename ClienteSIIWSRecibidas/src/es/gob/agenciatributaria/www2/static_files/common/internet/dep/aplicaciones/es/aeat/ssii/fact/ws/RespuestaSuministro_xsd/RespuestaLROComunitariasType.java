/**
 * RespuestaLROComunitariasType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd;


/**
 * Respuesta a un envío Sii para suministro de Facturas emitidas
 */
public class RespuestaLROComunitariasType  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaComunAltaType  implements java.io.Serializable {
    /* Estado detallado de cada línea del suministro. */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaComunitariaType[] respuestaLinea;

    public RespuestaLROComunitariasType() {
    }

    public RespuestaLROComunitariasType(
           java.lang.String CSV,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacionType datosPresentacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSii cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoEnvioType estadoEnvio,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaComunitariaType[] respuestaLinea) {
        super(
            CSV,
            datosPresentacion,
            cabecera,
            estadoEnvio);
        this.respuestaLinea = respuestaLinea;
    }


    /**
     * Gets the respuestaLinea value for this RespuestaLROComunitariasType.
     * 
     * @return respuestaLinea   * Estado detallado de cada línea del suministro.
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaComunitariaType[] getRespuestaLinea() {
        return respuestaLinea;
    }


    /**
     * Sets the respuestaLinea value for this RespuestaLROComunitariasType.
     * 
     * @param respuestaLinea   * Estado detallado de cada línea del suministro.
     */
    public void setRespuestaLinea(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaComunitariaType[] respuestaLinea) {
        this.respuestaLinea = respuestaLinea;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaComunitariaType getRespuestaLinea(int i) {
        return this.respuestaLinea[i];
    }

    public void setRespuestaLinea(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaComunitariaType _value) {
        this.respuestaLinea[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaLROComunitariasType)) return false;
        RespuestaLROComunitariasType other = (RespuestaLROComunitariasType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.respuestaLinea==null && other.getRespuestaLinea()==null) || 
             (this.respuestaLinea!=null &&
              java.util.Arrays.equals(this.respuestaLinea, other.getRespuestaLinea())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRespuestaLinea() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRespuestaLinea());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRespuestaLinea(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaLROComunitariasType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLROComunitariasType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaLinea");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLinea"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaComunitariaType"));
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
