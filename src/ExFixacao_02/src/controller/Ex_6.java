package controller;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex_6 {
	public static void main(String[] args){
		
		Locale.setDefault(Locale.FRANCE);
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 123456.789;
		System.out.println(f.format(valor));
		
		Locale.setDefault(Locale.US);
		NumberFormat u = NumberFormat.getCurrencyInstance();
		System.out.println(u.format(valor));
		
		Locale.setDefault(Locale.ENGLISH);
		NumberFormat e = NumberFormat.getCurrencyInstance();
		System.out.println(e.format(valor));
		
		Locale.setDefault(Locale.UK);
		NumberFormat uk = NumberFormat.getCurrencyInstance();
		System.out.println(uk.format(valor));
		
		Locale.setDefault(Locale.CANADA_FRENCH);
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println(cf.format(valor));
		
		Locale.setDefault(Locale.GERMAN);
		NumberFormat g = NumberFormat.getCurrencyInstance();
		System.out.println(g.format(valor));
		
		Locale.setDefault(Locale.CHINA);
		NumberFormat ch = NumberFormat.getCurrencyInstance();
		System.out.println(ch.format(valor));
		
		Locale.setDefault(Locale.ITALIAN);
		NumberFormat i = NumberFormat.getCurrencyInstance();
		System.out.println(i.format(valor));
	}
}
