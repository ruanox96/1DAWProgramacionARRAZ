package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Bloque02Ejercicio04 {

	public static void main(String[] args) {
		int i, num, cont;
		String str = JOptionPane.showInputDialog("Escribe un numero para ver sus multiplos hasta el 100");
		num = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Escribe el limite de multiplos");
		cont = Integer.parseInt(str);
		
		for(i=1; (num*i)<cont; i++){
			System.out.println("EL número es: " + (num*i));
		}

	}

}
