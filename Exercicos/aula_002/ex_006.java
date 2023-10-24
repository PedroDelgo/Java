package Aula_002;

import java.util.Locale;
import java.util.Scanner;

public class ex_006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double hora;
		
		hora = sc.nextDouble();
		
		if (hora >= 0 && hora < 6) {
			System.out.println("Agora são"+hora+"Boa madrugada!");
		} else if (hora >= 6 && hora < 12) {
			System.out.println("Agora são"+hora+"Bom dia!");
		} else if (hora >= 12 && hora < 18) {
			System.out.println("Agora são"+hora+"Boa tarde!");
		} else if (hora >= 18 && hora < 24) {
			System.out.println("AGora são"+hora+"Boa noite!");
		}
		
		sc.close();
		
		
	}

}
