import java.util.Locale;
import java.util.Scanner;

public class Parte7 {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);	
		
	Scanner sc = new Scanner(System.in);
	
	double A, B, C;
	double π, triang, circ, trap, quad, ret;
	
	π = 3.14159;
	A = sc.nextDouble();
	B = sc.nextDouble();
	C = sc.nextDouble();
	
	triang = A * C / 2;
	circ = π * Math.pow(C, 2);
    trap = (A + B) * C / 2;
    quad = B * B;
    ret = A * B;
    
	System.out.printf("TRIANGULO: %.3f%n", triang);
	System.out.printf("CIRCULO: %.3f%n", circ);
	System.out.printf("TRAPEZIO: %.3f%n", trap);
	System.out.printf("QUADRADO: %.3f%n", quad);
	System.out.printf("RETANGULO: %.3f%n", ret);

	
	sc.close();	
    
	}

}
