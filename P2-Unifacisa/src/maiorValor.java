import java.util.Locale;
import java.util.Scanner;

public class maiorValor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		if (n1 > n2) {
			System.out.println("Maior valor digitado foi = "+ n1);
		}
		if (n2 > n1) {
			System.out.println("Maior valor digitado foi = "+ n2);
		}
		if (n1 == n2) {
			System.out.println("Valores repetidos");
		}
		sc.close();
	}
}