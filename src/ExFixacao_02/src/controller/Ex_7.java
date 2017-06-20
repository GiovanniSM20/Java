package controller;
import java.util.Calendar;
import java.util.GregorianCalendar;
import util.Teclado;
public class Ex_7 {
	public static void main(String[]args) {

		String nascimento;
		nascimento = Teclado.lerTexto("Informe a data de seu nascimento no padrão dd/m/aaaa");
		
		String dia, mes, ano;
		
		dia= nascimento.substring(0,2);
		System.out.println("Dia " + dia);
		
		mes= nascimento.substring(3,5);
		System.out.println("Mês " + mes);
		
		ano= nascimento.substring(6);
		System.out.println("Ano" + ano);
		
		String americano;
		americano = ano + "-" + mes + "-" + dia;
		System.out.println("nascimento no padrão americano" + americano);
		
		String niver2012 = dia + "-" + mes + "-" + "2012";
		System.out.println( "Aniversário de 2012: " + niver2012);
		
		//Convertendo de String para Int, pois a Classe GregorianCalendar não trabalha com String
		
		int diaint = Integer.parseInt(dia);
		int mesint = (Integer.parseInt(mes)) -1; //Por conta dos meses estaremos num vetor a partir da posição 0
		int anoint = Integer.parseInt(ano);
		Calendar datanasc = new GregorianCalendar(anoint,mesint,diaint);
		
		Calendar data2012 = new GregorianCalendar(2012,mesint,diaint);
		
		System.out.println("Dia da semana de seu nascimento: " +
		datanasc.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Dia do ano de seu nascimento: " + 
		datanasc.get(Calendar.DAY_OF_YEAR));
		
		Calendar hoje = new GregorianCalendar();
		
		int calculo = data2012.get(Calendar.YEAR);
		int calculo2 = hoje.get(Calendar.YEAR);
		int anos = calculo2 - calculo - 1;
		
		int diferenca = 365 - (data2012.get(Calendar.DAY_OF_YEAR) + (anos * 365)) + hoje.get(Calendar.DAY_OF_YEAR);
		System.out.println("A diferença entre a data do seu aniversário em 2012 e a data de hoje é de" + diferenca + " dias.");
		
	}
	
}