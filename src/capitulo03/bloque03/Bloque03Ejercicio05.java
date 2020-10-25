package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio05 {

	public static void main(String[] args) {
		//Realiza un ejercicio parecido a los dos anteriores, dónde se imprima el mayor valor y el menor de todos los introducidos.
		int num=-1, mayor=0, menor=0, i;
		
		for(i=0; num != 0; i++)  { // Vas a ejecutar las instrucciones del bucle al menos una vez.
			String str = JOptionPane.showInputDialog("Escribe numeros para ver cual es el mayor(0 para terminar)");
			num = Integer.parseInt(str);
			if (i == 0) {
				mayor=num;
				menor=num;
			}
			if (num > mayor && num!=0) {
				mayor=num;
			}
			if (num < menor && num!=0) {
				menor=num;
			}
		} 
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);

	}

}
