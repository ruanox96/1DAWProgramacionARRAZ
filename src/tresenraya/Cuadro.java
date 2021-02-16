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
	private int jugadorPropietario = 0;


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
		pintaImagenesVectoriales(g);
		
	
	}
	
	private void pintaImagenesVectoriales (Graphics g) {
		//Ahora dependiendo del jugador [propietario pinto algo diferernte
		if (this.jugadorPropietario == TresEnRaya.JUGADOR_1) {
			//PAra pintar una cruz pinto dos lineas que se cruzan
			g.drawLine(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY,
					this.esquinaSuperiorIzquierdaX + this.ancho, this.esquinaSuperiorIzquierdaY + alto);
			g.drawLine(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY + alto,
					this.esquinaSuperiorIzquierdaX + this.ancho, this.esquinaSuperiorIzquierdaY);
		}
		if(this.jugadorPropietario == TresEnRaya.JUGADOR_2) {
			g.drawOval(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY, this.ancho, this.alto);
		}
		
	}
	
	public boolean seHaHechoclicSobreCuadro (int xClic, int yClic) {
		if (xClic > this.esquinaSuperiorIzquierdaX && xClic < (esquinaSuperiorIzquierdaY + ancho) &&
				yClic > this.esquinaSuperiorIzquierdaY && yClic < (esquinaSuperiorIzquierdaY + alto)) {
			return true;
		}
		return false;
	}
	
	
	public void clic (int jugador) {
		if (this.jugadorPropietario == 0) {
			this.jugadorPropietario = jugador;
		}
		
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
