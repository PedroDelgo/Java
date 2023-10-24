package Aula_002;

import java.util.Locale;
import java.util.Scanner;

public class ex_004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota;
		
		System.out.println("Digite sua nota: ");
		nota = sc.nextDouble();
		
		if (nota < 5) {
			System.out.println("Voce esta reprovado!");
		} else if (nota >= 5) {
			System.out.println("Voce foi aprovado!");
		}
		
		sc.close();
		
	}

}
