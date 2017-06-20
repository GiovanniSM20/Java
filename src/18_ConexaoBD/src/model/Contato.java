package model;

public class Contato {
	private int id;	
	private String nome;
	private String mensagem;
	private String email;
		
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
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		public Contato(int id, String nome, String mensagem, String email) {
			super();
			this.id = id;
			this.nome = nome;
			this.mensagem = mensagem;
			this.email = email;
		}
		public Contato(String nome, String mensagem, String email) {
			super();
			this.nome = nome;
			this.mensagem = mensagem;
			this.email = email;
		}
		public String toString() {
			return "Contato [id=" + id + ", nome=" + nome + ", mensagem="
					+ mensagem + ", email=" + email + "]";
		}
	
	
}

