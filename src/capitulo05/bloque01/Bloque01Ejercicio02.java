package capitulo05.bloque01;

public class Bloque01Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre un límite inferior
		 * y uno superior que debe especificar el usuario. Debes mostrar el array en pantalla para comprobar el funcionamiento
		 */
		
		int numeros[] = new int[150];
		for (int i=0; i < numeros.length; i++ ) {
			//Con esto asignamos un numero aleatorio en cada posicion del array
			numeros[i] = (int) Math.round(Math.random() * 100);
			//Comprobamos el numero que hay en cada posición del for 
			System.out.print(numeros[i] + " ");
		}
		

	}

}