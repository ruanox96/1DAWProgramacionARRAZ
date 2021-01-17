package capitulo04_Herencia.ejerciciosSobreHerencia.articulosComestibles;

public class Perecederos extends Producto {
	
	String FechaCaducidad;

	public Perecederos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perecederos(int codigo, String nombre, int precio, String fechaCaducidad) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
		this.FechaCaducidad = fechaCaducidad;
		
	}

	public Perecederos(String fechaCaducidad) {
		super();
		FechaCaducidad = fechaCaducidad;
	}


	@Override
	public String toString() {
		return "Perecederos [FechaCaducidad=" + FechaCaducidad + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", precio=" + precio + "]";
	}

	public String getFechaCaducidad() {
		return FechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		FechaCaducidad = fechaCaducidad;
	}

	
	

}
