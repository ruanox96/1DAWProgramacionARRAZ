package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio01 {

	public static void main(String[] args) {
		int i, num = 0, suma = 0;
		for(i=0; i<5; i++) {
			String str = JOptionPane.showInputDialog("Escribe un numero para ver cual es el mayor (solamente mayores de 10)");
			num = Integer.parseInt(str);
			if (num > 10) {
				suma= suma + num;
			}		
	}
		System.out.println("La suma es: " + suma);

}
}