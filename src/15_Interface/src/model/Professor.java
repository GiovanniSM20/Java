package model;

public class Professor extends Usuario implements IUsuario{
	private int matriculaProfessor;
	private String nome;
	private String especialidade;
	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}


	public Professor() {
		super();
	}


	

	public Professor(String login, String senha, int tipo,
			int matriculaProfessor, String nome, String especialidade) {
		super(login, senha, tipo);
		this.matriculaProfessor = matriculaProfessor;
		this.nome = nome;
		this.especialidade = especialidade;
	}


	@Override
	public String toString() {
		return "Professor [matriculaProfessor=" + matriculaProfessor
				+ ", nome=" + nome + ", especialidade=" + especialidade + "]";
	}
	public boolean validarLogin (String login, String senha){
		if(getLogin().equals(login) && getSenha().equals(senha)){
			return true;
		}
		return false;
	}


	public void mostrar() {
		System.out.println("Informações do professor: ");
		System.out.println("Login: "+ super.getLogin());
		System.out.println("Senha: *****");
		
		System.out.println("Matrícula: "+matriculaProfessor);
		System.out.println("Nome: "+nome);
		System.out.println("Especialidade: "+especialidade);
	}

}
