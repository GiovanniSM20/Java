package controller;

import util.Teclado;

public class Ex07 {

	public static void main(String[] args) {
		String dias[] = { "domingo", "segunda", "ter�a", "quarta", "quinta", "sexta", "sabado"};
		int num;
		num = Teclado.lerInt("Digite o n�mero do dia da semana");
		num--;
		if ((num < 0) || (num >= 7)){
			System.out.println("N�o corresponde a um dia da semana");
		}else{
			System.out.println(dias[num]);
		}

	}

}
