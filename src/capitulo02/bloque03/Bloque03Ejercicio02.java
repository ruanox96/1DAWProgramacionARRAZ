package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio02 {

	public static void main(String[] args) {
		
		System.out.println("1. Cálculo de la hipotenusa de un triángulo.");
		System.out.println("2. Cálculo de la superficie de una circunferencia.");
		System.out.println("3. Cálculo del perímetro de una circunferencia.");
		System.out.println("4. Cálculo del área de un rectángulo.");
		System.out.println("5. Cálculo del área de un triángulo.");
		System.out.println("0. Salir de la aplicación.");
		
		String str = JOptionPane.showInputDialog("Escribe el numero 1");
		int opc = Integer.parseInt(str);
		
		switch(opc) {
		case 1:
			int num1;
			num1 = JOptionPane.showInputDialog("Escribe el numero 1");
			float num1 = Float.parseFloat(str);
		}

	}

}
