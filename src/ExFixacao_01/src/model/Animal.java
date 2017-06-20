package model;

public abstract class Animal {
	private String nomeclatura;
	private int numeroDePatas;
	private String cobertoPor;
	private String reproducao;
	private String alimentacao;
	public String getNomeclatura() {
		return nomeclatura;
	}
	public void setNomeclatura(String nomeclatura) {
		this.nomeclatura = nomeclatura;
	}
	public int getNumeroDePatas() {
		return numeroDePatas;
	}
	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}
	public String getCobertoPor() {
		return cobertoPor;
	}
	public void setCobertoPor(String cobertoPor) {
		this.cobertoPor = cobertoPor;
	}
	public String getReproducao() {
		return reproducao;
	}
	public void setReproducao(String reproducao) {
		this.reproducao = reproducao;
	}
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	public Animal() {
		super();
	}
	public Animal(String nomeclatura, int numeroDePatas, String cobertoPor,
			String reproducao, String alimentacao) {
		super();
		this.nomeclatura = nomeclatura;
		this.numeroDePatas = numeroDePatas;
		this.cobertoPor = cobertoPor;
		this.reproducao = reproducao;
		this.alimentacao = alimentacao;
	}

	
public void tipoDeRespiracao(){
	System.out.println("Respiração do Tipo: ");
		
	}
public abstract void exibir();

}
