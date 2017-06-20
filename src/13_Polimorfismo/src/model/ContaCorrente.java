package model;

public class ContaCorrente {
	
	private String titular;
	private String agencia;
	private String numeroConta;
	private Double saldo;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public ContaCorrente() {
		super();
	}
	public ContaCorrente(String titular, String agencia, String numeroConta,
			Double saldo) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	public double calcularSaldo(){
		return this.saldo;
	}
	

}
