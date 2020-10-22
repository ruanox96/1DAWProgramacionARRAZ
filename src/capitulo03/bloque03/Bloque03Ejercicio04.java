package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio04 {

	public static void main(String[] args) {
		//Realiza un ejercicio igual al anterior, con la particularidad de que debe imprimir en pantalla el menor, no el mayor.
		int num, menor=0;
		do  { // Vas a ejecutar las instrucciones del bucle al menos una vez.
			String str = JOptionPane.showInputDialog("Escribe numeros para ver cual es el mayor(0 para terminar)");
			num = Integer.parseInt(str);
			if (num < menor && num!=0) {
				menor=num;
			}
			if(num==0) {
				break;
			}
		} while (num != 0);
		System.out.println("El menor es: " + menor);

	}

}
