package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio07 {

	public static void main(String[] args) {
		String str;
		int num1;
		
		str = JOptionPane.showInputDialog("Introduce un número para ver si es par o impar");
		num1 = Integer.parseInt(str);
		
		if ((num1 & 1) == 1) {
			System.out.println("El número es impar");
	} else {
			System.out.println("El número es impar");
		}
	}

}
