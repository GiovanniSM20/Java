package model;

public class Pedido {
	private int numero;
	private String dataEmissao;
	private double valorTotal;
	private String situacao;
	private String formaDePagamento;
	public Pedido(int numero, String dataEmissao, double valorTotal, String situacao, String formaDePagamento){
		super();
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
		this.formaDePagamento = formaDePagamento;
	}
	public void mostrar(){
		System.out.println("\n\nPedido: \n");
		System.out.println("Número do Pedido: " +this.numero);
		System.out.println("Data da Emissão do Pedido: " +this.dataEmissao);
		System.out.println("Forma de pagamento: " +this.formaDePagamento);
		System.out.println("Valor Total do Pedido: " +this.valorTotal);
		System.out.println("Situação do pedido: " +this.situacao);
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

}
