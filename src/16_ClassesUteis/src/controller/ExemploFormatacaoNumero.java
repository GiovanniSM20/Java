package controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExemploFormatacaoNumero {
	public static void main(String[] args){
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55008.537;
		System.out.println("Sem formatação: " +valor);
		System.out.println("Formatado: "+f.format(valor));
		
		NumberFormat p = NumberFormat.getPercentInstance();
		double porcento = 0.05;
		System.out.println("Sem formatação: "+porcento);
		System.out.println("Formatado: "+p.format(porcento));
		
		NumberFormat n = NumberFormat.getNumberInstance();
		double numero = 100.50;
		System.out.println("Sem formatação: " +numero);
		System.out.println("Formatado: " +n.format(numero));
		
		double valor2 = 12000.5;
		
		DecimalFormat df = new DecimalFormat("R$ ###, ###, ###.00");
		System.out.println("Sem formatação: " +valor2);
		System.out.println("Formatado: "+df.format(valor2));
	}

}
