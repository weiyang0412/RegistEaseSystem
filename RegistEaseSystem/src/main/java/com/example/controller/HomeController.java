package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Client;
import com.example.service.ClientDBService;

@Controller
@RequestMapping("/")
public class HomeController {
	public HomeController() {
		ClientDBService.initialize();
	}
	
	//testing
	@GetMapping("/test")
	@ResponseBody()
	public String test() {
		return "this is a test";
	}
	
	//testing
	@GetMapping("/home")
	public String home() {
		return "home";
	}

	//add client to the list - complete this
	@GetMapping("/clientadd")
	public String clientadd(Model model) {
		return "???";
	}
	
	//display all clients
	@GetMapping("/clients")
	public String clients(Model model) {
		model.addAttribute("message","hello world...==>thymeleaf");
		List<Client> clients = ClientDBService.getClients();
		System.out.print("bil :"+clients.size());
		model.addAttribute("clients",clients);
		return "clientlist";
	}

	//search client by name, and display - complete this
	@GetMapping("/client")
	public String client(HttpServletRequest request, Model model) {
		return "???";
	}

	//delete client by name, and display operation success or not - complete this
	@GetMapping("/clientdelete")
	public String clientdelete(HttpServletRequest request, Model model) {
		return "???";
	}
	
	@GetMapping("/about")
	@ResponseBody()
	public String about() {
		return "about";
	}
	
	@GetMapping("/homee")
	@ResponseBody()
	public String homee() {
		return "homie";
	}

}
