package capitulo04_Herencia.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Mueble extends Antiguedad {
	
	String material;
	String color;
	
	
	public Mueble() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mueble(int year, String origen, int precioVenta, String material, String color) {
		super(year, origen, precioVenta);
		this.material = material;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Mueble [material=" + material + ", color=" + color + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}
