package spaceInvaders;

public class Principal {

	public static void main(String[] args) {
		CampoBatalla campoBatalla = new CampoBatalla("Batalla Final");
		
		campoBatalla.mezclarPersonajes();
		
		boolean turnoHumano = false;
		
		while (!campoBatalla.batallaTerminada()) {
			turnoHumano = !turnoHumano;
			
			if (turnoHumano) {
				campoBatalla.dispararAMalvado(campoBatalla.primerMalvadoVivo());
			} else {
				campoBatalla.dispararAHumano(campoBatalla.primerHumanoVivo());
			}
			System.out.println(campoBatalla.toString());
			
		}
		
		if (turnoHumano == true) {
			System.out.println("Han ganado los Humanos");
		} else {
			System.out.println("Han ganado los Malvados");
		}
		
		System.out.println(campoBatalla.getEstadistica());

	}

}
