package contoller;
import model.Usuario;
import model.Endereco;
import model.Pedido;
import model.ItemDePedido;
import model.Notebook;
public class Teste {
	public static void main(String[] args){
		
		Usuario user = new Usuario();
		user.matricula=189742;
		user.login="Kirito20051456";
		user.senha="minhasenha";
		user.nome="João";
		user.email="Joãocarmelia@yahoo.com.br";
		user.telefone="961682171";
		System.out.println("Matricula: " + user.matricula);
		System.out.println("Login: " + user.login);
		System.out.println("Senha: " + user.senha);
		System.out.println("Nome: " + user.nome);
		System.out.println("Email: " + user.email);
		System.out.println("Telefone: " + user.telefone);
		
		Endereco end = new Endereco();
		end.logradouro="Rua Visconde de Abaeté";
		end.numero="109";
		end.complemento="Bl1, Ap206";
		end.bairro="Vila Isabel";
		end.cidade="Rio de Janeiro";
		end.estado="Rip de Janeiro";
		end.cep="20551080";
		System.out.println("Logradouro: " + end.logradouro);
		System.out.println("Número: " + end.numero);
		System.out.println("Complemento: " + end.complemento);
		System.out.println("Bairro: " + end.bairro);
		System.out.println("Cidade: " + end.cidade);
		System.out.println("Estado: " + end.estado);
		System.out.println("CEP: " + end.cep);
		
		Notebook note = new Notebook();
		note.numeroNote=521;
		note.modelo="Dell Inspiron";
		note.descricao="Notebook 2 em 1";
		note.estoque=100;
		note.precoUnitario= 3098.89;
		note.figura="Bibliotecas\\Imagens";
		note.dataCadastro="17/12/2016";
		System.out.println("Número do Note: " + note.numeroNote);
		System.out.println("Modelo: " + note.modelo);
		System.out.println("Descrição: " + note.descricao);
		System.out.println("Estoque: " + note.estoque);
		System.out.println("Preço Unitário: " + note.precoUnitario);
		System.out.println("Figura: " + note.figura);
		System.out.println("Data do cadastro do Note: " + note.dataCadastro);
		
		Notebook note2 = new Notebook();
		note2.numeroNote=361;
		note2.modelo="Mac";
		note2.descricao="Notebook top";
		note2.estoque=020;
		note2.precoUnitario= 4000.50;
		note2.figura="Bibliotecas\\Imagens";
		note2.dataCadastro="01/11/2016";
		System.out.println("Número do Note: " +note2.numeroNote);
		System.out.println("Modelo: " +note.modelo);
		System.out.println("Descrição: " +note2.descricao);
		System.out.println("Estoque: " +note2.estoque);
		System.out.println("Preço Unitário: " +note2.precoUnitario);
		System.out.println("Figura: " +note2.figura);
		System.out.println("Data do Cadastro do Note: " +note2.dataCadastro);
		
		Notebook note3 = new Notebook();
		note3.numeroNote=025;
		note3.modelo="Asus";
		note3.descricao="Note Pika";
		note3.estoque=000;
		note3.precoUnitario= 1059.99;
		note3.figura="Biblioteca\\Imagem";
		note3.dataCadastro="20/06/2011";
		System.out.println("Número do Note: " +note3.numeroNote);
		System.out.println("Modelo: " +note3.modelo);
		System.out.println("Descrição: " +note3.descricao);
		System.out.println("Estoque: " +note3.estoque);
		System.out.println("Preço Unitário" +note3.precoUnitario);
		System.out.println("Figura: " +note3.figura);
		System.out.println("Data do Cadastro do Note: " +note.dataCadastro);
		
		Pedido ped = new Pedido();
		ped.numero=2000;
		ped.dataEmissao="01/11/2016";
		ped.formaDePagamento="Boleto Bancário";
		ped.valorTotal= 4021.00;
		ped.situacao="enviado";
		System.out.println("Número do Pedido: " +ped.numero);
		System.out.println("Data da Emissão do Pedido: " +ped.dataEmissao);
		System.out.println("Forma de pagamento: " +ped.formaDePagamento);
		System.out.println("Valor Total do Pedido: " +ped.valorTotal);
		System.out.println("Situação do pedido: " +ped.situacao);
		
		ItemDePedido item = new ItemDePedido();
		item.qtde=01;
		item.subtotal=4000.50;
		System.out.println("Quantidade: " +item.qtde);
		System.out.println("Sub-Total:" +item.subtotal);
		
		ItemDePedido item2 = new ItemDePedido();
		item2.qtde=01;
		item2.subtotal=1059.99;
		System.out.println("Quantidade: " +item2.qtde);
		System.out.println("Sub-Total: " +item2.subtotal);
		
		
		
	}
			
}
