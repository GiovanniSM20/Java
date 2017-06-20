package controller;
import util.Teclado;
public class Ex_2Q9 {
	public static void main(String[] args){
		try{
		double sen, cos, tan;
		double a;
		a = Teclado.lerDouble("Digite um ângulo");
		sen = Math.sin(Math.toRadians(a));
		cos = Math.cos(Math.toRadians(a));
		tan = Math.tan(Math.toRadians(a));
		System.out.println("Seno: "+sen);
		System.out.println("Cosseno: "+cos);
		System.out.println("Tangente: "+tan);
		}catch(NumberFormatException x){
			System.out.println("Erro: refaça");
			main(args);
	}
	}
}
