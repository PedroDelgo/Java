package aula_005;

import java.util.*;
import java.util.Scanner;

public class ex_001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int tamanho = 0;
		int soma = 0;
		int contador = 0;
		
		
		System.out.println("Digite o tamanho do vetor: ");
		tamanho = sc.nextInt();
		double [] alturas = new double [tamanho];
		
		for (i = 0; i < tamanho; i++) {
			System.out.println("Digite uma altura");
			alturas[i] = sc.nextDouble();
			soma += alturas[i];
			contador++;
		}
		
		System.out.println("A media das alturas é igual a: "+(soma/contador));
		
		sc.close();
	}

}
