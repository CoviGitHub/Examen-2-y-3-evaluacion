package examen.ejercicio2;

import java.time.LocalDate;

public class EmpresaServicio implements Remunerable {
	private String nombre;
	private TipoServicio tipoServ;
	private double importeMes;
	private int numCuenta;
	private double importeIngreso;
	private LocalDate fIngreso;
	private boolean ingreso;

	public EmpresaServicio(String nombre, TipoServicio tipoServ, double importeMes, int numCuenta) throws Exception {
		importeException(importeMes);
		this.nombre = nombre;
		this.tipoServ = tipoServ;
		this.importeMes = importeMes;
		this.numCuenta = numCuenta;
	}

	@Override
	public void ingreso(int numCuenta, double importeIngreso, LocalDate fIngreso) {
		this.numCuenta = numCuenta;
		this.importeIngreso = importeIngreso;
		this.fIngreso = fIngreso;
		this.ingreso = true;
	}

	static void importeException(double importeMes) throws Exception {
		try {
			if (importeMes < 0)
				throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			System.out.print("El importe no puede ser negativo");
		}
	}

	public double getImporteMes() {
		return importeMes;
	}

	public void setImporteMes(double importeMes) {
		this.importeMes = importeMes;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public TipoServicio getTipoServ() {
		return tipoServ;
	}

	@Override
	public String toString() {
		if (this.ingreso == true) {
			return "Empresa de Servicio: " + nombre + ", tipo Servicio " + tipoServ + ", ingreso Mes: " + importeMes
					+ ", nº Cuenta: " + numCuenta + ". El ingreso de " + importeIngreso
					+ " € se realizó el satisfactoriamente" + fIngreso;
		} else
			return "Empresa de Servicio: " + nombre + ", tipo Servicio: " + tipoServ + ", ingreso Mes: " + importeMes
					+ ", nº Cuenta: " + numCuenta;
	}

}
