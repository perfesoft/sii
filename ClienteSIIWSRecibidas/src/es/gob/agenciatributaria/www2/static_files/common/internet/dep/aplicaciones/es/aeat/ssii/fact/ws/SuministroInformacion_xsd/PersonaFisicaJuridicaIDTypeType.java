/**
 * PersonaFisicaJuridicaIDTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class PersonaFisicaJuridicaIDTypeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PersonaFisicaJuridicaIDTypeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "02";
    public static final java.lang.String _value2 = "03";
    public static final java.lang.String _value3 = "04";
    public static final java.lang.String _value4 = "05";
    public static final java.lang.String _value5 = "06";
    public static final java.lang.String _value6 = "07";
    public static final PersonaFisicaJuridicaIDTypeType value1 = new PersonaFisicaJuridicaIDTypeType(_value1);
    public static final PersonaFisicaJuridicaIDTypeType value2 = new PersonaFisicaJuridicaIDTypeType(_value2);
    public static final PersonaFisicaJuridicaIDTypeType value3 = new PersonaFisicaJuridicaIDTypeType(_value3);
    public static final PersonaFisicaJuridicaIDTypeType value4 = new PersonaFisicaJuridicaIDTypeType(_value4);
    public static final PersonaFisicaJuridicaIDTypeType value5 = new PersonaFisicaJuridicaIDTypeType(_value5);
    public static final PersonaFisicaJuridicaIDTypeType value6 = new PersonaFisicaJuridicaIDTypeType(_value6);
    public java.lang.String getValue() { return _value_;}
    public static PersonaFisicaJuridicaIDTypeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PersonaFisicaJuridicaIDTypeType enumeration = (PersonaFisicaJuridicaIDTypeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PersonaFisicaJuridicaIDTypeType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonaFisicaJuridicaIDTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "PersonaFisicaJuridicaIDTypeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
