package com.fourcatsdev.aula.repository;

import com.fourcatsdev.aula.model.Papel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PapelRepository extends JpaRepository<Papel, Long> {
	Papel findByPapel(String papel);
}
