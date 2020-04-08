package com.msolimano.IntercorpBack.Entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;





public class ViewCliente {

	
	private int id;
	private String nombres;
	private String apellidos;
	private int edad;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha_nacimiento;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha_muerte;
	
	public ViewCliente() {
		
	}


	public ViewCliente(int id, String nombres, String apellidos, int edad, Date fecha_nacimiento,Date fecha_muerte) {
	
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_muerte = fecha_muerte;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public Date getFecha_muerte() {
		return fecha_muerte;
	}


	public void setfecha_muerte(Date fecha_muerte) {
		this.fecha_muerte = fecha_muerte;
	}




	
	
	
	
	
}
