package capitulo04;

public class MAtrices6 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] {{1, 0, 0},
			  						  {0, 1 ,0},
			  						  {0, 0, 1}};

		boolean siono = matrizdispersa(matriz);							  
		if (siono== true) {
			System.out.println("La matriz es triangular");
		}
		else {
			System.out.println("La matriz no lo es");
		}
		Matrices2.imprimirmatriz(matriz);

	}
	
	public static boolean matrizdispersa (int matriz[][]) {
		boolean estriangular=true;
		int cont=0;
		for (int i = 0; i < matriz.length; i++) { // Recorro todas las filas
			for (int j = 0; j < matriz.length; j++) { // Recorro las columnas de la fila "i"
				if(matriz[i][j] == 0) {
					cont++;
				}
			}
		}
		System.out.println(cont);
		return estriangular;
	}
}


