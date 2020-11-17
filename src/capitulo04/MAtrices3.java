package capitulo04;

public class MAtrices3 {

	public static void main(String[] args) {
		// Declaración de una matriz
		int matriz[][] = new int[][] {{1, -2, 3},
									  {4, 5 ,6},
									  {7, 8 ,9}};
		
		boolean siono = matrizpositiva(matriz);							  
		if (siono== true) {
			System.out.println("La matriz es positiva");
		}
		else {
			System.out.println("La matriz tiene algun valor negativo");
		}

	}
	
	public static boolean matrizpositiva (int matriz[][]) {
		boolean espositiva=true;
		for (int i = 0; i < matriz.length; i++) { // Recorro todas las filas
			for (int j = 0; j < matriz[i].length; j++) { // Recorro las columnas de la fila "i"
				if (matriz[i][j] <0) {
					espositiva=false;
				}
			}
		}
		return espositiva;
	}

}
