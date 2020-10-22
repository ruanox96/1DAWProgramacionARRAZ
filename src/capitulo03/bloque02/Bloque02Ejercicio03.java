package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Bloque02Ejercicio03 {

	public static void main(String[] args) {
		int i, num;
		String str = JOptionPane.showInputDialog("Escribe un numero para ver sus multiplos hasta el 100");
		num = Integer.parseInt(str);
		
		for(i=1; (num * i) <100; i++){
			System.out.println("EL múltiplo es: " + (num*i));
		}

	}

}
