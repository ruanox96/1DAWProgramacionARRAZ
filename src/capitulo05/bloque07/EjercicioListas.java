package capitulo05.bloque07;

import java.awt.JobAttributes;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import utils.Utils;

public class EjercicioListas {

	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<String> fichero = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();
		List<String> fichero2 = new ArrayList<String>();

		// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el
		// programa esté finalizado
		fichero.add("Primera línea");
		fichero.add("Segunda línea");
		fichero.add("Tercera línea");

		// Bucle principal de la aplicación
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();

			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("Adios!");
				break;
			case 1:
				agregarLinea(fichero);
				break;
			case 2:
				insertarLinea(fichero);
				break;
			case 3:
				editarLinea(fichero);
				break;
			case 4:
				eliminarLinea(fichero);
				break;
			case 5:
				cortarLineas(fichero, portapapeles);
				break;
			case 6:
				pegarLineas(fichero2, portapapeles);
				break;
			case 7: // Ha elegido visualizar el fichero
				visualizaLista(fichero);
				break;
			case 8: // Ha elegido visualizar el fichero
				visualizaLista(fichero2);
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

	}

	/**
	 * Muestra un menú en pantalla y pide una opción al usuario
	 * 
	 * @return
	 */
	public static int menu() {
		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Agregar una línea"
				+ "\n2.- Insertar una línea en una posición" + "\n3.- Editar una línea" + "\n4.- Eliminar una línea"
				+ "\n5.- Cortar un conjunto de líneas" + "\n6.- Pegar un conjunto de líneas"
				+ "\n7.- Visualizar el fichero" + "\n8.- Visualizar el fichero2" + "\n\nIntroduzca su opción: ";
		// Pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla
	 * y cada una con su número de línea
	 * 
	 * @param lista
	 */
	public static void visualizaLista(List<String> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}

	public static void agregarLinea(List<String> lista) {
		String str = JOptionPane.showInputDialog("Escribe la linea a insertar");
		lista.add(str);
	}

	public static void insertarLinea(List<String> lista) {
		String str = JOptionPane.showInputDialog("Escribe la linea a insertar");
		int num = Utils.obtenerEnteroPorJOptionPane();

		lista.add(num, str);
	}

	public static void editarLinea(List<String> lista) {
		int num = Utils.obtenerEnteroPorJOptionPane();
		lista.remove(num);
		String str = JOptionPane.showInputDialog("Escribe la linea a insertar");
		lista.add(num, str);
	}

	public static void eliminarLinea(List<String> lista) {
		int num = Utils.obtenerEnteroPorJOptionPane();
		lista.remove(num);
	}

	public static void cortarLineas(List<String> lista, List<String> portapapeles) {

		if (!portapapeles.isEmpty()) {
			portapapeles.removeAll(portapapeles);
		}
		System.out.println("Escribe la primera linea a cortar");
		int num = Utils.obtenerEnteroPorJOptionPane();
		System.out.println("Escribe la última linea a cortar");
		int num2 = Utils.obtenerEnteroPorJOptionPane();
		for (int i = num; i <= num2; i++) {
			portapapeles.add(lista.remove(num));
		}

	}
	
	public static void pegarLineas(List<String> lista, List<String> portapapeles) {
		int num = Utils.obtenerEnteroPorJOptionPane();
		
		lista.addAll(num, portapapeles);
	
	}

}