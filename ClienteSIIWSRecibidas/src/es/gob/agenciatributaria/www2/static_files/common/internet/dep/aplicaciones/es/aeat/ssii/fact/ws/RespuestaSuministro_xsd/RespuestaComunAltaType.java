/**
 * RespuestaComunAltaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd;

public class RespuestaComunAltaType  implements java.io.Serializable {
    /* CSV asociado al envío generado por AEAT. Solo se genera si
     * no hay rechazo del envio */
    private java.lang.String CSV;

    /* Se devuelven datos de la presentacion realizada. Solo se genera
     * si no hay rechazo del envio */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacionType datosPresentacion;

    /* Se devuelve la cabecera que se incluó en el envío. */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSii cabecera;

    /* Estado del envío en conjunto. 
     * 						Si los datos de cabecera y todos los registros son correctos,el
     * estado es correcto. 
     * 						En caso de estructura y cabecera correctos donde todos los registros
     * son incorrectos, el estado es incorrecto
     * 						En caso de estructura y cabecera correctos con al menos un registro
     * incorrecto o aceptado con errores, el estado global es parcialmente
     * correcto. */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoEnvioType estadoEnvio;

    public RespuestaComunAltaType() {
    }

    public RespuestaComunAltaType(
           java.lang.String CSV,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacionType datosPresentacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSii cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoEnvioType estadoEnvio) {
           this.CSV = CSV;
           this.datosPresentacion = datosPresentacion;
           this.cabecera = cabecera;
           this.estadoEnvio = estadoEnvio;
    }


    /**
     * Gets the CSV value for this RespuestaComunAltaType.
     * 
     * @return CSV   * CSV asociado al envío generado por AEAT. Solo se genera si
     * no hay rechazo del envio
     */
    public java.lang.String getCSV() {
        return CSV;
    }


    /**
     * Sets the CSV value for this RespuestaComunAltaType.
     * 
     * @param CSV   * CSV asociado al envío generado por AEAT. Solo se genera si
     * no hay rechazo del envio
     */
    public void setCSV(java.lang.String CSV) {
        this.CSV = CSV;
    }


    /**
     * Gets the datosPresentacion value for this RespuestaComunAltaType.
     * 
     * @return datosPresentacion   * Se devuelven datos de la presentacion realizada. Solo se genera
     * si no hay rechazo del envio
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacionType getDatosPresentacion() {
        return datosPresentacion;
    }


    /**
     * Sets the datosPresentacion value for this RespuestaComunAltaType.
     * 
     * @param datosPresentacion   * Se devuelven datos de la presentacion realizada. Solo se genera
     * si no hay rechazo del envio
     */
    public void setDatosPresentacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosPresentacionType datosPresentacion) {
        this.datosPresentacion = datosPresentacion;
    }


    /**
     * Gets the cabecera value for this RespuestaComunAltaType.
     * 
     * @return cabecera   * Se devuelve la cabecera que se incluó en el envío.
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSii getCabecera() {
        return cabecera;
    }


    /**
     * Sets the cabecera value for this RespuestaComunAltaType.
     * 
     * @param cabecera   * Se devuelve la cabecera que se incluó en el envío.
     */
    public void setCabecera(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSii cabecera) {
        this.cabecera = cabecera;
    }


    /**
     * Gets the estadoEnvio value for this RespuestaComunAltaType.
     * 
     * @return estadoEnvio   * Estado del envío en conjunto. 
     * 						Si los datos de cabecera y todos los registros son correctos,el
     * estado es correcto. 
     * 						En caso de estructura y cabecera correctos donde todos los registros
     * son incorrectos, el estado es incorrecto
     * 						En caso de estructura y cabecera correctos con al menos un registro
     * incorrecto o aceptado con errores, el estado global es parcialmente
     * correcto.
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoEnvioType getEstadoEnvio() {
        return estadoEnvio;
    }


    /**
     * Sets the estadoEnvio value for this RespuestaComunAltaType.
     * 
     * @param estadoEnvio   * Estado del envío en conjunto. 
     * 						Si los datos de cabecera y todos los registros son correctos,el
     * estado es correcto. 
     * 						En caso de estructura y cabecera correctos donde todos los registros
     * son incorrectos, el estado es incorrecto
     * 						En caso de estructura y cabecera correctos con al menos un registro
     * incorrecto o aceptado con errores, el estado global es parcialmente
     * correcto.
     */
    public void setEstadoEnvio(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoEnvioType estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaComunAltaType)) return false;
        RespuestaComunAltaType other = (RespuestaComunAltaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CSV==null && other.getCSV()==null) || 
             (this.CSV!=null &&
              this.CSV.equals(other.getCSV()))) &&
            ((this.datosPresentacion==null && other.getDatosPresentacion()==null) || 
             (this.datosPresentacion!=null &&
              this.datosPresentacion.equals(other.getDatosPresentacion()))) &&
            ((this.cabecera==null && other.getCabecera()==null) || 
             (this.cabecera!=null &&
              this.cabecera.equals(other.getCabecera()))) &&
            ((this.estadoEnvio==null && other.getEstadoEnvio()==null) || 
             (this.estadoEnvio!=null &&
              this.estadoEnvio.equals(other.getEstadoEnvio())));
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
        if (getCSV() != null) {
            _hashCode += getCSV().hashCode();
        }
        if (getDatosPresentacion() != null) {
            _hashCode += getDatosPresentacion().hashCode();
        }
        if (getCabecera() != null) {
            _hashCode += getCabecera().hashCode();
        }
        if (getEstadoEnvio() != null) {
            _hashCode += getEstadoEnvio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaComunAltaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaComunAltaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSV");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "CSV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosPresentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "DatosPresentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DatosPresentacionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cabecera");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "Cabecera"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CabeceraSii"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoEnvio");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "EstadoEnvio"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "EstadoEnvioType"));
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
