package com.example.microservice2.service;

import com.example.microservice2.entity.Operateur;
import com.example.microservice2.repository.OperateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperateurServiceImpl implements IOperateurService {

	private final OperateurRepository operateurRepository;

	public OperateurServiceImpl(OperateurRepository operateurRepository) {
		this.operateurRepository = operateurRepository;
	}

	@Override
	public List<Operateur> retrieveAllOperateurs() {
		return (List<Operateur>) operateurRepository.findAll();
	}

	@Override
	public Operateur addOperateur(Operateur o) {
		operateurRepository.save(o);
		return o;
	}

	@Override
	public void deleteOperateur(Long id) {
		operateurRepository.deleteById(id);
		
	}

	@Override
	public Operateur updateOperateur(Operateur o) {
		operateurRepository.save(o);
		return o;
	}

	@Override
	public Operateur retrieveOperateur(Long id) {
		Operateur operateur = operateurRepository.findById(id).orElse(null);
		return operateur;
	}

}
