package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class TableroJuego extends JPanel{
	
	private static final long serialVersionUID = 1L;
	Pelota p1 = new Pelota(0,0);
	Raqueta r1 = new Raqueta(10, 200);
	Raqueta r2 = new Raqueta(794-10-Raqueta.ANCHO, 200);
	public TableroJuego() {
		setBackground(Color.black);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.WHITE);
		//g2.fill(new Rectangle2D.Double(0,0,20,20));
		dibujar(g2);
		actualizar();
	}
	public void dibujar(Graphics2D g) {
		g.fill(p1.getPelota());
		g.fill(r1.getRaqueta());
		g.fill(r2.getRaqueta());
		
	}
	public void actualizar() {
		p1.mover(getBounds(), colision(r1.getRaqueta()), colision(r2.getRaqueta()));
		r1.moverR1(getBounds());
		r2.moverR2(getBounds());
	}
	public void iterarJuego() {
		while(true) {
			repaint();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public boolean colision(Rectangle2D r) {
		return p1.getPelota().intersects(r);
	}
}
