package capitulo04_Herencia.ejerciciosSobreHerencia.circuitoElectronico;

public class Interruptor extends Componente {
	
	String forma;

	public Interruptor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Interruptor(String nombre, String compAnterior, String compSiguiente, String forma) {
		super(nombre, compAnterior, compSiguiente);
		this.forma = forma;
	}


	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Interruptor [forma=" + forma + ", nombre=" + nombre + ", compAnterior=" + compAnterior
				+ ", compSiguiente=" + compSiguiente + "]";
	}

	

	
	
	
	
	
	

}
