package capitulo05.bloque02;

import javax.swing.JOptionPane;

import utils.Utils;

public class Bloque02Ejercicio03 {

	public static void main(String[] args) {
		int numeros1[] = new int[150];
		int num;
		String str = JOptionPane.showInputDialog("Introduce un numero para multiplicarlo por el array");
		num = Integer.parseInt(str);
		
		for (int i=0; i<numeros1.length; i++) {
			numeros1[i]=Utils.obtenerNumeroAzar();
			System.out.println("La multiplicacion es: " +  numeros1[i] + " x " + num + " = " + numeros1[i]*num);	
		}
		

	}

}
