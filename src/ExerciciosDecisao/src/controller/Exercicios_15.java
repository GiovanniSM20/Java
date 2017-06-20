package controller;
import util.Teclado;
public class Exercicios_15 {
	public static void main(String[] args){
		String n;
		double p1, p2, m;
		n = Teclado.lerTexto("Infome o seu nome:");
		p1 = Teclado.lerDouble("Informe a nota da sua primeria prova:");
		p2 = Teclado.lerDouble("Informe a nota da sua segunda prova:");
		m = (p1 + p2)/2;
		if (m < 3){
			System.out.println(n +" está REPROVADO");
		}else{
			if(m >= 7){
				System.out.println(n +" está Aprovado");
			}else{
				System.out.println(n +" está em prova final");
			}
		}
	}

}
