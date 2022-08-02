package com.fourcatsdev.aula.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_papel")
public class Papel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String papel;

	@ManyToMany(mappedBy = "papeis", fetch = FetchType.EAGER)
	private List<Usuario> usuarios;

	public Papel() {
	}
	
	public Papel(String papel) {
		this.papel = papel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
}
