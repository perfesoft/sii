/**
 * SiiSOAP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl;

public interface SiiSOAP extends java.rmi.Remote {
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaLRFRecibidasType suministroLRFacturasRecibidas(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.SuministroLRFacturasRecibidas suministroLRFacturasRecibidas) throws java.rmi.RemoteException;
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaLRBajaFRecibidasType anulacionLRFacturasRecibidas(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.BajaLRFacturasRecibidas anulacionLRFacturasRecibidas) throws java.rmi.RemoteException;
    public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaConsultaLRFacturasRecibidasType consultaLRFacturasRecibidas(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd.LRConsultaRecibidasType consultaLRFacturasRecibidas) throws java.rmi.RemoteException;
}
