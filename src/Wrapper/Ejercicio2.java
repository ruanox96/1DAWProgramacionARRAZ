package Wrapper;

public class Ejercicio2 {

	public static void main(String[] args) {
		char cadenaTexto[] = new char[] {'H', 'o', 'l', 'a', ' ', 'A', 'm', 'i', 'g', 'o', ' ', '2', '5', '5', '\n'};
		System.out.println ("\nAnalizará el array de caracteres: " + cadenaTexto.toString());
		for (int i = 0; i < cadenaTexto.length; i++) {
			System.out.println("'" + cadenaTexto[i] + "' es dígito: " + Character.isDigit(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es letra: " + Character.isLetter(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es letra o dígito: " + Character.isLetterOrDigit(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es minúscula: " + Character.isLowerCase(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es mayúscula: " + Character.isUpperCase(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es un caracter similar a espacio en blanco: " + Character.isWhitespace(cadenaTexto[i]));
		}

	}

}
