/**
 * DesgloseRectificacionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;


/**
 * Desglose de Base y Cuota sustituida en las Facturas Rectificativas
 * sustitutivas
 */
public class DesgloseRectificacionType  implements java.io.Serializable {
    private java.lang.String baseRectificada;

    private java.lang.String cuotaRectificada;

    private java.lang.String cuotaRecargoRectificado;

    public DesgloseRectificacionType() {
    }

    public DesgloseRectificacionType(
           java.lang.String baseRectificada,
           java.lang.String cuotaRectificada,
           java.lang.String cuotaRecargoRectificado) {
           this.baseRectificada = baseRectificada;
           this.cuotaRectificada = cuotaRectificada;
           this.cuotaRecargoRectificado = cuotaRecargoRectificado;
    }


    /**
     * Gets the baseRectificada value for this DesgloseRectificacionType.
     * 
     * @return baseRectificada
     */
    public java.lang.String getBaseRectificada() {
        return baseRectificada;
    }


    /**
     * Sets the baseRectificada value for this DesgloseRectificacionType.
     * 
     * @param baseRectificada
     */
    public void setBaseRectificada(java.lang.String baseRectificada) {
        this.baseRectificada = baseRectificada;
    }


    /**
     * Gets the cuotaRectificada value for this DesgloseRectificacionType.
     * 
     * @return cuotaRectificada
     */
    public java.lang.String getCuotaRectificada() {
        return cuotaRectificada;
    }


    /**
     * Sets the cuotaRectificada value for this DesgloseRectificacionType.
     * 
     * @param cuotaRectificada
     */
    public void setCuotaRectificada(java.lang.String cuotaRectificada) {
        this.cuotaRectificada = cuotaRectificada;
    }


    /**
     * Gets the cuotaRecargoRectificado value for this DesgloseRectificacionType.
     * 
     * @return cuotaRecargoRectificado
     */
    public java.lang.String getCuotaRecargoRectificado() {
        return cuotaRecargoRectificado;
    }


    /**
     * Sets the cuotaRecargoRectificado value for this DesgloseRectificacionType.
     * 
     * @param cuotaRecargoRectificado
     */
    public void setCuotaRecargoRectificado(java.lang.String cuotaRecargoRectificado) {
        this.cuotaRecargoRectificado = cuotaRecargoRectificado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DesgloseRectificacionType)) return false;
        DesgloseRectificacionType other = (DesgloseRectificacionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseRectificada==null && other.getBaseRectificada()==null) || 
             (this.baseRectificada!=null &&
              this.baseRectificada.equals(other.getBaseRectificada()))) &&
            ((this.cuotaRectificada==null && other.getCuotaRectificada()==null) || 
             (this.cuotaRectificada!=null &&
              this.cuotaRectificada.equals(other.getCuotaRectificada()))) &&
            ((this.cuotaRecargoRectificado==null && other.getCuotaRecargoRectificado()==null) || 
             (this.cuotaRecargoRectificado!=null &&
              this.cuotaRecargoRectificado.equals(other.getCuotaRecargoRectificado())));
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
        if (getBaseRectificada() != null) {
            _hashCode += getBaseRectificada().hashCode();
        }
        if (getCuotaRectificada() != null) {
            _hashCode += getCuotaRectificada().hashCode();
        }
        if (getCuotaRecargoRectificado() != null) {
            _hashCode += getCuotaRecargoRectificado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DesgloseRectificacionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DesgloseRectificacionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRectificada");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "BaseRectificada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuotaRectificada");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CuotaRectificada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuotaRecargoRectificado");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CuotaRecargoRectificado"));
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
