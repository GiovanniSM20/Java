package controller;
import model.Produto;
public class CadastroP {
	public static void main(String[] args){
		Produto prod = new Produto();
		prod.idProduto=025;
		prod.nomenclatura="Controle de Xbox";
		prod.descricao="Controle para se jogar no Xbox";
		prod.quantidade=100;
		System.out.println("Id do Produto: " + prod.idProduto);
		System.out.println("Nomenclatura do Produto: " + prod.nomenclatura);
		System.out.println("Descrição do produto: " + prod.descricao);
		System.out.println("Quantidade do Produto: " + prod.quantidade);
		Produto prod2 = new Produto();
		prod2.idProduto=156;
		prod2.nomenclatura="Playstion 4";
		prod2.descricao="Console para jogar jogos de video game";
		prod2.quantidade=600;
		System.out.println("Id do Produto: "+prod2.idProduto);
		System.out.println("Nomenclatura do produto: "+prod2.nomenclatura);
		System.out.println("Descrição do produto: " +prod2.descricao);
		System.out.println("Quantidade do produto: " + prod2.quantidade);
		Produto prod3 = new Produto();
		prod3.idProduto=534;
		prod3.nomenclatura="God of war";
		prod3.descricao="Jogo da SONY que retrata a historia da mitologia grega de uma forma nunca antes vista";
		prod3.quantidade=800;
		System.out.println("Id do produto: " +prod3.idProduto);
		System.out.println("Nomenclatura do produto: " + prod3.nomenclatura);
		System.out.println("Descrição do produto: " + prod3.descricao);
		System.out.println("Quantidade do produto: " + prod3.quantidade);
	}

}
