package examen.ejercicio3;

import java.util.Comparator;

import examen.ejercicio2.Empleado;

public class EmpleadoComparator implements Comparator<Empleado> {

	@Override
	public int compare(Empleado e1, Empleado e2) {
		int resultado;
		double s1 = e1.getSalario();
		double s2 = e2.getSalario();
		if (s1 > s2)
			resultado = -1;
		else if (s1 < s2)
			resultado = 1;
		else
			resultado = 0;

		if (resultado == 0)
			resultado = e1.getApellidos().compareTo(e2.getApellidos());
		if (resultado == 0) {
			resultado = e1.getNombre().compareTo(e2.getNombre());
		}
		return resultado;
	}
}
