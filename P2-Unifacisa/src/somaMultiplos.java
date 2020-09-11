public class somaMultiplos {

	public static void main(String[] args) {
		
		int soma = 0;
	    for (int i = 1; i <= 50; i++){
	      if ((i % 3) == 0)
	      soma = soma + i;
	    }
	    System.out.println(soma);
	}
}
