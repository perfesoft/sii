/**
 * BienDeInversionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;


/**
 * Apunte correspondiente al libro de bienes de inversion.
 */
public class BienDeInversionType  implements java.io.Serializable {
    private java.lang.String identificacionBien;

    private java.lang.String fechaInicioUtilizacion;

    private java.lang.String prorrataAnualDefinitiva;

    private java.lang.String regularizacionAnualDeduccion;

    private java.lang.String identificacionEntrega;

    private java.lang.String regularizacionDeduccionEfectuada;

    public BienDeInversionType() {
    }

    public BienDeInversionType(
           java.lang.String identificacionBien,
           java.lang.String fechaInicioUtilizacion,
           java.lang.String prorrataAnualDefinitiva,
           java.lang.String regularizacionAnualDeduccion,
           java.lang.String identificacionEntrega,
           java.lang.String regularizacionDeduccionEfectuada) {
           this.identificacionBien = identificacionBien;
           this.fechaInicioUtilizacion = fechaInicioUtilizacion;
           this.prorrataAnualDefinitiva = prorrataAnualDefinitiva;
           this.regularizacionAnualDeduccion = regularizacionAnualDeduccion;
           this.identificacionEntrega = identificacionEntrega;
           this.regularizacionDeduccionEfectuada = regularizacionDeduccionEfectuada;
    }


    /**
     * Gets the identificacionBien value for this BienDeInversionType.
     * 
     * @return identificacionBien
     */
    public java.lang.String getIdentificacionBien() {
        return identificacionBien;
    }


    /**
     * Sets the identificacionBien value for this BienDeInversionType.
     * 
     * @param identificacionBien
     */
    public void setIdentificacionBien(java.lang.String identificacionBien) {
        this.identificacionBien = identificacionBien;
    }


    /**
     * Gets the fechaInicioUtilizacion value for this BienDeInversionType.
     * 
     * @return fechaInicioUtilizacion
     */
    public java.lang.String getFechaInicioUtilizacion() {
        return fechaInicioUtilizacion;
    }


    /**
     * Sets the fechaInicioUtilizacion value for this BienDeInversionType.
     * 
     * @param fechaInicioUtilizacion
     */
    public void setFechaInicioUtilizacion(java.lang.String fechaInicioUtilizacion) {
        this.fechaInicioUtilizacion = fechaInicioUtilizacion;
    }


    /**
     * Gets the prorrataAnualDefinitiva value for this BienDeInversionType.
     * 
     * @return prorrataAnualDefinitiva
     */
    public java.lang.String getProrrataAnualDefinitiva() {
        return prorrataAnualDefinitiva;
    }


    /**
     * Sets the prorrataAnualDefinitiva value for this BienDeInversionType.
     * 
     * @param prorrataAnualDefinitiva
     */
    public void setProrrataAnualDefinitiva(java.lang.String prorrataAnualDefinitiva) {
        this.prorrataAnualDefinitiva = prorrataAnualDefinitiva;
    }


    /**
     * Gets the regularizacionAnualDeduccion value for this BienDeInversionType.
     * 
     * @return regularizacionAnualDeduccion
     */
    public java.lang.String getRegularizacionAnualDeduccion() {
        return regularizacionAnualDeduccion;
    }


    /**
     * Sets the regularizacionAnualDeduccion value for this BienDeInversionType.
     * 
     * @param regularizacionAnualDeduccion
     */
    public void setRegularizacionAnualDeduccion(java.lang.String regularizacionAnualDeduccion) {
        this.regularizacionAnualDeduccion = regularizacionAnualDeduccion;
    }


    /**
     * Gets the identificacionEntrega value for this BienDeInversionType.
     * 
     * @return identificacionEntrega
     */
    public java.lang.String getIdentificacionEntrega() {
        return identificacionEntrega;
    }


    /**
     * Sets the identificacionEntrega value for this BienDeInversionType.
     * 
     * @param identificacionEntrega
     */
    public void setIdentificacionEntrega(java.lang.String identificacionEntrega) {
        this.identificacionEntrega = identificacionEntrega;
    }


    /**
     * Gets the regularizacionDeduccionEfectuada value for this BienDeInversionType.
     * 
     * @return regularizacionDeduccionEfectuada
     */
    public java.lang.String getRegularizacionDeduccionEfectuada() {
        return regularizacionDeduccionEfectuada;
    }


    /**
     * Sets the regularizacionDeduccionEfectuada value for this BienDeInversionType.
     * 
     * @param regularizacionDeduccionEfectuada
     */
    public void setRegularizacionDeduccionEfectuada(java.lang.String regularizacionDeduccionEfectuada) {
        this.regularizacionDeduccionEfectuada = regularizacionDeduccionEfectuada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BienDeInversionType)) return false;
        BienDeInversionType other = (BienDeInversionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificacionBien==null && other.getIdentificacionBien()==null) || 
             (this.identificacionBien!=null &&
              this.identificacionBien.equals(other.getIdentificacionBien()))) &&
            ((this.fechaInicioUtilizacion==null && other.getFechaInicioUtilizacion()==null) || 
             (this.fechaInicioUtilizacion!=null &&
              this.fechaInicioUtilizacion.equals(other.getFechaInicioUtilizacion()))) &&
            ((this.prorrataAnualDefinitiva==null && other.getProrrataAnualDefinitiva()==null) || 
             (this.prorrataAnualDefinitiva!=null &&
              this.prorrataAnualDefinitiva.equals(other.getProrrataAnualDefinitiva()))) &&
            ((this.regularizacionAnualDeduccion==null && other.getRegularizacionAnualDeduccion()==null) || 
             (this.regularizacionAnualDeduccion!=null &&
              this.regularizacionAnualDeduccion.equals(other.getRegularizacionAnualDeduccion()))) &&
            ((this.identificacionEntrega==null && other.getIdentificacionEntrega()==null) || 
             (this.identificacionEntrega!=null &&
              this.identificacionEntrega.equals(other.getIdentificacionEntrega()))) &&
            ((this.regularizacionDeduccionEfectuada==null && other.getRegularizacionDeduccionEfectuada()==null) || 
             (this.regularizacionDeduccionEfectuada!=null &&
              this.regularizacionDeduccionEfectuada.equals(other.getRegularizacionDeduccionEfectuada())));
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
        if (getIdentificacionBien() != null) {
            _hashCode += getIdentificacionBien().hashCode();
        }
        if (getFechaInicioUtilizacion() != null) {
            _hashCode += getFechaInicioUtilizacion().hashCode();
        }
        if (getProrrataAnualDefinitiva() != null) {
            _hashCode += getProrrataAnualDefinitiva().hashCode();
        }
        if (getRegularizacionAnualDeduccion() != null) {
            _hashCode += getRegularizacionAnualDeduccion().hashCode();
        }
        if (getIdentificacionEntrega() != null) {
            _hashCode += getIdentificacionEntrega().hashCode();
        }
        if (getRegularizacionDeduccionEfectuada() != null) {
            _hashCode += getRegularizacionDeduccionEfectuada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BienDeInversionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "BienDeInversionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionBien");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IdentificacionBien"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicioUtilizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "FechaInicioUtilizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prorrataAnualDefinitiva");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ProrrataAnualDefinitiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regularizacionAnualDeduccion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "RegularizacionAnualDeduccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IdentificacionEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regularizacionDeduccionEfectuada");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "RegularizacionDeduccionEfectuada"));
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
