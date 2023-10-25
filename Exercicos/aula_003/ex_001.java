package aula_003;

import java.util.Locale;
import java.util.Scanner;

public class ex_001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite seu salário:");
		salario = sc.nextDouble();
		
		System.out.println("Seu salario de "+salario+" equivale a "+sMinimo(salario)+" salarios mnimos.");
		
		sc.close();
	}

	public static int sMinimo(double a) { 
		return (int)(a/788.00);
	}
}
