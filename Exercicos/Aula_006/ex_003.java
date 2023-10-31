package aula_006;

import java.util.Locale;
import java.util.Scanner;

public class ex_003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tamanho = 0;
		int i = 0;
		double contador = 0;
		double soma = 0;
		
		System.out.println("Digite o tamanho do vetor:");
		tamanho = sc.nextDouble();
		
		double [] vetor = new double [(int)tamanho];
		
		for (i = 0;i < tamanho;i ++) {
			System.out.println("Digite os numeros para serem inseridos dentro do vetor: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
			contador++;
		}
		
		for (i = 0;i < tamanho;i ++) {
			System.out.println(vetor[i]);
		}
		System.out.printf("A media do termos inseridos no vetor é igual a: %.2f\n",soma/contador);
		sc.close();
	}

}
