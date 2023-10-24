package Aula_002;

import java.util.Locale;
import java.util.Scanner;

public class ex_003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Seu numero é par");
		}
		else {
			System.out.println("Seu numero é impar");
		}
		
		sc.close();
	}

}
