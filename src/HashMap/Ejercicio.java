package HashMap;

import java.util.HashMap;

public class Ejercicio {

	public static void crearHashMap() {
		HashMap h1 = new HashMap();	
		
		h1.put("1", new Articulo("LimpiaCristal", 2563252, 5, 10));
		h1.put("2", new Articulo("Agua", 7654524, 4, 50));
		h1.put("3", new Articulo("Larios", 4987532, 3, 2));
		
		System.out.println("Mostramos el producto 1 " + h1.get("1"));
		
		h1.put(new Integer("3"), new Articulo("Ron", 231254323, 3, 8));
		
		
		h1.remove("2");
		System.out.println("\nTodos los productos dentro del HashMap:");
		Object claves[] = h1.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println("Identificador tipo: " + claves[i].getClass().getName() + " - valor: " + claves[i].toString() + " - Objeto obtenido: "  + h1.get(claves[i]));
		}
		h1.get(7654524);
	}
	
	
	
	public static void main(String[] args) {
		crearHashMap();

	}

}
