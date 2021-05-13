package com.felipesalles.consultacep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.felipesalles.consultacep.domain.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Integer>{

	@Query("SELECT l FROM Loja l WHERE l.cepInicial <= ?1 AND l.cepFinal >=?1")
	public Loja consultaLoja(Long cep);

}
