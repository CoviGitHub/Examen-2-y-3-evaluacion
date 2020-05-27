package examen.ejercicio2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Contratista extends Empleado {
	private TipoServicio tipoServ;
	private HashMap<String, SociedadAnonima> socAnon = new HashMap<>();

	public Contratista(String nombre, String apellidos, TipoServicio tipoServ, LocalDate fContrat, double salario, int numCuenta,
			Map<String, SociedadAnonima> socAnon) throws Exception {
		super(nombre, apellidos, fContrat, salario, numCuenta);
		this.tipoServ=tipoServ;
		this.socAnon.putAll(socAnon);
	}

	public Map<String, SociedadAnonima> getSocAnon() {
		return socAnon;
	}

	@Override
	public String toString() {
		return "Contratista: socAnon=" + super.toString() + socAnon + tipoServ;
	}

}
