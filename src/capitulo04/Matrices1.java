package capitulo04;

import utils.Utils;

public class Matrices1 {

	public static void main(String[] args) {
		// Declaración de una matriz
		int matriz[][] = new int[5][5];
		matrizazar(matriz);
	}
	
	public static void matrizazar (int matriz[][]) {
				// Asignación de valores al azar en las posiciones de la matriz
				for (int i = 0; i < matriz.length; i++) { // Con la variable "i" recorro todas las filas
					for (int j = 0; j < matriz[i].length; j++) { // Con la variable "j" recorro las columnas de cada fila
						// Asigno número al azar
						matriz[i][j] = Utils.obtenerNumeroAzar(0, 100);
					}
				}
	}

}
