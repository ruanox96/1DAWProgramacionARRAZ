package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio04 {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double num3;
		double medianum;
		
		String str = JOptionPane.showInputDialog("Introduce un número para sumarlo 1/3");
		num1 = Double.parseDouble(str);
		str = JOptionPane.showInputDialog("Introduce un número para sumarlo 2/3");
		num2 = Double.parseDouble(str);
		str = JOptionPane.showInputDialog("Introduce un número para sumarlo 3/3");
		num3 = Double.parseDouble(str);
		
		medianum = (num1 + num2 + num3) / 3;
		System.out.println("La media de los tres numeros es " + medianum);
	}

}
