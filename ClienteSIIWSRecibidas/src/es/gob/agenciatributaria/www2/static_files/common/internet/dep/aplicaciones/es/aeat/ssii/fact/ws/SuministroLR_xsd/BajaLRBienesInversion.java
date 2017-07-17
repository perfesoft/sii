/**
 * BajaLRBienesInversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd;

public class BajaLRBienesInversion  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.SuministroInformacionBaja  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaBienesInversionType[] registroLRBajaBienesInversion;

    public BajaLRBienesInversion() {
    }

    public BajaLRBienesInversion(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CabeceraSiiBaja cabecera,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaBienesInversionType[] registroLRBajaBienesInversion) {
        super(
            cabecera);
        this.registroLRBajaBienesInversion = registroLRBajaBienesInversion;
    }


    /**
     * Gets the registroLRBajaBienesInversion value for this BajaLRBienesInversion.
     * 
     * @return registroLRBajaBienesInversion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaBienesInversionType[] getRegistroLRBajaBienesInversion() {
        return registroLRBajaBienesInversion;
    }


    /**
     * Sets the registroLRBajaBienesInversion value for this BajaLRBienesInversion.
     * 
     * @param registroLRBajaBienesInversion
     */
    public void setRegistroLRBajaBienesInversion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaBienesInversionType[] registroLRBajaBienesInversion) {
        this.registroLRBajaBienesInversion = registroLRBajaBienesInversion;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaBienesInversionType getRegistroLRBajaBienesInversion(int i) {
        return this.registroLRBajaBienesInversion[i];
    }

    public void setRegistroLRBajaBienesInversion(int i, es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.LRBajaBienesInversionType _value) {
        this.registroLRBajaBienesInversion[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BajaLRBienesInversion)) return false;
        BajaLRBienesInversion other = (BajaLRBienesInversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registroLRBajaBienesInversion==null && other.getRegistroLRBajaBienesInversion()==null) || 
             (this.registroLRBajaBienesInversion!=null &&
              java.util.Arrays.equals(this.registroLRBajaBienesInversion, other.getRegistroLRBajaBienesInversion())));
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
        if (getRegistroLRBajaBienesInversion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistroLRBajaBienesInversion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistroLRBajaBienesInversion(), i);
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
        new org.apache.axis.description.TypeDesc(BajaLRBienesInversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", ">BajaLRBienesInversion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroLRBajaBienesInversion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "RegistroLRBajaBienesInversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "LRBajaBienesInversionType"));
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
