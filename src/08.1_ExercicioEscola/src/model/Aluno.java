package model;

public class Aluno {
	private String nome;
	private String telefone;
	private int cpf;
	private String dataDeNascimento;
	private int matricula;
	public void mostrar(){
		System.out.println("\n\nAluno: \n");
		System.out.println("Nome: "+getNome());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("CPF: "+getCpf());
		System.out.println("Data de Nascimento: "+getDataDeNascimento());
		System.out.println("Matricula: " +getMatricula());
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
