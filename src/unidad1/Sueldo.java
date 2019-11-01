package unidad1;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		
			Scanner teclado=new Scanner(System.in);
			
			float comisiones;
						
			System.out.println("Sueldo Base: ");
			float sueldoBase=teclado.nextFloat();
			System.out.println("Primera Venta: ");
			float venta1=teclado.nextFloat();
			System.out.println("Segunda Venta: ");
			float venta2=teclado.nextFloat();
			System.out.println("Tercera Venta: ");
			float venta3=teclado.nextFloat();
			
			comisiones=venta1*.1f+venta2*.1f+venta3*.1f;
			float sueldo;
			sueldo=sueldoBase+comisiones;
			System.out.printf("Importe a cobrar por comisiones: %.2f euros",comisiones);
			System.out.println(" ");
			System.out.printf("El sueldo de este mes: %.2f euros",sueldo);
			
			
			
			

	}

}
