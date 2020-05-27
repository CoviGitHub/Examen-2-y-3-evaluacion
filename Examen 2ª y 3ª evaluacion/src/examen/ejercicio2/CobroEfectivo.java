package examen.ejercicio2;

import java.time.LocalDate;

public class CobroEfectivo {
	protected static int numCuenta;
	private double importeCobro;
	private LocalDate fCobro;
	private boolean cobro;

	public CobroEfectivo(int numCuenta) {
		CobroEfectivo.numCuenta = numCuenta;
		this.importeCobro=0;
		this.fCobro=LocalDate.now();
		this.cobro=false;
	}

	public CobroEfectivo(int numCuenta, double importeCobro, LocalDate fCobro) {
		CobroEfectivo.numCuenta = numCuenta;
		this.importeCobro = importeCobro;
		this.fCobro = fCobro;
		if (importeCobro > 0) {
			this.cobro = true;
		} else
			this.cobro = false;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public double getImporteCobro() {
		return importeCobro;
	}

	public LocalDate getfCobro() {
		return fCobro;
	}

	public boolean ingreso() {
		if (cobro == true) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		if (this.cobro == true) {

			return "El importe " + importeCobro + "ha sido ingresado el " + fCobro;
		} else
			return "";
	}

}
