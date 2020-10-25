package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio07 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero).
		 *  Para cada número introducido se debe mostrar en pantalla su tabla de multiplicar, desde el 0 (cero) hasta el 10.
		 */
		int num=0, positivos=0, negativos=0;
		
		do{   // Vas a ejecutar las instrucciones del bucle al menos una vez.
			String str = JOptionPane.showInputDialog("Escribe numeros para ver cuantos negativos y cuantos positivos hay");
			num = Integer.parseInt(str);
			
			if(num > 0) {
				positivos++;
			}
			if (num == 0) {
					break;
				}
			if (num < 0) {
				negativos++;
			}
				
		}while (num!=0);
		System.out.println("El número de negativos es: " + negativos + " y el numero de positivos es: " + positivos);

	}

}
