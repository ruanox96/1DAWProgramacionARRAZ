package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio02 {

	public static void main(String[] args) {
		//Realiza un ejercicio igual al anterior, con la particularidad de imprimir la media al final del ejercicio, no la suma.

		int num=0, suma=0, media, cont=-1;
		
		do  { // Vas a ejecutar las instrucciones del bucle al menos una vez.
			String str = JOptionPane.showInputDialog("Escribe un numero para ir sumando con el anterior (0 cuando quieras finalizar)");
			num = Integer.parseInt(str);
			suma=num+suma;
			cont++;
		} while (num != 0);
		media=suma/cont;
		System.out.println("La media es: " + media);
		System.out.println("Fin de la peticion de numeros");


	}

}
