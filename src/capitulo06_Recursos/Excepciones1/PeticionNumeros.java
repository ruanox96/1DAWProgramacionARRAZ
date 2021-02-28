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
		}
		
		} 
		catch (ArithmeticException ex) {
			System.out.println("Error el numero es par");
			System.out.println("Mensaje de error: " + ex.getMessage() + "\n\n");
			
		}
		catch (NumberFormatException ex) {
			System.out.println("Error de parseo a un numero");
			System.out.println("Mensaje de error: " + ex.getMessage() + "\n\n");
			//ex.printStackTrace();
		}
		
		
	}

}
