package Aula_002;

import java.util.Locale;
import java.util.Scanner;

public class ex_007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int numero2;
		int operador;
		
		System.out.println("Digite um numero");
		numero = sc.nextInt();
		System.out.println("Digite outro numero");
		numero2 = sc.nextInt();
		System.out.printf("Digite uma opção:\n1 - Soma \n2 - Subtração \n3 - multiplicação \n4 - Divisão");
		operador = sc.nextInt();
		
		if (operador == 1) {
			System.out.println("Resultado ="+ (numero + numero2));
		} else if (operador == 2) {
			System.out.println("Resultado ="+ (numero - numero2));
		} else if (operador == 3) {
			System.out.println("Resultado ="+ (numero * numero2));
		} else if (operador == 4) {
			if (numero2 == 0) {
				System.out.println("Não é possivel divisão por 0");
			} else {
				System.out.println("Resultado ="+ (numero / numero2));
			}
		}
		
		sc.close();
	}

}
