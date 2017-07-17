/**
 * SuministroLRCobrosMetalico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd;

public class SuministroLRCobrosMetalico  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SuministroInformacion  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRCobrosMetalicoType[] registroLRCobrosMetalico;

    public SuministroLRCobrosMetalico() {
    }

    public SuministroLRCobrosMetalico(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSii cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRCobrosMetalicoType[] registroLRCobrosMetalico) {
        super(
            cabecera);
        this.registroLRCobrosMetalico = registroLRCobrosMetalico;
    }


    /**
     * Gets the registroLRCobrosMetalico value for this SuministroLRCobrosMetalico.
     * 
     * @return registroLRCobrosMetalico
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRCobrosMetalicoType[] getRegistroLRCobrosMetalico() {
        return registroLRCobrosMetalico;
    }


    /**
     * Sets the registroLRCobrosMetalico value for this SuministroLRCobrosMetalico.
     * 
     * @param registroLRCobrosMetalico
     */
    public void setRegistroLRCobrosMetalico(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRCobrosMetalicoType[] registroLRCobrosMetalico) {
        this.registroLRCobrosMetalico = registroLRCobrosMetalico;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRCobrosMetalicoType getRegistroLRCobrosMetalico(int i) {
        return this.registroLRCobrosMetalico[i];
    }

    public void setRegistroLRCobrosMetalico(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRCobrosMetalicoType _value) {
        this.registroLRCobrosMetalico[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuministroLRCobrosMetalico)) return false;
        SuministroLRCobrosMetalico other = (SuministroLRCobrosMetalico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registroLRCobrosMetalico==null && other.getRegistroLRCobrosMetalico()==null) || 
             (this.registroLRCobrosMetalico!=null &&
              java.util.Arrays.equals(this.registroLRCobrosMetalico, other.getRegistroLRCobrosMetalico())));
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
        if (getRegistroLRCobrosMetalico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistroLRCobrosMetalico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistroLRCobrosMetalico(), i);
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
        new org.apache.axis.description.TypeDesc(SuministroLRCobrosMetalico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", ">SuministroLRCobrosMetalico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroLRCobrosMetalico");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "RegistroLRCobrosMetalico"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "LRCobrosMetalicoType"));
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
