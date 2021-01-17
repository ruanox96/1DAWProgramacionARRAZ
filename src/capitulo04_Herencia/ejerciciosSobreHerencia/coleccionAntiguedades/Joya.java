package capitulo04_Herencia.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Joya extends Antiguedad {
	
	String material;
	int peso;
	
	
	public Joya() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Joya(int year, String origen, int precioVenta) {
		super(year, origen, precioVenta);
		// TODO Auto-generated constructor stub
	}
	
	public Joya(String material, int peso) {
		super();
		this.material = material;
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Joya [material=" + material + ", peso=" + peso + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	

}
