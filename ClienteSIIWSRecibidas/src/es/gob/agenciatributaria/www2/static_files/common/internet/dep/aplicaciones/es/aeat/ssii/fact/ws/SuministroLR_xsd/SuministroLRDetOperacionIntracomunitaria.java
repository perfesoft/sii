/**
 * SuministroLRDetOperacionIntracomunitaria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd;

public class SuministroLRDetOperacionIntracomunitaria  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SuministroInformacion  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionIntracomunitariaType[] registroLRDetOperacionIntracomunitaria;

    public SuministroLRDetOperacionIntracomunitaria() {
    }

    public SuministroLRDetOperacionIntracomunitaria(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSii cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionIntracomunitariaType[] registroLRDetOperacionIntracomunitaria) {
        super(
            cabecera);
        this.registroLRDetOperacionIntracomunitaria = registroLRDetOperacionIntracomunitaria;
    }


    /**
     * Gets the registroLRDetOperacionIntracomunitaria value for this SuministroLRDetOperacionIntracomunitaria.
     * 
     * @return registroLRDetOperacionIntracomunitaria
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionIntracomunitariaType[] getRegistroLRDetOperacionIntracomunitaria() {
        return registroLRDetOperacionIntracomunitaria;
    }


    /**
     * Sets the registroLRDetOperacionIntracomunitaria value for this SuministroLRDetOperacionIntracomunitaria.
     * 
     * @param registroLRDetOperacionIntracomunitaria
     */
    public void setRegistroLRDetOperacionIntracomunitaria(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionIntracomunitariaType[] registroLRDetOperacionIntracomunitaria) {
        this.registroLRDetOperacionIntracomunitaria = registroLRDetOperacionIntracomunitaria;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionIntracomunitariaType getRegistroLRDetOperacionIntracomunitaria(int i) {
        return this.registroLRDetOperacionIntracomunitaria[i];
    }

    public void setRegistroLRDetOperacionIntracomunitaria(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionIntracomunitariaType _value) {
        this.registroLRDetOperacionIntracomunitaria[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuministroLRDetOperacionIntracomunitaria)) return false;
        SuministroLRDetOperacionIntracomunitaria other = (SuministroLRDetOperacionIntracomunitaria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registroLRDetOperacionIntracomunitaria==null && other.getRegistroLRDetOperacionIntracomunitaria()==null) || 
             (this.registroLRDetOperacionIntracomunitaria!=null &&
              java.util.Arrays.equals(this.registroLRDetOperacionIntracomunitaria, other.getRegistroLRDetOperacionIntracomunitaria())));
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
        if (getRegistroLRDetOperacionIntracomunitaria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistroLRDetOperacionIntracomunitaria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistroLRDetOperacionIntracomunitaria(), i);
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
        new org.apache.axis.description.TypeDesc(SuministroLRDetOperacionIntracomunitaria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", ">SuministroLRDetOperacionIntracomunitaria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroLRDetOperacionIntracomunitaria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "RegistroLRDetOperacionIntracomunitaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "LROperacionIntracomunitariaType"));
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
