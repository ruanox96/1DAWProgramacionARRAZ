package capitulo04;


public class Matrices7 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] { { 1, 0, 0 }, 
			   						   { 0, 1, 0 }, 
			   						   { 0, 0, 1 } };
			
			Matrices2.imprimirmatriz(matriz);
			System.out.println();
			arrayUnidimensional(matriz);
		}
		
	

	public static void arrayUnidimensional(int[][] matriz) {

		/*
		 * Crea un método que construya un array unidimensional con todos los elementos
		 * de la matriz. El método recibirá una matriz y devolverá un array.
		 */

		int indice = 0;
		
		int array[] = new int[matriz.length * matriz.length];
	
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				array[indice] = matriz[i][j];
				indice++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}