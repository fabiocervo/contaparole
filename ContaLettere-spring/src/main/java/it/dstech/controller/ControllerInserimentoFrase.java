package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerInserimentoFrase {
	@RequestMapping(value = "/inserisciFrase", method = RequestMethod.POST)
	public ModelAndView inserisci(@RequestParam("frase") String frase, Model model) {
		ModelAndView nuovaJsp = new ModelAndView();
		nuovaJsp.setViewName("scegliOperazione");
		nuovaJsp.addObject("frase", frase);
		return nuovaJsp;
	}

}
