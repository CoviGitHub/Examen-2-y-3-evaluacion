package examen.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import examen.ejercicio2.Asalariado;
import examen.ejercicio2.Contratista;
import examen.ejercicio2.Empleado;
import examen.ejercicio2.EmpresaServicio;
import examen.ejercicio2.Remunerable;
import examen.ejercicio2.SociedadAnonima;
import examen.ejercicio2.TipoServicio;
import examen.ejercicio2.TrabajoSA;

public class Ejercicio3 {

	public static void main(String[] args) throws Exception {
		ArrayList<Remunerable> listaRemun = new ArrayList<Remunerable>();
		LinkedList<TrabajoSA> listaTrabajosSA = new LinkedList<>();
		ArrayList<SociedadAnonima> socAnon = new ArrayList<>();

		System.out.println("1º y 2º punto del ejercicio");
		try {
			TrabajoSA trab1 = new TrabajoSA("Alicatado");
			listaTrabajosSA.add(trab1);
			listaTrabajosSA.add(new TrabajoSA("Fontanería"));
			socAnon.add(new SociedadAnonima("Constr.Manolo, S.A.", listaTrabajosSA));

			Remunerable contrat1 = new Contratista("María", "Jiménez", LocalDate.parse("2020-01-30"), 3500, 321654987,
					socAnon);
			Remunerable emple1 = new Asalariado("Pepe", "Grillo", LocalDate.parse("2018-10-30"), 1200, 123456789,
					"Contabilidad");
			Remunerable emprServ1 = (Remunerable) new EmpresaServicio("Catering Silvia,S.A.", TipoServicio.catering,
					1750, 78945214);
			listaRemun.add((Empleado) contrat1);
			listaRemun.add((Empleado) emple1);
			listaRemun.add(emprServ1);

			for (Remunerable r : listaRemun) {
				System.out.println(r);
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		System.out.println("\n3º y 4º punto del ejercicio");
		LinkedList<Empleado> listEmpl = new LinkedList<Empleado>();
		Empleado empl1 = (Empleado) new Asalariado("Angel", "Pérez", LocalDate.parse("2010-03-15"), 1500, 1111111111,
				"Contabilidad");
		listEmpl.add(empl1);
		Empleado empl2 = (Empleado) new Contratista("Inés", "Fdez", LocalDate.parse("2015-01-30"), 2500, 321654987,
				socAnon);
		listEmpl.add(empl2);

		Collections.sort(listEmpl);
		for (Empleado e : listEmpl) {
			System.out.println(e);
		}

		System.out.println("\n5º punto del ejercicio");
		Collections.sort(listEmpl, new EmpleadoComparator());
		for (Empleado e : listEmpl) {
			System.out.println(e);
		}
	}

}
