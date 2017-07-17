/**
 * LRfacturasEmitidasType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd;


/**
 * Datos correspondientes al libro de Facturas emitidas
 */
public class LRfacturasEmitidasType  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RegistroSii  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaExpedidaType IDFactura;

    /* Factura correspondiente al libro de facturas expedidas. */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaExpedidaType facturaExpedida;

    public LRfacturasEmitidasType() {
    }

    public LRfacturasEmitidasType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RegistroSiiPeriodoImpositivo periodoImpositivo,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaExpedidaType IDFactura,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaExpedidaType facturaExpedida) {
        super(
            periodoImpositivo);
        this.IDFactura = IDFactura;
        this.facturaExpedida = facturaExpedida;
    }


    /**
     * Gets the IDFactura value for this LRfacturasEmitidasType.
     * 
     * @return IDFactura
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaExpedidaType getIDFactura() {
        return IDFactura;
    }


    /**
     * Sets the IDFactura value for this LRfacturasEmitidasType.
     * 
     * @param IDFactura
     */
    public void setIDFactura(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaExpedidaType IDFactura) {
        this.IDFactura = IDFactura;
    }


    /**
     * Gets the facturaExpedida value for this LRfacturasEmitidasType.
     * 
     * @return facturaExpedida   * Factura correspondiente al libro de facturas expedidas.
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaExpedidaType getFacturaExpedida() {
        return facturaExpedida;
    }


    /**
     * Sets the facturaExpedida value for this LRfacturasEmitidasType.
     * 
     * @param facturaExpedida   * Factura correspondiente al libro de facturas expedidas.
     */
    public void setFacturaExpedida(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaExpedidaType facturaExpedida) {
        this.facturaExpedida = facturaExpedida;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LRfacturasEmitidasType)) return false;
        LRfacturasEmitidasType other = (LRfacturasEmitidasType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.IDFactura==null && other.getIDFactura()==null) || 
             (this.IDFactura!=null &&
              this.IDFactura.equals(other.getIDFactura()))) &&
            ((this.facturaExpedida==null && other.getFacturaExpedida()==null) || 
             (this.facturaExpedida!=null &&
              this.facturaExpedida.equals(other.getFacturaExpedida())));
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
        if (getIDFactura() != null) {
            _hashCode += getIDFactura().hashCode();
        }
        if (getFacturaExpedida() != null) {
            _hashCode += getFacturaExpedida().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LRfacturasEmitidasType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "LRfacturasEmitidasType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "IDFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDFacturaExpedidaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facturaExpedida");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "FacturaExpedida"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "FacturaExpedidaType"));
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
