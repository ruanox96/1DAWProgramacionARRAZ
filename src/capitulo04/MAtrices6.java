package capitulo04;

public class MAtrices6 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] { { 1, 0, 0 }, 
									   { 0, 1, 0 }, 
									   { 0, 0, 1 } };

		boolean siono = matrizdispersa(matriz);
		if (siono == true) {
			System.out.println("La matriz esta mas dispersa que yo");
		} else {
			System.out.println("La matriz no lo es");
		}
		Matrices2.imprimirmatriz(matriz);

	}

	public static boolean matrizdispersa(int matriz[][]) {
		boolean haycero = true;
		for (int i = 0; i < matriz.length; i++) { // Recorro todas las filas
			haycero = false;
			for (int j = 0; j < matriz.length; j++) { // Recorro las columnas de la fila "i"
				if (matriz[i][j] == 0) {
					haycero = true;
					break;
				}

			}
			if (haycero == false) {
				return false;
			}
		}

		for (int i = 0; i < matriz[0].length; i++) { // Recorro todas las columnas
			haycero = false;
			for (int j = 0; j < matriz.length; j++) { // Recorro las columnas de la fila j
				if (matriz[j][i] == 0) {
					haycero = true;
					break;
				}
			}
			if (haycero == false) {
				return false;
			}
		}
		return haycero;

	}
}
