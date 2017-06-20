package controller;
import util.Teclado;
public class Ex13 {
	public static void main(String[] args){
		String nome[] = new String [20];
		double salario[] = new double [20];
		double div[] = new double [20];
		for (int i=0;i<20;i++){
			nome[i]=Teclado.lerTexto("Digite um nome");
			salario[i]=Teclado.lerDouble("Digite um salário");
			div[i] = (salario[i]/100)*8;
			salario[i] = salario[i]+div[i];
		} 
		for (int i=0;i<20;i++){
			System.out.println("Nome: "+nome[i]+" Salário: "+salario[i]);
		}		
	}

}
