package unidad3;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int N=(int)(Math.random()*(100000-1000))+1000;

		int numeroOrdenador=(int)(Math.random()*(N-1))+1;
		boolean repetir=true;
		
		while (repetir) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("He pensado un número entre 1 y N, adivina cuál es."); 
		int miNumero=teclado.nextInt();
		
		if (miNumero>numeroOrdenador)
		{
			System.out.println("N es menor");
			}
		else if (miNumero<numeroOrdenador)
		{
			System.out.println("N es mayor");
			
		}
		else 
		{
			System.out.println("¡¡Has acertado!!");
			repetir=false;
		}
		
		} 
		
	}

}
