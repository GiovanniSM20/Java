package Controller;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex06 {

	public static void main(String[] args) {
		
		System.out.println("123456,789");
		
		Locale.setDefault (Locale.FRANCE);
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		Locale.setDefault (Locale.ITALY);
		NumberFormat f2 = NumberFormat.getCurrencyInstance();
		Locale.setDefault (Locale.UK);
		NumberFormat f3 = NumberFormat.getCurrencyInstance();
		Locale.setDefault (Locale.US);
		NumberFormat f4 = NumberFormat.getCurrencyInstance();
		Locale.setDefault (Locale.KOREA);
		NumberFormat f5 = NumberFormat.getCurrencyInstance();
		Locale.setDefault (Locale.GERMANY);
		NumberFormat f6 = NumberFormat.getCurrencyInstance();
		Locale.setDefault (Locale.JAPAN);
		NumberFormat f7 = NumberFormat.getCurrencyInstance();
		Locale.setDefault (Locale.CHINA);
		NumberFormat f8 = NumberFormat.getCurrencyInstance();
		Locale.setDefault (Locale.CANADA);
		NumberFormat f9 = NumberFormat.getCurrencyInstance();

		double valor = 123456.789;
		
		System.out.println("Fran�a: " + f1.format(valor));
		System.out.println("It�lia: " + f2.format(valor));
		System.out.println("UK: " + f3.format(valor));
		System.out.println("US: " + f4.format(valor));
		System.out.println("Cor�ia: " + f5.format(valor));
		System.out.println("Alemanha: " + f6.format(valor));
		System.out.println("Jap�o: " + f7.format(valor));
		System.out.println("China: " + f8.format(valor));
		System.out.println("Canad�: " + f9.format(valor));
	}

}
