package capitulo04_Herencia.ejerciciosSobreHerencia.coleccionAntiguedades;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		Lampara l1 = new Lampara(1980, "España", 120, 5, "hola");
		Libro l2 = new Libro(1991, "España", 10, "1984", "George Orwell");
		Joya j1 = new Joya(1890, "Francia", 500, "Diamantes", 120);
		Mueble m1 = new Mueble(1995, "USA", 240, "Roble", "Beige");
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(j1.toString());
		System.out.println(m1.toString());
	}

}
