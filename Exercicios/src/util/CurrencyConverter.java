package util;

public class CurrencyConverter {

	public static double dolar;
	public static double qtd;
	
	public static double iof() {
		return dolar * qtd * 0.06;
	}
	
	public static double total() {
		return dolar * qtd + iof();
		
	}
	
}
