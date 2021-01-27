package capitulo06_Recursos.Math;

public class Ejercicio3 {

	public static void main(String[] args) {


		double pi = 0;
		double f;

		for (int i = 10_000; i <= 100_000000; i += 10_000) {
			double variablePart = 0;
			for (int j = 1; j <= i; j++) {
				variablePart += (Math.pow(-1, j + 1) / ((2 * j) - 1));
			}
			pi = 4 * variablePart;
			System.out.printf("For i = %d\npi = %12.9f\n", i, pi);
		}
			
			f= Math.abs(pi - Math.PI);
			System.out.println(f);

	}
}
