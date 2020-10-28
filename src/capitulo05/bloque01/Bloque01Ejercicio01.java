package capitulo05.bloque01;

public class Bloque01Ejercicio01 {
	
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}

	public static void main(String[] args) {
		int numeros[] = new int[obtenerNumeroAzar ()];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			System.out.print(numeros[i] + " ");
		}

	}

}
