package capitulo04;

public class Matrices10 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] { { 1, 2, 3 }, { 1, 1, 4 }, { 4, 5, 4 }, { 6, 9, 4 } };

		Matrices2.imprimirmatriz(matriz);

		System.out.println();
		int opuesta[][];
		opuesta = matrizOpuesta(matriz);

		// Comprobamos filas
		System.out.println("la longitud es " + matriz.length);
		// Comprobamos columnas
		System.out.println("la longitud es " + matriz[0].length);

		Matrices2.imprimirmatriz(opuesta);

	}

	public static int[][] matrizOpuesta(int matriz[][]) {
		int filas = matriz.length;
		int column = matriz[0].length;
		int resultado[][] = new int [filas][column];
		
		for(int i=0; i<filas; i++) {
			for(int j=0; j<column; j++) {
				resultado[i][j]=matriz[i][j]*-1;
			}
		}
		return resultado;
		
	}
}