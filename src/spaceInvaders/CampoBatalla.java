package spaceInvaders;

public class CampoBatalla {

	Humano humanos[] = new Humano[20];
	Malvado malvados[] = new Malvado[20];
	
	
	public CampoBatalla() {
		

		for (int i = 1; i <= humanos.length; i++) {
			humanos[i] = new Humano();
			if (humanos[i] == humanos[humanos.length]) {
				humanos[i].setPuntosVida(humanos[i].getPuntosVida()*2);
			}
		}
		
		for (int i = 1; i <= malvados.length; i++) {
			malvados[i] = new Malvado();
			if (malvados[i] == malvados[malvados.length]) {
				malvados[i].setPuntosVida(malvados[i].getPuntosVida()*2);
			}
		}
	}

}
