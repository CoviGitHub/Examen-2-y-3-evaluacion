package examen.ejercicio2;

import java.time.LocalDate;

public class Asalariado extends Empleado {
	private String dpto;

	public Asalariado(String nombre, String apellidos, LocalDate fContrat, double salario, int numCuenta,
			String dpto) throws Exception{
		
		super(nombre, apellidos, fContrat, salario, numCuenta);
		salarioException(salario);
		this.dpto = dpto;
	}

	@Override
	public String toString() {
		return "Asalariado [dpto=" + super.toString()+ dpto + "]";
	}
	
	
}
