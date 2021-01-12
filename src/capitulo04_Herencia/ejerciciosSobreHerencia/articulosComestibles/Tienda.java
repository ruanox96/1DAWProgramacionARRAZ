package capitulo04_Herencia.ejerciciosSobreHerencia.articulosComestibles;


public class Tienda {

	public static void main(String[] args) {
		
		Producto p1 = new Producto(01, "Atun", 3, "21/05/21");
		Producto p2 = new Producto(02, "Tomate", 2, "16/04/21");
		Producto p3 = new Producto(03, "Mejillones", 5, "12/09/21");
		Producto p4 = new Producto(04, "Gambas", 1, "30/04/22");
		
		
		NoPerecederos pn1 = new NoPerecederos(01, "Pasta", 2);

	}

}
