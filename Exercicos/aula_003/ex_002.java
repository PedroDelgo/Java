package aula_003;

import java.util.Locale;
import java.util.Scanner;

public class ex_002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		int num2;
		
		System.out.println("Digite um numero:");
		num = sc.nextInt();
		
		System.out.println("Digite outro numero:");
		num2 = sc.nextInt();
		
		System.out.println("a)"+ soma(num,num2));
		System.out.println("b)"+ produto(num,num2));
		System.out.println("c)"+ produtoA(num));
		System.out.println("d)"+ produtoB(num));
		
		sc.close();
	}
	
	public static int soma(int a,int b){
		return a + b;
	}
	
	public static int produto(int a,int b) {
		return a * (b*b);
	}
	
	public static int produtoA(int a){
		return a*a;
	}
	
	public static int produtoB(int b) {
		return b*b;
	}
}
