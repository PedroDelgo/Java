package main;
import java.util.Locale;
import java.util.Scanner;

import retangulo.Retangulo;

public class Programa_main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x = new Retangulo();
		
		System.out.println("Digite a altura do retangulo:");
		x.altura = sc.nextDouble();
		System.out.println("Digite a largura do retangulo:");
		x.largura = sc.nextDouble();
		
		double area = x.area();
		double perimetro = x.perimetro();
		double diagonal = x.diagonal()
				;		
		System.out.printf("AREA = %.2f\n",area);
		System.out.printf("PERIMETRO = %.2f\n",perimetro);
		System.out.printf("DIAGONAL = %.2f\n",diagonal);
	}

}

==============================================
package retangulo;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double area () {
		return altura*largura;
	}
	public double perimetro () {
		return 2*(altura) + 2*(largura);
	}
	public double diagonal() {
		return Math. sqrt((2*altura)+(2*largura));
	}
}
