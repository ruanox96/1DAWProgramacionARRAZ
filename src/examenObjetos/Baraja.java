package examenObjetos;

import capitulo04bloque01_PrimerosObjetos.Carta;
import utils.Utils;

public class Baraja {

	Carta cartas[] = new Carta[52];

	public Baraja() {
		int id = 0;

		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(i, "picas", id);
			id++;
		}

		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(i, "diamantes", id);
			id++;
		}

		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(i, "tréboles", id);
			id++;
		}

		for (int i = 1; i <= 13; i++) {
			cartas[id] = new Carta(i, "corazones", id);
			id++;
		}

	}

	public void moverCartaDeAbajoHaciaArriba() {
		Carta aux = cartas[0];
		// Recorro las posiciones del array de primera a penúltima
		for (int j = 0; j < cartas.length - 1; j++) {
			cartas[j] = cartas[j + 1];
		}
		// La primera posición, guardada en numgaurdado, pasa a ser la ultima
		cartas[cartas.length - 1] = aux;
	}

	public void moverCartaDeArribaHaciaAbajo() {
		Carta aux = cartas[cartas.length - 1];
		for (int j = cartas.length - 1; j > 0; j--) {
			cartas[j] = cartas[j - 1];
		}
		cartas[0] = aux;
	}
	
	public void mezclar() {
		for (int i = 0; i < 25; i++) {
//			int num1= Utils.obtenerNumeroAzar() % cartas.length -1;
//			int num2= Utils.obtenerNumeroAzar() % cartas.length -1;
			int num1 = Utils.obtenerNumeroAzar(1, 52);
			int num2 = Utils.obtenerNumeroAzar(1, 52);
			
			//intercambio de valores
			Carta aux = cartas[num1];
			cartas[num1] = cartas[num2];
			cartas[num2] = aux;
			
		}
		
	}
	
	public void ordenar() {
	    for (int i = cartas.length-1; i > 0; i--) {
	        for (int j = 0; j < i; j++) {
	            if (cartas[j].getId() > cartas[j+1].getId()) {
	                Carta aux = cartas[j];
	                cartas[j] = cartas[j+1];
	                cartas[j+1] = aux;
	            }
	        }
	    }
	}
	
	public void darMano(Jugador jugadores) {
		Carta mano[] = new Carta[5];
		for (int i = 0; i < mano.length; i++) {
			int azar;
			do {
				azar = Utils.obtenerNumeroAzar(0, 51);
						mano[i] = cartas[azar] ;
			} while (cartas[azar] == null);
			
			mano[i] = cartas[azar];
			cartas[azar] = null;
		}
		jugadores.setMano(mano);
	}
	
	
	public void imprimeBaraja() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}

}
