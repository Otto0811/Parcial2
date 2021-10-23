package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CeOcompositeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CeOcompositeApplication.class, args);
	
		Empleado CEO= new Empleado ("Mario","CEO",30000);
		
		Empleado marketing=new Empleado("Isabel","Jefa Marketing",5000);
		
		Empleado jefeventas=new Empleado("Bryan","Jefe Ventas",10000);
	
		Empleado secretaria1=new Empleado("Ana","Marketing",3000);
		Empleado secretaria2=new Empleado("Luisa","Marketing",3000);
		
		Empleado ventas1=new Empleado("Edwin","Ventas",4000);
		Empleado ventas2=new Empleado("Carlos","Ventas",4000);
		
		
		
		
			
		CEO.add(jefeventas);
		CEO.add(marketing);
		
		jefeventas.add(ventas1);
		jefeventas.add(ventas2);

		marketing.add(secretaria1);
		marketing.add(secretaria2);
		

		System.out.println(CEO);
		for (Empleado jefeEmpleado: CEO.getSubordinados()) {
			System.out.println(jefeEmpleado);
			for(Empleado Empleado: jefeEmpleado.getSubordinados())
				System.out.println(Empleado);
		}
		
		
	
	}
	

}
