import java.util.Locale;
import java.util.Scanner;

public class Parte6 {

	public static void main(String[] args) {
    
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int cod1, peca1, cod2, peca2;
	double valor1, valor2, total;
	
	cod1 = sc.nextInt();
	peca1 = sc.nextInt();
	valor1 = sc.nextDouble();
	cod2 = sc.nextInt();
	peca2 = sc.nextInt();
	valor2 = sc.nextDouble();
	
	total = peca1 * valor1 + peca2 * valor2;
	
	System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	
	
	
	
	
	sc.close();
	
	}

}
