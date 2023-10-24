package aula_001;
//imports
import java.util.Locale;
import java.util.Scanner;

public class ex_004 {

	public static void main(String[] args) {
		//setando os imports
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		//scan dos valores de a b c
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		//a) a área do triângulo retângulo que tem A por base e C por altura. 
		
		double areaDoTriangulo = c * a;
		System.out.println("Trinagulo: "+areaDoTriangulo);
		
		//b) a área do círculo de raio C. (pi = 3.14159) 
		
		double areaDoCirculo = 3.14159 * Math.pow(c, 2);
		System.out.println("Círculo: "+ areaDoCirculo);
		
		//c) a área do trapézio que tem A e B por bases e C por altura. 
		
		double areaDoTrapezio = (a+b) / c;
		System.out.println("Trapézio: "+ areaDoTrapezio);
		
		//d) a área do quadrado que tem lado B.
		double areaDoQuadrado = Math.pow(b, 2);
		System.out.println("Quadrado: "+areaDoQuadrado);
		
		//e) a área do retângulo que tem lados A e B
		double areaDoRetangulo = a * b;
		System.out.println("Retangulo: "+areaDoRetangulo);
		
		sc.close();//fechando o scanner
	}

}
