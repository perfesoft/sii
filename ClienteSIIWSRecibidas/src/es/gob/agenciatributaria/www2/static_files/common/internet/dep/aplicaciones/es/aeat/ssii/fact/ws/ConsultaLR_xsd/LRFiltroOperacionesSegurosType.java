/**
 * LRFiltroOperacionesSegurosType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd;

public class LRFiltroOperacionesSegurosType  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RegistroSii  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ContraparteConsultaType contraparte;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType claveOperacion;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RangoFechaPresentacionType fechaPresentacion;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaModificadaType operacionModificada;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd.LRFiltroOperacionesSegurosTypeClavePaginacion clavePaginacion;

    public LRFiltroOperacionesSegurosType() {
    }

    public LRFiltroOperacionesSegurosType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RegistroSiiPeriodoImpositivo periodoImpositivo,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ContraparteConsultaType contraparte,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType claveOperacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RangoFechaPresentacionType fechaPresentacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaModificadaType operacionModificada,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd.LRFiltroOperacionesSegurosTypeClavePaginacion clavePaginacion) {
        super(
            periodoImpositivo);
        this.contraparte = contraparte;
        this.claveOperacion = claveOperacion;
        this.fechaPresentacion = fechaPresentacion;
        this.operacionModificada = operacionModificada;
        this.clavePaginacion = clavePaginacion;
    }


    /**
     * Gets the contraparte value for this LRFiltroOperacionesSegurosType.
     * 
     * @return contraparte
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ContraparteConsultaType getContraparte() {
        return contraparte;
    }


    /**
     * Sets the contraparte value for this LRFiltroOperacionesSegurosType.
     * 
     * @param contraparte
     */
    public void setContraparte(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ContraparteConsultaType contraparte) {
        this.contraparte = contraparte;
    }


    /**
     * Gets the claveOperacion value for this LRFiltroOperacionesSegurosType.
     * 
     * @return claveOperacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType getClaveOperacion() {
        return claveOperacion;
    }


    /**
     * Sets the claveOperacion value for this LRFiltroOperacionesSegurosType.
     * 
     * @param claveOperacion
     */
    public void setClaveOperacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType claveOperacion) {
        this.claveOperacion = claveOperacion;
    }


    /**
     * Gets the fechaPresentacion value for this LRFiltroOperacionesSegurosType.
     * 
     * @return fechaPresentacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RangoFechaPresentacionType getFechaPresentacion() {
        return fechaPresentacion;
    }


    /**
     * Sets the fechaPresentacion value for this LRFiltroOperacionesSegurosType.
     * 
     * @param fechaPresentacion
     */
    public void setFechaPresentacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RangoFechaPresentacionType fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }


    /**
     * Gets the operacionModificada value for this LRFiltroOperacionesSegurosType.
     * 
     * @return operacionModificada
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaModificadaType getOperacionModificada() {
        return operacionModificada;
    }


    /**
     * Sets the operacionModificada value for this LRFiltroOperacionesSegurosType.
     * 
     * @param operacionModificada
     */
    public void setOperacionModificada(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaModificadaType operacionModificada) {
        this.operacionModificada = operacionModificada;
    }


    /**
     * Gets the clavePaginacion value for this LRFiltroOperacionesSegurosType.
     * 
     * @return clavePaginacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd.LRFiltroOperacionesSegurosTypeClavePaginacion getClavePaginacion() {
        return clavePaginacion;
    }


    /**
     * Sets the clavePaginacion value for this LRFiltroOperacionesSegurosType.
     * 
     * @param clavePaginacion
     */
    public void setClavePaginacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd.LRFiltroOperacionesSegurosTypeClavePaginacion clavePaginacion) {
        this.clavePaginacion = clavePaginacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LRFiltroOperacionesSegurosType)) return false;
        LRFiltroOperacionesSegurosType other = (LRFiltroOperacionesSegurosType) obj;
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
            ((this.claveOperacion==null && other.getClaveOperacion()==null) || 
             (this.claveOperacion!=null &&
              this.claveOperacion.equals(other.getClaveOperacion()))) &&
            ((this.fechaPresentacion==null && other.getFechaPresentacion()==null) || 
             (this.fechaPresentacion!=null &&
              this.fechaPresentacion.equals(other.getFechaPresentacion()))) &&
            ((this.operacionModificada==null && other.getOperacionModificada()==null) || 
             (this.operacionModificada!=null &&
              this.operacionModificada.equals(other.getOperacionModificada()))) &&
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
        if (getClaveOperacion() != null) {
            _hashCode += getClaveOperacion().hashCode();
        }
        if (getFechaPresentacion() != null) {
            _hashCode += getFechaPresentacion().hashCode();
        }
        if (getOperacionModificada() != null) {
            _hashCode += getOperacionModificada().hashCode();
        }
        if (getClavePaginacion() != null) {
            _hashCode += getClavePaginacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LRFiltroOperacionesSegurosType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "LRFiltroOperacionesSegurosType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contraparte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "Contraparte"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ContraparteConsultaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "ClaveOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ClaveOperacionType"));
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
        elemField.setFieldName("operacionModificada");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "OperacionModificada"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "FacturaModificadaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clavePaginacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", "ClavePaginacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd", ">LRFiltroOperacionesSegurosType>ClavePaginacion"));
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
