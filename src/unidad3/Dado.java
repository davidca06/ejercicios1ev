package unidad3;

import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Número de veces que quieres lanzar el dado: ");
		int Nveces=teclado.nextInt();
		
		int contador1=0,contador2=0,contador3=0,contador4=0,contador5=0,contador6=0;
	
		for (int i=1; i<=Nveces; i++)
		{
			int dado=(int)(Math.random()*(6-1))+1;
			System.out.println("Ha salido: "+dado);
			
			if (dado==1) 
			{contador1++;}
				else if (dado==2)
				{contador2++;}
				else if (dado==3) 
				{contador3++;}
				else if (dado==4) 
				{contador4++;}
				else if (dado==5) 
				{contador5++;}
				else {
					contador6++;
				}
		}
		
		System.out.println("==========");
		System.out.println("Cara 1: "+contador1+" veces");
		System.out.println("Cara 2: "+contador2+" veces");
		System.out.println("Cara 3: "+contador3+" veces");
		System.out.println("Cara 4: "+contador4+" veces");
		System.out.println("Cara 5: "+contador5+" veces");
		System.out.println("Cara 6: "+contador6+" veces");
	}

}
