/**
 * DatosDescuadreContraparteType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd;

public class DatosDescuadreContraparteType  implements java.io.Serializable {
    private java.lang.String sumBaseImponibleISP;

    private java.lang.String sumBaseImponible;

    private java.lang.String sumCuota;

    private java.lang.String sumCuotaRecargoEquivalencia;

    private java.lang.String importeTotal;

    public DatosDescuadreContraparteType() {
    }

    public DatosDescuadreContraparteType(
           java.lang.String sumBaseImponibleISP,
           java.lang.String sumBaseImponible,
           java.lang.String sumCuota,
           java.lang.String sumCuotaRecargoEquivalencia,
           java.lang.String importeTotal) {
           this.sumBaseImponibleISP = sumBaseImponibleISP;
           this.sumBaseImponible = sumBaseImponible;
           this.sumCuota = sumCuota;
           this.sumCuotaRecargoEquivalencia = sumCuotaRecargoEquivalencia;
           this.importeTotal = importeTotal;
    }


    /**
     * Gets the sumBaseImponibleISP value for this DatosDescuadreContraparteType.
     * 
     * @return sumBaseImponibleISP
     */
    public java.lang.String getSumBaseImponibleISP() {
        return sumBaseImponibleISP;
    }


    /**
     * Sets the sumBaseImponibleISP value for this DatosDescuadreContraparteType.
     * 
     * @param sumBaseImponibleISP
     */
    public void setSumBaseImponibleISP(java.lang.String sumBaseImponibleISP) {
        this.sumBaseImponibleISP = sumBaseImponibleISP;
    }


    /**
     * Gets the sumBaseImponible value for this DatosDescuadreContraparteType.
     * 
     * @return sumBaseImponible
     */
    public java.lang.String getSumBaseImponible() {
        return sumBaseImponible;
    }


    /**
     * Sets the sumBaseImponible value for this DatosDescuadreContraparteType.
     * 
     * @param sumBaseImponible
     */
    public void setSumBaseImponible(java.lang.String sumBaseImponible) {
        this.sumBaseImponible = sumBaseImponible;
    }


    /**
     * Gets the sumCuota value for this DatosDescuadreContraparteType.
     * 
     * @return sumCuota
     */
    public java.lang.String getSumCuota() {
        return sumCuota;
    }


    /**
     * Sets the sumCuota value for this DatosDescuadreContraparteType.
     * 
     * @param sumCuota
     */
    public void setSumCuota(java.lang.String sumCuota) {
        this.sumCuota = sumCuota;
    }


    /**
     * Gets the sumCuotaRecargoEquivalencia value for this DatosDescuadreContraparteType.
     * 
     * @return sumCuotaRecargoEquivalencia
     */
    public java.lang.String getSumCuotaRecargoEquivalencia() {
        return sumCuotaRecargoEquivalencia;
    }


    /**
     * Sets the sumCuotaRecargoEquivalencia value for this DatosDescuadreContraparteType.
     * 
     * @param sumCuotaRecargoEquivalencia
     */
    public void setSumCuotaRecargoEquivalencia(java.lang.String sumCuotaRecargoEquivalencia) {
        this.sumCuotaRecargoEquivalencia = sumCuotaRecargoEquivalencia;
    }


    /**
     * Gets the importeTotal value for this DatosDescuadreContraparteType.
     * 
     * @return importeTotal
     */
    public java.lang.String getImporteTotal() {
        return importeTotal;
    }


    /**
     * Sets the importeTotal value for this DatosDescuadreContraparteType.
     * 
     * @param importeTotal
     */
    public void setImporteTotal(java.lang.String importeTotal) {
        this.importeTotal = importeTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosDescuadreContraparteType)) return false;
        DatosDescuadreContraparteType other = (DatosDescuadreContraparteType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sumBaseImponibleISP==null && other.getSumBaseImponibleISP()==null) || 
             (this.sumBaseImponibleISP!=null &&
              this.sumBaseImponibleISP.equals(other.getSumBaseImponibleISP()))) &&
            ((this.sumBaseImponible==null && other.getSumBaseImponible()==null) || 
             (this.sumBaseImponible!=null &&
              this.sumBaseImponible.equals(other.getSumBaseImponible()))) &&
            ((this.sumCuota==null && other.getSumCuota()==null) || 
             (this.sumCuota!=null &&
              this.sumCuota.equals(other.getSumCuota()))) &&
            ((this.sumCuotaRecargoEquivalencia==null && other.getSumCuotaRecargoEquivalencia()==null) || 
             (this.sumCuotaRecargoEquivalencia!=null &&
              this.sumCuotaRecargoEquivalencia.equals(other.getSumCuotaRecargoEquivalencia()))) &&
            ((this.importeTotal==null && other.getImporteTotal()==null) || 
             (this.importeTotal!=null &&
              this.importeTotal.equals(other.getImporteTotal())));
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
        if (getSumBaseImponibleISP() != null) {
            _hashCode += getSumBaseImponibleISP().hashCode();
        }
        if (getSumBaseImponible() != null) {
            _hashCode += getSumBaseImponible().hashCode();
        }
        if (getSumCuota() != null) {
            _hashCode += getSumCuota().hashCode();
        }
        if (getSumCuotaRecargoEquivalencia() != null) {
            _hashCode += getSumCuotaRecargoEquivalencia().hashCode();
        }
        if (getImporteTotal() != null) {
            _hashCode += getImporteTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosDescuadreContraparteType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "DatosDescuadreContraparteType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumBaseImponibleISP");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "SumBaseImponibleISP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumBaseImponible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "SumBaseImponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumCuota");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "SumCuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumCuotaRecargoEquivalencia");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd", "SumCuotaRecargoEquivalencia"));
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
