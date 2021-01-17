package capitulo04_Herencia.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Antiguedad {
	
	int year;
	String origen;
	int precioVenta;
	
	
	public Antiguedad() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Antiguedad(int year, String origen, int precioVenta) {
		super();
		this.year = year;
		this.origen = origen;
		this.precioVenta = precioVenta;
	}
	
	
	@Override
	public String toString() {
		return "Antiguedad [year=" + year + ", origen=" + origen + ", precioVenta=" + precioVenta + "]";
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public int getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	
	
}
