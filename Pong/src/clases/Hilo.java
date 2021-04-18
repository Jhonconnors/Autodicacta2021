package clases;

public class Hilo extends Thread{
	TableroJuego lamina;
	public Hilo(TableroJuego lamina) {
		this.lamina = lamina;
	}
	public void run() {
		while(true){
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lamina.repaint();
		}
	}
}
