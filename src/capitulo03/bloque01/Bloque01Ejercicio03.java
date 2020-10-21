package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio03 {

	public static void main(String[] args) {
		int i, num = 0, pos=0, neg=0, cont;
		
		String str = JOptionPane.showInputDialog("Escribe el numero de numeros que quieres introducir");
		cont = Integer.parseInt(str);// Este contador se utiliza para controlar el numero de iteraciones del bucle
		for(i=0; i<cont; i++) {
			str = JOptionPane.showInputDialog("Escribe un numero para ver cual es el mayor (solamente mayores de 10)");
			num = Integer.parseInt(str);//aqui pedimos los numeros
			if (num > 0) {
				pos++;  //Con esto controlamos que todos los numeros mayores de 0, positivos
			}
			else {
				neg++;
			}
	}
		System.out.println("Los positivos son : " + pos);
		System.out.println("Los negativos son : " + neg);

	}

}
