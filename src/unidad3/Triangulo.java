package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Lado A del tri�ngulo: ");
		int a=teclado.nextInt();
		System.out.println("Lado B del tri�ngulo: ");
		int b=teclado.nextInt();
		System.out.println("Lado C del tri�ngulo: ");
		int c=teclado.nextInt();
		
		if (((a+b)>c)&&((a+c)>b)&&((b+c)>a))
		
			{
				{System.out.println("A, B Y C forman un tri�ngulo");}
			
		
				if ((a==b)&&(b==c))
					{
						System.out.println("Tri�ngulo equil�tero");
						}
					else if ((a==b)||(b==c))
						{
							System.out.println("Tri�ngulo is�sceles");
							}
						else {
							System.out.println("Tri�ngulo escaleno");
							}
				}
		else {
			System.out.println("A, B Y C no forman un tri�ngulo");}
	
	}

}
