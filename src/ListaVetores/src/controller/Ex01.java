package controller;

import util.Teclado;

public class Ex01 {
	public static void main (String[] args){
		
		String nome[] = new String[5];
		String profissao[] = new String[5];
				for (int i = 0; i < 5; i++) {
					nome[i] = Teclado.lerTexto("Digite seu nome");
					profissao[i] = Teclado.lerTexto("Digite sua profissão");
				}
				for (int i=0;i<5;i++){
					System.out.println(nome[i]+ " é "+profissao[i]);
				}
	}
}
