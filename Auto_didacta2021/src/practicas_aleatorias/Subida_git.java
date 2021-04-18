package practicas_aleatorias;

import javax.swing.JOptionPane;

public class Subida_git {
public static void main(String[] args) {
	System.out.println("L ¡¡¡yo Gané!!!");
	JOptionPane.showMessageDialog(null, "L volví a Ganar!!!!");
	int cont;
	int [] arrays = new int [8];
	for (int i = 0; i < arrays.length; i++) {
		arrays [i] = (int)(Math. random()*10+1);
	}
	for (int i : arrays) {
		System.out.print(arrays);
	}
}
}
