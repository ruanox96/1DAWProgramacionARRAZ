package capitulo05.bloque01;

import utils.Utils;

public class Bloque01Ejercicio06 {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int posicion=-1;
		int suma=0;
		
		for(int i=0; i < numeros.length; i++ ) {
			numeros[i]=Utils.obtenerNumeroAzar();
			System.out.print(numeros[i] + " ");
			posicion++;
			
			if(posicion %2 == 0) {
				suma= numeros[i] + suma;
			}

	}
		System.out.println(" ");
		System.out.println("La suma de los numeros con indice par es: " + suma);

}
}
