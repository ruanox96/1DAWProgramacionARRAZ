package capitulo01.bloque01;

public class Bloque01Ejercicio02 {

	public static void main(String[] args) {
		int a = 1, b = 0, c = -1;
		float x1, x2;
		float determinante;
		
		determinante = (float) Math.sqrt(b*b - 4*a*c);
		x1 = ((0 - b) + determinante) / (2 * a);
		x2 = ((0 - b) - determinante) / (2 * a);
		
		System.out.println("La ecuación es " + a + "x(2) + " + b + "x + " + c + " = 0");
		System.out.println("La solución x1 es " + x1 + " y la solución x2 es " + x2);
		
		{
			String cadenaCarac = "Tutorial de Lenguaje de Programación Java.";
			 
			System.out.println("Valor de cadenaCarac: " + cadenaCarac);
			System.out.println("Longitud de cadenaCarac: " + cadenaCarac.length());
			System.out.println("Localización por caracteres: " + cadenaCarac.indexOf("Lenguaje"));
			System.out.println("Localización por índices: " + cadenaCarac.charAt(12));
			System.out.println("Uso de subcadenas: " + cadenaCarac.substring(12, 20));
			System.out.println("Uso de toLower: " + cadenaCarac.toLowerCase());
			System.out.println("Uso de toUpper: " + cadenaCarac.toUpperCase());
			
			esto es una prueba de los cambios
		}
	}

}
