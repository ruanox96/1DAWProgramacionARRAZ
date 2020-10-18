package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida
		 *  dos variables al usuario, tras lo cual, muestre en pantalla el 
		 *  número mayor de los dos introducidos.
		 */
		String str = JOptionPane.showInputDialog("Introduce un número");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un número");
		int num2 = Integer.parseInt(str);
		
		if (num1 > num2) {
			System.out.println("El número mayor es: " + num1);
		}
		else {
			System.out.println("El número mayor es: " + num2);
		}

	}

}
