
package controller;
import java.text.DecimalFormat;

import util.Teclado;
public class Ex_5 {
	public static void main(String[] args){
		double salario;
		salario = Teclado.lerDouble("Digite o sal�rio desejado: ");
		DecimalFormat df = new DecimalFormat("R$ ###, ###, ###.00");
		System.out.println(df.format(salario));
		
	}

}
