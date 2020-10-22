package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero).
		 *  Para cada número introducido se debe mostrar en pantalla su tabla de multiplicar, desde el 0 (cero) hasta el 10.
		 */
		int num=0, multi=0, i;
		
		do{   // Vas a ejecutar las instrucciones del bucle al menos una vez.
			String str = JOptionPane.showInputDialog("Escribe numeros para ver cual es el mayor(0 para terminar)");
			num = Integer.parseInt(str);
			
			for (i=0; i<=10; i++) {
				if (num == 0) {
					break;
				}
				multi=num*i;
				System.out.println(multi);
			}
			
		}while (num!=0);
		
	}

}
