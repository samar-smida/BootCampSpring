
package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	@RequestMapping("/info") //ce que je tape dans url
	public String info( )
	{
		System.out.println("affiche info");
		return "home/info";
	}
	
	@RequestMapping("/info2")
	public String affichage( )
	{
		return "home/affichage";
	}
	

}
