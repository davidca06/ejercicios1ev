package unidad3;

import java.util.Scanner;

public class AdivinaNumero2 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		boolean fallo=true;
		int N;
		int min=1;
		String respuesta="mayor";
		
		System.out.println("Teclea el n�mero a acertar: ");
		int miNumero=teclado.nextInt();
		System.out.println("El n�mero a acertar es: "+miNumero);
		System.out.println("============");
		
		System.out.println("�Cu�l es el l�mite superior?");
		N=teclado.nextInt();
		
		do {
		
		int numeroOrdenador=(int)(Math.random()*(N-min))+min;
		
		System.out.println("�El n�mero es: "+numeroOrdenador);
		
		if (numeroOrdenador==miNumero) {
			System.out.println("Has acertado!!!");
			fallo=false;
		}
		
		else {
			System.out.println("No has acertado");
			System.out.println("�Pero es mayor o menor?");
			respuesta=teclado.next();
			
			if (respuesta.equalsIgnoreCase("mayor")) 
			{
				min=numeroOrdenador;
				if (numeroOrdenador>=(N-1))
					{
					System.out.println("Me has enga�ado");
					fallo=false;
					}
			}
			
			if (respuesta.equalsIgnoreCase("menor")) 
			{
				N=numeroOrdenador;
				if (numeroOrdenador<=(min+1))
				{
				System.out.println("Me has enga�ado");
				fallo=false;
						}
						
			} 
		
		
			}
		
		} while (fallo);		
			
	}
	
}