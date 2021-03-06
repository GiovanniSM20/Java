package Controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Util.Teclado;

public class Q_07 {
	public static void main(String[] args) {

		try {
		String nascimento;

		nascimento = Teclado
				.lerTexto("Informe a data do seu nascimento no padr�o dd/mm/aaaa: ");

		String dia, mes, ano;

		System.out.println("Nascimento: ");

		dia = nascimento.substring(0, 2);
		System.out.println("Dia: " + dia);

		mes = nascimento.substring(3, 5);
		System.out.println("M�s: " + mes);

		ano = nascimento.substring(6);
		System.out.println("Ano: " + ano);

		String americano;
		americano = ano + "-" + mes + "-" + dia;
		System.out.println("Nascimento no padr�o americano: " + americano);

		String niver2012 = dia + "-" + mes + "-" + "2012";
		System.out.println("Anivers�rio em 2012: " + niver2012);

		// Convertando de String para int , pois a Classe GregorianCalendar
		// n�o trabalha com String
		int diaint = Integer.parseInt(dia);
		int mesint = (Integer.parseInt(mes)) - 1; // Por conta dos meses estarem
													// num vetor a partir da
													// posi��o 0
		int anoint = (Integer.parseInt(ano));
		Calendar datanasc = new GregorianCalendar(anoint, mesint, diaint);

		System.out.println("Dia da semana de seu nascimento: "
				+ datanasc.get(Calendar.DAY_OF_WEEK));

		System.out.println("Dia do ano do seu nascimento: "
				+ datanasc.get(Calendar.DAY_OF_YEAR));

		Calendar data2012 = new GregorianCalendar(2012, mesint, diaint);

		System.out.println("Dia da semana do seu anivers�rio em 2012: "
				+ data2012.get(Calendar.DAY_OF_WEEK));

		System.out
				.println("N�mero da semana do ano , do seu anivers�rio em 2012 "
						+ data2012.get(Calendar.WEEK_OF_YEAR));

		Calendar hoje = new GregorianCalendar();

		int calculo = data2012.get(Calendar.YEAR);
		int calculo2 = hoje.get(Calendar.YEAR);
		int anos = calculo2 - calculo - 1;

		int diferenca = (365 - (data2012.get(Calendar.DAY_OF_YEAR)) + (anos * 365))
				+ hoje.get(Calendar.DAY_OF_YEAR);

		System.out.println("A diferen�a entra a data do seu anivers�rio em 2012 e a data de hoje � de "
						+ diferenca + "dias.");

	} catch (NumberFormatException nfe) {
		System.out.println("\n\nERRO. A data inserida n�o est� no formato dd/mm/aaaa");
		Teclado.lerTexto("Pressione <ENTER> para continuar");
		main(args);
	} catch (StringIndexOutOfBoundsException sioobe) {
		System.out.println("\n\nERRO. A data inserida n�o est� no padr�o solicitado");
		Teclado.lerTexto("Pressione <ENTER> para continuar");
		main(args);
	}
		
} }
