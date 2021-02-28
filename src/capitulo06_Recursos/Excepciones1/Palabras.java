package capitulo06_Recursos.Excepciones1;

import javax.swing.JOptionPane;

public class Palabras {
	public static void main(String[] args) {
		
		try {
			System.out.println(pideFrase());
		} catch (PalabrasMinimas e) {
			e.printStackTrace();
		} catch (PalabraBombilla e) {
			e.printStackTrace();
		} catch (EspaciosBlancos e) {
			e.printStackTrace();
		} catch (Ofensiva e) {
			e.printStackTrace();
		}

	}

	private static String pideFrase() throws PalabrasMinimas, Ofensiva,  PalabraBombilla, EspaciosBlancos {
		String str = JOptionPane.showInputDialog(
				"Introduce una frase con la palabra bombilla, con 3 palabras y con una palabra ofensiva");

		String[] palabras = str.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			
		}
		if (palabras.length < 3) {
			throw new PalabrasMinimas("no hay al menos 3 palabras");
		}
		if (str.indexOf("tonto") == 0 || str.indexOf("tonta") == 0 || str.indexOf("idiota") == 0) {
			throw new Ofensiva("Hay palabras ofensivas");
		}

		if (str.indexOf("bombilla") == -1) {
			throw new PalabraBombilla("No has intoducido la palabra bombilla");
		}

		if (str.trim().equals("")) {
			throw new EspaciosBlancos("No hay espacios en blanco");
		}
		

		return str;

	}

}


