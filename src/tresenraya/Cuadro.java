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
	//si se ha hecho clic sobre este cuadro
	private boolean clicHecho = false;


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
		
		//Pinto imagenes vectoriales sobre este cuadro si se ha hecho clici sobre el
		if (this.clicHecho) {
			pintaImagenesVectoriales(g);
		}
	
	}
	
	private void pintaImagenesVectoriales (Graphics g) {
		//Pinto un circulo cada vez que toque repintar este cuadro
		g.drawOval(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY, this.ancho, this.alto);
	}
	
	public boolean seHaHechoclicSobreCuadro (int xClic, int yClic) {
		if (xClic > this.esquinaSuperiorIzquierdaX && xClic < (esquinaSuperiorIzquierdaY + ancho) &&
				yClic > this.esquinaSuperiorIzquierdaY && yClic < (esquinaSuperiorIzquierdaY + alto)) {
			return true;
		}
		return false;
	}
	
	
	public void clic () {
		this.clicHecho = true; //Actualizo esta bandera
		
		//Obligo a repintar el objeto Canvas
		TresEnRaya.getInstance().repaint();
		TresEnRaya.getInstance().revalidate();
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
