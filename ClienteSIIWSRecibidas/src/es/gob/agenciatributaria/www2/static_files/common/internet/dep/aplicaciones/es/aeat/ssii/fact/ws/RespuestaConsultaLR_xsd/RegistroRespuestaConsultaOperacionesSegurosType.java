/**
 * RegistroRespuestaConsultaOperacionesSegurosType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd;

public class RegistroRespuestaConsultaOperacionesSegurosType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaOperacionesSegurosType datosOperacionesSeguros;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacion2Type datosPresentacion;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoFactura2Type estadoOperacionesSeguros;

    public RegistroRespuestaConsultaOperacionesSegurosType() {
    }

    public RegistroRespuestaConsultaOperacionesSegurosType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaOperacionesSegurosType datosOperacionesSeguros,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacion2Type datosPresentacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoFactura2Type estadoOperacionesSeguros) {
           this.datosOperacionesSeguros = datosOperacionesSeguros;
           this.datosPresentacion = datosPresentacion;
           this.estadoOperacionesSeguros = estadoOperacionesSeguros;
    }


    /**
     * Gets the datosOperacionesSeguros value for this RegistroRespuestaConsultaOperacionesSegurosType.
     * 
     * @return datosOperacionesSeguros
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaOperacionesSegurosType getDatosOperacionesSeguros() {
        return datosOperacionesSeguros;
    }


    /**
     * Sets the datosOperacionesSeguros value for this RegistroRespuestaConsultaOperacionesSegurosType.
     * 
     * @param datosOperacionesSeguros
     */
    public void setDatosOperacionesSeguros(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaOperacionesSegurosType datosOperacionesSeguros) {
        this.datosOperacionesSeguros = datosOperacionesSeguros;
    }


    /**
     * Gets the datosPresentacion value for this RegistroRespuestaConsultaOperacionesSegurosType.
     * 
     * @return datosPresentacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacion2Type getDatosPresentacion() {
        return datosPresentacion;
    }


    /**
     * Sets the datosPresentacion value for this RegistroRespuestaConsultaOperacionesSegurosType.
     * 
     * @param datosPresentacion
     */
    public void setDatosPresentacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacion2Type datosPresentacion) {
        this.datosPresentacion = datosPresentacion;
    }


    /**
     * Gets the estadoOperacionesSeguros value for this RegistroRespuestaConsultaOperacionesSegurosType.
     * 
     * @return estadoOperacionesSeguros
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoFactura2Type getEstadoOperacionesSeguros() {
        return estadoOperacionesSeguros;
    }


    /**
     * Sets the estadoOperacionesSeguros value for this RegistroRespuestaConsultaOperacionesSegurosType.
     * 
     * @param estadoOperacionesSeguros
     */
    public void setEstadoOperacionesSeguros(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoFactura2Type estadoOperacionesSeguros) {
        this.estadoOperacionesSeguros = estadoOperacionesSeguros;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistroRespuestaConsultaOperacionesSegurosType)) return false;
        RegistroRespuestaConsultaOperacionesSegurosType other = (RegistroRespuestaConsultaOperacionesSegurosType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosOperacionesSeguros==null && other.getDatosOperacionesSeguros()==null) || 
             (this.datosOperacionesSeguros!=null &&
              this.datosOperacionesSeguros.equals(other.getDatosOperacionesSeguros()))) &&
            ((this.datosPresentacion==null && other.getDatosPresentacion()==null) || 
             (this.datosPresentacion!=null &&
              this.datosPresentacion.equals(other.getDatosPresentacion()))) &&
            ((this.estadoOperacionesSeguros==null && other.getEstadoOperacionesSeguros()==null) || 
             (this.estadoOperacionesSeguros!=null &&
              this.estadoOperacionesSeguros.equals(other.getEstadoOperacionesSeguros())));
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
        if (getDatosOperacionesSeguros() != null) {
            _hashCode += getDatosOperacionesSeguros().hashCode();
        }
        if (getDatosPresentacion() != null) {
            _hashCode += getDatosPresentacion().hashCode();
        }
        if (getEstadoOperacionesSeguros() != null) {
            _hashCode += getEstadoOperacionesSeguros().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistroRespuestaConsultaOperacionesSegurosType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RegistroRespuestaConsultaOperacionesSegurosType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosOperacionesSeguros");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "DatosOperacionesSeguros"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RespuestaOperacionesSegurosType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosPresentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "DatosPresentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DatosPresentacion2Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoOperacionesSeguros");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "EstadoOperacionesSeguros"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "EstadoFactura2Type"));
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
