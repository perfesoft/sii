/**
 * FacturaRespuestaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd;


/**
 * Datos comunes de facturas emitidas y recibidas
 */
public class FacturaRespuestaType  implements java.io.Serializable {
    /* Clave del tipo de factura */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoFacturaType tipoFactura;

    /* Clave del tipo de factura */
    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoRectificativaType tipoRectificativa;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaARType[] facturasAgrupadas;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaARType[] facturasRectificadas;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DesgloseRectificacionType importeRectificacion;

    private java.lang.String fechaOperacion;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType claveRegimenEspecialOTrascendencia;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType claveRegimenEspecialOTrascendenciaAdicional1;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType claveRegimenEspecialOTrascendenciaAdicional2;

    private java.lang.String numRegistroAcuerdoFacturacion;

    private java.lang.String importeTotal;

    private java.lang.String baseImponibleACoste;

    private java.lang.String descripcionOperacion;

    public FacturaRespuestaType() {
    }

    public FacturaRespuestaType(
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
           java.lang.String descripcionOperacion) {
           this.tipoFactura = tipoFactura;
           this.tipoRectificativa = tipoRectificativa;
           this.facturasAgrupadas = facturasAgrupadas;
           this.facturasRectificadas = facturasRectificadas;
           this.importeRectificacion = importeRectificacion;
           this.fechaOperacion = fechaOperacion;
           this.claveRegimenEspecialOTrascendencia = claveRegimenEspecialOTrascendencia;
           this.claveRegimenEspecialOTrascendenciaAdicional1 = claveRegimenEspecialOTrascendenciaAdicional1;
           this.claveRegimenEspecialOTrascendenciaAdicional2 = claveRegimenEspecialOTrascendenciaAdicional2;
           this.numRegistroAcuerdoFacturacion = numRegistroAcuerdoFacturacion;
           this.importeTotal = importeTotal;
           this.baseImponibleACoste = baseImponibleACoste;
           this.descripcionOperacion = descripcionOperacion;
    }


    /**
     * Gets the tipoFactura value for this FacturaRespuestaType.
     * 
     * @return tipoFactura   * Clave del tipo de factura
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoFacturaType getTipoFactura() {
        return tipoFactura;
    }


    /**
     * Sets the tipoFactura value for this FacturaRespuestaType.
     * 
     * @param tipoFactura   * Clave del tipo de factura
     */
    public void setTipoFactura(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoFacturaType tipoFactura) {
        this.tipoFactura = tipoFactura;
    }


    /**
     * Gets the tipoRectificativa value for this FacturaRespuestaType.
     * 
     * @return tipoRectificativa   * Clave del tipo de factura
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoRectificativaType getTipoRectificativa() {
        return tipoRectificativa;
    }


    /**
     * Sets the tipoRectificativa value for this FacturaRespuestaType.
     * 
     * @param tipoRectificativa   * Clave del tipo de factura
     */
    public void setTipoRectificativa(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.ClaveTipoRectificativaType tipoRectificativa) {
        this.tipoRectificativa = tipoRectificativa;
    }


    /**
     * Gets the facturasAgrupadas value for this FacturaRespuestaType.
     * 
     * @return facturasAgrupadas
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaARType[] getFacturasAgrupadas() {
        return facturasAgrupadas;
    }


    /**
     * Sets the facturasAgrupadas value for this FacturaRespuestaType.
     * 
     * @param facturasAgrupadas
     */
    public void setFacturasAgrupadas(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaARType[] facturasAgrupadas) {
        this.facturasAgrupadas = facturasAgrupadas;
    }


    /**
     * Gets the facturasRectificadas value for this FacturaRespuestaType.
     * 
     * @return facturasRectificadas
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaARType[] getFacturasRectificadas() {
        return facturasRectificadas;
    }


    /**
     * Sets the facturasRectificadas value for this FacturaRespuestaType.
     * 
     * @param facturasRectificadas
     */
    public void setFacturasRectificadas(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDFacturaARType[] facturasRectificadas) {
        this.facturasRectificadas = facturasRectificadas;
    }


