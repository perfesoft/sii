/**
 * NoSujetaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class NoSujetaType  implements java.io.Serializable {
    private java.lang.String importePorArticulos7_14_Otros;

    private java.lang.String importeTAIReglasLocalizacion;

    public NoSujetaType() {
    }

    public NoSujetaType(
           java.lang.String importePorArticulos7_14_Otros,
           java.lang.String importeTAIReglasLocalizacion) {
           this.importePorArticulos7_14_Otros = importePorArticulos7_14_Otros;
           this.importeTAIReglasLocalizacion = importeTAIReglasLocalizacion;
    }


    /**
     * Gets the importePorArticulos7_14_Otros value for this NoSujetaType.
     * 
     * @return importePorArticulos7_14_Otros
     */
    public java.lang.String getImportePorArticulos7_14_Otros() {
        return importePorArticulos7_14_Otros;
    }


    /**
     * Sets the importePorArticulos7_14_Otros value for this NoSujetaType.
     * 
     * @param importePorArticulos7_14_Otros
     */
    public void setImportePorArticulos7_14_Otros(java.lang.String importePorArticulos7_14_Otros) {
        this.importePorArticulos7_14_Otros = importePorArticulos7_14_Otros;
    }


    /**
     * Gets the importeTAIReglasLocalizacion value for this NoSujetaType.
     * 
     * @return importeTAIReglasLocalizacion
     */
    public java.lang.String getImporteTAIReglasLocalizacion() {
        return importeTAIReglasLocalizacion;
    }


    /**
     * Sets the importeTAIReglasLocalizacion value for this NoSujetaType.
     * 
     * @param importeTAIReglasLocalizacion
     */
    public void setImporteTAIReglasLocalizacion(java.lang.String importeTAIReglasLocalizacion) {
        this.importeTAIReglasLocalizacion = importeTAIReglasLocalizacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NoSujetaType)) return false;
        NoSujetaType other = (NoSujetaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.importePorArticulos7_14_Otros==null && other.getImportePorArticulos7_14_Otros()==null) || 
             (this.importePorArticulos7_14_Otros!=null &&
              this.importePorArticulos7_14_Otros.equals(other.getImportePorArticulos7_14_Otros()))) &&
            ((this.importeTAIReglasLocalizacion==null && other.getImporteTAIReglasLocalizacion()==null) || 
             (this.importeTAIReglasLocalizacion!=null &&
              this.importeTAIReglasLocalizacion.equals(other.getImporteTAIReglasLocalizacion())));
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
        if (getImportePorArticulos7_14_Otros() != null) {
            _hashCode += getImportePorArticulos7_14_Otros().hashCode();
        }
        if (getImporteTAIReglasLocalizacion() != null) {
            _hashCode += getImporteTAIReglasLocalizacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NoSujetaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "NoSujetaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importePorArticulos7_14_Otros");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ImportePorArticulos7_14_Otros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importeTAIReglasLocalizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ImporteTAIReglasLocalizacion"));
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
