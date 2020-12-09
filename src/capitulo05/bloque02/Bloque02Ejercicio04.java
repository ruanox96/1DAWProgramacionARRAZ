package capitulo05.bloque02;

import utils.Utils;

public class Bloque02Ejercicio04 {
	//CICLO ARRAY HACIA DERECHA
	public static void main(String[] args) {
		int numeros[] = new int[5];
		
		for (int i=0; i < numeros.length; i++) {
			numeros[i]=Utils.obtenerNumeroAzar();
			System.out.print(" " + numeros[i] );
		}
		//Guardamos el ultimo antes de sobreescribirlo
		int primero = numeros[numeros.length-1];
		System.out.println(" ");
		
		//desplazamos todo una posicion a la derecha dejando la posicion 0 vacia
		for(int i=numeros.length-1; i > 0 ; i-- ) {
			numeros[i]=numeros[i-1];
		}
		//el ultimo lo pasamos a la posicion 0
		numeros[0]=primero;
		
		for (int i=0; i < numeros.length; i++) {
			System.out.print(" " + numeros[i]);
		}
		
	}

}
