/**
 * RespuestaConsultaLRFacturasType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd;

public class RespuestaConsultaLRFacturasType  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ConsultaInformacion  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaConsultaLRFacturasTypePeriodoImpositivo periodoImpositivo;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.IndicadorPaginacionType indicadorPaginacion;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.ResultadoConsultaType resultadoConsulta;

    public RespuestaConsultaLRFacturasType() {
    }

    public RespuestaConsultaLRFacturasType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraConsultaSii cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaConsultaLRFacturasTypePeriodoImpositivo periodoImpositivo,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.IndicadorPaginacionType indicadorPaginacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.ResultadoConsultaType resultadoConsulta) {
        super(
            cabecera);
        this.periodoImpositivo = periodoImpositivo;
        this.indicadorPaginacion = indicadorPaginacion;
        this.resultadoConsulta = resultadoConsulta;
    }


    /**
     * Gets the periodoImpositivo value for this RespuestaConsultaLRFacturasType.
     * 
     * @return periodoImpositivo
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaConsultaLRFacturasTypePeriodoImpositivo getPeriodoImpositivo() {
        return periodoImpositivo;
    }


    /**
     * Sets the periodoImpositivo value for this RespuestaConsultaLRFacturasType.
     * 
     * @param periodoImpositivo
     */
    public void setPeriodoImpositivo(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaConsultaLRFacturasTypePeriodoImpositivo periodoImpositivo) {
        this.periodoImpositivo = periodoImpositivo;
    }


    /**
     * Gets the indicadorPaginacion value for this RespuestaConsultaLRFacturasType.
     * 
     * @return indicadorPaginacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.IndicadorPaginacionType getIndicadorPaginacion() {
        return indicadorPaginacion;
    }


    /**
     * Sets the indicadorPaginacion value for this RespuestaConsultaLRFacturasType.
     * 
     * @param indicadorPaginacion
     */
    public void setIndicadorPaginacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.IndicadorPaginacionType indicadorPaginacion) {
        this.indicadorPaginacion = indicadorPaginacion;
    }


    /**
     * Gets the resultadoConsulta value for this RespuestaConsultaLRFacturasType.
     * 
     * @return resultadoConsulta
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.ResultadoConsultaType getResultadoConsulta() {
        return resultadoConsulta;
    }


    /**
     * Sets the resultadoConsulta value for this RespuestaConsultaLRFacturasType.
     * 
     * @param resultadoConsulta
     */
    public void setResultadoConsulta(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.ResultadoConsultaType resultadoConsulta) {
        this.resultadoConsulta = resultadoConsulta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaConsultaLRFacturasType)) return false;
        RespuestaConsultaLRFacturasType other = (RespuestaConsultaLRFacturasType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.periodoImpositivo==null && other.getPeriodoImpositivo()==null) || 
             (this.periodoImpositivo!=null &&
              this.periodoImpositivo.equals(other.getPeriodoImpositivo()))) &&
            ((this.indicadorPaginacion==null && other.getIndicadorPaginacion()==null) || 
             (this.indicadorPaginacion!=null &&
              this.indicadorPaginacion.equals(other.getIndicadorPaginacion()))) &&
            ((this.resultadoConsulta==null && other.getResultadoConsulta()==null) || 
             (this.resultadoConsulta!=null &&
              this.resultadoConsulta.equals(other.getResultadoConsulta())));
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
        if (getPeriodoImpositivo() != null) {
            _hashCode += getPeriodoImpositivo().hashCode();
        }
        if (getIndicadorPaginacion() != null) {
            _hashCode += getIndicadorPaginacion().hashCode();
        }
        if (getResultadoConsulta() != null) {
            _hashCode += getResultadoConsulta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaConsultaLRFacturasType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RespuestaConsultaLRFacturasType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoImpositivo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "PeriodoImpositivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", ">RespuestaConsultaLRFacturasType>PeriodoImpositivo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadorPaginacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "IndicadorPaginacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "IndicadorPaginacionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoConsulta");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "ResultadoConsulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "ResultadoConsultaType"));
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
