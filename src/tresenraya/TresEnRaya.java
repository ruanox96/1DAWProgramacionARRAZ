package tresenraya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TresEnRaya extends Canvas {
	
	// Ventana del juego
	JFrame ventana = new JFrame("3 en raya");
	
	//Indicamos alto y ancho
	private static final int JFRAME_WIDTH=700;
	private static final int JFRAME_HEIGHT=700;
	
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
		g.setColor(Color.pink);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	public static void main(String[] args) {
		TresEnRaya TresEnRaya = new TresEnRaya();

	}

}
