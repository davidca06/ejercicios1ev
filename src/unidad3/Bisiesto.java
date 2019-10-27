package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Teclea un año: ");
		int año=teclado.nextInt();
		
		if ((año%4==0)||(año%400==0))
		{
			System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año no es bisiesto");
		}

	}

}
