package Aula_002;

import java.util.Locale;
import java.util.Scanner;

public class ex_002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if (x != 10) {
			x = 10;
			System.out.println("Seu numero é igual a: "+ x);
		} else {
			System.out.println("Seu numero ja é igual a: "+x);
		}
		
		sc.close();
	}

}
