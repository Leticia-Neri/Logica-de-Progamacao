import java.util.Locale;
import java.util.Scanner;

public class ExercicioSection3Aula26 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		int idade = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();	
		
		double media = (double)(idade + idade2) / 2;
		
		System.out.printf("A idade media de %s e %s é %.1f anos", nome, nome2, media);
		
		sc.close();
		
	}

}
