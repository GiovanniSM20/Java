package model;

public class ContaEspecial extends ContaCorrente{
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(String titular, String agencia, String numeroConta,
			Double saldo, double limite) {
		super(titular, agencia, numeroConta, saldo);
		this.limite = limite;
	}
	
	@Override
	public double calcularSaldo(){
		double saldoFinal;
		saldoFinal = super.calcularSaldo() + limite;
		return saldoFinal;
	}

}
