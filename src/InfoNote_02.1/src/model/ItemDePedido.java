package model;

public class ItemDePedido {
	public int qtde;
	public 	double subtotal;
	public ItemDePedido(int qtde, double subtotal){
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
	}
	public void mostrar(){
		System.out.println("\n\nItem De Pedido: \n");
		System.out.println("Quantidade: " +this.qtde);
		System.out.println("Sub-Total:" +this.subtotal);
	}

}
