/**
 * TipoPeriodoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class TipoPeriodoType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TipoPeriodoType(java.lang.String value) {
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
    public static final java.lang.String _value13 = "0A";
    public static final TipoPeriodoType value1 = new TipoPeriodoType(_value1);
    public static final TipoPeriodoType value2 = new TipoPeriodoType(_value2);
    public static final TipoPeriodoType value3 = new TipoPeriodoType(_value3);
    public static final TipoPeriodoType value4 = new TipoPeriodoType(_value4);
    public static final TipoPeriodoType value5 = new TipoPeriodoType(_value5);
    public static final TipoPeriodoType value6 = new TipoPeriodoType(_value6);
    public static final TipoPeriodoType value7 = new TipoPeriodoType(_value7);
    public static final TipoPeriodoType value8 = new TipoPeriodoType(_value8);
    public static final TipoPeriodoType value9 = new TipoPeriodoType(_value9);
    public static final TipoPeriodoType value10 = new TipoPeriodoType(_value10);
    public static final TipoPeriodoType value11 = new TipoPeriodoType(_value11);
    public static final TipoPeriodoType value12 = new TipoPeriodoType(_value12);
    public static final TipoPeriodoType value13 = new TipoPeriodoType(_value13);
    public java.lang.String getValue() { return _value_;}
    public static TipoPeriodoType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoPeriodoType enumeration = (TipoPeriodoType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoPeriodoType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TipoPeriodoType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "TipoPeriodoType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
