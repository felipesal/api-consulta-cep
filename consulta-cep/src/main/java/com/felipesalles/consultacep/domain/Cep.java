package com.felipesalles.consultacep.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cep {
	
	@Id
	private Integer id;

	private Long cep;

	public Cep() {
	}

	public Cep(Integer id, Long cep) {
		this.id = id;
		this.cep = cep;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}
	
}
