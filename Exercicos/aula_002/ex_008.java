package Aula_002;

import java.util.Locale;
import java.util.Scanner;

public class ex_008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double eixoX;
		double eixoY;
		
		System.out.println("Digite o valor do eixo X:");
		eixoX = sc.nextDouble();
		System.out.println("Digite o valor paa Y:");
		eixoY = sc.nextDouble();
		
		if (eixoX > 0 && eixoY > 0) {
			System.out.println("Q1");
		} else if (eixoX < 0 && eixoY > 0) {
			System.out.println("Q2");
		} else if (eixoX < 0 && eixoY < 0) {
			System.out.println("Q3");
		} else if (eixoX > 0 && eixoY < 0) {
			System.out.println("Q4");
		} else if (eixoX == 0 && eixoY == 0) {
			System.out.println("Esta na origem");
		}
		
		sc.close();
		
	}

}
