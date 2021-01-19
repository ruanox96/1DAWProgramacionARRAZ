package capitulo04_Herencia.ejerciciosSobreHerencia.cuestionarioAbstracto;

public class Cuestionario {
	
	static List<Pregunta> preguntas = new ArrayList <Pregunta>();
	
	public static void main(String[] args) {
		
		PreguntaVF capitalSpain = new preguntaVF("La capital de España es Madrid");
		preguntas.add(capitalSpain);
		preguntasVF borrasca = new PreguntaVF("Filomena ha sido un anticiclón", "F");
		preguntas.add(borrasca);
		
		PreguntaOpcionUnica capitalAndalucia = new PreguntaOpcionUnica("Capital de Andalucia"),
				new String[] {"Sevilla", "Málaga", "Córdoba", "Almeria"}, 0;
				preguntas.add(capitalSpain);
				
				int aciertos=0;
				for(Pregunta p : preguntas) {
					p.mostrarPregunta();
					Scanner sc = new Scanner(System.in);
					String respuestaUsuario = sc.nextLine();
						boolean correcta = p.verificarRespuesta();
						if (correcta) {
							aciertos++;
						}
				}
				
				float puntuacion = aciertos / (float) preguntas.size() * 100;
				System.out.println("Puntuación " + puntuacion);
		
		
	}

}
