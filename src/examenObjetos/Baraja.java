package examenObjetos;

import capitulo04bloque01_PrimerosObjetos.Carta;

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
		
	}
	
	
	public void imprimeBaraja() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}

}
