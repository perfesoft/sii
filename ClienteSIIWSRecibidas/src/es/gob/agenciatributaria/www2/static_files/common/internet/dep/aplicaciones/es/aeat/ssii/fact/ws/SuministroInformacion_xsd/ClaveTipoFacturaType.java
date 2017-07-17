/**
 * ClaveTipoFacturaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class ClaveTipoFacturaType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ClaveTipoFacturaType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _F1 = "F1";
    public static final java.lang.String _F2 = "F2";
    public static final java.lang.String _R1 = "R1";
    public static final java.lang.String _R2 = "R2";
    public static final java.lang.String _R3 = "R3";
    public static final java.lang.String _R4 = "R4";
    public static final java.lang.String _R5 = "R5";
    public static final java.lang.String _F3 = "F3";
    public static final java.lang.String _F4 = "F4";
    public static final java.lang.String _F5 = "F5";
    public static final java.lang.String _F6 = "F6";
    public static final ClaveTipoFacturaType F1 = new ClaveTipoFacturaType(_F1);
    public static final ClaveTipoFacturaType F2 = new ClaveTipoFacturaType(_F2);
    public static final ClaveTipoFacturaType R1 = new ClaveTipoFacturaType(_R1);
    public static final ClaveTipoFacturaType R2 = new ClaveTipoFacturaType(_R2);
    public static final ClaveTipoFacturaType R3 = new ClaveTipoFacturaType(_R3);
    public static final ClaveTipoFacturaType R4 = new ClaveTipoFacturaType(_R4);
    public static final ClaveTipoFacturaType R5 = new ClaveTipoFacturaType(_R5);
    public static final ClaveTipoFacturaType F3 = new ClaveTipoFacturaType(_F3);
    public static final ClaveTipoFacturaType F4 = new ClaveTipoFacturaType(_F4);
    public static final ClaveTipoFacturaType F5 = new ClaveTipoFacturaType(_F5);
    public static final ClaveTipoFacturaType F6 = new ClaveTipoFacturaType(_F6);
    public java.lang.String getValue() { return _value_;}
    public static ClaveTipoFacturaType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ClaveTipoFacturaType enumeration = (ClaveTipoFacturaType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ClaveTipoFacturaType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ClaveTipoFacturaType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "ClaveTipoFacturaType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
