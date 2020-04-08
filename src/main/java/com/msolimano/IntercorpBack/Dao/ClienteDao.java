package com.msolimano.IntercorpBack.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.msolimano.IntercorpBack.Entity.Cliente;



public interface ClienteDao extends CrudRepository<Cliente, Long> {

	@Query(value="select * from view_probability_mortality",nativeQuery=true)
	public List<Object> ListViewClientes();
	
	@Query(value="select CAST(round(avg(edad),2) AS DECIMAL(8,2)) as promedio ,CAST(round(std(edad),2) AS DECIMAL(8,2)) as desviacion from clientes",nativeQuery=true)
	public List<Object> FindKpi();
	


}
