import java.util.Scanner;

public class paresPositivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int contParesPositivos = 0;
		
		for(int i = 1; i <= 25; i++) {
			int num = sc.nextInt();
			if(num % 2 == 0 && num > 0)
				contParesPositivos++;
		}
		System.out.println("Quantidade de numeros pares positivos: "+ contParesPositivos);
		
		sc.close();
	}
}