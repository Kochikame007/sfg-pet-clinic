package petclinic.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
	
	@RequestMapping("/owner")
	public String getOwner() {
		
		return "owner/index";
	}

}
