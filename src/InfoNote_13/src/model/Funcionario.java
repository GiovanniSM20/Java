package model;

public class Funcionario extends Usuario implements IUsuario{
	
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Funcionario() {
		super();
	}

	public Funcionario(String login, String senha, int tipo, String matricula) {
		super(login, senha, tipo);
		this.matricula = matricula;
	}
	
	@Override
	public String toString(){
		final String ENTER = "\n";
		String retValue = "";
		
		retValue = "Informações sobre Funcionário: " + ENTER +
		super.toString()+
		"Matrícula: " + matricula;
		return retValue;
	}

	@Override
	public boolean validarLogin(String login, String nome) {
		
		return false;
	}
	
}
