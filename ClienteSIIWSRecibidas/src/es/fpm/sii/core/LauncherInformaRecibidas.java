package es.fpm.sii.core;

import java.security.KeyStore;

import javax.net.ssl.KeyManagerFactory;
import javax.servlet.http.Part;

import es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiSOAPProxy;
import es.gob.agenciatributaria.www2.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.SuministroFactRecibidas_wsdl.SiiServiceLocator;

public class LauncherInformaRecibidas {
	public String informaRecibidas(Part filePart){
		String resultado;
		
		//invoca el servicio
		
		
		resultado ="ok";
		return resultado;
	}
	
	private void invocaWS (){
		KeyStore keyStore = KeyStore.getInstance("Windows-MY");
		keyStore.load(null, null);

		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(keyStore, null);

		TLSClientParameters tlsParams = new TLSClientParameters();
		tlsParams.setSecureSocketProtocol("TLS");
		tlsParams.setKeyManagers(kmf.getKeyManagers());

		SiiServiceLocator service = new SiiServiceLocator();
		SiiSOAPProxy soapProxy = (SiiSOAPProxy) service.getSuministroFactRecibidasPruebas();
		((HTTPConduit)ClientProxy.getClient(soap).getConduit()).setTlsClientParameters(tlsParams);
	}
	
	private void mapeoFichero (Part filePart){
		
	}

}
