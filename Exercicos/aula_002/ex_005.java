package Aula_002;

import java.util.Locale;
import java.util.Scanner;

public class ex_005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		int resultado;
		
		System.out.println("Digite quantos minutos voce consumiu?");
		minutos = sc.nextInt();
		
		if (minutos > 100) {
			resultado = (100 - minutos) * 2;
			System.out.println("Valor a pagar: "+(double)resultado+"R$");
		} else if (minutos <= 100){
			System.out.println("Valor a pagar: 50R$");
		}
		
		sc.close();
	
	}

}
