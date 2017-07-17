/**
 * SuministroLROperacionesSeguros.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd;

public class SuministroLROperacionesSeguros  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SuministroInformacion  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionesSegurosType[] registroLROperacionesSeguros;

    public SuministroLROperacionesSeguros() {
    }

    public SuministroLROperacionesSeguros(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSii cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionesSegurosType[] registroLROperacionesSeguros) {
        super(
            cabecera);
        this.registroLROperacionesSeguros = registroLROperacionesSeguros;
    }


    /**
     * Gets the registroLROperacionesSeguros value for this SuministroLROperacionesSeguros.
     * 
     * @return registroLROperacionesSeguros
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionesSegurosType[] getRegistroLROperacionesSeguros() {
        return registroLROperacionesSeguros;
    }


    /**
     * Sets the registroLROperacionesSeguros value for this SuministroLROperacionesSeguros.
     * 
     * @param registroLROperacionesSeguros
     */
    public void setRegistroLROperacionesSeguros(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionesSegurosType[] registroLROperacionesSeguros) {
        this.registroLROperacionesSeguros = registroLROperacionesSeguros;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionesSegurosType getRegistroLROperacionesSeguros(int i) {
        return this.registroLROperacionesSeguros[i];
    }

    public void setRegistroLROperacionesSeguros(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LROperacionesSegurosType _value) {
        this.registroLROperacionesSeguros[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuministroLROperacionesSeguros)) return false;
        SuministroLROperacionesSeguros other = (SuministroLROperacionesSeguros) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registroLROperacionesSeguros==null && other.getRegistroLROperacionesSeguros()==null) || 
             (this.registroLROperacionesSeguros!=null &&
              java.util.Arrays.equals(this.registroLROperacionesSeguros, other.getRegistroLROperacionesSeguros())));
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
        if (getRegistroLROperacionesSeguros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistroLROperacionesSeguros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistroLROperacionesSeguros(), i);
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
        new org.apache.axis.description.TypeDesc(SuministroLROperacionesSeguros.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", ">SuministroLROperacionesSeguros"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroLROperacionesSeguros");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "RegistroLROperacionesSeguros"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "LROperacionesSegurosType"));
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
