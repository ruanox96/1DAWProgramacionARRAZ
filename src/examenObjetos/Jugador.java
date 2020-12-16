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


	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
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
	
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + Arrays.toString(mano) + "]";
	}
	
	public void combinaciones() {
		for (int i = 0; i < this.mano.length; i++) {
			int combinaciones = 1;
			for (int j = i + 1; j < mano.length; j++) {
				if (mano[i].getValor() == mano[j].getValor()) {
					combinaciones++;
				}
			}
			switch (combinaciones) {
			case 2:
				System.out.println("Tiene una Pareja");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Tiene un trio");
				System.out.println(" ");
				break;
			case 4:
				System.out.println("Tiene Poker");
				System.out.println(" ");
				break;
			}
		}
	}

}
