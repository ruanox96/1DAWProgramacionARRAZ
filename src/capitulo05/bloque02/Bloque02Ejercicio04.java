package capitulo05.bloque02;

import utils.Utils;

public class Bloque02Ejercicio04 {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		
		for (int i=0; i < numeros.length; i++) {
			
			numeros[i]=Utils.obtenerNumeroAzar();
			System.out.print(" " + numeros[i] );
		}
		
		int primero = numeros[0];
		System.out.println(" ");
		
		for(int i=0; i < numeros.length-1; i++ ) {
			numeros[i]=numeros[i+1];
			
		}
		

		numeros[4]=primero;
		for (int i=0; i < numeros.length; i++) {
			System.out.print(" " + numeros[i]);
		}
		
	
		

	}

}
