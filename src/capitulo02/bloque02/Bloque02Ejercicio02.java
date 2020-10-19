package capitulo02.bloque02;

import javax.swing.JOptionPane;

public class Bloque02Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio igual al anterior, pero con las dos siguientes diferencias:
		 *no existe la categoría de números negativos, por tanto si el usuario introduce un negativo,
		 *el programa debe terminar; la otra diferencia es que, al acabar, el programa no debe mostrar
		 *la suma de los números, sino cuantos han entrado en cada categoría. A esto se llema contadores,
		 *a diferencia del ejercicio anterior, que reciben el nombre de acumuladores.
		 */
		
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		//Variables para controlar el numero de numeros
		int nbajos = 0;
		int nmedios = 0;
		int ngrandes= 0;
		
		String str = JOptionPane.showInputDialog("Introduce un número para sumarlo 1/5");
		num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número para sumarlo 2/5");
		num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número para sumarlo 3/5");
		num3 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número para sumarlo 4/5");
		num4 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número para sumarlo 5/5");
		num5 = Integer.parseInt(str);
		
		//Comprobamos cuantos numeros negativos hay y la suma de ellos
		if (num1 < 0) {
			System.exit(0);
			}
		if (num2 < 0) {
			System.exit(0);
			}
		if (num3 < 0) {
			System.exit(0);
			}
		if (num4 < 0) {
			System.exit(0);
			}
		if (num5 < 0) {
			System.exit(0);
			}
		
		//Comprobamos que los numeros sean iguales o mayores que 0 y menores o iguales de 25
		if (num1 >= 0 && num1 <= 25) {
			nbajos = nbajos + 1;
			}
		if (num2 >= 0 && num2 <= 25) {
			nbajos = nbajos + 1;
			}
		if (num3 >= 0 && num3 <= 25) {
			nbajos = nbajos + 1;
			}
		if (num4 >= 0 && num4 <= 25) {
			nbajos = nbajos + 1;
			}
		if (num5 >= 0 && num5 <= 25) {
			nbajos = nbajos + 1;
			}
		System.out.println("El número de numeros bajos es: " + nbajos);
		
		//Comprobamos que el numero sea mayor de 25 y menor o igual que 250
		if (num1 > 25 && num1 <= 250) {
			nmedios = nmedios + 1;
			}
		if (num2 > 25 && num2 <= 250) {
			nmedios = nmedios + 1;
			}
		if (num3 > 25 && num3 <= 250) {
			nmedios = nmedios + 1;
			}
		if (num4 > 25 && num4 <= 250) {
			nmedios = nmedios + 1;
			}
		if (num5 > 25 && num5 <= 250) {
			nmedios = nmedios + 1;
			}
		System.out.println("El número de numeros medios es: " + nmedios);
		
		//Comprobamos que los numeros sean mayores de 250
		if (num1 > 250) {
			ngrandes = ngrandes + 1;
			}
		if (num2 > 250) {
			ngrandes = ngrandes + 1;
			}
		if (num3 > 250) {
			ngrandes = ngrandes + 1;
			}
		if (num4 > 250) {
			ngrandes = ngrandes + 1;
			}
		if (num5 > 250) {
			ngrandes = ngrandes + 1;
			}
		System.out.println("El número de numeros grandes es: " + ngrandes);

	}

}
