package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		float notaMat;
		float notaTM1;
		float notaTM2;
		float notaTM3;
		float notaMediaMat;
		
		System.out.println("Nota exámen Matemáticas: ");
		notaMat=Float.parseFloat(in.readLine());
		System.out.println("Nota primera tarea Matemáticas: ");
		notaTM1=Float.parseFloat(in.readLine());
		System.out.println("Nota segunda tarea Matemáticas: ");
		notaTM2=Float.parseFloat(in.readLine());
		System.out.println("Nota tercera tarea Matemáticas: ");
		notaTM3=Float.parseFloat(in.readLine());
		
		notaMediaMat=(notaMat*0.9f)+(((notaTM1+notaTM2+notaTM3)/3)*0.1f);
		System.out.printf("La nota media de Matemáticas es: %.2f",notaMediaMat);
		
		System.out.println(" ");
		System.out.println("===========");
		System.out.println(" ");
		
		float notaFis;
		float notaTF1;
		float notaTF2;
		float notaMediaFis;
		
		System.out.println("Nota exámen Física: ");
		notaFis=Float.parseFloat(in.readLine());
		System.out.println("Nota primera tarea Física: ");
		notaTF1=Float.parseFloat(in.readLine());
		System.out.println("Nota segunda tarea Físca: ");
		notaTF2=Float.parseFloat(in.readLine());
				
		notaMediaFis=(notaFis*0.8f)+(((notaTF1+notaTF2)/2)*0.2f);
		System.out.printf("La nota media de Física es: %.2f",notaMediaFis);
		
		System.out.println(" ");
		System.out.println("===========");
		System.out.println(" ");
		
		float notaQui;
		float notaTQ1;
		float notaTQ2;
		float notaTQ3;
		float notaMediaQui;
		
		System.out.println("Nota exámen Química: ");
		notaQui=Float.parseFloat(in.readLine());
		System.out.println("Nota primera tarea Química: ");
		notaTQ1=Float.parseFloat(in.readLine());
		System.out.println("Nota segunda tarea Química: ");
		notaTQ2=Float.parseFloat(in.readLine());
		System.out.println("Nota tercera tarea Química: ");
		notaTQ3=Float.parseFloat(in.readLine());
		
		notaMediaQui=(notaQui*0.85f)+(((notaTQ1+notaTQ2+notaTQ3)/3)*0.15f);
		System.out.printf("La nota media de Química es: %.2f",notaMediaQui);
		
		System.out.println(" ");
		System.out.println("===========");
		System.out.println(" ");
		

		float notaMediaCur;
		notaMediaCur=(notaMat+notaFis+notaQui)/3;
		System.out.printf("La nota media del curso es: %.2f",notaMediaCur);
	}

}
