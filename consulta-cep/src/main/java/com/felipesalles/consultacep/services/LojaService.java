package com.felipesalles.consultacep.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipesalles.consultacep.domain.Loja;
import com.felipesalles.consultacep.repositories.LojaRepository;
import com.felipesalles.consultacep.services.exceptions.ObjectNotFoundException;

@Service
public class LojaService {
	
	@Autowired
	private LojaRepository lojaRepository;

	public Loja consultaCep(Long cep) {
		
		Loja loja = lojaRepository.consultaLoja(cep);
		
		if(loja == null) {
			throw new ObjectNotFoundException("No momento nenhuma loja atende o seu cep.");
		}
		
		return loja;
	}

}
