/**
 * LRFiltroAgenciasViajesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd;

public class LRFiltroAgenciasViajesType  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RegistroSii  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ContraparteConsultaType contraparte;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RangoFechaPresentacionType fechaPresentacion;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaModificadaType registroModificado;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd.LRFiltroAgenciasViajesTypeClavePaginacion clavePaginacion;

    public LRFiltroAgenciasViajesType() {
    }

    public LRFiltroAgenciasViajesType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RegistroSiiPeriodoImpositivo periodoImpositivo,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ContraparteConsultaType contraparte,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RangoFechaPresentacionType fechaPresentacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaModificadaType registroModificado,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd.LRFiltroAgenciasViajesTypeClavePaginacion clavePaginacion) {
        super(
            periodoImpositivo);
        this.contraparte = contraparte;
        this.fechaPresentacion = fechaPresentacion;
        this.registroModificado = registroModificado;
        this.clavePaginacion = clavePaginacion;
    }


    /**
     * Gets the contraparte value for this LRFiltroAgenciasViajesType.
     * 
     * @return contraparte
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ContraparteConsultaType getContraparte() {
        return contraparte;
    }


    /**
     * Sets the contraparte value for this LRFiltroAgenciasViajesType.
     * 
     * @param contraparte
     */
    public void setContraparte(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ContraparteConsultaType contraparte) {
        this.contraparte = contraparte;
    }


    /**
     * Gets the fechaPresentacion value for this LRFiltroAgenciasViajesType.
     * 
     * @return fechaPresentacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RangoFechaPresentacionType getFechaPresentacion() {
        return fechaPresentacion;
    }


    /**
     * Sets the fechaPresentacion value for this LRFiltroAgenciasViajesType.
     * 
     * @param fechaPresentacion
     */
    public void setFechaPresentacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RangoFechaPresentacionType fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }


    /**
     * Gets the registroModificado value for this LRFiltroAgenciasViajesType.
     * 
     * @return registroModificado
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaModificadaType getRegistroModificado() {
        return registroModificado;
    }


    /**
     * Sets the registroModificado value for this LRFiltroAgenciasViajesType.
     * 
     * @param registroModificado
     */
    public void setRegistroModificado(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaModificadaType registroModificado) {
        this.registroModificado = registroModificado;
    }


    /**
     * Gets the clavePaginacion value for this LRFiltroAgenciasViajesType.
     * 
     * @return clavePaginacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd.LRFiltroAgenciasViajesTypeClavePaginacion getClavePaginacion() {
        return clavePaginacion;
    }


    /**
     * Sets the clavePaginacion value for this LRFiltroAgenciasViajesType.
     * 
     * @param clavePaginacion
     */
    public void setClavePaginacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd.LRFiltroAgenciasViajesTypeClavePaginacion clavePaginacion) {
        this.clavePaginacion = clavePaginacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LRFiltroAgenciasViajesType)) return false;
        LRFiltroAgenciasViajesType other = (LRFiltroAgenciasViajesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contraparte==null && other.getContraparte()==null) || 
             (this.contraparte!=null &&
              this.contraparte.equals(other.getContraparte()))) &&
            ((this.fechaPresentacion==null && other.getFechaPresentacion()==null) || 
             (this.fechaPresentacion!=null &&
              this.fechaPresentacion.equals(other.getFechaPresentacion()))) &&
            ((this.registroModificado==null && other.getRegistroModificado()==null) || 
             (this.registroModificado!=null &&
              this.registroModificado.equals(other.getRegistroModificado()))) &&
            ((this.clavePaginacion==null && other.getClavePaginacion()==null) || 
             (this.clavePaginacion!=null &&
              this.clavePaginacion.equals(other.getClavePaginacion())));
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
        if (getContraparte() != null) {
            _hashCode += getContraparte().hashCode();
        }
        if (getFechaPresentacion() != null) {
            _hashCode += getFechaPresentacion().hashCode();
        }
        if (getRegistroModificado() != null) {
            _hashCode += getRegistroModificado().hashCode();
        }
        if (getClavePaginacion() != null) {
            _hashCode += getClavePaginacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LRFiltroAgenciasViajesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "LRFiltroAgenciasViajesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contraparte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "Contraparte"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ContraparteConsultaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPresentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "FechaPresentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "RangoFechaPresentacionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroModificado");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "RegistroModificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "FacturaModificadaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clavePaginacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "ClavePaginacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", ">LRFiltroAgenciasViajesType>ClavePaginacion"));
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
