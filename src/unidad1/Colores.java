package unidad1;

import java.util.Scanner;

public class Colores {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Teclea el valor para 'red': ");
		int red=teclado.nextInt();
		System.out.println("Teclea el valor para 'green': ");
		int green=teclado.nextInt();
		System.out.println("Teclea el valor para 'blue': ");
		int blue=teclado.nextInt();
		
				
		System.out.printf("[Y] [%.3f, %.3f, %.3f] [R]\n",0.299f*red,0.587f*green,0.144f*blue);
		System.out.printf("[I] [%.3f, %.3f, %.3f] [G]\n",0.596f*red,-0.275f*green,-0.321f*blue);
		System.out.printf("[Q] [%.3f, %.3f, %.3f] [B]\n",0.212f*red,-0.528f*green,0.311f*blue);
	}

}
