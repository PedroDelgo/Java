package aula_005;

import java.util.Locale;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int linha;
		int coluna;
		int i = 0;
		int j = 0;
		
		System.out.println("Digite um valor pra linha: ");
		linha = sc.nextInt();
		System.out.println("Digite um valor pra coluna: ");
		coluna = sc.nextInt();
		
		int [][] matriz = new int [linha][coluna];
		
		for (i = 0; i < linha; i++) {
			for (j = 0;j < coluna; j++) {
				System.out.printf("Esse termo é pertence a linha "+i+" e a coluna "+j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				System.out.printf("%d\t",matriz[i][j]);
			}
			System.out.println();
		}
		
		for (i = 0; i < linha; i++) {
			System.out.println("O termo "+i+i+" da diagonal principal é igual a"+matriz[i][i]);
			
		}
		sc.close();
	}

}
