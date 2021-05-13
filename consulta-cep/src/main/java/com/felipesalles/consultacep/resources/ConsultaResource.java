package com.felipesalles.consultacep.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.felipesalles.consultacep.domain.Cep;
import com.felipesalles.consultacep.domain.Loja;
import com.felipesalles.consultacep.services.LojaService;

@RestController
@RequestMapping("/cep")
public class ConsultaResource {
	
	@Autowired
	private LojaService lojaService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Loja getLoja(@RequestBody Cep cep) {
		return lojaService.consultaCep(cep.getCep());
	}
	
//	@PostMapping
//	@ResponseStatus(HttpStatus.OK)
//	public String consultaCep(Long cep) throws IOException, InterruptedException {
//		return lojaService.consultaCep(cep);
//	}
}
