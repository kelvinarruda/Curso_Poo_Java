package util;

public class CurrencyConverter {
	
	public static final double PERCIOF = 6.00;
	
	public static double valorPagamento(double cotacaoDolar, double qtdDollar) {
		
		return (cotacaoDolar*qtdDollar) * (1 + (PERCIOF / 100));
		
	}
	
	
	

}
