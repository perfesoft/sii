/**
 * DatosPresentacion2Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class DatosPresentacion2Type  implements java.io.Serializable {
    private java.lang.String NIFPresentador;

    private java.lang.String timestampPresentacion;

    /* CSV asociado al registro */
    private java.lang.String CSV;

    public DatosPresentacion2Type() {
    }

    public DatosPresentacion2Type(
           java.lang.String NIFPresentador,
           java.lang.String timestampPresentacion,
           java.lang.String CSV) {
           this.NIFPresentador = NIFPresentador;
           this.timestampPresentacion = timestampPresentacion;
           this.CSV = CSV;
    }


    /**
     * Gets the NIFPresentador value for this DatosPresentacion2Type.
     * 
     * @return NIFPresentador
     */
    public java.lang.String getNIFPresentador() {
        return NIFPresentador;
    }


    /**
     * Sets the NIFPresentador value for this DatosPresentacion2Type.
     * 
     * @param NIFPresentador
     */
    public void setNIFPresentador(java.lang.String NIFPresentador) {
        this.NIFPresentador = NIFPresentador;
    }


    /**
     * Gets the timestampPresentacion value for this DatosPresentacion2Type.
     * 
     * @return timestampPresentacion
     */
    public java.lang.String getTimestampPresentacion() {
        return timestampPresentacion;
    }


    /**
     * Sets the timestampPresentacion value for this DatosPresentacion2Type.
     * 
     * @param timestampPresentacion
     */
    public void setTimestampPresentacion(java.lang.String timestampPresentacion) {
        this.timestampPresentacion = timestampPresentacion;
    }


    /**
     * Gets the CSV value for this DatosPresentacion2Type.
     * 
     * @return CSV   * CSV asociado al registro
     */
    public java.lang.String getCSV() {
        return CSV;
    }


    /**
     * Sets the CSV value for this DatosPresentacion2Type.
     * 
     * @param CSV   * CSV asociado al registro
     */
    public void setCSV(java.lang.String CSV) {
        this.CSV = CSV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosPresentacion2Type)) return false;
        DatosPresentacion2Type other = (DatosPresentacion2Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NIFPresentador==null && other.getNIFPresentador()==null) || 
             (this.NIFPresentador!=null &&
              this.NIFPresentador.equals(other.getNIFPresentador()))) &&
            ((this.timestampPresentacion==null && other.getTimestampPresentacion()==null) || 
             (this.timestampPresentacion!=null &&
              this.timestampPresentacion.equals(other.getTimestampPresentacion()))) &&
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
        if (getNIFPresentador() != null) {
            _hashCode += getNIFPresentador().hashCode();
        }
        if (getTimestampPresentacion() != null) {
            _hashCode += getTimestampPresentacion().hashCode();
        }
        if (getCSV() != null) {
            _hashCode += getCSV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosPresentacion2Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DatosPresentacion2Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIFPresentador");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "NIFPresentador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestampPresentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "TimestampPresentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSV");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CSV"));
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
