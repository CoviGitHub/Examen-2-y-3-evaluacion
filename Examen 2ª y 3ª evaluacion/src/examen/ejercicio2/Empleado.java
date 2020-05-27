package examen.ejercicio2;

import java.time.LocalDate;

public class Empleado extends CobroEfectivo {
	private String nombre;
	private String apellidos;
	private LocalDate fContrat;
	private double salario;
	
	public Empleado(String nombre, String apellidos, LocalDate fContrat, double salario, int numCuenta) throws Exception {
		super(numCuenta);
		salarioException(salario);	
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fContrat = fContrat;
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		CobroEfectivo.numCuenta = numCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public LocalDate getfContrat() {
		return fContrat;
	}
	
	static void salarioException (double salario) throws Exception {
		try {
		if (salario < 0)
			throw new IllegalArgumentException();
		}catch (IllegalArgumentException e) {
			System.out.print("El salario no puede ser negativo");
		}
	}

	@Override
	public String toString() {
		return "Empleado: nombre=" + nombre + ", apellidos=" + apellidos + ", fContrat=" + fContrat + ", salario="
				+ salario + ", NumCuenta=" + getNumCuenta();
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



}
