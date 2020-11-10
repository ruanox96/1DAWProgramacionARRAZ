package capitulo05.bloque03;

import utils.Utils;

public class Bloque03Ejercicio01 {

	/*
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000.
	 * Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado
	 * "Burbuja", con el objetivo de ordenar el array completamente.
	 */
	public static void main(String[] args) {
		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 1000);
		}
		int temporal = 0;

	    for (int i = 0; i < array.length; i++) {
	        for (int j = 1; j < (array.length - i); j++) {
	            if (array[j - 1] > array[j]) {
	                temporal = array[j - 1];
	                array[j - 1] = array[j];
	                array[j] = temporal;
	            }
	        }
	    }
		 System.out.println("Contenido del array");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
	}

}
