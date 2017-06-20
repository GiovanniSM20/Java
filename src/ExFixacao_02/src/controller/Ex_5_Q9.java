package controller;
import java.text.DecimalFormat;

import util.Teclado;
public class Ex_5_Q9 {
	public static void main(String[] args){
		try{
		double pS;
		pS = Teclado.lerDouble("Digite o salário desejado: ");
		DecimalFormat df = new DecimalFormat("R$ ###, ###, ###.00");
		System.out.println(df.format(pS));
		}catch(NumberFormatException nfe){
			System.out.println("Digite apenas números");
			main(args);
		}
		
	}

}
