/**
 * CountryMiembroType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroInformacion_xsd;

public class CountryMiembroType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CountryMiembroType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DE = "DE";
    public static final java.lang.String _AT = "AT";
    public static final java.lang.String _BE = "BE";
    public static final java.lang.String _BG = "BG";
    public static final java.lang.String _CZ = "CZ";
    public static final java.lang.String _CY = "CY";
    public static final java.lang.String _HR = "HR";
    public static final java.lang.String _DK = "DK";
    public static final java.lang.String _SK = "SK";
    public static final java.lang.String _SI = "SI";
    public static final java.lang.String _EE = "EE";
    public static final java.lang.String _FI = "FI";
    public static final java.lang.String _FR = "FR";
    public static final java.lang.String _GR = "GR";
    public static final java.lang.String _HU = "HU";
    public static final java.lang.String _IE = "IE";
    public static final java.lang.String _IT = "IT";
    public static final java.lang.String _LV = "LV";
    public static final java.lang.String _LT = "LT";
    public static final java.lang.String _LU = "LU";
    public static final java.lang.String _MT = "MT";
    public static final java.lang.String _NL = "NL";
    public static final java.lang.String _PL = "PL";
    public static final java.lang.String _PT = "PT";
    public static final java.lang.String _GB = "GB";
    public static final java.lang.String _RO = "RO";
    public static final java.lang.String _SE = "SE";
    public static final CountryMiembroType DE = new CountryMiembroType(_DE);
    public static final CountryMiembroType AT = new CountryMiembroType(_AT);
    public static final CountryMiembroType BE = new CountryMiembroType(_BE);
    public static final CountryMiembroType BG = new CountryMiembroType(_BG);
    public static final CountryMiembroType CZ = new CountryMiembroType(_CZ);
    public static final CountryMiembroType CY = new CountryMiembroType(_CY);
    public static final CountryMiembroType HR = new CountryMiembroType(_HR);
    public static final CountryMiembroType DK = new CountryMiembroType(_DK);
    public static final CountryMiembroType SK = new CountryMiembroType(_SK);
    public static final CountryMiembroType SI = new CountryMiembroType(_SI);
    public static final CountryMiembroType EE = new CountryMiembroType(_EE);
    public static final CountryMiembroType FI = new CountryMiembroType(_FI);
    public static final CountryMiembroType FR = new CountryMiembroType(_FR);
    public static final CountryMiembroType GR = new CountryMiembroType(_GR);
    public static final CountryMiembroType HU = new CountryMiembroType(_HU);
    public static final CountryMiembroType IE = new CountryMiembroType(_IE);
    public static final CountryMiembroType IT = new CountryMiembroType(_IT);
    public static final CountryMiembroType LV = new CountryMiembroType(_LV);
    public static final CountryMiembroType LT = new CountryMiembroType(_LT);
    public static final CountryMiembroType LU = new CountryMiembroType(_LU);
    public static final CountryMiembroType MT = new CountryMiembroType(_MT);
    public static final CountryMiembroType NL = new CountryMiembroType(_NL);
    public static final CountryMiembroType PL = new CountryMiembroType(_PL);
    public static final CountryMiembroType PT = new CountryMiembroType(_PT);
    public static final CountryMiembroType GB = new CountryMiembroType(_GB);
    public static final CountryMiembroType RO = new CountryMiembroType(_RO);
    public static final CountryMiembroType SE = new CountryMiembroType(_SE);
    public java.lang.String getValue() { return _value_;}
    public static CountryMiembroType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CountryMiembroType enumeration = (CountryMiembroType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CountryMiembroType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CountryMiembroType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd", "CountryMiembroType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
