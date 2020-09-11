import java.util.Locale;
import java.util.Scanner;

public class mediaAritmetica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	    double x1, x2, x3, media;

	    x1 = sc.nextDouble();
	    x2 = sc.nextDouble();
	    x3 = sc.nextDouble();
	    
	    media = (x1 + x2 + x3) / 3;
	        
	    System.out.printf("Média: %.1f%n", media);
		
		sc.close();
	}
}