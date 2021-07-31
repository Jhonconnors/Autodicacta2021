
package pingpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener{

	private static final long serialVersionUID = 1L;
	private static boolean juego = false;
    private boolean gameover = false;
    
    private Timer timer;
    private int tiempo = 7;
    
    private int jugador1X =Main.ANCHURA - 25;
    private int jugador1Y = Main.ALTURA /2 -75;
    private int jugador2X = 5;
    private int jugador2Y = Main.ALTURA /2 -75;
    
    private int bolaX= 300;
    private int bolaY = 200;
    private int dirBolaX = 3;
    private int dirBolaY = 3;
    
    static boolean up1 = false;
    static boolean up2 = false;
    static boolean down1 = false;
    static boolean down2 = false;
    
    public Gameplay(){
        timer = new Timer(tiempo, this);
        timer.start();
        setFocusable(true);
        addKeyListener(this);
    }
    
    @Override
    public void paint(Graphics g){
        moverBola();
        moverJugadores();
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Main.ANCHURA, Main.ALTURA);
        
        //jugador1
        g.setColor(Color.WHITE);
        g.fillRect(jugador1X, jugador1Y, 15, 100);
        
        //jugador2
        g.setColor(Color.WHITE);
        g.fillRect(jugador2X, jugador2Y, 15, 100);
        
        //bola
        g.setColor(Color.WHITE);
        g.fillOval(bolaX, bolaY, 20, 20);
    }
    public void moverBola(){
        if (juego) {
            bolaX += dirBolaX;
            bolaY += dirBolaY;
            if(bolaX > 785 || bolaX <0){
                dirBolaX = - dirBolaX;
            }
            if(bolaY > 452 || bolaY <0){
                dirBolaY = - dirBolaY;
            }
        }
    }
    public void moverJugadores(){
        if(juego){
            
        }
    }
    
    public void reiniciar() {
    	
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        timer.start();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_UP){
        up1= true;
                }
      if(e.getKeyCode() == KeyEvent.VK_DOWN){
        down1 = true;
                }
          if(e.getKeyCode() == KeyEvent.VK_W){
        up2 = true;
                }
      if(e.getKeyCode() == KeyEvent.VK_S){
        down2 = true;
                }
    if(e.getKeyCode() == KeyEvent.VK_ENTER){
           juego = true;
       if(gameover) {
        	   reiniciar();
       }
       }

    }

    @Override
    public void keyReleased(KeyEvent e) {
      if(e.getKeyCode() == KeyEvent.VK_UP){
        up1= false;
                }
      if(e.getKeyCode() == KeyEvent.VK_DOWN){
        down1 = false;
                }
          if(e.getKeyCode() == KeyEvent.VK_W){
        up2 = false;
                }
      if(e.getKeyCode() == KeyEvent.VK_S){
        down2 = false;
                }
    }
    
}
