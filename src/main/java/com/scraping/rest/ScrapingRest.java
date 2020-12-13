package com.scraping.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import controller.clima;
import controller.jsoupobject;

@RestController
@RequestMapping("scraping")
public class ScrapingRest {
	
	@GetMapping("/prueba")
	public String prueba() {
		jsoupobject obj = new jsoupobject();
		System.out.println( obj.getHtml());
		
		return "Hola";
	}
	
	@GetMapping("/dataJSON")
	public clima data() {
		jsoupobject obj = new jsoupobject();
		//System.out.println( );
		return obj.getData();
		//return "Estas en los datos";
	}
	
	@GetMapping("/dataText")
	public String dataText() {
		jsoupobject obj = new jsoupobject();
		//System.out.println( );
		return obj.getDataText();
		//return "Estas en los datos";
	}

}
