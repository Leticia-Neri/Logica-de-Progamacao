import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double num = 10.3256562;
		
		System.out.println(num);
		//FORMATAÇÃO COM QUEBRA DE LINHA
		System.out.printf("%.2f%n", num);
		System.out.println(num);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", num);
		
		//CONCATENAÇÃO COM PRINTF %f
		System.out.printf("Resultado = %f metros%n", num);
		
		String nome = "Maria";
		int idade = 35;
		double salario = 40000.0;
		//String, inteiro, ponto flutuante
		System.out.printf("%s tem %d e ganha %.2f reais%n", nome, idade, salario );
		
	}

}
