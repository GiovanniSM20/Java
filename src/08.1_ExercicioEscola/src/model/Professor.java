package model;

public class Professor {
		private String nome;
		private String telefone;
		private int registroFuncional;
		private String dataDeNascimento;
		public void mostrar(){
			System.out.println("\n\nProfessor: \n");
			System.out.println("Nome: "+getNome());
			System.out.println("Telefone: "+getTelefone());
			System.out.println("Registro Funcional: "+getRegistroFuncional());
			System.out.println("Data de Nascimento: "+getDataDeNascimento());
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
		public int getRegistroFuncional() {
			return registroFuncional;
		}
		public void setRegistroFuncional(int registroFuncional) {
			this.registroFuncional = registroFuncional;
		}
		public String getDataDeNascimento() {
			return dataDeNascimento;
		}
		public void setDataDeNascimento(String dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
		}
		
}
