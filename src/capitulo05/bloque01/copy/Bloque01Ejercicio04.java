package capitulo05.bloque01.copy;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio04 {

	public static void main(String[] args) {
		/*
		 *Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
		 *A continuación pedirás al usuario un valor y buscarás dicho valor en el array. Si lo encuentras,
		 *debes indicar al usuario la posición del array en que se encuenta. En caso de que no encuentres el valor buscado,
		 *debes indicárselo también al usuario.
		 */
		int numeros[] = new int[150];
		int numcomparar, posicion=0;
		int i;
		boolean encontrado=false;
		String str = JOptionPane.showInputDialog("Escribe un numero para ver si esta en el array y la posición");
		numcomparar = Integer.parseInt(str);
		for (i=0; i < numeros.length; i++ ) {
			//Con esto asignamos un numero aleatorio en cada posicion del array
			numeros[i] = (int) Math.round(Math.random() * 100);
			//Comprobamos el numero que hay en cada posición del for 
			System.out.print(numeros[i] + " ");
			posicion++;
			if (numcomparar == numeros[i]) {
				encontrado=true;
				break;
			}
		}
		if(encontrado == true) {
			System.out.println(" ");
			System.out.println("He econtrado el numero que has introducido y su posición es: " + posicion);
		} else {
			System.out.println(" ");
			System.out.println("Lo sentimos su numero no estaba en este array :( ");
		}
		
			
	}
}
