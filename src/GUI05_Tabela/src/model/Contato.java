package model;

public class Contato {

	private int id;
	private String nome;
	private String email;
	private String mensagem;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Contato() {
		super();
	}

	public Contato(int id, String nome, String email, String mensagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}

	// Construtor sem id, para a criação de objetos usando o auto_increment do
	// MySQL
	public Contato(String nome, String email, String mensagem) {
		super();
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";

		retValue = "Mensagem Enviada Com Sucesso:" + ENTER + "Nome: " + nome
				+ ENTER + "E-mail: " + email + ENTER + "Mensagem: " + mensagem;

		return retValue;
	}

}



