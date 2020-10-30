package capitulo05.bloque02;

import utils.Utils;

public class Bloque02Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y 100.
		 *  Debes conseguir que todos los números pares del array cambien de signo, los positivos deben pasar a negativos y viceversa.
		 */
		
		int numeros[] = new int[5];
		
		for(int i=0; i < numeros.length; i++ ) {
			numeros[i]=Utils.obtenerNumeroAzar(-100,100);
			System.out.println("El array original es: " + numeros[i] + " ");
			
			if(numeros[i] %2 ==0) {
				numeros[i] = (numeros[i] * -1);
			}
			System.out.println("El array cambiado es: " + numeros[i] + " ");
		}

	}

}
