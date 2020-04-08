package com.msolimano.IntercorpBack.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msolimano.IntercorpBack.Dao.ClienteDao;
import com.msolimano.IntercorpBack.Entity.Cliente;


@Service
public class IClienteImp implements IClienteService {

	@Autowired
	private ClienteDao clienteDao;
	

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Object> ListViewClientes() {
		
	return (List<Object>) clienteDao.ListViewClientes();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Object> FindKpi() {
		
	return (List<Object>) clienteDao.FindKpi();
	}



	

}
