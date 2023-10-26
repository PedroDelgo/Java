package aula_005;

import java.util.Locale;
import java.util.Scanner;

public class ex_002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escolha = 0;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		
		while (escolha != 4) {
			System.out.printf("Qual é o seu tipo de combustivel:\n1 - Álcool.\n2 - Gasolina.\n3 - Disel.\n4 - Fim.\n");
			escolha = sc.nextInt();
			if (escolha < 1 ||escolha > 4) {
				System.out.println("Opção invalida, escolha um numero de 1 a 4\n");
			} else if (escolha == 1) {
				contador1++;
			} else if (escolha == 2) {
				contador2++;
			} else if (escolha == 3) {
				contador3++;
			}
		}
		
		System.out.println("Muito Obrigado!\nÁlcool: "+contador1+"\nGasolina: "+contador2+"\nDisel: "+contador3);
		sc.close();
	}

}
