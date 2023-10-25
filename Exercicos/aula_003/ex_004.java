package aula_003;

import java.util.Locale;
import java.util.Scanner;

public class ex_004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		char escolha;
		
		System.out.println("Digite suas notas:");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		
		System.out.printf("Escolha uma opção: a ou A para média aritmética\np ou P para media ponderada");
		escolha = sc.next().charAt(0);
		
		System.out.println(media(nota1,nota2,nota3,escolha));
		
		sc.close();
		
	}
	
	public static double media(double nota1,double nota2,double nota3,char d) {
		if (d == 'a' && d == 'A') {
			double mediaA = (nota1+nota2+nota3)/3;
			return mediaA;
		} else if (d == 'p' && d == 'P') {
			double mediaP = (nota1*5 + nota2*3 + nota3*2)/(5+3+2);
			return mediaP;
		}
		return 0;
	}
}
