package contoller;
import model.Usuario;
import model.Endereco;
import model.Pedido;
import model.ItemDePedido;
import model.Notebook;
public class Teste {
	public static void main(String[] args){
		
		Usuario user = new Usuario(1, "joseph", "climber", "Joseph Climber", "josephclimber@gmail.com", "2222-3344");
		user.mostrar();
		
		Endereco end = new Endereco("Rua Visconde de Abaeté", "109", "Bl1, Ap206", "Vila Isabel", "Rio de Janeiro", "Rio de Janeiro", "20551080");
		end.mostrar();
		
		Notebook note = new Notebook(521, "Dell Inspiron", "Notebook 2 em 1", 100, 3098.89, "Bibliotecas\\Imagens", "17/12/2016");
		
		note.mostrar();
		
		Notebook note2 = new Notebook(361, "Mac", "Notebook top", 020, 4000.50, "Bibliotecas\\Imagens", "01/11/2016");
		note2.mostrar();
		
		Notebook note3 = new Notebook(025, "Asus", "Note Pika", 000, 1059.99, "Bibliotecas\\Imagens", "20/06/2011");
		
		note3.mostrar();
		
		Pedido ped = new Pedido(2000, "01/11/2016", 4021.00, "Boleto Bancário", "Enviado");
		
		ped.mostrar();
		
		ItemDePedido item = new ItemDePedido(01, 4000.50);
		
		item.mostrar();
		
		ItemDePedido item2 = new ItemDePedido(01, 1059.99);
		
		item2.mostrar();
		
		
		
	}
			
}
