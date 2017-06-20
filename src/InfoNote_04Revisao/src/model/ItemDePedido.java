package model;

public class ItemDePedido {
	
	private int qtde;
	private double subtotal;
	
	public ItemDePedido() {
		super();
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	public void mostrar() {

		System.out.println("\nDados do Item de Pedido:\n");
		System.out.println("Quantidade: " + this.qtde);
		System.out.println("SubTotal: " + this.subtotal);
		
	}

}
