package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio06 {

	public static void main(String[] args) {
		
		float euribor;
		float diferencial;
		float capital;
		int plazos;
		float ia;
		float im;
		float cm;
		float pot;
		
		String str = JOptionPane.showInputDialog("Introduce el euribor de tu hipoteca");
		euribor = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el diferencial de tu hipoteca");
		diferencial = Float.parseFloat(str);
		
		
		str = JOptionPane.showInputDialog("Introduce el capital de tu hipoteca");
		capital = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el numero de plazos");
		plazos = Integer.parseInt(str);
		
		//Calculamos el interes mensual
		ia = (euribor + diferencial);
		im = (ia / 12 / 100);
		
		pot = (float) (Math.pow(1 + im, plazos));
		
		cm = capital * ((im * pot) / (pot - 1));
		
		System.out.println("La cuota mensual de tu hipoteca es: " + cm);
	
		
	}

}
