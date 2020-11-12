package metodos;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//System.out.println(media(3, 4, 5, 6.7f));
		//System.out.println("El valor " + valormaximoyminimo() + " es correcto");
		//System.out.println("El mayor es " + maximo());
		//System.out.println(numeroImparEntreLimites());
		//imprimeMinimoAMaximo(4, 10, 1);
		//fibonacci(10);
		/*
		String str = JOptionPane.showInputDialog("Introduce un número");
		int longitud = Integer.parseInt(str);
		int[] array = new int [longitud];
		int numerosarray;
		for (int i =0; i <array.length; i++) {
			array[i] = numerosarray = Integer.parseInt(JOptionPane.showInputDialog("numeros del array"));
		}
		imprimeArray(array);
		*/
		/*
		int array[] = new int[] {1,2,3,4,5,6,7,8};
		recorte(array, 4, 6);
		*/
		
//		int num0=1;
//		recursividad(num0);
		
	}
	
	/*
	 * Método que reciba como parámetros de entrada tres valores enteros y uno flotante.
	 * El método se llamará "media" y debe devolver la media aritmética de los cuatro valores.
	 * El valor devuelto debe ser flotante. El método "main" debe llamar a este otro método,
	 * con valores inventados por ti, e imprimir el valor de la media en la consola de salida.
	 */
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @param n3
	 * @param n4
	 * @return
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
	
	/**
	 * 
	 * @return
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
	
	/**
	 * 
	 * @return
	 */
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
	
	/**
	 * 
	 * @return
	 */
	public static int numeroImparEntreLimites () {
		int num;
		num = Utils.obtenerNumeroAzar(1, 100);
		while (num%2 ==0) {
			num =Utils.obtenerNumeroAzar(1, 100);
		}
		return num;
	}
	
	public static String traduceNumero (int num) {
		switch (num) {
		case 0:
			return "cero";
		case 1:
			return "uno";	
		}
		return null;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	public static void imprimeMinimoAMaximo(int num1, int num2, int num3) {
		
		int a[] = new int [] {num1, num2, num3};
		int temporal = 0;

	    for (int i = 0; i < a.length; i++) {
	        for (int j = 1; j < (a.length - i); j++) {
	            if (a[j - 1] > a[j]) {
	                temporal = a[j - 1];
	                a[j - 1] = a[j];
	                a[j] = temporal;
	            }
	        }
	    }
		 System.out.println("Contenido del array");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		
	}
	
	/**
	 * 
	 * @param longitud
	 */
	public static void fibonacci(int longitud) {
		int numeros[] = new int[longitud]; // Declaro el array
		
		// Los dos primeros nÃºmeros de Fibonacci se indican explicitamente
		numeros[0] = 1;
		numeros[1] = 1;
		// Recorro el array desde la posiciÃ³n "2", calculando cada nÃºmero como la suma de los dos
		// anteriores
		for (int i = 2; i < numeros.length; i++) {
			numeros[i] = numeros[i-1] + numeros[i-2];
		}
		
		// Imprimo el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			}
	}
	
	/**
	 * 
	 * @param array
	 * @param primerindice
	 * @param segundoindice
	 */
	public static void recorte(int array[], int primerindice, int segundoindice) {
		int nuevoarray[] = new int [segundoindice - primerindice+1];
		for (int i=0; i<nuevoarray.length; i++) {
			nuevoarray[i] =array[i + primerindice];
		}
			for (int i = 0; i < nuevoarray.length; i++) {
				System.out.print(nuevoarray[i] + " ");
				}
		}
	
	/**
	 * 
	 * @param num0
	 */
	public static void recursividad (int num0) {
		if (num0 <= 100) {
			System.out.print(num0 + " ");
			recursividad(num0 +2);
		}
	}
}
