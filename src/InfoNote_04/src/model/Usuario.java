package model;

public class Usuario {

	private int matricula;
	private String login;
	private String senha;
	private String nome;
	private String email;
	private String telefone;

	// Construtor padrão de Classe.
	// Objeto vazio para o momento que o usuário ainda não cadastrou dados.
	public Usuario() {
		super();
		// super faz referência à super classe.
		// Toda classe java é sub classe da classe Object.
	}

	// Construtor com atributos da Classe. Será utilizado para o usuário
	// efetuar o cadastro.
	public Usuario(int matricula, String login, String senha, String nome,
			String email, String telefone) {
		super();
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void mostrar() {
		// Mostrar usuário
		System.out.println("\n\nUsuário:\n");
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Login: " + this.login);
		System.out.println("Senha: " + this.senha);
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}

}
