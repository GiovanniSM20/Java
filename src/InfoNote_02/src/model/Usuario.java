package model;

public class Usuario {
	public int matricula;
	public String login;
	public String senha;
	public String nome;
	public String email;
	public String telefone;
	public Usuario(int matricula, String login, String senha, String nome, String email, String telefone){
		super();
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	public void mostrar(){
		System.out.println("\n\nUsuário: \n");
		System.out.println("Matrícula: "+this.matricula);
		System.out.println("Login: "+this.login);
		System.out.println("Senha: "+this.senha);
		System.out.println("Nome: "+this.nome);
		System.out.println("E-mail: "+this.email);
		System.out.println("Telfone: "+this.telefone);
	}
}
