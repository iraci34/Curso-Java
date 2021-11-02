package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Program7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee2> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.println();
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();            
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
            Employee2 emp = new Employee2(id, name, salary);
			
			list.add(emp);		
			
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Employee2 emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idsalary);
		
		if (emp == null) {
			System.out.println("This id does not exist! ");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("list of employees: ");
        for (Employee2  obj : list) {
        	System.out.println(obj);
        }
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee2> list, int id) {
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

	public static Integer position(List<Employee2> list, int id) {
		for (int i = 0; i< list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
