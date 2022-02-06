
package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	@RequestMapping("/info") //ce que je tape dans url
	public String info(Model model )
	{
		String formation="Fullstack";
		System.out.println("affiche info");
		model.addAttribute("workshop",formation);
		return "home/info";
	}
	
	@RequestMapping("/info2")
	public String affichage( )
	{
		return "home/affichage";
	}
	
	@RequestMapping("/info3") //ce que je tape dans url
	public String infotable(Model model )
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("oca");
		list.add("ocp");
		list.add("spring");
		list.add("angular");
		
		System.out.println("affiche les info de tableau");
		model.addAttribute("list",list);
		return "home/info";
	}
	
	
	

}
