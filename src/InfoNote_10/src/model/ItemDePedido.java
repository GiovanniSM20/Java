package model;

import java.text.NumberFormat;
import java.util.Locale;

public class ItemDePedido {
	
	private int qtde;
	private double subtotal;
	private Notebook notebook;
	
	public ItemDePedido() {
		super();
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
	}
	

	public ItemDePedido(int qtde, double subtotal, Notebook notebook) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
		this.notebook = notebook;
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
	
	
	public Notebook getNotebook() {
		return notebook;
	}

	@Override
	public String toString(){
		final String ENTER = "\n";
		String retValue = "";
		
		Locale local = new Locale("pt", "BR");
		
		retValue = "Informações sobre Item de Pedido: " + ENTER +
		"Quantidade: " + qtde  + ENTER +
		"Subtotal: " + 
			NumberFormat.getCurrencyInstance(local).format(this.subtotal);
		
		return retValue;
	}
}
