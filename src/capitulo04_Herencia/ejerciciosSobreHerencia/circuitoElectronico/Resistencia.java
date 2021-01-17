package capitulo04_Herencia.ejerciciosSobreHerencia.circuitoElectronico;

public class Resistencia extends Componente {
	
	int ohmios;

	public Resistencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resistencia(String nombre, String compAnterior, String compSiguiente, int ohmios) {
		super(nombre, compAnterior, compSiguiente);
		this.ohmios = ohmios;
	}

	@Override
	public String toString() {
		return "Resistencia [ohmios=" + ohmios + ", nombre=" + nombre + ", compAnterior=" + compAnterior
				+ ", compSiguiente=" + compSiguiente + "]";
	}

	public int getOhmios() {
		return ohmios;
	}

	public void setOhmios(int ohmios) {
		this.ohmios = ohmios;
	}
	
	
	
	

}
