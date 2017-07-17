/**
 * RespuestaConsultaLRFacturasEmitidasType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd;

public class RespuestaConsultaLRFacturasEmitidasType  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaConsultaLRFacturasType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaEmitidasType[] registroRespuestaConsultaLRFacturasEmitidas;

    public RespuestaConsultaLRFacturasEmitidasType() {
    }

    public RespuestaConsultaLRFacturasEmitidasType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraConsultaSii cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaConsultaLRFacturasTypePeriodoImpositivo periodoImpositivo,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.IndicadorPaginacionType indicadorPaginacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.ResultadoConsultaType resultadoConsulta,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaEmitidasType[] registroRespuestaConsultaLRFacturasEmitidas) {
        super(
            cabecera,
            periodoImpositivo,
            indicadorPaginacion,
            resultadoConsulta);
        this.registroRespuestaConsultaLRFacturasEmitidas = registroRespuestaConsultaLRFacturasEmitidas;
    }


    /**
     * Gets the registroRespuestaConsultaLRFacturasEmitidas value for this RespuestaConsultaLRFacturasEmitidasType.
     * 
     * @return registroRespuestaConsultaLRFacturasEmitidas
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaEmitidasType[] getRegistroRespuestaConsultaLRFacturasEmitidas() {
        return registroRespuestaConsultaLRFacturasEmitidas;
    }


    /**
     * Sets the registroRespuestaConsultaLRFacturasEmitidas value for this RespuestaConsultaLRFacturasEmitidasType.
     * 
     * @param registroRespuestaConsultaLRFacturasEmitidas
     */
    public void setRegistroRespuestaConsultaLRFacturasEmitidas(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaEmitidasType[] registroRespuestaConsultaLRFacturasEmitidas) {
        this.registroRespuestaConsultaLRFacturasEmitidas = registroRespuestaConsultaLRFacturasEmitidas;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaEmitidasType getRegistroRespuestaConsultaLRFacturasEmitidas(int i) {
        return this.registroRespuestaConsultaLRFacturasEmitidas[i];
    }

    public void setRegistroRespuestaConsultaLRFacturasEmitidas(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaEmitidasType _value) {
        this.registroRespuestaConsultaLRFacturasEmitidas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaConsultaLRFacturasEmitidasType)) return false;
        RespuestaConsultaLRFacturasEmitidasType other = (RespuestaConsultaLRFacturasEmitidasType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registroRespuestaConsultaLRFacturasEmitidas==null && other.getRegistroRespuestaConsultaLRFacturasEmitidas()==null) || 
             (this.registroRespuestaConsultaLRFacturasEmitidas!=null &&
              java.util.Arrays.equals(this.registroRespuestaConsultaLRFacturasEmitidas, other.getRegistroRespuestaConsultaLRFacturasEmitidas())));
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
        if (getRegistroRespuestaConsultaLRFacturasEmitidas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistroRespuestaConsultaLRFacturasEmitidas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistroRespuestaConsultaLRFacturasEmitidas(), i);
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
        new org.apache.axis.description.TypeDesc(RespuestaConsultaLRFacturasEmitidasType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RespuestaConsultaLRFacturasEmitidasType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroRespuestaConsultaLRFacturasEmitidas");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RegistroRespuestaConsultaLRFacturasEmitidas"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RegistroRespuestaConsultaEmitidasType"));
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
