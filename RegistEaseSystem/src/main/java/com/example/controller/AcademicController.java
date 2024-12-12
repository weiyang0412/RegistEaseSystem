package com.example.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Client;
import com.example.service.ClientDBService;

@Controller
@RequestMapping("/")
public class AcademicController {
	
	@GetMapping("/academic/home")
	public String showHomePage() {
		return "AcademicHomePage";
	}
	
	@GetMapping("/academic/request")
	public String showRequestPage() {
		return "AcademicRequestPage";
	}

	@GetMapping("/academic/request/view")
	public String showViewRegistrationRequestPage() {
		return "RegistrationRequestPage";
	}
}
