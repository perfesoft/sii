/**
 * OperacionIntracomunitariaTypeTipoOperacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class OperacionIntracomunitariaTypeTipoOperacion implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OperacionIntracomunitariaTypeTipoOperacion(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _A = "A";
    public static final java.lang.String _B = "B";
    public static final OperacionIntracomunitariaTypeTipoOperacion A = new OperacionIntracomunitariaTypeTipoOperacion(_A);
    public static final OperacionIntracomunitariaTypeTipoOperacion B = new OperacionIntracomunitariaTypeTipoOperacion(_B);
    public java.lang.String getValue() { return _value_;}
    public static OperacionIntracomunitariaTypeTipoOperacion fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OperacionIntracomunitariaTypeTipoOperacion enumeration = (OperacionIntracomunitariaTypeTipoOperacion)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OperacionIntracomunitariaTypeTipoOperacion fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OperacionIntracomunitariaTypeTipoOperacion.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", ">OperacionIntracomunitariaType>TipoOperacion"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
