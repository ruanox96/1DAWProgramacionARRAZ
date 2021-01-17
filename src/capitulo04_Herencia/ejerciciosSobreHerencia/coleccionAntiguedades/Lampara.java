package capitulo04_Herencia.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Lampara extends Antiguedad {
	
	int numbombillas;
	String material;
	
	
	public Lampara() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lampara(int year, String origen, int precioVenta, int numbombillas, String material) {
		super(year, origen, precioVenta);
		this.numbombillas =  numbombillas;
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Lampara [numbombillas=" + numbombillas + ", material=" + material + "]";
	}
	public int getNumbombillas() {
		return numbombillas;
	}
	public void setNumbombillas(int numbombillas) {
		this.numbombillas = numbombillas;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	

}
