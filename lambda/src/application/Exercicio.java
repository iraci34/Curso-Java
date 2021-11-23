package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.ExerProduct;


public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<ExerProduct> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new ExerProduct(fields[0], Double.parseDouble(fields[1])));
	            line = br.readLine();		
			}
			
			// Função para calcular o preço medio dos produtos
			double avg = list.stream()
				.map(p -> p.getPrice())
				.reduce(0.0,  (x,y) -> x + y) / list.size();
		
			System.out.println("Average price: " + String.format("%.2f", avg));
			
			// Compara as Strings independente de letras maiúsculas ou minúsculas
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)   //preço menor que a média
					.map(p -> p.getName())             //cria uma listagem de nomes
					.sorted(comp.reversed())           //ordena em ordem decrescente
					.collect(Collectors.toList());     //adiciona em uma lista
			
			names.forEach(System.out::println);			//Printa na tela
			
						
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
