package controller;
import util.Teclado;
public class Operadores {
	public static void main(String[] args) {
		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");
		
		double notas;
		notas = Teclado.lerDouble("Digite Sua nota: ");
		double notas2;
		notas2 = Teclado.lerDouble("Digite Sua nota: ");
		double notas3;
		notas3 = Teclado.lerDouble("Digite Sua nota: ");
		double notas4;
		notas4 = Teclado.lerDouble("Digite Sua nota: ");
		double media = (notas + notas2 + notas3 + notas4) / 4;
		System.out.println("Nome informado: " + nome);
		System.out.println("M�dia das notas : " + media);
		
	}

}
