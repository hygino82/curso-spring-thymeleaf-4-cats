package com.fourcatsdev.aula.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fourcatsdev.aula.model.Papel;
import com.fourcatsdev.aula.repository.PapelRepository;

@Component
public class CarregadoraDados implements CommandLineRunner {

	private final PapelRepository papelRepository;

	public CarregadoraDados(PapelRepository papelRepository) {
		this.papelRepository = papelRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		String[] papeis = { "ADMIN", "USER", "BIBLIOTECARIO" };

		for (String papelString : papeis) {
			Papel papel = papelRepository.findByPapel(papelString);
			if (papel == null) {
				papel = new Papel(papelString);
				papelRepository.save(papel);
			}
		}
	}
}
