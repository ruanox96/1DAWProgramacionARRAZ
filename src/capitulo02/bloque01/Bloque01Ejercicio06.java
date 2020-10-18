package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio06 {

	public static void main(String[] args) {
		/*
		 *Realizar un ejercicio en C que pida un número al usuario e indique en pantalla si se trata de un número par o impar.
		 *Recuerda que un número par es aquel cuyo resto de su división entre dos sea siempre cero,
		 *y recuerda que un número impar es aquel cuyo resto de su división entre dos sea siempre uno.
		 */
		
		String str = JOptionPane.showInputDialog("Introduce un número para ver si es par o impar");
		int num1 = Integer.parseInt(str);
		
		if (num1 %2 == 0) {
			System.out.println("El numero introducido es par");
		} else {
			System.out.println("El numero introducido no es par");
		} 
			
		

	}

}
