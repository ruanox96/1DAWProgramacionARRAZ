package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Bloque02Ejercicio01 {

	public static void main(String[] args) {
		int i, num = 0, suma=0, cont, media=0;
		
		String str = JOptionPane.showInputDialog("Escribe el numero de numeros que quieres introducir");
		cont = Integer.parseInt(str);// Este contador se utiliza para controlar el numero de iteraciones del bucle
		for(i=0; i<cont; i++) {
			str = JOptionPane.showInputDialog("Escribe un numero para calcular la media");
			num = Integer.parseInt(str);//aqui pedimos los numeros
			if (num != 0) {
				suma= suma + num;
			}
		media = suma/cont;
		}
		System.out.println("La media es: " + media);
	}

}
