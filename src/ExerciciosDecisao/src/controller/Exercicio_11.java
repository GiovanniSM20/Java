package controller;
import util.Teclado;
public class Exercicio_11 {
	public static void main(String[] args){
		int An, Aa, I;
		An = Teclado.lerInt("Digite o seu ano de nascimento:");
		Aa = Teclado.lerInt("Digite o ano atual:");
		if(An > Aa){
			System.out.println("Dados inseridos estão incorretos");
		}else{
			I = Aa - An;
			System.out.println("A sua idade é "+I);
		}
	}

}
