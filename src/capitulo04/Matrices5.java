package capitulo04;

public class Matrices5 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] {{1, 0, 0},
			  						  {0, 1 ,0},
			  						  {0, 0, 1}};

		boolean siono = matriztriangularsuperior(matriz);							  
		if (siono== true) {
			System.out.println("La matriz es triangular");
		}
		else {
			System.out.println("La matriz no lo es");
		}
		Matrices2.imprimirmatriz(matriz);
	}
	
	public static boolean matriztriangularsuperior (int matriz[][]) {
		boolean estriangular=true;
		for (int i = 1; i < matriz.length; i++) { // Recorro todas las filas
			for (int j = 0; j < i; j++) { // Recorro las columnas de la fila "i"
					if(matriz[i][j]!=0) {
						estriangular=false;
					}
			}
		}
		return estriangular;
	}

}
