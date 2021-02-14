package capitulo06_Recursos.Wrapper;

import javax.swing.JOptionPane;

public class Ejercicio2Corregido {

	public static void main(String[] args) {
		boolean noAlfanumerico = false;
		boolean digito = false;
		boolean minuscula = false;
		boolean mayuscula = false;
		int i;

		do {

			
			
			String contr = JOptionPane.showInputDialog(
					"Introduce una contraseña que tenga:\n" + "Al menos una mayúscula\n" + "Al menos una minúscula\n"
							+ "Al menos un dígito\n" + "Al menos un carácter no alfanumérico");

			char cad[];
			cad = contr.toCharArray();

			System.out.println("\nAnaliza el array de caracteres: " + cad.toString());
			for (i = 0; i < cad.length; i++) {
				
				noAlfanumerico = false;
				digito = false;
				minuscula = false;
				mayuscula = false;

				if (digito == false) {
					digito = Character.isDigit(cad[i]);
				}
				if (mayuscula == false) {
					mayuscula = Character.isUpperCase(cad[i]);
				}
				if (minuscula == false) {
					minuscula = Character.isLowerCase(cad[i]);
				}
				if (noAlfanumerico == false) {
					noAlfanumerico = (Character.isLetterOrDigit(cad[i]));
				}
			}
			
			System.out.println("digito="+ digito + "mayuscula=" + mayuscula +"minuscula"+ minuscula + "noalfa=" + noAlfanumerico );
		} while ((digito == true || minuscula == true || mayuscula == true || noAlfanumerico == true));
		System.out.println("Contraseña válida.");

	}

}
