package capitulo04;

public class Matrices9 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] { { 1, 2, 3 }, { 1, 1, 4 }, { 4, 5, 4 }, { 6, 9, 4 } };

		Matrices2.imprimirmatriz(matriz);
		
		System.out.println();
		int traspuesta[][];
		traspuesta = matrizTraspuesta(matriz);
		
		//Comprobamos filas
		System.out.println("la longitud es " + matriz.length);
		//Comprobamos columnas
		System.out.println("la longitud es " + matriz[0].length);

		Matrices2.imprimirmatriz(traspuesta);


	}

	public static int[][] matrizTraspuesta(int matriz[][]) {
		int filasMAT = matriz.length;
		int columnMAT = matriz[0].length;
		
		
		int filasRES= columnMAT;
		int columRES= filasMAT;
		
		int resultado[][] = new int [filasRES][columRES];
		
		
		for (int i = 0; i < filasRES; i++) {
			for (int j = 0; j < columRES; j++) {
				resultado[i][j]=matriz[j][i];
				}
			}
		return resultado;
	}

}
