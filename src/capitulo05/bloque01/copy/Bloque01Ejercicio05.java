package capitulo05.bloque01.copy;


import utils.Utils;

public class Bloque01Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
		 *  Debes obtener la suma de los números pares y los impares en variables separadas.
		 */
		
		int numeros[] = new int[150];
		int sumapar=0, sumaimpar=0;
		
		
		for (int i=0; i < numeros.length; i++ ) {
			//Con esto asignamos un numero aleatorio en cada posicion del array
			numeros[i] = Utils.obtenerNumeroAzar(0, 150);
			//Comprobamos el numero que hay en cada posición del for 
			System.out.print(numeros[i] + " ");
			
			if (numeros[i] % 2 == 0) {
				sumapar= numeros[i] + sumapar;
			}
			else {
				sumaimpar= numeros[i] + sumaimpar;
			}
		}
		System.out.println(" ");
		System.out.println("La suma de los pares es: " + sumapar);
		System.out.println("La suma de los pares es: " + sumaimpar);
		
		
		

	}

}
