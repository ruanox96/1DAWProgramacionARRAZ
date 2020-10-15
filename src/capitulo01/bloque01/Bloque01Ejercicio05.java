package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio05 {

	public static void main(String[] args) {
		// Recogemos dos palabras y las mostramos antes de cambiarla de orden
		String palabra1 = JOptionPane.showInputDialog("Introduce una palabra para cambiarla por otra");
		String palabra2 = JOptionPane.showInputDialog("Introduce la otra palabra para cambiarla por la primera");
		System.out.println("Las palabras antes de cambiarse de orden son: " + palabra1 + " y " + palabra2);
		
		String cambio = palabra1;
		palabra1 = palabra2;
		palabra2 = cambio;
		System.out.println("Las variables depues de cambiarse de oren son: " + palabra1 + " y " + palabra2);

	}

}
