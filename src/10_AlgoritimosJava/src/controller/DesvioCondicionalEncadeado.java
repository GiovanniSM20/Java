package controller;
import util.Teclado;
public class DesvioCondicionalEncadeado {
	public static void main(String[] args){
		double sal, salNovo;
		sal = Teclado.lerDouble("Digiye o Salário: ");
		if (sal < 500){
			salNovo = sal * 1.15;
		}else{
			if (sal <= 1000){
				salNovo = sal * 1.10;
			}else{
				salNovo = sal * 1.05;
			}
		}
		System.out.println("O salário com reajuste é: "+salNovo);
	}

}
