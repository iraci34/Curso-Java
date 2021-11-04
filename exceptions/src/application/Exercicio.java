package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		try {
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.print("initial balance: ");
			double initialBalance = sc.nextDouble();
		    System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdrawValue = sc.nextDouble();
			account.withdraw(withdrawValue);
			System.out.println(account);
    	}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
			
		}
		
			
		

		
		sc.close();
	}

}
