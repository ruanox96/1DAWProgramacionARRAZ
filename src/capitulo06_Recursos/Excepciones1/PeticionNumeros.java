package capitulo06_Recursos.Excepciones1;

import javax.swing.JOptionPane;



public class PeticionNumeros {

	public static void main(String[] args) {
		pideNumeroPar();
	}

	private static void pideNumeroPar() {

		try {

			String str = JOptionPane.showInputDialog("Introduce un número para ver si es par o impar");
			int num1 = Integer.parseInt(str);

			if (num1 % 2 == 0) {
				System.out.println("El numero introducido es par");
			} else {
			    System.out.println("El numero es impar");
			    throw new ExcepNum ("El numero introducido es impar");
			}
			System.out.println("El numero introducido es: " + num1);
		}catch (ExcepNum e) {
			System.out.println(e);
			
		}catch (Exception e) {
			System.out.println(e);
		
	}

}}
