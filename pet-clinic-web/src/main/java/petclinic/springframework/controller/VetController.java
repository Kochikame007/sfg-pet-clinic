package petclinic.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import petclinic.springframework.service.VetService;

@Controller
public class VetController {
	
	private final VetService vetService;
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}
	
	@RequestMapping({"/vet", "vets.html"})
	public String getVet(Model model) {
		model.addAttribute("vets" , vetService.findAll());
		return "vet/index";
	}

}
