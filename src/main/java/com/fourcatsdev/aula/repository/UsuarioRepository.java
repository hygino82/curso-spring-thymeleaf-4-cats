package com.fourcatsdev.aula.repository;

import com.fourcatsdev.aula.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
