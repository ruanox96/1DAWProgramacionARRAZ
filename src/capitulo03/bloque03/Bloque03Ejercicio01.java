package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida números al usuario. El programa debe detenerse cuando el usuario introduzca
		 *  el número 0 (cero), que no debe tenerse en cuenta para ninguna operación aritmética,
		 *   simplemente para salir de la aplicación. Cuando el programa haya terminado, se debe sacar en pantalla
		 *    el valor de la suma de todos los números.
		 */
		int num=0, suma=0;
		
		do  { // Vas a ejecutar las instrucciones del bucle al menos una vez.
			String str = JOptionPane.showInputDialog("Escribe un numero para ir sumando con el anterior (0 cuando quieras finalizar)");
			num = Integer.parseInt(str);
			suma=num+suma;
			
		} while (num != 0);
		System.out.println("La suma es: " + suma);
		System.out.println("Fin de la peticion de numeros");

	}

}
