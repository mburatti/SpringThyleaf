package com.buratti.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buratti.curso.boot.dao.DepartamentoDao;
import com.buratti.curso.boot.domain.Departamento;

@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;
	
	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);
		
	}

	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);
		
	}
		
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Departamento buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Departamento> buscarTodos() {
		return dao.findAll();
	}

}
