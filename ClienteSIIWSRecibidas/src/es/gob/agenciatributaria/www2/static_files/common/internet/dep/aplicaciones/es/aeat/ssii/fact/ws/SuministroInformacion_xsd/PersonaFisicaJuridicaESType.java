/**
 * PersonaFisicaJuridicaESType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;


/**
 * Datos de una persona física o jurídica Española con un NIF asociado
 */
public class PersonaFisicaJuridicaESType  implements java.io.Serializable {
    private java.lang.String nombreRazon;

    private java.lang.String NIFRepresentante;

    private java.lang.String NIF;

    public PersonaFisicaJuridicaESType() {
    }

    public PersonaFisicaJuridicaESType(
           java.lang.String nombreRazon,
           java.lang.String NIFRepresentante,
           java.lang.String NIF) {
           this.nombreRazon = nombreRazon;
           this.NIFRepresentante = NIFRepresentante;
           this.NIF = NIF;
    }


    /**
     * Gets the nombreRazon value for this PersonaFisicaJuridicaESType.
     * 
     * @return nombreRazon
     */
    public java.lang.String getNombreRazon() {
        return nombreRazon;
    }


    /**
     * Sets the nombreRazon value for this PersonaFisicaJuridicaESType.
     * 
     * @param nombreRazon
     */
    public void setNombreRazon(java.lang.String nombreRazon) {
        this.nombreRazon = nombreRazon;
    }


    /**
     * Gets the NIFRepresentante value for this PersonaFisicaJuridicaESType.
     * 
     * @return NIFRepresentante
     */
    public java.lang.String getNIFRepresentante() {
        return NIFRepresentante;
    }


    /**
     * Sets the NIFRepresentante value for this PersonaFisicaJuridicaESType.
     * 
     * @param NIFRepresentante
     */
    public void setNIFRepresentante(java.lang.String NIFRepresentante) {
        this.NIFRepresentante = NIFRepresentante;
    }


    /**
     * Gets the NIF value for this PersonaFisicaJuridicaESType.
     * 
     * @return NIF
     */
    public java.lang.String getNIF() {
        return NIF;
    }


    /**
     * Sets the NIF value for this PersonaFisicaJuridicaESType.
     * 
     * @param NIF
     */
    public void setNIF(java.lang.String NIF) {
        this.NIF = NIF;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonaFisicaJuridicaESType)) return false;
        PersonaFisicaJuridicaESType other = (PersonaFisicaJuridicaESType) obj;
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
            ((this.NIFRepresentante==null && other.getNIFRepresentante()==null) || 
             (this.NIFRepresentante!=null &&
              this.NIFRepresentante.equals(other.getNIFRepresentante()))) &&
            ((this.NIF==null && other.getNIF()==null) || 
             (this.NIF!=null &&
              this.NIF.equals(other.getNIF())));
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
        if (getNIFRepresentante() != null) {
            _hashCode += getNIFRepresentante().hashCode();
        }
        if (getNIF() != null) {
            _hashCode += getNIF().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonaFisicaJuridicaESType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "PersonaFisicaJuridicaESType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreRazon");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "NombreRazon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIFRepresentante");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "NIFRepresentante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIF");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "NIF"));
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
