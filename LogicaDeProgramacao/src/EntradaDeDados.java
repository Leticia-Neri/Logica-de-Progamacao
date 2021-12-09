import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// PARA STRING NEXT
		String x;
		x = sc.next();

		System.out.println("Você digitou: " + x);// lê apenas uma palavra 

		// PARA INT NEXTINT
		int y;
		y = sc.nextInt();

		System.out.println("Voce digitou: " + y);

		// PARA CHAR next().chartAt(0)

		char z;
		z = sc.next().charAt(1);

		System.out.println("Voce digitou: " + z);

		// LER O TEXTO ATÉ A QUEBRA DE LINHA
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//QUEBRA DE LINHA PENDENTE
		String s4, s5, s6;
		int a;
		
		a = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

		sc.close();
	}

}
