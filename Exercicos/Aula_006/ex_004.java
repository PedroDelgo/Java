package aula_006;

import java.util.Locale;
import java.util.Scanner;

public class ex_004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tamanho = 0;
		int i = 0;
		double maior = 0;
		
		System.out.println("Digite o tamanho do vetor: ");
		tamanho = sc.nextInt();
		
		double [] vetor = new double [tamanho];
		
		for (i = 0; i < tamanho; i ++) {
			System.out.println("Digite os valores para inserir dentro do vetor");
			vetor[i] = sc.nextDouble();
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}

		System.out.printf("O maior numero do vetor é o: %.2f\n",maior);
	}

}
