/**
 * RespuestaOperacionesSegurosBajaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd;


/**
 * Respuesta a un envío Sii
 */
public class RespuestaOperacionesSegurosBajaType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaOperacionesSegurosBajaTypePeriodoImpositivo periodoImpositivo;

    /* Permite identificar la factura línea del suministro a la que
     * se refiere la respuesta. */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType claveOperacion;

    /* Estado del registro. Correcto, erróneo o aceptado con errores */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoRegistroType estadoRegistro;

    /* Código del error de registro, en su caso. */
    private java.math.BigInteger codigoErrorRegistro;

    /* Descripción detallada del error de registro, en su caso. */
    private java.lang.String descripcionErrorRegistro;

    /* CSV asociado al registro. Solo se suministra si el registro
     * es rechazado porque ya está dada de baja */
    private java.lang.String CSV;

    public RespuestaOperacionesSegurosBajaType() {
    }

    public RespuestaOperacionesSegurosBajaType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaOperacionesSegurosBajaTypePeriodoImpositivo periodoImpositivo,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType claveOperacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoRegistroType estadoRegistro,
           java.math.BigInteger codigoErrorRegistro,
           java.lang.String descripcionErrorRegistro,
           java.lang.String CSV) {
           this.periodoImpositivo = periodoImpositivo;
           this.contraparte = contraparte;
           this.claveOperacion = claveOperacion;
           this.estadoRegistro = estadoRegistro;
           this.codigoErrorRegistro = codigoErrorRegistro;
           this.descripcionErrorRegistro = descripcionErrorRegistro;
           this.CSV = CSV;
    }


    /**
     * Gets the periodoImpositivo value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @return periodoImpositivo
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaOperacionesSegurosBajaTypePeriodoImpositivo getPeriodoImpositivo() {
        return periodoImpositivo;
    }


    /**
     * Sets the periodoImpositivo value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @param periodoImpositivo
     */
    public void setPeriodoImpositivo(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaOperacionesSegurosBajaTypePeriodoImpositivo periodoImpositivo) {
        this.periodoImpositivo = periodoImpositivo;
    }


    /**
     * Gets the contraparte value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @return contraparte   * Permite identificar la factura línea del suministro a la que
     * se refiere la respuesta.
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType getContraparte() {
        return contraparte;
    }


    /**
     * Sets the contraparte value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @param contraparte   * Permite identificar la factura línea del suministro a la que
     * se refiere la respuesta.
     */
    public void setContraparte(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte) {
        this.contraparte = contraparte;
    }


    /**
     * Gets the claveOperacion value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @return claveOperacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType getClaveOperacion() {
        return claveOperacion;
    }


    /**
     * Sets the claveOperacion value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @param claveOperacion
     */
    public void setClaveOperacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveOperacionType claveOperacion) {
        this.claveOperacion = claveOperacion;
    }


    /**
     * Gets the estadoRegistro value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @return estadoRegistro   * Estado del registro. Correcto, erróneo o aceptado con errores
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoRegistroType getEstadoRegistro() {
        return estadoRegistro;
    }


    /**
     * Sets the estadoRegistro value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @param estadoRegistro   * Estado del registro. Correcto, erróneo o aceptado con errores
     */
    public void setEstadoRegistro(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoRegistroType estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }


    /**
     * Gets the codigoErrorRegistro value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @return codigoErrorRegistro   * Código del error de registro, en su caso.
     */
    public java.math.BigInteger getCodigoErrorRegistro() {
        return codigoErrorRegistro;
    }


    /**
     * Sets the codigoErrorRegistro value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @param codigoErrorRegistro   * Código del error de registro, en su caso.
     */
    public void setCodigoErrorRegistro(java.math.BigInteger codigoErrorRegistro) {
        this.codigoErrorRegistro = codigoErrorRegistro;
    }


    /**
     * Gets the descripcionErrorRegistro value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @return descripcionErrorRegistro   * Descripción detallada del error de registro, en su caso.
     */
    public java.lang.String getDescripcionErrorRegistro() {
        return descripcionErrorRegistro;
    }


    /**
     * Sets the descripcionErrorRegistro value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @param descripcionErrorRegistro   * Descripción detallada del error de registro, en su caso.
     */
    public void setDescripcionErrorRegistro(java.lang.String descripcionErrorRegistro) {
        this.descripcionErrorRegistro = descripcionErrorRegistro;
    }


    /**
     * Gets the CSV value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @return CSV   * CSV asociado al registro. Solo se suministra si el registro
     * es rechazado porque ya está dada de baja
     */
    public java.lang.String getCSV() {
        return CSV;
    }


    /**
     * Sets the CSV value for this RespuestaOperacionesSegurosBajaType.
     * 
     * @param CSV   * CSV asociado al registro. Solo se suministra si el registro
     * es rechazado porque ya está dada de baja
     */
    public void setCSV(java.lang.String CSV) {
        this.CSV = CSV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaOperacionesSegurosBajaType)) return false;
        RespuestaOperacionesSegurosBajaType other = (RespuestaOperacionesSegurosBajaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.periodoImpositivo==null && other.getPeriodoImpositivo()==null) || 
             (this.periodoImpositivo!=null &&
              this.periodoImpositivo.equals(other.getPeriodoImpositivo()))) &&
            ((this.contraparte==null && other.getContraparte()==null) || 
             (this.contraparte!=null &&
              this.contraparte.equals(other.getContraparte()))) &&
            ((this.claveOperacion==null && other.getClaveOperacion()==null) || 
             (this.claveOperacion!=null &&
              this.claveOperacion.equals(other.getClaveOperacion()))) &&
            ((this.estadoRegistro==null && other.getEstadoRegistro()==null) || 
             (this.estadoRegistro!=null &&
              this.estadoRegistro.equals(other.getEstadoRegistro()))) &&
            ((this.codigoErrorRegistro==null && other.getCodigoErrorRegistro()==null) || 
             (this.codigoErrorRegistro!=null &&
              this.codigoErrorRegistro.equals(other.getCodigoErrorRegistro()))) &&
            ((this.descripcionErrorRegistro==null && other.getDescripcionErrorRegistro()==null) || 
             (this.descripcionErrorRegistro!=null &&
              this.descripcionErrorRegistro.equals(other.getDescripcionErrorRegistro()))) &&
            ((this.CSV==null && other.getCSV()==null) || 
             (this.CSV!=null &&
              this.CSV.equals(other.getCSV())));
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
        if (getPeriodoImpositivo() != null) {
            _hashCode += getPeriodoImpositivo().hashCode();
        }
        if (getContraparte() != null) {
            _hashCode += getContraparte().hashCode();
        }
        if (getClaveOperacion() != null) {
            _hashCode += getClaveOperacion().hashCode();
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
        if (getCSV() != null) {
            _hashCode += getCSV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaOperacionesSegurosBajaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaOperacionesSegurosBajaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoImpositivo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "PeriodoImpositivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", ">RespuestaOperacionesSegurosBajaType>PeriodoImpositivo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contraparte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "Contraparte"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "PersonaFisicaJuridicaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "ClaveOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ClaveOperacionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "EstadoRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "EstadoRegistroType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoErrorRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "CodigoErrorRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionErrorRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "DescripcionErrorRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSV");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "CSV"));
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
