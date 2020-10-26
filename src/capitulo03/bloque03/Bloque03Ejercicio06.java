package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero).
		 *  Para cada número introducido se debe mostrar en pantalla su tabla de multiplicar, desde el 0 (cero) hasta el 10.
		 */
		int num=0, i, cont=0;
		
		do{   // Vas a ejecutar las instrucciones del bucle al menos una vez.
			String str = JOptionPane.showInputDialog("Escribe un numero para ver su tabla de multiplicar");
			num = Integer.parseInt(str);
			for(i=0; i<=10;i++) {
				System.out.println(num*i);
			if (num ==0) {
				break;
				}
			}
		}while (num!=0);
		
	}

}