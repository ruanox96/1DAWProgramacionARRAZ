package capitulo04_Herencia.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuestionario {

static List<Pregunta>preguntas = new ArrayList <Pregunta>();
	
	
	public static void main(String[] args) {
		

		PreguntaVF capitalSpain = new PreguntaVF("Madrid es la capital de España", "V");
		
		PreguntaVF drogas = new PreguntaVF("Las drogas estan permitidas en España","F");
		
		PreguntaVF carnet = new PreguntaVF("Te puedes sacar el carnet de coche a los 18 años ","V");
		
		PreguntaOpcionUnica nombrePerro = new PreguntaOpcionUnica("¿Cual es el nombre de mi primera mascota?", 3, new String[] {"Rapida","Ash","Liko","Fufi","Gordi"});
		
		PreguntaOpcionUnica edad = new PreguntaOpcionUnica("Edad mínima para el carnet de ciclomotor", 3, new String[] {"14","15","16","19","25"});
		
		preguntas.add(capitalSpain);
		preguntas.add(drogas);
		preguntas.add(carnet);
		preguntas.add(nombrePerro);
		preguntas.add(edad);
		
		int aciertos =0;
		for (Pregunta p : preguntas) {
			p.muestraEnPantalla();
			Scanner sc = new Scanner(System.in);
			String respuestaUsuario = sc.nextLine();
			boolean correcta = p.esCorecta(respuestaUsuario);
			if(correcta) {
				aciertos++;
			}
			
		}
		float porcentaje = aciertos / (float)preguntas.size()  * 100;
		
		System.out.println(porcentaje);
		
	}

}
