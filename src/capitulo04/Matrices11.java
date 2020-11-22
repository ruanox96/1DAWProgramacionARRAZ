package capitulo04;

public class Matrices11 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] { { 1, 2, 3 }, { 1, 1, 4 }, { 4, 5, 4 }, { 6, 9, 4 } };

		Matrices2.imprimirmatriz(matriz);

		System.out.println();
		int recortada[][];
		recortada = matrizRecortada(matriz, 2);
		

		// Comprobamos filas
		System.out.println("la longitud es " + matriz.length);
		// Comprobamos columnas
		System.out.println("la longitud es " + matriz[0].length);

		Matrices2.imprimirmatriz(recortada);

	}
	
	public static int[][] matrizRecortada(int matriz[][], int filaEliminar) {
		
		int filas = matriz.length-1;
		int column = matriz[0].length;
		int resultado[][] = new int [filas][column];
		
		/*for (int i=0; i< filas; i++) {
			for (int j=0; j<column; j++) {
				if (i==filaEliminar-1) { //Como queremos eliminar la segunda fila, no copiamos aquella que tiene un indice una unidad inferior
					resultado[i][j]=matriz[i+1][j];
				}
				else{ 
					resultado[i][j]=matriz[i][j];
				}
			}
		}
		*/
		boolean eliminado=false;
		
		for (int i=0; i< filas; i++) {
			if(i!=filaEliminar-1 && !eliminado)
			{
				resultado[i]=matriz[i];
			}
			else if (i==filaEliminar-1 && eliminado) {
				resultado[i]=matriz[i+1];
			}
			else {
				resultado[i]=matriz[i+1];
			}
		}
		return resultado;
		
	}

}
