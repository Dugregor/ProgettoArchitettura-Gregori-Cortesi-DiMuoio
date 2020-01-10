package org.fondazionejac.segnalazione.service;

import java.util.List;

import org.fondazionejac.segnalazione.build.Segnalazione;
import org.fondazionejac.segnalazione.dao.SegnalazioniDao;
import org.springframework.stereotype.Component;

@Component
public class SegnalazioneService {

	private SegnalazioniDao dao = new SegnalazioniDao();

	
	public List<Segnalazione> stampaLista() {


		return dao.selTutti();
		


	}
	public Segnalazione selById(int id) {
		return dao.selById(id);
	}



}
