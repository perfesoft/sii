/**
 * OperacionIntracomunitariaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;


/**
 * Apunte correspondiente al libro de operaciones intracomunitarias.
 */
public class OperacionIntracomunitariaType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaTypeTipoOperacion tipoOperacion;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaTypeClaveDeclarado claveDeclarado;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CountryMiembroType estadoMiembro;

    private java.lang.String plazoOperacion;

    private java.lang.String descripcionBienes;

    private java.lang.String direccionOperador;

    private java.lang.String facturasODocumentacion;

    public OperacionIntracomunitariaType() {
    }

    public OperacionIntracomunitariaType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaTypeTipoOperacion tipoOperacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaTypeClaveDeclarado claveDeclarado,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CountryMiembroType estadoMiembro,
           java.lang.String plazoOperacion,
           java.lang.String descripcionBienes,
           java.lang.String direccionOperador,
           java.lang.String facturasODocumentacion) {
           this.tipoOperacion = tipoOperacion;
           this.claveDeclarado = claveDeclarado;
           this.estadoMiembro = estadoMiembro;
           this.plazoOperacion = plazoOperacion;
           this.descripcionBienes = descripcionBienes;
           this.direccionOperador = direccionOperador;
           this.facturasODocumentacion = facturasODocumentacion;
    }


    /**
     * Gets the tipoOperacion value for this OperacionIntracomunitariaType.
     * 
     * @return tipoOperacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaTypeTipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }


    /**
     * Sets the tipoOperacion value for this OperacionIntracomunitariaType.
     * 
     * @param tipoOperacion
     */
    public void setTipoOperacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaTypeTipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }


    /**
     * Gets the claveDeclarado value for this OperacionIntracomunitariaType.
     * 
     * @return claveDeclarado
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaTypeClaveDeclarado getClaveDeclarado() {
        return claveDeclarado;
    }


    /**
     * Sets the claveDeclarado value for this OperacionIntracomunitariaType.
     * 
     * @param claveDeclarado
     */
    public void setClaveDeclarado(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaTypeClaveDeclarado claveDeclarado) {
        this.claveDeclarado = claveDeclarado;
    }


    /**
     * Gets the estadoMiembro value for this OperacionIntracomunitariaType.
     * 
     * @return estadoMiembro
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CountryMiembroType getEstadoMiembro() {
        return estadoMiembro;
    }


    /**
     * Sets the estadoMiembro value for this OperacionIntracomunitariaType.
     * 
     * @param estadoMiembro
     */
    public void setEstadoMiembro(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CountryMiembroType estadoMiembro) {
        this.estadoMiembro = estadoMiembro;
    }


    /**
     * Gets the plazoOperacion value for this OperacionIntracomunitariaType.
     * 
     * @return plazoOperacion
     */
    public java.lang.String getPlazoOperacion() {
        return plazoOperacion;
    }


    /**
     * Sets the plazoOperacion value for this OperacionIntracomunitariaType.
     * 
     * @param plazoOperacion
     */
    public void setPlazoOperacion(java.lang.String plazoOperacion) {
        this.plazoOperacion = plazoOperacion;
    }


    /**
     * Gets the descripcionBienes value for this OperacionIntracomunitariaType.
     * 
     * @return descripcionBienes
     */
    public java.lang.String getDescripcionBienes() {
        return descripcionBienes;
    }


    /**
     * Sets the descripcionBienes value for this OperacionIntracomunitariaType.
     * 
     * @param descripcionBienes
     */
    public void setDescripcionBienes(java.lang.String descripcionBienes) {
        this.descripcionBienes = descripcionBienes;
    }


    /**
     * Gets the direccionOperador value for this OperacionIntracomunitariaType.
     * 
     * @return direccionOperador
     */
    public java.lang.String getDireccionOperador() {
        return direccionOperador;
    }


    /**
     * Sets the direccionOperador value for this OperacionIntracomunitariaType.
     * 
     * @param direccionOperador
     */
    public void setDireccionOperador(java.lang.String direccionOperador) {
        this.direccionOperador = direccionOperador;
    }


    /**
     * Gets the facturasODocumentacion value for this OperacionIntracomunitariaType.
     * 
     * @return facturasODocumentacion
     */
    public java.lang.String getFacturasODocumentacion() {
        return facturasODocumentacion;
    }


    /**
     * Sets the facturasODocumentacion value for this OperacionIntracomunitariaType.
     * 
     * @param facturasODocumentacion
     */
    public void setFacturasODocumentacion(java.lang.String facturasODocumentacion) {
        this.facturasODocumentacion = facturasODocumentacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperacionIntracomunitariaType)) return false;
        OperacionIntracomunitariaType other = (OperacionIntracomunitariaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoOperacion==null && other.getTipoOperacion()==null) || 
             (this.tipoOperacion!=null &&
              this.tipoOperacion.equals(other.getTipoOperacion()))) &&
            ((this.claveDeclarado==null && other.getClaveDeclarado()==null) || 
             (this.claveDeclarado!=null &&
              this.claveDeclarado.equals(other.getClaveDeclarado()))) &&
            ((this.estadoMiembro==null && other.getEstadoMiembro()==null) || 
             (this.estadoMiembro!=null &&
              this.estadoMiembro.equals(other.getEstadoMiembro()))) &&
            ((this.plazoOperacion==null && other.getPlazoOperacion()==null) || 
             (this.plazoOperacion!=null &&
              this.plazoOperacion.equals(other.getPlazoOperacion()))) &&
            ((this.descripcionBienes==null && other.getDescripcionBienes()==null) || 
             (this.descripcionBienes!=null &&
              this.descripcionBienes.equals(other.getDescripcionBienes()))) &&
            ((this.direccionOperador==null && other.getDireccionOperador()==null) || 
             (this.direccionOperador!=null &&
              this.direccionOperador.equals(other.getDireccionOperador()))) &&
            ((this.facturasODocumentacion==null && other.getFacturasODocumentacion()==null) || 
             (this.facturasODocumentacion!=null &&
              this.facturasODocumentacion.equals(other.getFacturasODocumentacion())));
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
        if (getTipoOperacion() != null) {
            _hashCode += getTipoOperacion().hashCode();
        }
        if (getClaveDeclarado() != null) {
            _hashCode += getClaveDeclarado().hashCode();
        }
        if (getEstadoMiembro() != null) {
            _hashCode += getEstadoMiembro().hashCode();
        }
        if (getPlazoOperacion() != null) {
            _hashCode += getPlazoOperacion().hashCode();
        }
        if (getDescripcionBienes() != null) {
            _hashCode += getDescripcionBienes().hashCode();
        }
        if (getDireccionOperador() != null) {
            _hashCode += getDireccionOperador().hashCode();
        }
        if (getFacturasODocumentacion() != null) {
            _hashCode += getFacturasODocumentacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperacionIntracomunitariaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "OperacionIntracomunitariaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "TipoOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", ">OperacionIntracomunitariaType>TipoOperacion"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveDeclarado");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ClaveDeclarado"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", ">OperacionIntracomunitariaType>ClaveDeclarado"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoMiembro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "EstadoMiembro"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CountryMiembroType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plazoOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "PlazoOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionBienes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DescripcionBienes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DireccionOperador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facturasODocumentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "FacturasODocumentacion"));
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
