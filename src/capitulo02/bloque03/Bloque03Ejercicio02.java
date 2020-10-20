package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio02 {

	public static void main(String[] args) throws InterruptedException {
		// Creamos el menu con las opciones disponibles
		
		//REcogemos el numero de opcion introducia por el usuario
				
				float num1;
				float num2;
				float area;
				float radio;
				float hipo;
				float perimetro;
				float base;
				float altura;
				int opc;
				String str;
		
		do {
			do {
				
		System.out.println("1. Cálculo de la hipotenusa de un triángulo.");
		System.out.println("2. Cálculo de la superficie de una circunferencia.");
		System.out.println("3. Cálculo del perímetro de una circunferencia.");
		System.out.println("4. Cálculo del área de un rectángulo.");
		System.out.println("5. Cálculo del área de un triángulo.");
		System.out.println("0. Salir de la aplicación.");
		System.out.println("                        ");
		str = JOptionPane.showInputDialog("Escribe una opción");
		opc = Integer.parseInt(str);
			} while (opc < 0 || opc > 5);
		switch(opc) {
		case 1:
			str = JOptionPane.showInputDialog("Escribe el primer cateto");
			num1 = Float.parseFloat(str);
			str = JOptionPane.showInputDialog("Escribe el segundo cateto");
			num2 = Float.parseFloat(str);
			hipo = (float) Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
			System.out.println("La hipotenusa es: " +  hipo);
			
			Thread.sleep (4000);
			break;
		case 2:
			str = JOptionPane.showInputDialog("Escribe el radio");
			radio = Float.parseFloat(str);
			area = (float) (Math.PI * Math.pow(radio,2));
			System.out.println("El area de la circunferencia es:" + area);

			Thread.sleep (4000);
			break;
		
		case 3:
			str = JOptionPane.showInputDialog("Escribe el perimetro");
			perimetro = Float.parseFloat(str);
			str = JOptionPane.showInputDialog("Escribe el radio");
			radio = Float.parseFloat(str);
			perimetro = (float) (2*Math.PI*radio);
			System.out.println("El perimetro es: " + perimetro);

			Thread.sleep (4000);
			break;
			
		case 4:
			str = JOptionPane.showInputDialog("Escribe la base");
			base = Float.parseFloat(str);
			str = JOptionPane.showInputDialog("Escribe la altura");
			altura = Float.parseFloat(str);
			area = base * altura;
			System.out.println("El area de un rectangulo con base: " + base + " y con altura: " + altura + " es: " + area);

			Thread.sleep (4000);
			break;
			
		case 5:
			str = JOptionPane.showInputDialog("Escribe la base");
			base = Float.parseFloat(str);
			str = JOptionPane.showInputDialog("Escribe la altura");
			altura = Float.parseFloat(str);
			area = (base*altura)/2;
			System.out.println("El area de un triangulo con base: " + base + " y con altura: " + altura + " es: " + area);

			Thread.sleep (4000);
			break;
		
		case 0:
			System.out.println("Has introducido el 0, saliendo del programa :)");
			break;
		}
		}
		while (opc != 0);
	

}}
