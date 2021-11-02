import java.util.Locale;
import java.util.Scanner;

public class Parte5 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);

	Scanner sc = new Scanner(System.in);
	int numero, horas;
	double valor_hora, salario;
	
	numero = sc.nextInt();
	horas = sc.nextInt();
	valor_hora = sc.nextDouble();
	
	salario = horas * valor_hora;
	
	System.out.println("NUMBER = " + numero);
	System.out.printf("SALARY = U$ %.2f%n",  salario);
	
	
	
	
	sc.close();
	
	
	}

}
