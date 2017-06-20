package model;

public class Pedido {
	public int numero;
	public String dataEmissao;
	public double valorTotal;
	public String situacao;
	public String formaDePagamento;
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

}
