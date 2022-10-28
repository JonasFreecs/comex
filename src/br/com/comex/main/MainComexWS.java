package br.com.comex.main;

import javax.xml.ws.Endpoint;

import br.com.comex.ws.ComexWS;

public class MainComexWS {
	public static void main(String[] args) {
		
		ComexWS service = new ComexWS();
		String url = "http://0.0.0.0:8080/ComexWS";

		Endpoint.publish(url, service);
		System.out.println("Publicou");
		//System.out.println("Conexão realizada");
	}
}
