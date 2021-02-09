package HashMap;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ActividadAlmacen {
	
	
	static HashMap <Integer, Articulo> hm = new HashMap <Integer, Articulo> ();
	
	static String nombre;
	static int codigo, NumEstante, stock;
	
	private static void HashMap() {
	
		
		hm.put(3754, new Articulo("Coca-Cola", 1, 15));
		hm.put(3874, new Articulo("Cacao", 5, 10));
		hm.put(38944, new Articulo("Papel", 2, 40));
				
	}
		
	public static void main(String[] args) {
		HashMap();
		
		int opcion;
		do {
			opcion = menu();
			
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("HAS ABANDONADO LA APLICACION.");
				break;
			case 1: //A�adir art�culos
				agregarHashMap();
				
				break;
			case 2: // Borrar art�culos
				eliminarHashMap();
				
				break;
			case 3: //Actualizar el estante
				actualizarEstante();

				break;
			case 4: // Elimino una línea del fichero, pido la posición y elimino
				actualizarNombre();
				
				break;
			case 5: // Cortar un conjunto de líneas
				actualizarStock();
				
				break;

			case 6: // Cortar un conjunto de líneas
				encontrarArticulo();
				
				break;
				
			case 7: // Cortar un conjunto de líneas
				actualizarStock();
				
				break;
			case 8: // Ver HashMap

				visualizaHashMap();
				break;
			default:
				System.out.println("Opcion no valida");
			}
			
			// El bucle se repetirá mientras no se pulse la opción de salir.
		} while (opcion != 0);
	}
	
	public static int menu () {
		String strMenu = "\n\nMenu"
				+ "\n0.- Salir"
				+ "\n1.- Agregar articulo"
				+ "\n2.- Eliminar articulo"
				+ "\n3.- Actualizar el estante"
				+ "\n4.- Añadir nombre a un articulo"
				+ "\n5.- Añadir stock a un articulo"
				+ "\n6.- Encontrar un articulo"
				+ "\n7.- Limitar stock"
				+ "\n8.- Ver lista de articulos"
				+ "\n\nIntroduzca su opcion: ";
		// Muestro el menú y pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}
	
	public static void visualizaHashMap () {
		System.out.println("\nTodos los productos dentro del HashMap:");
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println(" Codigo de barras del articulo: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}
		}
	
	public static void agregarHashMap() {
	
		nombre = JOptionPane.showInputDialog("Inserte el nombre del articulo: ");
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Inserte el codigo del articulo: "));
		NumEstante = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero de estante del articulo: "));
		stock = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de stock del articulo: "));

		hm.put(codigo, new Articulo(nombre, NumEstante, stock));
		
	}
	
	public static void eliminarHashMap() {
		int eliminar;
		eliminar = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de articulo para eliminarlo: "));
		hm.remove(eliminar);
	}
	
	public static void actualizarEstante() {
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo de barras del articulo que desea cambiar: "));
		System.out.println(hm.get(codigo));
				
		int numEs = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de estanteria nuevo: "));
		
		hm.get(codigo).setNumEstante(numEs);
	}
	
	public static void actualizarNombre() {		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo de barras del articulo que desea cambiar: "));
		
		System.out.println(hm.get(codigo));
				
		String nomNuevo = JOptionPane.showInputDialog("Introduce un nombre nuevo: ");
		
		hm.get(codigo).setNombre(nomNuevo);
	}
	
	public static void actualizarStock() {
		String str;
		
		str = JOptionPane.showInputDialog("Introduce el codigo de barras del articulo que quiere cambiar: ");
		int codigo = Integer.parseInt(str);
		System.out.println(hm.get(codigo));
				
		str = JOptionPane.showInputDialog("Introduce una cantidad de stock nueva: ");
		int stockNuevo = Integer.parseInt(str);
		
		hm.get(codigo).setStock(stockNuevo);
	}
	
	public static void encontrarArticulo() {
		String str;
		
		str = JOptionPane.showInputDialog("Introduce el codigo de barras del articulo que quieres encontrar: ");
		int codigo = Integer.parseInt(str);
		System.out.println(hm.get(codigo));
	}
	}


