package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Bloque02Ejercicio02 {

	public static void main(String[] args) {
		int i, num = 0, cont, mayor=0, menor=0;
		
		String str = JOptionPane.showInputDialog("Escribe el numero de numeros que quieres introducir");
		cont = Integer.parseInt(str);// Este contador se utiliza para controlar el numero de iteraciones del bucle
		for(i=0; i<cont; i++) {
			str = JOptionPane.showInputDialog("Escribe un numeros para ver cual es el mayor y el menor");
			num = Integer.parseInt(str);//aqui pedimos los numeros
			if (num > mayor) {
				mayor= num;
			}
			if (num < menor) {
				menor=num;
			}
		
		}
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
	

	}

}
