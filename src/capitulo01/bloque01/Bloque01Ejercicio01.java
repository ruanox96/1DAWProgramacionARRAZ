package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio01 {

	public static void main (String args[]) {
		int numEntero;  // Declaración de una variable entera
		float numFlotante; // Declaración de una variable real o flotante
		double numDouble; // Declaración de una variable flotante larga
		
		String str = JOptionPane.showInputDialog("Introduce un número entero");
		numEntero = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número flotante");
		numFlotante = Float.parseFloat(str);
		str = JOptionPane.showInputDialog("Introduce un número double");
		numDouble = Double.parseDouble(str);
		
		System.out.println("El número entero es: " + numEntero +
				"\nEl número flotante es: " + numFlotante + 
				"\nEl número doble es: " + numDouble);

	}
	

}
