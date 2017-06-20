package controller;

import util.Teclado;

public class Ex10 {
	public static void main(String[] args){
		String nomes [] = new String [5];
		String telefones [] = new String [5];
		String enderecos [] = new String [5];
		int op;
		for (int i = 0; i < 5; i++){
		nomes[i] = Teclado.lerTexto("Digite um nome");
		telefones[i] = Teclado.lerTexto("Digite um telefone");
		enderecos[i] = Teclado.lerTexto("Digite um endereço");
		}
		op = Teclado.lerInt("Digite a posição dos dados no vetor");
		if((op >= 0) && (op < 5)){
			System.out.println("Nome: "+nomes[op] + "\n" + "Telefone: "+telefones[op]+"\n" + " Endereço:" + enderecos[op]);
		}else{
			System.out.println("Posição inválida");
		}
	}

}

