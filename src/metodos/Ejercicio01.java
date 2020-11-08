package metodos;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//System.out.println(media(3, 4, 5, 6.7f));
		System.out.println(valormaximoyminimo());
	}
	
	/*
	 * Método que reciba como parámetros de entrada tres valores enteros y uno flotante.
	 * El método se llamará "media" y debe devolver la media aritmética de los cuatro valores.
	 * El valor devuelto debe ser flotante. El método "main" debe llamar a este otro método,
	 * con valores inventados por ti, e imprimir el valor de la media en la consola de salida.
	 */
	public static float media (int n1, int n2, int n3, float n4) {
		float resultado = (n1 + n2 + n3 + n4)/4;
		return resultado;
	}
	
	/*
	 * Método llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos valores enteros:
	 * un valor mínimo y un valor máximo. El método debe pedir un numero al usuario. El método examinará
	 * el número introducido por el usuario y, si dicho número no está entre el valor mínimo y
	 * el máximo que se ha indicado, seguirá pidiendo números al usuario hasta que se obtenga uno válido.
	 * Finalmente se debe devolver dicho valor del usuario al método main, que lo imprimirá en la consola.
	 */
	public static int valormaximoyminimo (int maximo, int minimo, int valor) {
		String str = JOptionPane.showInputDialog("Introduce el limite máximo");
		maximo = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce el límite mínimo");
		minimo = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce el numero");
		valor = Integer.parseInt(str);
		
		while (valor <= maximo && valor >= minimo) {
			return valor;
		}
		return valor;
		
	}
	

}
