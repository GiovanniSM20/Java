package controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

import util.Teclado;
public class Ex_7_Q9 {

	public static void main(String[] args){
		try{
		String data;
		data = Teclado.lerTexto("Digite as sua data de nascimento no formato dd/mm/aaaa");
		
		String dia;
		dia = data.substring(0, 2);
		System.out.println("Dia do seu nascimento: "+dia);
		
		String mes;
		mes = data.substring(3,5);
		System.out.println("Mês do seu nascimento: "+mes);
		
		String ano;
		ano = data.substring(6,10);
		System.out.println("Ano do seu nascimento: "+ano);
		
		String am;
		am = ano+"/"+mes+"/"+dia;
		System.out.println("Seu nascimento em forma americana: "+am);
		
		String an12;
		an12 = dia+"/"+mes+"/2012";
		System.out.println("Seu aniversário em 2012: "+an12);
		
		int diaint = Integer.parseInt(dia);
		int mesint = (Integer.parseInt(mes)) - 1;
		int anoint = Integer.parseInt(ano);
		Calendar datanasc = new GregorianCalendar(anoint,mesint,diaint);
		
		System.out.println("Dia da semana de seu nascimento: "+datanasc.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Dia do ano de seu nascimento: "+datanasc.get(Calendar.DAY_OF_YEAR));
		
		Calendar data2012 = new GregorianCalendar(2012,mesint,diaint);
		
		System.out.println("Dia da semana do seu aniversário em 2012: "+data2012.get(Calendar.DAY_OF_WEEK));
		System.out.println("Número da semana no ano, do seu aniversário em 2012: "+data2012.get(Calendar.WEEK_OF_YEAR));
		
		Calendar hoje = new GregorianCalendar();
		
		int calculo = data2012.get(Calendar.YEAR);
		int calculo2 = hoje.get(Calendar.YEAR);
		int anos = calculo2 - calculo - 1;
		
		int diferenca = (365 - (data2012.get(Calendar.DAY_OF_YEAR)) + (anos * 365)) + hoje.get(Calendar.DAY_OF_YEAR);
		System.out.println("A diferença entre a data do seu aniversário em 2012 e a data de hoje é de " + diferenca + " dias.");
		}catch(NumberFormatException rte){
			System.out.println("Não digite letras");
			main(args);
		}catch(StringIndexOutOfBoundsException si){
			System.out.println("\n\nErro. A data inserida não está no padrão solicitado");
			Teclado.lerTexto("Pressione <ENTER> para continuar");
			main(args);
		}
		
	}

}
