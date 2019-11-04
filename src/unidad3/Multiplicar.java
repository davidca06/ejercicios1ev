package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int numero,i;
		int producto,producto2;
		int contador=0;
		boolean respuesta=true;
		
		
		
		do {
			System.out.println("Teclea un número del 1 al 10: ");
			numero=teclado.nextInt();
			
			if (numero<=10)
			{
				for (i=1; i<=10; i++)
				{	
					producto=numero*i;
					System.out.println(numero+" x "+i+" = ");
					producto2=teclado.nextInt();
					
					if (producto==producto2)
					{
						System.out.println("Correcto");
											}
					else {
						System.out.println("Incorrecto. La respuesta correcto es: "+producto);
						contador++;
					}
				}
					
					if (contador<2)
					{
						System.out.println("Aprobado");
					}
					else {
						System.out.println("Suspenso");
					}
					
					System.out.println("Deseas repetir (Si/No): ");
					String respuestaTabla=teclado.next();
					if (respuestaTabla.equalsIgnoreCase("no"))
					{
						respuesta=false;
					}
								
			}
			else {
				System.out.println("Número no válido");
			}
			
		} while (respuesta);
		
	}
	
}
