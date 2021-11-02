import java.util.Scanner;

public class while3 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    
	int cod = sc.nextInt();
    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0;
	
	while (cod != 4 ) {
		if (cod == 1) {
			cont1 = cont1 + 1;
		}
		else if (cod == 2) {
			cont2 = cont2 + 1;
		}
		else if (cod == 3) {
			cont3 = cont3 + 1;
		}

		cod = sc.nextInt();
	}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + cont1);
		System.out.println("Gasolina: " + cont2);
		System.out.println("Diesel: " + cont3);

	
	
	sc.close();
	}

}
