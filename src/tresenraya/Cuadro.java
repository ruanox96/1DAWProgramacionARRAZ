package tresenraya;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadro {
	// Coordenadas de este cuadro a representar sobre el canvas
	private int xEnTablero, yEnTablero;
	// Coordenadas del pixel superior izquierdo del cuadro representado por cada cuadro
	private int esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY;
	// Ancho y alto de este cuadro
	private int ancho, alto;


	public Cuadro(int xEnTablero, int yEnTablero) {
		super();
		this.xEnTablero = xEnTablero;
		this.yEnTablero = yEnTablero;
	}
	

	public void paint (Graphics g) {
		//Obtengo el ancho y el alto de cada cuadro
		ancho = TresEnRaya.getInstance().getWidth() / 3;
		alto = TresEnRaya.getInstance().getHeight() / 3;
		esquinaSuperiorIzquierdaX = this.xEnTablero * ancho;
		esquinaSuperiorIzquierdaY = this.yEnTablero * alto;
		
		//Pinto el borde
		g.setColor(Color.black);
		g.drawRect(esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY, ancho, alto);
	
	}
	@Override
	public String toString() {
		return "Cuadro [xEnTablero=" + xEnTablero + ", yEnTablero=" + yEnTablero + "]";
	}

	public int getxEnTablero() {
		return xEnTablero;
	}

	public void setxEnTablero(int xEnTablero) {
		this.xEnTablero = xEnTablero;
	}

	public int getyEnTablero() {
		return yEnTablero;
	}

	public void setyEnTablero(int yEnTablero) {
		this.yEnTablero = yEnTablero;
	}
	
	

	

}
