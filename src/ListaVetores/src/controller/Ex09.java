package controller;

import util.Teclado;

public class Ex09 {
	public static void main(String[] args){
		String nomes[] = new String[10];
		String op;
		String nome;
		int cont = 0;
		for (int i = 0; i<10; i++){
			nomes[i] = Teclado.lerTexto("Digite um nome");
		}
		op = Teclado.lerTexto("Deseja fazer uma pesquisa no vetor de nomes?");
		if (op.equals("sim")){
			nome = Teclado.lerTexto("Digite o nome a ser pesquisado");
			for (int i = 0; i < 10; i++){
				if (nomes[i].equals(nome)){
					cont++;
				}
			}
			System.out.println("O nome "+nome+" foi encontrado "+cont+" vezes no vetor");
		}else{
			System.out.println("Você decidiu não fazer a pesquisa");
		}
	}

}
