package controller;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jsoupobject {
	public String blogUrl;
	
	public jsoupobject() {
		
		blogUrl = "http://www.aire.cdmx.gob.mx/default.php";
	}
	
	public Document getHtml() {
		
		Document doc = null;
		try {
			doc = Jsoup.connect(blogUrl).get();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
		
	}
	
	
public clima getData() {
		Document doc = null;
		try {
			doc = Jsoup.connect(blogUrl).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clima clm = new clima();
		Elements dat = doc.select("div#renglondosdatoscalidadaireahora");
		List<String> dataretrieved = dat.eachText();
		String aux = dataretrieved.get(0);
		aux = aux.substring(aux.indexOf(":")+1);
		clm.setIndice_aire(aux);
		aux = dataretrieved.get(1);
		aux = aux.substring(aux.indexOf(":")+1);
		clm.setCalidad(aux);
		
		dat = doc.select("div#renglontresdatoscalidadaireahora");
		dataretrieved = dat.eachText();
		aux = dataretrieved.get(0);
		aux = aux.substring(aux.indexOf(":")+1);
		clm.setContaminante(aux);
		
		aux = dataretrieved.get(1);
		aux = aux.substring(aux.indexOf(":")+1);
		clm.setRiesgo(aux);
		
		dat = doc.select("div#rengloncincodatoscalidadaireahora");
		dataretrieved = dat.eachText();
		aux = dataretrieved.get(0);
		aux = aux.substring(aux.indexOf(":")+1);
		clm.setEstacion(aux);
		return clm;
	}

public String getDataText() {
	
	Document doc = null;
	try {
		doc = Jsoup.connect(blogUrl).get();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println(doc);
	//Element pag = doc.getElementById("renglondosdatoscalidadaireahora");
	String result ="";
	Elements dat = doc.select("div#renglondosdatoscalidadaireahora");
	
	List<String> dataretrieved = dat.eachText();
	
	String aux = dataretrieved.get(0);
	//aux = aux.substring(aux.indexOf(":")+1);
	//System.out.println("Estoo : " + aux.substring(aux.indexOf(":")+1));
	result = result + aux + "\n";
	
	aux = dataretrieved.get(1);
	result = result + aux + "\n";
	
	dat = doc.select("div#renglontresdatoscalidadaireahora");
	dataretrieved = dat.eachText();
	aux = dataretrieved.get(0);
	result = result + aux + "\n";
	
	aux = dataretrieved.get(1);
	result = result + aux + "\n";
	
	/*
	dat = doc.select("div#rengloncuatrodatoscalidadaireahora");
	dataretrieved = dat.eachText();
	System.out.println(dat);
	*/
	
	dat = doc.select("div#rengloncincodatoscalidadaireahora");
	dataretrieved = dat.eachText();
	//System.out.println(dataretrieved);
	aux = dataretrieved.get(0);
	result = result + aux + "\n";
	//clima clm = new clima();
	
	return result;
}
	
	
	
}
