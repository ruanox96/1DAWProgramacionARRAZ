package metodos;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//System.out.println(media(3, 4, 5, 6.7f));
		//System.out.println("El valor " + valormaximoyminimo() + " es correcto");
		//System.out.println("El mayor es " + maximo());
		System.out.println(numeroImparEntreLimites());
		
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
	public static int valormaximoyminimo () {
		String str = JOptionPane.showInputDialog("Introduce el limite máximo");
		int maximo = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce el límite mínimo");
		int minimo = Integer.parseInt(str);
		int valor;
		do  {
			str = JOptionPane.showInputDialog("Introduce el numero");
			valor = Integer.parseInt(str);
		}
		while (valor > maximo || valor < minimo);
		return valor;
		 
	}
	
	public static int maximo () {
		String str = JOptionPane.showInputDialog("Introduce un numero para ver si es mayor que el siguiente");
		int num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce el otro numero");
		int num2 = Integer.parseInt(str);
		int mayor;
		
		if (num1 > num2) {
			mayor = num1;
		}
		else {
			mayor = num2;
		}
		return mayor;
		
	}
	
	public static int numeroImparEntreLimites () {
		int num;
		num = Utils.obtenerNumeroAzar(1, 100);
		while (num%2 ==0) {
			num =Utils.obtenerNumeroAzar(1, 100);
		}
		return num;
	}
	
	public static int imprimeMinimoAMaximo (int num1, int num2, int num3) {
		int a,b,c;
		
		if (num1 > num2 && num1 > num3)
			a = num1;
		if (num1 < num2 && num1 > num3)
			b = num1;
		if (num1 < num2 && num1 < num3)
			c = num1;
		
		return mayor;
	}

}
