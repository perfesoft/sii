/**
 * LROperacionIntracomunitariaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd;


/**
 * Apunte correspondiente al libro de operaciones intracomunitarias.
 */
public class LROperacionIntracomunitariaType  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RegistroSii  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaComunitariaType IDFactura;

    /* Contraparte de la operación. Cliente en facturas emitidas.
     * Proveedor en facturas recibidas. */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte;

    /* Apunte correspondiente al libro de operaciones intracomunitarias. */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaType operacionIntracomunitaria;

    public LROperacionIntracomunitariaType() {
    }

    public LROperacionIntracomunitariaType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.RegistroSiiPeriodoImpositivo periodoImpositivo,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaComunitariaType IDFactura,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaType operacionIntracomunitaria) {
        super(
            periodoImpositivo);
        this.IDFactura = IDFactura;
        this.contraparte = contraparte;
        this.operacionIntracomunitaria = operacionIntracomunitaria;
    }


    /**
     * Gets the IDFactura value for this LROperacionIntracomunitariaType.
     * 
     * @return IDFactura
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaComunitariaType getIDFactura() {
        return IDFactura;
    }


    /**
     * Sets the IDFactura value for this LROperacionIntracomunitariaType.
     * 
     * @param IDFactura
     */
    public void setIDFactura(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaComunitariaType IDFactura) {
        this.IDFactura = IDFactura;
    }


    /**
     * Gets the contraparte value for this LROperacionIntracomunitariaType.
     * 
     * @return contraparte   * Contraparte de la operación. Cliente en facturas emitidas.
     * Proveedor en facturas recibidas.
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType getContraparte() {
        return contraparte;
    }


    /**
     * Sets the contraparte value for this LROperacionIntracomunitariaType.
     * 
     * @param contraparte   * Contraparte de la operación. Cliente en facturas emitidas.
     * Proveedor en facturas recibidas.
     */
    public void setContraparte(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte) {
        this.contraparte = contraparte;
    }


    /**
     * Gets the operacionIntracomunitaria value for this LROperacionIntracomunitariaType.
     * 
     * @return operacionIntracomunitaria   * Apunte correspondiente al libro de operaciones intracomunitarias.
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaType getOperacionIntracomunitaria() {
        return operacionIntracomunitaria;
    }


    /**
     * Sets the operacionIntracomunitaria value for this LROperacionIntracomunitariaType.
     * 
     * @param operacionIntracomunitaria   * Apunte correspondiente al libro de operaciones intracomunitarias.
     */
    public void setOperacionIntracomunitaria(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.OperacionIntracomunitariaType operacionIntracomunitaria) {
        this.operacionIntracomunitaria = operacionIntracomunitaria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LROperacionIntracomunitariaType)) return false;
        LROperacionIntracomunitariaType other = (LROperacionIntracomunitariaType) obj;
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
            ((this.contraparte==null && other.getContraparte()==null) || 
             (this.contraparte!=null &&
              this.contraparte.equals(other.getContraparte()))) &&
            ((this.operacionIntracomunitaria==null && other.getOperacionIntracomunitaria()==null) || 
             (this.operacionIntracomunitaria!=null &&
              this.operacionIntracomunitaria.equals(other.getOperacionIntracomunitaria())));
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
        if (getContraparte() != null) {
            _hashCode += getContraparte().hashCode();
        }
        if (getOperacionIntracomunitaria() != null) {
            _hashCode += getOperacionIntracomunitaria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LROperacionIntracomunitariaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "LROperacionIntracomunitariaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "IDFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDFacturaComunitariaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contraparte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "Contraparte"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "PersonaFisicaJuridicaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operacionIntracomunitaria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", "OperacionIntracomunitaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "OperacionIntracomunitariaType"));
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
