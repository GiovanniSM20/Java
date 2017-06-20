package model;

public class Endereco {
	public String logradouro;
	public String numero;
	public String complemento;
	public String bairro;
	public String cidade;
	public String estado;
	public String 	cep;
	public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado, String cep){
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	public void mostrar(){
		System.out.println("\n\nEndereço: \n");
		System.out.println("Logradouro: "+this.logradouro);
		System.out.println("Número: "+this.numero);
		System.out.println("Complemento: "+this.complemento);
		System.out.println("Bairro: "+this.bairro);
		System.out.println("Cidade: " +this.cidade);
		System.out.println("Estado: " +this.estado);
		System.out.println("Cep: " +this.cep);
	}

}
