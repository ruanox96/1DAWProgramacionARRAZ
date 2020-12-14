package examenObjetos;

public class Princiapl {

	public static void main(String[] args) {
		Baraja baraja1 = new Baraja();
		
		//baraja1.imprimeBaraja();
		System.out.println("");
		baraja1.moverCartaDeAbajoHaciaArriba();
		System.out.println("");
		baraja1.imprimeBaraja();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		baraja1.moverCartaDeArribaHaciaAbajo();
		baraja1.imprimeBaraja();

	}

}
