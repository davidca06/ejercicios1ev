package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Número de filas del triángulo: ");
		int numeroFilas=teclado.nextInt();
		int numero=1;
		
		for (int i=1; i<=numeroFilas; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(numero);
				numero=numero+1;
			}
			System.out.println();
			}
		}

}
