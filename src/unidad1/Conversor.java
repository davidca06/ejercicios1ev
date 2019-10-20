package unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Conversor {

	public static void main(String[] args) throws Exception{
				
		System.out.println("Introduce una cantidad en euros: ");
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		float euros=Float.parseFloat(br.readLine());
		float dolares;
				
		System.out.printf("%.2f euros son: %.2f",euros,euros*1.12);
		
		
		
		
		
		
		
		
		
	}

}
