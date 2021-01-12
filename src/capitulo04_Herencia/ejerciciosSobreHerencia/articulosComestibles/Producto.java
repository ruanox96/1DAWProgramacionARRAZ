package capitulo04_Herencia.ejerciciosSobreHerencia.articulosComestibles;

public class Producto {
	private int codigo;
	private String nombre;
	private int precio;
	private String fecha_caducidad;
	
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Producto(int codigo, String nombre, int precio, String fecha_caducidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha_caducidad = fecha_caducidad;
	}


	@Override
	public String toString() {
		return "Perecederos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fecha_caducidad="
				+ fecha_caducidad + "]";
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getFecha_caducidad() {
		return fecha_caducidad;
	}


	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	
	
	
}
