package capitulo04;

public class Matrices8 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] { { 1, 2, 3 }, { 2, 1, 4 }, { 3, 4, 1 } };

		Matrices2.imprimirmatriz(matriz);

		System.out.println();
		boolean siono = false;
		siono = matrizSimetrica(matriz);

		// Comprobamos filas
		System.out.println("la longitud es " + matriz.length);
		// Comprobamos columnas
		System.out.println("la longitud es " + matriz[0].length);

		if (siono == true) {
			System.out.println("La matriz es simetrica");
		} else {
			System.out.println("La matriz no lo es");
		}
	}

	public static boolean matrizSimetrica(int matriz[][]) {
		boolean esSimetrica = true;
		// Miro el numero de elementos del vector de vectores, es decir
		// el numero de filas o el numero de vectores dentro de la matriz
		int filas = matriz.length;

		// Mido el numero de elementos del primer vector dentro de la matriz, es decir
		// La longitud del primer vector dentro de la matriz.
		int column = matriz[0].length;
		
		if (filas == column) {
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < column; j++) {
					if (matriz[i][j] != matriz[j][i]) {
						esSimetrica = false;
					}
				}
			}
		} else {
			System.out.println("No es simetrica porque las dimensiones no lo permiten");
			return false;
		}

		return esSimetrica;
	}

}
