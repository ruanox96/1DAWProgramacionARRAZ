package spaceInvaders;

public class Malvado {
	private int puntosVidaa;
	private String nombre;
	private boolean vivo;
	
	
	
	public Malvado(int puntosVidaa, String nombre, boolean vivo) {
		super();
		this.puntosVidaa = puntosVidaa;
		this.nombre = nombre;
		this.vivo = vivo;
	}


	public Malvado() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPuntosVidaa() {
		return puntosVidaa;
	}


	public void setPuntosVidaa(int puntosVidaa) {
		this.puntosVidaa = puntosVidaa;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isVivo() {
		return vivo;
	}


	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}


	@Override
	public String toString() {
		return "Malvado [puntosVidaa=" + puntosVidaa + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	}
	
	
	
	
	
	

}
