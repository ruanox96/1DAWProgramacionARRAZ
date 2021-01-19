package capitulo04_Herencia.ejerciciosSobreHerencia.cuestionarioAbstracto;

public abstract class Pregunta {
	 
public String enunciado;
	
	public abstract boolean esCorecta(String respuestaUsuario);
	
	
	public Pregunta() {
		super();
	}
	

	public Pregunta(String enunciado) {
		super();
		this.enunciado = enunciado;
	}


	public abstract void muestraEnPantalla();


	public String getEnunciado() {
		return enunciado;
	}


	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}


	@Override
	public String toString() {
		return "Preguntas [enunciado=" + enunciado + "]";
	}
	

}