    /**
     * Gets the importeRectificacion value for this FacturaRespuestaType.
     * 
     * @return importeRectificacion
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DesgloseRectificacionType getImporteRectificacion() {
        return importeRectificacion;
    }


    /**
     * Sets the importeRectificacion value for this FacturaRespuestaType.
     * 
     * @param importeRectificacion
     */
    public void setImporteRectificacion(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.DesgloseRectificacionType importeRectificacion) {
        this.importeRectificacion = importeRectificacion;
    }


    /**
     * Gets the fechaOperacion value for this FacturaRespuestaType.
     * 
     * @return fechaOperacion
     */
    public java.lang.String getFechaOperacion() {
        return fechaOperacion;
    }


    /**
     * Sets the fechaOperacion value for this FacturaRespuestaType.
     * 
     * @param fechaOperacion
     */
    public void setFechaOperacion(java.lang.String fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }


    /**
     * Gets the claveRegimenEspecialOTrascendencia value for this FacturaRespuestaType.
     * 
     * @return claveRegimenEspecialOTrascendencia
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType getClaveRegimenEspecialOTrascendencia() {
        return claveRegimenEspecialOTrascendencia;
    }


    /**
     * Sets the claveRegimenEspecialOTrascendencia value for this FacturaRespuestaType.
     * 
     * @param claveRegimenEspecialOTrascendencia
     */
    public void setClaveRegimenEspecialOTrascendencia(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType claveRegimenEspecialOTrascendencia) {
        this.claveRegimenEspecialOTrascendencia = claveRegimenEspecialOTrascendencia;
    }


    /**
     * Gets the claveRegimenEspecialOTrascendenciaAdicional1 value for this FacturaRespuestaType.
     * 
     * @return claveRegimenEspecialOTrascendenciaAdicional1
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType getClaveRegimenEspecialOTrascendenciaAdicional1() {
        return claveRegimenEspecialOTrascendenciaAdicional1;
    }


    /**
     * Sets the claveRegimenEspecialOTrascendenciaAdicional1 value for this FacturaRespuestaType.
     * 
     * @param claveRegimenEspecialOTrascendenciaAdicional1
     */
    public void setClaveRegimenEspecialOTrascendenciaAdicional1(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType claveRegimenEspecialOTrascendenciaAdicional1) {
        this.claveRegimenEspecialOTrascendenciaAdicional1 = claveRegimenEspecialOTrascendenciaAdicional1;
    }


    /**
     * Gets the claveRegimenEspecialOTrascendenciaAdicional2 value for this FacturaRespuestaType.
     * 
     * @return claveRegimenEspecialOTrascendenciaAdicional2
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType getClaveRegimenEspecialOTrascendenciaAdicional2() {
        return claveRegimenEspecialOTrascendenciaAdicional2;
    }


    /**
     * Sets the claveRegimenEspecialOTrascendenciaAdicional2 value for this FacturaRespuestaType.
     * 
     * @param claveRegimenEspecialOTrascendenciaAdicional2
     */
    public void setClaveRegimenEspecialOTrascendenciaAdicional2(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IdOperacionesTrascendenciaTributariaType claveRegimenEspecialOTrascendenciaAdicional2) {
        this.claveRegimenEspecialOTrascendenciaAdicional2 = claveRegimenEspecialOTrascendenciaAdicional2;
    }


    /**
     * Gets the numRegistroAcuerdoFacturacion value for this FacturaRespuestaType.
     * 
     * @return numRegistroAcuerdoFacturacion
     */
    public java.lang.String getNumRegistroAcuerdoFacturacion() {
        return numRegistroAcuerdoFacturacion;
    }


