package controller;

import util.Teclado;
import model.ItemDePedido;
import model.Notebook;
import model.Pedido;
import model.Usuario;

public class InfoNote {

	Usuario user; // não esquecer de dar o import neste objeto
	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;
	boolean logado = false; // Indica se o usuário está logado.
	public InfoNote(){
		notebooks[0] = new Notebook(1, "Negativo N22BR", "CPU Intel Core 2 Duo, Memória 2 GB, HD 250 GB", 6, 1200.00, "img\\n22br.jpg", "19/05/2011" );
		notebooks[1] = new Notebook(2, "Bell B55BR", "CPU Intel I3, Memória 4 GB, HD 500 GB", 3, 1800.00, "img\\b55br.jpg", "20/05/2011");
		notebooks[2] = new Notebook(3, "Pompaq P41BR", "CPU Intel I3, Memória 3 GB, HD 320 GB", 1, 1600.00, "img\\p41br.jpg", "21/05/2011");
		notebooks[3] = new Notebook(4, "CCF CR71CH", "CPU Intel Dua Core, Memória 2 GB, HD 160 GB", 5, 1100.00, "img\\cr71ch.jpg", "10/06/2011");
		notebooks[4] = new Notebook(5, "BradescoTech BD22BR", "CPU AMD Phenon II, Memória 4 GB, HD 500 GB", 2, 1900.00, "img\\bd22br.jp", "10/06/2011");
	}

	public static void main(String[] args) {


		InfoNote info = new InfoNote();//Criando objeto desta classe
		int opcao = 8;// 8 no mostrarMenu é sair do sistema

		do {//início de um laço do..while

			info.mostrarMenu();//Chamando o método mostrarMenu a partir do objeto info
			opcao = Teclado.lerInt("Digite sua opção: ");
			
			switch (opcao) {

			case 1:
				info.efetuarLogin();
				break;

			case 2:
				info.cadastrarUsuario();
				break;

			case 3:
				info.buscarNotebook();
				break;

			case 4:
				info.manterCarrinho();
				break;

			case 5:
				info.manterCarrinho();
				break;

			case 6:
				info.manterCarrinho();
				break;

			case 7:
				if (!info.logado) {
					System.out.println
					("Efetue login para efetuar compra.");
					break;
				} else {
					info.efetuarCompra();
					break;
				}

			case 8:
				System.out.println("Saída do Sistema.");
				break;

			default:
				System.out.println("Opção inválida!");
			}// fim do switch

		} while (opcao != 8);

		Teclado.lerTexto("Pressione uma tecla para continuar...");

	}// fim do método main

	public void mostrarMenu() {
		System.out.println("=================================================");
		System.out.println("      InfoNote - Se não é Info não vendemos.     ");
		System.out.println("=================================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - Ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Sair");
	}// fim do mostrarMenu()

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");

		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Login efetuado com sucesso.");
			logado = true;
		} else {
			System.out.println("Login ou Senha inválido.");
			efetuarLogin();
		}
	}// fim do efetuarLogin()

	public void cadastrarUsuario() {
		System.out.println("=================================================");
		System.out.println("          InfoNote - Cadastro de Usuários.       ");
		System.out.println("=================================================");
		int matricula = Teclado.lerInt("Matrícula: ");
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");

		user = new Usuario(matricula, login, senha, nome, email, telefone);
		System.out.println("=================================================");
		System.out.println("          Usuário Cadastrado Com Sucesso.        ");
		System.out.println("=================================================");

		System.out.println(user);
	}// fim do cadastrarUsuario()

	public void buscarNotebook() {
		for(int i = 0; i < notebooks.length; i++){
			if(notebooks[i] !=  null){
				System.out.println(notebooks[i].getNumeroNote()+"-----"+
			notebooks[i].getModelo());
			}
		}
	}// fim do buscarNotebook()

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Construção");
	}// fim do manterCarrinho()
	public void inserirNotebook(){
		String numeroNote = Teclado.lerTexto("Informe o número do notebook" + " para compra: ");
		if (pedido == null){
			pedido = new Pedido();
		}
		Notebook aux = null;
		for (int i = 0; i < notebooks.length; i++){
			if (notebooks[i] != null && 
					numeroNote.equals(notebooks[i].getNumeroNote())){
				aux = notebooks[i];
			}
		}
		if (aux == null){
			return;
		}
		ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux);
		pedido.inserirItem(item);
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Construção");
	}// fim do efetuarCompra()

}//fim da Classe
