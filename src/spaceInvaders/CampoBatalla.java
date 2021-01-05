package spaceInvaders;

import java.util.Arrays;

import utils.Utils;

public class CampoBatalla {
	
	String nombre;
	int estadisticasHumanos[] = new int[20];
	int estadisticasMalvados[] = new int[20];
	
	Humano humanos[] = new Humano[20];
	Malvado malvados[] = new Malvado[20];
	
	
	public CampoBatalla(String nombre) {
		
		Arrays.fill(estadisticasHumanos, 0);
		Arrays.fill(estadisticasMalvados, 0);
		this.nombre = nombre;
		

		for (int i = 0; i < humanos.length; i++) {
			humanos[i] = new Humano("humano " + i);
		}
		Humano ulthumano = humanos[humanos.length -1];
		ulthumano.setPuntosVida(ulthumano.getPuntosVida()*2);
		humanos[humanos.length -1] = ulthumano;
		
		for (int i = 0; i < malvados.length; i++) {
			malvados[i] = new Malvado("malvado " + i);
		}
		Malvado ultmalvado = malvados[malvados.length -1];
		ultmalvado.setPuntosVida(ultmalvado.getPuntosVida()*2);
		malvados[malvados.length-1] = ultmalvado;
	}
	
	public void mezclarhumanos() {
		for (int i = 0; i < 100; i++) {
			int num1 = Utils.obtenerNumeroAzar(0, humanos.length-1);
			int num2 = Utils.obtenerNumeroAzar(0, humanos.length-1);
			
			//intercambio de valores
			Humano aux = humanos[num1];
			humanos[num1] = humanos[num2];
			humanos[num2] = aux;
			
		}
		
	}
	
	public void mezclarmalvados() {
		for (int i = 0; i < 100; i++) {
			int num1 = Utils.obtenerNumeroAzar(0, malvados.length-1);
			int num2 = Utils.obtenerNumeroAzar(0, malvados.length-1);
			
			//intercambio de valores
			Malvado aux = malvados[num1];
			malvados[num1] = malvados[num2];
			malvados[num2] = aux;
			
		}
		
	}
	
	public void mezclarPersonajes() {
		mezclarhumanos();
		mezclarmalvados();
	}
	
	public void dispararAHumano(int indiceHumano) {
		Humano humano = humanos[indiceHumano];
		int damage = Utils.obtenerNumeroAzar(5, 25);
		int vidaRestante = humano.getPuntosVida() - damage;
		humano.setPuntosVida(vidaRestante);
		actualizarEstadisticaHumanos(indiceHumano);
		
		if (vidaRestante <= 0) {
			humano.setVivo(false);
		}
	}
	
	public void dispararAMalvado(int indiceMalvado) {
		Malvado malvado = malvados[indiceMalvado];
		int damage = Utils.obtenerNumeroAzar(5, 25);
		int vidaRestante = malvado.getPuntosVida() - damage;
		malvado.setPuntosVida(vidaRestante);
		actualizarEstadisticaMalvados(indiceMalvado);
		
		if (vidaRestante <= 0) {
			malvado.setVivo(false);
		}
	}
	
	public boolean batallaTerminada() {
		Humano ultHumano = humanos[humanos.length -1];
		Malvado ultMalvado = malvados[malvados.length -1];
		
		if (ultHumano.isVivo() == false || ultMalvado.isVivo() == false) {
			return true;
		}
		
		return false;
	}
	
	public int primerMalvadoVivo() {
		for (int i = 0; i < malvados.length; i++) {
			if (malvados[i].isVivo()) {
				return i;
			}
		}
		return malvados.length -1;
	}
	
	public int primerHumanoVivo() {
		for (int i = 0; i < humanos.length; i++) {
			if (humanos[i].isVivo()) {
				return i;
			}
		}
		return humanos.length -1;
	}
	
	public void actualizarEstadisticaHumanos(int indiceHumano) {
		estadisticasHumanos[indiceHumano]++;
	}
	
	public void actualizarEstadisticaMalvados(int indiceMalvado) {
		estadisticasMalvados[indiceMalvado]++;
	}
	
	public String getEstadistica() {
		return "Estadisticas de los disparos : \n" + "Humanos: " + Arrays.toString(estadisticasHumanos) + "\n"
				+ " Malvados: " + Arrays.toString(estadisticasMalvados) + "\n";
	}

	@Override
	public String toString() {
		return "CampoBatalla [\n nombre=" + nombre + "\n humanos=" + Arrays.toString(humanos) + "\n malvados="
				+ Arrays.toString(malvados) + "\n] \n" ;
	}
	
	
}
