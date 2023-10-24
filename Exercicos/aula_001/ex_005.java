package aula_001;
//imports
import java.util.Locale; //lingua 
import java.util.Scanner; //Scanner

public class ex_005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // setando a lingua
		Scanner sc = new Scanner(System.in); //stando o scanner
		//Variaveis 
		int a;
		int b;
		int c;
		int d;
		//Scanner
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		//operações 
		int produtoAB = a * b;
		int produtoCD = c * d;
		int resultado = produtoAB - produtoCD;
		//print do resultado
		System.out.println("Difernça = "+ resultado);
		
		sc.close();//Fechando o scanner

	}
	
}
