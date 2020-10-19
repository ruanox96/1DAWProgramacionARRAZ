package capitulo02.bloque02;

import javax.swing.JOptionPane;

public class Bloque02Ejercicio01 {

	public static void main(String[] args) {
		/*
		 *Realiza un ejercicio que acumule cinco números introducidos por el usuario, es decir, que sume las cantidades
		 *introducidas, pero realizando cuatro categorías: números negativos, números bajos (entre 0 y 25, ambos inclusive),
		 *números medios (entre 26 y 250, ambos inclusie) y números grandes (mayores de 250).
		 *Al finalizar el programa, se debe mostrar el total de las sumas de los números
		 *introducidos en cada una de las categorías.

		 */
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		//Variables para controlar el numero de numeros y la suma de ellos
		int nnegativos = 0;
		int snegativos = 0;
		int nbajos = 0;
		int sbajos = 0;
		int nmedios = 0;
		int smedios = 0;
		int ngrandes= 0;
		int sgrandes = 0;
		
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
			nnegativos = nnegativos + 1;
			snegativos = num1;
			}
		if (num2 < 0) {
			nnegativos = nnegativos + 1;
			snegativos = snegativos + num2;
			}
		if (num3 < 0) {
			nnegativos = nnegativos + 1;
			snegativos = snegativos + num3;
			}
		if (num4 < 0) {
			nnegativos = nnegativos + 1;
			snegativos = snegativos + num4;
			}
		if (num5 < 0) {
			nnegativos = nnegativos + 1;
			snegativos = snegativos + num5;
			}
		System.out.println("El número de numeros negativos es: " + nnegativos + " Y la suma de ellos es: " + snegativos);
		
		//Comprobamos que los numeros sean iguales o mayores que 0 y menores o iguales de 25
		if (num1 >= 0 && num1 <= 25) {
			nbajos = nbajos + 1;
			sbajos = num1;
			}
		if (num2 >= 0 && num2 <= 25) {
			nbajos = nbajos + 1;
			sbajos = sbajos + num2;
			}
		if (num3 >= 0 && num3 <= 25) {
			nbajos = nbajos + 1;
			sbajos = sbajos + num3;
			}
		if (num4 >= 0 && num4 <= 25) {
			nbajos = nbajos + 1;
			sbajos = sbajos + num4;
			}
		if (num5 >= 0 && num5 <= 25) {
			nbajos = nbajos + 1;
			sbajos = sbajos + num5;
			}
		System.out.println("El número de numeros bajos es: " + nbajos + " Y la suma de ellos es: " + sbajos);
		
		//Comprobamos que el numero sea mayor de 25 y menor o igual que 250
		if (num1 > 25 && num1 <= 250) {
			nmedios = nmedios + 1;
			smedios = num1;
			}
		if (num2 > 25 && num2 <= 250) {
			nmedios = nmedios + 1;
			smedios = smedios + num2;
			}
		if (num3 > 25 && num3 <= 250) {
			nmedios = nmedios + 1;
			smedios = smedios + num3;
			}
		if (num4 > 25 && num4 <= 250) {
			nmedios = nmedios + 1;
			smedios = smedios + num4;
			}
		if (num5 > 25 && num5 <= 250) {
			nmedios = nmedios + 1;
			smedios = smedios + num5;
			}
		System.out.println("El número de numeros medios es: " + nmedios + " Y la suma de ellos es: " + smedios);
		
		//Comprobamos que los numeros sean mayores de 250
		if (num1 > 250) {
			ngrandes = sgrandes + 1;
			sgrandes = num1;
			}
		if (num2 > 250) {
			ngrandes = ngrandes + 1;
			sgrandes = sgrandes + num2;
			}
		if (num3 > 250) {
			ngrandes = ngrandes + 1;
			sgrandes = sgrandes + num3;
			}
		if (num4 > 250) {
			ngrandes = ngrandes + 1;
			sgrandes = sgrandes + num4;
			}
		if (num5 > 250) {
			ngrandes = ngrandes + 1;
			sgrandes = sgrandes + num5;
			}
		System.out.println("El número de numeros grandes es: " + ngrandes + " Y la suma de ellos es: " + sgrandes);
	
		

	}

}
