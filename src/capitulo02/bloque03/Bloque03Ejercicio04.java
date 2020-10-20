package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea el importe de una compra y la cantidad recibida y calcule el cambio a devolver,
		 *  teniendo en cuenta que el número de monedas que se devuelven debe ser mínimo. Suponer que el sistema monetario
		 *   utilizado consta de monedas de 100, 50, 25, 5, y 1 unidad. El precio viene dado en unidades monetarias enteras.
		 * Ejemplo: Pagamos con 2000 unidades monetarias un articulo que nos cuesta 375 unidades monetarias,
		 *  la vuelta (1625 u) debería de ser de la siguiente forma:
- 16 monedas de 100 = 1600
- 1 moneda de 25 = 25
		 */
		
		int importe, cambio, pagado;
		int mon100, mon50, mon25, mon5, mon1, suma100, suma50, suma25, suma5, suma1;
		
		String str = JOptionPane.showInputDialog("Escribe el importe e tu compra");
		importe = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Escribe cuanto vas a pagar");
		pagado = Integer.parseInt(str);
		
		cambio= importe - pagado;
		if (cambio > 0) {
			if((cambio/100) > 0) {
				mon100= cambio/100;
				suma100= mon100*100;
				System.out.println("El numero de monedas de 100 es: " + mon100 + " y la suma " + suma100);
				cambio= cambio-suma100;
			}
			
			if ((cambio/50) > 0) {
				mon50= cambio/50;
				suma50= mon50*50;
				
				cambio= cambio-suma50;
				System.out.println("El numero de monedas de 50 es: " + mon50 + " y la suma " + suma50);
			}
			if ((cambio/25) > 0) {
				mon25= cambio/25;
				suma25= mon25*25;
				
				cambio= cambio-suma25;
				System.out.println("El numero de monedas de 25 es: " + mon25 + " y la suma " + suma25);	
			}
			if ((cambio/5) > 0) {
				mon5= cambio/5;
				suma5= mon5*5;
				
				cambio= cambio-suma5;
				System.out.println("El numero de monedas de 5 es: " + mon5 + " y la suma " + suma5);	
			}
			if ((cambio/1) > 0) {
				mon1= cambio/1;
				suma1= mon1*1;
				
				cambio= cambio-suma1;
				System.out.println("El numero de monedas de 1 es: " + mon1 + " y la suma " + suma1);
			}
			
		} else {
			System.out.println("No hay cambio");
		}
		
		
		

	}

}
