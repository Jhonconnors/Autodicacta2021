
package pingpong;

import javax.swing.JFrame;


public class Main {
    final static int ANCHURA = 800;
    final static int ALTURA = 500;
    
    
    public Main(){
        JFrame ventana = new JFrame();
        ventana.setSize(ANCHURA, ALTURA);
        ventana.setBounds(0, 0, ANCHURA, ALTURA);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Juego Ping Pong");    
        
        Gameplay gameplay = new Gameplay();
        ventana.add(gameplay);
    }

   
    public static void main(String[] args) {
        new Main();
    }
}
