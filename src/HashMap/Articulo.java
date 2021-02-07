package HashMap;

public class Articulo {
	String nombre;
	int codBarras, numEstante, unidadesStock;
	
	
	public Articulo(String nombre, int codBarras, int numEstante, int unidadesStock) {
		super();
		this.nombre = nombre;
		this.codBarras = codBarras;
		this.numEstante = numEstante;
		this.unidadesStock = unidadesStock;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCodBarras() {
		return codBarras;
	}


	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}


	public int getNumEstante() {
		return numEstante;
	}


	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}

	

	public int getUnidadesStock() {
		return unidadesStock;
	}


	public void setUnidadesStock(int unidadesStock) {
		this.unidadesStock = unidadesStock;
	}


	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", codBarras=" + codBarras + ", numEstante=" + numEstante
				+ ", unidadesStock=" + unidadesStock + "]";
	}


	
	
	
}
