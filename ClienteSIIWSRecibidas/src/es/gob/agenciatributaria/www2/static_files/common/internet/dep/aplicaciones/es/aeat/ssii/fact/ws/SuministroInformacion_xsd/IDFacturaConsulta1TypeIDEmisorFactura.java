/**
 * IDFacturaConsulta1TypeIDEmisorFactura.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class IDFacturaConsulta1TypeIDEmisorFactura  implements java.io.Serializable {
    private java.lang.String nombreRazon;

    private java.lang.String NIF;

    private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDOtroType IDOtro;

    public IDFacturaConsulta1TypeIDEmisorFactura() {
    }

    public IDFacturaConsulta1TypeIDEmisorFactura(
           java.lang.String nombreRazon,
           java.lang.String NIF,
           es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDOtroType IDOtro) {
           this.nombreRazon = nombreRazon;
           this.NIF = NIF;
           this.IDOtro = IDOtro;
    }


    /**
     * Gets the nombreRazon value for this IDFacturaConsulta1TypeIDEmisorFactura.
     * 
     * @return nombreRazon
     */
    public java.lang.String getNombreRazon() {
        return nombreRazon;
    }


    /**
     * Sets the nombreRazon value for this IDFacturaConsulta1TypeIDEmisorFactura.
     * 
     * @param nombreRazon
     */
    public void setNombreRazon(java.lang.String nombreRazon) {
        this.nombreRazon = nombreRazon;
    }


    /**
     * Gets the NIF value for this IDFacturaConsulta1TypeIDEmisorFactura.
     * 
     * @return NIF
     */
    public java.lang.String getNIF() {
        return NIF;
    }


    /**
     * Sets the NIF value for this IDFacturaConsulta1TypeIDEmisorFactura.
     * 
     * @param NIF
     */
    public void setNIF(java.lang.String NIF) {
        this.NIF = NIF;
    }


    /**
     * Gets the IDOtro value for this IDFacturaConsulta1TypeIDEmisorFactura.
     * 
     * @return IDOtro
     */
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDOtroType getIDOtro() {
        return IDOtro;
    }


    /**
     * Sets the IDOtro value for this IDFacturaConsulta1TypeIDEmisorFactura.
     * 
     * @param IDOtro
     */
    public void setIDOtro(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd.IDOtroType IDOtro) {
        this.IDOtro = IDOtro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IDFacturaConsulta1TypeIDEmisorFactura)) return false;
        IDFacturaConsulta1TypeIDEmisorFactura other = (IDFacturaConsulta1TypeIDEmisorFactura) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombreRazon==null && other.getNombreRazon()==null) || 
             (this.nombreRazon!=null &&
              this.nombreRazon.equals(other.getNombreRazon()))) &&
            ((this.NIF==null && other.getNIF()==null) || 
             (this.NIF!=null &&
              this.NIF.equals(other.getNIF()))) &&
            ((this.IDOtro==null && other.getIDOtro()==null) || 
             (this.IDOtro!=null &&
              this.IDOtro.equals(other.getIDOtro())));
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
        if (getNombreRazon() != null) {
            _hashCode += getNombreRazon().hashCode();
        }
        if (getNIF() != null) {
            _hashCode += getNIF().hashCode();
        }
        if (getIDOtro() != null) {
            _hashCode += getIDOtro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IDFacturaConsulta1TypeIDEmisorFactura.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", ">IDFacturaConsulta1Type>IDEmisorFactura"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreRazon");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "NombreRazon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIF");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "NIF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDOtro");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDOtro"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IDOtroType"));
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
