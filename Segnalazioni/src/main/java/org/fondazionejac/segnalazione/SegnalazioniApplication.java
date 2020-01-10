package org.fondazionejac.segnalazione;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.fondazionejac.segnalazione")
public class SegnalazioniApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegnalazioniApplication.class, args);
	}

}
