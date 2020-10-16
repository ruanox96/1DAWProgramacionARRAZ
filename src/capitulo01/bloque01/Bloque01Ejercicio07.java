package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio07 {

	public static void main(String[] args) {
		/*
		 * Realiza el "complemento a dos" de un número dado por el usuario. El complemento a dos consiste en dos pasos: en primer
		 *  lugar se deben cambiar todos los bits del valor al que el complemento se está aplicando, en segundo lugar se le debe sumar
		 *   1 (uno). Este ejercicio pedirá al usuario un valor y mostrará el complemento a dos del mismo. La impresión debe hacerse sin signo.
		 */
		int num1;
		
		String str = JOptionPane.showInputDialog("Introduce el numero para calcular el complemento a2: ");
		num1 = Integer.parseInt(str);
		
		num1= ~num1 +1;
		System.out.println("EL complemento dos es: " + num1);
		

	}

}
