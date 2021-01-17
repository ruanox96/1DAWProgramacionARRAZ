package capitulo04_Herencia.ejerciciosSobreHerencia.circuitoElectronico;

public class Componente {
	
	String nombre;
	String compAnterior;
	String compSiguiente;
	
	
	public Componente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Componente(String nombre, String compAnterior, String compSiguiente) {
		super();
		this.nombre = nombre;
		this.compAnterior = compAnterior;
		this.compSiguiente = compSiguiente;
	}


	@Override
	public String toString() {
		return "Componente [nombre=" + nombre + ", compAnterior=" + compAnterior + ", compSiguiente=" + compSiguiente
				+ "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCompAnterior() {
		return compAnterior;
	}


	public void setCompAnterior(String compAnterior) {
		this.compAnterior = compAnterior;
	}


	public String getCompSiguiente() {
		return compSiguiente;
	}


	public void setCompSiguiente(String compSiguiente) {
		this.compSiguiente = compSiguiente;
	}
	
	
	
	

}
