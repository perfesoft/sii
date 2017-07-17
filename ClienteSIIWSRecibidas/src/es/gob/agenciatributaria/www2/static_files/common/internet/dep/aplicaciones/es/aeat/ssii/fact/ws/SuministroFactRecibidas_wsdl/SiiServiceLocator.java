/**
 * SiiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl;

public class SiiServiceLocator extends org.apache.axis.client.Service implements es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiService {

    public SiiServiceLocator() {
    }


    public SiiServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SiiServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SuministroFactRecibidas
    private java.lang.String SuministroFactRecibidas_address = "https://www1.agenciatributaria.gob.es/wlpl/SSII-FACT/ws/fr/SiiFactFRV1SOAP";

    public java.lang.String getSuministroFactRecibidasAddress() {
        return SuministroFactRecibidas_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SuministroFactRecibidasWSDDServiceName = "SuministroFactRecibidas";

    public java.lang.String getSuministroFactRecibidasWSDDServiceName() {
        return SuministroFactRecibidasWSDDServiceName;
    }

    public void setSuministroFactRecibidasWSDDServiceName(java.lang.String name) {
        SuministroFactRecibidasWSDDServiceName = name;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP getSuministroFactRecibidas() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SuministroFactRecibidas_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSuministroFactRecibidas(endpoint);
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP getSuministroFactRecibidas(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub _stub = new es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub(portAddress, this);
            _stub.setPortName(getSuministroFactRecibidasWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSuministroFactRecibidasEndpointAddress(java.lang.String address) {
        SuministroFactRecibidas_address = address;
    }


    // Use to get a proxy class for SuministroFactRecibidasPruebas
    private java.lang.String SuministroFactRecibidasPruebas_address = "https://www7.aeat.es/wlpl/SSII-FACT/ws/fr/SiiFactFRV1SOAP";

    public java.lang.String getSuministroFactRecibidasPruebasAddress() {
        return SuministroFactRecibidasPruebas_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SuministroFactRecibidasPruebasWSDDServiceName = "SuministroFactRecibidasPruebas";

    public java.lang.String getSuministroFactRecibidasPruebasWSDDServiceName() {
        return SuministroFactRecibidasPruebasWSDDServiceName;
    }

    public void setSuministroFactRecibidasPruebasWSDDServiceName(java.lang.String name) {
        SuministroFactRecibidasPruebasWSDDServiceName = name;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP getSuministroFactRecibidasPruebas() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SuministroFactRecibidasPruebas_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSuministroFactRecibidasPruebas(endpoint);
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP getSuministroFactRecibidasPruebas(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub _stub = new es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub(portAddress, this);
            _stub.setPortName(getSuministroFactRecibidasPruebasWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSuministroFactRecibidasPruebasEndpointAddress(java.lang.String address) {
        SuministroFactRecibidasPruebas_address = address;
    }


    // Use to get a proxy class for SuministroFactRecibidasSello
    private java.lang.String SuministroFactRecibidasSello_address = "https://www10.agenciatributaria.gob.es/wlpl/SSII-FACT/ws/fr/SiiFactFRV1SOAP";

    public java.lang.String getSuministroFactRecibidasSelloAddress() {
        return SuministroFactRecibidasSello_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SuministroFactRecibidasSelloWSDDServiceName = "SuministroFactRecibidasSello";

    public java.lang.String getSuministroFactRecibidasSelloWSDDServiceName() {
        return SuministroFactRecibidasSelloWSDDServiceName;
    }

    public void setSuministroFactRecibidasSelloWSDDServiceName(java.lang.String name) {
        SuministroFactRecibidasSelloWSDDServiceName = name;
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP getSuministroFactRecibidasSello() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SuministroFactRecibidasSello_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSuministroFactRecibidasSello(endpoint);
    }

    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP getSuministroFactRecibidasSello(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub _stub = new es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub(portAddress, this);
            _stub.setPortName(getSuministroFactRecibidasSelloWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSuministroFactRecibidasSelloEndpointAddress(java.lang.String address) {
        SuministroFactRecibidasSello_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP.class.isAssignableFrom(serviceEndpointInterface)) {
                es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub _stub = new es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub(new java.net.URL(SuministroFactRecibidas_address), this);
                _stub.setPortName(getSuministroFactRecibidasWSDDServiceName());
                return _stub;
            }
            if (es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP.class.isAssignableFrom(serviceEndpointInterface)) {
                es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub _stub = new es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub(new java.net.URL(SuministroFactRecibidasPruebas_address), this);
                _stub.setPortName(getSuministroFactRecibidasPruebasWSDDServiceName());
                return _stub;
            }
            if (es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP.class.isAssignableFrom(serviceEndpointInterface)) {
                es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub _stub = new es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiBindingStub(new java.net.URL(SuministroFactRecibidasSello_address), this);
                _stub.setPortName(getSuministroFactRecibidasSelloWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SuministroFactRecibidas".equals(inputPortName)) {
            return getSuministroFactRecibidas();
        }
        else if ("SuministroFactRecibidasPruebas".equals(inputPortName)) {
            return getSuministroFactRecibidasPruebas();
        }
        else if ("SuministroFactRecibidasSello".equals(inputPortName)) {
            return getSuministroFactRecibidasSello();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroFactRecibidas.wsdl", "siiService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroFactRecibidas.wsdl", "SuministroFactRecibidas"));
            ports.add(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroFactRecibidas.wsdl", "SuministroFactRecibidasPruebas"));
            ports.add(new javax.xml.namespace.QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroFactRecibidas.wsdl", "SuministroFactRecibidasSello"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SuministroFactRecibidas".equals(portName)) {
            setSuministroFactRecibidasEndpointAddress(address);
        }
        else 
if ("SuministroFactRecibidasPruebas".equals(portName)) {
            setSuministroFactRecibidasPruebasEndpointAddress(address);
        }
        else 
if ("SuministroFactRecibidasSello".equals(portName)) {
            setSuministroFactRecibidasSelloEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
