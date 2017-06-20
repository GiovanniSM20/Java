package controller;
import model.Usuario;
public class cadastro {
	public static void main(String[] args){
		Usuario user = new Usuario();
		user.nome="João da Silva Sauro";
		user.endereco="Rua Sem Fim, 72";
		System.out.println("Nome: " + user.nome);
		System.out.println("Endereço: " + user.endereco);
		
		Usuario user2 = new Usuario();
		user2.nome ="Fabrício Curvello";
		user2.endereco="Rua São Francisco Xavier, 417";
		System.out.println("Nome: " + user2.nome);
		System.out.println("Endereço: " + user2.endereco);
		
		Usuario user3 = new Usuario();
		user3.nome="Matheus Carvalho";
		user3.endereco="Rua Vai Toma sorvete";
		System.out.println("Nome: " + user3.nome);
		System.out.println("Endereço: " + user3.endereco);
		
		Usuario user4 = new Usuario();
		user4.nome="Giovanni";
		user4.endereco="Rua Nao sei";
		System.out.println("Nome: " + user4.nome);
		System.out.println("Endereço: " + user4.endereco);
	}

}
