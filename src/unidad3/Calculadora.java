package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		String op;
		
		do {
		
		System.out.println("Elige la operación a realizar: ");
		System.out.println("1 = Suma");
		System.out.println("2 = Resta");
		System.out.println("3 = Multiplicación");
		System.out.println("4 = División");
		System.out.println("s = Salir");
		op=teclado.next();
		
		if (!op.equalsIgnoreCase("s"))
			
		{
		System.out.println("Teclea el primer operando: ");
		float numero1=teclado.nextInt();
		System.out.println("Teclea el segundo operando: ");
		float numero2=teclado.nextInt();
		
		switch (op) {
		case "+":
			float suma=numero1+numero2;			
			System.out.println(numero1+" "+op+" "+numero2+" = "+suma);
			System.out.println("---------------");
			break;
		case "-":
			float resta=numero1-numero2;
			System.out.println(numero1+" "+op+" "+numero2+" = "+resta);
			System.out.println("---------------");
			break;
		case "x":
			float producto=numero1*numero2;
			System.out.println(numero1+" "+op+" "+numero2+" = "+producto);
			System.out.println("---------------");
			break;
		case "/":
			float division=numero1/numero2;
			System.out.println(numero1+" "+op+" "+numero2+" = "+division);
			System.out.println("---------------");
			break;
		default:
			System.out.println("Error");
			
			}
		}
		else {
			System.out.println("Has salido de la calculadora");
			}
		} while (!op.equalsIgnoreCase("s"));
		
	
	}

}
