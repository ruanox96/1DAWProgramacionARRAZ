package spaceInvaders;
import utils.*;

public class Humano {
	private int puntosVida;
	private String nombre;
	private boolean vivo;
	
	
	
	
	public Humano() {
		super();
		// TODO Auto-generated constructor stub
		
	}


	public Humano(String nombre) {
		super();
		this.puntosVida = Utils.obtenerNumeroAzar(50, 100);
		this.vivo = true;
		this.nombre = nombre;
	}


	public int getPuntosVida() {
		return puntosVida;
	}


	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
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
		return "Humano [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	}
	
	
	

}
