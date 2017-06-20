package controller;

import java.util.Scanner;
import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
		
		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");
	
		double n1;
		n1 = Teclado.lerDouble("Informe a nota 1:");
		
		double n2;
		n2 = Teclado.lerDouble("Informe a nota 2:");
		
		double n3;
		n3 = Teclado.lerDouble("Informe a nota 3:");
		
		double n4;
		n4 = Teclado.lerDouble("Informe a nota 4:");
		
		double media;
		media = (n1+n2+n3+n4) / 4;
		
		System.out.println("Nome: " + nome);
		System.out.println("Nota 1: " + n1);
		System.out.println("Nota 2: " + n2);
		System.out.println("Nota 3: " + n3);
		System.out.println("Nota 4: " + n4);
		System.out.println("Media: " + media);
		
	}

}
