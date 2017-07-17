/**
 * FacturaExpedidaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;


/**
 * Apunte correspondiente al libro de facturas expedidas.
 */
public class FacturaExpedidaType  extends es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaType  implements java.io.Serializable {
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosInmuebleType[] datosInmueble;

    private java.lang.String importeTransmisionSujetoAIVA;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.EmitidaPorTercerosType emitidaPorTerceros;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.VariosDestinatariosType variosDestinatarios;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CuponType cupon;

    /* Contraparte de la operación. Cliente (Opcional en tiquets)
     * en facturas emitidas. */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaExpedidaTypeTipoDesglose tipoDesglose;

    public FacturaExpedidaType() {
    }

    public FacturaExpedidaType(
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
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosInmuebleType[] datosInmueble,
           java.lang.String importeTransmisionSujetoAIVA,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.EmitidaPorTercerosType emitidaPorTerceros,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.VariosDestinatariosType variosDestinatarios,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CuponType cupon,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaExpedidaTypeTipoDesglose tipoDesglose) {
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
        this.datosInmueble = datosInmueble;
        this.importeTransmisionSujetoAIVA = importeTransmisionSujetoAIVA;
        this.emitidaPorTerceros = emitidaPorTerceros;
        this.variosDestinatarios = variosDestinatarios;
        this.cupon = cupon;
        this.contraparte = contraparte;
        this.tipoDesglose = tipoDesglose;
    }


    /**
     * Gets the datosInmueble value for this FacturaExpedidaType.
     * 
     * @return datosInmueble
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosInmuebleType[] getDatosInmueble() {
        return datosInmueble;
    }


    /**
     * Sets the datosInmueble value for this FacturaExpedidaType.
     * 
     * @param datosInmueble
     */
    public void setDatosInmueble(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DatosInmuebleType[] datosInmueble) {
        this.datosInmueble = datosInmueble;
    }


    /**
     * Gets the importeTransmisionSujetoAIVA value for this FacturaExpedidaType.
     * 
     * @return importeTransmisionSujetoAIVA
     */
    public java.lang.String getImporteTransmisionSujetoAIVA() {
        return importeTransmisionSujetoAIVA;
    }


    /**
     * Sets the importeTransmisionSujetoAIVA value for this FacturaExpedidaType.
     * 
     * @param importeTransmisionSujetoAIVA
     */
    public void setImporteTransmisionSujetoAIVA(java.lang.String importeTransmisionSujetoAIVA) {
        this.importeTransmisionSujetoAIVA = importeTransmisionSujetoAIVA;
    }


    /**
     * Gets the emitidaPorTerceros value for this FacturaExpedidaType.
     * 
     * @return emitidaPorTerceros
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.EmitidaPorTercerosType getEmitidaPorTerceros() {
        return emitidaPorTerceros;
    }


    /**
     * Sets the emitidaPorTerceros value for this FacturaExpedidaType.
     * 
     * @param emitidaPorTerceros
     */
    public void setEmitidaPorTerceros(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.EmitidaPorTercerosType emitidaPorTerceros) {
        this.emitidaPorTerceros = emitidaPorTerceros;
    }


    /**
     * Gets the variosDestinatarios value for this FacturaExpedidaType.
     * 
     * @return variosDestinatarios
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.VariosDestinatariosType getVariosDestinatarios() {
        return variosDestinatarios;
    }


    /**
     * Sets the variosDestinatarios value for this FacturaExpedidaType.
     * 
     * @param variosDestinatarios
     */
    public void setVariosDestinatarios(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.VariosDestinatariosType variosDestinatarios) {
        this.variosDestinatarios = variosDestinatarios;
    }


    /**
     * Gets the cupon value for this FacturaExpedidaType.
     * 
     * @return cupon
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CuponType getCupon() {
        return cupon;
    }


    /**
     * Sets the cupon value for this FacturaExpedidaType.
     * 
     * @param cupon
     */
    public void setCupon(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.CuponType cupon) {
        this.cupon = cupon;
    }


