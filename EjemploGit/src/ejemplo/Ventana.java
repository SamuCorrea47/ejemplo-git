package ejemplo;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320,420);
		setTitle("Ventanita");
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ventana();
	}
}
