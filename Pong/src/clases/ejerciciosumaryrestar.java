package clases;

import java.util.Scanner;

public class ejerciciosumaryrestar {

	public static void main(String[] args) {
		
		
		//primero se importa la clase scanner
		
			Scanner teclado =new Scanner(System.in);
			
			//se declaran las variables como enteros
			int num1, num2, resultado;
			
			/*se presenta por pantalla un mensaje al
			 *  usuario pidiendo los numeros y almacenandolos
			 *   en su variable
			*/
			System.out.println("ingrese el numero1: ");
			num1=teclado.nextInt();
			
			System.out.println("ingrese el numero2: ");
			num2=teclado.nextInt();
			
			//se hace el condicional
			if (num1>num2) {
				resultado=num1-num2;			
			}
			else{
				resultado= num1+num2;
			}
			
			System.out.println(resultado);
	teclado.close();
	}

}
