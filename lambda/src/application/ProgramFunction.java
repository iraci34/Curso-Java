package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class ProgramFunction {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/*Cria uma nova lista de Strings com o "map"
		 aplicando nomes em caixa alta em todos os itens da lista*/
        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
        names.forEach(System.out::println);
		
	}

}
