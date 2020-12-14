package capitulo04bloque01_PrimerosObjetos;

public class principal {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		baraja.moverCartaDeAbajoHaciaArriba();
		baraja.imprimeBaraja();
		baraja.mezclar();
		
		Baraja baraja2 = new Baraja();
		
		baraja2.imprimeBaraja();
		baraja2.moverCartaDeAbajoHaciaArriba();
	}

}
