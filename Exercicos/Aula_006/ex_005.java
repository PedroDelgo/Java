package aula_006;

import java.util.Locale;
import java.util.Scanner;

public class ex_005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tamanho = 0;
		int i = 0;
		int maior = 0;
		int indexDoMaior = 0;
	
		System.out.println("Digite a quantidade de pessoas:");
		tamanho = sc.nextInt();
		
		String [] nomes = new String [tamanho];
		int [] idades = new int [tamanho];
		
		for (i = 0; i < tamanho; i ++) {
			System.out.println("Digite os nomes que deseja colocar: ");
			nomes[i] = sc.next();
		}
		
		for (i = 0;i < tamanho; i ++) {
			System.out.println("Digite as respectivas idades:");
			idades[i] =sc.nextInt();
			if (idades[i] > maior) {
				maior = idades[i];
				indexDoMaior = i;
			}
		}
		System.out.println(nomes[indexDoMaior]);
		sc.close();
	}

}
