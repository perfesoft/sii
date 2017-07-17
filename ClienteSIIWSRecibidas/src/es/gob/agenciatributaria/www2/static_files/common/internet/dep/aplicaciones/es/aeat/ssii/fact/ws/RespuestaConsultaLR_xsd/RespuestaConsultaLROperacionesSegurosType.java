/**
 * RespuestaConsultaLROperacionesSegurosType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd;

public class RespuestaConsultaLROperacionesSegurosType  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaConsultaLRFacturasType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaOperacionesSegurosType[] registroRespuestaConsultaLROperacionesSeguros;

    public RespuestaConsultaLROperacionesSegurosType() {
    }

    public RespuestaConsultaLROperacionesSegurosType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraConsultaSii cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaConsultaLRFacturasTypePeriodoImpositivo periodoImpositivo,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.IndicadorPaginacionType indicadorPaginacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.ResultadoConsultaType resultadoConsulta,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaOperacionesSegurosType[] registroRespuestaConsultaLROperacionesSeguros) {
        super(
            cabecera,
            periodoImpositivo,
            indicadorPaginacion,
            resultadoConsulta);
        this.registroRespuestaConsultaLROperacionesSeguros = registroRespuestaConsultaLROperacionesSeguros;
    }


    /**
     * Gets the registroRespuestaConsultaLROperacionesSeguros value for this RespuestaConsultaLROperacionesSegurosType.
     * 
     * @return registroRespuestaConsultaLROperacionesSeguros
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaOperacionesSegurosType[] getRegistroRespuestaConsultaLROperacionesSeguros() {
        return registroRespuestaConsultaLROperacionesSeguros;
    }


    /**
     * Sets the registroRespuestaConsultaLROperacionesSeguros value for this RespuestaConsultaLROperacionesSegurosType.
     * 
     * @param registroRespuestaConsultaLROperacionesSeguros
     */
    public void setRegistroRespuestaConsultaLROperacionesSeguros(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaOperacionesSegurosType[] registroRespuestaConsultaLROperacionesSeguros) {
        this.registroRespuestaConsultaLROperacionesSeguros = registroRespuestaConsultaLROperacionesSeguros;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaOperacionesSegurosType getRegistroRespuestaConsultaLROperacionesSeguros(int i) {
        return this.registroRespuestaConsultaLROperacionesSeguros[i];
    }

    public void setRegistroRespuestaConsultaLROperacionesSeguros(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RegistroRespuestaConsultaOperacionesSegurosType _value) {
        this.registroRespuestaConsultaLROperacionesSeguros[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaConsultaLROperacionesSegurosType)) return false;
        RespuestaConsultaLROperacionesSegurosType other = (RespuestaConsultaLROperacionesSegurosType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registroRespuestaConsultaLROperacionesSeguros==null && other.getRegistroRespuestaConsultaLROperacionesSeguros()==null) || 
             (this.registroRespuestaConsultaLROperacionesSeguros!=null &&
              java.util.Arrays.equals(this.registroRespuestaConsultaLROperacionesSeguros, other.getRegistroRespuestaConsultaLROperacionesSeguros())));
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
        if (getRegistroRespuestaConsultaLROperacionesSeguros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistroRespuestaConsultaLROperacionesSeguros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistroRespuestaConsultaLROperacionesSeguros(), i);
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
        new org.apache.axis.description.TypeDesc(RespuestaConsultaLROperacionesSegurosType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RespuestaConsultaLROperacionesSegurosType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroRespuestaConsultaLROperacionesSeguros");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RegistroRespuestaConsultaLROperacionesSeguros"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RegistroRespuestaConsultaOperacionesSegurosType"));
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
