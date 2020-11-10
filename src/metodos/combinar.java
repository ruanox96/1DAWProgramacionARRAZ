package metodos;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class combinar {

	public static void main(String[] args) {
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
	
	public static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			}
	}
	
	public static void recorte(int array[], int primerindice, int segundoindice) {
		int nuevoarray[] = new int [segundoindice - primerindice+1];
		for (int i=0; i<nuevoarray.length; i++) {
			nuevoarray[i] =array[i + primerindice];
		}
			for (int i = 0; i < nuevoarray.length; i++) {
				System.out.print(nuevoarray[i] + " ");
				}
		}
	public static void recursividad (int num0) {
		if (num0 <= 100) {
			System.out.print(num0 + " ");
			recursividad(num0 +2);
		}
	}

}

