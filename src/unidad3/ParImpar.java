package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Teclea un n�mero: ");
		int numero=teclado.nextInt();
		
		if (numero%2==0)
		{
			System.out.println("El n�mero es par");
		}
		else {
			System.out.println("El n�mero es impar");
		}
		

	}

}
