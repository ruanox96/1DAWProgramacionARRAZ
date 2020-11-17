package capitulo04;

public class Matrices2 {

	public static void main(String[] args) {
		// Declaración de una matriz
			int matriz[][] = new int[][] {{1, 2, 3},
										  {4, 5 ,6},
										  {7, 8 ,9}};
			imprimirmatriz(matriz);

	}
	
	public static void imprimirmatriz (int matriz[][]) {
		// Recorrido de los valores de la matriz
				for (int i = 0; i < matriz.length; i++) { // Recorro todas las filas
					for (int j = 0; j < matriz[i].length; j++) { // Recorro las columnas de la fila "i"
						System.out.print(matriz[i][j] + "\t"); // Imprimo el valor, con un tabulador y sin \n
					}
					System.out.println(); // Al finalizar una fila, incluyo un salto de línea
				}
	}
}
