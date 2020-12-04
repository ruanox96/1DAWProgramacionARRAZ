package capitulo04bloque01_PrimerosObjetos;

public class CromoBaloncesto {
	// Propiedades de cada Cromo
	String nombreJugador;
	int alturacm;
	int pesokg;
	float puntosMediosPorpartido;

	public CromoBaloncesto() {
		System.out.println("Has creado un cromo");
	}

	public CromoBaloncesto(String nombreJugador, int alturacm, int pesokg, float puntosMEdiosPorpartido) {
		this.nombreJugador = nombreJugador;
		this.alturacm = alturacm;
		this.pesokg = pesokg;
		this.puntosMediosPorpartido = puntosMEdiosPorpartido;

	}

	public String toString() {
		return "Nombre: " + nombreJugador + " - alturacm: " + alturacm + " - pesokg: " + pesokg
				+ " - puntos Medios Por Partido: " + puntosMediosPorpartido;
	}
	public String getnombreJugador(String nombreJugador) {
		return nombreJugador;
	}
	
	
	public void setnombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

}