    /**
     * Gets the contraparte value for this FacturaExpedidaType.
     * 
     * @return contraparte   * Contraparte de la operación. Cliente (Opcional en tiquets)
     * en facturas emitidas.
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType getContraparte() {
        return contraparte;
    }


    /**
     * Sets the contraparte value for this FacturaExpedidaType.
     * 
     * @param contraparte   * Contraparte de la operación. Cliente (Opcional en tiquets)
     * en facturas emitidas.
     */
    public void setContraparte(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.PersonaFisicaJuridicaType contraparte) {
        this.contraparte = contraparte;
    }


    /**
     * Gets the tipoDesglose value for this FacturaExpedidaType.
     * 
     * @return tipoDesglose
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaExpedidaTypeTipoDesglose getTipoDesglose() {
        return tipoDesglose;
    }


    /**
     * Sets the tipoDesglose value for this FacturaExpedidaType.
     * 
     * @param tipoDesglose
     */
    public void setTipoDesglose(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.FacturaExpedidaTypeTipoDesglose tipoDesglose) {
        this.tipoDesglose = tipoDesglose;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FacturaExpedidaType)) return false;
        FacturaExpedidaType other = (FacturaExpedidaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datosInmueble==null && other.getDatosInmueble()==null) || 
             (this.datosInmueble!=null &&
              java.util.Arrays.equals(this.datosInmueble, other.getDatosInmueble()))) &&
            ((this.importeTransmisionSujetoAIVA==null && other.getImporteTransmisionSujetoAIVA()==null) || 
             (this.importeTransmisionSujetoAIVA!=null &&
              this.importeTransmisionSujetoAIVA.equals(other.getImporteTransmisionSujetoAIVA()))) &&
            ((this.emitidaPorTerceros==null && other.getEmitidaPorTerceros()==null) || 
             (this.emitidaPorTerceros!=null &&
              this.emitidaPorTerceros.equals(other.getEmitidaPorTerceros()))) &&
            ((this.variosDestinatarios==null && other.getVariosDestinatarios()==null) || 
             (this.variosDestinatarios!=null &&
              this.variosDestinatarios.equals(other.getVariosDestinatarios()))) &&
            ((this.cupon==null && other.getCupon()==null) || 
             (this.cupon!=null &&
              this.cupon.equals(other.getCupon()))) &&
            ((this.contraparte==null && other.getContraparte()==null) || 
             (this.contraparte!=null &&
              this.contraparte.equals(other.getContraparte()))) &&
            ((this.tipoDesglose==null && other.getTipoDesglose()==null) || 
             (this.tipoDesglose!=null &&
              this.tipoDesglose.equals(other.getTipoDesglose())));
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
        if (getDatosInmueble() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatosInmueble());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatosInmueble(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImporteTransmisionSujetoAIVA() != null) {
            _hashCode += getImporteTransmisionSujetoAIVA().hashCode();
        }
        if (getEmitidaPorTerceros() != null) {
            _hashCode += getEmitidaPorTerceros().hashCode();
        }
        if (getVariosDestinatarios() != null) {
            _hashCode += getVariosDestinatarios().hashCode();
        }
        if (getCupon() != null) {
            _hashCode += getCupon().hashCode();
        }
        if (getContraparte() != null) {
            _hashCode += getContraparte().hashCode();
        }
        if (getTipoDesglose() != null) {
            _hashCode += getTipoDesglose().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FacturaExpedidaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "FacturaExpedidaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosInmueble");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DatosInmueble"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DatosInmuebleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DetalleInmueble"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importeTransmisionSujetoAIVA");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ImporteTransmisionSujetoAIVA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emitidaPorTerceros");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "EmitidaPorTerceros"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "EmitidaPorTercerosType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variosDestinatarios");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "VariosDestinatarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "VariosDestinatariosType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupon");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "Cupon"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CuponType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contraparte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "Contraparte"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "PersonaFisicaJuridicaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDesglose");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "TipoDesglose"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", ">FacturaExpedidaType>TipoDesglose"));
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
