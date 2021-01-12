package capitulo04_Herencia.ejerciciosSobreHerencia.articulosComestibles;

public class Perecederos extends Producto {
	
	String FechaCaducidad;

	public Perecederos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perecederos(int codigo, String nombre, int precio, String fecha_caducidad) {
		super(codigo, nombre, precio, fecha_caducidad);
		// TODO Auto-generated constructor stub
	}

	public Perecederos(String fechaCaducidad) {
		super();
		FechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Perecederos [FechaCaducidad=" + FechaCaducidad + "]";
	}

	public String getFechaCaducidad() {
		return FechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		FechaCaducidad = fechaCaducidad;
	}
	
	

}
