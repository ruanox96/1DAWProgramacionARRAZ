package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio03 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		int sumanum;
		
		String str = JOptionPane.showInputDialog("Introduce un número para sumarlo 1/3");
		num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número para sumarlo 2/3");
		num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número para sumarlo 3/3");
		num3 = Integer.parseInt(str);
		
		sumanum = (num1 + num2 + num3);
		System.out.println("La suma de los tres numeros es " + sumanum);

	}

}
