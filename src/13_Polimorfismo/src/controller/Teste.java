package controller;

import model.ContaCorrente;
import model.ContaEspecial;
	

public class Teste {
	public static void main(String[] args){
		ContaCorrente cc = new ContaCorrente("Michael Oliveira", "0001", "123456", 250.0);
		System.out.println("Saldo Michael");
		System.out.println(cc.calcularSaldo());
		
		ContaEspecial cce = new ContaEspecial("Fabrício Curvello", "0034", "987654", 0.50, 500);
		System.out.println("Saldo Fabrício");
		System.out.println(cce.calcularSaldo());
	}

}
