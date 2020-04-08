package com.msolimano.IntercorpBack.Service;

import java.util.List;

import com.msolimano.IntercorpBack.Entity.Cliente;


public interface IClienteService {

	
		public Cliente save(Cliente cliente);
		public List<Object> ListViewClientes();
		public List<Object> FindKpi();
	
}
