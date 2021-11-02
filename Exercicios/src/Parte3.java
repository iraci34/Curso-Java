import java.util.Locale;
import java.util.Scanner;

public class Parte3 {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	 
	double raio, area, π;
	
	π = 3.14159;
    raio = sc.nextDouble();
    area = π * Math.pow(raio, 2);
    	 
   System.out.printf("Valor da área do circulo %.4f%n", area);
    
    sc.close();
		
		
	}

}
