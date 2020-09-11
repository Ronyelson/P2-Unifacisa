import java.util.Scanner;

public class produtoDesconto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String produto = sc.next();
		double valor = sc.nextDouble();
		
		if (valor > 0 && valor < 100) {
			valor *= 0.95;		
		}
		else if (valor >= 100 && valor < 500) {
			valor *= 0.90;
		}
		else {
			valor *= 0.85;
		}
	    
		System.out.println(produto);
	    System.out.println("R$ " + valor);
		
		sc.close();
	}
}