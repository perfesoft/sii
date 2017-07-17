/**
 * RegistroRespuestaConsultaAgenciasViajesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd;

public class RegistroRespuestaConsultaAgenciasViajesType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaCobrosMetalicoType datosAgenciasViajes;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacion2Type datosPresentacion;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoFactura2Type estadoAgenciasViajes;

    public RegistroRespuestaConsultaAgenciasViajesType() {
    }

    public RegistroRespuestaConsultaAgenciasViajesType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaCobrosMetalicoType datosAgenciasViajes,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacion2Type datosPresentacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoFactura2Type estadoAgenciasViajes) {
           this.datosAgenciasViajes = datosAgenciasViajes;
           this.datosPresentacion = datosPresentacion;
           this.estadoAgenciasViajes = estadoAgenciasViajes;
    }


    /**
     * Gets the datosAgenciasViajes value for this RegistroRespuestaConsultaAgenciasViajesType.
     * 
     * @return datosAgenciasViajes
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaCobrosMetalicoType getDatosAgenciasViajes() {
        return datosAgenciasViajes;
    }


    /**
     * Sets the datosAgenciasViajes value for this RegistroRespuestaConsultaAgenciasViajesType.
     * 
     * @param datosAgenciasViajes
     */
    public void setDatosAgenciasViajes(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaCobrosMetalicoType datosAgenciasViajes) {
        this.datosAgenciasViajes = datosAgenciasViajes;
    }


    /**
     * Gets the datosPresentacion value for this RegistroRespuestaConsultaAgenciasViajesType.
     * 
     * @return datosPresentacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacion2Type getDatosPresentacion() {
        return datosPresentacion;
    }


    /**
     * Sets the datosPresentacion value for this RegistroRespuestaConsultaAgenciasViajesType.
     * 
     * @param datosPresentacion
     */
    public void setDatosPresentacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacion2Type datosPresentacion) {
        this.datosPresentacion = datosPresentacion;
    }


    /**
     * Gets the estadoAgenciasViajes value for this RegistroRespuestaConsultaAgenciasViajesType.
     * 
     * @return estadoAgenciasViajes
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoFactura2Type getEstadoAgenciasViajes() {
        return estadoAgenciasViajes;
    }


    /**
     * Sets the estadoAgenciasViajes value for this RegistroRespuestaConsultaAgenciasViajesType.
     * 
     * @param estadoAgenciasViajes
     */
    public void setEstadoAgenciasViajes(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoFactura2Type estadoAgenciasViajes) {
        this.estadoAgenciasViajes = estadoAgenciasViajes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistroRespuestaConsultaAgenciasViajesType)) return false;
        RegistroRespuestaConsultaAgenciasViajesType other = (RegistroRespuestaConsultaAgenciasViajesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosAgenciasViajes==null && other.getDatosAgenciasViajes()==null) || 
             (this.datosAgenciasViajes!=null &&
              this.datosAgenciasViajes.equals(other.getDatosAgenciasViajes()))) &&
            ((this.datosPresentacion==null && other.getDatosPresentacion()==null) || 
             (this.datosPresentacion!=null &&
              this.datosPresentacion.equals(other.getDatosPresentacion()))) &&
            ((this.estadoAgenciasViajes==null && other.getEstadoAgenciasViajes()==null) || 
             (this.estadoAgenciasViajes!=null &&
              this.estadoAgenciasViajes.equals(other.getEstadoAgenciasViajes())));
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
        if (getDatosAgenciasViajes() != null) {
            _hashCode += getDatosAgenciasViajes().hashCode();
        }
        if (getDatosPresentacion() != null) {
            _hashCode += getDatosPresentacion().hashCode();
        }
        if (getEstadoAgenciasViajes() != null) {
            _hashCode += getEstadoAgenciasViajes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistroRespuestaConsultaAgenciasViajesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RegistroRespuestaConsultaAgenciasViajesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosAgenciasViajes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "DatosAgenciasViajes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "RespuestaCobrosMetalicoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosPresentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "DatosPresentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DatosPresentacion2Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoAgenciasViajes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "EstadoAgenciasViajes"));
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
