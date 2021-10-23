package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Empleado {

	private String nombre;
	private String departamento;
	private int salario;
	private List <Empleado> subordinados;
	
	public Empleado(String nombre,String departamento, int salario) {
		
		this.nombre=nombre;
		this.departamento=departamento;
		this.salario=salario;
		subordinados=new ArrayList <Empleado> ();
		
	}
	
	public void add (Empleado e) {
		subordinados.add(e);
		
	}
	
	public void remove(Empleado e) {
		subordinados.remove(e);
		
	}	
	
	public List <Empleado>getSubordinados() {
		return subordinados;
	
	}
		
	
	public String toString () {
		return ("Nombre de Empleado:"+nombre+"---"+"Departamento:"+departamento+"---"+"Salario:"+salario);
		
	}
	
	
}
