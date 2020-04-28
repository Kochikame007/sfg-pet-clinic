package petclinic.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import petclinic.springframework.service.OwnerService;

@Controller
public class OwnerController {
	
	
	@Autowired
	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}
	
	@RequestMapping("/owner")
	public String getOwner(Model model) {
		model.addAttribute("owners" ,ownerService.findAll());
		return "owner/index";
	}

}
