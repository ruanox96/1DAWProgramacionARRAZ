package tresenraya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TresEnRaya extends Canvas {
	
	// Ventana del juego
	JFrame ventana = new JFrame("3 en raya");
	
	//Indicamos alto y ancho
	private static final int JFRAME_WIDTH=700;
	private static final int JFRAME_HEIGHT=700;
	
	//Lista con los objetos tipo cuadro que se van a representar en el canvas
	List<Cuadro> cuadros = new ArrayList<Cuadro>(); 
	//Variable para establecer la instancia del patron singleton
	private static TresEnRaya instance = null;
	
	
	//Constructor de la ventana
	
	public TresEnRaya() {
		//Obtengo referencia al panel princ ipal de la ventana
		JPanel panel = (JPanel) ventana.getContentPane();
		//Establezco una plantilla en el panel, para poder incorporar el canvas
		panel.setLayout(new BorderLayout());
		//Agrego el canvas al panel
		panel.add(this, BorderLayout.CENTER);
		//Dimensiones ventana
		ventana.setBounds(0, 0, JFRAME_WIDTH, JFRAME_HEIGHT);
		
		//Inicializo la lista con los nueve cuadros que formaran el tablero
		inicializaCuadrosDelTablero();
		//Desactivoel comportamiento por defecto al pulsar el boton de cirre de ventana
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// Agrego un demonio a la ventana, parandetectar el evento de cierre de la misma
		ventana.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		//Muestro la ventana
		ventana.setVisible(true);
		this.requestFocus();
	}
	
	//Metodo para devolvver la instancia del patron Singleton
	public static TresEnRaya getInstance () {
		if (instance == null) {
			instance = new TresEnRaya();
		}
		return instance;
	}
	
	private void inicializaCuadrosDelTablero() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.cuadros.add(new Cuadro(i, j));
				
			}
		}
	}
	
	//Creamos un metodo con el que preguntaremos al usuario si quiere salir
	
	private void cerrarAplicacion() {
		String [] opciones = {"Aceptar", "Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(ventana, "Desea cerrar la app?", "Salir del tres en raya", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	//Sobrescribo el metodo paint del propio Canvas, para que cada vez que el SO decida repintarlo nosotros decidimos que queremos que se muestre
	
	
	public void paint(Graphics g) {
		super.paint(g);
		//Pinto un recatngulo tan grande como las dimensiones del canvas
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		//Pinto cada uno de los cuadros que hay en la lista, utilizando graphics para pintarse a si mismo
		for (Cuadro cuadro : cuadros) {
			cuadro.paint(g);
		}
	}
	public static void main(String[] args) {
		TresEnRaya.getInstance();

	}

}
