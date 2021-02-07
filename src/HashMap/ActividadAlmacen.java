package HashMap;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ActividadAlmacen {
	
	
	static HashMap <Integer, Articulo> hm = new HashMap <Integer, Articulo> ();
	
	static String nombre;
	static int codigo, NumEstante, stock;
	
	private static void HashMap() {
	
		
		hm.put(3754, new Articulo("Pipas", 2, 18));
		hm.put(3874, new Articulo("Peras", 1, 22));
		hm.put(38944, new Articulo("Cucharas", 3, 50));
				
	}
		
	public static void main(String[] args) {
		HashMap();
		
		int opcion;
		do {
			opcion = menu();
			
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("HAS ABANDONADO LA APLICACI�N.");
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
				System.out.println("Opci�n no v�lida");
			}
			
			// El bucle se repetirá mientras no se pulse la opción de salir.
		} while (opcion != 0);
	}
	
	public static int menu () {
		String strMenu = "\n\nMen�"
				+ "\n0.- Salir"
				+ "\n1.- Agregar un art�culo"
				+ "\n2.- Eliminar un art�culo"
				+ "\n3.- Actualizar el estante de un art�culo"
				+ "\n4.- A�adir nombre a un art�culo"
				+ "\n5.- A�adir stock a un art�culo"
				+ "\n6.- Encontrar un art�culo"
				+ "\n7.- Limitar stock"
				+ "\n8.- Ver lista de art�culos"
				+ "\n\nIntroduzca su opci�n: ";
		// Muestro el menú y pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}
	
	public static void visualizaHashMap () {
		System.out.println("\nTodos los productos dentro del HashMap:");
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println(" C�digo de barras del art�culo: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}
		}
	
	public static void agregarHashMap() {
	
		nombre = JOptionPane.showInputDialog("Inserte el nombre del art�culo: ");
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Inserte el c�digo del art�culo: "));
		NumEstante = Integer.parseInt(JOptionPane.showInputDialog("Inserte el n�mero de estante del art�culo: "));
		stock = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de stock del art�culo: "));

		hm.put(codigo, new Articulo(nombre, NumEstante, stock));
		
	}
	
	public static void eliminarHashMap() {
		int eliminar;
		eliminar = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero de art�culo para eliminarlo: "));
		hm.remove(eliminar);
	}
	
	public static void actualizarEstante() {
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el c�digo de barras del art�culo que desea cambiar: "));
		System.out.println(hm.get(codigo));
				
		int numEs = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero de estanter�a nuevo: "));
		
		hm.get(codigo).setNumEstante(numEs);
	}
	
	public static void actualizarNombre() {		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el c�digo de barras del art�culo que desea cambiar: "));
		
		System.out.println(hm.get(codigo));
				
		String nomNuevo = JOptionPane.showInputDialog("Introduce un nombre nuevo: ");
		
		hm.get(codigo).setNombre(nomNuevo);
	}
	
	public static void actualizarStock() {
		String str;
		
		str = JOptionPane.showInputDialog("Introduce el c�digo de barras del art�culo que quiere cambiar: ");
		int codigo = Integer.parseInt(str);
		System.out.println(hm.get(codigo));
				
		str = JOptionPane.showInputDialog("Introduce una cantidad de stock nueva: ");
		int stockNuevo = Integer.parseInt(str);
		
		hm.get(codigo).setStock(stockNuevo);
	}
	
	public static void encontrarArticulo() {
		String str;
		
		str = JOptionPane.showInputDialog("Introduce el c�digo de barras del art�culo que quieres encontrar: ");
		int codigo = Integer.parseInt(str);
		System.out.println(hm.get(codigo));
	}
	}


