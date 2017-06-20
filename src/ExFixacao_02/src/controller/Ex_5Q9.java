
package controller;
import java.text.DecimalFormat;

import util.Teclado;
public class Ex_5Q9 {
	public static void main(String[] args){
		try{
		double salario;
		salario = Teclado.lerDouble("Digite o salário desejado: ");
		DecimalFormat df = new DecimalFormat("R$ ###, ###, ###.00");
		System.out.println(df.format(salario));
	}catch(NumberFormatException x){
		System.out.println("Erro: refaça conforme o pedido");
		main(args);
		}
	}

}

