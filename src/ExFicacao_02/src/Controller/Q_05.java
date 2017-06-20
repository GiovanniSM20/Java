package Controller;
import java.text.NumberFormat;
import java.util.Locale;

import Util.Teclado;

public class Q_05 {

	public static void main(String[] args) {
		try{
		double sala;
		sala = Teclado.lerDouble ("Informe  o salário desejado: ");
		
		Locale local = new Locale ("pt","BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(local);
		System.out.println("Sem formatação: " + sala);
		System.out.println("Formatado: " + nf.format(sala));
		} catch (NumberFormatException nfe) {
		System.out.println("Erro! Digite um número");
	} }

}
