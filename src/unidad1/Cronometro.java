package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		long t0;
		long t1;
		float crono;
		
		System.out.println("Teclea tu nombre: ");
		t0=System.currentTimeMillis();
		nombre=in.readLine();
		t1=System.currentTimeMillis();
		crono=(t1-t0)/1000f;
		
		System.out.printf("Hola, me llamo %s y he tardado %.3fseg",nombre,crono);
		
		
		
		
		
		
		
		
		
	}

}
