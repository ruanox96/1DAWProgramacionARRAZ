package capitulo06_Recursos.Math;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Averiguar, con una precisi�n inferior a 0.001, en qu� punto (x, y) se cortan
		// las gr�ficas de las siguientes funciones:
		// y = sqrt(x)
		// y = - ln(x)

		double y1;
		double y2;
		double x = 0.001;

		do {
			y1 = Math.sqrt(x);
			y2 = -Math.log(x);

			x += 0.0001;

		} while (Math.abs(y1 - y2) >= 0.001);

		System.out.println("Se corta en el punto: (" + x + " , " + y1 + ")");
		System.out.println("Se corta en el punto: (" + x + " , " + y2 + ")");

	}

}
