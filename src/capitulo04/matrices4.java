package capitulo04;

public class matrices4 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] {{1, 0, 0},
			  						  {0, 1 ,0},
			  						  {0, 2, 1}};

		boolean siono = matrizdiagonal(matriz);							  
		if (siono== true) {
			System.out.println("La matriz es diagonal");
		}
		else {
			System.out.println("La matriz no lo es");
		}
		Matrices2.imprimirmatriz(matriz);
	}
	
	public static boolean matrizdiagonal (int matriz[][]) {
		boolean esdiagonal=true;
		for (int i = 0; i < matriz.length; i++) { // Recorro todas las filas
			for (int j = 0; j < matriz[i].length; j++) { // Recorro las columnas de la fila "i"
				if (i!=j) {
					if(matriz[i][j]!=0) {
						esdiagonal=false;
					}
				}
				
			}
		}
		return esdiagonal;
	}

}
