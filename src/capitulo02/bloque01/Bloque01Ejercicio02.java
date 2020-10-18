package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio02 {

	public static void main(String[] args) {
		
		/*
		 * Repetir el ejercicio anterior para mostrar el número menor de los dos introducidos .
		 */
		String str = JOptionPane.showInputDialog("Introduce un número");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un número");
		int num2 = Integer.parseInt(str);
		
		if (num1 < num2) {
			System.out.println("El número menor es: " + num1);
		}
		else {
			System.out.println("El número menor es: " + num2);
		}


	}

}
