package application;

import java.util.Scanner;

import entities.Rent;

public class Program6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];     //iniciou com todos os quartos vazios
		
        System.out.print("How many rooms will be rented? "); // lendo a quantidade de estudantes que vao alugar os quartos
        int n = sc.nextInt();
        
        for (int i=1; i<=n; i++) { 
        	System.out.println();     

        System.out.println("Rent #" + i + ":"); 
        System.out.print("Name: "); 
        sc.nextLine();
        String name = sc.nextLine();
        
        System.out.print("Email: ");
        String email = sc.nextLine();
        
        System.out.print("Room: ");
        int room = sc.nextInt(); 
        vect[room] = new Rent(name, email);
	}

        System.out.println(); System.out.println("Busy rooms:"); 

        for (int i=0; i<10; i++) {
        	if (vect[i] != null) {
   		System.out.println(i + ": " + vect[i]);
       	}
       }
		
		
	sc.close();	
	}

}
