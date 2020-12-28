package spaceInvaders;

public class CampoBatalla {

	Humano humanos[] = new Humano[20];
	Malvado malvados[] = new Malvado[20];
	
	
	public CampoBatalla() {
		

		for (int i = 1; i <= humanos.length; i++) {
			humanos[i] = new Humano();
		}
		
		for (int i = 1; i <= malvados.length; i++) {
			malvados[i] = new Malvado();
		}
	}

}
