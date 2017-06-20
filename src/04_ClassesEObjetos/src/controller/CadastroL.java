package controller;
import model.Livro;
public class CadastroL {
	public static void main(String[] args){
		Livro hp = new Livro();
		hp.isbn= 519654646;
		hp.nome="Harry Potter";
		hp.autor="J.K.";
		hp.editora="Saraiva";
		System.out.println("ISBN: " + hp.isbn);
		System.out.println("Nome: " + hp.nome);
		System.out.println("Autor: " + hp.autor);
		System.out.println("Editora: " + hp.editora);
		Livro pj = new Livro();
		pj.isbn= 548756241;
		pj.nome="Percy Jackson";
		pj.autor="Rick Riordan";
		pj.editora="Intrínseca";
		System.out.println("ISBN: "+pj.isbn);
		System.out.println("Nome: "+pj.nome);
		System.out.println("Autor: "+pj.autor);
		System.out.println("Editora: "+pj.editora);
		Livro kane = new Livro();
		kane.isbn=48395496;
		kane.nome="As Crônicas de Kane";
		kane.autor="Rick Riordan";
		kane.editora="Intríseca";
		System.out.println("ISBN: "+kane.isbn);
		System.out.println("Nome: "+kane.nome);
		System.out.println("Autor: "+kane.autor);
		System.out.println("Editora: "+kane.editora);
		}

}
