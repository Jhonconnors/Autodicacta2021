package clases;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	private static final long serialVersionUID = 1L;
	private final int ANCHO=800, ALTO=500;
	private TableroJuego Lamina;
	private Hilo hilo;
	public Ventana(){
		setTitle("Pong");
		setSize(ANCHO,ALTO);
		setLocationRelativeTo(null);
		setResizable(false);
		Lamina = new TableroJuego();
		add(Lamina);
		addKeyListener(new EventoTeclado());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hilo = new Hilo(Lamina);
		hilo.start();
	
	}
}
