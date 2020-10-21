package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Realiza una calculadora avanzada,
		 *  pero con la particularidad de que las operaciones deben ser raices,
		 *   potencias y el módulo de la división.
		 */
		
		double num, potencia, raiz, indice, divisor, resudivi;
		
		String str = JOptionPane.showInputDialog("Escribe un numero para calcular la raiz, su potencia y su modulo");
		num = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Escribe el indice");
		indice = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Escribe el divisor");
		divisor = Integer.parseInt(str);
		
		potencia = Math.pow(num, indice);
		System.out.println("La potencia de " + num + " elevado a  " + indice +  " es " + potencia);
		
		raiz = Math.pow(num, 1/indice);
		System.out.println("La raiz cuadrado de " + num + " con indice " + indice + " es " + raiz);
		
		resudivi = num % divisor;
		System.out.println("El resultado de " + num + " entre su divisor " + divisor + " es " + resudivi);

	}

}
