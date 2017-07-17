/**
 * RespuestaComunitariaBajaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd;


/**
 * Respuesta a un envío Sii
 */
public class RespuestaComunitariaBajaType  implements java.io.Serializable {
    /* Contraparte */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaComunitariaType IDFactura;

    /* Estado del registro. Correcto, erróneo o aceptado con errores */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoRegistroType estadoRegistro;

    /* Código del error de registro, en su caso. */
    private java.math.BigInteger codigoErrorRegistro;

    /* Descripción detallada del error de registro, en su caso. */
    private java.lang.String descripcionErrorRegistro;

    /* CSV asociado a la factura registrada previamente en el sistema.
     * Solo se suministra si la factura es rechazada porque ya está dada
     * de baja */
    private java.lang.String CSV;

    public RespuestaComunitariaBajaType() {
    }

    public RespuestaComunitariaBajaType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaComunitariaType IDFactura,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoRegistroType estadoRegistro,
           java.math.BigInteger codigoErrorRegistro,
           java.lang.String descripcionErrorRegistro,
           java.lang.String CSV) {
           this.IDFactura = IDFactura;
           this.estadoRegistro = estadoRegistro;
           this.codigoErrorRegistro = codigoErrorRegistro;
           this.descripcionErrorRegistro = descripcionErrorRegistro;
           this.CSV = CSV;
    }


    /**
     * Gets the IDFactura value for this RespuestaComunitariaBajaType.
     * 
     * @return IDFactura   * Contraparte
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaComunitariaType getIDFactura() {
        return IDFactura;
    }


    /**
     * Sets the IDFactura value for this RespuestaComunitariaBajaType.
     * 
     * @param IDFactura   * Contraparte
     */
    public void setIDFactura(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaComunitariaType IDFactura) {
        this.IDFactura = IDFactura;
    }


    /**
     * Gets the estadoRegistro value for this RespuestaComunitariaBajaType.
     * 
     * @return estadoRegistro   * Estado del registro. Correcto, erróneo o aceptado con errores
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoRegistroType getEstadoRegistro() {
        return estadoRegistro;
    }


    /**
     * Sets the estadoRegistro value for this RespuestaComunitariaBajaType.
     * 
     * @param estadoRegistro   * Estado del registro. Correcto, erróneo o aceptado con errores
     */
    public void setEstadoRegistro(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.EstadoRegistroType estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }


    /**
     * Gets the codigoErrorRegistro value for this RespuestaComunitariaBajaType.
     * 
     * @return codigoErrorRegistro   * Código del error de registro, en su caso.
     */
    public java.math.BigInteger getCodigoErrorRegistro() {
        return codigoErrorRegistro;
    }


    /**
     * Sets the codigoErrorRegistro value for this RespuestaComunitariaBajaType.
     * 
     * @param codigoErrorRegistro   * Código del error de registro, en su caso.
     */
    public void setCodigoErrorRegistro(java.math.BigInteger codigoErrorRegistro) {
        this.codigoErrorRegistro = codigoErrorRegistro;
    }


    /**
     * Gets the descripcionErrorRegistro value for this RespuestaComunitariaBajaType.
     * 
     * @return descripcionErrorRegistro   * Descripción detallada del error de registro, en su caso.
     */
    public java.lang.String getDescripcionErrorRegistro() {
        return descripcionErrorRegistro;
    }


    /**
     * Sets the descripcionErrorRegistro value for this RespuestaComunitariaBajaType.
     * 
     * @param descripcionErrorRegistro   * Descripción detallada del error de registro, en su caso.
     */
    public void setDescripcionErrorRegistro(java.lang.String descripcionErrorRegistro) {
        this.descripcionErrorRegistro = descripcionErrorRegistro;
    }


    /**
     * Gets the CSV value for this RespuestaComunitariaBajaType.
     * 
     * @return CSV   * CSV asociado a la factura registrada previamente en el sistema.
     * Solo se suministra si la factura es rechazada porque ya está dada
     * de baja
     */
    public java.lang.String getCSV() {
        return CSV;
    }


    /**
     * Sets the CSV value for this RespuestaComunitariaBajaType.
     * 
     * @param CSV   * CSV asociado a la factura registrada previamente en el sistema.
     * Solo se suministra si la factura es rechazada porque ya está dada
     * de baja
     */
    public void setCSV(java.lang.String CSV) {
        this.CSV = CSV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaComunitariaBajaType)) return false;
        RespuestaComunitariaBajaType other = (RespuestaComunitariaBajaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDFactura==null && other.getIDFactura()==null) || 
             (this.IDFactura!=null &&
              this.IDFactura.equals(other.getIDFactura()))) &&
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
        if (getIDFactura() != null) {
            _hashCode += getIDFactura().hashCode();
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
        new org.apache.axis.description.TypeDesc(RespuestaComunitariaBajaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaComunitariaBajaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "IDFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDFacturaComunitariaType"));
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
