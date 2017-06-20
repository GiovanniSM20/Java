package controller;
import model.Carro;
public class Cadastro {
	public static void main(String[] args){
		Carro user = new Carro();
		user.fabricante="Ford";
		user.modelo="Fiesta";
		user.cor="Preto";
		user.ano="2001";
		System.out.println("Fabricante: " + user.fabricante);
		System.out.println("Modelo: " + user.modelo);
		System.out.println("Cor: " + user.cor);
		System.out.println("Ano: " + user.ano);
		Carro user2 = new Carro ();
		user2.fabricante="Volkswagen";
		user2.modelo="Gol";
		user2.cor="Prata";
		user2.ano="2005";
		System.out.println("Fabricante: "+ user2.fabricante);
		System.out.println("Modelo: "+ user2.modelo);
		System.out.println("Cor: "+ user2.cor);
		System.out.println("Ano: "+ user2.ano);
		Carro user3 = new Carro();
		user3.fabricante="Fiat";
		user3.modelo="Uno";
		user3.cor="Prata";
		user3.ano="2001";
		System.out.println("Fabricante: "+ user3.fabricante);
		System.out.println("Modelo: "+ user3.modelo);
		System.out.println("Cor: "+ user3.cor);
		System.out.println("Ano: "+ user3.ano);
	}
}
