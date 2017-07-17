/**
 * SuministroLRFacturasEmitidas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd;

public class SuministroLRFacturasEmitidas  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SuministroInformacion  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRfacturasEmitidasType[] registroLRFacturasEmitidas;

    public SuministroLRFacturasEmitidas() {
    }

    public SuministroLRFacturasEmitidas(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSii cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRfacturasEmitidasType[] registroLRFacturasEmitidas) {
        super(
            cabecera);
        this.registroLRFacturasEmitidas = registroLRFacturasEmitidas;
    }


    /**
     * Gets the registroLRFacturasEmitidas value for this SuministroLRFacturasEmitidas.
     * 
     * @return registroLRFacturasEmitidas
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRfacturasEmitidasType[] getRegistroLRFacturasEmitidas() {
        return registroLRFacturasEmitidas;
    }


    /**
     * Sets the registroLRFacturasEmitidas value for this SuministroLRFacturasEmitidas.
     * 
     * @param registroLRFacturasEmitidas
     */
    public void setRegistroLRFacturasEmitidas(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRfacturasEmitidasType[] registroLRFacturasEmitidas) {
        this.registroLRFacturasEmitidas = registroLRFacturasEmitidas;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRfacturasEmitidasType getRegistroLRFacturasEmitidas(int i) {
        return this.registroLRFacturasEmitidas[i];
    }

    public void setRegistroLRFacturasEmitidas(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRfacturasEmitidasType _value) {
        this.registroLRFacturasEmitidas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuministroLRFacturasEmitidas)) return false;
        SuministroLRFacturasEmitidas other = (SuministroLRFacturasEmitidas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registroLRFacturasEmitidas==null && other.getRegistroLRFacturasEmitidas()==null) || 
             (this.registroLRFacturasEmitidas!=null &&
              java.util.Arrays.equals(this.registroLRFacturasEmitidas, other.getRegistroLRFacturasEmitidas())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRegistroLRFacturasEmitidas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistroLRFacturasEmitidas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistroLRFacturasEmitidas(), i);
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
        new org.apache.axis.description.TypeDesc(SuministroLRFacturasEmitidas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", ">SuministroLRFacturasEmitidas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroLRFacturasEmitidas");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "RegistroLRFacturasEmitidas"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "LRfacturasEmitidasType"));
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
