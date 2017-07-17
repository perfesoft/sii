/**
 * EstadoFacturaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd;

public class EstadoFacturaType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.EstadoCuadreType estadoCuadre;

    private java.lang.String timestampEstadoCuadre;

    private java.lang.String timestampUltimaModificacion;

    /* Estado del registro almacenado en SII. Los estados posibles
     * son: Correcta, AceptadaConErrores y Anulada */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoRegistroSIIType estadoRegistro;

    /* Código del error de registro, en su caso. */
    private java.math.BigInteger codigoErrorRegistro;

    /* Descripción detallada del error de registro, en su caso. */
    private java.lang.String descripcionErrorRegistro;

    public EstadoFacturaType() {
    }

    public EstadoFacturaType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.EstadoCuadreType estadoCuadre,
           java.lang.String timestampEstadoCuadre,
           java.lang.String timestampUltimaModificacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoRegistroSIIType estadoRegistro,
           java.math.BigInteger codigoErrorRegistro,
           java.lang.String descripcionErrorRegistro) {
           this.estadoCuadre = estadoCuadre;
           this.timestampEstadoCuadre = timestampEstadoCuadre;
           this.timestampUltimaModificacion = timestampUltimaModificacion;
           this.estadoRegistro = estadoRegistro;
           this.codigoErrorRegistro = codigoErrorRegistro;
           this.descripcionErrorRegistro = descripcionErrorRegistro;
    }


    /**
     * Gets the estadoCuadre value for this EstadoFacturaType.
     * 
     * @return estadoCuadre
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.EstadoCuadreType getEstadoCuadre() {
        return estadoCuadre;
    }


    /**
     * Sets the estadoCuadre value for this EstadoFacturaType.
     * 
     * @param estadoCuadre
     */
    public void setEstadoCuadre(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.EstadoCuadreType estadoCuadre) {
        this.estadoCuadre = estadoCuadre;
    }


    /**
     * Gets the timestampEstadoCuadre value for this EstadoFacturaType.
     * 
     * @return timestampEstadoCuadre
     */
    public java.lang.String getTimestampEstadoCuadre() {
        return timestampEstadoCuadre;
    }


    /**
     * Sets the timestampEstadoCuadre value for this EstadoFacturaType.
     * 
     * @param timestampEstadoCuadre
     */
    public void setTimestampEstadoCuadre(java.lang.String timestampEstadoCuadre) {
        this.timestampEstadoCuadre = timestampEstadoCuadre;
    }


    /**
     * Gets the timestampUltimaModificacion value for this EstadoFacturaType.
     * 
     * @return timestampUltimaModificacion
     */
    public java.lang.String getTimestampUltimaModificacion() {
        return timestampUltimaModificacion;
    }


    /**
     * Sets the timestampUltimaModificacion value for this EstadoFacturaType.
     * 
     * @param timestampUltimaModificacion
     */
    public void setTimestampUltimaModificacion(java.lang.String timestampUltimaModificacion) {
        this.timestampUltimaModificacion = timestampUltimaModificacion;
    }


    /**
     * Gets the estadoRegistro value for this EstadoFacturaType.
     * 
     * @return estadoRegistro   * Estado del registro almacenado en SII. Los estados posibles
     * son: Correcta, AceptadaConErrores y Anulada
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoRegistroSIIType getEstadoRegistro() {
        return estadoRegistro;
    }


    /**
     * Sets the estadoRegistro value for this EstadoFacturaType.
     * 
     * @param estadoRegistro   * Estado del registro almacenado en SII. Los estados posibles
     * son: Correcta, AceptadaConErrores y Anulada
     */
    public void setEstadoRegistro(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.EstadoRegistroSIIType estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }


    /**
     * Gets the codigoErrorRegistro value for this EstadoFacturaType.
     * 
     * @return codigoErrorRegistro   * Código del error de registro, en su caso.
     */
    public java.math.BigInteger getCodigoErrorRegistro() {
        return codigoErrorRegistro;
    }


    /**
     * Sets the codigoErrorRegistro value for this EstadoFacturaType.
     * 
     * @param codigoErrorRegistro   * Código del error de registro, en su caso.
     */
    public void setCodigoErrorRegistro(java.math.BigInteger codigoErrorRegistro) {
        this.codigoErrorRegistro = codigoErrorRegistro;
    }


    /**
     * Gets the descripcionErrorRegistro value for this EstadoFacturaType.
     * 
     * @return descripcionErrorRegistro   * Descripción detallada del error de registro, en su caso.
     */
    public java.lang.String getDescripcionErrorRegistro() {
        return descripcionErrorRegistro;
    }


    /**
     * Sets the descripcionErrorRegistro value for this EstadoFacturaType.
     * 
     * @param descripcionErrorRegistro   * Descripción detallada del error de registro, en su caso.
     */
    public void setDescripcionErrorRegistro(java.lang.String descripcionErrorRegistro) {
        this.descripcionErrorRegistro = descripcionErrorRegistro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstadoFacturaType)) return false;
        EstadoFacturaType other = (EstadoFacturaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estadoCuadre==null && other.getEstadoCuadre()==null) || 
             (this.estadoCuadre!=null &&
              this.estadoCuadre.equals(other.getEstadoCuadre()))) &&
            ((this.timestampEstadoCuadre==null && other.getTimestampEstadoCuadre()==null) || 
             (this.timestampEstadoCuadre!=null &&
              this.timestampEstadoCuadre.equals(other.getTimestampEstadoCuadre()))) &&
            ((this.timestampUltimaModificacion==null && other.getTimestampUltimaModificacion()==null) || 
             (this.timestampUltimaModificacion!=null &&
              this.timestampUltimaModificacion.equals(other.getTimestampUltimaModificacion()))) &&
            ((this.estadoRegistro==null && other.getEstadoRegistro()==null) || 
             (this.estadoRegistro!=null &&
              this.estadoRegistro.equals(other.getEstadoRegistro()))) &&
            ((this.codigoErrorRegistro==null && other.getCodigoErrorRegistro()==null) || 
             (this.codigoErrorRegistro!=null &&
              this.codigoErrorRegistro.equals(other.getCodigoErrorRegistro()))) &&
            ((this.descripcionErrorRegistro==null && other.getDescripcionErrorRegistro()==null) || 
             (this.descripcionErrorRegistro!=null &&
              this.descripcionErrorRegistro.equals(other.getDescripcionErrorRegistro())));
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
        if (getEstadoCuadre() != null) {
            _hashCode += getEstadoCuadre().hashCode();
        }
        if (getTimestampEstadoCuadre() != null) {
            _hashCode += getTimestampEstadoCuadre().hashCode();
        }
        if (getTimestampUltimaModificacion() != null) {
            _hashCode += getTimestampUltimaModificacion().hashCode();
        }
        if (getEstadoRegistro() != null) {
            _hashCode += getEstadoRegistro().hashCode();
        }
        if (getCodigoErrorRegistro() != null) {
            _hashCode += getCodigoErrorRegistro().hashCode();
        }
        if (getDescripcionErrorRegistro() != null) {
            _hashCode += getDescripcionErrorRegistro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EstadoFacturaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "EstadoFacturaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCuadre");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "EstadoCuadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "EstadoCuadreType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestampEstadoCuadre");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "TimestampEstadoCuadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestampUltimaModificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "TimestampUltimaModificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "EstadoRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "EstadoRegistroSIIType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoErrorRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "CodigoErrorRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionErrorRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "DescripcionErrorRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
