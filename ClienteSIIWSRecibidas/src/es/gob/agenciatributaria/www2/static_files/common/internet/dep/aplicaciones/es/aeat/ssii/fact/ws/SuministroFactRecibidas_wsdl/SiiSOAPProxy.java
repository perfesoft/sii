package es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl;

public class SiiSOAPProxy implements es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP {
  private String _endpoint = null;
  private es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP siiSOAP = null;
  
  public SiiSOAPProxy() {
    _initSiiSOAPProxy();
  }
  
  public SiiSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initSiiSOAPProxy();
  }
  
  private void _initSiiSOAPProxy() {
    try {
      siiSOAP = (new es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiServiceLocator()).getSuministroFactRecibidas();
      if (siiSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)siiSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)siiSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (siiSOAP != null)
      ((javax.xml.rpc.Stub)siiSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAP getSiiSOAP() {
    if (siiSOAP == null)
      _initSiiSOAPProxy();
    return siiSOAP;
  }
  
  public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaLRFRecibidasType suministroLRFacturasRecibidas(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.SuministroLRFacturasRecibidas suministroLRFacturasRecibidas) throws java.rmi.RemoteException{
    if (siiSOAP == null)
      _initSiiSOAPProxy();
    return siiSOAP.suministroLRFacturasRecibidas(suministroLRFacturasRecibidas);
  }
  
  public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaSuministro_xsd.RespuestaLRBajaFRecibidasType anulacionLRFacturasRecibidas(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroLR_xsd.BajaLRFacturasRecibidas anulacionLRFacturasRecibidas) throws java.rmi.RemoteException{
    if (siiSOAP == null)
      _initSiiSOAPProxy();
    return siiSOAP.anulacionLRFacturasRecibidas(anulacionLRFacturasRecibidas);
  }
  
  public es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.RespuestaConsultaLR_xsd.RespuestaConsultaLRFacturasRecibidasType consultaLRFacturasRecibidas(es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.ConsultaLR_xsd.LRConsultaRecibidasType consultaLRFacturasRecibidas) throws java.rmi.RemoteException{
    if (siiSOAP == null)
      _initSiiSOAPProxy();
    return siiSOAP.consultaLRFacturasRecibidas(consultaLRFacturasRecibidas);
  }
  
  
}