package in.sp.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sp.main.entites.User;
import in.sp.main.services.UserServices;

@Controller
public class MyController {
	
	@Autowired
	private UserServices userServices;
	
	
	@GetMapping("/registrationPage")
	public String openregistrationPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	//link with registration form
	@PostMapping("/registrationForm")
	public String submitRegistrationForm(@ModelAttribute("user") User user, Model model) {
		
		boolean status = userServices.registerUser(user);
		
		if(status) {
			model.addAttribute("successMsg", "User registered successfully!");
		}
		else {
			model.addAttribute("errorMsg", "User not registered due to some error!");			
		}
		return "register";//redirect
	}
}
