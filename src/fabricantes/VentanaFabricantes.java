package fabricantes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VentanaFabricantes {

	private JFrame frame;
	private JTextField jtfid;
	private JTextField jtfCIF;
	private JTextField textField;
	private JTextField jtfnombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFabricantes window = new VentanaFabricantes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaFabricantes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 653, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_3 = new JLabel("id:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfid = new JTextField();
		jtfid.setEnabled(false);
		jtfid.setText("Manolo");
		GridBagConstraints gbc_jtfid = new GridBagConstraints();
		gbc_jtfid.insets = new Insets(0, 0, 5, 0);
		gbc_jtfid.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfid.gridx = 1;
		gbc_jtfid.gridy = 0;
		frame.getContentPane().add(jtfid, gbc_jtfid);
		jtfid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CIF:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfCIF = new JTextField();
		jtfCIF.setText("");
		GridBagConstraints gbc_jtfCIF = new GridBagConstraints();
		gbc_jtfCIF.insets = new Insets(0, 0, 5, 0);
		gbc_jtfCIF.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCIF.gridx = 1;
		gbc_jtfCIF.gridy = 1;
		frame.getContentPane().add(jtfCIF, gbc_jtfCIF);
		jtfCIF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfnombre = new JTextField();
		GridBagConstraints gbc_jtfnombre = new GridBagConstraints();
		gbc_jtfnombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfnombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfnombre.gridx = 1;
		gbc_jtfnombre.gridy = 2;
		frame.getContentPane().add(jtfnombre, gbc_jtfnombre);
		jtfnombre.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(btnAnterior);
		
		JButton btnSiguiente = new JButton(">");
		btnSiguiente.setHorizontalAlignment(SwingConstants.LEADING);
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		panel.add(btnUltimo);
		
		JButton btnGuardar = new JButton("Guardar");
		panel.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panel.add(btnEliminar);
		
		JButton btnNuevo = new JButton("Nuevo");
		panel.add(btnNuevo);
		
		textField = new JTextField();
		textField.setText("");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 3;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
	}

}
