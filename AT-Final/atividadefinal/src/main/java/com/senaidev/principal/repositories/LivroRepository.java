package com.senaidev.principal.repositories;
import com.senaidev.principal.entities.Livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
	public interface LivroRepository extends JpaRepository<Livro, Long>{

}

