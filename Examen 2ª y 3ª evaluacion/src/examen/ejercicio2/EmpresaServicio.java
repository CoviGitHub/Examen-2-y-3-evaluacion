package examen.ejercicio2;

public class EmpresaServicio extends CobroEfectivo {
	private String nombre;
	private TipoServicio tipoServ;
	private double importeMes;

	public EmpresaServicio(String nombre, TipoServicio tipoServ, double importeMes, int numCuenta) throws Exception {
		super(numCuenta);
		importeException(importeMes);
		this.nombre = nombre;
		this.tipoServ = tipoServ;
		this.importeMes = importeMes;
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
		CobroEfectivo.numCuenta = numCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public TipoServicio getTipoServ() {
		return tipoServ;
	}

	@Override
	public String toString() {
		return "EmpresaServicio [nombre=" + nombre + ", tipoServ=" + tipoServ + ", importeMes=" + importeMes
				+ ", getNumCuenta()=" + getNumCuenta() + "]";
	}

}
