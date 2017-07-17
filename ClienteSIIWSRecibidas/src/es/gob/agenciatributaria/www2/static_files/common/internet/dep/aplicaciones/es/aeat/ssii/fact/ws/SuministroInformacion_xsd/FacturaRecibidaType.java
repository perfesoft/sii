/**
 * FacturaRecibidaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;


/**
 * Apunte correspondiente al libro de facturas recibidas.
 */
public class FacturaRecibidaType  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DesgloseFacturaRecibidasType desgloseFactura;

    /* Contraparte de la operación. Proveedor (Obligatorio) en facturas
     * recibidas. */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte;

    private java.lang.String fechaRegContable;

    private java.lang.String cuotaDeducible;

    public FacturaRecibidaType() {
    }

    public FacturaRecibidaType(
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoFacturaType tipoFactura,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoRectificativaType tipoRectificativa,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaARType[] facturasAgrupadas,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaARType[] facturasRectificadas,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DesgloseRectificacionType importeRectificacion,
           java.lang.String fechaOperacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType claveRegimenEspecialOTrascendencia,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType claveRegimenEspecialOTrascendenciaAdicional1,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType claveRegimenEspecialOTrascendenciaAdicional2,
           java.lang.String numRegistroAcuerdoFacturacion,
           java.lang.String importeTotal,
           java.lang.String baseImponibleACoste,
           java.lang.String descripcionOperacion,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DesgloseFacturaRecibidasType desgloseFactura,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte,
           java.lang.String fechaRegContable,
           java.lang.String cuotaDeducible) {
        super(
            tipoFactura,
            tipoRectificativa,
            facturasAgrupadas,
            facturasRectificadas,
            importeRectificacion,
            fechaOperacion,
            claveRegimenEspecialOTrascendencia,
            claveRegimenEspecialOTrascendenciaAdicional1,
            claveRegimenEspecialOTrascendenciaAdicional2,
            numRegistroAcuerdoFacturacion,
            importeTotal,
            baseImponibleACoste,
            descripcionOperacion);
        this.desgloseFactura = desgloseFactura;
        this.contraparte = contraparte;
        this.fechaRegContable = fechaRegContable;
        this.cuotaDeducible = cuotaDeducible;
    }


    /**
     * Gets the desgloseFactura value for this FacturaRecibidaType.
     * 
     * @return desgloseFactura
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DesgloseFacturaRecibidasType getDesgloseFactura() {
        return desgloseFactura;
    }


    /**
     * Sets the desgloseFactura value for this FacturaRecibidaType.
     * 
     * @param desgloseFactura
     */
    public void setDesgloseFactura(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DesgloseFacturaRecibidasType desgloseFactura) {
        this.desgloseFactura = desgloseFactura;
    }


    /**
     * Gets the contraparte value for this FacturaRecibidaType.
     * 
     * @return contraparte   * Contraparte de la operación. Proveedor (Obligatorio) en facturas
     * recibidas.
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType getContraparte() {
        return contraparte;
    }


    /**
     * Sets the contraparte value for this FacturaRecibidaType.
     * 
     * @param contraparte   * Contraparte de la operación. Proveedor (Obligatorio) en facturas
     * recibidas.
     */
    public void setContraparte(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte) {
        this.contraparte = contraparte;
    }


    /**
     * Gets the fechaRegContable value for this FacturaRecibidaType.
     * 
     * @return fechaRegContable
     */
    public java.lang.String getFechaRegContable() {
        return fechaRegContable;
    }


    /**
     * Sets the fechaRegContable value for this FacturaRecibidaType.
     * 
     * @param fechaRegContable
     */
    public void setFechaRegContable(java.lang.String fechaRegContable) {
        this.fechaRegContable = fechaRegContable;
    }


    /**
     * Gets the cuotaDeducible value for this FacturaRecibidaType.
     * 
     * @return cuotaDeducible
     */
    public java.lang.String getCuotaDeducible() {
        return cuotaDeducible;
    }


    /**
     * Sets the cuotaDeducible value for this FacturaRecibidaType.
     * 
     * @param cuotaDeducible
     */
    public void setCuotaDeducible(java.lang.String cuotaDeducible) {
        this.cuotaDeducible = cuotaDeducible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FacturaRecibidaType)) return false;
        FacturaRecibidaType other = (FacturaRecibidaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.desgloseFactura==null && other.getDesgloseFactura()==null) || 
             (this.desgloseFactura!=null &&
              this.desgloseFactura.equals(other.getDesgloseFactura()))) &&
            ((this.contraparte==null && other.getContraparte()==null) || 
             (this.contraparte!=null &&
              this.contraparte.equals(other.getContraparte()))) &&
            ((this.fechaRegContable==null && other.getFechaRegContable()==null) || 
             (this.fechaRegContable!=null &&
              this.fechaRegContable.equals(other.getFechaRegContable()))) &&
            ((this.cuotaDeducible==null && other.getCuotaDeducible()==null) || 
             (this.cuotaDeducible!=null &&
              this.cuotaDeducible.equals(other.getCuotaDeducible())));
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
        if (getDesgloseFactura() != null) {
            _hashCode += getDesgloseFactura().hashCode();
        }
        if (getContraparte() != null) {
            _hashCode += getContraparte().hashCode();
        }
        if (getFechaRegContable() != null) {
            _hashCode += getFechaRegContable().hashCode();
        }
        if (getCuotaDeducible() != null) {
            _hashCode += getCuotaDeducible().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FacturaRecibidaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "FacturaRecibidaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desgloseFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DesgloseFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DesgloseFacturaRecibidasType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contraparte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "Contraparte"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "PersonaFisicaJuridicaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRegContable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "FechaRegContable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuotaDeducible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CuotaDeducible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
