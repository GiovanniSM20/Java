package controller;

import util.Teclado;

public class Ex08 {
	
	public static void main(String[] args){
		String nome[] = new String [15];
		double PR1 [] = new double [15];
		double PR2 [] = new double [15];
		double media [] = new double [15];
		String situacao[] = new String [15];
		
		for (int i = 0; i < 15; i++){
			nome [i] = Teclado.lerTexto("Digite o nome");
			PR1 [i] = Teclado.lerDouble("Digite a nota");
			PR2 [i] = Teclado.lerDouble("Digite a nota");
			media [i] = (PR1[i] + PR2[i])/2;
			if (media[i]>=6){
				situacao[i]="Aprovado";
			} else {
				situacao[i]="Reprovado";
			}
		}
		for (int i = 0; i < 15 ; i++){
			System.out.println("Aluno: "+nome[i]+ " Notas "+PR1[i]+""+PR2[i]+ " Média "+media[i]+" Situação "+situacao[i]);
		}
		
	}

}
