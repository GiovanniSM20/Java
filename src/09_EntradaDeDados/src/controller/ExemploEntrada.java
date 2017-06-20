package controller;
import util.Teclado;
public class ExemploEntrada {
	public static void main(String[] args) {
		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");
		
		int idade;
		idade = Teclado.lerInt("Digite seu idade:") ;
		
		double salario;
		salario = Teclado.lerDouble("Digite seu salário: ");
		
		System.out.println("Nome informado: " + nome);
		System.out.println("Idade informada: " + idade);
		System.out.println("Salário informado : " + salario);
		
	}

}
