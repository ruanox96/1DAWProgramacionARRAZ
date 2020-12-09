package capitulo04bloque01_PrimerosObjetos;

public class Baraja {
	Carta cartas[] =  new Carta[52];
	/**
	 * 
	 */
	public Baraja () {
		cartas[0] =  new Carta(1, "picas", 0);
		cartas[1] =  new Carta(2, "picas", 1);
		cartas[2] =  new Carta(3, "picas", 2);
		
		
		int id =0;
			for (int i = 1; i <= 13; i++) {
				cartas[id] = new Carta(i, "Picas", id);
				id++;
			}
			
			for (int i = 1; i <= 13; i++) {
				cartas[id] = new Carta(i, "Diamantes", id);
				id++;
			}
			
			for (int i = 1; i <= 13; i++) {
				cartas[id] = new Carta(i, "Tréboles", id);
				id++;
			}
			
			for (int i = 1; i <= 13; i++) {
				cartas[id] = new Carta(i, "Corazones", id);
				id++;
			}
			
			for (int i = 0; i < cartas.length; i++) {
				System.out.println(cartas[i]);
			}
		
	}
	
	public void moverCartaDeAbajoHaciaArriba() {
		Carta aux = cartas[0];
		// Recorro las posiciones del array de primera a penúltima
		for (int j = 0; j < cartas.length - 1; j++) {
			cartas[j] = cartas[j+1];
		}
		// La primera posición, guardada en numgaurdado, pasa a ser la ultima
		cartas[cartas.length-1] = aux;
	}
	
	public void moverCartaDeArribaHaciaAbajo () {
		Carta aux = cartas[cartas.length -1];
		for (int j = cartas.length -1; j > 0; j--) {
			cartas[j] = cartas[j-1];
		}
		cartas[0] = aux;
	}
	
	public static void mezclar() {
		
	}
	
	
	
	public void imprimeBaraja() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		baraja.moverCartaDeAbajoHaciaArriba();
		baraja.imprimeBaraja();
	}

}
