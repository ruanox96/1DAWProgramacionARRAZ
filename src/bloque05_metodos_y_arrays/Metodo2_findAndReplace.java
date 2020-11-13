package bloque05_metodos_y_arrays;


public class Metodo2_findAndReplace {

	public static void main(String[] args) {
		/*
		 * Un método llamado "findAndReplace", que reciba: 
   - Un array de números enteros.
   - Un valor entero que debe buscarse en el array.
   - Un valor entero que debe servir para reemplazar.
El método buscará todas las ocasiones en las que el segundo parámetro aparezca dentro del array y reemplazará ese valor con el valor del tercer parámetro.
El método main debe crear un array, imprimirlo en consola, llamar al método "findAndReplace" y volver a imprimir el array en consola.
		 */
		
		int array[] = new int[] {1,2,3,4,5,6,7,8,5};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		int ToFind = 5;
		int ToReplace=99;
		System.out.println("");
		findAndReplace(array, ToFind, ToReplace);
	}
	
	
	public static void findAndReplace (int array[], int ToFind, int ToReplace) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]==ToFind) {
				array[i]=ToReplace;
			}
			System.out.print(array[i] + " ");
		}
		
		
	}

}
