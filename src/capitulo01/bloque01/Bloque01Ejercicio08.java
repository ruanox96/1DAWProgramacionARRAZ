package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio08 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce un número");
		int num = Integer.parseInt(str);
		
		if ((num & 1) == 1) {
			System.out.println("EL número es impar");
		} else {
			System.out.println("EL numero es par");
		}
	

	}

}
