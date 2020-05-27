package examen.ejercicio2;

import java.util.LinkedList;

public class SociedadAnonima {
	LinkedList<TrabajoSA> listaTrabajosSA = new LinkedList<>();
	private String nomSA;

	public SociedadAnonima(LinkedList<TrabajoSA> listaTrabajosSA, String nomSA) {
		this.listaTrabajosSA.addAll(listaTrabajosSA);
		this.nomSA = nomSA;
	}

	public LinkedList<TrabajoSA> getListaTrabajosSA() {
		return listaTrabajosSA;
	}

	public String getNomSA() {
		return nomSA;
	}

	@Override
	public String toString() {
		return "SociedadAnonima [listaTrabajosSA=" + listaTrabajosSA + ", nomSA=" + nomSA + "]";
	}

}
