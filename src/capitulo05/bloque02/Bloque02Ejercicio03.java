package capitulo05.bloque02;

import javax.swing.JOptionPane;

import utils.Utils;

public class Bloque02Ejercicio03 {

	public static void main(String[] args) {
		int numeros1[] = new int[5];
		int num;
		String str = JOptionPane.showInputDialog("Escribe numeros para ver cual es el mayor(0 para terminar)");
		num = Integer.parseInt(str);
		
		for (int i=0; i<numeros1.length; i++) {
			numeros1[i]=Utils.obtenerNumeroAzar();
			System.out.println("La multiplicacion es: " +  numeros1[i] + " x " + num + " = " + numeros1[i]*num);	
		}
		

	}

}
