package capitulo05.bloque01;

public class Bloque01Ejercicio01 {
	
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
		 * Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos los números que aparecen en el array.
		 */
		int numeros[] = new int[3];
		int suma=0, mayor=0, menor=0;
		float media;
		//Bucle for con el que recorremos todas las posiciones del array, el length es para que pare cuando se acabe el array
		for (int i = 0; i < numeros.length; i++) {
			//Con esto asignamos un numero aleatorio en cada posicion del array
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
			if (i == 0) {
				mayor=numeros[i];
				menor=numeros[i];
			}
			if (numeros[i] > mayor && numeros[i]!=0) {
				mayor=numeros[i];
			}
			if (numeros[i] < menor && numeros[i]!=0) {
				menor=numeros[i];
			}
			suma = numeros[i] + suma;
			
		}
		
		System.out.println("La suma es " + suma);
		System.out.println("El mayor es " + mayor);
		System.out.println("El menor es " + menor);
	}

}
