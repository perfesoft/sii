/**
 * IDFacturaRecibidaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;


/**
 * Datos de identificación de factura
 */
public class IDFacturaRecibidaType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaRecibidaTypeIDEmisorFactura IDEmisorFactura;

    /* Nº Serie+Nº Factura de la Factura del Emisor. En caso de asientos
     * resúmenes número inicial de factura */
    private java.lang.String numSerieFacturaEmisor;

    /* Campo específico para asientos resumen. Se corresponde con
     * el Nº Serie+Nº Factura de la última factura */
    private java.lang.String numSerieFacturaEmisorResumenFin;

    /* Fecha de emisión de la factura */
    private java.lang.String fechaExpedicionFacturaEmisor;

    public IDFacturaRecibidaType() {
    }

    public IDFacturaRecibidaType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaRecibidaTypeIDEmisorFactura IDEmisorFactura,
           java.lang.String numSerieFacturaEmisor,
           java.lang.String numSerieFacturaEmisorResumenFin,
           java.lang.String fechaExpedicionFacturaEmisor) {
           this.IDEmisorFactura = IDEmisorFactura;
           this.numSerieFacturaEmisor = numSerieFacturaEmisor;
           this.numSerieFacturaEmisorResumenFin = numSerieFacturaEmisorResumenFin;
           this.fechaExpedicionFacturaEmisor = fechaExpedicionFacturaEmisor;
    }


    /**
     * Gets the IDEmisorFactura value for this IDFacturaRecibidaType.
     * 
     * @return IDEmisorFactura
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaRecibidaTypeIDEmisorFactura getIDEmisorFactura() {
        return IDEmisorFactura;
    }


    /**
     * Sets the IDEmisorFactura value for this IDFacturaRecibidaType.
     * 
     * @param IDEmisorFactura
     */
    public void setIDEmisorFactura(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaRecibidaTypeIDEmisorFactura IDEmisorFactura) {
        this.IDEmisorFactura = IDEmisorFactura;
    }


    /**
     * Gets the numSerieFacturaEmisor value for this IDFacturaRecibidaType.
     * 
     * @return numSerieFacturaEmisor   * Nº Serie+Nº Factura de la Factura del Emisor. En caso de asientos
     * resúmenes número inicial de factura
     */
    public java.lang.String getNumSerieFacturaEmisor() {
        return numSerieFacturaEmisor;
    }


    /**
     * Sets the numSerieFacturaEmisor value for this IDFacturaRecibidaType.
     * 
     * @param numSerieFacturaEmisor   * Nº Serie+Nº Factura de la Factura del Emisor. En caso de asientos
     * resúmenes número inicial de factura
     */
    public void setNumSerieFacturaEmisor(java.lang.String numSerieFacturaEmisor) {
        this.numSerieFacturaEmisor = numSerieFacturaEmisor;
    }


    /**
     * Gets the numSerieFacturaEmisorResumenFin value for this IDFacturaRecibidaType.
     * 
     * @return numSerieFacturaEmisorResumenFin   * Campo específico para asientos resumen. Se corresponde con
     * el Nº Serie+Nº Factura de la última factura
     */
    public java.lang.String getNumSerieFacturaEmisorResumenFin() {
        return numSerieFacturaEmisorResumenFin;
    }


    /**
     * Sets the numSerieFacturaEmisorResumenFin value for this IDFacturaRecibidaType.
     * 
     * @param numSerieFacturaEmisorResumenFin   * Campo específico para asientos resumen. Se corresponde con
     * el Nº Serie+Nº Factura de la última factura
     */
    public void setNumSerieFacturaEmisorResumenFin(java.lang.String numSerieFacturaEmisorResumenFin) {
        this.numSerieFacturaEmisorResumenFin = numSerieFacturaEmisorResumenFin;
    }


    /**
     * Gets the fechaExpedicionFacturaEmisor value for this IDFacturaRecibidaType.
     * 
     * @return fechaExpedicionFacturaEmisor   * Fecha de emisión de la factura
     */
    public java.lang.String getFechaExpedicionFacturaEmisor() {
        return fechaExpedicionFacturaEmisor;
    }


    /**
     * Sets the fechaExpedicionFacturaEmisor value for this IDFacturaRecibidaType.
     * 
     * @param fechaExpedicionFacturaEmisor   * Fecha de emisión de la factura
     */
    public void setFechaExpedicionFacturaEmisor(java.lang.String fechaExpedicionFacturaEmisor) {
        this.fechaExpedicionFacturaEmisor = fechaExpedicionFacturaEmisor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IDFacturaRecibidaType)) return false;
        IDFacturaRecibidaType other = (IDFacturaRecibidaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDEmisorFactura==null && other.getIDEmisorFactura()==null) || 
             (this.IDEmisorFactura!=null &&
              this.IDEmisorFactura.equals(other.getIDEmisorFactura()))) &&
            ((this.numSerieFacturaEmisor==null && other.getNumSerieFacturaEmisor()==null) || 
             (this.numSerieFacturaEmisor!=null &&
              this.numSerieFacturaEmisor.equals(other.getNumSerieFacturaEmisor()))) &&
            ((this.numSerieFacturaEmisorResumenFin==null && other.getNumSerieFacturaEmisorResumenFin()==null) || 
             (this.numSerieFacturaEmisorResumenFin!=null &&
              this.numSerieFacturaEmisorResumenFin.equals(other.getNumSerieFacturaEmisorResumenFin()))) &&
            ((this.fechaExpedicionFacturaEmisor==null && other.getFechaExpedicionFacturaEmisor()==null) || 
             (this.fechaExpedicionFacturaEmisor!=null &&
              this.fechaExpedicionFacturaEmisor.equals(other.getFechaExpedicionFacturaEmisor())));
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
        if (getIDEmisorFactura() != null) {
            _hashCode += getIDEmisorFactura().hashCode();
        }
        if (getNumSerieFacturaEmisor() != null) {
            _hashCode += getNumSerieFacturaEmisor().hashCode();
        }
        if (getNumSerieFacturaEmisorResumenFin() != null) {
            _hashCode += getNumSerieFacturaEmisorResumenFin().hashCode();
        }
        if (getFechaExpedicionFacturaEmisor() != null) {
            _hashCode += getFechaExpedicionFacturaEmisor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IDFacturaRecibidaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDFacturaRecibidaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDEmisorFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDEmisorFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", ">IDFacturaRecibidaType>IDEmisorFactura"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSerieFacturaEmisor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "NumSerieFacturaEmisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSerieFacturaEmisorResumenFin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "NumSerieFacturaEmisorResumenFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaExpedicionFacturaEmisor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "FechaExpedicionFacturaEmisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
