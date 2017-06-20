package ExerciciosSequencia;

import util.Teclado;

public class Exerc11 {

	public static void main(String[] args){
		
		int anoNasc, anoAtual, idade;
		anoNasc = Teclado.lerInt("Informe o seu ano de nascimento");
		anoAtual = Teclado.lerInt("Informe seu ano atual:");
		
		if (anoNasc < anoAtual ) {
			idade = anoAtual - anoNasc;
			System.out.println("Você tem " + idade + " anos");
			
		} else{
			
			System.out.println("Dados inseridos estão incorretos");
		}
		
	}
}
