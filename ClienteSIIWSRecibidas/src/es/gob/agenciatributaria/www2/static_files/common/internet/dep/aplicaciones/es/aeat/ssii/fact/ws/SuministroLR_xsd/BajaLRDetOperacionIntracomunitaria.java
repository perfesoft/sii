/**
 * BajaLRDetOperacionIntracomunitaria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd;

public class BajaLRDetOperacionIntracomunitaria  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SuministroInformacionBaja  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaOperacionIntracomunitariaType[] registroLRBajaDetOperacionIntracomunitaria;

    public BajaLRDetOperacionIntracomunitaria() {
    }

    public BajaLRDetOperacionIntracomunitaria(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSiiBaja cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaOperacionIntracomunitariaType[] registroLRBajaDetOperacionIntracomunitaria) {
        super(
            cabecera);
        this.registroLRBajaDetOperacionIntracomunitaria = registroLRBajaDetOperacionIntracomunitaria;
    }


    /**
     * Gets the registroLRBajaDetOperacionIntracomunitaria value for this BajaLRDetOperacionIntracomunitaria.
     * 
     * @return registroLRBajaDetOperacionIntracomunitaria
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaOperacionIntracomunitariaType[] getRegistroLRBajaDetOperacionIntracomunitaria() {
        return registroLRBajaDetOperacionIntracomunitaria;
    }


    /**
     * Sets the registroLRBajaDetOperacionIntracomunitaria value for this BajaLRDetOperacionIntracomunitaria.
     * 
     * @param registroLRBajaDetOperacionIntracomunitaria
     */
    public void setRegistroLRBajaDetOperacionIntracomunitaria(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaOperacionIntracomunitariaType[] registroLRBajaDetOperacionIntracomunitaria) {
        this.registroLRBajaDetOperacionIntracomunitaria = registroLRBajaDetOperacionIntracomunitaria;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaOperacionIntracomunitariaType getRegistroLRBajaDetOperacionIntracomunitaria(int i) {
        return this.registroLRBajaDetOperacionIntracomunitaria[i];
    }

    public void setRegistroLRBajaDetOperacionIntracomunitaria(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaOperacionIntracomunitariaType _value) {
        this.registroLRBajaDetOperacionIntracomunitaria[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BajaLRDetOperacionIntracomunitaria)) return false;
        BajaLRDetOperacionIntracomunitaria other = (BajaLRDetOperacionIntracomunitaria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registroLRBajaDetOperacionIntracomunitaria==null && other.getRegistroLRBajaDetOperacionIntracomunitaria()==null) || 
             (this.registroLRBajaDetOperacionIntracomunitaria!=null &&
              java.util.Arrays.equals(this.registroLRBajaDetOperacionIntracomunitaria, other.getRegistroLRBajaDetOperacionIntracomunitaria())));
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
        if (getRegistroLRBajaDetOperacionIntracomunitaria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistroLRBajaDetOperacionIntracomunitaria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistroLRBajaDetOperacionIntracomunitaria(), i);
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
        new org.apache.axis.description.TypeDesc(BajaLRDetOperacionIntracomunitaria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", ">BajaLRDetOperacionIntracomunitaria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroLRBajaDetOperacionIntracomunitaria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "RegistroLRBajaDetOperacionIntracomunitaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "LRBajaOperacionIntracomunitariaType"));
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
