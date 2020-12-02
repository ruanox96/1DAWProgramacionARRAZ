package examenpractica;

import javax.swing.JOptionPane;

import utils.Utils;

public class ExamenA {

	public static void main(String[] args) {
		int opcion;
		int j1[] = inicializarArray();
		boolean haybolos =true;
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();

			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("Adios!");
				break;
			case 1:
				mostrarBolos(j1);
				break;
			case 2:
				System.out.println();
				j1 = tirarBola(j1);
				mostrarBolos(j1);
				System.out.println("\nTienes " + puntosBolos(j1) + " puntos");
				haybolos = haybolos(j1);
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0 && haybolos == true);

	}

	public static int menu() {
		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Mostrar Bolos" + "\n2.- Tirar Bola Jugador 1"
				+ "\n3.- Tirar Bolos Jugador 2";
		// Pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	public static boolean haybolos(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				return true;
			}
		}
		return false;
	}

	public static int[] inicializarArray() {
		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = 1;
		}
		return array;
	}

	public static void mostrarBolos(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == 4) {
				System.out.print("\n ");
			}
			if (i == 7) {
				System.out.print("\n  ");
			}
			if (i == 9) {
				System.out.print("\n   ");
			}
			System.out.print(array[i] + " ");
		}
	}

	public static int probabilidadBolos() {
		int probabilidad = Utils.obtenerNumeroAzar(0, 100);
		return probabilidad;
	}

	public static int[] tirarBola(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int probabilidad = probabilidadBolos();
			if (array[i] == 0) {
				i++;
			}
			if (i < 5) {
				if (probabilidad <= 30) {
					array[i] = 0;
				}
			}
			if (i >= 4 && i < 7) {
				if (probabilidad <= 50) {
					array[i] = 0;
				}
			}
			if (i >= 7 && i <= 9) {
				if (probabilidad <= 70) {
					array[i] = 0;
				}
			}
		}
		return array;

	}
	
	public static int puntosBolos (int[] array) {
		int puntos = 0;
		for (int i = 0, ronda=1; i < array.length; i++, ronda++) {
			if (array[i]==0) {
				if (ronda ==1) {
					puntos+=10;
				}
			}
			if (array[i]==0) {
				if (ronda ==2) {
					puntos+=5;
				}
			}
			if (array[i]==0) {
				if (ronda ==3) {
					puntos+=2;
				}
			}
			if (array[i]==0) {
				if (ronda ==4) {
					puntos+=1;
				}
			}
			if (array[i]==0) {
				if (ronda >4) {
					puntos+=0;
				}
			}
			
		}
		return puntos;
	}

}
