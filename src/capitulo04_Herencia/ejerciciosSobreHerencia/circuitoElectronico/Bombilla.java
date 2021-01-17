package capitulo04_Herencia.ejerciciosSobreHerencia.circuitoElectronico;

public class Bombilla extends Componente {
	
	String tipo;
	int watios;
	
	
	public Bombilla() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bombilla(String nombre, String compAnterior, String compSiguiente, String tipo, int watios) {
		super(nombre, compAnterior, compSiguiente);
		this.tipo = tipo;
		this.watios = watios;
	}
	
	@Override
	public String toString() {
		return "Bombilla [tipo=" + tipo + ", watios=" + watios + ", nombre=" + nombre + ", compAnterior=" + compAnterior
				+ ", compSiguiente=" + compSiguiente + "]";
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getWatios() {
		return watios;
	}
	public void setWatios(int watios) {
		this.watios = watios;
	}
	
	
	

}
