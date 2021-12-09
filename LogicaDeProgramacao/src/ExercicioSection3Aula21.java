import java.util.Locale;
import java.util.Scanner;

public class ExercicioSection3Aula21 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area, preco;

		area = largura * comprimento;
		preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%nPRECO = %.2f%n", area, preco);

		sc.close();

	}

}
