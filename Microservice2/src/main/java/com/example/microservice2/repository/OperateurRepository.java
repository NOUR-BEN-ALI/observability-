package com.example.microservice2.repository;

import com.example.microservice2.entity.Operateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperateurRepository extends CrudRepository<Operateur, Long> {

}
