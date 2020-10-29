package capitulo05.bloque01;

import javax.swing.JOptionPane;

import utils.UtilsArrays;

public class Bloque01Ejercicio05 {

	public static void main(String[] args) {
		int numsuperior, numinferior;
		String str = JOptionPane.showInputDialog("Introduce el limite superior");
		numsuperior = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce el limite inferior");
		numinferior = Integer.parseInt(str);
		int numeros[] =UtilsArrays.creaArrayNumerosAzar(150, numinferior, numsuperior);
		UtilsArrays.mostrarArray(numeros);
		
		

	}

}
