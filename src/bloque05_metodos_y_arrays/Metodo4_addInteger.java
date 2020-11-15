package bloque05_metodos_y_arrays;

import utils.Utils;

public class Metodo4_addInteger {

	public static void main(String[] args) {
		/*
		 * Realiza un método llamado "addInteger", que reciba:
   - Un array de números enteros.
   - Un valor entero.
Dentro del método debes:
   - Crear un nuevo array, cuya longitud sea la del array recibido como primer parámetro + 1.
   - Copiar el array del primer parámetro en el array creado dentro del método, elemento tras elemento.
   - Agregar el nuevo elemento al final del nuevo array.
   - Asignar, al array recibido mediante el primer parámetro, el puntero al nuevo array creado en el interior del método.
   - El método debe devolver un array de tipo entero. Main debe recoger el array devuelto e imprimirlo en consola.
		 */
		int array[] = new int[10] ;
		for (int i = 0; i < array.length; i++) {
			array[i]=Utils.obtenerNumeroAzar();
			System.out.print(array[i] + " ");
		}
		int num=0;
		addInteger(array, num);
		


	}
	
	public static int[] addInteger (int array[], int num) {
		int array2[] = new int[array.length+1] ;
		System.out.println(" ");
		for (int i = 0; i < array2.length; i++) {
			if (i<=9) {
				array2[i]=array[i];
				System.out.print(array2[i] + " ");
			}
			else {
				array2[i]=Utils.obtenerNumeroAzar();
				System.out.print(array2[i] + " ");
			}
			
		}
		return array2;
	}

}
