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
		int numeros[] = new int[150];
		int suma=0, mayor=0, menor=0;
		float media=0;
		//Bucle for con el que recorremos todas las posiciones del array, el length es para que pare cuando se acabe el array
		for (int i = 0; i < numeros.length; i++) {
			//Con esto asignamos un numero aleatorio en cada posicion del array
			numeros[i] = (int) Math.round(Math.random() * 100);
			//Comprobamos el numero que hay en cada posición del for 
			System.out.print(numeros[i] + " ");
			//Comprobamos cual es el mayor y cual es el menor de todos los numeros
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
			//Vamos sumando numero por numero y lo guardamos en una variable
			suma = numeros[i] + suma;
			//La media la calculamos cogiendo la suma de todos los numeros entre la longitud del array
			media = suma/numeros.length;
			
		}
		System.out.println(" ");
		System.out.println("La suma es " + suma);
		System.out.println("El mayor es " + mayor);
		System.out.println("El menor es " + menor);
		System.out.println("La media es " + media);
	}

}
