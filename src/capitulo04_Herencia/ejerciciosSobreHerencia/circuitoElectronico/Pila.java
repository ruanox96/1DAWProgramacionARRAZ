package capitulo04_Herencia.ejerciciosSobreHerencia.circuitoElectronico;

public class Pila extends Componente {
	
	int voltaje;

	public Pila() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pila(String nombre, String compAnterior, String compSiguiente, int voltaje) {
		super(nombre, compAnterior, compSiguiente);
		this.voltaje = voltaje;
	}

	@Override
	public String toString() {
		return "Pila [voltaje=" + voltaje + ", nombre=" + nombre + ", compAnterior=" + compAnterior + ", compSiguiente="
				+ compSiguiente + "]";
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}
	
	
	
	

}
