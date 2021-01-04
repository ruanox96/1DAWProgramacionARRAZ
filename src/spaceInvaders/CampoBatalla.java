package spaceInvaders;

import capitulo04bloque01_PrimerosObjetos.Carta;
import utils.Utils;

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
	
	
	public void mezclarhumanos() {
		for (int i = 0; i < 100; i++) {
			int num1 = Utils.obtenerNumeroAzar(0, 51);
			int num2 = Utils.obtenerNumeroAzar(0, 51);
			
			//intercambio de valores
			Humano aux = humanos[num1];
			humanos[num1] = humanos[num2];
			humanos[num2] = aux;
			
		}
		
	}
	
	public void mezclarmalvados() {
		for (int i = 0; i < 100; i++) {
			int num1 = Utils.obtenerNumeroAzar(0, 51);
			int num2 = Utils.obtenerNumeroAzar(0, 51);
			
			//intercambio de valores
			Malvado aux = malvados[num1];
			malvados[num1] = malvados[num2];
			malvados[num2] = aux;
			
		}
		
	}

}
