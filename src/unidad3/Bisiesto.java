package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Teclea un a�o: ");
		int a�o=teclado.nextInt();
		
		if ((a�o%4==0)||(a�o%400==0))
		{
			System.out.println("El a�o es bisiesto");
		}
		else {
			System.out.println("El a�o no es bisiesto");
		}

	}

}
