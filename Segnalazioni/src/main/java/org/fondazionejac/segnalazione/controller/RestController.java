package org.fondazionejac.segnalazione.controller;

import java.util.List;

import org.fondazionejac.segnalazione.build.Segnalazione;
import org.fondazionejac.segnalazione.service.SegnalazioneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getIndex(Model model) {

		SegnalazioneService service = new SegnalazioneService();
		List<Segnalazione> lista = service.stampaLista();

		model.addAttribute("lista", lista);
		
		return "index";

	}
	
	
		@PostMapping(path = "/visualizzazione")
		public String getVisualizzazione(@RequestParam(name="id") int index, Model model) {

			SegnalazioneService service = new SegnalazioneService();
			Segnalazione s=service.selById(index);
			
			model.addAttribute("lista", s);
			
			return "visualizzazione.html";

		
		}
}