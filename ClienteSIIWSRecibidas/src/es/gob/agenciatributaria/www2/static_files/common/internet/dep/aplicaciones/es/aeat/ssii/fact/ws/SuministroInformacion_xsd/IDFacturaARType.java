/**
 * IDFacturaARType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;


/**
 * Datos de identificación de factura agrupada o rectificada. El NIF
 * se cogerá del NIF indicado en el bloque IDFactura
 */
public class IDFacturaARType  implements java.io.Serializable {
    /* Nº Serie+Nº Factura de la factura */
    private java.lang.String numSerieFacturaEmisor;

    /* Fecha de emisión de la factura agrupada o rectificada */
    private java.lang.String fechaExpedicionFacturaEmisor;

    public IDFacturaARType() {
    }

    public IDFacturaARType(
           java.lang.String numSerieFacturaEmisor,
           java.lang.String fechaExpedicionFacturaEmisor) {
           this.numSerieFacturaEmisor = numSerieFacturaEmisor;
           this.fechaExpedicionFacturaEmisor = fechaExpedicionFacturaEmisor;
    }


    /**
     * Gets the numSerieFacturaEmisor value for this IDFacturaARType.
     * 
     * @return numSerieFacturaEmisor   * Nº Serie+Nº Factura de la factura
     */
    public java.lang.String getNumSerieFacturaEmisor() {
        return numSerieFacturaEmisor;
    }


    /**
     * Sets the numSerieFacturaEmisor value for this IDFacturaARType.
     * 
     * @param numSerieFacturaEmisor   * Nº Serie+Nº Factura de la factura
     */
    public void setNumSerieFacturaEmisor(java.lang.String numSerieFacturaEmisor) {
        this.numSerieFacturaEmisor = numSerieFacturaEmisor;
    }


    /**
     * Gets the fechaExpedicionFacturaEmisor value for this IDFacturaARType.
     * 
     * @return fechaExpedicionFacturaEmisor   * Fecha de emisión de la factura agrupada o rectificada
     */
    public java.lang.String getFechaExpedicionFacturaEmisor() {
        return fechaExpedicionFacturaEmisor;
    }


    /**
     * Sets the fechaExpedicionFacturaEmisor value for this IDFacturaARType.
     * 
     * @param fechaExpedicionFacturaEmisor   * Fecha de emisión de la factura agrupada o rectificada
     */
    public void setFechaExpedicionFacturaEmisor(java.lang.String fechaExpedicionFacturaEmisor) {
        this.fechaExpedicionFacturaEmisor = fechaExpedicionFacturaEmisor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IDFacturaARType)) return false;
        IDFacturaARType other = (IDFacturaARType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numSerieFacturaEmisor==null && other.getNumSerieFacturaEmisor()==null) || 
             (this.numSerieFacturaEmisor!=null &&
              this.numSerieFacturaEmisor.equals(other.getNumSerieFacturaEmisor()))) &&
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
        if (getNumSerieFacturaEmisor() != null) {
            _hashCode += getNumSerieFacturaEmisor().hashCode();
        }
        if (getFechaExpedicionFacturaEmisor() != null) {
            _hashCode += getFechaExpedicionFacturaEmisor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IDFacturaARType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDFacturaARType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSerieFacturaEmisor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "NumSerieFacturaEmisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
