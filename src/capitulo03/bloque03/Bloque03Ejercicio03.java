package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida números al usuario hasta que este introduzca el 0 (cero).
		 *  Al finalizar el ejercicio se debe imprimir en pantalla el valor mayor introducido.
		 *   El valor 0 (cero) no debe tenerse en cuenta.
		 */
		int num=-1, mayor=0, i;
		
		for(i=0; num != 0; i++)  { // Vas a ejecutar las instrucciones del bucle al menos una vez.
			String str = JOptionPane.showInputDialog("Escribe numeros para ver cual es el mayor(0 para terminar)");
			num = Integer.parseInt(str);
			if (i == 0) {
				mayor=num;
			}
			if (num > mayor && num!=0) {
				mayor=num;
			}
		} 
		System.out.println("El mayor es: " + mayor);
		
		
	}

}
