/**
 * BajaLRCobrosMetalico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd;

public class BajaLRCobrosMetalico  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SuministroInformacionBaja  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaCobrosMetalicoType[] registroLRBajaCobrosMetalico;

    public BajaLRCobrosMetalico() {
    }

    public BajaLRCobrosMetalico(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSiiBaja cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaCobrosMetalicoType[] registroLRBajaCobrosMetalico) {
        super(
            cabecera);
        this.registroLRBajaCobrosMetalico = registroLRBajaCobrosMetalico;
    }


    /**
     * Gets the registroLRBajaCobrosMetalico value for this BajaLRCobrosMetalico.
     * 
     * @return registroLRBajaCobrosMetalico
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaCobrosMetalicoType[] getRegistroLRBajaCobrosMetalico() {
        return registroLRBajaCobrosMetalico;
    }


    /**
     * Sets the registroLRBajaCobrosMetalico value for this BajaLRCobrosMetalico.
     * 
     * @param registroLRBajaCobrosMetalico
     */
    public void setRegistroLRBajaCobrosMetalico(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaCobrosMetalicoType[] registroLRBajaCobrosMetalico) {
        this.registroLRBajaCobrosMetalico = registroLRBajaCobrosMetalico;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaCobrosMetalicoType getRegistroLRBajaCobrosMetalico(int i) {
        return this.registroLRBajaCobrosMetalico[i];
    }

    public void setRegistroLRBajaCobrosMetalico(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaCobrosMetalicoType _value) {
        this.registroLRBajaCobrosMetalico[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BajaLRCobrosMetalico)) return false;
        BajaLRCobrosMetalico other = (BajaLRCobrosMetalico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registroLRBajaCobrosMetalico==null && other.getRegistroLRBajaCobrosMetalico()==null) || 
             (this.registroLRBajaCobrosMetalico!=null &&
              java.util.Arrays.equals(this.registroLRBajaCobrosMetalico, other.getRegistroLRBajaCobrosMetalico())));
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
        if (getRegistroLRBajaCobrosMetalico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistroLRBajaCobrosMetalico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistroLRBajaCobrosMetalico(), i);
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
        new org.apache.axis.description.TypeDesc(BajaLRCobrosMetalico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", ">BajaLRCobrosMetalico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroLRBajaCobrosMetalico");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "RegistroLRBajaCobrosMetalico"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "LRBajaCobrosMetalicoType"));
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
