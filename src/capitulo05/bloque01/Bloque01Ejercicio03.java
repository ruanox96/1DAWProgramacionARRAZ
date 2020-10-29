package capitulo05.bloque01;

public class Bloque01Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
		 * Después de su inicialización debéis imprimir el array en orden inverso.
		 */
		int numeros[] = new int[150];
		for (int i=numeros.length-1; i >= 0; i--) {
			//Con esto asignamos un numero aleatorio en cada posicion del array
			numeros[i] = (int) Math.round(Math.random() * 100);
			//Comprobamos el numero que hay en cada posición del for 
			System.out.print(numeros[i] + " ");
		}

	}

}
