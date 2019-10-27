package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Lado A del triángulo: ");
		int a=teclado.nextInt();
		System.out.println("Lado B del triángulo: ");
		int b=teclado.nextInt();
		System.out.println("Lado C del triángulo: ");
		int c=teclado.nextInt();
		
		if (((a+b)>c)&&((a+c)>b)&&((b+c)>a))
		
			{
				{System.out.println("A, B Y C forman un triángulo");}
			
		
				if ((a==b)&&(b==c))
					{
						System.out.println("Triángulo equilátero");
						}
					else if ((a==b)||(b==c))
						{
							System.out.println("Triángulo isósceles");
							}
						else {
							System.out.println("Triángulo escaleno");
							}
				}
		else {
			System.out.println("A, B Y C no forman un triángulo");}
	
	}

}
