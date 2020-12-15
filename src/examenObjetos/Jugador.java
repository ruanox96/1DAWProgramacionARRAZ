package examenObjetos;

import java.util.Arrays;

import capitulo04bloque01_PrimerosObjetos.Carta;

public class Jugador {
	
	private String nombre;
	private Carta mano[] = new Carta[5];
	
	
	
	
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Jugador(String nombre, Carta[] mano) {
		super();
		this.nombre = nombre;
		this.mano = mano;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + Arrays.toString(mano) + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Carta[] getMano() {
		return mano;
	}


	public void setMano(Carta[] mano) {
		this.mano = mano;
	}
	
	
	

}
