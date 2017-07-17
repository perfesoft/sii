/**
 * BajaLROperacionesSeguros.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd;

public class BajaLROperacionesSeguros  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SuministroInformacionBaja  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaRegistroLROperacionesSegurosType[] registroLRBajaOperacionesSeguros;

    public BajaLROperacionesSeguros() {
    }

    public BajaLROperacionesSeguros(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSiiBaja cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaRegistroLROperacionesSegurosType[] registroLRBajaOperacionesSeguros) {
        super(
            cabecera);
        this.registroLRBajaOperacionesSeguros = registroLRBajaOperacionesSeguros;
    }


    /**
     * Gets the registroLRBajaOperacionesSeguros value for this BajaLROperacionesSeguros.
     * 
     * @return registroLRBajaOperacionesSeguros
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaRegistroLROperacionesSegurosType[] getRegistroLRBajaOperacionesSeguros() {
        return registroLRBajaOperacionesSeguros;
    }


    /**
     * Sets the registroLRBajaOperacionesSeguros value for this BajaLROperacionesSeguros.
     * 
     * @param registroLRBajaOperacionesSeguros
     */
    public void setRegistroLRBajaOperacionesSeguros(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaRegistroLROperacionesSegurosType[] registroLRBajaOperacionesSeguros) {
        this.registroLRBajaOperacionesSeguros = registroLRBajaOperacionesSeguros;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaRegistroLROperacionesSegurosType getRegistroLRBajaOperacionesSeguros(int i) {
        return this.registroLRBajaOperacionesSeguros[i];
    }

    public void setRegistroLRBajaOperacionesSeguros(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaRegistroLROperacionesSegurosType _value) {
        this.registroLRBajaOperacionesSeguros[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BajaLROperacionesSeguros)) return false;
        BajaLROperacionesSeguros other = (BajaLROperacionesSeguros) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registroLRBajaOperacionesSeguros==null && other.getRegistroLRBajaOperacionesSeguros()==null) || 
             (this.registroLRBajaOperacionesSeguros!=null &&
              java.util.Arrays.equals(this.registroLRBajaOperacionesSeguros, other.getRegistroLRBajaOperacionesSeguros())));
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
        if (getRegistroLRBajaOperacionesSeguros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistroLRBajaOperacionesSeguros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistroLRBajaOperacionesSeguros(), i);
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
        new org.apache.axis.description.TypeDesc(BajaLROperacionesSeguros.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", ">BajaLROperacionesSeguros"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroLRBajaOperacionesSeguros");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "RegistroLRBajaOperacionesSeguros"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "LRBajaRegistroLROperacionesSegurosType"));
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
