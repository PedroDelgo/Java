package aula_003;

import java.util.Locale;
import java.util.Scanner;

public class ex_006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String frase;
		String frase1;
		String frase2;
		String frase3;
		String frase4;
		String frase5;
		
		
		System.out.println("Digite uma frase");
		frase = sc.nextLine();
		
		frase1 = frase.replace('a', 'x');
		frase2 = frase1.replace('e', 'x');
		frase3 = frase2.replace('i', 'x');
		frase4 = frase3.replace('o', 'x');
		frase5 = frase4.replace('u', 'x');
		
		System.out.println(frase5);
		
		
		sc.close();
	}

}
