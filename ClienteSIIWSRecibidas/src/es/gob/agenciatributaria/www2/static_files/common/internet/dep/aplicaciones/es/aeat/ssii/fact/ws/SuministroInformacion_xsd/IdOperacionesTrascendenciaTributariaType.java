/**
 * IdOperacionesTrascendenciaTributariaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class IdOperacionesTrascendenciaTributariaType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IdOperacionesTrascendenciaTributariaType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "01";
    public static final java.lang.String _value2 = "02";
    public static final java.lang.String _value3 = "03";
    public static final java.lang.String _value4 = "04";
    public static final java.lang.String _value5 = "05";
    public static final java.lang.String _value6 = "06";
    public static final java.lang.String _value7 = "07";
    public static final java.lang.String _value8 = "08";
    public static final java.lang.String _value9 = "09";
    public static final java.lang.String _value10 = "10";
    public static final java.lang.String _value11 = "11";
    public static final java.lang.String _value12 = "12";
    public static final java.lang.String _value13 = "13";
    public static final java.lang.String _value14 = "14";
    public static final java.lang.String _value15 = "15";
    public static final java.lang.String _value16 = "16";
    public static final IdOperacionesTrascendenciaTributariaType value1 = new IdOperacionesTrascendenciaTributariaType(_value1);
    public static final IdOperacionesTrascendenciaTributariaType value2 = new IdOperacionesTrascendenciaTributariaType(_value2);
    public static final IdOperacionesTrascendenciaTributariaType value3 = new IdOperacionesTrascendenciaTributariaType(_value3);
    public static final IdOperacionesTrascendenciaTributariaType value4 = new IdOperacionesTrascendenciaTributariaType(_value4);
    public static final IdOperacionesTrascendenciaTributariaType value5 = new IdOperacionesTrascendenciaTributariaType(_value5);
    public static final IdOperacionesTrascendenciaTributariaType value6 = new IdOperacionesTrascendenciaTributariaType(_value6);
    public static final IdOperacionesTrascendenciaTributariaType value7 = new IdOperacionesTrascendenciaTributariaType(_value7);
    public static final IdOperacionesTrascendenciaTributariaType value8 = new IdOperacionesTrascendenciaTributariaType(_value8);
    public static final IdOperacionesTrascendenciaTributariaType value9 = new IdOperacionesTrascendenciaTributariaType(_value9);
    public static final IdOperacionesTrascendenciaTributariaType value10 = new IdOperacionesTrascendenciaTributariaType(_value10);
    public static final IdOperacionesTrascendenciaTributariaType value11 = new IdOperacionesTrascendenciaTributariaType(_value11);
    public static final IdOperacionesTrascendenciaTributariaType value12 = new IdOperacionesTrascendenciaTributariaType(_value12);
    public static final IdOperacionesTrascendenciaTributariaType value13 = new IdOperacionesTrascendenciaTributariaType(_value13);
    public static final IdOperacionesTrascendenciaTributariaType value14 = new IdOperacionesTrascendenciaTributariaType(_value14);
    public static final IdOperacionesTrascendenciaTributariaType value15 = new IdOperacionesTrascendenciaTributariaType(_value15);
    public static final IdOperacionesTrascendenciaTributariaType value16 = new IdOperacionesTrascendenciaTributariaType(_value16);
    public java.lang.String getValue() { return _value_;}
    public static IdOperacionesTrascendenciaTributariaType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IdOperacionesTrascendenciaTributariaType enumeration = (IdOperacionesTrascendenciaTributariaType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IdOperacionesTrascendenciaTributariaType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IdOperacionesTrascendenciaTributariaType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "IdOperacionesTrascendenciaTributariaType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