    /**
     * Sets the numRegistroAcuerdoFacturacion value for this FacturaRespuestaType.
     * 
     * @param numRegistroAcuerdoFacturacion
     */
    public void setNumRegistroAcuerdoFacturacion(java.lang.String numRegistroAcuerdoFacturacion) {
        this.numRegistroAcuerdoFacturacion = numRegistroAcuerdoFacturacion;
    }


    /**
     * Gets the importeTotal value for this FacturaRespuestaType.
     * 
     * @return importeTotal
     */
    public java.lang.String getImporteTotal() {
        return importeTotal;
    }


    /**
     * Sets the importeTotal value for this FacturaRespuestaType.
     * 
     * @param importeTotal
     */
    public void setImporteTotal(java.lang.String importeTotal) {
        this.importeTotal = importeTotal;
    }


    /**
     * Gets the baseImponibleACoste value for this FacturaRespuestaType.
     * 
     * @return baseImponibleACoste
     */
    public java.lang.String getBaseImponibleACoste() {
        return baseImponibleACoste;
    }


    /**
     * Sets the baseImponibleACoste value for this FacturaRespuestaType.
     * 
     * @param baseImponibleACoste
     */
    public void setBaseImponibleACoste(java.lang.String baseImponibleACoste) {
        this.baseImponibleACoste = baseImponibleACoste;
    }


    /**
     * Gets the descripcionOperacion value for this FacturaRespuestaType.
     * 
     * @return descripcionOperacion
     */
    public java.lang.String getDescripcionOperacion() {
        return descripcionOperacion;
    }


