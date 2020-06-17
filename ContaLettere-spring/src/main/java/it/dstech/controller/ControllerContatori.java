package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.service.Contatore;



@Controller
public class ControllerContatori {
	@RequestMapping(value = "/sceltaAzione", method = RequestMethod.POST)
	public ModelAndView contatore(@RequestParam("scelta") String scelta,@RequestParam("frase") String frase, Model model) {
		ModelAndView prossimaPaginaJSP = new ModelAndView();
		prossimaPaginaJSP.setViewName("risultato");
		 Contatore c  = new Contatore(frase);
		 if("contaParole".equals(scelta)) {
			 prossimaPaginaJSP.addObject("risultato", c.contaParole(frase));
		 } else if ("contaVocali".equals(scelta)) {
			 prossimaPaginaJSP.addObject("risultato", c.contaVocali(frase));
		 } else {
			 prossimaPaginaJSP.addObject("risultato", c.contaConsonanti(frase));
		 }
		return prossimaPaginaJSP;
		
	}
}
