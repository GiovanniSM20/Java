package Controller;

import Model.Usuario;
import Model.Endereco;
import Model.Pedido;
import Model.ItemDePedido;
import Model.Notebook;

public class Teste {
	
	public static void main(String[] args) {
		
		Usuario user = new Usuario ();
		
		user.matricula = 578542;
		user.login = "195";
		user.senha = "alunolab";
		user.nome = "Júlia";
		user.email = "jutrabalho02@gmail.com";
		user.telefone = "99886-5420";
		System.out.println  ("Matricula:" + user.matricula);
		System.out.println  ("Login:" + user.login);
		System.out.println  ("Senha:" + user.senha);
		System.out.println  ("Nome:" + user.nome);
		System.out.println  ("Email:" + user.email);
		System.out.println  ("Telefone:" + user.telefone);
		
		Endereco end = new Endereco ();
		
		end.logradouro = "Para de Minas";
		end.numero = "45";
		end.complemento = "bloco 1 apt 203";
		end.bairro = "Engenho da Rainha";
		end.cidade = "Rio de Janeiro";
		end.estado= "RJ";
		end.cep = "20766-650";
		System.out.println  ("Logradouro:" + end.logradouro);
		System.out.println  ("Número:" + end.numero);
		System.out.println  ("Complemento:" + end.complemento);
		System.out.println  ("Bairro:" + end.bairro);
		System.out.println  ("Cidade:" + end.cidade);
		System.out.println  ("Estado:" + end.estado);	
		System.out.println  ("Estado:" + end.cep);
		
		Notebook not = new Notebook();
		
		not.numeroNote = 100;
		not.modelo = "Asus X55LF";
		not.descricao = "Notebook preto";
		not.estoque = 30 ;
		not.precoUnitario = 1500;
		not.figura= "C:/desk/alu.jpg";
		not.dataCadastro = "25/10/2016";
		System.out.println  ("Número:" + not.numeroNote);
		System.out.println  ("Modelo:" + not.modelo);
		System.out.println  ("Descrição:" + not.descricao);
		System.out.println  ("Estoque:" + not.estoque);
		System.out.println  ("Preço Unitario:" + not.precoUnitario);
		System.out.println  ("Figura:" + not.figura);	
		System.out.println  ("Data do cadastro:" + not.dataCadastro);
		
		Notebook not2 = new Notebook();
		
		not2.numeroNote = 98;
		not2.modelo = "HP ProBook";
		not2.descricao = "Notebook preto";
		not2.estoque = 40 ;
		not2.precoUnitario = 1394;
		not2.figura= "C:/desk/alu.jpg";
		not2.dataCadastro = "25/10/2016";
		System.out.println  ("Número:" + not2.numeroNote);
		System.out.println  ("Modelo:" + not2.modelo);
		System.out.println  ("Descrição:" + not2.descricao);
		System.out.println  ("Estoque:" + not2.estoque);
		System.out.println  ("Preço Unitario:" + not2.precoUnitario);
		System.out.println  ("Figura:" + not2.figura);	
		System.out.println  ("Data do cadastro:" + not2.dataCadastro);
		
		Notebook not3 = new Notebook();
		
		not3.numeroNote = 220;
		not3.modelo = "Acer f5-245-45";
		not3.descricao = "Notebook prata ";
		not3.estoque = 30 ;
		not3.precoUnitario = 1645;
		not3.figura= "C:/desk/alu.jpg";
		not3.dataCadastro = "25/10/2016";
		System.out.println  ("Número:" + not3.numeroNote);
		System.out.println  ("Modelo:" + not3.modelo);
		System.out.println  ("Descrição:" + not3.descricao);
		System.out.println  ("Estoque:" + not3.estoque);
		System.out.println  ("Preço Unitario:" + not3.precoUnitario);
		System.out.println  ("Figura:" + not3.figura);	
		System.out.println  ("Data do cadastro:" + not3.dataCadastro);
		
		Pedido pedido = new Pedido();
		
		pedido.numero = 54 ;
		pedido.dataEmissao = "02/11/2016";
		pedido.formaDePagamento = "dinheiro" ;
		pedido.valorTotal = 500;
		pedido.situacao = "";
		System.out.println  ("Número:" + pedido.numero);
		System.out.println  ("Data de emissão:" + pedido.dataEmissao);
		System.out.println  ("Forma de pagamento:" + pedido.formaDePagamento);
		System.out.println  ("Valor total:" + pedido.valorTotal);
		System.out.println  ("Situação:" + pedido.situacao);

		
		ItemDePedido idp = new ItemDePedido();
		
		idp.qtde = 3;
		idp.subtotal = 520;
		System.out.println("Quantidade de pedido:"+ idp.qtde);
		System.out.println("Subtotal:"+ idp.subtotal);
	
		ItemDePedido idp2 = new ItemDePedido();
		
		idp2.qtde = 4;
		idp2.subtotal = 654;
		System.out.println("Quantidade de pedido:"+ idp2.qtde);
		System.out.println("Subtotal:"+ idp2.subtotal);
	
	}

}
