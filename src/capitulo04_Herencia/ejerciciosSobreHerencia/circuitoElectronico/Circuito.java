package capitulo04_Herencia.ejerciciosSobreHerencia.circuitoElectronico;

public class Circuito {

	public static void main(String[] args) {
		
		Pila pila = new Pila("Pila", "Resistencia", "Interruptor", 20);
		Resistencia resistencia = new Resistencia("Resistencia", "Bombilla", "Pila", 25);
		Interruptor interruptor = new Interruptor("Interruptor", "Pila", "Bombilla", "Redonda");

		pila.setCompAnterior("Resistencia");
		pila.setCompSiguiente("Interruptor");
		resistencia.setCompAnterior("Bombilla");
		resistencia.setCompSiguiente("Pila");
		interruptor.setCompAnterior("Pila");
		interruptor.setCompSiguiente("Bombilla");

		System.out.println(pila);
		System.out.println(resistencia);
		System.out.println(interruptor);

	}

}
