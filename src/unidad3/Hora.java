package unidad3;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Teclea la hora (0-23): ");
		int hora=teclado.nextInt();
		System.out.println("Teclea los minutos (0-59): ");
		int min=teclado.nextInt();
		System.out.println("Teclea los segundos (0-59): ");
		int seg=teclado.nextInt();
		
		if ((seg==59)&&(min==59)&&(hora==23))
		{
			hora=0;
			min=0;
			seg=0;
			System.out.println(hora+"h "+min+"min "+seg+"seg");
		}
		else if ((seg==59)&&(min==59)) 
		
		{
			hora=hora+1;
			min=0;
			seg=0;
			System.out.println(hora+"h "+min+"min "+seg+"seg");
			
		}
		else if (seg==59)
		{
			hora=hora;
			min=min+1;
			seg=0;
			System.out.println(hora+"h "+min+"min "+seg+"seg");
		}
		else {
			hora=hora;
			min=min;
			seg=seg+1;
			System.out.println(hora+"h "+min+"min "+seg+"seg");
		}

	}

}
