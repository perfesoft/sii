/**
 * FacturaRespuestaExpedidaTypeTipoDesglose.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd;

public class FacturaRespuestaExpedidaTypeTipoDesglose  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoSinDesgloseType desgloseFactura;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoConDesgloseType desgloseTipoOperacion;

    public FacturaRespuestaExpedidaTypeTipoDesglose() {
    }

    public FacturaRespuestaExpedidaTypeTipoDesglose(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoSinDesgloseType desgloseFactura,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoConDesgloseType desgloseTipoOperacion) {
           this.desgloseFactura = desgloseFactura;
           this.desgloseTipoOperacion = desgloseTipoOperacion;
    }


    /**
     * Gets the desgloseFactura value for this FacturaRespuestaExpedidaTypeTipoDesglose.
     * 
     * @return desgloseFactura
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoSinDesgloseType getDesgloseFactura() {
        return desgloseFactura;
    }


    /**
     * Sets the desgloseFactura value for this FacturaRespuestaExpedidaTypeTipoDesglose.
     * 
     * @param desgloseFactura
     */
    public void setDesgloseFactura(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoSinDesgloseType desgloseFactura) {
        this.desgloseFactura = desgloseFactura;
    }


    /**
     * Gets the desgloseTipoOperacion value for this FacturaRespuestaExpedidaTypeTipoDesglose.
     * 
     * @return desgloseTipoOperacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoConDesgloseType getDesgloseTipoOperacion() {
        return desgloseTipoOperacion;
    }


    /**
     * Sets the desgloseTipoOperacion value for this FacturaRespuestaExpedidaTypeTipoDesglose.
     * 
     * @param desgloseTipoOperacion
     */
    public void setDesgloseTipoOperacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.TipoConDesgloseType desgloseTipoOperacion) {
        this.desgloseTipoOperacion = desgloseTipoOperacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FacturaRespuestaExpedidaTypeTipoDesglose)) return false;
        FacturaRespuestaExpedidaTypeTipoDesglose other = (FacturaRespuestaExpedidaTypeTipoDesglose) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.desgloseFactura==null && other.getDesgloseFactura()==null) || 
             (this.desgloseFactura!=null &&
              this.desgloseFactura.equals(other.getDesgloseFactura()))) &&
            ((this.desgloseTipoOperacion==null && other.getDesgloseTipoOperacion()==null) || 
             (this.desgloseTipoOperacion!=null &&
              this.desgloseTipoOperacion.equals(other.getDesgloseTipoOperacion())));
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
        if (getDesgloseFactura() != null) {
            _hashCode += getDesgloseFactura().hashCode();
        }
        if (getDesgloseTipoOperacion() != null) {
            _hashCode += getDesgloseTipoOperacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FacturaRespuestaExpedidaTypeTipoDesglose.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", ">FacturaRespuestaExpedidaType>TipoDesglose"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desgloseFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "DesgloseFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "TipoSinDesgloseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desgloseTipoOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "DesgloseTipoOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "TipoConDesgloseType"));
        elemField.setMinOccurs(0);
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
