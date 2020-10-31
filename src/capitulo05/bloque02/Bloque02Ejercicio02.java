package capitulo05.bloque02;

import utils.Utils;

public class Bloque02Ejercicio02 {

	public static void main(String[] args) {
		int numeros1[] = new int[5];
		int numeros2[] = new int[5];
		int aux[] = new int[5];
		int i;
		
		for(i=0; i < numeros1.length; i++ ) {
			numeros1[i]=Utils.obtenerNumeroAzar();
			System.out.print(numeros1[i] + " ");
		}
		System.out.println(" ");
		for(i=0; i < numeros2.length; i++ ) {
			numeros2[i]=Utils.obtenerNumeroAzar();
			System.out.print(numeros2[i] + " ");
		}
		numeros1[i] = aux[i];
		System.out.print(aux[i] + " ");

	}

}
