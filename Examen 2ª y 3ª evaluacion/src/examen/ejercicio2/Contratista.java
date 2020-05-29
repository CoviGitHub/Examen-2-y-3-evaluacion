package examen.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contratista extends Empleado {
	private ArrayList<SociedadAnonima> socAnon = new ArrayList<>();

	public Contratista(String nombre, String apellidos, LocalDate fContrat, double salario, int numCuenta,
			ArrayList<SociedadAnonima> socAnon) throws Exception {
		super(nombre, apellidos, fContrat, salario, numCuenta);
		this.socAnon.addAll(socAnon);
	}

	public ArrayList<SociedadAnonima> getSocAnon() {
		return socAnon;
	}

	@Override
	public String toString() {
		return "Contratista: " + super.toString() + socAnon;
	}

}
