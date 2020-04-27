package petclinic.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
	
	@RequestMapping("/vet")
	public String getVet() {
		return "vet/index";
	}

}
