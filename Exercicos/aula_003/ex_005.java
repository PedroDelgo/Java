package aula_003;

import java.util.Locale;
import java.util.Scanner;



public class ex_005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String frase;
		char char1;
		char char2;
		
		
		System.out.println("Dgite uma frase: ");
		frase = sc.nextLine();//pega a linha inteira
		
		System.out.println("Digite a letra que deseja subistituir");
		char1 = sc.next().charAt(0);
		
		System.out.println("Digite a nova letra");
		char2 = sc.next().charAt(0);
		
		String novaFrase = frase.replace(char1, char2);
		
		System.out.println(novaFrase);
		
		sc.close();
		
	}

}
