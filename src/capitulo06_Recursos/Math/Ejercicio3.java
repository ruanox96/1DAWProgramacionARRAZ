package capitulo06_Recursos.Math;

public class Ejercicio3 {

	public static void main(String[] args) {


		double x = 3;
		float pifinal = 4;
		int signo = -1;
		do {
		pifinal += signo * 4.0 / x;
		signo *= -1;
		x += 2;

		} while (Math.abs(Math.PI - pifinal) >= 0.00001);
		System.out.println(pifinal);

	}
}
