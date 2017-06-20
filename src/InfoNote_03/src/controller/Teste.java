package Controller;

import Model.Usuario;
import Model.Endereco;
import Model.Pedido;
import Model.ItemDePedido;
import Model.Notebook;

public class Teste {
	
	public static void main(String[] args) {
		
		Usuario user = new Usuario (578542, "195", "alunolab", "Júlia" , "jutrabalho02@gmail.com", "99886-5420");
		user.mostrar();
		
		Endereco end = new Endereco ("Pará de Minas", "45", "bloco 1 apt 203", "Engenho da rainha",
				"Rio de Janeiro", "RJ", "20766-650");
		end.mostrar();
		
		Notebook not = new Notebook(100,"Asus X55LF","Notebook preto", 30,1500, "c:/desk/alu.jpg","25/10/2016");
		not.mostrar();
		
		Notebook not2 = new Notebook(98,"Hp ProBook", "Notebook preto", 40, 1394, "C:/desk/alu.jpg","26/10/2016");
		not2.mostrar();
		
		Notebook not3 = new Notebook(220,"Acer f5-245-45","Notebook prata",30,1645,"c:/desk/alu.jpg","4/11/2016");
		not3.mostrar();

		Pedido pedido = new Pedido(54,"02/11/2016", "dinheiro", 500, "vendido");
		pedido.mostrar();
		
		ItemDePedido idp = new ItemDePedido(3,520);
		idp.mostrar();
	
		ItemDePedido idp2 = new ItemDePedido(4,654);
		idp2.mostrar();
		
	
	}

}
