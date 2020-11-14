package bloque05_metodos_y_arrays;

import javax.swing.JOptionPane;

import utils.Utils;

public class Metodo3_CountOcurrences {

	public static void main(String[] args) {
		/*
		 * Realiza un método llamado "countOccurrences", que reciba:
   - 	Un array de números enteros.
   - Un valor entero.
El método debe devolver un valor entero, que corresponda con el número de veces que el valor entero
 recibido como segundo parámetro exista dentro del array recibido como primer parámetro.
		 */

		int array[] = new int[100] ;
		for (int i = 0; i < array.length; i++) {
			array[i]=Utils.obtenerNumeroAzar();
			System.out.print(array[i] + " ");
		}
		int numocurrencias;
		
		String str = JOptionPane.showInputDialog("Introduce un número");
		numocurrencias= Integer.parseInt(str);
		
		CountOcurrences(array, numocurrencias);
	}
	
	
	public static int CountOcurrences (int array[], int numocurrencias) {
		int cont=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == numocurrencias) {
				cont++;
			}
		}
		System.out.println(" ");
		System.out.println("El número de veces que se repite es " + cont);
		return cont;
		
	}

}
