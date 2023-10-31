package aula_006;

import java.util.Locale;
import java.util.Scanner;

public class ex_001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int i = 0;
		
		System.out.println("Digite o tamanho do vetor, maximo 10: ");
		num = sc.nextInt();
		while (num > 10) {
			System.out.println("Valor invalido. O tamanho maximo que o vetor pode assumir é igual a 10!");
			System.out.println("Digite um valor valido:");
			num = sc.nextInt();
		}
		int [] vetor = new int [num];
		
		for (i = 0;i < num;i ++) {
			System.out.println("Digite os valores para serem armazenados no vetor:");
			vetor[i] = sc.nextInt();
		}
		
		for (i = 0; i < num; i ++) {
			if (vetor[i] < 0) {
				System.out.printf("Os valores negativos presentes no vetor são: %d\n",vetor[i]);
			}
		}
		sc.close();
	}

}
