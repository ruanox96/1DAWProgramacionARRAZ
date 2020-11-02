package capitulo05.bloque02;

import javax.swing.JOptionPane;

import utils.Utils;

public class Bloque03Ejercicio06 {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		int numdesplazar;
		int numguardado=0;
		int direccion;
		
		for (int i=0; i < numeros.length; i++) {
			numeros[i]=Utils.obtenerNumeroAzar();
			System.out.print(" " + numeros[i] );
		}
		
		String str = JOptionPane.showInputDialog("Introduce una dirección para desplazar el array. 1 - derecha. 2 - izquierda: ");
		direccion = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Escribe un numero para mover el array");
		numdesplazar = Integer.parseInt(str);
		
		if(direccion == 1) {
			for (int vueltas=1; vueltas <=numdesplazar; vueltas++) {
				//Guardamos el ultimo antes de sobreescribirlo
				numguardado = numeros[numeros.length-1];
				System.out.println(" ");
				
				//desplazamos todo una posicion a la derecha dejando la posicion 0 vacia
				for(int i=numeros.length-1; i > 0 ; i-- ) {
					numeros[i]=numeros[i-1];
				}
				//el ultimo lo pasamos a la posicion 0
				numeros[0]=numguardado;
				
				for (int i=0; i < numeros.length; i++) {
					System.out.print(" " + numeros[i]);
				}
			}
		} 
		else {
			for (int vueltas=1; vueltas <=numdesplazar; vueltas++) {
				// Guardamos el ultimo en una variable
				numguardado = numeros[0];
				System.out.println(" ");
				// Recorro las posiciones del array de primera a penúltima
				for (int i = 0; i < numeros.length - 1; i++) {
					numeros[i] = numeros[i+1];
				}
				// La primera posición, guardada en numgaurdado, pasa a ser la ultima
				numeros[numeros.length-1] = numguardado;
			}
			for (int i=0; i < numeros.length; i++) {
				System.out.print(" " + numeros[i]);
			}
		}
		
		

	}

}
