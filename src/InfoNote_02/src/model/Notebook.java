package model;

public class Notebook {
	public int numeroNote;
	public String modelo;
	public String descricao;
	public int estoque;
	public double precoUnitario;
	public String figura;
	public String dataCadastro;
	public Notebook(int numeroNote, String modelo, String descricao, int estoque, double precoUnitario, String figura, String dataCadastro){
		super();
		this.numeroNote = numeroNote;
		this.modelo = modelo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
	}
	public void mostrar(){
		System.out.println("\n\nNotebook: \n");
		System.out.println("Número do Note: " + this.numeroNote);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Estoque: " + this.estoque);
		System.out.println("Preço Unitário: " + this.precoUnitario);
		System.out.println("Figura: " + this.figura);
		System.out.println("Data do cadastro do Note: " + this.dataCadastro);
	}

}
