package capitulo04_Herencia.ejerciciosSobreHerencia.articulosComestibles;

public class Producto {
 int codigo;
	 String nombre;
	 int precio;
	
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Producto(int codigo, String nombre, int precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
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
	
	
	
	
	
	
}
