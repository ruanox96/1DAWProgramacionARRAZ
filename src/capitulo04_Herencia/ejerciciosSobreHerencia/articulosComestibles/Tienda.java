package capitulo04_Herencia.ejerciciosSobreHerencia.articulosComestibles;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

	public static void main(String[] args) {
		
		Perecederos p1 = new Perecederos(01, "Atun", 3, "21/05/21");
		Perecederos p2 = new Perecederos(02, "Tomate", 2, "16/04/21");
		NoPerecederos pn1 = new NoPerecederos(03, "Pasta", 2);
		NoPerecederos pn2 = new NoPerecederos(04, "Arroz", 3);
		
		
		List<Producto> ProductosAlimentacion = new ArrayList<Producto>();
		ProductosAlimentacion.add(p1);
		ProductosAlimentacion.add(p2);
		ProductosAlimentacion.add(pn1);
		ProductosAlimentacion.add(pn2);
		
		MuestraProductos(ProductosAlimentacion);
		
	}
	
	public static void MuestraProductos(List<Producto> ProductosAlimentacion) {
		System.out.println("Contenido de la lista");
		for (int i = 0; i < ProductosAlimentacion.size(); i++) {
			System.out.println( ProductosAlimentacion.get(i));
		}
	}

}
