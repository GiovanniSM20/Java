
package controller;
import java.text.DecimalFormat;

import util.Teclado;
public class Ex_5Q9 {
	public static void main(String[] args){
		try{
		double salario;
		salario = Teclado.lerDouble("Digite o sal�rio desejado: ");
		DecimalFormat df = new DecimalFormat("R$ ###, ###, ###.00");
		System.out.println(df.format(salario));
	}catch(NumberFormatException x){
		System.out.println("Erro: refa�a conforme o pedido");
		main(args);
		}
	}

}

