package Aula_002;

import java.util.Locale;
import java.util.Scanner;

public class ex_001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if (x > 2) {
			System.out.println("Seu numero é maior do que 2");
		}
		else if (x < 2) {
			System.out.println("Seu numero é menor que 2");
		} else if (x == 2) {
			System.out.println("Seu numero é igual a 2");
		}
		
		sc.close();
	}

}
