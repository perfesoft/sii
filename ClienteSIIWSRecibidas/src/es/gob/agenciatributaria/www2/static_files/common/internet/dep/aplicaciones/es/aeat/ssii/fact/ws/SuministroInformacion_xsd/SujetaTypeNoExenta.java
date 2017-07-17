/**
 * SujetaTypeNoExenta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class SujetaTypeNoExenta  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoOperacionSujetaNoExentaType tipoNoExenta;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVAEmitidaType[] desgloseIVA;

    public SujetaTypeNoExenta() {
    }

    public SujetaTypeNoExenta(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoOperacionSujetaNoExentaType tipoNoExenta,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVAEmitidaType[] desgloseIVA) {
           this.tipoNoExenta = tipoNoExenta;
           this.desgloseIVA = desgloseIVA;
    }


    /**
     * Gets the tipoNoExenta value for this SujetaTypeNoExenta.
     * 
     * @return tipoNoExenta
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoOperacionSujetaNoExentaType getTipoNoExenta() {
        return tipoNoExenta;
    }


    /**
     * Sets the tipoNoExenta value for this SujetaTypeNoExenta.
     * 
     * @param tipoNoExenta
     */
    public void setTipoNoExenta(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoOperacionSujetaNoExentaType tipoNoExenta) {
        this.tipoNoExenta = tipoNoExenta;
    }


    /**
     * Gets the desgloseIVA value for this SujetaTypeNoExenta.
     * 
     * @return desgloseIVA
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVAEmitidaType[] getDesgloseIVA() {
        return desgloseIVA;
    }


    /**
     * Sets the desgloseIVA value for this SujetaTypeNoExenta.
     * 
     * @param desgloseIVA
     */
    public void setDesgloseIVA(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DetalleIVAEmitidaType[] desgloseIVA) {
        this.desgloseIVA = desgloseIVA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SujetaTypeNoExenta)) return false;
        SujetaTypeNoExenta other = (SujetaTypeNoExenta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoNoExenta==null && other.getTipoNoExenta()==null) || 
             (this.tipoNoExenta!=null &&
              this.tipoNoExenta.equals(other.getTipoNoExenta()))) &&
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
        if (getTipoNoExenta() != null) {
            _hashCode += getTipoNoExenta().hashCode();
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
        new org.apache.axis.description.TypeDesc(SujetaTypeNoExenta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", ">SujetaType>NoExenta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoNoExenta");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "TipoNoExenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "TipoOperacionSujetaNoExentaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desgloseIVA");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DesgloseIVA"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DetalleIVAEmitidaType"));
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
