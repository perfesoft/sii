/**
 * DetalleIVAEmitidaPrestacionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class DetalleIVAEmitidaPrestacionType  implements java.io.Serializable {
    private java.lang.String tipoImpositivo;

    private java.lang.String baseImponible;

    private java.lang.String cuotaRepercutida;

    public DetalleIVAEmitidaPrestacionType() {
    }

    public DetalleIVAEmitidaPrestacionType(
           java.lang.String tipoImpositivo,
           java.lang.String baseImponible,
           java.lang.String cuotaRepercutida) {
           this.tipoImpositivo = tipoImpositivo;
           this.baseImponible = baseImponible;
           this.cuotaRepercutida = cuotaRepercutida;
    }


    /**
     * Gets the tipoImpositivo value for this DetalleIVAEmitidaPrestacionType.
     * 
     * @return tipoImpositivo
     */
    public java.lang.String getTipoImpositivo() {
        return tipoImpositivo;
    }


    /**
     * Sets the tipoImpositivo value for this DetalleIVAEmitidaPrestacionType.
     * 
     * @param tipoImpositivo
     */
    public void setTipoImpositivo(java.lang.String tipoImpositivo) {
        this.tipoImpositivo = tipoImpositivo;
    }


    /**
     * Gets the baseImponible value for this DetalleIVAEmitidaPrestacionType.
     * 
     * @return baseImponible
     */
    public java.lang.String getBaseImponible() {
        return baseImponible;
    }


    /**
     * Sets the baseImponible value for this DetalleIVAEmitidaPrestacionType.
     * 
     * @param baseImponible
     */
    public void setBaseImponible(java.lang.String baseImponible) {
        this.baseImponible = baseImponible;
    }


    /**
     * Gets the cuotaRepercutida value for this DetalleIVAEmitidaPrestacionType.
     * 
     * @return cuotaRepercutida
     */
    public java.lang.String getCuotaRepercutida() {
        return cuotaRepercutida;
    }


    /**
     * Sets the cuotaRepercutida value for this DetalleIVAEmitidaPrestacionType.
     * 
     * @param cuotaRepercutida
     */
    public void setCuotaRepercutida(java.lang.String cuotaRepercutida) {
        this.cuotaRepercutida = cuotaRepercutida;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetalleIVAEmitidaPrestacionType)) return false;
        DetalleIVAEmitidaPrestacionType other = (DetalleIVAEmitidaPrestacionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoImpositivo==null && other.getTipoImpositivo()==null) || 
             (this.tipoImpositivo!=null &&
              this.tipoImpositivo.equals(other.getTipoImpositivo()))) &&
            ((this.baseImponible==null && other.getBaseImponible()==null) || 
             (this.baseImponible!=null &&
              this.baseImponible.equals(other.getBaseImponible()))) &&
            ((this.cuotaRepercutida==null && other.getCuotaRepercutida()==null) || 
             (this.cuotaRepercutida!=null &&
              this.cuotaRepercutida.equals(other.getCuotaRepercutida())));
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
        if (getTipoImpositivo() != null) {
            _hashCode += getTipoImpositivo().hashCode();
        }
        if (getBaseImponible() != null) {
            _hashCode += getBaseImponible().hashCode();
        }
        if (getCuotaRepercutida() != null) {
            _hashCode += getCuotaRepercutida().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetalleIVAEmitidaPrestacionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DetalleIVAEmitidaPrestacionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoImpositivo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "TipoImpositivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseImponible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "BaseImponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuotaRepercutida");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CuotaRepercutida"));
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
