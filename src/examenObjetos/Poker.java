package examenObjetos;

public class Poker {

	Jugador jugadores[] = new Jugador[5];

	Baraja baraja;

	public Poker(Baraja baraja) {
		this.baraja = baraja;
		jugadores[0] = new Jugador("Ruanox");
		jugadores[1] = new Jugador("Cristobal");
		jugadores[2] = new Jugador("Adri");
		jugadores[3] = new Jugador("KIKEEEEEEE");
		jugadores[4] = new Jugador("Cabeza_Pensante");

		for (int i = 0; i < jugadores.length; i++) {
			baraja.darMano(jugadores[i]);
			System.out.println("Jugador/a: " + jugadores[i].getNombre());
			for (int j = 0; j < jugadores[i].getMano().length; j++) {
				System.out.println("\t " + jugadores[i].getMano()[j].toString());
			}
			jugadores[i].combinaciones();
		}
		

	}

}