    /**
     * Sets the descripcionOperacion value for this FacturaRespuestaType.
     * 
     * @param descripcionOperacion
     */
    public void setDescripcionOperacion(java.lang.String descripcionOperacion) {
        this.descripcionOperacion = descripcionOperacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FacturaRespuestaType)) return false;
        FacturaRespuestaType other = (FacturaRespuestaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoFactura==null && other.getTipoFactura()==null) || 
             (this.tipoFactura!=null &&
              this.tipoFactura.equals(other.getTipoFactura()))) &&
            ((this.tipoRectificativa==null && other.getTipoRectificativa()==null) || 
             (this.tipoRectificativa!=null &&
              this.tipoRectificativa.equals(other.getTipoRectificativa()))) &&
            ((this.facturasAgrupadas==null && other.getFacturasAgrupadas()==null) || 
             (this.facturasAgrupadas!=null &&
              java.util.Arrays.equals(this.facturasAgrupadas, other.getFacturasAgrupadas()))) &&
            ((this.facturasRectificadas==null && other.getFacturasRectificadas()==null) || 
             (this.facturasRectificadas!=null &&
              java.util.Arrays.equals(this.facturasRectificadas, other.getFacturasRectificadas()))) &&
            ((this.importeRectificacion==null && other.getImporteRectificacion()==null) || 
             (this.importeRectificacion!=null &&
              this.importeRectificacion.equals(other.getImporteRectificacion()))) &&
            ((this.fechaOperacion==null && other.getFechaOperacion()==null) || 
             (this.fechaOperacion!=null &&
              this.fechaOperacion.equals(other.getFechaOperacion()))) &&
            ((this.claveRegimenEspecialOTrascendencia==null && other.getClaveRegimenEspecialOTrascendencia()==null) || 
             (this.claveRegimenEspecialOTrascendencia!=null &&
              this.claveRegimenEspecialOTrascendencia.equals(other.getClaveRegimenEspecialOTrascendencia()))) &&
            ((this.claveRegimenEspecialOTrascendenciaAdicional1==null && other.getClaveRegimenEspecialOTrascendenciaAdicional1()==null) || 
             (this.claveRegimenEspecialOTrascendenciaAdicional1!=null &&
              this.claveRegimenEspecialOTrascendenciaAdicional1.equals(other.getClaveRegimenEspecialOTrascendenciaAdicional1()))) &&
            ((this.claveRegimenEspecialOTrascendenciaAdicional2==null && other.getClaveRegimenEspecialOTrascendenciaAdicional2()==null) || 
             (this.claveRegimenEspecialOTrascendenciaAdicional2!=null &&
              this.claveRegimenEspecialOTrascendenciaAdicional2.equals(other.getClaveRegimenEspecialOTrascendenciaAdicional2()))) &&
            ((this.numRegistroAcuerdoFacturacion==null && other.getNumRegistroAcuerdoFacturacion()==null) || 
             (this.numRegistroAcuerdoFacturacion!=null &&
              this.numRegistroAcuerdoFacturacion.equals(other.getNumRegistroAcuerdoFacturacion()))) &&
            ((this.importeTotal==null && other.getImporteTotal()==null) || 
             (this.importeTotal!=null &&
              this.importeTotal.equals(other.getImporteTotal()))) &&
            ((this.baseImponibleACoste==null && other.getBaseImponibleACoste()==null) || 
             (this.baseImponibleACoste!=null &&
              this.baseImponibleACoste.equals(other.getBaseImponibleACoste()))) &&
            ((this.descripcionOperacion==null && other.getDescripcionOperacion()==null) || 
             (this.descripcionOperacion!=null &&
              this.descripcionOperacion.equals(other.getDescripcionOperacion())));
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
        if (getTipoFactura() != null) {
            _hashCode += getTipoFactura().hashCode();
        }
        if (getTipoRectificativa() != null) {
            _hashCode += getTipoRectificativa().hashCode();
        }
        if (getFacturasAgrupadas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFacturasAgrupadas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFacturasAgrupadas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFacturasRectificadas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFacturasRectificadas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFacturasRectificadas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImporteRectificacion() != null) {
            _hashCode += getImporteRectificacion().hashCode();
        }
        if (getFechaOperacion() != null) {
            _hashCode += getFechaOperacion().hashCode();
        }
        if (getClaveRegimenEspecialOTrascendencia() != null) {
            _hashCode += getClaveRegimenEspecialOTrascendencia().hashCode();
        }
        if (getClaveRegimenEspecialOTrascendenciaAdicional1() != null) {
            _hashCode += getClaveRegimenEspecialOTrascendenciaAdicional1().hashCode();
        }
        if (getClaveRegimenEspecialOTrascendenciaAdicional2() != null) {
            _hashCode += getClaveRegimenEspecialOTrascendenciaAdicional2().hashCode();
        }
        if (getNumRegistroAcuerdoFacturacion() != null) {
            _hashCode += getNumRegistroAcuerdoFacturacion().hashCode();
        }
        if (getImporteTotal() != null) {
            _hashCode += getImporteTotal().hashCode();
        }
        if (getBaseImponibleACoste() != null) {
            _hashCode += getBaseImponibleACoste().hashCode();
        }
        if (getDescripcionOperacion() != null) {
            _hashCode += getDescripcionOperacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FacturaRespuestaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "FacturaRespuestaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "TipoFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ClaveTipoFacturaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRectificativa");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "TipoRectificativa"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ClaveTipoRectificativaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facturasAgrupadas");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "FacturasAgrupadas"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDFacturaARType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "IDFacturaAgrupada"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facturasRectificadas");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "FacturasRectificadas"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDFacturaARType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "IDFacturaRectificada"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importeRectificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "ImporteRectificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "DesgloseRectificacionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "FechaOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveRegimenEspecialOTrascendencia");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "ClaveRegimenEspecialOTrascendencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IdOperacionesTrascendenciaTributariaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveRegimenEspecialOTrascendenciaAdicional1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "ClaveRegimenEspecialOTrascendenciaAdicional1"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IdOperacionesTrascendenciaTributariaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveRegimenEspecialOTrascendenciaAdicional2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "ClaveRegimenEspecialOTrascendenciaAdicional2"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IdOperacionesTrascendenciaTributariaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRegistroAcuerdoFacturacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "NumRegistroAcuerdoFacturacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importeTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "ImporteTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseImponibleACoste");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "BaseImponibleACoste"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "DescripcionOperacion"));
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
