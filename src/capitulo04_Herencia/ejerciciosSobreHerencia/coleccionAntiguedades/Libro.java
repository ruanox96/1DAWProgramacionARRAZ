package capitulo04_Herencia.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Libro extends Antiguedad {
	
	String titulo;
	String autor;
	
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(int year, String origen, int precioVenta, String titulo, String autor) {
		super(year, origen, precioVenta);
		this.titulo = titulo;
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
