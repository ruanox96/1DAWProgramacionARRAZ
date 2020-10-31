package capitulo05.bloque02;

import utils.Utils;

public class Bloque02Ejercicio02 {
	
	/*
	 * Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al azar entre 0 y 100.
	 *  Debes crear un tercer array, compuesto de la siguiente forma: en los elementos de índice impar del tercer
	 *   array debes copiar los elementos de índice impar del primer array; en los elementos de índice par del
	 *    tercer array debes copiar los elementos de índice par del segundo array.
	 */

	public static void main(String[] args) {
		int numeros1[] = new int[150];
		int numeros2[] = new int[150];
		int aux[] = new int[150];
		
		System.out.println("Array de numeros1: ");
		for (int i=0; i<numeros1.length; i++) {
			numeros1[i]=Utils.obtenerNumeroAzar();
			System.out.print(numeros1[i] + " ");
		}
		System.out.println("\nArray de numeros2: ");
		for (int i=0; i<numeros2.length; i++) {
			numeros2[i]=Utils.obtenerNumeroAzar();
			System.out.print(numeros2[i] + " ");
		}
		System.out.println("\nArray de aux: ");
		for (int i=0; i<numeros1.length; i++) {
			aux[i] = numeros1[i];
			System.out.print(aux[i] + " ");
		}
		System.out.println("\nArray cambiado numeros1 ");
		for (int i=0; i<numeros2.length; i++) {
			numeros1[i] = numeros2[i];
			System.out.print(numeros1[i] + " ");
		}
		System.out.println("\nArray cambiado numeros2 ");
		for (int i=0; i<aux.length; i++) {
			numeros2[i] = aux[i];
			System.out.print(numeros2[i] + " ");
		}
	}

}
