package controller;

import model.Funcionario;
import model.Livro;
import model.Produto;

public class cadastroBiblioteca {
	
	public static void main(String[] args) {
		
		Funcionario mtr = new Funcionario();
		
		mtr.matricula = 01;
		mtr.nome = "Júlia"; 
		mtr.cpf = "298 391 158-50";
		System.out.println	("Matricula: " + mtr.matricula);
		System.out.println  ("Nome:" + mtr.nome);
		System.out.println  ("Cpf:" + mtr.cpf);
		
		Funcionario mtr2 = new Funcionario();
		
		mtr2.matricula = 02;
		mtr2.nome = "Fabricio"; 
		mtr2.cpf = "278 301 418-40";
		System.out.println	("Matricula: " + mtr2.matricula);
		System.out.println  ("Nome:" + mtr2.nome);
		System.out.println  ("Cpf:" + mtr2.cpf);
		 
		Funcionario mtr3 = new Funcionario(); 
		
		mtr3.matricula = 03;
		mtr3.nome = "Raquel"; 
		mtr3.cpf = "218 365 179-20";
		System.out.println	("Matricula: " + mtr3.matricula);
		System.out.println  ("Nome:" + mtr3.nome);
		System.out.println  ("Cpf:" + mtr3.cpf);
		
		Livro livro = new Livro(); 
		
		livro.isbn = 456;
		livro.nome = "A culpa é das estrelas"; 
		livro.autor = "John Green";
		livro.editora = "Saraiva";
		System.out.println	("Isbn:" + livro.isbn);
		System.out.println  ("Nome do Livro:" + livro.nome);
		System.out.println  ("Autor:" + livro.autor);
		System.out.println  ("Editora:" + livro.editora);
		
	Livro livro2 = new Livro(); 
		
		livro2.isbn = 345;
		livro2.nome = "50 Tons de Cinza"; 
		livro2.autor = "E.L. James";
		livro2.editora = "Abril";
		System.out.println	("Isbn:" + livro2.isbn);
		System.out.println  ("Nome do Livro:" + livro2.nome);
		System.out.println  ("Autor:" + livro2.autor);
		System.out.println  ("Editora:" + livro2.editora);
		
	Livro livro3 = new Livro(); 
		
		livro3.isbn = 275;
		livro3.nome = "O mar"; 
		livro3.autor = "Jonas Robson";
		livro3.editora = "Rocco";
		System.out.println	("Isbn:" + livro3.isbn);
		System.out.println  ("Nome do Livro:" + livro3.nome);
		System.out.println  ("Autor:" + livro3.autor);
		System.out.println  ("Editora:" + livro3.editora);
		
	Produto prod  = new Produto(); 
		
		prod.idProduto= 7879;
		prod.nomenclatura = "Coca Cola"; 
		prod.descricao = "Refrigerante 2L";
		prod.quantidade = 2;
		System.out.println	("Isbn:" + prod.idProduto);
		System.out.println  ("Nome do Livro:" + prod.nomenclatura);
		System.out.println  ("Autor:" + prod.descricao);
		System.out.println  ("Editora:" + prod.quantidade);
		
	Produto prod2  = new Produto(); 
			
			prod2.idProduto= 4543;
			prod2.nomenclatura = "Pen drive"; 
			prod2.descricao = "Pen drive de 8gb";
			prod2.quantidade = 5;
			System.out.println	("Isbn:" + prod2.idProduto);
			System.out.println  ("Nome do Livro:" + prod2.nomenclatura);
			System.out.println  ("Autor:" + prod2.descricao);
			System.out.println  ("Editora:" + prod2.quantidade);
		
	Produto prod3  = new Produto(); 
			
			prod3.idProduto= 5465;
			prod3.nomenclatura = "Mouse"; 
			prod3.descricao = "Mouse rosa";
			prod3.quantidade = 6;
			System.out.println	("Isbn:" + prod3.idProduto);
			System.out.println  ("Nome do Livro:" + prod3.nomenclatura);
			System.out.println  ("Autor:" + prod3.descricao);
			System.out.println  ("Editora:" + prod3.quantidade);

	}

}
