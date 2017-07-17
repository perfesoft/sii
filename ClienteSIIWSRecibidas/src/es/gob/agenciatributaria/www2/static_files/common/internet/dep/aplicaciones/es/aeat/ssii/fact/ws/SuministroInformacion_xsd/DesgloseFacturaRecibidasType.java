/**
 * DesgloseFacturaRecibidasType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class DesgloseFacturaRecibidasType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVARecibida2Type[] inversionSujetoPasivo;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVARecibidaType[] desgloseIVA;

    public DesgloseFacturaRecibidasType() {
    }

    public DesgloseFacturaRecibidasType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVARecibida2Type[] inversionSujetoPasivo,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVARecibidaType[] desgloseIVA) {
           this.inversionSujetoPasivo = inversionSujetoPasivo;
           this.desgloseIVA = desgloseIVA;
    }


    /**
     * Gets the inversionSujetoPasivo value for this DesgloseFacturaRecibidasType.
     * 
     * @return inversionSujetoPasivo
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVARecibida2Type[] getInversionSujetoPasivo() {
        return inversionSujetoPasivo;
    }


    /**
     * Sets the inversionSujetoPasivo value for this DesgloseFacturaRecibidasType.
     * 
     * @param inversionSujetoPasivo
     */
    public void setInversionSujetoPasivo(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVARecibida2Type[] inversionSujetoPasivo) {
        this.inversionSujetoPasivo = inversionSujetoPasivo;
    }


    /**
     * Gets the desgloseIVA value for this DesgloseFacturaRecibidasType.
     * 
     * @return desgloseIVA
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVARecibidaType[] getDesgloseIVA() {
        return desgloseIVA;
    }


    /**
     * Sets the desgloseIVA value for this DesgloseFacturaRecibidasType.
     * 
     * @param desgloseIVA
     */
    public void setDesgloseIVA(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVARecibidaType[] desgloseIVA) {
        this.desgloseIVA = desgloseIVA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DesgloseFacturaRecibidasType)) return false;
        DesgloseFacturaRecibidasType other = (DesgloseFacturaRecibidasType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inversionSujetoPasivo==null && other.getInversionSujetoPasivo()==null) || 
             (this.inversionSujetoPasivo!=null &&
              java.util.Arrays.equals(this.inversionSujetoPasivo, other.getInversionSujetoPasivo()))) &&
            ((this.desgloseIVA==null && other.getDesgloseIVA()==null) || 
             (this.desgloseIVA!=null &&
              java.util.Arrays.equals(this.desgloseIVA, other.getDesgloseIVA())));
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
        if (getInversionSujetoPasivo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInversionSujetoPasivo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInversionSujetoPasivo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDesgloseIVA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDesgloseIVA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDesgloseIVA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DesgloseFacturaRecibidasType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DesgloseFacturaRecibidasType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inversionSujetoPasivo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "InversionSujetoPasivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DetalleIVARecibida2Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DetalleIVA"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desgloseIVA");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DesgloseIVA"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DetalleIVARecibidaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DetalleIVA"));
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
