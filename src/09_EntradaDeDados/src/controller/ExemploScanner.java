package controller;

import java.util.Scanner;

public class ExemploScanner {
	public static void main(String[] args){
		String nome;
		System.out.println("Digite seu nome: ");
		Scanner sc = new Scanner (System.in);
		nome = sc.next();
		
		System.out.println("Nome Digitado: " +nome);
		double salario;
		
		System.out.println("Digite o Salário que desega: ");
		Scanner sc2 = new Scanner(System.in);
		salario = sc2.nextDouble();
		
		System.out.println("Salário Pretendido: "+salario);
		
	}

}
